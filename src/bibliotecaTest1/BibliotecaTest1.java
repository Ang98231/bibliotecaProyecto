/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bibliotecaTest1;


import com.biblioteca.views.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class BibliotecaTest1 extends javax.swing.JFrame {
    private Biblioteca biblioteca;
    private int xMouse, yMouse;
    
    public BibliotecaTest1() {
        this.biblioteca = new Biblioteca("Libros", "Socios");
        initComponents();
        setDate();
        initContent(this.biblioteca);
    }
    private void setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es","ES");
        fechaTxt.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy",spanishLocale)));
    }
    private void initContent(Biblioteca b){
        showJPanel(new Principal(this.biblioteca));
    }
    
    private void showJPanel(JPanel p){
        p.setSize(830,420);
        p.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barraHorizontal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JLabel();
        barraLateral = new javax.swing.JPanel();
        tituloPanel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paginaPriP = new javax.swing.JPanel();
        paginaPrTxt = new javax.swing.JLabel();
        prestamoPanel = new javax.swing.JPanel();
        pretamoTxt = new javax.swing.JLabel();
        devolucionPanel = new javax.swing.JPanel();
        devolucionTxt = new javax.swing.JLabel();
        usuariosPanel = new javax.swing.JPanel();
        usuariosTxt = new javax.swing.JLabel();
        librosPanel = new javax.swing.JPanel();
        librosTxt = new javax.swing.JLabel();
        reportePanel = new javax.swing.JPanel();
        reporteTxt = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 640));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraHorizontal.setBackground(new java.awt.Color(224, 224, 224));
        barraHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 59, 92));
        jLabel2.setText("Administración/Biblioteca");
        barraHorizontal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 23, 330, 40));

        fechaTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fechaTxt.setText("Fecha");
        barraHorizontal.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 69, 700, 50));

        background.add(barraHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 830, 130));

        barraLateral.setBackground(new java.awt.Color(0, 60, 94));
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPanel.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(255, 255, 255));
        tituloPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPanel.setText("Biblioteca");
        barraLateral.add(tituloPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 145, 27));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        barraLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 83, 120, 10));

        paginaPriP.setBackground(new java.awt.Color(22, 95, 128));

        paginaPrTxt.setBackground(new java.awt.Color(22, 98, 128));
        paginaPrTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paginaPrTxt.setForeground(new java.awt.Color(255, 255, 255));
        paginaPrTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paginaPrTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-outline.png"))); // NOI18N
        paginaPrTxt.setText(" Pagina Principal");
        paginaPrTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paginaPrTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paginaPrTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paginaPrTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paginaPrTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paginaPriPLayout = new javax.swing.GroupLayout(paginaPriP);
        paginaPriP.setLayout(paginaPriPLayout);
        paginaPriPLayout.setHorizontalGroup(
            paginaPriPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaPriPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paginaPrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paginaPriPLayout.setVerticalGroup(
            paginaPriPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaPriPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paginaPrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barraLateral.add(paginaPriP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 260, 60));

        prestamoPanel.setBackground(new java.awt.Color(22, 95, 128));

        pretamoTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pretamoTxt.setForeground(new java.awt.Color(255, 255, 255));
        pretamoTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pretamoTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-plus.png"))); // NOI18N
        pretamoTxt.setText(" Prestamos");
        pretamoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pretamoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pretamoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pretamoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pretamoTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout prestamoPanelLayout = new javax.swing.GroupLayout(prestamoPanel);
        prestamoPanel.setLayout(prestamoPanelLayout);
        prestamoPanelLayout.setHorizontalGroup(
            prestamoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pretamoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        prestamoPanelLayout.setVerticalGroup(
            prestamoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pretamoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        barraLateral.add(prestamoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 60));

        devolucionPanel.setBackground(new java.awt.Color(22, 95, 128));

        devolucionTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        devolucionTxt.setForeground(new java.awt.Color(255, 255, 255));
        devolucionTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        devolucionTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-multiple-check.png"))); // NOI18N
        devolucionTxt.setText(" Devoluciones");
        devolucionTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolucionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucionTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devolucionTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devolucionTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout devolucionPanelLayout = new javax.swing.GroupLayout(devolucionPanel);
        devolucionPanel.setLayout(devolucionPanelLayout);
        devolucionPanelLayout.setHorizontalGroup(
            devolucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(devolucionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        devolucionPanelLayout.setVerticalGroup(
            devolucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(devolucionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        barraLateral.add(devolucionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 60));

        usuariosPanel.setBackground(new java.awt.Color(22, 95, 128));

        usuariosTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuariosTxt.setForeground(new java.awt.Color(255, 255, 255));
        usuariosTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuariosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account-multiple.png"))); // NOI18N
        usuariosTxt.setText(" Usuarios");
        usuariosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuariosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuariosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuariosTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout usuariosPanelLayout = new javax.swing.GroupLayout(usuariosPanel);
        usuariosPanel.setLayout(usuariosPanelLayout);
        usuariosPanelLayout.setHorizontalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addComponent(usuariosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        barraLateral.add(usuariosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 260, 60));

        librosPanel.setBackground(new java.awt.Color(22, 95, 128));

        librosTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        librosTxt.setForeground(new java.awt.Color(255, 255, 255));
        librosTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        librosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book-open-page-variant.png"))); // NOI18N
        librosTxt.setText(" Libros");
        librosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        librosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                librosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                librosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                librosTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout librosPanelLayout = new javax.swing.GroupLayout(librosPanel);
        librosPanel.setLayout(librosPanelLayout);
        librosPanelLayout.setHorizontalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, librosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(librosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        librosPanelLayout.setVerticalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosPanelLayout.createSequentialGroup()
                .addComponent(librosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        barraLateral.add(librosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, 60));

        reportePanel.setBackground(new java.awt.Color(22, 95, 128));

        reporteTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        reporteTxt.setForeground(new java.awt.Color(255, 255, 255));
        reporteTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reporteTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file-chart.png"))); // NOI18N
        reporteTxt.setText(" Reporte");
        reporteTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reporteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reporteTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reporteTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout reportePanelLayout = new javax.swing.GroupLayout(reportePanel);
        reportePanel.setLayout(reportePanelLayout);
        reportePanelLayout.setHorizontalGroup(
            reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportePanelLayout.setVerticalGroup(
            reportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraLateral.add(reportePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 60));

        background.add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        background.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 830, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void paginaPrTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaPrTxtMouseEntered
        paginaPriP.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_paginaPrTxtMouseEntered

    private void paginaPrTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaPrTxtMouseExited
        paginaPriP.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_paginaPrTxtMouseExited

    private void pretamoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pretamoTxtMouseEntered
        prestamoPanel.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_pretamoTxtMouseEntered

    private void pretamoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pretamoTxtMouseExited
        prestamoPanel.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_pretamoTxtMouseExited

    private void devolucionTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionTxtMouseEntered
        devolucionPanel.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_devolucionTxtMouseEntered

    private void devolucionTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionTxtMouseExited
        devolucionPanel.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_devolucionTxtMouseExited

    private void usuariosTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTxtMouseEntered
       usuariosPanel.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_usuariosTxtMouseEntered

    private void usuariosTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTxtMouseExited
        usuariosPanel.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_usuariosTxtMouseExited

    private void librosTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosTxtMouseEntered
        librosPanel.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_librosTxtMouseEntered

    private void librosTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosTxtMouseExited
       librosPanel.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_librosTxtMouseExited

    private void reporteTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTxtMouseEntered
        reportePanel.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_reporteTxtMouseEntered

    private void reporteTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTxtMouseExited
        reportePanel.setBackground(new Color(22,95,128));
    }//GEN-LAST:event_reporteTxtMouseExited

    private void paginaPrTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaPrTxtMouseClicked
        showJPanel(new Principal(this.biblioteca));
    }//GEN-LAST:event_paginaPrTxtMouseClicked

    private void pretamoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pretamoTxtMouseClicked
        showJPanel(new Prestamos(this.biblioteca));
    }//GEN-LAST:event_pretamoTxtMouseClicked

    private void devolucionTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionTxtMouseClicked
        showJPanel(new Devoluciones(this.biblioteca));
    }//GEN-LAST:event_devolucionTxtMouseClicked

    private void librosTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosTxtMouseClicked
        showJPanel(new Libros(this.biblioteca));
    }//GEN-LAST:event_librosTxtMouseClicked

    private void usuariosTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTxtMouseClicked
        showJPanel(new Socios(this.biblioteca));
    }//GEN-LAST:event_usuariosTxtMouseClicked

    private void reporteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTxtMouseClicked
        // TODO add your handling code here:
        showJPanel(new Reportes(this.biblioteca));
    }//GEN-LAST:event_reporteTxtMouseClicked

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
            java.util.logging.Logger.getLogger(BibliotecaTest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaTest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaTest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaTest1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaTest1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraHorizontal;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel devolucionPanel;
    private javax.swing.JLabel devolucionTxt;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel librosPanel;
    private javax.swing.JLabel librosTxt;
    private javax.swing.JLabel paginaPrTxt;
    private javax.swing.JPanel paginaPriP;
    private javax.swing.JPanel prestamoPanel;
    private javax.swing.JLabel pretamoTxt;
    private javax.swing.JPanel reportePanel;
    private javax.swing.JLabel reporteTxt;
    private javax.swing.JLabel tituloPanel;
    private javax.swing.JPanel usuariosPanel;
    private javax.swing.JLabel usuariosTxt;
    // End of variables declaration//GEN-END:variables
}
