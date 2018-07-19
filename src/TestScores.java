import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
	
	String answer1 = JOptionPane.showInputDialog("What was y'alls test score? (In decimal, ex, (94.6)");
	double score = Double.parseDouble(answer1);
	
	if ( score>80.0){ 
		JOptionPane.showMessageDialog(null,"Wow, y'all did pretty good!!!");
	}
	else { 
		
		JOptionPane.showMessageDialog(null, "Y'ALL FAILED YOU DUMB PERSON. LOL. I AM SO DISSAPOINTED IN YOU!!!");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
