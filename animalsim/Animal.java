package animalsim;

public class Animal {

	private String name;
	private String location;
	private float size;
	private int age;
	
	
	/*
	 * Constructors:
	 */
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
		}	
	
	public Animal(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public Animal(String name, String location, float size) {
		this.name = name;
		this.location = location;
		this.size = size;
	}
	
	public Animal(String name, String location, float size, int age) {
		this.name = name;
		this.location = location;
		this.size = size;
		this.age = age;
	}
	
	
	public static void main(String[] args) {

		
	}
	
	/*
	 * Get methods:
	 */
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public float getSize() {
		return size;
	}
	
	public int getAge() {
		return age;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
	
	public void setSize(float newSize) {
		this.size = newSize;
	}

	
	/*
	 * Other Methods:
	 */
	
	
	public static void parentFunc1() {
		
	}

	
}  /* End of Class */
