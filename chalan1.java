import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


 class Login{
Login()
{
JFrame f=new JFrame("LogIn");
final JLabel label = new JLabel();
label.setBounds(20,150, 200,50);
final JPasswordField value = new JPasswordField();
value.setBounds(100,75,100,30);
JLabel l1=new JLabel("Username:");
l1.setBounds(20,20, 80,30);
JLabel l2=new JLabel("Password:");
l2.setBounds(20,75, 80,30);
JButton b = new JButton("Login");
b.setBounds(60,120, 80,30);
JButton b1=new JButton("Cancel");
b1.setBounds(150,120,80,30);
JButton b2=new JButton("HELP");
b2.setBounds(100,180,120,30);
final JTextField text = new JTextField();
text.setBounds(100,20, 100,30);
f.getContentPane().setBackground(Color.WHITE);
f.add(value); f.add(l1); f.add(label); f.add(l2); f.add(b);f.add(text); f.add(b1);f.add(b2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	String value1=text.getText();
   String value2=value.getText();
   if (value1.equals("Sandhiya") && value2.equals("2354")) {
    chalan1 c=new chalan1();  
   }
   else{
   JOptionPane.showMessageDialog(f,"Incorrect login or password", "Error",JOptionPane.ERROR_MESSAGE);
   }
 }

});

b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e1) {
	f.dispose();
	}
});
b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e1) {
   JOptionPane.showMessageDialog(f," 1. Enter username  \n 2. Enter Password \n 3.Press Login \n 4.Enter the details in the form \n 5. Press \n (i)Verify to verify \n (ii) print to print details");
	}
});
}

}
	 
		
			
	
class chalan1
{
chalan1()
{
JFrame f=new JFrame("Online chalan verification");
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3,t4,t5;
JRadioButton r1,r2,r3,r4;
JComboBox cb1,cb2;
final JLabel l=new JLabel();
      l.setBounds(200,350,120,20);
JTextArea ta=new JTextArea();
JButton b1=new JButton("verify");
JButton b2=new JButton("Print");

String bank[]={"Axis Bank","Indian Bank","City Union Bank","ICIC","Bank Of Baroda"};
String branch[]={"Mumbai","Hydreabad","New Delhi","Chennai","Banglore"};
cb1=new JComboBox<>(bank); 
cb2=new JComboBox<>(branch);
l1=new JLabel("Chalan date:");
l2=new JLabel("NAME:");
l3=new JLabel("ACCOUNT NO:");
l4=new JLabel("PAYMENT METHOD:");
l5=new JLabel("Bank :");
l6=new JLabel("Branch:");
l7=new JLabel("Chalan NO:");
l8=new JLabel("Amount:");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
 t5=new JTextField();
 r1=new JRadioButton("CASH");
 r2=new JRadioButton("CHEQUE");
 r3=new JRadioButton("TRANSACTION");
r4=new JRadioButton("E-PAYMENT");
 l1.setBounds(10,20, 100,40);
 l2.setBounds(10,50, 100,40);
 l3.setBounds(10,80, 100,40);
 l4.setBounds(10,120, 100,40);
 l5.setBounds(10,160, 100,40);
 l6.setBounds(10,200,100,40);
 l7.setBounds(10,240,100,40);
 l8.setBounds(10,280,100,40);
 t1.setBounds(90,30,120,20); 
 t2.setBounds(90,60,120,20);
 t3.setBounds(90,90,120,20);
 t4.setBounds(90,250,120,20);
 t5.setBounds(90,290,120,20);
 r1.setBounds(90,140,80,50);
 r2.setBounds(150,140,80,50);
 r3.setBounds(220,140,120,50);
 r4.setBounds(350,140,120,50);
     cb1.setBounds(90,185,100,20);
	 cb2.setBounds(90,220,100,20);
	 ta.setBounds(490,160,300,200);
	 b1.setBounds(150,310,120,20);
	 b2.setBounds(290,310,120,20);
	  
 f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(t1);f.add(t2);f.add(t3);f.add(r1);f.add(r2);f.add(r3);f.add(r4);f.add(l5);f.add(cb1);f.add(l6);f.add(cb2);f.add(l7);f.add(t4);f.add(b1);f.add(b2);f.add(l8);f.add(t5);f.add(ta);f.add(l);
 f.setSize(900,500);
    f.setLayout(null);
    f.setVisible(true);
	
	b1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
		String data=" Chalan Verified ";
			l.setText(data);
	}
});
b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
				String s1=t1.getText();String s2=t2.getText();String s3=t3.getText();String s4=t4.getText();String s5=t5.getText();
	            
				String g=" ",hb=" ",hb1=" ";
				if(r1.isSelected())
				{
					g="Cash";
				}
				if(r2.isSelected())
				{
					g="Cheque";
				}
				if(r3.isSelected())
				{
					g="Transaction";
				}
				if(r4.isSelected())
				{
					g="E-PAYMENT";
				}
				
				ta.append("Chalan date:"+s1+"\n");
				ta.append("Name:" +s2+"\n");
				ta.append("Account No:" +s3+ "\n");
				ta.append("Payment Method:" +g+"\n");
				ta.append("Bank:"+cb1.getItemAt(cb1.getSelectedIndex())+"\n" );
				ta.append("Branch:"+cb2.getItemAt(cb2.getSelectedIndex())+"\n" );
				ta.append("Chalan No:" +s4 +"\n");
				ta.append("Amount:" + s5+"\n");
	}             
	
});
}
public static void main (String args[])
{
  Login p=new Login();
}

}
