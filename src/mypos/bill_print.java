/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypos;

import java.awt.Font;
import java.awt.print.PrinterException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author OMEN
 */
public class bill_print extends javax.swing.JFrame {


    String lsub;
    String lpay;
    String lbal;
    //TableModel tableModel;

    
    public bill_print() {
        initComponents();
    }
    
    public bill_print(String sub,String pay,String bal, TableModel tableModel) throws PrinterException {
        initComponents();
        
        this.lsub = sub;
        this.lpay = pay;
        this.lbal = bal;
        //this.tableModel = tableModel;
        
    
    
    
     
        String total = pay;
        TableModel model = tableModel;
        
         
        txtbill.setText(txtbill.getText() + "******************************************************\n");
        txtbill.setText(txtbill.getText() + "                                POSBILL                          \n");
        txtbill.setFont(txtbill.getFont().deriveFont(Font.BOLD, 13f));
 
        txtbill.setText(txtbill.getText() + "*******************************************************\n");   
         //Heading
          txtbill.setText(txtbill.getText() + "Product" + "\t" + "Price" + "\t" + "Amount" + "\n"  ); 
        
          for(int i = 0; i < model.getRowCount(); i++)
          {              
              String pname = (String)model.getValueAt(i, 2);
              int price = Integer.parseInt( tableModel.getValueAt(i, 3).toString() );
              int amount = Integer.parseInt( tableModel.getValueAt(i, 4).toString() );
       
              txtbill.setText(txtbill.getText() + pname  + "\t" + price + "\t" + amount  + "\n"  );
          }   
          txtbill.setText(txtbill.getText() + "\n");       
          txtbill.setText(txtbill.getText() + "\t" +  "Subtotal : " + total + "\n");
          txtbill.setText(txtbill.getText() + "\n");
          txtbill.setText(txtbill.getText() + "*******************************************************\n");
          txtbill.setText(txtbill.getText() + "           THANK YOU COME AGAIN             \n");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}
