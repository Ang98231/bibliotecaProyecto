/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.biblioteca.views;

import bibliotecaTest1.Biblioteca;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class Reportes extends javax.swing.JPanel {
    private final Biblioteca biblioteca;
    /**
     * Creates new form Reportes
     */
    public Reportes(Biblioteca b) {
        initComponents();
        this.biblioteca = b;
    }
    
    private void initContenido(Biblioteca b){
        showJPanel(new Principal(this.biblioteca));
    }

    
     private void showJPanel(JPanel p){
        p.setSize(830,420);
        p.setLocation(0,0);
        
        panelContenido.removeAll();
        panelContenido.add(p, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
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
        jPanel3 = new javax.swing.JPanel();
        librosPanel = new javax.swing.JPanel();
        libros = new javax.swing.JLabel();
        sociosPanel = new javax.swing.JPanel();
        socios = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        background.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 60, 94));

        librosPanel.setBackground(new java.awt.Color(0, 60, 94));
        librosPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                librosPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                librosPanelMouseExited(evt);
            }
        });

        libros.setBackground(new java.awt.Color(0, 60, 94));
        libros.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        libros.setForeground(new java.awt.Color(255, 255, 255));
        libros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libros.setText("LIBROS");

        javax.swing.GroupLayout librosPanelLayout = new javax.swing.GroupLayout(librosPanel);
        librosPanel.setLayout(librosPanelLayout);
        librosPanelLayout.setHorizontalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(libros, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        librosPanelLayout.setVerticalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosPanelLayout.createSequentialGroup()
                .addComponent(libros, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sociosPanel.setBackground(new java.awt.Color(0, 60, 94));
        sociosPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sociosPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sociosPanelMouseExited(evt);
            }
        });

        socios.setBackground(new java.awt.Color(0, 60, 94));
        socios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        socios.setForeground(new java.awt.Color(255, 255, 255));
        socios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socios.setText("SOCIOS");

        javax.swing.GroupLayout sociosPanelLayout = new javax.swing.GroupLayout(sociosPanel);
        sociosPanel.setLayout(sociosPanelLayout);
        sociosPanelLayout.setHorizontalGroup(
            sociosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(socios, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        sociosPanelLayout.setVerticalGroup(
            sociosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(socios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(librosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(sociosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(librosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sociosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void librosPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosPanelMouseEntered
        librosPanel.setBackground(new Color(22,98,128));
    }//GEN-LAST:event_librosPanelMouseEntered

    private void librosPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librosPanelMouseExited
        // TODO add your handling code here:
        librosPanel.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_librosPanelMouseExited

    private void sociosPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sociosPanelMouseEntered
        // TODO add your handling code here:
        sociosPanel.setBackground(new Color(22,98,128));
    }//GEN-LAST:event_sociosPanelMouseEntered

    private void sociosPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sociosPanelMouseExited
        // TODO add your handling code here:
        sociosPanel.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_sociosPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel libros;
    private javax.swing.JPanel librosPanel;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JLabel socios;
    private javax.swing.JPanel sociosPanel;
    // End of variables declaration//GEN-END:variables
}