package open;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class App 
{
	static
	{
		System.loadLibrary((Core.NATIVE_LIBRARY_NAME));
	}
	
	public static void main(String[] args)
	{
		System.out.println(Integer.MIN_VALUE);
		String filePath="C://Users//Vinay//Documents//back.jpg";
		 Mat newImage = Imgcodecs.imread(filePath);
		 if(newImage.dataAddr()==0){
		 System.out.println("Couldn't open file " + filePath);
		 } else{
		 ImageViewer imageViewer = new ImageViewer();
		 imageViewer.show(newImage, "Loaded image");
		 }
		// Long a=(long) 2000;
	}
}
