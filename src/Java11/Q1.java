package Java11;

public class Q1 {
	@FunctionalInterface
	public interface SimpleInterest{
		public void interest(int p, int r, int t); 
	}
	public static void main(String[] args) {
		SimpleInterest a = (var p, var r, var t)->System.out.println((p*r*t)/100);
		a.interest(100, 5, 2);
	}
}
