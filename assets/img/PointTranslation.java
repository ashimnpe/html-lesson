package cg;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class PointTranslation extends Canvas{
   static int  x,y,tx,ty;
    
   PointTranslation(int x,int y,int tx,int ty){
	    this.x=x;
	    this.y=y;
	    this.tx=tx;
	    this.ty=ty;
   	}
 
   public void paint(Graphics g){
	  int xn,yn;
	  g.setColor(Color.blue);
	  g.fillOval(x,y,10,10);
	  xn=x+tx;
	  yn=y+ty;
	  g.setColor(Color.red);
	  g.fillOval(xn,yn,10,10);
  }
 
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter point (x,y): ");
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("Enter translation factors: ");
    int tx=sc.nextInt();
    int ty=sc.nextInt();
    PointTranslation t=new PointTranslation(x,y,tx,ty);
    JFrame f=new JFrame("Point Translation");
    f.add(t);
    f.setSize(300,300);
    f.setVisible(true);
 }
}