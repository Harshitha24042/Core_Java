package Collections;
import java.util.TreeMap;
import java.util.*;
public class Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 768987952, "Novel");
		contact.put((long) 932789654, "Pavan");
		contact.put((long) 836708765, "Pranjal");
		contact.put((long) 957342612, "Vishnu");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}
