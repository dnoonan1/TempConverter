package strategy.temperaturescale;

/**
 *
 * @author Dan
 */
public interface TemperatureScale {
    
    double fromKelvins(double kelvins);
    double toKelvins(double degrees);
    String getUnit();
    String getAbbreviatedUnit();
    
    default double absoluteZero() {
        return fromKelvins(KelvinScale.ABSOLUTE_ZERO);
    }
    
    default double freezingPoint() {
        return fromKelvins(KelvinScale.FREEZING_POINT);
    }
    
    default double boilingPoint() {
        return fromKelvins(KelvinScale.BOILING_POINT);
    }
    
    default double absoluteHot() {
        return fromKelvins(KelvinScale.ABSOLUTE_HOT);
    }
    
}
