package pkg1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;

class SP1 extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton jb;
    JLabel label1;
    JLabel label2;

    public SP1() {
        super("Security Products Frame");
        ImageIcon ic=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\CC1.JPG");
        JLabel label1=new JLabel();
        label1.setText("CCTV Code:S101");
        JLabel label2=new JLabel(ic);
        button1 = new JButton("Get Details");
        ImageIcon ic1=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\Access_Controller.JPG");
        JLabel lb=new JLabel();
        lb.setText("Aceess controller Code:S102");
        JLabel lb2=new JLabel(ic1);
        button2 = new JButton("Get Details");
        ImageIcon ic2=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\biomettric.JPG");
        JLabel lb3=new JLabel();
        lb3.setText("Biomettric Door Code:S103");
        JLabel lb4=new JLabel(ic2);
        button3 = new JButton("Get Details");
        jb = new JButton("Next");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(lb);
        c.add(lb2);
        c.add(button2);
        c.add(lb3);
        c.add(lb4);
        c.add(button3);
        c.add(jb);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jb.addActionListener(this);
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,100);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb2.setBackground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb3.setBackground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            JOptionPane.showMessageDialog(null,"A CC Tv");

        }
        if (ae.getSource() == button2) {
            JOptionPane.showMessageDialog(null,"Access Controll ");

        }
        if (ae.getSource() == button3) {
            JOptionPane.showMessageDialog(null," Biomettric door  ");

        }
        if (ae.getSource() == jb) {

            JOptionPane.showMessageDialog(null,"Remember the product code to order");
            new Booking();
            dispose();
        }
    }
}


class PP extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton jb;
    JButton jb1;

    public PP() {
        super("Pharmaceutical sector Products Frame");
        ImageIcon ic=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\thermo.JPG");
        JLabel label1=new JLabel();
        label1.setText("Thermometer Code:P101");
        JLabel label2=new JLabel(ic);
        button1 = new JButton("Get Details");
        ImageIcon ic1=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\BP.JPG");
        JLabel lb=new JLabel();
        lb.setText("BP Machine Code:P102");
        JLabel lb2=new JLabel(ic1);
        button2 = new JButton("Get Details");
        ImageIcon ic2=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\kn95.JPG");
        JLabel lb3=new JLabel();
        lb3.setText("KN95 Mask Code:P103");
        JLabel lb4=new JLabel(ic2);
        button3 = new JButton("Get Details");
        jb = new JButton("Next");
        jb1 = new JButton("Back");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(lb);
        c.add(lb2);
        c.add(button2);
        c.add(lb3);
        c.add(lb4);
        c.add(button3);
        c.add(jb);
        c.add(jb1);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        setSize(550,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,100);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb2.setBackground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb3.setBackground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            JOptionPane.showMessageDialog(null," An infrared thermometer is a thermometer which infers temperature from a portion\n of the thermal radiation sometimes called black-body radiation emitted\n by the object being measured. They are sometimes called laser thermometers as a laser is used \nto help aim the thermometer, or non-contact thermometers or temperature guns,\n to describe the device's ability to measure temperature from a distance.\n By knowing the amount of infrared energy emitted by the object and its emissivity, the object's \ntemperature can often be determined within a certain range of its actual temperature.");

        }
        if (ae.getSource() == button2) {
            JOptionPane.showMessageDialog(null,"Blood Pressure Machine or digital BP monitor is a diagnostic tool to check the blood pressure\n levels in the body. High blood pressure is associated with a multitude of problems\n which makes it necessary for doctors and patients themselves, to check their BP levels on a \n regular basis to monitor and maintain regular levels under the limit.\nWithin that choose an upper arm type machine compared to a wrist or finger type blood \n pressure checker since that gives the most accurate as well as consistent reading.  ");

        }
        if (ae.getSource() == button3) {
            JOptionPane.showMessageDialog(null," There are many types of masks you can use to protect yourself and others from getting \n and spreading COVID-19.But  KN95 masks are made from multiple layers of synthetic material \n(typically a polypropylene plastic polymer) and are designed to be worn over the mouth \nand nose. Straps behind your ear help to hold the mask in place.This must filter\n out and capture 95 percent of tiny 0.3 micron particles in the air\n (hence the “95” in the name).");

        }
        if (ae.getSource() == jb) {

            JOptionPane.showMessageDialog(null,"Remember the product code to order");
            new Booking();
            dispose();
        }
        if (ae.getSource() == jb1) {

            new Typee();
            dispose();
        }
    }
}
class Products extends JFrame implements ActionListener{
    JLabel label1;
    JTextField tf;
    JLabel label2;
    JTextField tf2;
    JLabel label3;
    JTextField tf3;
    JLabel label4;
    JLabel lb;
    JLabel lb1;
    JTextField tf4;
    JTextField t2;
    JTextField pf;
    JComboBox comboBox;
    JButton jb;
    JButton jb2;
    JButton jb3;
    JButton jb1;


