package animalsim;


public class Toucan extends Bird{

	private String beakColor;
	
	/*
	 * Constructors:
	 */
	
	public Toucan() {}
	
	public Toucan(String name) {
		super(name);
	}
	
	public Toucan(String name, String location) {
		super(name, location);
	}
	
	public Toucan(String name, String location, float size) {
		super(name, location, size);
	}
	
	public Toucan(String name, String location, float size, int age) {
		super(name, location, size, age);
	}
	
	public Toucan(String name, String location, float size, int age, String featherColor) {
		super(name, location, size, age, featherColor);
	}
	
	public Toucan(String name, String location, float size, int age, String featherColor, String beakColor) {
		
		super(name, location, size, age, featherColor);
		this.beakColor = beakColor;
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public String getBeakColor() {
		return beakColor;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setBeakColor(String newBeakColor) {
		this.beakColor = newBeakColor;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func211() {
		
	}
	
	
	public static void func212() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	/* End Child21 Class */
