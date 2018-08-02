import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	
	public static void main(String[] args) {
		
	
	 
	
	
	
	 int task = JOptionPane.showOptionDialog(null, "You suddenly appear in barcelona. You need to choose what you will do when you are there.", "Question 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Nothing", "Explore", "Try the local cuisine" }, null);
	
	
	 if(task == 0) {
			nothing();
		}
	 else if(task == 1) {
			explore();
		}
	 else if(task == 2) {
		 trythelocalcuisine();
		}
	
	 
	 
	 
	 
	 
	 int task1 = JOptionPane.showOptionDialog(null, "Now you have done that. Is is the end of your trip?", "Question 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Yes", "No", "I AM VERY INDECISIVE, I AM FREAKING OUT! I GUESS!" }, null);
	
	
	 if(task1 == 0) {
			yes();
		}
	 else if(task1 == 1) {
			no();
		}
	 else if(task1 == 2) {
		 idk();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	static void nothing(){

		JOptionPane.showMessageDialog(null, " While in barcelona, you sleep a lot and not do much. Your trip seems to be a waste.");
			
		}
	
	static void explore(){

		JOptionPane.showMessageDialog(null, "You venture into the small town of Ullastrell and take in the beutiful scenery.");
			
		}
	
	
	static void trythelocalcuisine(){

		JOptionPane.showMessageDialog(null, "You try a hole in the wall looking mediteranian resturant and it is delicious.");
			
		}
	
	static void yes(){

		JOptionPane.showMessageDialog(null, "You return home with many new memories.");
			
		}
	static void no(){

		JOptionPane.showMessageDialog(null, "You continue on your trip and learn alot about the culture of Spain.");
			
		}
	
	static void idk(){

		JOptionPane.showMessageDialog(null, "You can't decide and just go home. Once you get home, you regret your decision.");
			
		}
	
	
	
	
	
}