    public Products() {
        super("Manage Products Frame");
        label1=new JLabel("Code");
        tf=new JTextField(20);
        label2=new JLabel("Name");
        tf2=new JTextField(20);
        lb=new JLabel("Type");
        comboBox=new JComboBox();
        comboBox.addItem("Kitchen Appliances");
        comboBox.addItem("Security Products");
        comboBox.addItem("Pharmaceutical sector               ");
        comboBox.addItem("Comfort Products");
        label3=new JLabel("Price");
        tf3=new JTextField(20);
        label4=new JLabel("Warrenty(Years)");
        tf4=new JTextField(20);
        lb1=new JLabel("Avalibility");
        pf=new JTextField(20);
        jb = new JButton("Add");
        jb1 = new JButton("Update");
        jb2 = new JButton("Delete");
        jb3 = new JButton("Back");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(tf2);
        c.add(lb);
        c.add(comboBox);
        c.add(label3);
        c.add(tf3);
        c.add(label4);
        c.add(tf4);
        c.add(lb1);
        c.add(pf);
        c.add(jb);
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        setSize(250,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label4.setBackground(Color.WHITE);
        lb1.setForeground(Color.WHITE);
        lb1.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb) {
            dispose();
        }
        if(ae.getSource()==jb1) {
            dispose();
        }
        if(ae.getSource()==jb2) {
            dispose();
        }
        if(ae.getSource()==jb3) {
            new work2();
            dispose();
        }

    }}
class work2 extends JFrame implements ActionListener {
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    public work2() {
        super("Employee Work Frame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        button2 = new JButton("View Client Info");
        button3 = new JButton("View Product Info");
        button4 = new JButton("Manage Product Info");
        button5 = new JButton("Get Booking List");
        button6 = new JButton("Exit");
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
        c.add(button6);

        button2.setPreferredSize(new Dimension(250, 80));
        button3.setPreferredSize(new Dimension(250, 80));
        button4.setPreferredSize(new Dimension(250, 80));
        button5.setPreferredSize(new Dimension(250, 80));
        button6.setPreferredSize(new Dimension(250, 80));

        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 200);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button2) {

            dispose();
        }
        if (ae.getSource() == button3) {

            dispose();
        }
        if (ae.getSource() == button4) {
            new Products();
            dispose();
        }
        if (ae.getSource() == button5) {

            dispose();
        }
        if (ae.getSource() == button6) {
            dispose();
        }

    }
}

class Menu1  extends JFrame implements ActionListener {

    JButton button1;

    public Menu1() {
        super("Menu Frame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        button1 = new JButton("TRY");
        button1.addActionListener(this);
        c.add(button1);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 300);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            try {
                Connection connect;
                Class.forName("com.mysql.jdbc.Driver");
                //connect = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","");
              //  Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db1","root", "");
            //Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db1","root", "");
            System.out.println("congrats, db con established!");
            //Statement statement = conn.createStatement();
           // ResultSet res = statement.executeQuery("select * from ins");

            //String str1, str2;
           // while(res.next()){
              //  str1 = res.getString(1);
                //str2 = res.getString(2);
              //  System.out.println(str1+" "+str2);
           // }
           // int c = 50;
          //  String name = "EWU";
           // PreparedStatement stmt = conn.prepareStatement("insert into ins (code, name) values (?, ?)");
          //  stmt.setString(1, Integer.toString(c));
          //  stmt.setString(2, name);
          //  stmt.executeUpdate();
          //  conn.close();
        } catch (Exception e) {
            System.out.println("Sorry, db con failed!");
        }


    }
    }
}
class ManageEmployee extends JFrame implements ActionListener {
    JLabel label1;
    JTextField tf;
    JLabel label2;
    JTextField tf2;
    JLabel label3;
    JTextField tf3;
    JLabel label4;
    JLabel lb;
    JLabel lb1;
    JTextField tf4;
    JLabel l1;
    JTextField t1;
    JTextField t2;
    JTextField pf;
    JComboBox comboBox;
    JButton jb;
    JButton jb1;
    JButton jb2;
    JButton jb3;


