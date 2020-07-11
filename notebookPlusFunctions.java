package notebook;

import java.util.*;
import javax.swing.*;

public class notebookPlusFunctions {

	public static void main(String[] args) {
	int decision;
	
	System.out.println("What do you whish to do, notebook(1), calender(2) or backlog(3)?");
	Scanner scan = new Scanner(System.in);
	decision = scan.nextInt();
	
	switch(decision) {
	default:
		System.out.println("Your choice is not yet implemented.");
	case 1:/*This is the notebook function of the programm.*/
		notebookFunction.createNotebook();/*Apparently only works if createNotebook is static*Note to myself**/
	case 2:/*calender function*/
		
	case 3:/*backlog function*/
		
	}
	
	}
}
