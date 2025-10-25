import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class ScrollableEvent extends JFrame{
    Connection conn;
    Statement st;
    ResultSet rs;

    JLabel lstitle, lsid, lsname, lscity, lsdept, lscontact, lsmark1, lsmark2, lsmark3;
    JTextField tsid, tsname, tscity, tsdept, tscontact, tsmark1, tsmark2, tsmark3;
    JButton btnNext, btnPrevious, btnFirst, btnLast; 

    ScrollableEvent(){

        try{
            Font f = new Font("SansSerif", Font.BOLD, 18);
            FileInputStream fis = new FileInputStream("auth.prop");
            Properties ps = new Properties();
            ps.load(fis);

            String connectionUrl = ps.getProperty("conurl");
            String username = ps.getProperty("uname");
            String password = ps.getProperty("password");

            conn = DriverManager.getConnection(connectionUrl, username, password);
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select * from student");
            // User Interface
            lstitle = new JLabel("Scrollable Event");
            lstitle.setBounds(80, 40, 400, 20);
            lstitle.setFont(f);
            add(lstitle);

            lsid = new JLabel("Student ID :");
            lsid.setBounds(20, 90, 150, 18);
            lsid.setFont(f);
            add(lsid);

            tsid = new JTextField();
            tsid.setBounds(200, 90, 180, 28);
            tsid.setFont(f);
            add(tsid);
            
            lsname = new JLabel("Student Name :");
            lsname.setBounds(20, 138, 150, 18);
            lsname.setFont(f);
            add(lsname);

            tsname = new JTextField();
            tsname.setBounds(200, 138, 180, 28);
            tsname.setFont(f);
            add(tsname);
            
            lscity = new JLabel("Student City :");
            lscity.setBounds(20, 178, 150, 18);
            lscity.setFont(f);
            add(lscity);

            tscity = new JTextField();
            tscity.setBounds(200, 178, 180, 28);
            tscity.setFont(f);
            add(tscity);
            
            lsdept = new JLabel("Student Dept :");
            lsdept.setBounds(20, 218, 150, 18);
            lsdept.setFont(f);
            add(lsdept);

            tsdept = new JTextField();
            tsdept.setBounds(200, 218, 180, 28);
            tsdept.setFont(f);
            add(tsdept);
            
            lsmark1 = new JLabel("Student Mark 1 :");
            lsmark1.setBounds(20, 258, 150, 18);
            lsmark1.setFont(f);
            add(lsmark1);

            tsmark1 = new JTextField();
            tsmark1.setBounds(200, 258, 180, 28);
            tsmark1.setFont(f);
            add(tsmark1);
            
            lsmark2 = new JLabel("Student Mark 2 :");
            lsmark2.setBounds(20, 298, 150, 18);
            lsmark2.setFont(f);
            add(lsmark2);

            tsmark2 = new JTextField();
            tsmark2.setBounds(200, 298, 180, 28);
            tsmark2.setFont(f);
            add(tsmark2);
            
            lsmark3 = new JLabel("Student Mark 3 :");
            lsmark3.setBounds(20, 348, 150, 18);
            lsmark3.setFont(f);
            add(lsmark3);

            tsmark3 = new JTextField();
            tsmark3.setBounds(200, 348, 180, 28);
            tsmark3.setFont(f);
            add(tsmark3);

            //  Button 

            btnNext = new JButton("Next");
            btnNext.setBounds(40, 400, 150, 30);
            btnNext.setFont(f);
            add(btnNext);
            btnNext.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        if(rs.next()){
                        tsid.setText(rs.getString(1));
                        tsname.setText(rs.getString(2));
                        tscity.setText(rs.getString(4));
                        tsdept.setText(rs.getString(3));
                        tsmark1.setText(rs.getString(6));
                        tsmark2.setText(rs.getString(7));
                        tsmark3.setText(rs.getString(8));
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });

            btnPrevious = new JButton("Previous");
            btnPrevious.setBounds(200, 400, 150, 30);
            btnPrevious.setFont(f);
            add(btnPrevious);
            btnPrevious.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        if(rs.previous()){
                        tsid.setText(rs.getString(1));
                        tsname.setText(rs.getString(2));
                        tscity.setText(rs.getString(4));
                        tsdept.setText(rs.getString(3));
                        tsmark1.setText(rs.getString(5));
                        tsmark2.setText(rs.getString(6));
                        tsmark3.setText(rs.getString(7));
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });

            btnFirst = new JButton("First");
            btnFirst.setBounds(40, 440, 150, 30);
            btnFirst.setFont(f);
            add(btnFirst);
            btnFirst.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        if(rs.first()){
                        tsid.setText(rs.getString(1));
                        tsname.setText(rs.getString(2));
                        tscity.setText(rs.getString(4));
                        tsdept.setText(rs.getString(3));
                        tsmark1.setText(rs.getString(5));
                        tsmark2.setText(rs.getString(6));
                        tsmark3.setText(rs.getString(7));
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });

            btnLast = new JButton("Last");
            btnLast.setBounds(200, 440, 150, 30);
            btnLast.setFont(f);
            add(btnLast);
            btnLast.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        if(rs.last()){
                        tsid.setText(rs.getString(1));
                        tsname.setText(rs.getString(2));
                        tscity.setText(rs.getString(4));
                        tsdept.setText(rs.getString(3));
                        tsmark1.setText(rs.getString(5));
                        tsmark2.setText(rs.getString(6));
                        tsmark3.setText(rs.getString(7));
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });

            setTitle("ScrollableEvent");
            setSize(400, 560);
            setBackground(Color.BLUE);
            setResizable(false);
            setLayout(null);
            setVisible(true);
            // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ScrollableEvent se = new ScrollableEvent();
    }
}