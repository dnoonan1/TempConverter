package strategy.tempconverter;

/**
 *
 * @author Dan
 */
public class IdentityConverter implements TempConverter {

    @Override
    public double getConverted(double degrees) {
        return degrees;
    }

}
