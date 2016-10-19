package opencv;

//here is the face detection example : (you should change the paths to files according to your computer...)
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgcodecs.Imgcodecs.imwrite;
import static org.opencv.imgproc.Imgproc.rectangle;
//import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;
//
//Detects faces in an image, draws boxes around them, and writes the results
//to "faceDetection.png".
//
class DetectFaceDemo {
public void run() {
  System.out.println("\nRunning DetectFaceDemo");
  // Create a face detector from the cascade file in the resources
  // directory.
  CascadeClassifier faceDetector = new CascadeClassifier("D:\\OpenCV-3.1.0\\opencv-310\\opencv\\sources\\data\\lbpcascades\\lbpcascade_frontalface.xml");
  Mat image = imread("C:\\Users\\Vinay\\Documents\\back.jpg");
  // Detect faces in the image.
  // MatOfRect is a special container class for Rect.
  MatOfRect faceDetections = new MatOfRect();
  faceDetector.detectMultiScale(image, faceDetections);
  System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
  // Draw a bounding box around each face.
  for (Rect rect : faceDetections.toArray()) {
      rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
  }
  // Save the visualized detection.
  String filename = "faceDetection.png";
  System.out.println(String.format("Writing %s", filename));
  imwrite(filename, image);
  //FaceRecognizer fr;//= new LBPHFaceRecognizer();
}
}
public class FaceDetector {
public static void main(String[] args) {
  System.out.println("Hello, OpenCV");
  // Load the native library.
  //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
  //System.load("C:\\Users\\HP\\Downloads\\opencv 2.4.11\\opencv\\build\\java\\x64\\opencv_java2411.dll");
  System.load("C:\\Users\\HP\\Downloads\\opencv\\opencv\\build\\java\\x64\\opencv_java300.dll");
  new DetectFaceDemo().run();
}
}