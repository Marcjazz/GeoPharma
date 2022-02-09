package geopharma;

import com.connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AuthFrame extends javax.swing.JFrame {

    Connection connex;

    public AuthFrame() {
        initComponents();
        connex = Connexion.seConnecter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelInformation = new javax.swing.JPanel();
        labelNom = new javax.swing.JLabel();
        textFieldNom = new javax.swing.JTextField();
        labelPrenom = new javax.swing.JLabel();
        textFieldPrenom = new javax.swing.JTextField();
        labelDate = new javax.swing.JLabel();
        labelMois = new javax.swing.JLabel();
        labelAnnee = new javax.swing.JLabel();
        spinnerDate = new javax.swing.JSpinner();
        spinnerMois = new javax.swing.JSpinner();
        spinnerAnnee = new javax.swing.JSpinner();
        labelMotDePasse = new javax.swing.JLabel();
        textFieldMotDePasse = new javax.swing.JPasswordField();
        labelLien = new javax.swing.JLabel();
        buttonCreer = new javax.swing.JButton();
        titre2 = new javax.swing.JLabel();
        titre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Creer Un Compte");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(150, 10, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("inscription"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(922, 600));

        panelInformation.setBackground(new java.awt.Color(255, 255, 255));

        labelNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNom.setText("Nom: ");
        labelNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        labelNom.setName("labelNom"); // NOI18N

        textFieldNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldNom.setPreferredSize(new java.awt.Dimension(280, 25));

        labelPrenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPrenom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrenom.setText("Prénom:");

        textFieldPrenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldPrenom.setPreferredSize(new java.awt.Dimension(280, 25));
        textFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPrenomActionPerformed(evt);
            }
        });

        labelDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDate.setText("Date:");

        labelMois.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelMois.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMois.setText("Mois:");

        labelAnnee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelAnnee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnnee.setText("Année:");

        labelMotDePasse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMotDePasse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMotDePasse.setText("Mot de passe:");

        textFieldMotDePasse.setPreferredSize(new java.awt.Dimension(280, 25));

        labelLien.setForeground(new java.awt.Color(0, 51, 255));
        labelLien.setText("j'ai deja un compte utilisateur !");
        labelLien.setName("connexion"); // NOI18N
        labelLien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelInformationLayout = new javax.swing.GroupLayout(panelInformation);
        panelInformation.setLayout(panelInformationLayout);
        panelInformationLayout.setHorizontalGroup(
            panelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textFieldMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformationLayout.createSequentialGroup()
                            .addComponent(labelDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(labelMois)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinnerMois, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(labelAnnee)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinnerAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textFieldPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelNom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelMotDePasse, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(labelLien))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelInformationLayout.setVerticalGroup(
            panelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformationLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(labelNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelPrenom)
                .addGap(2, 2, 2)
                .addComponent(textFieldPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelMotDePasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerMois, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnnee)
                    .addComponent(labelMois)
                    .addComponent(spinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate))
                .addGap(17, 17, 17)
                .addComponent(labelLien)
                .addContainerGap())
        );

        textFieldNom.getAccessibleContext().setAccessibleName("");

        buttonCreer.setText("Creer");
        buttonCreer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCreer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreerMouseClicked(evt);
            }
        });

        titre2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre2.setText("Utilisateur");
        titre2.setAlignmentY(5.0F);
        titre2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titre2.setName("tritre2"); // NOI18N

        titre1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre1.setText("Creation d'un compte");
        titre1.setAlignmentY(5.0F);
        titre1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titre1.setName("titre1"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/pharmacie-avec-le-pharmacien-et-client-dans-compteur-illustration-de-conception-personnage-dessin-animé-médecine-fond-santé-151281243.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titre1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titre2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(titre1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titre2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCreer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchPage() {
        boolean condition = labelLien.getName().equals("connexion");
        labelLien.setName(condition ? "inscription" : "connexion");

        //changer le titre de la page
        titre1.setText(condition ? "Connexion a un" : "Creation d'un compte");

        //faire apparaitre ou disparaitre les labels intervenant ou n'intervenant pas dans la connexion ou inscription
        labelPrenom.setVisible(!condition);
        labelDate.setVisible(!condition);
        labelMois.setVisible(!condition);
        labelAnnee.setVisible(!condition);

        //faire apparaitre ou disparaitre les champs intervenant ou n'intervenant pas dans la connexion ou inscription
        textFieldPrenom.setVisible(!condition);
        textFieldPrenom.setVisible(!condition);
        spinnerAnnee.setVisible(!condition);
        spinnerDate.setVisible(!condition);
        spinnerMois.setVisible(!condition);
        buttonCreer.setText(condition ? "Se connecter" : "Creer");
    }
    private void labelLienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLienMouseClicked
        switchPage();
    }//GEN-LAST:event_labelLienMouseClicked

    private void buttonCreerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreerMouseClicked
        String nom = textFieldNom.getText();
        String prenom = textFieldPrenom.getText();
        String motDePasse = textFieldMotDePasse.getText();

        String fichierPreuve = "";
        //recuper le fichier preuve

        int date = (int) spinnerDate.getValue();
        int mois = (int) spinnerMois.getValue();
        int annee = (int) spinnerAnnee.getValue();
        if (labelLien.getName().equals("connexion")) {
            if (nom.isEmpty() || prenom.isEmpty() || motDePasse.isEmpty() || date == 0 || mois == 0 || annee == 0) {
                JOptionPane.showMessageDialog(this, "Veuiller remplir tous les champs avant de valider");
            } else {
                System.out.println("Nom: " + nom + "\nPrenom: " + prenom + "\nMot de passe: "
                        + motDePasse + "\nDate de naissance: " + date + "/" + mois + "/" + annee);
                try {
                    PreparedStatement prepare = connex.prepareStatement(
                            "INSERT INTO User(iduser, nom, prenom, datenaiss, fichier_preuve, mot_de_passe, is_admin) values(?, ?, ?, ?, ?, ?)");
                    prepare.setString(1, nom);
                    prepare.setString(2, prenom);
                    prepare.setString(3, annee + "-" + mois + "-" + date);
                    prepare.setString(4, fichierPreuve);
                    prepare.setString(5, motDePasse);
                    prepare.setBoolean(6, false);
                    prepare.execute();
                    JOptionPane.showMessageDialog(this,
                            "Felicitations votre compte a bel et bien été créer. \n Vous pouvez maintenant vous connecter et ajouter vos pharmacie");
                    switchPage();
                } catch (SQLException e) {
                    System.out.println("Erreur insertion SQL: " + e.getMessage());
                }
            }
        } else {
            if (!nom.isEmpty() || !motDePasse.isEmpty()) {
                //faire un find ici
                try {
                    String query = "SELECT nom, mot_de_passe FROM User WHERE nom="+ nom + " AND mot_de_passe=" + motDePasse;
                    Statement etat = connex.createStatement();
                    ResultSet result = etat.executeQuery(query);
                    if (!result.wasNull()) {
                        this.setVisible(false);
                        Acceuil home = new Acceuil();
                        home.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Mot de Passe incorrect");
                    }
                } catch (SQLException e) {
                    System.out.println("Erreur requette SQL: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mot de Passe incorrect");
            }
        }
    }//GEN-LAST:event_buttonCreerMouseClicked

    private void textFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPrenomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAnnee;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelLien;
    private javax.swing.JLabel labelMois;
    private javax.swing.JLabel labelMotDePasse;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelPrenom;
    private javax.swing.JPanel panelInformation;
    private javax.swing.JSpinner spinnerAnnee;
    private javax.swing.JSpinner spinnerDate;
    private javax.swing.JSpinner spinnerMois;
    private javax.swing.JPasswordField textFieldMotDePasse;
    private javax.swing.JTextField textFieldNom;
    private javax.swing.JTextField textFieldPrenom;
    private javax.swing.JLabel titre1;
    private javax.swing.JLabel titre2;
    // End of variables declaration//GEN-END:variables
}
