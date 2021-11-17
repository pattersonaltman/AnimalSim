package animalsim;


public class Pterodactyl extends Bird{

	private float tailLength;
	
	/*
	 * Constructors:
	 */
	
	public Pterodactyl() {}
	
	public Pterodactyl(String name) {
		super(name);
	}
	
	public Pterodactyl(String name, String location) {	
		super(name, location);
	}
	
	public Pterodactyl(String name, String location, float size) {
		super(name, location, size);
	}
	
	public Pterodactyl(String name, String location, float size, int age) {
		
		super(name, location, size, age);
	}
	
	public Pterodactyl(String name, String location, float size, int age, float tailLength) {
		
		super(name, location, size, age);
		this.tailLength = tailLength;
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public float getTailLength() {
		return tailLength;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setTailLength(float newTailLength) {
		this.tailLength = newTailLength;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func221() {
		
	}
	
	
	public static void func222() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	/* End Child22 Class */
