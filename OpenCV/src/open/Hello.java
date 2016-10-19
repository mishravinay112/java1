package open;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class Hello
{
   public static void main( String[] args )
   {
     /* System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
      Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
      System.out.println( "mat = " + mat.dump() );*/
	   
	   double a=2.5;
	   double c=a%2;
	   System.out.println(c);
   }
}
