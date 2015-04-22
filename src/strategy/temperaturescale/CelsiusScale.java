package strategy.temperaturescale;

/**
 *
 * @author Dan
 */
public class CelsiusScale implements TemperatureScale {

    private static final double OFFSET = 273.15;
    
    @Override
    public double fromKelvins(double kelvins) {
        return kelvins - OFFSET;
    }

    @Override
    public double toKelvins(double degrees) {
        return degrees + OFFSET;
    }
    
    @Override
    public String getUnit() {
        return "degrees Celsius";
    }
    
    @Override
    public String getAbbreviatedUnit() {
        return "°C";
    }
    
//    @Override
//    public double freezingPoint() {
//        return 0.0;
//    }
    
//    @Override
//    public double boilingPoint() {
//        return 100.0;
//    }
    
}
