package oopsConcepts;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "File persistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Data persistence";
    }
}



public class Assignment2Q6 {
	public static void main(String[] args) {
		FilePersistence f = new FilePersistence();
		DatabasePersistence d = new DatabasePersistence();
		System.out.println(f.persist());
		System.out.println(d.persist());
		
	}

}