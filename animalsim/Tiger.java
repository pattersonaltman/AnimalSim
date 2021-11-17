package animalsim;


public class Tiger extends BigCat{

	private int roarVolume;
	
	/*
	 * Constructors:
	 */
	
	public Tiger() {}
	
	public Tiger(String name) {
		super(name);
		}
	
	public Tiger(String name, String location) {
		super(name, location);
		}
	
	public Tiger(String name, String location, float size) {
		super(name, location, size);
		}
	
	public Tiger(String name, String location, float size, int age) {
		super(name, location, size, age);
		}
	
	public Tiger(String name, String location, float size, int age, float clawLength) {
		super(name, location, size, age, clawLength);
		}
	
	public Tiger(String name, String location, float size, int age, float clawLength, int roarVolume) {
		
		super(name, location, size, age, clawLength);
		this.roarVolume = roarVolume;
		
	}

	public static void main(String[] args) {

	}

	
	/*
	 * Get methods:
	 */
	
	
	public int getRoarVolume() {
		return roarVolume;
	}
	
	
	/*
	 * Set methods:
	 */
	
	
	public void setRoarVolume(int newRoarVolume) {
		this.roarVolume = newRoarVolume;
	}
	
	
	/*
	 * Other methods:
	 */
	
	
	
	public static void func221() {
		
	}
	
	
	public static void func222() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	/* End Child22 Class */
