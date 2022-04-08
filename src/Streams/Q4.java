package Streams;

import java.util.ArrayList;
import java.util.Comparator;

class Trader {
	private String name;
	private String city;
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
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
}
class Transaction{
	private Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String toString() {
		return "Transaction {Trader="+trader+",year="+year+",value="+value;
	}
}
public class Q4{
	public static void main(String[] args) {
		Trader t1 = new Trader("Novel","Delhi");
		Trader t2 = new Trader("Vishnu","Mumbai");
		Trader t3 = new Trader("Raju","Delhi");
		Trader t4 = new Trader("Shyaam","Chennai");
		Transaction ts1 = new Transaction(t1,2011,10000);
		Transaction ts2 = new Transaction(t2,2010,20000);
		Transaction ts3 = new Transaction(t3,2012,15000);
		Transaction ts4 = new Transaction(t4,2011,17000);
		
		ArrayList<Transaction> tr = new ArrayList<>();
		tr.add(ts1);
		tr.add(ts2);
		tr.add(ts3);
		tr.add(ts4);
		tr.stream().filter(p->p.getYear().equals(2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out.println(p)));
		tr.stream().filter(p->p.getTrader().getCity().equals("Delhi")).forEach(System.out.println());
		
	}
}
