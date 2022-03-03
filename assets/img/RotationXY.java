package cg;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
public class RotationXY extends Canvas{
   static int  x1,y1,x2,y2,xf,yf,angle;
    RotationXY(int x1,int y1,int x2,int y2,int xf,int yf,int angle){
	    this.x1=x1;
	    this.y1=y1;
	    this.x2=x2;
	    this.y2=y2;
	    this.xf=xf;
	    this.yf=yf;
	    this.angle=angle;
	 }
 
    public void paint(Graphics g){
    	double xn1,yn1,xn2,yn2,ang;
  
    	g.setColor(Color.blue);
    	g.drawLine(x1,y1,x2,y2);
  
    	ang=Math.toRadians(angle);
  
		xn1=x1-xf;
		yn1=y1-yf;
		xn2=x2-xf;
		yn2=y2-yf;
		
		xn1 = xn1*Math.cos(ang) - yn1*Math.sin(ang);
		yn1 = xn1*Math.sin(ang) + yn1*Math.cos(ang);
		xn2 = xn2*Math.cos(ang) - yn2*Math.sin(ang);
		yn2 = xn2*Math.sin(ang) + yn2*Math.cos(ang);
		  
		xn1=xn1+xf;
		yn1=yn1+yf;
		xn2=xn2+xf;
		yn2=yn2+yf;
		  
		g.setColor(Color.red);
		g.drawLine((int)Math.round(xn1),(int)Math.round(yn1),(int)Math.round(xn2),(int)Math.round(yn2));
    }
 
 public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first point (x1,y1): ");
	    int x1=sc.nextInt();
	    int y1=sc.nextInt();
	    System.out.println("Enter last point (x2,y2): ");
	    int x2=sc.nextInt();
	    int y2=sc.nextInt();
	    System.out.println("Enter fixed point (xf,yf): ");
	    int xf=sc.nextInt();
	    int yf=sc.nextInt();
	    System.out.println("Enter rotation angle: ");
	    int angle=sc.nextInt();
	    RotationXY rxy=new RotationXY(x1,y1,x2,y2,xf,yf,angle);
	    JFrame f=new JFrame("RotationXY");
	    f.add(rxy);
	    f.setSize(300,300);
	    f.setVisible(true);
 	}
}