    public ManageEmployee() {
        super("Monitoring Employee Info");
        lb1 = new JLabel("ID");
        pf = new JTextField(20);
        label1 = new JLabel("Name");
        tf = new JTextField(20);
        label2 = new JLabel("Age");
        tf2 = new JTextField(20);
        lb = new JLabel("Gender");
        comboBox = new JComboBox();
        comboBox.addItem("Male");
        comboBox.addItem("Female");
        comboBox.addItem("Other                                   ");
        l1 = new JLabel("Qualification");
        t1 = new JTextField(20);
        label3 = new JLabel("Mobile");
        tf3 = new JTextField(20);
        label4 = new JLabel("Email");
        tf4 = new JTextField(20);
        jb = new JButton("Insert");
        jb1 = new JButton("Update");
        jb2 = new JButton("Delete");
        jb3 = new JButton("Back");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lb1);
        c.add(pf);
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(tf2);
        c.add(lb);
        c.add(comboBox);
        c.add(l1);
        c.add(t1);

        c.add(label3);
        c.add(tf3);
        c.add(label4);
        c.add(tf4);
        c.add(jb);
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        setSize(250, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 300);
        lb1.setForeground(Color.WHITE);
        lb1.setBackground(Color.WHITE);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        l1.setForeground(Color.WHITE);
        l1.setBackground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label4.setBackground(Color.WHITE);
        lb1.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb) {
            try {
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root", "");
               System.out.println("congrats, db con established!");
                Statement statement = conn.createStatement();

                String Id=pf.getText();
                String Name = tf.getText();
                String Age = tf2.getText();
                String Gender = comboBox.getSelectedItem().toString();
                String Quali = t1.getText();
                String Mobile = tf3.getText();
                String Email = tf4.getText();

                PreparedStatement stmt = conn.prepareStatement("insert into emp (ID, Name,Age ,Gender,Qualification,Mobile,Email) values (?, ?,?,?,?,?,?)");
                stmt.setString(1, Id);
                stmt.setString(2, Name);
                stmt.setString(3,Age);
                stmt.setString(4,Gender);
                stmt.setString(5, Quali);
                stmt.setString(6, Mobile);
                stmt.setString(7, Email);


                stmt.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                pf.setText("");
                tf.setText("");
                tf2.setText("");
                comboBox.setSelectedIndex(0);
                t1.setText("");
                tf3.setText("");
                tf4.setText("");

            } catch (Exception e) {
                System.out.println("db con not established!");
                JOptionPane.showMessageDialog(null,"Can't Execute..Recheck information");
            }



        }
        if (ae.getSource() == jb1) {
            try {
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root", "");
                // System.out.println("congrats, db con established!");
                Statement statement = conn.createStatement();
                String Id=pf.getText();
                String Name = tf.getText();
                String Age = tf2.getText();
                String Gender = comboBox.getSelectedItem().toString();
                String Quali = t1.getText();
                String Mobile = tf3.getText();
                String Email = tf4.getText();

                PreparedStatement stmt = conn.prepareStatement("update emp set Name=?,Age=?,Gender=?,Qualification=?,Mobile=?,Email=? where ID=?");
                stmt.setString(1, Name);
                stmt.setString(2,Age);
                stmt.setString(3,Gender);
                stmt.setString(4, Quali);
                stmt.setString(5, Mobile);
                stmt.setString(6, Email);
                stmt.setString(7, Id);

                stmt.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null,"Updated Successfully");
                pf.setText("");
                tf.setText("");
                tf2.setText("");
                comboBox.setSelectedIndex(0);
                t1.setText("");
                tf3.setText("");
                tf4.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Can't Execute..Recheck information");
            }

        }
        if (ae.getSource() == jb2) {
            try {
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root", "");
                // System.out.println("congrats, db con established!");
                Statement statement = conn.createStatement();
                String ID=pf.getText();

                PreparedStatement stmt = conn.prepareStatement("delete from emp  where ID=?");
                stmt.setString(1, ID);
                stmt.executeUpdate();
                conn.close();
                JOptionPane.showMessageDialog(null,"Deleted Successfully");
                pf.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Can't Execute..Recheck information");
            }

        }
        if (ae.getSource() == jb3) {
            new Work();
            dispose();
        }
    }
}

