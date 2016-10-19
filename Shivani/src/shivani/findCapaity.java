package shivani;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class findCapaity {
public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0; i<17; i++)
	{
		list.add(i);
		System.out.format("size: %2d, Capacity: %2d%n", list.size(), getCapacity(list));
	}
	
}

private static Object getCapacity(ArrayList<Integer> list) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	// TODO Auto-generated method stub
	Field datafield=ArrayList.class.getDeclaredField("elementData");
	datafield.setAccessible(true);
	return ((Object[]) datafield.get(list)).length;
}
}
