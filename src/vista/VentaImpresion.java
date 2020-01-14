/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Estadistica;

/**
 *
 * @author Diego Cale Pillco
 */
public class VentaImpresion extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form VentaImpresion
     */
    Estadistica grafica;

    public VentaImpresion(VentanaEstadistica ventana, Estadistica g) {
        initComponents();
        this.grafica = g;
        grafica.graficar(false);
        this.grafica.fijarPanel(panelPrint);
        lblLista1.setText(ventana.getLblLista1().getText());
        lblLista2.setText(ventana.getLblLista2().getText());
        lblVotosNulos.setText(ventana.getLblVotosNulos().getText());
        txtDate.setText(obtenerFecha());
        lblTotalSufragantes.setText(grafica.obtenerTotalVotos()+"");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelReflect1 = new org.edisoncor.gui.panel.PanelReflect();
        panelChart = new org.edisoncor.gui.panel.PanelRect();
        panelImpresion = new org.edisoncor.gui.panel.PanelRect();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelPrint = new org.edisoncor.gui.panel.PanelRect();
        jLabel6 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        lblLista2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        lblLista1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        lblVotosNulos = new javax.swing.JLabel();
        lblTotalSufragantes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bttExit = new org.edisoncor.gui.button.ButtonIcon();
        bttImprimir = new org.edisoncor.gui.button.ButtonIcon();

        javax.swing.GroupLayout panelReflect1Layout = new javax.swing.GroupLayout(panelReflect1);
        panelReflect1.setLayout(panelReflect1Layout);
        panelReflect1Layout.setHorizontalGroup(
            panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelReflect1Layout.setVerticalGroup(
            panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImpresion.setForeground(new java.awt.Color(255, 255, 255));
        panelImpresion.setColorDeBorde(new java.awt.Color(0, 0, 204));
        panelImpresion.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelImpresion.setColorSecundario(new java.awt.Color(255, 255, 255));
        panelImpresion.setPreferredSize(new java.awt.Dimension(595, 842));
        panelImpresion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1995.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panelImpresion.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Instituto Tecnológico Superior Limón");
        panelImpresion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("\"Decide ser un profesional de éxito\"");
        panelImpresion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoSenescyt.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        panelImpresion.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, 110));

        panelPrint.setColorDeBorde(new java.awt.Color(0, 0, 204));
        panelPrint.setColorPrimario(new java.awt.Color(0, 0, 153));
        panelPrint.setColorSecundario(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panelPrintLayout = new javax.swing.GroupLayout(panelPrint);
        panelPrint.setLayout(panelPrintLayout);
        panelPrintLayout.setHorizontalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelPrintLayout.setVerticalGroup(
            panelPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        panelImpresion.add(panelPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 500, 270));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("JUVENTUD ACTIVA PROGRESISTA \"JAP\"");
        panelImpresion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 300, -1));

        panelImage4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        lblLista2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLista2.setText("0");

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblLista2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblLista2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelImpresion.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 90, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CONSEJO ESTUDIANTIL POR EL BIEN COMUN “CEBC”");
        panelImpresion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        panelImage5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        lblLista1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLista1.setText("0");

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLista1)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lblLista1)
                .addGap(27, 27, 27))
        );

        panelImpresion.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 90, 90));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Votos Nulos:");
        panelImpresion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total Sufragantes:");
        panelImpresion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/JAP.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelImpresion.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 90, 100));

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CEBC.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelImpresion.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 100));

        lblVotosNulos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVotosNulos.setText("0");
        panelImpresion.add(lblVotosNulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 40, -1));

        lblTotalSufragantes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalSufragantes.setText("0");
        panelImpresion.add(lblTotalSufragantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        jLabel8.setText("Docente:  Ing. Diego Cale");
        panelImpresion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, 500, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        txtFecha.setText("Reporte del Systema de Votación Electrónico Desarrollado por: Sexto de Análisis de Sistemas periodo Noviembre 2017-Abril 2018");
        panelImpresion.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 500, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtDate.setText("---------------");
        panelImpresion.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, 110, -1));

        getContentPane().add(panelImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 567, 770));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        bttExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        bttExit.setText("buttonIcon1");
        bttExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExitActionPerformed(evt);
            }
        });

        bttImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imprimir.png"))); // NOI18N
        bttImprimir.setText("buttonIcon1");
        bttImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(bttImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bttExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 80, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttImprimirActionPerformed
        // TODO add your handling code here:
        try {
            PrinterJob imp = PrinterJob.getPrinterJob();
            imp.setPrintable(this);
            boolean top = imp.printDialog();
            if (top) {
                imp.print();
            }
        } catch (HeadlessException | PrinterException e) {
            JOptionPane.showMessageDialog(null, "Problemas en la Impresión" + e.getMessage());
        }
    }//GEN-LAST:event_bttImprimirActionPerformed

    private void bttExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExitActionPerformed
        dispose();
    }//GEN-LAST:event_bttExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon bttExit;
    private org.edisoncor.gui.button.ButtonIcon bttImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLista1;
    private javax.swing.JLabel lblLista2;
    private javax.swing.JLabel lblTotalSufragantes;
    private javax.swing.JLabel lblVotosNulos;
    private org.edisoncor.gui.panel.PanelRect panelChart;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelRect panelImpresion;
    private org.edisoncor.gui.panel.PanelRect panelPrint;
    private org.edisoncor.gui.panel.PanelReflect panelReflect1;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g = (Graphics2D) graphics;
        g.translate(pageFormat.getImageableX() + 10, pageFormat.getImageableY() + 10);
        g.scale(1.0, 1.0);
        panelImpresion.printAll(graphics);
        return PAGE_EXISTS;
    }

    public String obtenerFecha(){
        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
        Date f = new Date();
        return dt.format(f);
    }
}