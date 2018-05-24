package program;
import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GetPixelColor
{
  static boolean getColor(int d,int e) throws IOException{
  File file= new File("image address");
  BufferedImage image = ImageIO.read(file);
  try {
	image.getRGB(d,e);
} catch (Exception e2) {
	System.out.printf("%d %d",d,e);
}
  if(e<0) {
	  e = 500 + e;
  }
  int clr=  image.getRGB(d+20,e); 
  int  red   = (clr & 0x00ff0000) >> 16;
  int  green = (clr & 0x0000ff00) >> 8;
  int  blue  =  clr & 0x000000ff;

  boolean st1=(green > 55); //right
  clr=  image.getRGB(d,e);
  
  red   = (clr & 0x00ff0000) >> 16;
  green = (clr & 0x0000ff00) >> 8;
  blue  =  clr & 0x000000ff;
//  boolean st2= (red >=40 && red <= 50);
  boolean st2= (green > 55);//left
  clr=  image.getRGB(d+10,e);
  green = (clr & 0x0000ff00) >> 8;
  boolean st3= (green > 55);//front

  if(st1 || st2 || st3) {
//	  System.out.println("out");
	  return false;
  }else {
//	  System.out.println("in");
	  return true;
  }
  
  }
}
