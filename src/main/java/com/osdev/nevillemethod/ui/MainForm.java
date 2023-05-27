package com.osdev.nevillemethod.ui;

import java.awt.Color;
import java.awt.Dimension;
import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1den
 */
public class MainForm extends javax.swing.JFrame {

    final private List<JTextField> datosXY;
    private int indice;
    ArrayList<Double> x = new ArrayList<>();
    ArrayList<Double> fx = new ArrayList<>();
    public double p;

    public MainForm() {
        initComponents();
        panel_contenedor.setVisible(false);
        datosXY = new ArrayList<>();
        indice = 0;

    }

    public static double Neville(double[] x, double[] fx, double p) {
        int n = x.length;
        double[][] q = new double[n][n];

        for (int i = 0; i < n; i++) {
            q[i][0] = fx[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                q[i][j] = ((p - x[i - j]) * q[i][j - 1] - (p - x[i]) * q[i - 1][j - 1]) / (x[i] - x[i - j]);
            }
        }

        return q[n - 1][n - 1];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_funcion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_muller = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_datos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel_form = new javax.swing.JPanel();
        btn_calcular = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_resultado = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbl_resultado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calcular Metodo de Neville");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 810, 80));

        sidePanel.setBackground(new java.awt.Color(204, 204, 204));

        btn_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Calculo");

        javax.swing.GroupLayout btn_nuevoLayout = new javax.swing.GroupLayout(btn_nuevo);
        btn_nuevo.setLayout(btn_nuevoLayout);
        btn_nuevoLayout.setHorizontalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_nuevoLayout.setVerticalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btn_funcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Calcular Funcion");

        javax.swing.GroupLayout btn_funcionLayout = new javax.swing.GroupLayout(btn_funcion);
        btn_funcion.setLayout(btn_funcionLayout);
        btn_funcionLayout.setHorizontalGroup(
            btn_funcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_funcionLayout.setVerticalGroup(
            btn_funcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btn_muller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Muller");

        javax.swing.GroupLayout btn_mullerLayout = new javax.swing.GroupLayout(btn_muller);
        btn_muller.setLayout(btn_mullerLayout);
        btn_mullerLayout.setHorizontalGroup(
            btn_mullerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_mullerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_mullerLayout.setVerticalGroup(
            btn_mullerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salir");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_salirLayout = new javax.swing.GroupLayout(btn_salir);
        btn_salir.setLayout(btn_salirLayout);
        btn_salirLayout.setHorizontalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_salirLayout.setVerticalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_funcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_muller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_muller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        jtable_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ));
        jScrollPane1.setViewportView(jtable_datos);

        panel_form.setLayout(new java.awt.GridLayout(0, 2));
        jScrollPane2.setViewportView(panel_form);

        btn_calcular.setText("CALCULAR");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Xn");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("F(x)");

        jbl_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbl_resultado)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RESULTADO");

        javax.swing.GroupLayout panel_resultadoLayout = new javax.swing.GroupLayout(panel_resultado);
        panel_resultado.setLayout(panel_resultadoLayout);
        panel_resultadoLayout.setHorizontalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_resultadoLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_resultadoLayout.setVerticalGroup(
            panel_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_resultadoLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panel_contenedorLayout = new javax.swing.GroupLayout(panel_contenedor);
        panel_contenedor.setLayout(panel_contenedorLayout);
        panel_contenedorLayout.setHorizontalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addComponent(btn_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_contenedorLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_contenedorLayout.setVerticalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenedorLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular)
                    .addComponent(btn_cancelar))
                .addGap(18, 18, 18)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(panel_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseClicked

        x.clear();
        fx.clear();
        indice = 0;
        jbl_resultado.setText("");
        p = 0;

        int grado = Integer.parseInt(JOptionPane.showInputDialog("Inserta el grado: "));
        p = grado;

        if (grado < 2 || grado > 10) {
            JOptionPane.showMessageDialog(null, "El grado debe ser mayor a 1 y menor a 10.");
        } else {
            panel_contenedor.setVisible(true);

            do {
                Double rX = Double.parseDouble(JOptionPane.showInputDialog("Inserta X" + indice + ": "));
                x.add(rX);
                indice++;
                int fxR = indice - 1;
                Double rY = Double.parseDouble(JOptionPane.showInputDialog("Inserta Fx" + fxR + ": "));
                fx.add(rY);
            } while (indice <= grado - 1);

//            do {               
//                JTextField jtextX = new JTextField();
//                panel_form.add(jtextX);
//                datosXY.add(jtextX);                                
//                indice++;
//                int indiceY = indice - 1;
//                String textFieldIdY = "TextField" + indiceY;
//                JTextField jtextY = new JTextField();
//                jtextY.setName(textFieldIdY);
//                jtextY.setSize(200, 200);
//                panel_form.add(jtextY);
//                datosXY.add(jtextY);
//                addTextField(indice);
//
//            } while (indice <= grado - 1);
            panel_contenedor.updateUI();

        }
    }//GEN-LAST:event_btn_nuevoMouseClicked

    public void addTextField(int indice) {
        String textFieldId = "TextField" + indice;
        JTextField jTextX = new JTextField(20);
        jTextX.setName(textFieldId);
    }

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        btn_salir.setBackground(Color.red);
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        btn_salir.setBackground(Color.white);
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        datosXY.clear();
        panel_form.updateUI();
        panel_contenedor.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        System.out.println(x);
        System.out.println(fx);

        if (x.size() <= 0) {
            JOptionPane.showMessageDialog(null, "No ingreso valores, intente de nuevo!.");
        } else {
            double[] doubleArrayX = new double[x.size()];
            for (int i = 0; i < x.size(); i++) {
                doubleArrayX[i] = x.get(i);
            }

            double[] doubleArrayFx = new double[fx.size()];
            for (int i = 0; i < fx.size(); i++) {
                doubleArrayFx[i] = fx.get(i);
            }

            double result = Neville(doubleArrayX, doubleArrayFx, p);

            String resultText = String.valueOf(result);
            jbl_resultado.setText(resultText);
            System.out.println(resultText + result);
        }
    }//GEN-LAST:event_btn_calcularActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JPanel btn_funcion;
    private javax.swing.JPanel btn_muller;
    private javax.swing.JPanel btn_nuevo;
    private javax.swing.JPanel btn_salir;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbl_resultado;
    private javax.swing.JTable jtable_datos;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_form;
    private javax.swing.JPanel panel_resultado;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
