package strategy.temperaturescale;

/**
 *
 * @author Dan
 */
public class FahrenheitScale implements TemperatureScale {

    private static final double OFFSET = 273.15;
    private static final double SCALE = 9 / 5.0;
    private static final double INVERSE = 5.0 / 9;
    private static final double FREEZING_POINT = 32.0;
    
    /*
        C = K - 273.15
        F = 9 / 5 * C + 32
        F = 9 / 5 * (K - 273.15) + 32
        K = 5 / 9 * (F - 32) + 273.15
    */
    
    @Override
    public double fromKelvins(double kelvins) {
        return SCALE * (kelvins - OFFSET) + FREEZING_POINT;
    }
    
    @Override
    public double toKelvins(double degrees) {
        return INVERSE * (degrees - FREEZING_POINT) + OFFSET;
    }
    
    @Override
    public String getUnit() {
        return "degrees Fahrenheit";
    }
    
    @Override
    public String getAbbreviatedUnit() {
        return "°F";
    }
    
//    @Override
//    public double freezingPoint() {
//        return 32.0;
//    }
//    
//    @Override
//    public double boilingPoint() {
//        return 212.0;
//    }
    
}
