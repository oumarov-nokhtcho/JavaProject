/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import activites.*;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Nohch
 */
public class priseEnCharge extends javax.swing.JDialog {

    private List<travail> travaux;
    private List<travailEnCours> travauxEnCours;
    private travailEnCours t;
    /**
     * Creates new form priseEnCharge
     */
    public priseEnCharge(java.awt.Frame parent, boolean modal,List<travail> travauxAFaire, List<travailEnCours> listTravauxEnCours) {
        super(parent, modal);
        initComponents();
        if(travauxAFaire != null){
            this.travaux = travauxAFaire;
            remplirTable();
        }
            
        if(listTravauxEnCours != null)
            this.travauxEnCours = listTravauxEnCours; 
        
    }
    
    private void remplirTable()
    {
        DefaultTableModel model = (DefaultTableModel)tableTravaux.getModel(); 
        Object[] row;
        System.out.println(travaux.size());
        for(int i = 0; i < travaux.size(); i++){
            row = new Object[6];    //nbre de colonnes
            row[0] = travaux.get(i).getVoit().getTypeVoiture().toString();
            row[1] = travaux.get(i).getVoit().getPlaqueImma();
            row[2] = travaux.get(i).getVoit().isPlaqueBelge();
            row[3] = travaux.get(i).getVoit().getProprio();
            row[4] = travaux.get(i).getTypeTravail();
            row[5] = travaux.get(i).getInstructions();
            model.addRow(row);
        }
    }
    
    public travailEnCours runDialog()
    {
        this.setVisible(true);
        return t;
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
        jLabel1 = new javax.swing.JLabel();
        radiobtnPont = new javax.swing.JRadioButton();
        radioBtnSol = new javax.swing.JRadioButton();
        comboBoxPont = new javax.swing.JComboBox();
        btnOk = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTravaux = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Travaux en attente :");

        buttonGroup1.add(radiobtnPont);
        radiobtnPont.setText("Pont");

        buttonGroup1.add(radioBtnSol);
        radioBtnSol.setText("Sol");

        comboBoxPont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        tableTravaux.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type Voiture$", "Immatriculation", "PlaqueBelge", "Propriétaire", "Type Travail", "Remarques"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableTravaux);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radiobtnPont)
                                .addGap(88, 88, 88)
                                .addComponent(comboBoxPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnSol, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnPont)
                    .addComponent(radioBtnSol)
                    .addComponent(comboBoxPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
       
        int numPont = 0;
        boolean occupe = false;
        
        
            //System.out.println("getSelectedItem returns : " + comboBoxPont.getSelectedItem);
        if(!tableTravaux.getSelectionModel().isSelectionEmpty())
        {
            if(radiobtnPont.isSelected() || radioBtnSol.isSelected() )
            {
                if(radiobtnPont.isSelected())
                    numPont = Integer.parseInt(comboBoxPont.getSelectedItem().toString());
                else if(radioBtnSol.isSelected())
                    numPont = 0;
        
                System.out.println("numpont = :" +numPont);
                if(travauxEnCours != null)
                {
                    for(int i = 0; i < travauxEnCours.size();i++)
                    {
                        if(travauxEnCours.get(i).getNumPont() == numPont)//premier en cours
                        {
                            occupe = true;
                            i = travauxEnCours.size();
                        }
                            
                    }   
                    if(occupe == false)
                    {
                        DefaultTableModel tableModel = (DefaultTableModel) tableTravaux.getModel();
                        try{
                            t = new travailEnCours((Vector)tableModel.getDataVector().elementAt(tableTravaux.getSelectedRow()),numPont);
                        }
                        catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(null,"Erreur lors d'ajout à la liste!:: " +ex.getMessage());
                        }
                        dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Emplacement Occupé!");
                }
            }else
                JOptionPane.showMessageDialog(null,"Selectionnez un emplacement!");
        }else
                JOptionPane.showMessageDialog(null,"Selectionnez une ligne!!");
        
        
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

     private void close()
    {
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
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
            java.util.logging.Logger.getLogger(priseEnCharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(priseEnCharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(priseEnCharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(priseEnCharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("CACACACACA");
                priseEnCharge dialog = new priseEnCharge(new javax.swing.JFrame(), true,null,null);
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
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboBoxPont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBtnSol;
    private javax.swing.JRadioButton radiobtnPont;
    private javax.swing.JTable tableTravaux;
    // End of variables declaration//GEN-END:variables
}
