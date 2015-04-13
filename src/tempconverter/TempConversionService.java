package tempconverter;

/**
 *
 * @author Dan
 */
public class TempConversionService {

    TempConverter converter;
    
    public void setConverter(TempConverter converter) {
        this.converter = converter;
    }
    
    public double getConverted(double degrees) {
        return converter.getConverted(degrees);
    }
    
}
