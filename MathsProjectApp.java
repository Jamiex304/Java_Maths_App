/*
*MathsProjectApp.java
*@author Jamie Mulvaney
*16th of Nov 2012
*/
//Functions Questions
import javax.swing.JOptionPane;


public class MathsProjectApp{
	public static void main(String args[]){
		//Declare Variables
		double x;
		double y;
		String a;
		double answer;
		double answer2;
		double answer3;
		double answer4;
		double answer5;
		double answer6;
		String choice;

		//Create Object
	MathsProject myMaths=new MathsProject();

	//Get Input from User using JOptionPane

	a=JOptionPane.showInputDialog(null,"Please enter your value for X to see the results");
	x=Double.parseDouble(a);
	myMaths.setX(x);

	//Get answer from Maths Class and output the answers using System.out.print

	myMaths.compute();
            System.out.println("HERE IS THE LIST FOR THE TWO MATHS FUNCTIONS:");
            System.out.println();
			answer=myMaths.getAnswer();
		    System.out.println("FoF:");
		    System.out.println();
		    System.out.println(answer);
		    System.out.println();
            answer2=myMaths.getAnswer2();
			System.out.println("GoG:");
			System.out.println();
			System.out.println(answer2);
			System.out.println();
			answer3=myMaths.getAnswer3();
			System.out.println("FoG:");
			System.out.println();
			System.out.println(answer3);
			System.out.println();
			answer4=myMaths.getAnswer4();
			System.out.println("GoF:");
			System.out.println();
			System.out.println(answer4);
			System.out.println();
			answer5=myMaths.getAnswer5();
			System.out.println("F-1oF:");
			System.out.println();
			System.out.println(answer5);
			System.out.println();
			answer6=myMaths.getAnswer6();
			System.out.println("G-1oG:");
			System.out.println();
			System.out.println(answer6);

		}
}

