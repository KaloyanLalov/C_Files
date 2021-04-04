package projectwindow1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.Robot;
import java.awt.event.*;
public class windowbaby {
	JFrame window;
	Container con;
	JPanel MerasaPanel;
	JLabel MerasaLabel;
	Font foont = new Font("Times New Roman",Font.PLAIN,30 ) ;
	static int CROSSHAIR_CURSOR = 20; 
	public static void main(String[] args) {
		new windowbaby();
		
	}
	public windowbaby() {
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		window.setResizable(false);
		window.setAlwaysOnTop(true);
		window.setTitle("Hello");
		window.setCursor(Cursor.CROSSHAIR_CURSOR);
		con = window.getContentPane();
		
		
		MerasaPanel = new JPanel();
		MerasaPanel.setBackground(Color.black);
		MerasaPanel.setBounds(-90,0,500,50);
		con.add(MerasaPanel);
		MerasaLabel = new JLabel("Kaloyan Lalov entreprises");
		MerasaLabel.setForeground(Color.white);
		MerasaLabel.setFont(foont);
		
		MerasaPanel.add(MerasaLabel);
		
		MerasaPanel = new JPanel();
		MerasaPanel.setBackground(Color.black);
		MerasaPanel.setBounds(150,100,500,100);
		con.add(MerasaPanel);
		MerasaLabel = new JLabel("Who Wants To Be Millionaire!");
		MerasaLabel.setForeground(Color.blue);
		MerasaLabel.setFont(foont);
		MerasaPanel.add(MerasaLabel);
		
		
	
		
	
	
	}
	
}
