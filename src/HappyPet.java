import javax.swing.JOptionPane;

public class HappyPet {
	
	 // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static String answer1;
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 answer1 = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Question 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Give a treat to", "bathe" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 2) {
	bathe();
}

if(task == 1) {
	GiveATreatTo();
}

if(task == 0) {
	cuddle();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	
	void cuddle(){
		
	happinessLevel++;
	
	JOptionPane.showMessageDialog(null, "Your " + answer1  +" very joyful.");
		
	}
	
	static void bathe(){
		
		happinessLevel++;
		
		JOptionPane.showMessageDialog(null, "Your " + answer1  +" is happy because it is all sudzy");
			
		}
	
	static void GiveATreatTo(){
		
		happinessLevel++;
		
		JOptionPane.showMessageDialog(null, "Your " + answer1  +" is comfortable");
			
		}
	
	
	
	
	
}