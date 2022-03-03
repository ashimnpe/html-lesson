package cg;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Bresenham extends Canvas{
	static int x1, x2, y1, y2;
	
	Bresenham(int x1,int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public void paint(Graphics g) {
		int dy, dx, x, y, Xinc, Yinc, steps, p;
		dx = Math.abs(x2-x1);
		dy = Math.abs(y2-y1);
		if(x2>x1) {
			Xinc = 1;
		}
		else {
			Xinc = -1;
		}
				
		if(y2>y1) {
			Yinc = 1;
		}
		else {
			Yinc = -1;
		}
		
		g.fillOval(x1, y1, 10, 10);
		
		if(dy>dx) {
			steps = dy;
		}
		else {
			steps = dx;
		}
		
		x=x1;
		y=y1;
		if(dx>dy) {
			p=2*dy-dx;
			while(steps!=0) {
				steps--;
				if(p<0) {
					x=x+Xinc;
					y=y;
					p=p+2*dy;
				}
				else {
					x=x+Xinc;
					y=y+Yinc;
					p=p+2*dy-2*dx;
				}
				g.fillOval(Math.round(x), Math.round(y), 10, 10);
			}
		}
		else {
			p = 2*dx-dy;
			while(steps!=0) {
				steps--;
				if(p<0) {
					x=x;
					y=y+Yinc;
					p=p+2*dx;
				}
				else {
					x=x+Xinc;
					y=y+Yinc;
					p=p+2*dx-2*dy;
				}
				g.fillOval(Math.round(x), Math.round(y), 10, 10);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first end x1 and y1");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter last end x2 and y2");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Bresenham b = new Bresenham(x1,y1,x2,y2);
		JFrame f = new JFrame("Bresenham");
		f.add(b);
		f.setSize(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
}