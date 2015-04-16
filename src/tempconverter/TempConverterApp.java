package tempconverter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Dan
 */
public class TempConverterApp {
    
    private static final String ERROR_WINDOW_TITLE = "Error";
    private static final String LF_ERROR_MSG = "System look and feel "
            + "unavailable. Using default instead.";
    
    public static void main(String[] args) {
        
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ERROR_WINDOW_TITLE,
                    LF_ERROR_MSG,JOptionPane.ERROR_MESSAGE);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TempConverterWindow().setVisible(true);
        });
        
    }
    
}
