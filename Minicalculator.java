package minicalculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class Gui extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JPanel p;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    
    //Event Handler
    class A implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                int n1=Integer.parseInt(s1);
                String s2=t2.getText();
                int n2=Integer.parseInt(s2);
                int n=n1+n2;
                l4.setText(n+"");
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
    }
    //Event Handler
    class B implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                int n1=Integer.parseInt(s1);
                String s2=t2.getText();
                int n2=Integer.parseInt(s2);
                int n=n1-n2;
                l4.setText(n+"");
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
    }
    //Event Handler
    class C implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                int n1=Integer.parseInt(s1);
                String s2=t2.getText();
                int n2=Integer.parseInt(s2);
                int n=n1*n2;
                l4.setText(n+"");
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
    }
    //Event Handler
    class D implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                int n1=Integer.parseInt(s1);
                String s2=t2.getText();
                int n2=Integer.parseInt(s2);
                int n=n1/n2;
                l4.setText(n+"");
            }catch(NumberFormatException | ArithmeticException ex){
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
    }
    //Event Handler
    class E implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                int n1=Integer.parseInt(s1);
                String s2=t2.getText();
                int n2=Integer.parseInt(s2);
                int n=n1%n2;
                l4.setText(n+"");
            }catch(NumberFormatException | ArithmeticException  ex){
                JOptionPane.showMessageDialog(null, "Invalid Number");
            }
        }
    }
    
    Gui(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(430,300);
        setLayout(null);
        setTitle("Mini Calci");
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.YELLOW);
        
        Font font1=new Font(Font.MONOSPACED, Font.BOLD, 16);
        Font font2=new Font(Font.SANS_SERIF, Font.BOLD, 18);
        
        p=new JPanel();
        p.setBackground(Color.BLUE);
        p.setBounds(30,30,360,160);
        p.setLayout(null);
        add(p);
        
        l1=new JLabel("Enter 1st Number:");
        l1.setForeground(Color.WHITE);
        l1.setBounds(20,20,170,30);
        l1.setFont(font1);
        p.add(l1);
        t1=new JTextField();
        t1.setForeground(Color.RED);
        t1.setBounds(200,20,100,30);
        t1.setFont(font1);
        p.add(t1);
        l2=new JLabel("Enter 2nd Number:");
        l2.setForeground(Color.WHITE);
        l2.setBounds(20,60,170,30);
        l2.setFont(font1);
        p.add(l2);
        t2=new JTextField();
        t2.setForeground(Color.RED);
        t2.setBounds(200,60,100,30);
        t2.setFont(font1);
        p.add(t2);
        
        b1=new JButton("+");
        b1.addActionListener(new A());//Registration of Source with Listener
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(20,105,60,40);
        b1.setFont(font2);
        p.add(b1);
        b2=new JButton("-");
        b2.addActionListener(new B());//Registration of Source with Listener
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(85,105,60,40);
        b2.setFont(font2);
        p.add(b2);
        b3=new JButton("*");
        b3.addActionListener(new C());//Registration of Source with Listener
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150,105,60,40);
        b3.setFont(font2);
        p.add(b3);
        b4=new JButton("/");
        b4.addActionListener(new D());//Registration of Source with Listener
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.WHITE);
        b4.setBounds(215,105,60,40);
        b4.setFont(font2);
        p.add(b4);
        b5=new JButton("%");
        b5.addActionListener(new E());//Registration of Source with Listener
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.WHITE);
        b5.setBounds(280,105,60,40);
        b5.setFont(font2);
        p.add(b5);
        
        l3=new JLabel("Answer:");
        l3.setBounds(30,210,150,30);
        l3.setFont(font1);
        add(l3);
        l4=new JLabel("--------");
        l4.setForeground(Color.BLUE);
        l4.setBounds(250,210,150,30);
        l4.setFont(font1);
        add(l4);
    }
}
public class Minicalculator {
    public static void main(String[] args) {
        new Gui().setVisible(true);
    }
}