package tempconverter;

import strategy.tempconverter.CelsiusToFahrenheitConverter;
import strategy.tempconverter.CelsiusToKelvinConverter;
import strategy.tempconverter.FahrenheitToCelsiusConverter;
import strategy.tempconverter.FahrenheitToKelvinConverter;
import strategy.tempconverter.IdentityConverter;
import strategy.tempconverter.KelvinToCelsiusConverter;
import strategy.tempconverter.KelvinToFahrenheitConverter;
import strategy.tempconverter.TempConverter;
import strategy.tempconverter.TempScale;

/**
 *
 * @author Dan
 */
public class TempConversionService {

    private TempConverter converter;
    private TempScale original;
    private TempScale target;
    
    private static final TempConverter C2F_CONVERTER = new CelsiusToFahrenheitConverter();
    private static final TempConverter F2C_CONVERTER = new FahrenheitToCelsiusConverter();
    private static final TempConverter C2K_CONVERTER = new CelsiusToKelvinConverter();
    private static final TempConverter K2C_CONVERTER = new KelvinToCelsiusConverter();
    private static final TempConverter F2K_CONVERTER = new FahrenheitToKelvinConverter();
    private static final TempConverter K2F_CONVERTER = new KelvinToFahrenheitConverter();
    private static final TempConverter IDENTITY_CONVERTER = new IdentityConverter();
    
    private static final String NULL_CONVERTER_MSG = "converter is null";
    
    public void setConverter(TempConverter converter) {
        if (converter == null) {
            throw new IllegalArgumentException(NULL_CONVERTER_MSG);
        }
        this.converter = converter;
    }
    
    public void setOriginalAndTarget(TempScale original, TempScale target) {
        this.original = original;
        this.target = target;
        if (original == TempScale.CELSIUS
                && target == TempScale.FAHRENHEIT) {
            setConverter(C2F_CONVERTER);    
        } else if (original == TempScale.FAHRENHEIT
                && target == TempScale.CELSIUS) {
            setConverter(F2C_CONVERTER);    
        } else if (original == TempScale.CELSIUS
                && target == TempScale.KELVIN) {
            setConverter(C2K_CONVERTER);    
        } else if (original == TempScale.KELVIN
                && target == TempScale.CELSIUS) {
            setConverter(K2C_CONVERTER);    
        } else if (original == TempScale.FAHRENHEIT
                && target == TempScale.KELVIN) {
            setConverter(F2K_CONVERTER);    
        } else if (original == TempScale.KELVIN
                && target == TempScale.FAHRENHEIT) {
            setConverter(K2F_CONVERTER);    
        } else if (original == target) {
            setConverter(IDENTITY_CONVERTER);
        }
    }
    
    public double getConverted(double degrees)
            throws BelowAbsoluteZeroException {
        if (degrees < original.getAbsoluteZero()) {
            throw new BelowAbsoluteZeroException();
        }
        return converter.getConverted(degrees);
    }
    
}
