package Java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3{
	public static void main(String[] args) {
			String s = "A quick brown fox jumps over the lazy dog";
			String list[] = s.split(" ");
			
			List<String> list1 = new ArrayList<>();
			list1 = Arrays.asList(list);
			for (String p:list1) {
				System.out.println(p);
			}
			String[] arr = list1.toArray(String[]::new);
			System.out.println(Arrays.toString(arr));
			
	}
}
