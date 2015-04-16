/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.temperature.conversion;

/**
 *
 * @author Dan
 */
public class KelvinToFahrenheitConverter implements TempConverter {
    
    private static final TempConverter K2C = new KelvinToCelsiusConverter();
    private static final TempConverter C2F = new CelsiusToFahrenheitConverter();

    @Override
    public double getConverted(double degrees) {
        return C2F.getConverted(K2C.getConverted(degrees));
    }
    
}
