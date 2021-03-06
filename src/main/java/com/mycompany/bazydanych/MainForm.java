/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bazydanych;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kamillo104
 */
public class MainForm extends javax.swing.JFrame {
    
    
    Employee emp = new Employee();
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_main = new javax.swing.JTable();
        jPanelWyswietl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAll = new javax.swing.JButton();
        jButton3high = new javax.swing.JButton();
        jButtonFebr = new javax.swing.JButton();
        jButtonAboveAVGSalary = new javax.swing.JButton();
        jButtonDepartments = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelWprowadz = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_delete_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCounter = new javax.swing.JButton();
        jLabelCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 206, 222));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(171, 206, 222));
        jPanel2.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(119, 123, 140));

        jTable_main.setBackground(new java.awt.Color(232, 226, 188));
        jTable_main.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja", "% Prowijzi", "ID Managera", "ID Departamentu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_main.setGridColor(new java.awt.Color(232, 226, 188));
        jTable_main.setName(""); // NOI18N
        jTable_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_mainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_main);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanelWyswietl.setBackground(new java.awt.Color(188, 247, 233));
        jPanelWyswietl.setPreferredSize(new java.awt.Dimension(240, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WYŚWIETL");

        jButtonAll.setText("Wszystkich Pracowników");
        jButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });

        jButton3high.setText("3 najlepiej zarabiających prac.");
        jButton3high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3highActionPerformed(evt);
            }
        });

        jButtonFebr.setText("Pracowników zatrudnionych w lutym");
        jButtonFebr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFebrActionPerformed(evt);
            }
        });

        jButtonAboveAVGSalary.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonAboveAVGSalary.setText("Pracowników z pensją powyżej średniej");
        jButtonAboveAVGSalary.setAlignmentY(0.2F);
        jButtonAboveAVGSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboveAVGSalaryActionPerformed(evt);
            }
        });

        jButtonDepartments.setText("Departamenty");
        jButtonDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepartmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWyswietlLayout = new javax.swing.GroupLayout(jPanelWyswietl);
        jPanelWyswietl.setLayout(jPanelWyswietlLayout);
        jPanelWyswietlLayout.setHorizontalGroup(
            jPanelWyswietlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWyswietlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWyswietlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDepartments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAboveAVGSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFebr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3high, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelWyswietlLayout.setVerticalGroup(
            jPanelWyswietlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWyswietlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jButtonAll)
                .addGap(18, 18, 18)
                .addComponent(jButton3high)
                .addGap(18, 18, 18)
                .addComponent(jButtonFebr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButtonAboveAVGSalary)
                .addGap(18, 18, 18)
                .addComponent(jButtonDepartments)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(171, 206, 222));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aplikacja zarządzająca bazą danych");

        jPanelWprowadz.setBackground(new java.awt.Color(188, 247, 233));
        jPanelWprowadz.setPreferredSize(new java.awt.Dimension(240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WPROWADŹ ZMIANY");

        jButtonAdd.setText("Dodaj Pracownika");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edytuj Pracownika");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Usuń Pracownika");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Podaj id pracownika do usunięcia:");

        jTextField_delete_id.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_delete_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_delete_idActionPerformed(evt);
            }
        });
        jTextField_delete_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_delete_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelWprowadzLayout = new javax.swing.GroupLayout(jPanelWprowadz);
        jPanelWprowadz.setLayout(jPanelWprowadzLayout);
        jPanelWprowadzLayout.setHorizontalGroup(
            jPanelWprowadzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelWprowadzLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_delete_id, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelWprowadzLayout.setVerticalGroup(
            jPanelWprowadzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jButtonAdd)
                .addGap(26, 26, 26)
                .addComponent(jButtonEdit)
                .addGap(18, 18, 18)
                .addGroup(jPanelWprowadzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_delete_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setText("bez SwingWorker");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonCounter.setText("Licznik");
        jButtonCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCounterActionPerformed(evt);
            }
        });

        jLabelCounter.setText("Licznik");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelWprowadz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelWyswietl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelWprowadz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelWyswietl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCounter)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
                new SwingWorker(){
                    @Override
                    protected Object doInBackground() throws Exception{
                        
                AddEmployeeForm Add = new AddEmployeeForm();
                Add.setVisible(true);
                Add.pack();
                Add.setLocationRelativeTo(null);
                Add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Add.setResizable(false);
                System.out.println("UI Thread name is: " + Thread.currentThread().getName());
                        
                        return null;
                    }
                }.execute();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if(jTextField_delete_id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Wpisz wartość");
        }else{
        String id = jTextField_delete_id.getText();
        emp.IUDEmployee('d', id, null, null, null, null, null, null, null, null, null, null);
        //emp.fillEmployeeJTable(jTable1);
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    }
    private void jButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllActionPerformed

                System.out.println("UI Thread name is: " + Thread.currentThread().getName());
                new SwingWorker(){
                    @Override
                    protected Object doInBackground() throws Exception{
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                    jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja","% Prowizji", "ID Menegera", "ID Departamentu"}));
                    emp.fillEmployeeJTable(jTable_main, 1);
                    System.out.println("This Thread name is: " + Thread.currentThread().getName());
                        
                        return null;
                    }
                }.execute();

        
    }//GEN-LAST:event_jButtonAllActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        EditEmployeeForm edt= new EditEmployeeForm();
        edt.setVisible(true);
        edt.pack();
        edt.setLocationRelativeTo(null);
        edt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        edt.setResizable(false);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextField_delete_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_delete_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_delete_idActionPerformed

    private void jTextField_delete_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_delete_idKeyTyped
         if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_delete_idKeyTyped

    private void jTable_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_mainMouseClicked
            //
    }//GEN-LAST:event_jTable_mainMouseClicked

    private void jButton3highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3highActionPerformed
        // TODO add your handling code here:
        jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja","% Prowizji", "ID Menegera", "ID Departamentu"}));
        emp.fillEmployeeJTable(jTable_main, 2);
    }//GEN-LAST:event_jButton3highActionPerformed

    private void jButtonFebrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFebrActionPerformed
       
        jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja","% Prowizji", "ID Menegera", "ID Departamentu"}));
        emp.fillEmployeeJTable(jTable_main, 3);
    }//GEN-LAST:event_jButtonFebrActionPerformed

    private void jButtonAboveAVGSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboveAVGSalaryActionPerformed
        jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja","% Prowizji", "ID Menegera", "ID Departamentu"}));
        emp.fillEmployeeJTable(jTable_main, 4);
    }//GEN-LAST:event_jButtonAboveAVGSalaryActionPerformed

    private void jButtonDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepartmentsActionPerformed
        jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID Departamentu", "Nazwa", "ID Managera", "ID Lokacji"}));
        emp.fillEmployeeJTable(jTable_main, 5);
    }//GEN-LAST:event_jButtonDepartmentsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jTable_main.setModel(new DefaultTableModel(null, new Object[]{"ID pracownika", "Imie", "Nazwisko", "Email", "Telefon", "Data zatrudnienia", "Praca", "Pensja","% Prowizji", "ID Menegera", "ID Departamentu"}));
                    emp.fillEmployeeJTable(jTable_main, 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCounterActionPerformed

                System.out.println("UI Thread name is: " + Thread.currentThread().getName());
                SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {
                   @Override
                   protected Boolean doInBackground() throws Exception {
                       
                    for (int i = 0; i <= 10; i++) {
                     Thread.sleep(1000);
                     publish(i);
                    }
                    return true;
                   }

                   protected void done() {

                    boolean status;
                    try {
                     status = get();
                     jLabelCounter.setText("Wartosc zwrócona: " + status);
                    } catch (InterruptedException e) {

                    } catch (ExecutionException e) {

                    }
                   }

                   @Override
                   protected void process(List<Integer> chunks) {

                    int mostRecentValue = chunks.get(chunks.size()-1);
                    jLabelCounter.setText(Integer.toString(mostRecentValue));
                   }
                  };
                  worker.execute();
        
    }//GEN-LAST:event_jButtonCounterActionPerformed

    //;

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3high;
    private javax.swing.JButton jButtonAboveAVGSalary;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAll;
    private javax.swing.JButton jButtonCounter;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDepartments;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFebr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCounter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelWprowadz;
    private javax.swing.JPanel jPanelWyswietl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_main;
    private javax.swing.JTextField jTextField_delete_id;
    // End of variables declaration//GEN-END:variables
}
