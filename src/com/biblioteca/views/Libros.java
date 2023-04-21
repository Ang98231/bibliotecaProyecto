/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.biblioteca.views;

import bibliotecaTest1.*;
import java.awt.BorderLayout;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class Libros extends javax.swing.JPanel {
    private final Biblioteca biblioteca;

    /**
     * Creates new form Libros
     */
    public Libros(Biblioteca bi) {
        initComponents();
        this.biblioteca=bi;
    }
    
   /* private void initContenido(Biblioteca b){
        showJPanel(new AniadirLibro(this.b));
    }
    
    private void showJPanel(JPanel p){
        p.setSize(830,420);
        p.setLocation(0,0);
        
        contenidoVista.removeAll();
        contenidoVista.add(p,BorderLayout.CENTER);
        contenidoVista.revalidate();
        contenidoVista.repaint();
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        optionPane = new javax.swing.JPanel();
        aniadirPanel = new javax.swing.JPanel();
        aniadir = new javax.swing.JLabel();
        modificarPanel = new javax.swing.JPanel();
        modificar = new javax.swing.JLabel();
        eliminarPanel = new javax.swing.JPanel();
        eliminar = new javax.swing.JLabel();
        buscarPanel = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        contenidoVista = new javax.swing.JPanel();
        tituloTxt = new javax.swing.JTextField();
        autorTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        seccionTxt = new javax.swing.JTextField();
        nivelTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        background.setBackground(new java.awt.Color(255, 255, 255));

        optionPane.setBackground(new java.awt.Color(0, 60, 94));

        aniadirPanel.setBackground(new java.awt.Color(0, 60, 94));

        aniadir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        aniadir.setForeground(new java.awt.Color(255, 255, 255));
        aniadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aniadir.setText("AÑADIR");
        aniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aniadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aniadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aniadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aniadirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout aniadirPanelLayout = new javax.swing.GroupLayout(aniadirPanel);
        aniadirPanel.setLayout(aniadirPanelLayout);
        aniadirPanelLayout.setHorizontalGroup(
            aniadirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aniadirPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        aniadirPanelLayout.setVerticalGroup(
            aniadirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aniadir, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        modificarPanel.setBackground(new java.awt.Color(0, 60, 94));
        modificarPanel.setPreferredSize(new java.awt.Dimension(100, 45));

        modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setText("MODIFICAR");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modificarPanelLayout = new javax.swing.GroupLayout(modificarPanel);
        modificarPanel.setLayout(modificarPanelLayout);
        modificarPanelLayout.setHorizontalGroup(
            modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        modificarPanelLayout.setVerticalGroup(
            modificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        eliminarPanel.setBackground(new java.awt.Color(0, 60, 94));
        eliminarPanel.setPreferredSize(new java.awt.Dimension(100, 45));

        eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminar.setText("ELIMINAR");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarPanelLayout = new javax.swing.GroupLayout(eliminarPanel);
        eliminarPanel.setLayout(eliminarPanelLayout);
        eliminarPanelLayout.setHorizontalGroup(
            eliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        eliminarPanelLayout.setVerticalGroup(
            eliminarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        buscarPanel.setBackground(new java.awt.Color(0, 60, 94));
        buscarPanel.setPreferredSize(new java.awt.Dimension(100, 45));

        buscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar.setText("BUSCAR");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarPanelLayout = new javax.swing.GroupLayout(buscarPanel);
        buscarPanel.setLayout(buscarPanelLayout);
        buscarPanelLayout.setHorizontalGroup(
            buscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        buscarPanelLayout.setVerticalGroup(
            buscarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout optionPaneLayout = new javax.swing.GroupLayout(optionPane);
        optionPane.setLayout(optionPaneLayout);
        optionPaneLayout.setHorizontalGroup(
            optionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aniadirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        optionPaneLayout.setVerticalGroup(
            optionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPaneLayout.createSequentialGroup()
                .addGroup(optionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aniadirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenidoVista.setBackground(new java.awt.Color(255, 255, 255));

        tituloTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(204, 204, 204));
        tituloTxt.setText("Ingrese el titulo");
        tituloTxt.setBorder(null);

        autorTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        autorTxt.setForeground(new java.awt.Color(204, 204, 204));
        autorTxt.setText("Ingrese el autor");
        autorTxt.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Autor");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sección");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nivel");

        seccionTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        seccionTxt.setForeground(new java.awt.Color(204, 204, 204));
        seccionTxt.setText("Ingrese la sección");
        seccionTxt.setBorder(null);

        nivelTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nivelTxt.setForeground(new java.awt.Color(204, 204, 204));
        nivelTxt.setText("Ingrese el nivel");
        nivelTxt.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contenidoVistaLayout = new javax.swing.GroupLayout(contenidoVista);
        contenidoVista.setLayout(contenidoVistaLayout);
        contenidoVistaLayout.setHorizontalGroup(
            contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoVistaLayout.createSequentialGroup()
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contenidoVistaLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenidoVistaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contenidoVistaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seccionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addGap(150, 150, 150)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nivelTxt)
                    .addComponent(jSeparator4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenidoVistaLayout.setVerticalGroup(
            contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seccionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(nivelTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenidoVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenidoVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(optionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenidoVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aniadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirMouseEntered
        aniadirPanel.setBackground(new Color(22,98,128));
    }//GEN-LAST:event_aniadirMouseEntered

    private void aniadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirMouseExited
        // TODO add your handling code here:
        aniadirPanel.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_aniadirMouseExited

    private void modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseEntered
        // TODO add your handling code here:
        modificarPanel.setBackground(new Color( 22,98,128));
    }//GEN-LAST:event_modificarMouseEntered

    private void modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseExited
        // TODO add your handling code here:
        modificarPanel.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_modificarMouseExited

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
           // TODO add your handling code here:
           eliminarPanel.setBackground(new Color(22,98,128));
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        // TODO add your handling code here:
        eliminarPanel.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_eliminarMouseExited

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_buscarMouseClicked

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        // TODO add your handling code here:
        buscarPanel.setBackground(new Color (22,98,128));
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        // TODO add your handling code here:
        buscarPanel.setBackground(new Color (0,60,94));
    }//GEN-LAST:event_buscarMouseExited

    private void aniadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aniadirMouseClicked
        // TODO add your handling code here:
        biblioteca.agregarLibro(tituloTxt.getText(), autorTxt.getText(), seccionTxt.getText(), nivelTxt.getText());
    }//GEN-LAST:event_aniadirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniadir;
    private javax.swing.JPanel aniadirPanel;
    private javax.swing.JTextField autorTxt;
    private javax.swing.JPanel background;
    private javax.swing.JLabel buscar;
    private javax.swing.JPanel buscarPanel;
    private javax.swing.JPanel contenidoVista;
    private javax.swing.JLabel eliminar;
    private javax.swing.JPanel eliminarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel modificar;
    private javax.swing.JPanel modificarPanel;
    private javax.swing.JTextField nivelTxt;
    private javax.swing.JPanel optionPane;
    private javax.swing.JTextField seccionTxt;
    private javax.swing.JTextField tituloTxt;
    // End of variables declaration//GEN-END:variables
}