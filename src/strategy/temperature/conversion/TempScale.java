package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public enum TempScale {
    
    CELSIUS, FAHRENHEIT, KELVIN;
    
    public String getNotation() {
        if (this == KELVIN) {
            return this.toString().substring(0, 1);
        } else {
            return "°" + this.toString().charAt(0);
        }
    }
    
}
