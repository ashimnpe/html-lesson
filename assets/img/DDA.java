package cg;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class DDA extends Canvas {

	static int x1,y1,x2,y2;
	
	DDA(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}	
	
	public void paint(Graphics g) {
		int dx, dy;
		float Xinc, Yinc, x,y,steps;
		dy=y2-y1; 
		dx=x2-x1;
		g.fillOval(x1, y1, 10, 10);
		if(Math.abs(dy)>Math.abs(dx)) {
			steps=Math.abs(dy);
		}
		else {
			steps = Math.abs(dx);
		}
		x=x1;
		y=y1;
		Xinc = dx/steps;
		Yinc = dy/steps;
		while(steps!=0) {
			steps--;
			x=x+Xinc;
			y=y+Yinc;
			g.fillOval(Math.round(x), Math.round(y), 10, 10);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System .in);
		System.out.println("Enter first end x1 and y1: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter last end x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		DDA d = new DDA(x1, y1, x2, y2);
		JFrame f = new JFrame("DDA");
		f.add(d);
		f.setSize(300,300);
		f.setVisible(true);
		
	}

}