class Work extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    public Work() {
        super("Admin Work Frame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        button1 = new JButton("Manage Employee Info");
        button2 = new JButton("View Employee Info");
        button3 = new JButton("View Client Info");
        button4 = new JButton("View Product Info");
        button5 = new JButton("Log Out");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
        button1.setPreferredSize(new Dimension(250, 80));
        button2.setPreferredSize(new Dimension(250, 80));
        button3.setPreferredSize(new Dimension(250, 80));
        button4.setPreferredSize(new Dimension(250, 80));
        button5.setPreferredSize(new Dimension(250, 80));

        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 200);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            new ManageEmployee();
            dispose();

        }
        if (ae.getSource() == button2) {

            dispose();
        }
        if (ae.getSource() == button3) {

            dispose();
        }
        if (ae.getSource() == button4) {

            dispose();
        }
        if (ae.getSource() == button5) {

            dispose();
        }

    }
}

class CP extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton jb;

    public CP() {
        super("Simple Frame");
        ImageIcon ic=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\tv.JPG");
        JLabel label1=new JLabel();
        label1.setText("TV Code:101");
        JLabel label2=new JLabel(ic);
        button1 = new JButton("Get Details");
        ImageIcon ic1=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\ac.JPG");
        JLabel lb=new JLabel();
        lb.setText("AC Code:102");
        JLabel lb2=new JLabel(ic1);
        button2 = new JButton("Get Details");
        ImageIcon ic2=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\h.JPG");
        JLabel lb3=new JLabel();
        lb3.setText("Heater Code:103");
        JLabel lb4=new JLabel(ic2);
        button3 = new JButton("Get Details");
        jb = new JButton("Next");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(lb);
        c.add(lb2);
        c.add(button2);
        c.add(lb3);
        c.add(lb4);
        c.add(button3);
        c.add(jb);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jb.addActionListener(this);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb2.setBackground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb3.setBackground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            JOptionPane.showMessageDialog(null,"A smart TV, also known as a connected TV (CTV),\n is a traditional television set with integrated Internet\n and interactive Web 2.0 features, which allows users to \n stream music and videos, browse the internet,\n and view photos.");

        }
        if (ae.getSource() == button2) {
            JOptionPane.showMessageDialog(null,"Our Twinfold Inverter Technology saves up to 60% electricity.\nControl your AC from anywhere through IoT Smart Control by using Smart Phone.\nInverter AC has Horizontal & Vertical swing which enable the \n air to guide/swing in four directions. You will feel the same \n comfort at every corner of the room.");

        }
        if (ae.getSource() == button3) {
            JOptionPane.showMessageDialog(null," Room heaters are used to heat a small space and are normally \n portable or fitted to a wall. Most room heaters use gas or electricity.\n Electric heaters are all considered to be 100% efficient, because \n they turn all the electricity they use into heat. ");

        }
        if (ae.getSource() == jb) {

            JOptionPane.showMessageDialog(null,"Remember the product code to order");
            new Booking();
            dispose();
        }
    }
}

