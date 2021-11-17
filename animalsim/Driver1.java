package animalsim;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import assignment32.Animal;

public class Driver1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Make all ArrayLists
		 */
		
		ArrayList<Animal> arrAnimal = makeListAnimal();
		ArrayList<Bird> arrBird = makeListBird();
		ArrayList<BigCat> arrBigCat = makeListBigCat();
		ArrayList<Toucan> arrToucan = makeListToucan();
		ArrayList<Pterodactyl> arrPterodactyl = makeListPterodactyl();
		ArrayList<Tiger> arrTiger = makeListTiger();
		ArrayList<Cheetah> arrCheetah = makeListCheetah();				
		
		
		String pathname = "";	/* Directory pathname for the user's created text files to be saved to.
		 						   This will only be asked 1 time for the lifetime of the program. */
		
		int countCase3 = 0;		/* Used to do a single count for getting the directory pathname 1 time.
		 						   0 for the first time, 1 after pathname has been specified. */
		
		String suffix;			/* for printing objects to text file - dynamically creates new files with incrementing 
		 						  suffixes for the abstract pathname */
		int suffixVal = 0;		/* works with String suffix for numeric incrementation */
		
		
		
		
		for(;;)					//endless loop until user chooses 9 to exit
		{
			switch(menu())
			{
			case 1:
				menu2(arrAnimal, arrBird, arrBigCat, arrToucan, arrPterodactyl, arrTiger, arrCheetah);	
				break;
				
			case 2:
				
				int choice;
				Scanner sc = new Scanner(System.in);
				System.out.println("How would you like to delete an Animal?\n\n");
				System.out.println("1. Delete by index");
				System.out.println("2. Delete by search\n");
				System.out.println("Enter choice: ");
				choice = sc.nextInt();
				
				if(choice == 1)
				{
					deleteByIndex(arrAnimal, arrBird, arrBigCat, arrToucan, arrPterodactyl, arrTiger, arrCheetah);
				}
				else if(choice == 2)
				{
					deleteBySearch(arrAnimal, arrBird, arrBigCat, arrToucan, arrPterodactyl, arrTiger, arrCheetah);
				}
				
				break;
				
			case 3:
				
				System.out.println("\n\n\nAnimals:\n-------------\n");
				for(int i = 0; i < arrAnimal.size(); i++)
				{
					System.out.println("Name: " + arrAnimal.get(i).getName());
					System.out.println("Location: " + arrAnimal.get(i).getLocation());
					System.out.println("Size: " + arrAnimal.get(i).getSize());
					System.out.println("Age: " + arrAnimal.get(i).getAge() + "\n");
				}
				
				System.out.println("Birds:\n-------------\n");
				for(int i = 0; i < arrBird.size(); i++)
				{
					System.out.println("Name: " + arrBird.get(i).getName());
					System.out.println("Location: " + arrBird.get(i).getLocation());
					System.out.println("Size: " + arrBird.get(i).getSize());
					System.out.println("Age: " + arrBird.get(i).getAge());
					System.out.println("Feather Color: " + arrBird.get(i).getFeatherColor() + "\n");
				}
				
				System.out.println("BigCats:\n-------------\n");
				for(int i = 0; i < arrBigCat.size(); i++)
				{
					System.out.println("Name: " + arrBigCat.get(i).getName());
					System.out.println("Location: " + arrBigCat.get(i).getLocation());
					System.out.println("Size: " + arrBigCat.get(i).getSize());
					System.out.println("Age: " + arrBigCat.get(i).getAge());
					System.out.println("Claw Length: " + arrBigCat.get(i).getClawLength() + "\n");
				}
				
				System.out.println("Toucans:\n-------------\n");
				for(int i = 0; i < arrToucan.size(); i++)
				{
					System.out.println("Name: " + arrToucan.get(i).getName());
					System.out.println("Location: " + arrToucan.get(i).getLocation());
					System.out.println("Size: " + arrToucan.get(i).getSize());
					System.out.println("Age: " + arrToucan.get(i).getAge());
					System.out.println("Feather Color: " + arrToucan.get(i).getFeatherColor());
					System.out.println("Beak Color: " + arrToucan.get(i).getBeakColor() + "\n");
				}
				
				System.out.println("Pterodactyls:\n-------------\n");
				for(int i = 0; i < arrPterodactyl.size(); i++)
				{
					System.out.println("Name: " + arrPterodactyl.get(i).getName());
					System.out.println("Location: " + arrPterodactyl.get(i).getLocation());
					System.out.println("Size: " + arrPterodactyl.get(i).getSize());
					System.out.println("Age: " + arrPterodactyl.get(i).getAge());
					System.out.println("Feather Color: " + arrPterodactyl.get(i).getFeatherColor());
					System.out.println("Tail Length: " + arrPterodactyl.get(i).getTailLength() + "\n");
				}
				
				System.out.println("Tigers:\n-------------\n");
				for(int i = 0; i < arrTiger.size(); i++)
				{
					System.out.println("Name: " + arrTiger.get(i).getName());
					System.out.println("Location: " + arrTiger.get(i).getLocation());
					System.out.println("Size: " + arrTiger.get(i).getSize());
					System.out.println("Age: " + arrTiger.get(i).getAge());
					System.out.println("Claw Length: " + arrTiger.get(i).getClawLength());
					System.out.println("Roar Volume: " + arrTiger.get(i).getRoarVolume() + "\n");
				}
				
				System.out.println("Cheetahs:\n-------------\n");
				for(int i = 0; i < arrCheetah.size(); i++)
				{
					System.out.println("Name: " + arrCheetah.get(i).getName());
					System.out.println("Location: " + arrCheetah.get(i).getLocation());
					System.out.println("Size: " + arrCheetah.get(i).getSize());
					System.out.println("Age: " + arrCheetah.get(i).getAge());
					System.out.println("Claw Length: " + arrCheetah.get(i).getClawLength());
					System.out.println("Speed: " + arrCheetah.get(i).getSpeed() + "\n");
				}
					
				break;
				
			case 4:
				menu3(arrAnimal, arrBird, arrBigCat, arrToucan, arrPterodactyl, arrTiger, arrCheetah);	
				break;
				
			case 5:
				// print all objects to text file - new one each time
				
				/*
				 * Get directory pathname from user 1st time this switch case is executed. Don't ask directory path again
				 * for subsequent switch case calls.
				 * increment String suffix through int suffixVal
				 * create new file with pathname String set at beginning of main() per user, + suffix + ".txt"
				 * While file pathname already exists: Display error for attempted pathname, and try next incrementation
				 * Display success and directory pathname if attempted file creation is successful
				 */
				if(countCase3 == 0)
				{
					Scanner sc2 = new Scanner(System.in);
					System.out.println("\n\n\nEnter the pathname of the directory you would like the file to "
							+ "be created to.\n\nNote: This will only be asked once for the first creation of a text file."
							+ " All subsequent\n\ttext file creation will be created to the same directory.");
					System.out.println("\nDirectory Pathname: ");
					pathname = sc2.nextLine();
					
					countCase3++;	// directory specification won't be asked again for the life of the program.
				}
				
				suffixVal++;
				suffix = String.valueOf(suffixVal);
				File file = new File(pathname + "AnimalObjects" + suffix + ".txt");
				while(file.createNewFile() == false)
				{
					System.out.println("\nError: File was not created with file name: " + pathname + "AnimalObjects" + suffix + ".txt\n"
							+ "Error Reason: The file with this pathname may already exist.\n"
							+ "Auto-Action: File will be attempted with next file-pathname incrementation.\n" );
					suffixVal++;
					suffix = String.valueOf(suffixVal);
					file = new File(pathname + "AnimalObjects" + suffix + ".txt");
				}
				System.out.println("\n\nYour file was created.\nDirectory Pathname: " + pathname + "AnimalObjects" + suffix + ".txt\n\n");
				
				
				/*
				 * print all objects in ArrayLists to the newly created file
				 */
				FileWriter fw = new FileWriter(file);
								
				fw.write("Animals:\n-------------\n\n");
				for(int i = 0; i < arrAnimal.size(); i++)
				{
					fw.write("Name: " + arrAnimal.get(i).getName() + "\n");
					fw.write("Location: " + arrAnimal.get(i).getLocation() + "\n");
					fw.write("Size: " + arrAnimal.get(i).getSize() + "\n");
					fw.write("Age: " + arrAnimal.get(i).getAge() + "\n\n");
				}
				
				fw.write("\n\nBirds:\n-------------\n\n");
				for(int i = 0; i < arrBird.size(); i++)
				{
					fw.write("Name: " + arrBird.get(i).getName() + "\n");
					fw.write("Location: " + arrBird.get(i).getLocation() + "\n");
					fw.write("Size: " + arrBird.get(i).getSize() + "\n");
					fw.write("Age: " + arrBird.get(i).getAge() + "\n");
					fw.write("Feather Color: " + arrBird.get(i).getFeatherColor() + "\n\n");
				}
				
				fw.write("\n\nBigCats:\n-------------\n\n");
				for(int i = 0; i < arrBigCat.size(); i++)
				{
					fw.write("Name: " + arrBigCat.get(i).getName() + "\n");
					fw.write("Location: " + arrBigCat.get(i).getLocation() + "\n");
					fw.write("Size: " + arrBigCat.get(i).getSize() + "\n");
					fw.write("Age: " + arrBigCat.get(i).getAge() + "\n");
					fw.write("Claw Length: " + arrBigCat.get(i).getClawLength() + "\n\n");
				}
				
				fw.write("\n\nToucans:\n-------------\n\n");
				for(int i = 0; i < arrToucan.size(); i++)
				{
					fw.write("Name: " + arrToucan.get(i).getName() + "\n");
					fw.write("Location: " + arrToucan.get(i).getLocation() + "\n");
					fw.write("Size: " + arrToucan.get(i).getSize() + "\n");
					fw.write("Age: " + arrToucan.get(i).getAge() + "\n");
					fw.write("Feather Color: " + arrToucan.get(i).getFeatherColor() + "\n");
					fw.write("Beak Color: " + arrToucan.get(i).getBeakColor() + "\n\n");
				}
				
				fw.write("\n\nPterodactyls:\n-------------\n\n");
				for(int i = 0; i < arrPterodactyl.size(); i++)
				{ 
					fw.write("Name: " + arrPterodactyl.get(i).getName() + "\n");
					fw.write("Location: " + arrPterodactyl.get(i).getLocation() + "\n");
					fw.write("Size: " + arrPterodactyl.get(i).getSize() + "\n");
					fw.write("Age: " + arrPterodactyl.get(i).getAge() + "\n");
					fw.write("Feather Color: " + arrPterodactyl.get(i).getFeatherColor() + "\n");
					fw.write("Tail Length: " + arrPterodactyl.get(i).getTailLength() + "\n\n");
				}
				
				fw.write("\n\nTigers:\n-------------\n\n");
				for(int i = 0; i < arrTiger.size(); i++)
				{
					fw.write("Name: " + arrTiger.get(i).getName() + "\n");
					fw.write("Location: " + arrTiger.get(i).getLocation() + "\n");
					fw.write("Size: " + arrTiger.get(i).getSize() + "\n");
					fw.write("Age: " + arrTiger.get(i).getAge() + "\n");
					fw.write("Claw Length: " + arrTiger.get(i).getClawLength() + "\n");
					fw.write("Roar Volume: " + arrTiger.get(i).getRoarVolume() + "\n\n");
				}
				
				fw.write("\n\nCheetahs:\n-------------\n\n");
				for(int i = 0; i < arrCheetah.size(); i++)
				{
					fw.write("Name: " + arrCheetah.get(i).getName() + "\n");
					fw.write("Location: " + arrCheetah.get(i).getLocation() + "\n");
					fw.write("Size: " + arrCheetah.get(i).getSize() + "\n");
					fw.write("Age: " + arrCheetah.get(i).getAge() + "\n");
					fw.write("Claw Length: " + arrCheetah.get(i).getClawLength() + "\n");
					fw.write("Speed: " + arrCheetah.get(i).getSpeed() + "\n\n");
				}

				fw.close();
				
				break;
				
			case 6:
					
				createByFile(arrAnimal, arrBird, arrBigCat, arrToucan, arrPterodactyl, arrTiger, arrCheetah);
				
				break;
				
			case 7:
					System.exit(0);
				break;
			}

		}
		

		
		
		
		
	}	//end main()-----------------------------
	
	
	
	
	
	/*
	 * Populate program with objects from text files
	 */
	
	public static void createByFile(ArrayList<Animal> arrAnimal, ArrayList<Bird> arrBird, ArrayList<BigCat> arrBigCat, ArrayList<Toucan> arrToucan, 
			ArrayList<Pterodactyl> arrPterodactyl, ArrayList<Tiger> arrTiger, ArrayList<Cheetah> arrCheetah) throws FileNotFoundException {
		
		Scanner sc2 = new Scanner(System.in);
		String pathname;
		System.out.println("\n\n\nEnter the directory pathname of the file you want to use.");
		System.out.println("\nFile Pathname: ");
		pathname = sc2.nextLine();
		
		File file = new File(pathname);
		
		Scanner sc = new Scanner(file);
		
		String line;
		int countAnimal = 0;		/* Counts for how many of each Animal objects will have been created by the end of the file. */
		int countBird = 0;			/* +1 each time a new one created */
		int countBigCat = 0;
		int countToucan = 0;
		int countPterodactyl = 0;
		int countTiger = 0;
		int countCheetah = 0;
	
		
		String name;
		String location;
		float size;
		int age;
		String featherColor;
		float clawLength;
		String beakColor;
		float tailLength;
		int roarVolume;
		float speed;
		
		
		while(sc.hasNext())
		{
			line = sc.nextLine();	
			
			switch(line)
			
			{
			case "Animal":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				arrAnimal.add(new Animal(name, location, size, age));
				countAnimal++;
				
				break;
				
			case "Bird":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				sc.nextLine();
				featherColor = sc.nextLine();
				arrBird.add(new Bird(name, location, size, age, featherColor));
				countBird++;
				
				break;
				
			case "BigCat":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				clawLength = sc.nextFloat();
				arrBigCat.add(new BigCat(name, location, size, age, clawLength));
				countBigCat++;
				
				break;
				
			case "Toucan":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				sc.nextLine();
				featherColor = sc.nextLine();
				beakColor = sc.nextLine();
				arrToucan.add(new Toucan(name, location, size, age, featherColor, beakColor));
				countToucan++;
				
				break;
				
			case "Pterodactyl":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				tailLength = sc.nextFloat();
				arrPterodactyl.add(new Pterodactyl(name, location, size, age, tailLength));
				countPterodactyl++;
				
				break;
				
			case "Tiger":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				clawLength = sc.nextFloat();
				roarVolume = sc.nextInt();
				arrTiger.add(new Tiger(name, location, size, age, clawLength, roarVolume));
				countTiger++;
				
				break;
				
			case "Cheetah":
				
				name = sc.nextLine();
				location = sc.nextLine();
				size = sc.nextFloat();
				age = sc.nextInt();
				clawLength = sc.nextFloat();
				speed = sc.nextFloat();
				arrCheetah.add(new Cheetah(name, location, size, age, clawLength, speed));
				countCheetah++;
				
				break;
				
			}	//end switch()
			
		}	//end while()
		
		System.out.println("\n\n\nTotal Animal objects created:\n");
		System.out.println("Animals: " + countAnimal);
		System.out.println("Birds: " + countBird);
		System.out.println("BigCats: " + countBigCat);
		System.out.println("Toucans: " + countToucan);
		System.out.println("Pterodactyls: " + countPterodactyl);
		System.out.println("Tigers: " + countTiger);
		System.out.println("Cheetahs: " + countCheetah);
		System.out.println("\n\n");
		
	}
	
	
	
	
	
	
	
	
	
	/*
	 * Object search methods:
	 */
	
	public static void searchAnimal(ArrayList<Animal> arrAnimal) {
				
		String name;
		String location;
		float size;
		int age;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Animal's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrAnimal.size(); i++)
		{
			
			if(name.equals(arrAnimal.get(i).getName()) && location.equals(arrAnimal.get(i).getLocation()) &&
					 size == arrAnimal.get(i).getSize() && age == arrAnimal.get(i).getAge())
			{
				exists = true;
				System.out.println("Animal found in list at index: " + i + "\n");
				System.out.println("Name: " + arrAnimal.get(i).getName());
				System.out.println("Location: " + arrAnimal.get(i).getLocation());
				System.out.println("Size: " + arrAnimal.get(i).getSize());
				System.out.println("Age: " + arrAnimal.get(i).getAge() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Animal specified does not exist:\n");
			System.out.println("Animal:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("\n\n\n");
		}
	}
	
	public static void searchBird(ArrayList<Bird> arrBird) {
	
		String name;
		String location;
		float size;
		int age;
		String featherColor;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bird's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter feather color: ");
		featherColor = sc.next();		/* Uses sc.next() instead of sc.nextLine() because trying to use sc.nextLine()
		 									after sc.nextInt() will not take input data correctly due to sc.nextInt() not
		 									clearing the buffer. 
		 									See searchToucan() method for alternative fix: place a sc.nextLine() immediately 
		 									after using a sc.nextInt() WITH NO ASSIGNMENT TO A VARIABLE */
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrBird.size(); i++)
		{
			
			if(name.equals(arrBird.get(i).getName()) && location.equals(arrBird.get(i).getLocation()) &&
				size == arrBird.get(i).getSize() && age == arrBird.get(i).getAge() && featherColor.equals(arrBird.get(i).getFeatherColor()))
			{
				exists = true;
				System.out.println("Bird found in list at index: " + i + "\n");
				System.out.println("Name: " + arrBird.get(i).getName());
				System.out.println("Location: " + arrBird.get(i).getLocation());
				System.out.println("Size: " + arrBird.get(i).getSize());
				System.out.println("Age: " + arrBird.get(i).getAge());
				System.out.println("Feather Color: " + arrBird.get(i).getFeatherColor() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Bird specified does not exist:\n");
			System.out.println("Bird:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Feather Color: " + featherColor);
			System.out.println("\n\n\n");
		}
	}

	public static void searchBigCat(ArrayList<BigCat> arrBigCat) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the BigCat's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrBigCat.size(); i++)
		{
			
			if(name.equals(arrBigCat.get(i).getName()) && location.equals(arrBigCat.get(i).getLocation()) &&
				size == arrBigCat.get(i).getSize() && age == arrBigCat.get(i).getAge() && clawLength == arrBigCat.get(i).getClawLength())
			{
				exists = true;
				System.out.println("BigCat found in list at index: " + i + "\n");
				System.out.println("Name: " + arrBigCat.get(i).getName());
				System.out.println("Location: " + arrBigCat.get(i).getLocation());
				System.out.println("Size: " + arrBigCat.get(i).getSize());
				System.out.println("Age: " + arrBigCat.get(i).getAge());
				System.out.println("Claw Length: " + arrBigCat.get(i).getClawLength() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The BigCat specified does not exist:\n");
			System.out.println("BigCat:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("\n\n\n");
		}
	}

	public static void searchToucan(ArrayList<Toucan> arrToucan) {
		
		String name;
		String location;
		float size;
		int age;
		String featherColor;
		String beakColor;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Toucan's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		sc.nextLine();		/* This line is necessary after the use of sc.nextInt() to clear the buffer, otherwise
		 						trying to use an assignment with sc.nextLine() afterwards will fail to get input correctly. 
		 						See searchBird() method for alternative way of doing it: use sc.next() instead of sc.nextLine() */
		System.out.println("\nEnter feather color: ");
		featherColor = sc.nextLine();
		System.out.println("\nEnter beak color: ");
		beakColor = sc.nextLine();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrToucan.size(); i++)
		{
			
			if(name.equals(arrToucan.get(i).getName()) && location.equals(arrToucan.get(i).getLocation()) &&
				size == arrToucan.get(i).getSize() && age == arrToucan.get(i).getAge() && featherColor.equals(arrToucan.get(i).getFeatherColor())
				 && beakColor.equals(arrToucan.get(i).getBeakColor()))
			{
				exists = true;
				System.out.println("Toucan found in list at index: " + i + "\n");
				System.out.println("Name: " + arrToucan.get(i).getName());
				System.out.println("Location: " + arrToucan.get(i).getLocation());
				System.out.println("Size: " + arrToucan.get(i).getSize());
				System.out.println("Age: " + arrToucan.get(i).getAge());
				System.out.println("Feather Color: " + arrToucan.get(i).getFeatherColor());
				System.out.println("Beak Color: " + arrToucan.get(i).getBeakColor() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Toucan specified does not exist:\n");
			System.out.println("Toucan:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Feather Color: " + featherColor);
			System.out.println("Beak Color: " + beakColor);
			System.out.println("\n\n\n");
		}
	}
	
	public static void searchPterodactyl(ArrayList<Pterodactyl> arrPterodactyl) {
		
		String name;
		String location;
		float size;
		int age;
		float tailLength;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Pterodactyl's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter tail length: ");
		tailLength = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrPterodactyl.size(); i++)
		{
			
			if(name.equals(arrPterodactyl.get(i).getName()) && location.equals(arrPterodactyl.get(i).getLocation()) &&
				size == arrPterodactyl.get(i).getSize() && age == arrPterodactyl.get(i).getAge() && tailLength == arrPterodactyl.get(i).getTailLength())
			{
				exists = true;
				System.out.println("Pterodactyl found in list at index: " + i + "\n");
				System.out.println("Name: " + arrPterodactyl.get(i).getName());
				System.out.println("Location: " + arrPterodactyl.get(i).getLocation());
				System.out.println("Size: " + arrPterodactyl.get(i).getSize());
				System.out.println("Age: " + arrPterodactyl.get(i).getAge());
				System.out.println("Tail Length: " + arrPterodactyl.get(i).getTailLength() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Pterodactyl specified does not exist:\n");
			System.out.println("Pterodactyl:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Tail Length: " + tailLength);
			System.out.println("\n\n\n");
		}
	}

	public static void searchTiger(ArrayList<Tiger> arrTiger) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		int roarVolume;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Tiger's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\nEnter roar volume: ");
		roarVolume = sc.nextInt();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrTiger.size(); i++)
		{
			
			if(name.equals(arrTiger.get(i).getName()) && location.equals(arrTiger.get(i).getLocation()) &&
				size == arrTiger.get(i).getSize() && age == arrTiger.get(i).getAge() && clawLength == arrTiger.get(i).getClawLength()
				 && roarVolume == arrTiger.get(i).getRoarVolume())
			{
				exists = true;
				System.out.println("Tiger found in list at index: " + i + "\n");
				System.out.println("Name: " + arrTiger.get(i).getName());
				System.out.println("Location: " + arrTiger.get(i).getLocation());
				System.out.println("Size: " + arrTiger.get(i).getSize());
				System.out.println("Age: " + arrTiger.get(i).getAge());
				System.out.println("Claw Length: " + arrTiger.get(i).getClawLength());
				System.out.println("Roar Volume: " + arrTiger.get(i).getRoarVolume() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Tiger specified does not exist:\n");
			System.out.println("Tiger:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("Roar Volume: " + roarVolume);
			System.out.println("\n\n\n");
		}
	}

	public static void searchCheetah(ArrayList<Cheetah> arrCheetah) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		float speed;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cheetah's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\nEnter speed: ");
		speed = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrCheetah.size(); i++)
		{
			
			if(name.equals(arrCheetah.get(i).getName()) && location.equals(arrCheetah.get(i).getLocation()) &&
				size == arrCheetah.get(i).getSize() && age == arrCheetah.get(i).getAge() && clawLength == arrCheetah.get(i).getClawLength()
				 && speed == arrCheetah.get(i).getSpeed())
			{
				exists = true;
				System.out.println("Cheetah found in list at index: " + i + "\n");
				System.out.println("Name: " + arrCheetah.get(i).getName());
				System.out.println("Location: " + arrCheetah.get(i).getLocation());
				System.out.println("Size: " + arrCheetah.get(i).getSize());
				System.out.println("Age: " + arrCheetah.get(i).getAge());
				System.out.println("Claw Length: " + arrCheetah.get(i).getClawLength());
				System.out.println("Speed: " + arrCheetah.get(i).getSpeed() + "\n\n\n");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Cheetah specified does not exist:\n");
			System.out.println("Cheetah:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("Speed: " + speed);
			System.out.println("\n\n\n");
		}
	}

	
	
	
	
	
	
	
	
	/*
	 * Object get-parameter methods:
	 */
	
	public static String getName() {
		String name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the name? (String) : ");
		name = sc.nextLine();
		//sc.close();
		return name;
	}
	
	public static String getLocation() {
		String location = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Where do they live? (String) : ");
		location = sc.nextLine();
		return location;
	}
	
	public static float getSize() {
		float size;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is their size? (Float) : ");
		size = sc.nextFloat();
		return size;
	}
	
	public static int getAge() {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is their age? (Int) : ");
		age = sc.nextInt();
		return age;
	}
	
	public static String getFeatherColor() {
		String featherColor = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the feather color? (String) : ");
		featherColor = sc.nextLine();
		return featherColor;
	}
	
	public static float getClawLength() {
		float clawLength;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the length of the claws? (Float) : ");
		clawLength = sc.nextFloat();
		return clawLength;
	}
	
	public static String getBeakColor() {
		String beakColor = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the color of the beak? (String) : ");
		beakColor = sc.nextLine();
		return beakColor;
	}
	
	public static float getTailLength() {
		float tailLength;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the length of the tail? (Float) : ");
		tailLength = sc.nextFloat();
		return tailLength;
	}
	
	public static int getRoarVolume() {
		int roarVolume;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the volume of its roar? (Int) : ");
		roarVolume = sc.nextInt();
		return roarVolume;
	}
	
	public static float getSpeed() {
		float speed;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is its speed? (Float) : ");
		speed = sc.nextFloat();
		return speed;
	}
	
	
	
	
	
	
	/*
	 * Animal/Object creation methods:
	 */
	
	public static Animal makeAnimal() {
		Animal a = new Animal(getName(), getLocation(), getSize(), getAge());
		return a;
	}
	
	public static Bird makeBird() {
		Bird b = new Bird(getName(), getLocation(), getSize(), getAge(), getFeatherColor());
		return b;
	}
	
	public static BigCat makeBigCat() {
		BigCat bc = new BigCat(getName(), getLocation(), getSize(), getAge(), getClawLength());
		return bc;
	}
	
	public static Toucan makeToucan() {
		Toucan tc = new Toucan(getName(), getLocation(), getSize(), getAge(), getFeatherColor(), getBeakColor());
		return tc;
	}
	
	public static Pterodactyl makePterodactyl() {
		Pterodactyl p = new Pterodactyl(getName(), getLocation(), getSize(), getAge(), getTailLength());
		return p;
	}
	
	public static Tiger makeTiger() {
		Tiger tg = new Tiger(getName(), getLocation(), getSize(), getAge(), getClawLength(), getRoarVolume());
		return tg;
	}
	
	public static Cheetah makeCheetah() {
		Cheetah c = new Cheetah(getName(), getLocation(), getSize(), getAge(), getClawLength(), getSpeed());
		return c;
	}
	
	
	
	
	

	/*
	 * Menu methods:
	 */
	
	public static int menu() {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main Menu:\n\n\n");
		
		System.out.println("What would you like to do?\n");
		System.out.println("1. Create an Animal");
		System.out.println("2. Delete an Animal");
		System.out.println("3. Print all of your created Animals");
		System.out.println("4. Search for an Animal");
		System.out.println("5. Print all of your created Animals to a text file");
		System.out.println("6. Create Animal objects from a text file");
		System.out.println("7. Exit");

		System.out.println("\nEnter choice: ");

		choice = sc.nextInt();
		while(menuCheck(choice, 1, 7) == false)
		{
			choice = sc.nextInt();
		}
		return choice;		
	}
	
	public static void menu2(ArrayList<Animal> arrAnimal, ArrayList<Bird> arrBird, ArrayList<BigCat> arrBigCat, ArrayList<Toucan> arrToucan, 
			ArrayList<Pterodactyl> arrPterodactyl, ArrayList<Tiger> arrTiger, ArrayList<Cheetah> arrCheetah) {
		/*
		 * The menu for choice making an Animal or Animal-Child object.
		 * @param: all object ArrayLists created in the initial menu step. Objects are immediately added to the respective
		 * 		   list upon creation.
		 */
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What type of Animal object would you like to create?\n\n");
		System.out.println("Enter a number from the list.\n\n");
		System.out.println("1. Animal");
		System.out.println("2. Bird");
		System.out.println("3. BigCat");
		System.out.println("4. Toucan");
		System.out.println("5. Pterodactyl");
		System.out.println("6. Tiger");
		System.out.println("7. Cheetah");

		choice = sc.nextInt();
		while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7)
		{
			System.out.println("\nError: Your choice must be between 1 - 7\nPlease enter your choice:\n\n\n1. Animal\n2. Bird"
					+ "\n3. BigCat\n4. Toucan\n5. Pterodactyl\n6. Tiger\n7. Cheetah");
			choice = sc.nextInt();
		}
		
		switch(choice)						//all switch cases: call make__() method and add to respective ArrayList
		{
		case 1:
			arrAnimal.add(makeAnimal());
			break;
			
		case 2:
			arrBird.add(makeBird());
			break;
			
		case 3:
			arrBigCat.add(makeBigCat());
			break;
			
		case 4:
			arrToucan.add(makeToucan());
			break;
			
		case 5:
			arrPterodactyl.add(makePterodactyl());
			break;
			
		case 6:
			arrTiger.add(makeTiger());
			break;
			
		case 7:
			arrCheetah.add(makeCheetah());
			break;
		}
		
	}
		
	public static void menu3(ArrayList<Animal> arrAnimal, ArrayList<Bird> arrBird, ArrayList<BigCat> arrBigCat, ArrayList<Toucan> arrToucan, 
			ArrayList<Pterodactyl> arrPterodactyl, ArrayList<Tiger> arrTiger, ArrayList<Cheetah> arrCheetah) {
		/*
		 * The menu for searching for an Animal.
		 * @param: all object ArrayLists created in the initial menu step. The respective ArrayLists are passed to the
		 * search methods as arguments: search___(ArrayList<T> arr)
		 */
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n\n\nWhat type of Animal object would you like to search for?\n\n");
		System.out.println("Enter a number from the list.\n\n");
		System.out.println("1. Animal");
		System.out.println("2. Bird");
		System.out.println("3. BigCat");
		System.out.println("4. Toucan");
		System.out.println("5. Pterodactyl");
		System.out.println("6. Tiger");
		System.out.println("7. Cheetah");

		choice = sc.nextInt();
		
		while(menuCheck(choice, 1, 7) == false)
		{
			System.out.println("Please enter your choice:\n\n\n1. Animal\n2. Bird\n3. BigCat\n4. Toucan\n"
					+ "5. Pterodactyl\n6. Tiger\n7. Cheetah");
			choice = sc.nextInt();
		}
		
		switch(choice)						//all switch cases: call search___() method and add respective ArrayList
		{
		case 1:
			searchAnimal(arrAnimal);
			break;
			
		case 2:
			searchBird(arrBird);
			break;
			
		case 3:
			searchBigCat(arrBigCat);
			break;
			
		case 4:
			searchToucan(arrToucan);
			break;
			
		case 5:
			searchPterodactyl(arrPterodactyl);
			break;
			
		case 6:
			searchTiger(arrTiger);
			break;
			
		case 7:
			searchCheetah(arrCheetah);
			break;
		}

	}
	
	public static boolean menuCheck(int choice, int min, int max) {
		
		if(choice < min || choice > max)
		{
			System.out.println("Error: Your choice must be between " + min + " - " + max);
			return false;
		}
		else
		{
			return true;
		}
	}
	

	
	
	
	
	
	/*
	 * Object Deletion methods:
	 */
	
	public static void deleteByIndex(ArrayList<Animal> arrAnimal, ArrayList<Bird> arrBird, ArrayList<BigCat> arrBigCat, ArrayList<Toucan> arrToucan, 
			ArrayList<Pterodactyl> arrPterodactyl, ArrayList<Tiger> arrTiger, ArrayList<Cheetah> arrCheetah) {
		/*
		 * Method asks user for the type of Animal object followed by the index to be deleted.
		 */
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n\nWhat type of Animal object would you like to delete?\n\n");
		System.out.println("Enter a number from the list:");
		System.out.println("1. Animal");
		System.out.println("2. Bird");
		System.out.println("3. BigCat");
		System.out.println("4. Toucan");
		System.out.println("5. Pterodactyl");
		System.out.println("6. Tiger");
		System.out.println("7. Cheetah");
		
		choice = sc.nextInt();
		while(menuCheck(choice, 1, 7) == false)
		{
			choice = sc.nextInt();
		}
		
		int index;
		
		switch(choice)
		{
		
		case 1:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrAnimal.remove(index);
				System.out.println("\n\nAnimal at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tAnimal does not exist at index: " + index + "\n\n\n");
			}
			
			break;
			
		case 2:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrBird.remove(index);
				System.out.println("\n\nBird at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tBird does not exist at index: " + index + "\n\n\n");
			}
			
			break;
			
		case 3:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrBigCat.remove(index);
				System.out.println("\n\nBigCat at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tBigCat does not exist at index: " + index + "\n\n\n");
			}

			break;
			
		case 4:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrToucan.remove(index);
				System.out.println("\n\nToucan at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tToucan does not exist at index: " + index + "\n\n\n");
			}

			break;
			
		case 5:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrPterodactyl.remove(index);
				System.out.println("\n\nPterodactyl at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tPterodactyl does not exist at index: " + index + "\n\n\n");
			}

			break;
			
		case 6:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrTiger.remove(index);
				System.out.println("\n\nTiger at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tTiger does not exist at index: " + index + "\n\n\n");
			}

			break;
			
		case 7:
			
			System.out.println("What index would you like to delete?");
			index = sc.nextInt();
			
			try 
			{
				arrCheetah.remove(index);
				System.out.println("\n\nCheetah at index [" + index + "] removed.\n\n\n");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("\nError: Index out of bounds\n\tCheetah does not exist at index: " + index + "\n\n\n");
			}

			break;
			
		}
		
	}
	
	public static void deleteBySearch(ArrayList<Animal> arrAnimal, ArrayList<Bird> arrBird, ArrayList<BigCat> arrBigCat, ArrayList<Toucan> arrToucan, 
			ArrayList<Pterodactyl> arrPterodactyl, ArrayList<Tiger> arrTiger, ArrayList<Cheetah> arrCheetah) {
		/*
		 * 
		 */
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n\n\nWhat type of Animal object would you like to delete?\n\n");
		System.out.println("Enter a number from the list.\n\n");
		System.out.println("1. Animal");
		System.out.println("2. Bird");
		System.out.println("3. BigCat");
		System.out.println("4. Toucan");
		System.out.println("5. Pterodactyl");
		System.out.println("6. Tiger");
		System.out.println("7. Cheetah");

		choice = sc.nextInt();
		
		while(menuCheck(choice, 1, 7) == false)
		{
			System.out.println("Please enter your choice:\n\n\n1. Animal\n2. Bird\n3. BigCat\n4. Toucan\n"
					+ "5. Pterodactyl\n6. Tiger\n7. Cheetah");
			choice = sc.nextInt();
		}
		
		switch(choice)
		{
		case 1:
			deleteAnimal(arrAnimal);
			break;
			
		case 2:
			deleteBird(arrBird);
			break;
			
		case 3:
			deleteBigCat(arrBigCat);
			break;
			
		case 4:
			deleteToucan(arrToucan);
			break;
			
		case 5:
			deletePterodactyl(arrPterodactyl);
			break;
			
		case 6:
			deleteTiger(arrTiger);
			break;
			
		case 7:
			deleteCheetah(arrCheetah);
			break;
			
		}
		
	}
	
	public static void deleteAnimal(ArrayList<Animal> arrAnimal) {
		
		String name;
		String location;
		float size;
		int age;
		
		boolean exists = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Animal's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrAnimal.size(); i++)
		{
			
			if(name.equals(arrAnimal.get(i).getName()) && location.equals(arrAnimal.get(i).getLocation()) &&
					 size == arrAnimal.get(i).getSize() && age == arrAnimal.get(i).getAge())
			{
				exists = true;
				System.out.println("\n\nAnimal found at index [" + i + "]");
				arrAnimal.remove(i);
				System.out.println("\nAnimal at index [" + i + "] removed.");
			}
			
		}
		if(exists == true)
		{
			// do nothing
		}
		else if(exists == false)
		{
			System.out.println("The Animal specified does not exist:\n");
			System.out.println("Animal:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("\n\n\n");
		}
	}

	public static void deleteBird(ArrayList<Bird> arrBird) {
		
		String name;
		String location;
		float size;
		int age;
		String featherColor;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bird's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter feather color: ");
		featherColor = sc.next();		/* Uses sc.next() instead of sc.nextLine() because trying to use sc.nextLine()
		 									after sc.nextInt() will not take input data correctly due to sc.nextInt() not
		 									clearing the buffer. 
		 									See searchToucan() method for alternative fix: place a sc.nextLine() immediately 
		 									after using a sc.nextInt() WITH NO ASSIGNMENT TO A VARIABLE */
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrBird.size(); i++)
		{
			
			if(name.equals(arrBird.get(i).getName()) && location.equals(arrBird.get(i).getLocation()) &&
				size == arrBird.get(i).getSize() && age == arrBird.get(i).getAge() && featherColor.equals(arrBird.get(i).getFeatherColor()))
			{
				exists = true;
				System.out.println("\n\nBird found at index [" + i + "]");
				arrBird.remove(i);
				System.out.println("\nBird at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Bird specified does not exist:\n");
			System.out.println("Bird:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Feather Color: " + featherColor);
			System.out.println("\n\n\n");
		}

	}

	public static void deleteBigCat(ArrayList<BigCat> arrBigCat) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the BigCat's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrBigCat.size(); i++)
		{
			
			if(name.equals(arrBigCat.get(i).getName()) && location.equals(arrBigCat.get(i).getLocation()) &&
				size == arrBigCat.get(i).getSize() && age == arrBigCat.get(i).getAge() && clawLength == arrBigCat.get(i).getClawLength())
			{
				exists = true;
				System.out.println("\n\nBigCat found at index [" + i + "]");
				arrBigCat.remove(i);
				System.out.println("\nBigCat at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The BigCat specified does not exist:\n");
			System.out.println("BigCat:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("\n\n\n");
		}

	}
	
	public static void deleteToucan(ArrayList<Toucan> arrToucan) {
		
		String name;
		String location;
		float size;
		int age;
		String featherColor;
		String beakColor;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Toucan's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		sc.nextLine();		/* This line is necessary after the use of sc.nextInt() to clear the buffer, otherwise
		 						trying to use an assignment with sc.nextLine() afterwards will fail to get input correctly. 
		 						See searchBird() method for alternative way of doing it: use sc.next() instead of sc.nextLine() */
		System.out.println("\nEnter feather color: ");
		featherColor = sc.nextLine();
		System.out.println("\nEnter beak color: ");
		beakColor = sc.nextLine();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrToucan.size(); i++)
		{
			
			if(name.equals(arrToucan.get(i).getName()) && location.equals(arrToucan.get(i).getLocation()) &&
				size == arrToucan.get(i).getSize() && age == arrToucan.get(i).getAge() && featherColor.equals(arrToucan.get(i).getFeatherColor())
				 && beakColor.equals(arrToucan.get(i).getBeakColor()))
			{
				exists = true;
				System.out.println("\n\nToucan found at index [" + i + "]");
				arrToucan.remove(i);
				System.out.println("\nToucan at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Toucan specified does not exist:\n");
			System.out.println("Toucan:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Feather Color: " + featherColor);
			System.out.println("Beak Color: " + beakColor);
			System.out.println("\n\n\n");
		}

	}
	
	public static void deletePterodactyl(ArrayList<Pterodactyl> arrPterodactyl) {
		
		String name;
		String location;
		float size;
		int age;
		float tailLength;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Pterodactyl's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter tail length: ");
		tailLength = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrPterodactyl.size(); i++)
		{
			
			if(name.equals(arrPterodactyl.get(i).getName()) && location.equals(arrPterodactyl.get(i).getLocation()) &&
				size == arrPterodactyl.get(i).getSize() && age == arrPterodactyl.get(i).getAge() && tailLength == arrPterodactyl.get(i).getTailLength())
			{
				exists = true;
				System.out.println("\n\nPterodactyl found at index [" + i + "]");
				arrPterodactyl.remove(i);
				System.out.println("\nPterodactyl at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Pterodactyl specified does not exist:\n");
			System.out.println("Pterodactyl:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Tail Length: " + tailLength);
			System.out.println("\n\n\n");
		}

	}
	
	public static void deleteTiger(ArrayList<Tiger> arrTiger) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		int roarVolume;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Tiger's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\nEnter roar volume: ");
		roarVolume = sc.nextInt();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrTiger.size(); i++)
		{
			
			if(name.equals(arrTiger.get(i).getName()) && location.equals(arrTiger.get(i).getLocation()) &&
				size == arrTiger.get(i).getSize() && age == arrTiger.get(i).getAge() && clawLength == arrTiger.get(i).getClawLength()
				 && roarVolume == arrTiger.get(i).getRoarVolume())
			{
				exists = true;
				System.out.println("\n\nTiger found at index [" + i + "]");
				arrTiger.remove(i);
				System.out.println("\nTiger at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Tiger specified does not exist:\n");
			System.out.println("Tiger:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("Roar Volume: " + roarVolume);
			System.out.println("\n\n\n");
		}

	}
	
	public static void deleteCheetah(ArrayList<Cheetah> arrCheetah) {
		
		String name;
		String location;
		float size;
		int age;
		float clawLength;
		float speed;
		
		boolean exists = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Cheetah's information:\n");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("\nEnter location: ");
		location = sc.nextLine();
		System.out.println("\nEnter size: ");
		size = sc.nextFloat();
		System.out.println("\nEnter age: ");
		age = sc.nextInt();
		System.out.println("\nEnter claw length: ");
		clawLength = sc.nextFloat();
		System.out.println("\nEnter speed: ");
		speed = sc.nextFloat();
		System.out.println("\n\n");
		
		
		for(int i = 0; i < arrCheetah.size(); i++)
		{
			
			if(name.equals(arrCheetah.get(i).getName()) && location.equals(arrCheetah.get(i).getLocation()) &&
				size == arrCheetah.get(i).getSize() && age == arrCheetah.get(i).getAge() && clawLength == arrCheetah.get(i).getClawLength()
				 && speed == arrCheetah.get(i).getSpeed())
			{
				exists = true;
				System.out.println("\n\nCheetah found at index [" + i + "]");
				arrCheetah.remove(i);
				System.out.println("\nCheetah at index [" + i + "] removed.");
			}
		}
		if(exists == true)
		{ 
			// do nothing
		}
		else
		{
			System.out.println("The Cheetah specified does not exist:\n");
			System.out.println("Cheetah:");
			System.out.println("Name: " + name);
			System.out.println("Location: " + location);
			System.out.println("Size: " + size);
			System.out.println("Age: " + age);
			System.out.println("Claw Length: " + clawLength);
			System.out.println("Speed: " + speed);
			System.out.println("\n\n\n");
		}

	}
	
	
	
	
	
	
	
	
	/*
	 * ArrayList creation methods:
	 */
	
	public static ArrayList<Animal> makeListAnimal(){
		ArrayList<Animal> array = new ArrayList<Animal>();
		return array;
	}
	
	public static ArrayList<Bird> makeListBird(){
		ArrayList<Bird> array = new ArrayList<Bird>();
		return array;
	}
	
	public static ArrayList<BigCat> makeListBigCat(){
		ArrayList<BigCat> array = new ArrayList<BigCat>();
		return array;
	}
	
	public static ArrayList<Toucan> makeListToucan(){
		ArrayList<Toucan> array = new ArrayList<Toucan>();
		return array;
	}
	
	public static ArrayList<Pterodactyl> makeListPterodactyl(){
		ArrayList<Pterodactyl> array = new ArrayList<Pterodactyl>();
		return array;
	}
	
	public static ArrayList<Cheetah> makeListCheetah(){
		ArrayList<Cheetah> array = new ArrayList<Cheetah>();
		return array;
	}
	
	public static ArrayList<Tiger> makeListTiger(){
		ArrayList<Tiger> array = new ArrayList<Tiger>();
		return array;
	}
	
	

	
	
	
}	/* End of Driver1 Class */
