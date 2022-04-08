package Lambda;

import java.util.ArrayList;

public class Q4{
	public static void main(String[] args) {
		ArrayList<String> remove = new ArrayList<>();
		remove.add("Novel");
		remove.add("Pranjal");
		remove.add("Raju");
		remove.removeIf(r->r.length()%2!=0);
		System.out.println(remove);
	}
}