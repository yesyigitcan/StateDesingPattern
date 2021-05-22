import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws StateTransitionException {
		
		
		// Create a Note
		Note myNote = new Note(new IncompleteState());
		
		// Print State of the Note
		System.out.println(myNote.getState());
		
		// Change State Menu
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Change to Complete \n"
				+ "2. Change to Incomplete \n"
				+ "3. Change to Cancelled \n"
				+ "4. Change to Permanent");
		switch(sc.nextInt()) {
			case 1:
				myNote.changeToCompleted();
				break;
			case 2:
				myNote.changeToIncomplete();
				break;
			case 3:
				myNote.changeToCancelled();
				break;
			case 4:
				myNote.changeToPermanent();
				break;
		}
		
		System.out.println(myNote.getState());
		
		
	}

}
