/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import Serializer.BinarySerializer;
import MyVariousUtils.*;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import network.NetworkBasicClient;

/**
 *
 * @author Nohch
 */
public class commander extends javax.swing.JDialog {

    private NetworkBasicClient client;
    public LinkedList<commande> listCommande;
    public DefaultListModel model;
    /**
     * Creates new form commander
     */
    public commander(java.awt.Frame parent, boolean modal, int centralCible) {
        super(parent, modal);
        initComponents();
        initMyComponents();
        try
        {
            client = new NetworkBasicClient("localhost",50001);    
            model = new DefaultListModel();
            try
            {
                BinarySerializer.deserializeCommande(listCommande);
            }     
            catch(Exception ex)
            {
                FichierLog fLog = new FichierLog("log/logsGarage");
                fLog.writeLine("Erreur lors de deserialisation de la liste commande!" + ex.getMessage());
                fLog.writeLine("Constructeur pour nouvelle liste");

                System.out.println("Erreur lors de deserialisation de la liste commande");
                listCommande = new LinkedList<commande>();
            }
            for(int i = 0; i < listCommande.size();i++)
            {
                model.addElement(listCommande.get(i).toString());
            }
            JlistCommandes.setModel(model);
        }
        catch(Exception ex)
        {
            System.out.println("Erreur lors connexion au serveur :: "+ ex.getMessage());
            JOptionPane.showMessageDialog(null,"Connexion au serveur ratée! Verifiez si le serveur est UP!");
            dispose();
        }
        
    }

    public void initMyComponents()
    {
        radioBtnUrgent.setActionCommand(radioBtnUrgent.getText());
        radioBtnNormal.setActionCommand(radioBtnNormal.getText());
        radioBtnNonPrio.setActionCommand(radioBtnNonPrio.getText());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPrio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LibelleText = new javax.swing.JTextField();
        btnEnvoyer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistCommandes = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        radioBtnUrgent = new javax.swing.JRadioButton();
        radioBtnNormal = new javax.swing.JRadioButton();
        radioBtnNonPrio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        typeText = new javax.swing.JTextField();
        quantiteText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("COMMANDER");

        jLabel2.setText("Libellé");

        jLabel3.setText("Type");

        LibelleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibelleTextActionPerformed(evt);
            }
        });

        btnEnvoyer.setText("Envoyer");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(JlistCommandes);

        jLabel4.setText("Commandes :");

        buttonGroupPrio.add(radioBtnUrgent);
        radioBtnUrgent.setText("urgent");

        buttonGroupPrio.add(radioBtnNormal);
        radioBtnNormal.setSelected(true);
        radioBtnNormal.setText("normal");

        buttonGroupPrio.add(radioBtnNonPrio);
        radioBtnNonPrio.setText("non prioritaire");

        jLabel5.setText("Quantité");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEnvoyer)
                            .addComponent(LibelleText, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(quantiteText)
                            .addComponent(typeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(radioBtnUrgent)
                        .addGap(57, 57, 57)
                        .addComponent(radioBtnNormal)
                        .addGap(34, 34, 34)
                        .addComponent(radioBtnNonPrio)
                        .addContainerGap(165, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(175, 175, 175))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnUrgent)
                    .addComponent(radioBtnNormal)
                    .addComponent(radioBtnNonPrio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LibelleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(typeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(quantiteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEnvoyer))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // TODO add your handling code here:
        if(!LibelleText.getText().trim().equals(""))
        {
            if(!typeText.getText().trim().equals(""))
            {
                if(!quantiteText.getText().isEmpty())
                {
                    try
                    {
                        Integer.parseInt(quantiteText.getText());
                        String reponse = null;
                        String nouvelleCommande = new String();
                        if(radioBtnUrgent.isSelected())
                            nouvelleCommande += "Urgent";
                        else if(radioBtnNormal.isSelected())
                            nouvelleCommande += "Normal";
                        else
                            nouvelleCommande += "NonPrio";

                        nouvelleCommande += "###";
                        nouvelleCommande += LibelleText.getText().trim();
                        nouvelleCommande += "###";
                        nouvelleCommande += typeText.getText().trim();
                        nouvelleCommande += "###";
                        nouvelleCommande += quantiteText.getText().trim();
                        nouvelleCommande += "###";
                        nouvelleCommande += "EOM";   //End of Message
                        //    public commande(short priorite, String libelle, String type, int quantite) {
                        //JOptionPane.showMessageDialog(null, buttonGroupPrio.getSelection().getActionCommand());
                        reponse = client.sendString(nouvelleCommande);
                        commande com = new commande(buttonGroupPrio.getSelection().getActionCommand(),LibelleText.getText(),typeText.getText(),Integer.parseInt(quantiteText.getText()));
                        listCommande.add(com);
                        model.addElement(com);
                        JlistCommandes.setModel(model);
                        JOptionPane.showMessageDialog(null,com.toString() + reponse);
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "La quantite doit etre un nombre! :: "+ ex.getMessage());
                    }
                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnEnvoyerActionPerformed

    private void LibelleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibelleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibelleTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        client.setEndSending();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(commander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                commander dialog = new commander(new javax.swing.JFrame(), true,-1);
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
    private javax.swing.JList JlistCommandes;
    private javax.swing.JTextField LibelleText;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.ButtonGroup buttonGroupPrio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantiteText;
    private javax.swing.JRadioButton radioBtnNonPrio;
    private javax.swing.JRadioButton radioBtnNormal;
    private javax.swing.JRadioButton radioBtnUrgent;
    private javax.swing.JTextField typeText;
    // End of variables declaration//GEN-END:variables
}
