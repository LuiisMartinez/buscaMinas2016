package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUI extends javax.swing.JFrame {

    static String[][] matrizCompleta;
    static String[][] matrizCompleta2;
    public static int CANT_FILAS = 0;
    public static int CANT_COLUMNAS = 0;
    public static int CANT_BOMBAS = 0;
    JButton[][] btnAutoma;

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modoPrincipiante = new javax.swing.JFrame();
        pnlJuegoPricipiante = new javax.swing.JPanel();
        modoRegular = new javax.swing.JFrame();
        pnlJuegoRegular = new javax.swing.JPanel();
        modoAvanzado = new javax.swing.JFrame();
        pnlJuegoAvanzado = new javax.swing.JPanel();
        grupElegirDificultad = new javax.swing.ButtonGroup();
        pnlInicioJuego = new javax.swing.JPanel();
        btnCrearJuego = new javax.swing.JButton();
        opPrincipiante = new javax.swing.JRadioButton();
        opRelugar = new javax.swing.JRadioButton();
        opAvanzado = new javax.swing.JRadioButton();

        javax.swing.GroupLayout pnlJuegoPricipianteLayout = new javax.swing.GroupLayout(pnlJuegoPricipiante);
        pnlJuegoPricipiante.setLayout(pnlJuegoPricipianteLayout);
        pnlJuegoPricipianteLayout.setHorizontalGroup(
            pnlJuegoPricipianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pnlJuegoPricipianteLayout.setVerticalGroup(
            pnlJuegoPricipianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout modoPrincipianteLayout = new javax.swing.GroupLayout(modoPrincipiante.getContentPane());
        modoPrincipiante.getContentPane().setLayout(modoPrincipianteLayout);
        modoPrincipianteLayout.setHorizontalGroup(
            modoPrincipianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoPrincipianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoPricipiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        modoPrincipianteLayout.setVerticalGroup(
            modoPrincipianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoPrincipianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoPricipiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlJuegoRegular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlJuegoRegularLayout = new javax.swing.GroupLayout(pnlJuegoRegular);
        pnlJuegoRegular.setLayout(pnlJuegoRegularLayout);
        pnlJuegoRegularLayout.setHorizontalGroup(
            pnlJuegoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        pnlJuegoRegularLayout.setVerticalGroup(
            pnlJuegoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout modoRegularLayout = new javax.swing.GroupLayout(modoRegular.getContentPane());
        modoRegular.getContentPane().setLayout(modoRegularLayout);
        modoRegularLayout.setHorizontalGroup(
            modoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoRegularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoRegular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        modoRegularLayout.setVerticalGroup(
            modoRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoRegularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoRegular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlJuegoAvanzadoLayout = new javax.swing.GroupLayout(pnlJuegoAvanzado);
        pnlJuegoAvanzado.setLayout(pnlJuegoAvanzadoLayout);
        pnlJuegoAvanzadoLayout.setHorizontalGroup(
            pnlJuegoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
        );
        pnlJuegoAvanzadoLayout.setVerticalGroup(
            pnlJuegoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout modoAvanzadoLayout = new javax.swing.GroupLayout(modoAvanzado.getContentPane());
        modoAvanzado.getContentPane().setLayout(modoAvanzadoLayout);
        modoAvanzadoLayout.setHorizontalGroup(
            modoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoAvanzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoAvanzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modoAvanzadoLayout.setVerticalGroup(
            modoAvanzadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modoAvanzadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJuegoAvanzado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlInicioJuego.setBorder(javax.swing.BorderFactory.createTitledBorder("BuscaMinas"));

        btnCrearJuego.setText("Comenzar");
        btnCrearJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearJuegoActionPerformed(evt);
            }
        });

        grupElegirDificultad.add(opPrincipiante);
        opPrincipiante.setSelected(true);
        opPrincipiante.setText("Modo principiante");

        grupElegirDificultad.add(opRelugar);
        opRelugar.setText("Modo Regular");

        grupElegirDificultad.add(opAvanzado);
        opAvanzado.setText("Modo Avanzado");

        javax.swing.GroupLayout pnlInicioJuegoLayout = new javax.swing.GroupLayout(pnlInicioJuego);
        pnlInicioJuego.setLayout(pnlInicioJuegoLayout);
        pnlInicioJuegoLayout.setHorizontalGroup(
            pnlInicioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioJuegoLayout.createSequentialGroup()
                .addGroup(pnlInicioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioJuegoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlInicioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opPrincipiante)
                            .addComponent(opRelugar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opAvanzado, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(pnlInicioJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrearJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioJuegoLayout.setVerticalGroup(
            pnlInicioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioJuegoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opPrincipiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opRelugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opAvanzado)
                .addGap(18, 18, 18)
                .addComponent(btnCrearJuego)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlInicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearJuegoActionPerformed
        if (opPrincipiante.isSelected()) {
            modoPrincipiante.setBounds(0, 0, 450, 450);
            modoPrincipiante.setLocationRelativeTo(null);
            modoPrincipiante.setResizable(false);
            modoPrincipiante.setVisible(true);

            comenzarCrearTodo(9, 9, 10);

        } else if (opRelugar.isSelected()) {
            modoRegular.setBounds(0, 0, 690, 690);
            modoRegular.setLocationRelativeTo(null);
            modoRegular.setResizable(false);
            modoRegular.setVisible(true);

            comenzarCrearTodo(16, 16, 10);

        } else if (opAvanzado.isSelected()) {
            modoAvanzado.setBounds(0, 0, 1300, 690);
            modoAvanzado.setLocationRelativeTo(null);
            modoAvanzado.setResizable(false);
            modoAvanzado.setVisible(true);

            comenzarCrearTodo(16, 30, 10);

        }

    }//GEN-LAST:event_btnCrearJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearJuego;
    private javax.swing.ButtonGroup grupElegirDificultad;
    private javax.swing.JFrame modoAvanzado;
    private javax.swing.JFrame modoPrincipiante;
    private javax.swing.JFrame modoRegular;
    private javax.swing.JRadioButton opAvanzado;
    private javax.swing.JRadioButton opPrincipiante;
    private javax.swing.JRadioButton opRelugar;
    private javax.swing.JPanel pnlInicioJuego;
    private javax.swing.JPanel pnlJuegoAvanzado;
    private javax.swing.JPanel pnlJuegoPricipiante;
    private javax.swing.JPanel pnlJuegoRegular;
    // End of variables declaration//GEN-END:variables

    private void comenzarCrearTodo(int cantFilas, int cantColumnas, int cantBomb) {
        if (opPrincipiante.isSelected()) {
            pnlJuegoPricipiante.setVisible(true);
            pnlJuegoPricipiante.setLayout(new GridLayout(cantFilas, cantColumnas, -3, -3));
        } else if (opRelugar.isSelected()) {
            pnlJuegoRegular.setVisible(true);
            pnlJuegoRegular.setLayout(new GridLayout(cantFilas, cantColumnas, -3, -3));
        } else if (opAvanzado.isSelected()) {
            pnlJuegoAvanzado.setVisible(true);
            pnlJuegoAvanzado.setLayout(new GridLayout(cantFilas, cantColumnas, -3, -3));
        }

        CANT_FILAS = cantFilas;
        CANT_COLUMNAS = cantColumnas;
        CANT_BOMBAS = cantBomb;

        btnAutoma = new JButton[cantFilas][cantColumnas];
        matrizCompleta = new String[cantFilas][cantColumnas];
        matrizCompleta2 = new String[cantFilas][cantColumnas];
        generarMatrizCompleta();
        generarBombasDeMatriz(cantBomb);
        metodoCantBombas();
        mostrarMatriz();

        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantColumnas; j++) {
                JButton btnA = new JButton();
                btnAutoma[i][j] = btnA;
                btnA.setName(i + "/" + j);

                if (opPrincipiante.isSelected()) {
                    pnlJuegoPricipiante.add(btnA);
                } else if (opRelugar.isSelected()) {
                    pnlJuegoRegular.add(btnA);
                } else if (opAvanzado.isSelected()) {
                    pnlJuegoAvanzado.add(btnA);

                }
                //System.out.println(btnA.getName());

                verBntApretado(btnA);
                verClikDerecho(btnA);
            }
        }
    }

    private static void generarMatrizCompleta() {

        for (int f = 0; f < matrizCompleta.length; f++) {
            for (int c = 0; c < matrizCompleta[f].length; c++) {
                matrizCompleta[f][c] = "o";
            }
        }

        for (int f = 0; f < matrizCompleta2.length; f++) {
            for (int c = 0; c < matrizCompleta2[f].length; c++) {
                matrizCompleta2[f][c] = "sinB";
            }
        }

    }

    private static void metodoCantBombas() {
        for (int f = 0; f < matrizCompleta.length; f++) {

            for (int c = 0; c < matrizCompleta[f].length; c++) {
                int cantBomb = 0;
                if (f == 0) {
                    if (c == 0) {// [Primera] fila esquina izquierda.
                        if (!matrizCompleta[f][c].equals("x")) {
                            if (matrizCompleta[f][c + 1].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f + 1][c].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f + 1][c + 1].equals("x")) {
                                cantBomb++;
                            }
                            matrizCompleta[f][c] = Integer.toString(cantBomb);
                        }

                    } else if (c == CANT_COLUMNAS - 1) {// [Primera] fila esquina derecha.
                        if (!matrizCompleta[f][c].equals("x")) {
                            if (matrizCompleta[f][c - 1].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f + 1][c].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f + 1][c - 1].equals("x")) {
                                cantBomb++;
                            }
                            matrizCompleta[f][c] = Integer.toString(cantBomb);
                        }

                    } else// [Primera] fila almedio.
                    if (!matrizCompleta[f][c].equals("x")) {
                        if (matrizCompleta[f][c + 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f][c - 1].equals("x")) {
                            cantBomb++;
                        }
                        int ac = c - 1;
                        for (int i = 0; i < 3; i++) {
                            if (matrizCompleta[f + 1][ac].equals("x")) {
                                cantBomb++;
                            }
                            ac++;
                        }
                        matrizCompleta[f][c] = Integer.toString(cantBomb);
                    }

                } else if (f == CANT_FILAS - 1) {
                    if (c == 0) {// [Ultima] fila esquina izquierda.
                        if (!matrizCompleta[f][c].equals("x")) {
                            if (matrizCompleta[f][c + 1].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f - 1][c].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f - 1][c + 1].equals("x")) {
                                cantBomb++;
                            }
                            matrizCompleta[f][c] = Integer.toString(cantBomb);

                        }

                    } else if (c == CANT_COLUMNAS - 1) {// [Ultima] fila esquina derecha.
                        if (!matrizCompleta[f][c].equals("x")) {
                            if (matrizCompleta[f][c - 1].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f - 1][c].equals("x")) {
                                cantBomb++;
                            }
                            if (matrizCompleta[f - 1][c - 1].equals("x")) {
                                cantBomb++;
                            }
                            matrizCompleta[f][c] = Integer.toString(cantBomb);
                        }

                    } else// [Ultima] fila almedio.
                    if (!matrizCompleta[f][c].equals("x")) {
                        if (matrizCompleta[f][c + 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f][c - 1].equals("x")) {
                            cantBomb++;
                        }
                        int ac = c - 1;
                        for (int i = 0; i < 3; i++) {
                            if (matrizCompleta[f - 1][ac].equals("x")) {
                                cantBomb++;
                            }
                            ac++;
                        }
                        matrizCompleta[f][c] = Integer.toString(cantBomb);
                    }

                } else if (c == 0) {// [Almedio] esquina izquierda.
                    if (!matrizCompleta[f][c].equals("x")) {
                        if (matrizCompleta[f - 1][c].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f - 1][c + 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f][c + 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f + 1][c].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f + 1][c + 1].equals("x")) {
                            cantBomb++;
                        }
                        matrizCompleta[f][c] = Integer.toString(cantBomb);
                    }

                } else if (c == CANT_COLUMNAS - 1) {// [Almedio] esquina derecha.
                    if (!matrizCompleta[f][c].equals("x")) {
                        if (matrizCompleta[f - 1][c].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f - 1][c - 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f][c - 1].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f + 1][c].equals("x")) {
                            cantBomb++;
                        }
                        if (matrizCompleta[f + 1][c - 1].equals("x")) {
                            cantBomb++;
                        }
                        matrizCompleta[f][c] = Integer.toString(cantBomb);
                    }

                } else// [Almedio] almedio.
                if (!matrizCompleta[f][c].equals("x")) {
                    if (matrizCompleta[f][c - 1].equals("x")) {
                        cantBomb++;
                    }
                    if (matrizCompleta[f][c + 1].equals("x")) {
                        cantBomb++;
                    }
                    int ac = c - 1;
                    for (int i = 0; i < 3; i++) {
                        if (matrizCompleta[f - 1][ac].equals("x")) {
                            cantBomb++;
                        }
                        ac++;
                    }
                    int ac2 = c - 1;
                    for (int i = 0; i < 3; i++) {
                        if (matrizCompleta[f + 1][ac2].equals("x")) {
                            cantBomb++;
                        }
                        ac2++;
                    }
                    matrizCompleta[f][c] = Integer.toString(cantBomb);
                }

            }
        }
    }

    private static void generarBombasDeMatriz(int cantBombas) {
        int cc = 0;
        for (int f = 0; f < matrizCompleta.length; f++) {

            for (int c = 0; c < matrizCompleta[f].length; c++) {

                Random rand = new Random();
                int x = rand.nextInt(CANT_FILAS);
                int y = rand.nextInt(CANT_COLUMNAS);

                if (cc < cantBombas) {
                    if (!matrizCompleta[x][y].equals("x")) {
                        matrizCompleta[x][y] = "x";
                        cc++;
                    }
                }
            }
        }
    }

    private static void mostrarMatriz() {
        for (int f = 0; f < matrizCompleta.length; f++) {
            for (int c = 0; c < matrizCompleta[f].length; c++) {
                System.out.print(matrizCompleta[f][c] + " ");
            }
            System.out.println();
        }
    }

    private void verBntApretado(JButton btnA) {
        btnA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JButton btn = (JButton) e.getSource();

                System.out.println(btn.getName());
                String separado = btn.getName();
                String[] lisSeparad = separado.split("/");
                System.out.println(lisSeparad[0] + "----" + lisSeparad[1]);

                if (e.getSource().equals(MouseEvent.BUTTON2)) {
                    System.out.println("por ");
                }

                int numX = Integer.parseInt(lisSeparad[0]);
                int numY = Integer.parseInt(lisSeparad[1]);

                if (matrizCompleta2[numX][numY].equals("conB")) {
                } else {
                    if (matrizCompleta[numX][numY].equals("x")) {
                        System.out.println("pumbaaaa");
//                    btn.setText("X");

                        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/bomb2.png")));

//                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/bomb.png")));
                    } else if (matrizCompleta[numX][numY].equals("0")) {
                        System.out.println("NaicBomba");

                        abrirCerBombas(numX, numY);
                    } else {
                        btn.setText(matrizCompleta[numX][numY]);
                    }

                }

            }

            private void abrirCerBombas(int numXX, int numYY) {
                matrizCompleta[numXX][numYY] = "";
                btnAutoma[numXX][numYY].setEnabled(false);

                new Thread(new Runnable() {//para ver lado izquierdo
                    @Override
                    public void run() {
                        int numNuevo = numXX - 1;
                        if (numNuevo >= 0) {
                            if (matrizCompleta[numNuevo][numYY].equals("0")) {
                                matrizCompleta[numNuevo][numYY] = "";
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                                mostrarBotonesEsquinas(numNuevo, numYY);
                                btnAutoma[numNuevo][numYY].setEnabled(false);
                                abrirCerBombas(numNuevo, numYY);
                            } else {
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                            }

                        }
                    }

                }).start();

                new Thread(new Runnable() {//para ver lado derecho
                    @Override
                    public void run() {
                        int numNuevo = numXX + 1;
                        if (numNuevo <= CANT_FILAS - 1) {
                            if (matrizCompleta[numNuevo][numYY].equals("0")) {
                                matrizCompleta[numNuevo][numYY] = "";
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                                mostrarBotonesEsquinas(numNuevo, numYY);
                                btnAutoma[numNuevo][numYY].setEnabled(false);
                                abrirCerBombas(numNuevo, numYY);
                            } else {
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                            }
                        }
                    }
                }).start();

                new Thread(new Runnable() {//para ver lado arriba
                    @Override
                    public void run() {
                        int numNuevo = numYY - 1;
                        if (numNuevo >= 0) {
                            if (matrizCompleta[numXX][numNuevo].equals("0")) {
                                matrizCompleta[numXX][numNuevo] = "";
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);
                                mostrarBotonesEsquinas(numXX, numNuevo);
                                btnAutoma[numXX][numNuevo].setEnabled(false);
                                abrirCerBombas(numXX, numNuevo);
                            } else {
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);
                            }
                        }
                    }
                }).start();

                new Thread(new Runnable() {//para ver lado abajo
                    @Override
                    public void run() {
                        int numNuevo = numYY + 1;
                        if (numNuevo <= CANT_COLUMNAS - 1) {
                            if (matrizCompleta[numXX][numNuevo].equals("0")) {
                                matrizCompleta[numXX][numNuevo] = "";
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);
                                mostrarBotonesEsquinas(numXX, numNuevo);
                                btnAutoma[numXX][numNuevo].setEnabled(false);
                                abrirCerBombas(numXX, numNuevo);
                            } else {
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);

                            }
                        }
                    }
                }).start();

            }
        });
    }

    private void mostrarBotonesEsquinas(int numXXX, int numYYY) {
        btnAutoma[numXXX][numYYY].setText(matrizCompleta[numXXX][numYYY]);
        if (numXXX + 1 >= 0 && numXXX + 1 <= CANT_FILAS - 1 && numYYY + 1 >= 0 && numYYY + 1 <= CANT_COLUMNAS - 1) {//Derecha
            if (!matrizCompleta[numXXX + 1][numYYY + 1].equals("") && !matrizCompleta[numXXX + 1][numYYY + 1].equals("0")) {
                btnAutoma[numXXX + 1][numYYY + 1].setText(matrizCompleta[numXXX + 1][numYYY + 1]);
            }
        }
        if (numXXX - 1 >= 0 && numXXX - 1 <= CANT_FILAS - 1 && numYYY + 1 >= 0 && numYYY + 1 <= CANT_COLUMNAS - 1) {//Izquierda
            if (!matrizCompleta[numXXX - 1][numYYY + 1].equals("") && !matrizCompleta[numXXX - 1][numYYY + 1].equals("0")) {
                btnAutoma[numXXX - 1][numYYY + 1].setText(matrizCompleta[numXXX - 1][numYYY + 1]);
            }

        }
        if (numXXX + 1 >= 0 && numXXX + 1 <= CANT_FILAS - 1 && numYYY - 1 >= 0 && numYYY - 1 <= CANT_COLUMNAS - 1) {//Arriba
            if (!matrizCompleta[numXXX + 1][numYYY - 1].equals("") && !matrizCompleta[numXXX + 1][numYYY - 1].equals("0")) {
                btnAutoma[numXXX + 1][numYYY - 1].setText(matrizCompleta[numXXX + 1][numYYY - 1]);
            }

        }
        if (numXXX - 1 >= 0 && numXXX - 1 <= CANT_FILAS - 1 && numYYY - 1 >= 0 && numYYY - 1 <= CANT_COLUMNAS - 1) {//Abajo
            if (!matrizCompleta[numXXX - 1][numYYY - 1].equals("") && !matrizCompleta[numXXX - 1][numYYY - 1].equals("0")) {
                btnAutoma[numXXX - 1][numYYY - 1].setText(matrizCompleta[numXXX - 1][numYYY - 1]);
            }

        }

    }

    private void verClikDerecho(JButton btnA) {
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (evt.getButton() == 3) {
                    System.out.println("siipretado");
                    JButton btn = (JButton) evt.getSource();

                    System.out.println(btn.getName());
                    String separado = btn.getName();
                    String[] lisSeparad = separado.split("/");
                    System.out.println(lisSeparad[0] + "----" + lisSeparad[1]);

                    int numX = Integer.parseInt(lisSeparad[0]);
                    int numY = Integer.parseInt(lisSeparad[1]);

                    if (matrizCompleta2[numX][numY].equals("sinB")) {//poner Bandera
                        matrizCompleta2[numX][numY] = "conB";
                        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/flag.png")));
                    } else if (matrizCompleta2[numX][numY].equals("conB")) {//poner signoPregunta
                        matrizCompleta2[numX][numY] = "preg";
                        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/ask.png")));
                    } else if (matrizCompleta2[numX][numY].equals("preg")) {
                        matrizCompleta2[numX][numY] = "sinB";
                        btn.setIcon(new ImageIcon(getClass().getResource("")));
                    }

                }
            }
        });
    }

}