class KP extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton jb;
    JLabel label1;
    JLabel label2;

    public KP() {
        super("Kitchen Products Frame");
        ImageIcon ic=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\blender.JPG");
        JLabel label1=new JLabel();
        label1.setText("Blender Code  :  K101");
        JLabel label2=new JLabel(ic);
        button1 = new JButton("Get Details");
        ImageIcon ic1=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\chimneyy.JPG");
        JLabel lb=new JLabel();
        lb.setText("Chimney Code  :  K102");
        JLabel lb2=new JLabel(ic1);
        button2 = new JButton("Get Details");
        ImageIcon ic2=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\oven.JPG");
        JLabel lb3=new JLabel();
        lb3.setText("      Oven Code  :  K103");
        JLabel lb4=new JLabel(ic2);
        button3 = new JButton("Get Details");
        jb = new JButton("Next");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(lb);
        c.add(lb2);
        c.add(button2);
        c.add(lb3);
        c.add(lb4);
        c.add(button3);
        c.add(jb);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jb.addActionListener(this);
        setSize(500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,100);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb2.setBackground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb3.setBackground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            JOptionPane.showMessageDialog(null,"Looking for a blender that can do (basically) everything?\n This blends everything from margaritas to sauces and also liquifies\n your favorite fruits and vegetables in a snap.It can even make\n ice cream and sorbets with a quick blend—and, on the flip side, \nwarm up soups with the friction of its powerful blades.");

        }
        if (ae.getSource() == button2) {
            JOptionPane.showMessageDialog(null,"Chimney capable to maintain its body parts clean.\nThe cooling air mostly contains oil particles. When this cooking passes \nthrough the auto clean chimney, it’s turbine blower forces air to move towards\n the chimney walls.Auto clean chimney converts cumbersome, time consuming\n cleaning process to easy and effective. ");

        }
        if (ae.getSource() == button3) {
            JOptionPane.showMessageDialog(null," Electric ovens work using heating elements placed on the walls of the oven.\nThese ovens are the most common variety and tend to have a lot more options for cooking your \nfood at the touch of a button. Electric ovens are the easiest to use,\n easiest to clean and the easiest to achieve even cooking. They are\n also available in both convection and conventional varieties, so if an electric oven \n is what you’re after, we have plenty of choice to be had.  ");

        }
        if (ae.getSource() == jb) {

            JOptionPane.showMessageDialog(null,"Remember the product code to order");
            new Booking();
            dispose();
        }
    }
}



class SP extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton jb;
    JButton jb1;
    JLabel label1;
    JLabel label2;

    public SP() {
        super("Security Products Frame");
        ImageIcon ic=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\CC1.JPG");
        JLabel label1=new JLabel();
        label1.setText("CCTV Code:S101");
        JLabel label2=new JLabel(ic);
        button1 = new JButton("Get Details");
        ImageIcon ic1=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\Access_Controller.JPG");
        JLabel lb=new JLabel();
        lb.setText("Aceess controller Code:S102");
        JLabel lb2=new JLabel(ic1);
        button2 = new JButton("Get Details");
        ImageIcon ic2=new ImageIcon("C:\\Users\\ASUS\\IdeaProjects\\Universe\\src\\biomettric.JPG");
        JLabel lb3=new JLabel();
        lb3.setText("Biomettric Door Code:S103");
        JLabel lb4=new JLabel(ic2);
        button3 = new JButton("Get Details");
        jb = new JButton("Next");
        jb1 = new JButton("Back");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        c.add(button1);
        c.add(lb);
        c.add(lb2);
        c.add(button2);
        c.add(lb3);
        c.add(lb4);
        c.add(button3);
        c.add(jb);
        c.add(jb1);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        setSize(550,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,100);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        lb2.setForeground(Color.WHITE);
        lb2.setBackground(Color.WHITE);
        lb3.setForeground(Color.WHITE);
        lb3.setBackground(Color.WHITE);
        lb4.setForeground(Color.WHITE);
        lb4.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            JOptionPane.showMessageDialog(null,"A CCTV footage can also help to identify criminals and be used as evidence\n in criminal investigations. Whether for anti-social behaviour near your property or \n a full-on break-in, a major benefit of having CCTV at home is that offenders are\n more likely to be identified, caught and brought to justice.");

        }
        if (ae.getSource() == button2) {
            JOptionPane.showMessageDialog(null,"Access Control is a security measure which is put in place to regulate the\n individuals that can view, use, or have access to a restricted environment. \nVarious access control examples can be found in the security systems in our doors,\n key locks, fences, biometric systems, motion detectors, badge system, and so forth.");

        }
        if (ae.getSource() == button3) {
            JOptionPane.showMessageDialog(null," Biomettric door In addition to biometric locks, there are several other types \n of smart locks that enable you to unlock your door without a physical key. \n Of these types, biometric locks are probably the most secure, since they require your \n physical presence to unlock the door. ");

        }
        if (ae.getSource() == jb) {

            JOptionPane.showMessageDialog(null,"Remember the product code to order");
            new Booking();
            dispose();
        }

        if (ae.getSource() == jb1) {

            new Typee();
            dispose();
        }
    }
}


    class Typee  extends JFrame implements ActionListener {

    JRadioButton rb1,rb2,rb3,rb4;

    public Typee() {
        super("Type Choosing Frame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        rb1=new JRadioButton("Kitchen Appliances");
        rb2=new JRadioButton("Security Products");
        rb3=new JRadioButton("Pharmaceutical sector");
        rb4=new JRadioButton("Comfort Products");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb3);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(rb4);
        rb1.setPreferredSize(new Dimension(250, 80));
        rb2.setPreferredSize(new Dimension(250, 80));
        rb3.setPreferredSize(new Dimension(250, 80));
        rb4.setPreferredSize(new Dimension(250, 80));


        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);

        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 200);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rb1) {
            new KP();
            dispose();

        }
        if (ae.getSource() == rb2) {
            new SP();
            dispose();
        }
        if (ae.getSource() == rb3) {
            new PP();
            dispose();
        }
        if (ae.getSource() == rb4) {
            new CP();
            dispose();
        }

    }
}

