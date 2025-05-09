package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


//we implements our class action listener to add click event in frame
//we will override to remove error
public class signup extends JFrame implements ActionListener {
    Choice loginas;
    JButton create,back;
    JTextField meter,employertext,usertext,nametext,passwordtext;
    signup(){
        super("Sign Up");
        getContentPane().setBackground(new Color(171, 171, 208));
        JLabel createas=new JLabel("create account as");
        createas.setBounds(30,50,125,20);
        add(createas);
        loginas=new Choice();
        loginas.add("admin");
        loginas.add("customer");
        loginas.setBounds(170,50,125,20);
        add(loginas);
        JLabel meterno=new JLabel("Meter No");
        meterno.setBounds(30,100,125,20);
        meterno.setVisible(false);
        add(meterno);
        meter=new JTextField();
        meter.setBounds(170,100,125,20);
        meter.setVisible(false);
        add(meter);
        JLabel employerid=new JLabel("Employer ID");
        employerid.setBounds(30,100,125,20);
        employerid.setVisible(true);
        add(employerid);
        employertext=new JTextField();
        employertext.setBounds(170,100,125,20);
        employertext.setVisible(true);
        add(employertext);
        JLabel username=new JLabel("UserName");
        username.setBounds(30,150,125,20);
        add(username);
        usertext=new JTextField();
        usertext.setBounds(170,150,125,20);
        add(usertext);
        JLabel name=new JLabel("Name");
        name.setBounds(30,200,125,20);
        add(name);
        nametext=new JTextField();
        nametext.setBounds(170,200,125,20);
        add(nametext);
        JLabel password=new JLabel("Password");
        password.setBounds(30,250,125,20);
        add(password);
        passwordtext=new JTextField();
        passwordtext.setBounds(170,250,125,20);
        add(passwordtext);
        loginas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user=loginas.getSelectedItem();
                if(user.equals("customer")){
                    employerid.setVisible(false);
                    employertext.setVisible(false);
                    meter.setVisible(true);
                    meterno.setVisible(true);
                }
                else{
                    employerid.setVisible(true);
                    employertext.setVisible(true);
                    meter.setVisible(false);
                    meterno.setVisible(false);
                }
            }
        });
        create=new JButton("Create");
        create.setBackground(new Color(112, 126, 182));
        create.setForeground(Color.black);
        create.setBounds(50,285,100,25);
        create.addActionListener(this);
        add(create);
        back=new JButton("Back");
        back.setBackground(new Color(112, 126, 182));
        back.setForeground(Color.black);
        back.setBounds(180,285,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon boyicon=new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image boyimg=boyicon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon boyicontwo=new ImageIcon(boyimg);
        JLabel boylebal=new JLabel(boyicontwo);
        boylebal.setBounds(320,30,250,250);
        add(boylebal);





        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);
    }
    //overriding after constructer

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==create){
            String sloginas=loginas.getSelectedItem();//meter,employertext,usertext,nametext,passwordtext
            String susername=usertext.getText();
            String sname=nametext.getText();
            String spassword=passwordtext.getText();
            String smeter=meter.getText();
            try {
                database c=new database();
                String query=null;
                query="insert into signup value('"+smeter+"', '"+susername+"', '"+sname+"', '"+spassword+"', '"+sloginas+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"account created");
                setVisible(false);
                new login();

            }
            catch (Exception E){
                E.printStackTrace();
            }

        } else if (e.getSource()==back) {
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {
        new signup();
    }
}
