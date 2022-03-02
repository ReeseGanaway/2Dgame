package main;

import javax.imageio.ImageIO;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;  
import main.GamePanel;

public class characterSelect extends Frame implements ActionListener{  
	
    JLabel l; JButton b; 
    public BufferedImage batman;
    public static GamePanel gamePanel;

    
    
    
    characterSelect(){  
    	//ImageIcon batman = new ImageIcon("/player/batman/batman_down_1.png"); // load the image to a imageIcon
    	//Image image = batman.getImage(); // transform it 
    	//Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    	//batman = new ImageIcon(newimg);  // transform it back
    	//Icon batman= new ImageIcon("/player/batman/batman_down_1.png");
//    	GamePanel gp = new GamePanel("");
//    	gamePanel=gp;
    	  
        l=new JLabel("Batman");  
        l.setBounds(50,100, 250,20);      
        try {
        batman = ImageIO.read(getClass().getResourceAsStream("/player/batman/batman_character_select.png"));
        }catch(IOException e){
        	e.printStackTrace();
        }
        
      
        
       
        b = new JButton(new ImageIcon(batman));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setContentAreaFilled(false);
        b.setBounds(30,150,200,200);  
        b.addActionListener(this);    
        add(b);add(l);    
        setSize(600,600);  
        setLayout(null);  
        setVisible(true);  
        this.setBackground(Color.LIGHT_GRAY);
    }  
    
 
    
    public static void main(String[] args) { 

    	new characterSelect(); 
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D RPG");
		
		GamePanel gamePanel = new GamePanel("Batman");
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		this.setVisible(false);
		
		gamePanel.startGameThread();
		
	} 
    
}  