class Menu  extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;

    public Menu() {
        super("Menu Frame");
        Container c = getContentPane();
        c.setLayout(new GridBagLayout());
        button1 = new JButton("Admin");
        button1.setPreferredSize(new Dimension(100, 100));
        button2 = new JButton("Employee");
        button2.setPreferredSize(new Dimension(100, 100));
        button3 = new JButton("Customer");
        button3.setPreferredSize(new Dimension(100, 100));
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);


        c.add(button1);
        c.add(button2);
        c.add(button3);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 300);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            new Admin();
            dispose();

        }
        if (ae.getSource() == button2) {
            new Employee();
            dispose();
        }
        if (ae.getSource() == button3) {
            new Customer();
            dispose();
        }

    }
}
class Booking extends JFrame implements ActionListener{

    JLabel label1;
    JTextField tf;
    JLabel label2;
    JTextField tf2;
    JLabel label3;
    JTextField tf3;
    JButton jb;
    public Booking() {
        super("Product Booking Frame");
        label1=new JLabel("Email");
        tf=new JTextField(20);
        label2=new JLabel("Code");
        tf2=new JTextField(20);
        label3=new JLabel("Number of Product");
        tf3=new JTextField(20);


        jb=new JButton("Finish");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(tf2);
        c.add(label3);
        c.add(tf3);
        c.add(jb);
        jb.addActionListener(this);

        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb)
        {
            String Email = tf.getText();
            String Code = tf2.getText();
            String num = tf3.getText();
            JOptionPane.showMessageDialog(null,"Thanks for visiting our system.");
            dispose();


        }
    }


}
class CLogIn extends JFrame implements ActionListener {
    JLabel label1;
    JTextField tf;
    JLabel label2;
    JPasswordField pf;
    JButton jb;

    public CLogIn() {
        super("Customer LogIn Frame");
        label1 = new JLabel("Email");
        tf = new JTextField(20);
        label2 = new JLabel("Password");
        pf = new JPasswordField(20);
        jb = new JButton("Login");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(pf);
        c.add(jb);
        jb.addActionListener(this);

        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jb) {
            String userName = tf.getText();
            String password = new String(pf.getPassword());
            new Typee();
            dispose();
        }
    }
}
class Admin extends JFrame implements ActionListener{
    JLabel label1;
    JTextField tf;
    JLabel label2;
    JPasswordField pf;
    JButton jb;

    public Admin() {
        super("Admin Frame");
        label1=new JLabel("Username");
        tf=new JTextField(20);
        label2=new JLabel("Password");
        pf=new JPasswordField(20);
        jb=new JButton("Login");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(pf);
        c.add(jb);
        jb.addActionListener(this);

        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);}
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==jb)
            {
                String userName = tf.getText();
                String password = new String(pf.getPassword());

                if(userName.equals("Shammey") && password.equals("198"))
                {

                    new Work();
                    dispose();

                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
                }
            }
        }

    }

