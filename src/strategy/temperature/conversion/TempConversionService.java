package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public class TempConversionService {

    private TempConverter converter;
    
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
    
    public double getConverted(double degrees) {
        return converter.getConverted(degrees);
    }
    
}
