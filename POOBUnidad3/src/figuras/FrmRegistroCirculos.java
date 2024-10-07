/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class FrmRegistroCirculos extends javax.swing.JFrame {
    private Figura[] figuras=new Figura[20];
    private int posicion;
    /**
     * Creates new form FrmRegistroCirculos
     */
    public FrmRegistroCirculos() {
        initComponents();
        setTitle("Pantalla de creación de círculos");
        /*PRUEBA SE VA A ELIMINAR*/
        Circulo c1=new Circulo(300,Color.BLUE);
        Circulo c2=new Circulo(100,new Punto(100,0),Color.RED);
        figuras[0]=c1;
        figuras[1]=c2;
        posicion=2;
        PnlLienzo lienzo=new PnlLienzo(figuras);
        lienzo.setBounds(0, 0, 
                (int)(this.getWidth()*.75), 
                this.getHeight());
        this.add(lienzo);
        
        cboCirculos.addItem(c1.datosCirculo());
        cboCirculos.addItem(c2.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        chkIndicarUbicacion = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnX = new javax.swing.JSpinner();
        spnY = new javax.swing.JSpinner();
        btnCrear = new javax.swing.JButton();
        clrColor = new javax.swing.JColorChooser();
        cboCirculos = new javax.swing.JComboBox<>();
        sldRadio = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        btnAsignarRadio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Radio");

        txtRadio.setText("1");

        chkIndicarUbicacion.setText("Indicar ubicación");

        jLabel2.setText("X");

        jLabel3.setText("Y");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        cboCirculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCirculosActionPerformed(evt);
            }
        });

        sldRadio.setMaximum(300);
        sldRadio.setMinimum(1);
        sldRadio.setPaintLabels(true);
        sldRadio.setPaintTicks(true);
        sldRadio.setSnapToTicks(true);
        sldRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRadioStateChanged(evt);
            }
        });

        jLabel4.setText("Ajustar radio");

        btnAsignarRadio.setText("Asignar radio");
        btnAsignarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(847, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkIndicarUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spnX, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnY, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboCirculos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrColor, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAsignarRadio)
                                    .addComponent(sldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkIndicarUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(spnX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(clrColor, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboCirculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(sldRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAsignarRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //System.out.println("Presionó el boton");
        //null centro de la pantalla de la PC
        //this centro de este frame
        //JOptionPane.showMessageDialog(this,"Presionó el botón","Titulo del mensaje",JOptionPane.ERROR_MESSAGE);
        //Tomar todos los valores de los controles
        //Integer  int
        //Double double
        //Float float
        //Character char
        Circulo c;
        
        
        int x=Integer.parseInt(spnX.getValue()+"");
        int y=Integer.parseInt(spnY.getValue().toString());
        //String y=x+"";
        //JOptionPane.showMessageDialog(this, spnX.getValue());
        if(chkIndicarUbicacion.isSelected()){
            Punto ubicacion=new Punto(x,y);
            c=new Circulo(Integer.parseInt(txtRadio.getText()),
                                    ubicacion,
                                    clrColor.getColor()
                                );
        }else{
            c=new Circulo(Integer.parseInt(txtRadio.getText()),
                    clrColor.getColor());
        }
//        System.out.println(c);
//        System.out.println(c.datosCirculo());
        figuras[posicion]=c;
        posicion++;
        cboCirculos.addItem(c.datosCirculo());
        this.repaint();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void sldRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRadioStateChanged
        //System.out.println(sldRadio.getValue());
//        int indice=cboCirculos.getSelectedIndex();
//        circulos[indice].aumentarRadio(sldRadio.getValue()-circulos[indice].getRadio());
//        repaint();
    }//GEN-LAST:event_sldRadioStateChanged

    private void cboCirculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCirculosActionPerformed
        int indice=cboCirculos.getSelectedIndex();
        sldRadio.setValue(figuras[indice].getRadio());
    }//GEN-LAST:event_cboCirculosActionPerformed

    private void btnAsignarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRadioActionPerformed
        int indice = cboCirculos.getSelectedIndex();
        figuras[indice].aumentarRadio(sldRadio.getValue() - figuras[indice].getRadio());
        repaint();
        
    }//GEN-LAST:event_btnAsignarRadioActionPerformed

//    public void paint(Graphics g){
//        g.drawOval(0,0, 50, 50);
//    }
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
            java.util.logging.Logger.getLogger(FrmRegistroCirculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroCirculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroCirculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroCirculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //new FrmRegistroCirculos().setVisible(true);
        FrmRegistroCirculos pantalla= new FrmRegistroCirculos();
        pantalla.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarRadio;
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cboCirculos;
    private javax.swing.JCheckBox chkIndicarUbicacion;
    private javax.swing.JColorChooser clrColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider sldRadio;
    private javax.swing.JSpinner spnX;
    private javax.swing.JSpinner spnY;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
