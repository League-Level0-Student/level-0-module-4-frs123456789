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
	
	
	
	
	
}
