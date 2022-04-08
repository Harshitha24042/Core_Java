package Streams;

import java.util.ArrayList;
import java.util.Comparator;

class Trader {
	private String name;
	private String city;
	public Trader(String name, String city) {
		this.name=name;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	public String toString() {
		return "name="+name+",city="+city;
	}
}
public class Q3{
	public static void main(String[] args) {
		Trader t1 = new Trader("Novel","Delhi");
		Trader t2 = new Trader("Vishnu","Bangalore");
		Trader t3 = new Trader("Pavan","Noida");
		Trader t4 = new Trader("Rahul","Pune");
		Trader t5 = new Trader("Raju","Chennai");
		Trader t6 = new Trader("Shayaam","Pune");
		
		ArrayList<Trader> al = new ArrayList<>();
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		al.add(t5);
		al.add(t6);
		al.stream().forEach(p->System.out.println(p.getCity()));
		System.out.println("----------------------");
		al.stream().filter(p->p.getCity().equals("Pune")).sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p));
		System.out.println("----------------------");
		al.stream().filter(p->p.getName().startsWith("N")).sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p.toString()));
		System.out.println("----------------------");
		al.stream().filter(p->p.getCity().equals("Delhi")).forEach(p->System.out.println(p));
				
	}
}
