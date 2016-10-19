package algo;

import java.util.Arrays;

public abstract  class Test
{
    public static void main(String[] args) throws Exception 
    {	
    	//Test t =new Test();
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); 
        
    }
}


