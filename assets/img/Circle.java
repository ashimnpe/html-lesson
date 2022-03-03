package cg;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Circle extends Canvas{
	
	static int xc, yc, r;
	
	Circle(int xc, int yc, int r){
		this.r=r;
		this.xc=xc;
		this.yc=yc;
	}
	
	public void fill(Graphics g, int x, int y, int xc, int yc) {
		g.fillOval(xc+x, yc+y, 5, 5);
		g.fillOval(xc+x, yc-y, 5, 5);
		g.fillOval(xc-x, yc+y, 5, 5);
		g.fillOval(xc-x, yc-y, 5, 5);
		g.fillOval(xc+y, yc+x, 5, 5);
		g.fillOval(xc+y, yc-x, 5, 5);
		g.fillOval(xc-y, yc+x, 5, 5);
		g.fillOval(xc-y, yc-x, 5, 5);
	}

	public void paint(Graphics g) {
		int x,y,p;
		x=0;
		y=r;
		fill(g,x,y,xc,yc);
		p=1-r;
		while(x<y) {
			x=x+1;
			if(p<0) {
				p=p+2*x+1;
			}
			else {
				y=y-1;
				p=p+2*x+1-2*y;
			}
			fill(g,x,y,xc,yc);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter center (xc,yc): ");
		int xc = sc.nextInt();
		int yc = sc.nextInt();
		System.out.println("Enter radius r: ");
		int r = sc.nextInt();
		Circle c = new Circle(xc, yc, r);
		JFrame f = new JFrame("Circle");
		f.setSize(300,300);
		f.add(c);
		f.setVisible(true);
	}
}
