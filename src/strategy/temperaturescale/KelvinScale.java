package strategy.temperaturescale;

/**
 *
 * @author Dan
 */
public class KelvinScale implements TemperatureScale {

    public static final double ABSOLUTE_ZERO = 0.0;
    public static final double FREEZING_POINT = 273.15;
    public static final double BOILING_POINT = FREEZING_POINT + 100.0;
    public static final double ABSOLUTE_HOT = 1.41678571e32; // Planck temperature
    
    @Override
    public double fromKelvins(double kelvins) {
        return kelvins;
    }

    @Override
    public double toKelvins(double degrees) {
        return degrees;
    }
    
    @Override
    public String getUnit() {
        return "kelvins";
    }
    
    @Override
    public String getAbbreviatedUnit() {
        return "K";
    }
    
//    @Override
//    public double freezingPoint() {
//        return FREEZING_POINT;
//    }
//    
//    @Override
//    public double boilingPoint() {
//        return BOILING_POINT;
//    }
    
}
