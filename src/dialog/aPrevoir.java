/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Nohch
 */
public class aPrevoir extends javax.swing.JDialog {
    private static List<String> proprios;
    private static List<String> typesTravEntretien;
    private static List<String> typesTravReparation;
    private Vector v; 
    static{
        proprios = new LinkedList<String>();
        proprios.add("Mr Dupont");
        proprios.add("Mr LaVergeDure");
        proprios.add("JusDOrange Doré");
        proprios.add("LaPlaceDeLaFemme Cuisine");
        proprios.add("LaPierreTombale Caca");
        
        typesTravEntretien = new LinkedList<String>();
        typesTravEntretien.add("Entretien huile");
        typesTravEntretien.add("Entretien filtres");
        typesTravEntretien.add("Courroi de distribution");
        
        typesTravReparation = new LinkedList<String>();
        typesTravReparation.add("Fixe géométrie");
        typesTravReparation.add("Reparation carosserie");
        typesTravReparation.add("réparation penu");
    }
    /**
     * Creates new form aPrevoir
     */
    public aPrevoir(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        proprioComboBox.setModel(new DefaultComboBoxModel(proprios.toArray()));
                    
    }

    private void close()
    {
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
        
    public Vector runDialog()
    {
        this.setVisible(true);
        return v;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        plaqueBelge = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        radioBtnEntretien = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        buttonAnnuler = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        typeVoitureTxt = new javax.swing.JTextField();
        radioBtnRepar = new javax.swing.JRadioButton();
        ImmatriculationTxt = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        typeTravailComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        proprioComboBox = new javax.swing.JComboBox();
        instructionPart = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        plaqueBelge.setText("Plaque Belge");

        jLabel2.setText("Immatriculation");

        buttonGroup1.add(radioBtnEntretien);
        radioBtnEntretien.setText("Entretien");
        radioBtnEntretien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnEntretienActionPerformed(evt);
            }
        });

        jLabel5.setText("Instructions particulières");

        jCheckBox2.setText("new !");

        buttonAnnuler.setText("Annuler");
        buttonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnnulerActionPerformed(evt);
            }
        });

        jLabel3.setText("Propriétaire");

        buttonGroup1.add(radioBtnRepar);
        radioBtnRepar.setText("Réparation");
        radioBtnRepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnReparActionPerformed(evt);
            }
        });

        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        jLabel4.setText("Type de travail");

        jLabel1.setText("Type voiture :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typeVoitureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ImmatriculationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(plaqueBelge)
                                        .addGap(24, 24, 24))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(proprioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox2)
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(78, 78, 78)
                                        .addComponent(typeTravailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(radioBtnEntretien)
                        .addGap(37, 37, 37)
                        .addComponent(radioBtnRepar)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(buttonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instructionPart, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(typeVoitureTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ImmatriculationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plaqueBelge))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(proprioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnEntretien)
                            .addComponent(radioBtnRepar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(typeTravailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionPart, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOk)
                    .addComponent(buttonAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnEntretienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnEntretienActionPerformed
        // TODO add your handling code here:
        typeTravailComboBox.setModel(new DefaultComboBoxModel(typesTravEntretien.toArray()));
    }//GEN-LAST:event_radioBtnEntretienActionPerformed

    private void radioBtnReparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnReparActionPerformed
    typeTravailComboBox.setModel(new DefaultComboBoxModel(typesTravReparation.toArray()));
    }//GEN-LAST:event_radioBtnReparActionPerformed

    private void buttonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnnulerActionPerformed
        close();
    }//GEN-LAST:event_buttonAnnulerActionPerformed

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        v = new Vector(); 
        if(!(typeVoitureTxt.getText().equals("")))
        {
            if(!(ImmatriculationTxt.getText().equals("")))
            {
                if(!(proprioComboBox.getSelectedItem().toString().equals("")))
                {
                    if(radioBtnEntretien.isSelected() || radioBtnRepar.isSelected())
                    {
                        try{
                            v.add(typeVoitureTxt.getText().trim());
                            v.add(ImmatriculationTxt.getText().trim());
                            if(plaqueBelge.isSelected())
                                v.add("true");
                            else
                                v.add("false");
                            v.add(proprioComboBox.getSelectedItem().toString());
                            v.add(typeTravailComboBox.getSelectedItem().toString());
                            v.add(instructionPart.getText().trim());    
                        }catch (Exception ex){
                            System.out.println("Exception dans aPrevoir.java -> buttonOkActionPerformed"+ex.getMessage());
                        }
                        

                        close();
                        dispose();
                    }else
                        JOptionPane.showMessageDialog(null, "Choisissez le type de travail!");

                }else
                    JOptionPane.showMessageDialog(null, "Choisissez un propriétaire du véhicule!");
            }else
                JOptionPane.showMessageDialog(null, "Entrez l'immatriculation du véhicule!");
        }else
            JOptionPane.showMessageDialog(null, "Entrez le type du véhicule!");

            
        
    }//GEN-LAST:event_buttonOkActionPerformed

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
            java.util.logging.Logger.getLogger(aPrevoir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aPrevoir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aPrevoir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aPrevoir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                aPrevoir dialog = new aPrevoir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImmatriculationTxt;
    private javax.swing.JButton buttonAnnuler;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonOk;
    private javax.swing.JTextField instructionPart;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox plaqueBelge;
    private javax.swing.JComboBox proprioComboBox;
    private javax.swing.JRadioButton radioBtnEntretien;
    private javax.swing.JRadioButton radioBtnRepar;
    private javax.swing.JComboBox typeTravailComboBox;
    private javax.swing.JTextField typeVoitureTxt;
    // End of variables declaration//GEN-END:variables
}