class Employee extends JFrame implements ActionListener{

    JLabel label1;
    JTextField tf;
    JLabel label2;
    JPasswordField pf;
    JButton jb;

    public Employee() {
        super("Employee Frame");
        label1=new JLabel("Username");
        tf=new JTextField(20);
        label2=new JLabel("Password");
        pf=new JPasswordField(20);
        jb=new JButton("Login");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(pf);
        c.add(jb);
        jb.addActionListener(this);

        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb)
        {
            String userName = tf.getText();
            String password = new String(pf.getPassword());

            if(userName.equals("Shammey") && password.equals("198"))
            {

                new work2();
                dispose();

            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
            }
        }
    }

}
class Customer extends JFrame implements ActionListener{
    JLabel label1;
    JTextField tf;
    JLabel label2;
    JTextField tf2;
    JLabel label3;
    JTextField tf3;
    JLabel label4;
    JLabel lb;
    JLabel lb1;
    JTextField tf4;
    JTextField t2;
    JPasswordField pf;
    JComboBox comboBox;
     JButton jb;
    JButton jb1;


    public Customer() {
        super("Customer Frame");
        label1=new JLabel("Name");
        tf=new JTextField(20);
        label2=new JLabel("Age");
        tf2=new JTextField(20);
        lb=new JLabel("Gender");
        comboBox=new JComboBox();
        comboBox.addItem("Male");
        comboBox.addItem("Female");
        comboBox.addItem("Other                                        ");
        label3=new JLabel("Mobile");
        tf3=new JTextField(20);
        label4=new JLabel("Email");
        tf4=new JTextField(20);
        lb1=new JLabel("Password");
        pf=new JPasswordField(20);
        jb=new JButton("Register");
        jb1=new JButton("Login");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(tf);
        c.add(label2);
        c.add(tf2);
        c.add(lb);
        c.add(comboBox);
        c.add(label3);
        c.add(tf3);
        c.add(label4);
        c.add(tf4);
        c.add(lb1);
        c.add(pf);
        c.add(jb);
        c.add(jb1);
        jb.addActionListener(this);
        jb1.addActionListener(this);
        setSize(250,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        label1.setForeground(Color.WHITE);
        label1.setBackground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label2.setBackground(Color.WHITE);
        lb.setForeground(Color.WHITE);
        lb.setBackground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label3.setBackground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label4.setBackground(Color.WHITE);
        lb1.setForeground(Color.WHITE);
        lb1.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb)
        {

            try {
                Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/db","root", "");
                Statement statement = conn.createStatement();
                String Name = tf.getText();
                String Age = tf2.getText();
                String Gender = comboBox.getSelectedItem().toString();
                String Mobile = tf3.getText();
                String Email = tf4.getText();
                String pass = new String(pf.getPassword());


                PreparedStatement stmt = conn.prepareStatement("insert into client (Name,Age ,Gender,Mobile,Email,Pass) values (?,?,?,?,?,?)");

                stmt.setString(1, Name);
                stmt.setString(2,Age);
                stmt.setString(3,Gender);
                stmt.setString(4, Mobile);
                stmt.setString(5, Email);
                stmt.setString(6, pass);


                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Updated Successfully");
                conn.close();
                pf.setText("");
                tf.setText("");
                tf2.setText("");
                comboBox.setSelectedItem(null);
                tf3.setText("");
                tf4.setText("");
                pf.setText("");
                new CLogIn();
                dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Can't Update..Recheck information");
            }


        }
        if(ae.getSource()==jb1)
        {
    new CLogIn();
    dispose();
        }
    }
    }


public class Universe  extends JFrame implements ActionListener{

    JButton button1;
    JLabel l2;

    public Universe()
    {
        super("Welcome to Universe");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        l2=new JLabel("Welcome To 'Universe' ");
        button1=new JButton("START");
        l2.setPreferredSize(new Dimension(250, 250));
        button1.setPreferredSize(new Dimension(90, 60));
        button1.addActionListener(this);
        c.add(l2);
        c.add(button1);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800,300);
        l2.setForeground(Color.WHITE);
        l2.setBackground(Color.WHITE);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setResizable(false);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {
            new Menu();
            dispose();

        }
    }
    public static void main(String args[])
    {
        new Universe();
    }

}

