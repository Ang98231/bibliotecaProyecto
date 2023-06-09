/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.biblioteca.views;

import bibliotecaTest1.*;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author angel
 */
public class Devoluciones extends javax.swing.JPanel {
    private final Biblioteca biblioteca;

    /**
     * Creates new form Prestamos
     */
    public Devoluciones(Biblioteca b) {
        initComponents();
        this.biblioteca=b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        libroTxt = new javax.swing.JTextField();
        socioTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prestamoB = new javax.swing.JPanel();
        prestamo = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        fechaTxt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(830, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Libro");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 38));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Devolución");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 230, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 196, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Socio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 38));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 196, 10));

        libroTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        libroTxt.setForeground(new java.awt.Color(204, 204, 204));
        libroTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        libroTxt.setText("Ingrese el codigo del libro");
        libroTxt.setBorder(null);
        libroTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                libroTxtFocusLost(evt);
            }
        });
        libroTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libroTxtMouseClicked(evt);
            }
        });
        jPanel1.add(libroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 196, 30));

        socioTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        socioTxt.setForeground(new java.awt.Color(204, 204, 204));
        socioTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        socioTxt.setText("Ingrese su numero de socio");
        socioTxt.setBorder(null);
        socioTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                socioTxtFocusLost(evt);
            }
        });
        socioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socioTxtMouseClicked(evt);
            }
        });
        jPanel1.add(socioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 196, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pag.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 210, 180));

        prestamoB.setBackground(new java.awt.Color(0, 60, 94));

        prestamo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        prestamo.setForeground(new java.awt.Color(255, 255, 255));
        prestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prestamo.setText("Devolución");
        prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout prestamoBLayout = new javax.swing.GroupLayout(prestamoB);
        prestamoB.setLayout(prestamoBLayout);
        prestamoBLayout.setHorizontalGroup(
            prestamoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prestamoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        prestamoBLayout.setVerticalGroup(
            prestamoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prestamoBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(prestamoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 50));

        fecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Fecha");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, 38));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, 20));

        fechaTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(204, 204, 204));
        fechaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaTxt.setText("Ingrese la fecha dd-mm-yyyy");
        fechaTxt.setBorder(null);
        fechaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaTxtFocusLost(evt);
            }
        });
        fechaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaTxtMouseClicked(evt);
            }
        });
        fechaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 196, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void libroTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_libroTxtFocusLost
        if(libroTxt.getText().equals("Ingrese el codigo del libro")){
            libroTxt.setText("");
            libroTxt.setForeground(Color.black);
        }
        if(socioTxt.getText().isEmpty()){
            socioTxt.setText("Ingrese su numero de socio");
            socioTxt.setForeground(Color.gray);
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_libroTxtFocusLost

    private void socioTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_socioTxtFocusLost
        if(socioTxt.getText().equals("Ingrese su numero de socio")){
            socioTxt.setText("");
            socioTxt.setForeground(Color.black);
        }
        if(libroTxt.getText().isEmpty()){
            libroTxt.setText("Ingrese el codigo del libro");
            libroTxt.setForeground(Color.gray);
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_socioTxtFocusLost

    private void prestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamoMouseEntered
        prestamoB.setBackground(new Color(31,128,173));
    }//GEN-LAST:event_prestamoMouseEntered

    private void prestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamoMouseExited
        prestamoB.setBackground(new Color(0,60,94));
    }//GEN-LAST:event_prestamoMouseExited

    private void fechaTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaTxtFocusLost
        if(fechaTxt.getText().equals("Ingrese la fecha \"dd-mm-yyyy\"")){
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.black);
        }
        if(socioTxt.getText().isEmpty()){
            socioTxt.setText("Ingrese su numero de socio");
            socioTxt.setForeground(Color.gray);
            libroTxt.setText("");
            libroTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fechaTxtFocusLost

    private void prestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamoMouseClicked
        try{                                      
            int libro = Integer.parseInt(libroTxt.getText());
            Libro libroBuscado;
            libroBuscado = biblioteca.buscarLibro(libro);
            int socio = Integer.parseInt(socioTxt.getText());
            Socio socioB;
            socioB = biblioteca.socioBuscado(socio);
            String fecha = fechaTxt.getText();
            if(libroBuscado.isDisponibilidad()==false){
            try{
                this.biblioteca.devolverLibro(libro, socio, fecha);
                javax.swing.JOptionPane.showMessageDialog(this,"Prestamo exitoso\nLibro: "+libroBuscado.getTitulo()+"\nSocio: "+socioB.getNombreSocio(),"PRESTAMO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
            }
            }else{
                javax.swing.JOptionPane.showMessageDialog(this,"No hay registro de prestamo del libro","ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }catch(ELibroNoEncontrado ex){
            javax.swing.JOptionPane.showMessageDialog(this,"El libro no se encuentra\nregistrado en el sistema","ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (ESocioNoEncontrado ex) {
            javax.swing.JOptionPane.showMessageDialog(this,"El socio no se encuentra\nregistrado en el sistema","ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);

        }
        socioTxt.setText((""));
        fechaTxt.setText("");
        libroTxt.setText("");
    }//GEN-LAST:event_prestamoMouseClicked

    private void socioTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socioTxtMouseClicked
        if(socioTxt.getText().equals("Ingrese su numero de socio")){
            socioTxt.setText("");
            socioTxt.setForeground(Color.black);
        }
        if(libroTxt.getText().isEmpty()){
            libroTxt.setText("Ingrese el codigo del libro");
            libroTxt.setForeground(Color.gray);
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_socioTxtMouseClicked

    private void libroTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libroTxtMouseClicked
        if(libroTxt.getText().equals("Ingrese el codigo del libro")){
            libroTxt.setText("");
            libroTxt.setForeground(Color.black);
        }
        if(socioTxt.getText().isEmpty()){
            socioTxt.setText("Ingrese su numero de socio");
            socioTxt.setForeground(Color.gray);
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_libroTxtMouseClicked

    private void fechaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTxtActionPerformed

    private void fechaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaTxtMouseClicked
        if(fechaTxt.getText().equals("Ingrese la fecha dd-mm-yyyy")){
            fechaTxt.setText("");
            fechaTxt.setForeground(Color.black);
        }
        if(socioTxt.getText().isEmpty()){
            socioTxt.setText("Ingrese su numero de socio");
            socioTxt.setForeground(Color.gray);
            libroTxt.setText("Ingrese el codigo del libro");
            libroTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fechaTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField libroTxt;
    private javax.swing.JLabel prestamo;
    private javax.swing.JPanel prestamoB;
    private javax.swing.JTextField socioTxt;
    // End of variables declaration//GEN-END:variables
}
