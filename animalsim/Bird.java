package animalsim;



public class Bird extends Animal {

	private String featherColor;
	
	/*
	 * Constructors:
	 */
	
	public Bird() {}
	
	public Bird(String name) {
		super(name);
	}
	
	public Bird(String name, String location) {
		super(name, location);
	}
	
	public Bird(String name, String location, float size) {
		super(name, location, size);
	}
	
	public Bird(String name, String location, float size, int age) {
		super(name, location, size, age);
	}
	
	public Bird(String name, String location, float size, int age, String featherColor) {
		
		super(name, location, size, age);
		this.featherColor = featherColor;
		
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public String getFeatherColor() {
		return featherColor;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setFeatherColor(String newFeatherColor) {
		this.featherColor = newFeatherColor;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func111() {
		
	}
	
	
	public static void func112() {
		
	}
	
	
	
	
	
	
	
	
	
	
}	/* End of Child11 Class */
