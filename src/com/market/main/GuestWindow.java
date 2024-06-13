package com.market.main;

import javax.swing.*;
import java.awt.*;

public class GuestWindow extends JFrame {
	
	public GuestWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./Users/jaeseong/Documents/자바프로그래밍/image/doge.jpg").getImage());
	}
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);
		
		Font ft;
		ft = new Font("함초롱돋움", Font.BOLD, 15);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750) / 2 );
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 256);
	}
	
	ImageIcon imageIcon 

}
