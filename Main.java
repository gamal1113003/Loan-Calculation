
package kredet;

import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main extends  JFrame  {
       
        //////panel
        JPanel p2 ;
        ///// label
        JLabel l1;  JLabel l2;  JLabel l3; JLabel l4;  JLabel l5;   JLabel l6;   JLabel l7;  JLabel l8;
       JLabel l9;JLabel l10; 
        /////Button // الازرار
        JButton bb;   
          //text //  حقول الادخال 
        JTextField t1;  JComboBox box;   
        ImageIcon icon;
       
   public Main (){
               
        JFrame m = new JFrame();
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("(1G) Кредитный калькулятор");
        icon =new ImageIcon("img/1486564172-finance-loan-money_81492_1.png");        
        setIconImage(icon.getImage());     
        setResizable(true);      
        setVisible(true);
        
        ///////////////////////////////////////////////////////////////////////  
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new java.awt.Color(252, 250, 235));     
        ////////////////////////////////////////////////////////////////////////
       
        l1 = new JLabel("Кредитный калькулятор"); 
        l1.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        l1.setForeground(new java.awt.Color(204, 0, 0));        
        l1.setBounds(670,30,700,50);
     
        ////////////////////////////////////////////////////////////////////////
     
        l2 = new JLabel("Сколько вом нужно");
        l2.setFont(new java.awt.Font("Times New Roman", 0, 24));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setForeground(new java.awt.Color(153, 0, 0));
        l2.setBounds(600,298, 300, 30); 
        ////////////////////////////////////////////////////////////////////////     
       
        l3 = new JLabel("Срок кредита");
        l3.setFont(new java.awt.Font("Times New Roman", 0, 24)); 
        l3.setForeground(new java.awt.Color(153, 0, 0));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBounds(592,335, 250, 30);   
        ////////////////////////////////////////////////////////////////////////
        
        l4 = new JLabel("Ставка");
        l4.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        l4.setForeground(new java.awt.Color(96, 96, 96));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setBounds(634,400, 200, 14);
        ////////////////////////////////////////////////////////////////////////
        
        l5 = new JLabel("10,9%");
        l5.setFont(new java.awt.Font("Times New Roman", 1, 42)); 
        l5.setForeground(new java.awt.Color(0, 0, 0));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setBounds(650,420, 200, 45);       
        ////////////////////////////////////////////////////////////////////////
        
        l6 = new JLabel("Ежемесячный платеж");
        l6.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        l6.setForeground(new java.awt.Color(96, 96, 96));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setBounds(950,393, 200, 30);
        ////////////////////////////////////////////////////////////////////////
         
        l7 = new JLabel("от 30 000 ₽.......до 5 000 000 ₽");
        l7.setFont(new java.awt.Font("Times New Roman", 1, 17)); 
        l7.setForeground(new java.awt.Color(96, 96, 96));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setBounds(1190,300, 226, 28);       
        ////////////////////////////////////////////////////////////////////////
        
        l8 = new JLabel("от 3 месяца.......до 5 лет");
        l8.setFont(new java.awt.Font("Times New Roman", 1, 17)); // 
        l8.setForeground(new java.awt.Color(96, 96, 96));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setBounds(1170,340, 226, 28);  
        
        ////////////////////////////////////////////////////////////////////////        
        l9 = new JLabel();
        l9.setFont(new java.awt.Font("Times New Roman", 1, 42)); 
        l9.setForeground(new java.awt.Color(0, 0, 0));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setBounds(916,420, 300, 45);   
        ////////////////////////////////////////////////////////////////////////        
        l10 = new JLabel("*от 30 000 ₽.........до 5 000 000 ₽");
        l10.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        l10.setForeground(new java.awt.Color(204, 0, 0));
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setBounds(905,274, 300, 28);  
        l10.setVisible(false);
        //////////////////////////////////////////////////////////////////////        
        t1 = new JTextField();
        t1.setFont(new java.awt.Font("Times New Roman", 1, 19)); 
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.setBounds(950,300, 226, 28);
        t1.requestFocus();
        
        
           ////////////////////////////////////////////////////////////////////////
          /////Actionkey
        t1.addKeyListener(new KeyListener(){
            @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {}            
            @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {      
            char c = evt.getKeyChar();
        if (Character.isLetter(c)){ 
           t1.setEditable(false);
           getToolkit().beep();
           evt.consume();               
        }  
        else {
           t1.setEditable(true);          
        } 
        
        if  (t1.getText().equals("")){ 
            t1.requestFocus();
            l9.setText("");            
        }}
                
            @Override
        public void keyReleased(java.awt.event.KeyEvent evt) {}
                             
        });        
        ///////////////////////////////////////////////////////////////////////
        box = new JComboBox();
        box.addItem("3 Месяца");
        box.addItem("6 Месяца");
        box.addItem("1 Год");
        box.addItem("2 Год");
        box.addItem("3 Год");
        box.addItem("4 Год");
        box.addItem("5 Лет");
        
        box.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        box.setBounds(950,340, 226, 28); 
        box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box.setBackground(new java.awt.Color(255,255,255));
        box.setBorder(null);
       
        ////////////////////////////////////////////////////////////////////////      
        /////// Button bb // زر العمليه الحسابيه// Рассчитать 
        bb = new JButton ();
        bb.setBackground(new java.awt.Color(204, 204, 204));
        bb.setFont(new java.awt.Font("Times New Roman", 0, 24)); 
        bb.setForeground(new java.awt.Color(255, 0, 0));
        bb.setText("Рассчитать");
        bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bb.setBounds(650,500, 220, 40);      
         ////////////////////////////////////////////////////////////////////////
         ///////Actionkey
        bb.addActionListener((ActionEvent e) -> { 
           
         if (t1.getText().equals("")){ 
            l9.setText("");  
            t1.requestFocus();
            l10.setVisible(true);
        }              
                   
        int n;
        n=0;        
        Double i,s,k,p,h,v;
        s=Double.parseDouble(t1.getText());
     
        if (box.getSelectedItem().equals("3 Месяца")){
              n=3;       
        }
        if (box.getSelectedItem().equals("6 Месяца")){
              n=6;       
        }
        if (box.getSelectedItem().equals("1 Год")){
              n=12;       
        }            
        
        if (box.getSelectedItem().equals("2 Год")){
              n=24;       
        }   
        if (box.getSelectedItem().equals("3 Год")){
              n=36;       
        }   
        if (box.getSelectedItem().equals("4 Год")){
              n=48;       
        }   
        if (box.getSelectedItem().equals("5 Лет")){
              n=60;       
        }          
        i= 10.9/100/n;
        v=1+i;
        k=  Math.pow(v,n);
        h=i/(k-1);        
        p= s*(i+h);         
        l9.setText(String.format("%.2f ₽",p));
        
        if (s>5000000){
             l9.setText("");
             t1.setText("");
             t1.requestFocus();
             l10.setVisible(true);            
        }  
        else if(s<30000){
             l9.setText("");
             t1.setText("");
             t1.requestFocus();
             l10.setVisible(true);   
        }
        else{
         l10.setVisible(false);   
        }    

        });         
         ///////////////////////////////////////////////////////////////////////
         ////// ///add in JFrame
       add(p2);
       //////add in panel
       p2.add(l1);   p2.add(l2);  p2.add(l3); 
       p2.add(l4); 
       p2.add(l5);  
       p2.add(l6);
       p2.add(l7);
       p2.add(l8);
       p2.add(l9); 
       p2.add(l10);
       //////////////
       p2.add(bb);   
       /////////////
       p2.add(t1);  p2.add(box);                   
    }      
    public static void main(String[] args) {
       
       Main m = new Main();
    }    
}
