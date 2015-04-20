package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public enum TempScale {
    
    CELSIUS(-273.15), FAHRENHEIT(-459.67), KELVIN(0);
    
    private double absoluteZero;
    
    TempScale(double absoluteZero) {
        this.absoluteZero = absoluteZero;
    }
    
    public double getAbsoluteZero() {
        return absoluteZero;
    }
    
    public String getNotation() {
        if (this == KELVIN) {
            return this.toString().substring(0, 1);
        } else {
            return "°" + this.toString().charAt(0);
        }
    }
    
}
