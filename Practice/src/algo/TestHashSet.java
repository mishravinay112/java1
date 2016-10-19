package algo;

import java.util.HashSet;
import java.util.Scanner;

class User {
	String id;
	String name;
	String MobNo;
	int UserNo;
	
	int i=0;
	User(String id, String name, String MobNo) {
		this.id = id;
		this.name = name;
		this.MobNo = MobNo;
	}

	public boolean equals(Object o)
	{
		
		System.out.println("equals");
		User t = (User) o;
		if (this.id != t.id || System.identityHashCode(this.MobNo)== System.identityHashCode(t.MobNo))
		{
			return false;
		
		}
		return true;

	}

	public int hashCode()
	{
		System.out.println("hashcode");
		if(i==0)
		{
			return (System.identityHashCode(id));
		}
		else
		{
			return (System.identityHashCode(MobNo));
		}
		
	}
	

	public String toString() {
		return (id + " " + name + " " + MobNo);
	}

}

public class TestHashSet {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user number:");
		int n = s.nextInt();
		
		HashSet<User> hs = new HashSet<User>();
		for (int i = 0; i < n; i++) {
			System.out.println("please enter id");
			int id = s.nextInt();
			System.out.println("please enter your mobile no");
			Long MobNo = s.nextLong();
			System.out.println("please enter you name");
			String name = s.next();
			//User u = new User(id, name, MobNo);
			int h=System.identityHashCode(MobNo);
			System.out.println(h);
			//hs.add(u);

		}
		System.out.println(hs);

	}
}

/*

*/