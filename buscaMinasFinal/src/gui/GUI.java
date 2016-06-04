package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

public class GUI extends javax.swing.JFrame {

    static String[][] matrizCompleta;
    public static int FILAS = 9;
    public static int COLUMNAS = 9;
    public static int CANTI_BOMBAS = 10;
    JButton[][] btnAutoma = new JButton[FILAS][COLUMNAS];

    public GUI() {
        initComponents();
        matrizCompleta = new String[FILAS][COLUMNAS];
        generarMatrizCompleta();
        generarBombasDeMatriz();
        metodoCantBombas();
        mostrarMatriz();

        pnlTodo.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearJuego = new javax.swing.JButton();
        pnlTodo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearJuego.setText("Comenzar");
        btnCrearJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearJuegoActionPerformed(evt);
            }
        });

        pnlTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlTodoLayout = new javax.swing.GroupLayout(pnlTodo);
        pnlTodo.setLayout(pnlTodoLayout);
        pnlTodoLayout.setHorizontalGroup(
            pnlTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        pnlTodoLayout.setVerticalGroup(
            pnlTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearJuegoActionPerformed
        pnlTodo.setVisible(true);

        pnlTodo.setLayout(new GridLayout(FILAS, COLUMNAS, -3, -3));

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                JButton btnA = new JButton();
                btnAutoma[i][j] = btnA;
                btnA.setName(i + "/" + j);

                pnlTodo.add(btnA);
                //System.out.println(btnA.getName());

                verBntApretado(btnA);

            }
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
    private javax.swing.JPanel pnlTodo;
    // End of variables declaration//GEN-END:variables

    private static void generarMatrizCompleta() {

        for (int f = 0; f < matrizCompleta.length; f++) {
            for (int c = 0; c < matrizCompleta[f].length; c++) {
                matrizCompleta[f][c] = "o";
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

                    } else if (c == COLUMNAS - 1) {// [Primera] fila esquina derecha.
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

                } else if (f == FILAS - 1) {
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

                    } else if (c == COLUMNAS - 1) {// [Ultima] fila esquina derecha.
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

                } else if (c == COLUMNAS - 1) {// [Almedio] esquina derecha.
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

    private static void generarBombasDeMatriz() {
        int cc = 0;
        for (int f = 0; f < matrizCompleta.length; f++) {

            for (int c = 0; c < matrizCompleta[f].length; c++) {

                Random rand = new Random();
                int x = rand.nextInt(FILAS);
                int y = rand.nextInt(COLUMNAS);

                if (cc < CANTI_BOMBAS) {
                    if(!matrizCompleta[x][y].equals("x")){
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

                int numX = Integer.parseInt(lisSeparad[0]);
                int numY = Integer.parseInt(lisSeparad[1]);
                
                if (matrizCompleta[numX][numY].equals("x")) {
                    System.out.println("pumbaaaa");
                    btn.setText("X");
                } else if (matrizCompleta[numX][numY].equals("0")) {
                    System.out.println("NaicBomba");
                    
                    abrirCerBombas(numX, numY);
                } else {
                    btn.setText(matrizCompleta[numX][numY]);
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
                            }else{
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                            }
                            
                        }
                    }

                }).start();

                new Thread(new Runnable() {//para ver lado derecho
                    @Override
                    public void run() {
                        int numNuevo = numXX + 1;
                        if (numNuevo <= COLUMNAS - 1) {
                            if (matrizCompleta[numNuevo][numYY].equals("0")) {
                                matrizCompleta[numNuevo][numYY] = "";
                                btnAutoma[numNuevo][numYY].setText(matrizCompleta[numNuevo][numYY]);
                                mostrarBotonesEsquinas(numNuevo, numYY);
                                btnAutoma[numNuevo][numYY].setEnabled(false);
                                abrirCerBombas(numNuevo, numYY);
                            }else{
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
                            }else{
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);
                            }
                        }
                    }
                }).start();

                new Thread(new Runnable() {//para ver lado abajo
                    @Override
                    public void run() {
                        int numNuevo = numYY + 1;
                        if (numNuevo <= FILAS - 1) {
                            if (matrizCompleta[numXX][numNuevo].equals("0")) {
                                matrizCompleta[numXX][numNuevo] = "";
                                btnAutoma[numXX][numNuevo].setText(matrizCompleta[numXX][numNuevo]);
                                mostrarBotonesEsquinas(numXX, numNuevo);
                                btnAutoma[numXX][numNuevo].setEnabled(false);
                                abrirCerBombas(numXX, numNuevo);
                            }else{
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
        if(numXXX+1 >=0 && numXXX+1 <=COLUMNAS-1 && numYYY+1 >=0 && numYYY+1 <=FILAS-1){//Derecha
            if(!matrizCompleta[numXXX+1][numYYY+1].equals("") && !matrizCompleta[numXXX+1][numYYY+1].equals("0")){
                btnAutoma[numXXX+1][numYYY+1].setText(matrizCompleta[numXXX+1][numYYY+1]);
            }
        }
        if(numXXX-1 >=0 && numXXX-1 <=COLUMNAS-1 && numYYY+1 >=0 && numYYY+1 <=FILAS-1){//Izquierda
            if(!matrizCompleta[numXXX-1][numYYY+1].equals("") && !matrizCompleta[numXXX-1][numYYY+1].equals("0")){
                btnAutoma[numXXX-1][numYYY+1].setText(matrizCompleta[numXXX-1][numYYY+1]);
            }
            
        }
        if(numXXX+1 >=0 && numXXX+1 <=COLUMNAS-1 && numYYY-1 >=0 && numYYY-1 <=FILAS-1){//Arriba
            if(!matrizCompleta[numXXX+1][numYYY-1].equals("") && !matrizCompleta[numXXX+1][numYYY-1].equals("0")){
                btnAutoma[numXXX+1][numYYY-1].setText(matrizCompleta[numXXX+1][numYYY-1]);
            }
            
        }
        if(numXXX-1 >=0 && numXXX-1 <=COLUMNAS-1 && numYYY-1 >=0 && numYYY-1 <=FILAS-1){//Abajo
            if(!matrizCompleta[numXXX-1][numYYY-1].equals("") && !matrizCompleta[numXXX-1][numYYY-1].equals("0")){
                btnAutoma[numXXX-1][numYYY-1].setText(matrizCompleta[numXXX-1][numYYY-1]);
            }
            
        }
        
    }
 
}
