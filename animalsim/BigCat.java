package animalsim;


public class BigCat extends Animal {

	private float clawLength;
	
	/*
	 * Constructors:
	 */
	
	public BigCat() {}
	
	public BigCat(String name) {
		super(name);
	}
	
	public BigCat(String name, String location) {
		super(name, location);
	}

	public BigCat(String name, String location, float size) {
		super(name, location, size);
	}
	
	public BigCat(String name, String location, float size, int age) {
		super(name, location, size, age);
	}
	
	public BigCat(String name, String location, float size, int age, float clawLength) {
		
		super(name, location, size, age);
		this.clawLength = clawLength;
		
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public float getClawLength() {
		return clawLength;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setClawLength(float newClawLength) {
		this.clawLength = newClawLength;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func121() {
		
	}
	
	
	public static void func122() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	/* End of Child12 Class */