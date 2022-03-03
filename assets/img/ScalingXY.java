package cg;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
public class ScalingXY extends Canvas{
   
	static int  x1,y1,x2,y2,sx,sy,xf,yf;
    ScalingXY(int x1,int y1,int x2,int y2,int sx,int sy,int xf,int yf){
    	this.x1=x1;
    	this.y1=y1;
    	this.x2=x2;
    	this.y2=y2;
    	this.sx=sx;
    	this.sy=sy;
    	this.xf=xf;
    	this.yf=yf;
    }
 
    public void paint(Graphics g){
    	int xn1,yn1,xn2,yn2;
  
    	g.setColor(Color.blue);
    	g.drawRect(x1,y1,x2,y2);
  
    	xn1=x1-xf;
		yn1=y1-yf;
		xn2=x2-xf;
		yn2=y2-yf;
		
		xn1 = xn1*sx;
		yn1 = yn1*sy;
		xn2 = xn2*sx;
		yn2 = yn2*sy;
		  
		xn1=xn1+xf;
		yn1=yn1+yf;
		xn2=xn2+xf;
		yn2=yn2+yf;
		  
		g.setColor(Color.red);
		g.drawRect(xn1,yn1,xn2,yn2);
    }
 
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter lower left corner (x1,y1): ");
	    int x1=sc.nextInt();
	    int y1=sc.nextInt();
	    System.out.println("Enter upper right corner (x2,y2): ");
	    int x2=sc.nextInt();
	    int y2=sc.nextInt();
	    System.out.println("Enter scaling factors: ");
	    int sx=sc.nextInt();
	    int sy=sc.nextInt();
	    System.out.println("Enter the fixed-point (xf,yf): ");
	    int xf=sc.nextInt();
	    int yf=sc.nextInt();
	    ScalingXY sxy=new ScalingXY(x1,y1,x2,y2,sx,sy,xf,yf);
	    JFrame f=new JFrame("Scaling XY");
	    f.add(sxy);
	    f.setSize(500,500);
	    f.setVisible(true);
    }	
}