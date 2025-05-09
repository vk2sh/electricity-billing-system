package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    //we will declare textfield globally to connect it from jdbc to store information in datbase
    JTextField usertext,passwordtext;
    Choice loginchoice;
    JButton loginbutton,cancelbutton,signupbutton;
    login(){
        super("Login");//this should be first line of code
        //we use jlabel to show ant text on jframe
        getContentPane().setBackground(Color.green);
        JLabel username=new JLabel("USERNAME");
        add(username);
        username.setBounds(300,60,100,20);
        usertext=new JTextField();
        usertext.setBounds(400,60,150,20);
        add(usertext);
        JLabel password=new JLabel("PASSWORD");
        add(password);
        password.setBounds(300,100,100,20);
        passwordtext=new JTextField();
        passwordtext.setBounds(400,100,150,20);
        add(passwordtext);

        JLabel login=new JLabel("LOGIN IN AS");
        add(login);
        login.setBounds(300,140,100,20);
        loginchoice=new Choice();
        loginchoice.add("admin");
        loginchoice.add("customer");
        loginchoice.setBounds(400,140,150,20);
        add(loginchoice);
        loginbutton=new JButton("login");
        loginbutton.setBounds(330,180,100,20);
        loginbutton.addActionListener(this);
        add(loginbutton);
        cancelbutton=new JButton("cancel");
        cancelbutton.setBounds(450,180,100,20);
        cancelbutton.addActionListener(this);
        add(cancelbutton);
        signupbutton=new JButton("sign up");
        signupbutton.setBounds(400,220,100,20);
        signupbutton.addActionListener(this);
        add(signupbutton);
        ImageIcon profile=new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profile2=profile.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon profilethree=new ImageIcon(profile2);
        JLabel profilelabel=new JLabel(profilethree);
        profilelabel.setBounds(5,5,250,250);
        add(profilelabel);

        setLocation(400,200);
        setSize(640,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginbutton){
            String susername=usertext.getText();
            String spassword=passwordtext.getText();
            String suser=loginchoice.getSelectedItem();
            try{
                database c=new database();
                String query="select * from signup where username='"+susername+"' and password='"+spassword+"' and usertype='"+suser+"'";
                ResultSet resultset=c.statement.executeQuery(query);
                if(resultset.next()){
                    setVisible(false);
                    new main_class();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }
            }
            catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource()==cancelbutton) {
            setVisible(false);
        } else if (e.getSource()==signupbutton) {
            new signup();

        }
    }

    public static void main(String[] args) {
        new login();
    }
}
