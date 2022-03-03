package cg;

import java.applet.*;
import java.awt.*;
import java.awt.font.*;


public class DisplayText extends Applet{

	public void paint(Graphics g) {
		
		g.drawString("Hello world",40,40);
		g.setColor(Color.red);
		g.drawRect(20,20,100,50);
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		new DisplayText();
//	}

}
