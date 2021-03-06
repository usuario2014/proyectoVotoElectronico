/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Estadistica;

/**
 *
 * @author Diego Cale Pillco
 */
public class VentanaEstadistica extends javax.swing.JFrame {

    Estadistica grafica;

    public VentanaEstadistica() {
        initComponents();
        grafica = new Estadistica();
        grafica.obtenerVotos();
        grafica.graficar(true);
        grafica.obtenerVotosNulos();
        grafica.fijarPanel(panelChart);
        System.out.println(grafica.getVotol1()+"_____"+grafica.getVotol2());
        lblLista1.setText(grafica.getVotol1() + "");
        lblLista2.setText(grafica.getVotol2() + "");
        lblVotosNulos.setText(grafica.getVotoNulo() + "");
        setLocationRelativeTo(null);
        this.setExtendedState(AdministracionModulos.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new org.edisoncor.gui.panel.PanelRect();
        jLabel1 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        bttExit = new org.edisoncor.gui.button.ButtonIcon();
        panelChart = new org.edisoncor.gui.panel.PanelRect();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        bttCragarDatos = new org.edisoncor.gui.button.ButtonIcon();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        penelImpresion = new org.edisoncor.gui.panel.PanelRect();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        lblLista2 = new javax.swing.JLabel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        lblLista1 = new javax.swing.JLabel();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        lblVotosNulos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttImprimir = new org.edisoncor.gui.button.ButtonIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setColorDeBorde(new java.awt.Color(255, 255, 204));
        panelPrincipal.setColorPrimario(new java.awt.Color(0, 0, 204));
        panelPrincipal.setColorSecundario(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados Estadísticos ITSL");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1995.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        bttExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        bttExit.setText("buttonIcon1");
        bttExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExitActionPerformed(evt);
            }
        });

        panelChart.setColorDeBorde(new java.awt.Color(0, 0, 204));
        panelChart.setColorPrimario(new java.awt.Color(0, 0, 153));
        panelChart.setColorSecundario(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panelChartLayout = new javax.swing.GroupLayout(panelChart);
        panelChart.setLayout(panelChartLayout);
        panelChartLayout.setHorizontalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panelChartLayout.setVerticalGroup(
            panelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JAP.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CEBC.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        bttCragarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pers1.png"))); // NOI18N
        bttCragarDatos.setText("buttonIcon1");
        bttCragarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCragarDatosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Lista 1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Lista 2:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("JUVENTUD ACTIVA PROGRESISTA \"JAP\"");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONSEJO ESTUDIANTIL POR EL BIEN COMUN “CEBC”");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setText("NÚMERO DE VOTOS");

        penelImpresion.setColorDeBorde(new java.awt.Color(0, 0, 204));
        penelImpresion.setColorPrimario(new java.awt.Color(0, 0, 153));
        penelImpresion.setColorSecundario(new java.awt.Color(255, 204, 204));

        panelImage4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblLista2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLista2.setText("0");

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblLista2)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblLista2)
                .addContainerGap())
        );

        panelImage5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblLista1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLista1.setText("0");

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblLista1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblLista1)
                .addContainerGap())
        );

        panelImage6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblVotosNulos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblVotosNulos.setText("0");

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblVotosNulos)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("VOTOS NULOS:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("LISTA 1:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("LISTA 2:");

        javax.swing.GroupLayout penelImpresionLayout = new javax.swing.GroupLayout(penelImpresion);
        penelImpresion.setLayout(penelImpresionLayout);
        penelImpresionLayout.setHorizontalGroup(
            penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelImpresionLayout.createSequentialGroup()
                .addGroup(penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penelImpresionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89))
                    .addGroup(penelImpresionLayout.createSequentialGroup()
                        .addGroup(penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(penelImpresionLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9))
                            .addGroup(penelImpresionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)))
                .addGroup(penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImage5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        penelImpresionLayout.setVerticalGroup(
            penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelImpresionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(penelImpresionLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel6))
                    .addGroup(penelImpresionLayout.createSequentialGroup()
                        .addComponent(panelImage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(penelImpresionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        bttImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        bttImprimir.setText("buttonIcon1");
        bttImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(penelImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttCragarDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259)
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(bttCragarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bttImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bttExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penelImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttCragarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCragarDatosActionPerformed
        grafica.obtenerVotos();
        grafica.graficar(true);
        grafica.obtenerVotosNulos();
        grafica.fijarPanel(panelChart);
        limpiarCampos();
        lblLista1.setText(grafica.getVotol1() + "");
        lblLista2.setText(grafica.getVotol2() + "");
        lblVotosNulos.setText(grafica.getVotoNulo() + "");

    }//GEN-LAST:event_bttCragarDatosActionPerformed

    private void bttExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bttExitActionPerformed
    VentaImpresion vimp;
    private void bttImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttImprimirActionPerformed
        // TODO add your handling code here:
        if (vimp == null) {
            vimp = new VentaImpresion(this, grafica);
            vimp.setVisible(true);
        } else {
            vimp.setVisible(true);
        }
    }//GEN-LAST:event_bttImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon bttCragarDatos;
    private org.edisoncor.gui.button.ButtonIcon bttExit;
    private org.edisoncor.gui.button.ButtonIcon bttImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLista1;
    private javax.swing.JLabel lblLista2;
    private javax.swing.JLabel lblVotosNulos;
    private org.edisoncor.gui.panel.PanelRect panelChart;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelRect panelPrincipal;
    private org.edisoncor.gui.panel.PanelRect penelImpresion;
    // End of variables declaration//GEN-END:variables


    public void limpiarCampos() {
        System.out.println("Limpiar");
        lblLista1.removeAll();
        lblLista2.removeAll();
        lblVotosNulos.removeAll();
    }

    public javax.swing.JLabel getLblLista1() {
        return lblLista1;
    }

    public void setLblLista1(javax.swing.JLabel lblLista1) {
        this.lblLista1 = lblLista1;
    }

    public javax.swing.JLabel getLblLista2() {
        return lblLista2;
    }

    public void setLblLista2(javax.swing.JLabel lblLista2) {
        this.lblLista2 = lblLista2;
    }

    public javax.swing.JLabel getLblVotosNulos() {
        return lblVotosNulos;
    }

    public void setLblVotosNulos(javax.swing.JLabel lblVotosNulos) {
        this.lblVotosNulos = lblVotosNulos;
    }

}
