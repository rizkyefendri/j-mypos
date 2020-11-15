/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypos;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OMEN
 */
public class BillPrint extends javax.swing.JFrame {



String inid = pos.inid.getText();



    
    public BillPrint()  {
        initComponents();
    }
    
    public BillPrint(Graphics graphics,PageFormat pageFormat,int pageIndex) throws PrinterException, SQLException {
        initComponents();

        //int r= itemName.size();
      //ImageIcon icon=new ImageIcon("C:UsersccsDocumentsNetBeansProjectsvideo TestPOSInvoicesrcposinvoicemylogo.jpg"); 
      int result = NO_SUCH_PAGE;    
                            
        
            Graphics2D g2d = (Graphics2D) graphics;                    
            double width = pageFormat.getImageableWidth();                               
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 



          //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        
        try{
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
           // int headerRectHeighta=40;
           
           Statement s = Database.mycon().createStatement();
       ResultSet rs = s.executeQuery("SELECT * FROM cart WHERE INID='"+inid+"' ");
       

    while (rs.next())
                {
                
                String nm_pro = rs.getString("nama_produk");
                String hrg = rs.getString("harga_ecer");
                String pay = rs.getString("pay");
                String bal = rs.getString("bal");
                
                
                
           
            
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            //g2d.drawImage(icon.getImage(), 50, 20, 90, 30, rootPane);y+=yShift+30;
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("         CodeGuid.com        ",12,y);y+=yShift;
            g2d.drawString("   No 00000 Address Line One ",12,y);y+=yShift;
            g2d.drawString("   Address Line 02 SRI LANKA ",12,y);y+=yShift;
            g2d.drawString("   www.facebook.com/CodeGuid ",12,y);y+=yShift;
            g2d.drawString("        +94700000000      ",12,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;

            g2d.drawString(" Item Name      Qty            Price   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
     
            for(int i=0; i<pos.jTable1.getRowCount(); i++)
            {
                
                String product = (String) pos.jTable1.getValueAt(i,2);
                String price = (String) pos.jTable1.getValueAt(i,3);  
                String qty = (String) pos.jTable1.getValueAt(i,4);  
                int total = (int) pos.jTable1.getValueAt(i,5); 
                
            g2d.drawString(" "+product+"    "+qty+"               "+price+"          ",10,y);y+=yShift;
            //g2d.drawString("      "+qty.get(i+" * "+itemPrice.get(a),10,y); g2d.drawString(subtotal.get(s),160,y);y+=yShift;

            
          
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total amount:               "+total+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Cash      :                 "+pay+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Balance   :                 "+bal+"   ",10,y);y+=yShift;
  
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("       THANK YOU COME AGAIN            ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("       SOFTWARE BY:CODEGUID          ",10,y);y+=yShift;
            g2d.drawString("   CONTACT: contact@codeguid.com       ",10,y);y+=yShift; 
            }
                }
           
        }
    
    catch(SQLException e){
            System.out.println(e);
    }
    
    
        
    }

                  
              
      
    
      
      
        
        
  
          


        
        
        
        
         
//        txtbill.setText(txtbill.getText() + "******************************************************\n");
//        txtbill.setText(txtbill.getText() + "                                POSBILL                          \n");
//        txtbill.setFont(txtbill.getFont().deriveFont(Font.PLAIN,9));
// 
//        txtbill.setText(txtbill.getText() + "*******************************************************\n");   
//         //Heading
//          txtbill.setText(txtbill.getText() + "Product" + "\t" + "Price" + "\t" + "Amount" + "\n"  ); 
//        
//          for(int i = 0; i < model.getRowCount(); i++)
//          {              
//              String pname = (String)model.getValueAt(i, 2);
//              int price = Integer.parseInt( tableModel.getValueAt(i, 3).toString() );
//              int amount = Integer.parseInt( tableModel.getValueAt(i, 4).toString() );
//       
//              txtbill.setText(txtbill.getText() + pname  + "\t" + price + "\t" + amount  + "\n"  );
//          }   
//          txtbill.setText(txtbill.getText() + "\n");       
//          txtbill.setText(txtbill.getText() + "\t" +  "Subtotal : " + sub + "\n");
//          txtbill.setText(txtbill.getText() + "\n");
//          txtbill.setText(txtbill.getText() + "*******************************************************\n");
//          txtbill.setText(txtbill.getText() + "           THANK YOU COME AGAIN             \n");
//          txtbill.print();
          
    

    

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

