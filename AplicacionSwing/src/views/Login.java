/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import static aplicacionswing.AplicacionSwing.login;
import static aplicacionswing.AplicacionSwing.principal;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import models.Usuario;
import static models.Usuario.validaUsuario;

/**
 *
 * @author davidcaamal
 */
public class Login extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    private boolean estadoPanel = true;

    public Login() {
        initComponents();
        setTitle("Mi proyecto JAVA");
        lblGetStarted.setForeground(Color.blue);
                
        btnLoginGoogle.setBackground(Color.WHITE);
        this.mostrarImagenEscala(this.jlblLogo, "src/statics/images/logoInicial.png");

    }

    @Override
    public Image getIconImage(){
        Image retValue;
        String rutaIcono = "statics/images/googleplus_icon24.png";
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(rutaIcono));
        return retValue;
    }
    
    private void mostrarImagenEscala(JLabel lbl, String rutaImagen){
        this.imagen = new ImageIcon(rutaImagen);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT
                )
        );
        lbl.setIcon(this.icono);
        this.repaint();
       
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelIzquierdo = new javax.swing.JPanel();
        txtUsuarioLogin = new javax.swing.JTextField();
        lblGetStarted = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnLoginGoogle = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JPanelDerecho = new javax.swing.JPanel();
        jlblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));

        txtUsuarioLogin.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuarioLogin.setText("Ingrese su usuario/email");
        txtUsuarioLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsuarioLogin.setCaretColor(new java.awt.Color(204, 204, 204));
        txtUsuarioLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtUsuarioLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioLoginMousePressed(evt);
            }
        });
        txtUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioLoginActionPerformed(evt);
            }
        });

        lblGetStarted.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblGetStarted.setText("Get started");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Inicie gratis por 30 dias.");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Crear una Cuenta");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Usuario *");

        txtPasswordLogin.setForeground(new java.awt.Color(204, 204, 204));
        txtPasswordLogin.setText("************");
        txtPasswordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordLoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordLoginMouseExited(evt);
            }
        });
        txtPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordLoginActionPerformed(evt);
            }
        });
        txtPasswordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordLoginKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordLoginKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Password *");

        btnLoginGoogle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoginGoogle.setText("Login con Google");
        btnLoginGoogle.setAlignmentX(1.0F);
        btnLoginGoogle.setAlignmentY(1.0F);
        btnLoginGoogle.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnLoginGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginGoogle.setIconTextGap(10);
        btnLoginGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginGoogleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginGoogleMouseExited(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("Log in");
        btnLogin.setAlignmentX(1.0F);
        btnLogin.setAlignmentY(1.0F);
        btnLogin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setIconTextGap(10);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("¿Ya tienes cuenta con nosotros?");

        javax.swing.GroupLayout JPanelIzquierdoLayout = new javax.swing.GroupLayout(JPanelIzquierdo);
        JPanelIzquierdo.setLayout(JPanelIzquierdoLayout);
        JPanelIzquierdoLayout.setHorizontalGroup(
            JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblGetStarted)
                                .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3))))
                        .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                                    .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7))
                                    .addGap(220, 220, 220))
                                .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnLoginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        JPanelIzquierdoLayout.setVerticalGroup(
            JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGetStarted)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(118, 118, 118))
        );

        JPanelDerecho.setBackground(new java.awt.Color(255, 255, 255));

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statics/images/logoInicial.png"))); // NOI18N
        jlblLogo.setText("jLabel1");

        javax.swing.GroupLayout JPanelDerechoLayout = new javax.swing.GroupLayout(JPanelDerecho);
        JPanelDerecho.setLayout(JPanelDerechoLayout);
        JPanelDerechoLayout.setHorizontalGroup(
            JPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 717, Short.MAX_VALUE))
        );
        JPanelDerechoLayout.setVerticalGroup(
            JPanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanelDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPasswordLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordLoginMouseClicked
        if (String.valueOf(txtPasswordLogin.getPassword()).equals("************")){
            txtPasswordLogin.setText("");
            txtPasswordLogin.setForeground(Color.BLACK);
            txtPasswordLogin.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtPasswordLoginMouseClicked

    private void txtPasswordLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordLoginMouseExited
        if (String.valueOf(txtPasswordLogin.getPassword()).equals("************") || String.valueOf(txtPasswordLogin.getPassword()).isEmpty()){
            txtPasswordLogin.setText("************");
            txtPasswordLogin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordLoginMouseExited

    private void txtPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordLoginActionPerformed

    private void txtPasswordLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordLoginKeyPressed

    }//GEN-LAST:event_txtPasswordLoginKeyPressed

    private void txtPasswordLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordLoginKeyTyped

        if (txtPasswordLogin.getPassword().length>= 10){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPasswordLoginKeyTyped

    private void btnLoginGoogleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginGoogleMouseEntered
        btnLoginGoogle.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnLoginGoogleMouseEntered

    private void btnLoginGoogleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginGoogleMouseExited
        btnLoginGoogle.setBackground(Color.WHITE);

    }//GEN-LAST:event_btnLoginGoogleMouseExited

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setForeground(Color.blue);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String idUser = txtUsuarioLogin.getText();
        String idPassword = new String(txtPasswordLogin.getPassword());
        
        if (Usuario.validaUsuario(idUser, idPassword)){
            login.setVisible(false);
            principal.EntradaFrame(idUser, Usuario.getImage(idUser, 2));
            principal.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioLoginMousePressed
        if (txtUsuarioLogin.getText().equals("Ingrese su usuario/email")){
           txtUsuarioLogin.setText("");
           txtUsuarioLogin.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsuarioLoginMousePressed

    private void txtUsuarioLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioLoginMouseExited
        if (txtUsuarioLogin.getText().equals("Ingrese su usuario/email") || txtUsuarioLogin.getText().isEmpty()){
            txtUsuarioLogin.setText("Ingrese su usuario/email");
            txtUsuarioLogin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioLoginMouseExited

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelDerecho;
    private javax.swing.JPanel JPanelIzquierdo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginGoogle;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel lblGetStarted;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
