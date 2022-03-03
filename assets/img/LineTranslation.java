package cg;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.lang.*;
public class LineTranslation extends Canvas
{
   static int  x1,y1,x2,y2,tx,ty;
    LineTranslation(int x1,int y1,int x2,int y2,int tx,int ty)
 {
    this.x1=x1;
    this.y1=y1;
    this.x2=x2;
    this.y2=y2;
    this.tx=tx;
    this.ty=ty;
 }
 public void paint(Graphics g)
  {
  int xn1,yn1,xn2,yn2;
  g.setColor(Color.blue);
  g.drawLine(x1,y1,x2,y2);
  xn1=x1+tx;
  yn1=y1+ty;
  xn2=x2+tx;
  yn2=y2+ty;
  g.setColor(Color.red);
  g.drawLine(xn1,yn1,xn2,yn2);
  }
 
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first point (x1,y1): ");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    System.out.println("Enter last point (x2,y2): ");
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    System.out.println("Enter translation factors: ");
    int tx=sc.nextInt();
    int ty=sc.nextInt();
    LineTranslation t2=new LineTranslation(x1,y1,x2,y2,tx,ty);
    JFrame f=new JFrame("Line Translation");
    f.add(t2);
    f.setSize(400,400);
    f.setVisible(true);
 }
}