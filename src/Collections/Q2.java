package Collections;

import java.util.HashSet;

public class Q2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
			hs.add("Novel");
			hs.add("Vishnu");
			hs.add("Pranjal");
			hs.add("Novel");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
			hs.add("Vishnu");
			
		System.out.println("After adding duplicate");
		System.out.println(hs);

	}

}