package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
	private String name;
	private int calories;
	private int price;
	private String colour;
	public Fruit(String name, int calories, int price, String colour) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.colour=colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		return "Fruit{"+"name='"+ name +",calories="+calories+ ",price="+price+",colour="+colour+"}";
	}
} 
public class Q1{
	public static List<String> reverseSort(ArrayList<Fruit> fruits){
		ArrayList<Fruit> fruitName = fruits.stream()
				.filter(p -> p.getCalories()<100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
				.collect(Collectors.toCollection(ArrayList::new));
		
		ArrayList<String> fruitName1 = new ArrayList<>();
	       for(Fruit fruit:fruitName){
	           fruitName1.add(fruit.getName());
	       }
	        System.out.println(fruitName1);
	        return fruitName1;
	    }

	    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
	        Fruits=Fruits.stream()
	                .sorted(Comparator.comparing(Fruit::getColour))
	                .collect(Collectors.toCollection(ArrayList::new));
	        return Fruits;
	    }

	    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
	        fruits=fruits.stream()
	                .filter(p->p.getColour().equals("Red"))
	                .sorted(Comparator.comparingInt(Fruit::getPrice))
	                .collect(Collectors.toCollection(ArrayList::new));
	        return fruits;
	    }

	    public static void main(String[] args) {
	        /*
	        List<Fruit> fruits = Arrays.asList(
	                new Fruit("mango",70,50,"Yellow"),
	                new Fruit("Apple",80,80,"Red"),
	                new Fruit("Banana",110,40,"Yellow"),
	                new Fruit("Pear",100,30,"Yellow"),
	                new Fruit("Grapes",60,50,"Green")
	        );
	        */
	        ArrayList<Fruit>fruits = new ArrayList<>();
	        fruits.add( new Fruit("mango",70,50,"Yellow"));
	        fruits.add(new Fruit("Apple",80,80,"Red"));
	        fruits.add(new Fruit("Banana",110,40,"Yellow"));
	        fruits.add( new Fruit("Pear",100,30,"Yellow"));
	        fruits.add(new Fruit("Grapes",60,50,"Green"));
	        reverseSort( fruits);
	        sort(fruits);
	        filterRedSortPrice(fruits);

	    

	
	}
}
	