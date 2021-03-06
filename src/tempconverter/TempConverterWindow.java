/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import javax.swing.JOptionPane;
import strategy.tempconverter.TempScale;

/**
 *
 * @author Dan
 */
public class TempConverterWindow extends javax.swing.JFrame {

    TempConversionService conversionService;
    
    private static final String ERROR_WINDOW_TITLE = "Error";
    private static final String INPUT_FORMAT_MSG = "You must enter a decimal "
            + "number for the input temperature.";
    private static final String BELOW_ZERO_MSG = "The temperature you enter "
            + "must be above absolute zero: ";
    
    /**
     * Creates new form TempConverter
     */
    public TempConverterWindow() {
        initComponents();
        conversionService = new TempConversionService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgInitialScale = new javax.swing.ButtonGroup();
        bgFinalScale = new javax.swing.ButtonGroup();
        lblTemperature = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblDegrees = new javax.swing.JLabel();
        rbCelsius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        btnConvert = new javax.swing.JButton();
        lblOutputMsg = new javax.swing.JLabel();
        rbKelvin = new javax.swing.JRadioButton();
        rbCelsius1 = new javax.swing.JRadioButton();
        rbFahrenheit1 = new javax.swing.JRadioButton();
        rbKelvin1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        lblTemperature.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTemperature.setText("Temperature:");

        txtTemperature.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTemperature.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTemperature.setText("0");
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        lblDegrees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDegrees.setText("degrees");

        bgInitialScale.add(rbCelsius);
        rbCelsius.setSelected(true);
        rbCelsius.setText("Celsius");

        bgInitialScale.add(rbFahrenheit);
        rbFahrenheit.setText("Fahrenheit");

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblOutputMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOutputMsg.setForeground(new java.awt.Color(0, 51, 255));
        lblOutputMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bgInitialScale.add(rbKelvin);
        rbKelvin.setText("Kelvin");

        bgFinalScale.add(rbCelsius1);
        rbCelsius1.setText("Celsius");

        bgFinalScale.add(rbFahrenheit1);
        rbFahrenheit1.setSelected(true);
        rbFahrenheit1.setText("Fahrenheit");

        bgFinalScale.add(rbKelvin1);
        rbKelvin1.setText("Kelvin");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FROM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnConvert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFahrenheit)
                            .addComponent(rbCelsius)
                            .addComponent(rbKelvin)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCelsius1)
                            .addComponent(rbFahrenheit1)
                            .addComponent(rbKelvin1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOutputMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTemperature)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, rbCelsius, rbFahrenheit, rbKelvin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, rbCelsius1, rbFahrenheit1, rbKelvin1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegrees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCelsius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKelvin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCelsius1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFahrenheit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKelvin1)))
                .addGap(20, 20, 20)
                .addComponent(btnConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOutputMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDegrees, lblTemperature, txtTemperature});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        
        TempScale original, target;
        
        if (rbCelsius.isSelected()) {
            original = TempScale.CELSIUS;
        } else if (rbFahrenheit.isSelected()) {
            original = TempScale.FAHRENHEIT;
        } else { // rbKelvin.isSelected()
            original = TempScale.KELVIN;
        }
        
        if (rbCelsius1.isSelected()) {
            target = TempScale.CELSIUS;
        } else if (rbFahrenheit1.isSelected()) {
            target = TempScale.FAHRENHEIT;
        } else { // rbKelvin1.isSelected()
            target = TempScale.KELVIN;
        }
        
        conversionService.setOriginalAndTarget(original, target);
        
        try {
            double originalDegrees = Double.parseDouble(txtTemperature.getText());
            double targetDegrees = conversionService.getConverted(originalDegrees);
            String text = String.format("%.1f %s = %.1f %s",
                    originalDegrees, original.getNotation(), 
                    targetDegrees, target.getNotation());
            lblOutputMsg.setText(text);
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, INPUT_FORMAT_MSG,
                    ERROR_WINDOW_TITLE, JOptionPane.ERROR_MESSAGE);
        } catch (BelowAbsoluteZeroException baz) {
            JOptionPane.showMessageDialog(this,
                    BELOW_ZERO_MSG + original.getAbsoluteZero()
                            + " " + original.getNotation() + ".",
                    ERROR_WINDOW_TITLE, JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TempConverterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempConverterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempConverterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempConverterWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConverterWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFinalScale;
    private javax.swing.ButtonGroup bgInitialScale;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDegrees;
    private javax.swing.JLabel lblOutputMsg;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbCelsius1;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbFahrenheit1;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbKelvin1;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

}
