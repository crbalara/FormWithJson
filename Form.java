import javax.swing.*;
import java.awt.*;
class Gui {
   public void guibuild()
   {
        JFrame frame = new JFrame("Enrollment Form");
        frame.setSize(550,500);
        frame.setLayout(null);
        frame.setBackground(Color.GREEN);

        JLabel label = new JLabel("TCG Enrollment");
        label.setBounds(120,5,250,60);
        label.setForeground(Color.blue);
        label.setFont(new Font("Arial",Font.BOLD,25));
        frame.add(label);

        JLabel label1 = new JLabel("Name :");
        label1.setBounds(50,50,80,40);
        label1.setForeground(Color.magenta);
        label1.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label1);

        JTextField tf1 = new JTextField(16);
        tf1.setBounds(110,60,200,30);
        tf1.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(tf1);

        JLabel label2 = new JLabel("Rank :");
        label2.setBounds(50,120,80,40);
        label2.setForeground(Color.magenta);
        label2.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label2);

       /* JTextField tf2 = new JTextField(16);
        tf2.setBounds(110,125,200,30);
        tf2.setFont(new Font("Arial",Font.BOLD,15));*/

        String rank []= {"Rank....","CI","SI","ASI","HeadConstable","Constable"};

        JComboBox comboBox = new JComboBox(rank);
        comboBox.setBounds(110,125,200,30);
        comboBox.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(comboBox);

        JLabel label3 = new JLabel("Domain :");
        label3.setBounds(40,180,80,40);
        label3.setForeground(Color.magenta);
        label3.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label3);

       /* JTextField tf3 = new JTextField(16);
        tf3.setBounds(110,185,200,30);
        tf3.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(tf3);
        */
        String domain[]={"Domain....","Java","Python","HTML","CSS"};

        JComboBox comboBox1 = new JComboBox(domain);
        comboBox1.setBounds(110,185,200,30);
        comboBox1.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(comboBox1);

        JLabel label4 = new JLabel("Mob.No. :");
        label4.setBounds(35,240,80,40);
        label4.setForeground(Color.magenta);
        label4.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label4);

        JTextField tf4 = new JTextField("+91-",10);
        tf4.setBounds(110,245,200,30);
        tf4.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(tf4);

        JLabel label5 = new JLabel("Email :");
        label5.setBounds(50,300,80,40);
        label5.setForeground(Color.magenta);
        label5.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label5);

        JTextField tf5 = new JTextField(30);
        tf5.setBounds(110,305,200,30);
        tf5.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(tf5);

        JButton enroll = new JButton("Enroll");
        enroll.setBounds(400,400,120,40);
       enroll.setFont(new Font("Arial",Font.BOLD,20));
       enroll.setBackground(Color.cyan);
       frame.add(enroll);

       frame.setVisible(true);

   }
}

public class Form {
    public static void main(String[] args) {
        Gui graphic = new Gui();
        graphic.guibuild();
    }
}
