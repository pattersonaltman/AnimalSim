package animalsim;


public class Cheetah extends BigCat{

	private float speed;
	
	/*
	 * Constructors:
	 */
	
	public Cheetah() {}
	
	public Cheetah(String name) {
		super(name);
	}
	
	public Cheetah(String name, String location) {
		super(name, location);
	}
	
	public Cheetah(String name, String location, float size) {
		super(name, location, size);
	}
	
	public Cheetah(String name, String location, float size, int age) {
		super(name, location, size, age);
	}
	
	public Cheetah(String name, String location, float size, int age, float clawLength) {
		super(name, location, size, age, clawLength);
	}
	
	public Cheetah(String name, String location, float size, int age, float clawLength, float speed) {
		
		super(name, location, size, age, clawLength);
		this.speed = speed;
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public float getSpeed() {
		return speed;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setSpeed(float newSpeed) {
		this.speed = newSpeed;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func211() {
		
	}
	
	
	public static void func212() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	/* End Child21 Class */
