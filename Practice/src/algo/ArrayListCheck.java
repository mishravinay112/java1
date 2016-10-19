package algo;
import java.util.ArrayList;
public class ArrayListCheck extends ThreadDeath
{public static void main(String[] args) {
	

	ArrayList<Object> ar=new ArrayList<Object>();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.add(5);
	ar.add(2,6);
	ar.add("vinay");
	
	
	System.out.println(ar);
}
}
