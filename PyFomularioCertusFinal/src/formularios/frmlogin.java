package formularios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import java.util.Random;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author frans-montoya
 */
public class frmlogin extends javax.swing.JFrame {

    private final static
            Logger LOG = Log.getLogger(frmlogin.class);
    private static final String CORREO_ESPERADO = "admin@certus.edu.pe";
    private String claveGenerada;
    private javax.swing.JLabel lblClaveGenerada;
    private javax.swing.JLabel ver;
    private javax.swing.JLabel esconder;

    
    public frmlogin() {
        initComponents();
        claveGenerada = ClaveAleatoriaGenerator.generarClaveAleatoria();
        setPlaceholderText();
        btnAceptar.requestFocusInWindow();
        // Inicialización del lblGenerarClave
        lblClaveGenerada = new javax.swing.JLabel();
        //add(lblClaveGenerada);
        // Muestra la contraseña al iniciar
        jLver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png")));
        jLesconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esconder.png")));
        esconder = jLesconder;
        esconder.setVisible(false);
        ver = jLver;

        
        
        // Centrar la ventana en la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = pantalla.width;
        int alto = pantalla.height;
        setLocation(ancho / 2 - getWidth() / 2, alto / 2 - getHeight() / 2);
    }
    
    private void setPlaceholderText() {
        txtusuario.setText("Ingrese su Usuario");
        txtusuario.setForeground(Color.gray);
        
        txtcontrasena.setText("Password");
        txtcontrasena.setForeground(Color.gray);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontrasena = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblGenerarClave = new javax.swing.JLabel();
        jLlogo = new javax.swing.JLabel();
        jLver = new javax.swing.JLabel();
        jLesconder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("GodOfWar", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("¡Bienvenido(a)! Portal Certus");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/java.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña:");

        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });

        txtcontrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontrasenaMousePressed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAceptar.setText("Ingresar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        lblGenerarClave.setFont(new java.awt.Font("Segoe UI", 3, 9)); // NOI18N
        lblGenerarClave.setForeground(new java.awt.Color(0, 51, 255));
        lblGenerarClave.setText("Generar clave de acceso");
        lblGenerarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerarClaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGenerarClave)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcontrasena, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblGenerarClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jLver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver.png"))); // NOI18N
        jLver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLverMouseClicked(evt);
            }
        });

        jLesconder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esconder.png"))); // NOI18N
        jLesconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLesconderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLver)
                    .addComponent(jLesconder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLlogo)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLlogo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLver)
                            .addComponent(jLesconder))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Ingreso al Sistema Login
        try {
            String correo = txtusuario.getText();
            String pass = txtcontrasena.getText();
            boolean correoValido = correo.equals(CORREO_ESPERADO);
            boolean passCorrecta = pass.equals(claveGenerada);

    if (correo.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Los campos de correo electrónico y contraseña son obligatorios. Por favor, ingréselos correctamente.");
        System.out.println("Los campos de correo electrónico y contraseña son obligatorios. Por favor, ingréselos correctamente.");
    } else if (correoValido && passCorrecta) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de CERTUS");
        System.out.println("Bienvenido al Sistema de CERTUS");
    } else {
        StringBuilder mensajeError = new StringBuilder();
        if (!correoValido) {
            mensajeError.append("El correo 📧 no es válido. ");
        }
        if (!passCorrecta) {
            mensajeError.append("Contraseña incorrecta. Por favor, revise e intente nuevamente.");
        }
        JOptionPane.showMessageDialog(null, mensajeError.toString());

        // Imprimir mensajes de error en el archivo de registro y en la consola
        if (!correoValido && !passCorrecta) {
            String mensajeLog = "El correo y/o la contraseña son incorrectos: \" 📧.Correo = " + correo + ", Contraseña = " + pass;
            LOG.info(mensajeLog);
            System.out.println(mensajeLog);
        } else if (!correoValido) {
            String mensajeLog = "Correo incorrecto: 📧.Correo = " + correo;
            LOG.info(mensajeLog);
            System.out.println(mensajeLog);
        } else if (!passCorrecta) {
            String mensajeLog = "Contraseña incorrecta para el correo: 📧.Correo = " + correo + ", Contraseña = " + pass;
            LOG.info(mensajeLog);
            System.out.println(mensajeLog);
        }
    }
} catch (Exception e) {
    System.out.println("Ocurrió un error en la lógica");
    e.printStackTrace(); // Imprimir el stack trace del error
    LOG.error("Ocurrió un error en la lógica", e);
} finally {
    System.out.println("Finalizando...");
   
}  
        
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if (!txtusuario.getText().isEmpty() || txtcontrasena.getPassword().length > 0) {
        txtusuario.setText("");
        txtcontrasena.setText("");
        setPlaceholderText();
        }
    }//GEN-LAST:event_btnCancelarMouseClicked
    
    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if (txtusuario.getText().equals("Ingrese su Usuario")){
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if (String.valueOf(txtcontrasena.getPassword()).isEmpty()){
            txtcontrasena.setText("Password");
            txtcontrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void txtcontrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontrasenaMousePressed
        if (String.valueOf(txtcontrasena.getPassword()).equals("Password")){
            txtcontrasena.setText("");
            txtcontrasena.setForeground(Color.black);
        }
        if (txtusuario.getText().isEmpty()){
            txtusuario.setText("Ingrese su Usuario");
            txtusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcontrasenaMousePressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void lblGenerarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerarClaveMouseClicked
        generarYMostrarClave();
    }//GEN-LAST:event_lblGenerarClaveMouseClicked

    private void jLverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLverMouseClicked
        ver.setVisible(false);
        esconder.setVisible(true);
        txtcontrasena.setEchoChar((char)0);
    }//GEN-LAST:event_jLverMouseClicked

    private void jLesconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLesconderMouseClicked
        ver.setVisible(true);
        esconder.setVisible(false);
        txtcontrasena.setEchoChar('*');
    }//GEN-LAST:event_jLesconderMouseClicked

    private void generarYMostrarClave() {
    claveGenerada = generarClaveAleatoria();
    lblClaveGenerada.setText("Clave generada: " + claveGenerada);
    // Copiar la clave generada al portapapeles
    StringSelection stringSelection = new StringSelection(claveGenerada);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    JOptionPane.showMessageDialog(null, "Clave generada: " + claveGenerada + "\nSe ha copiado al portapapeles.");
}

    
    public static void main(String args[]) {
        /*
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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmlogin().setVisible(true);
        });
    }
    private String generarClaveAleatoria() {
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz#?!%ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitudClave = 8;
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longitudClave);

        for (int i = 0; i < longitudClave; i++) {
            int indiceCaracter = random.nextInt(caracteresPermitidos.length());
            char caracter = caracteresPermitidos.charAt(indiceCaracter);
            sb.append(caracter);
        }

        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLesconder;
    private javax.swing.JLabel jLlogo;
    private javax.swing.JLabel jLver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblGenerarClave;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
