/*
*MathsProject2App.java
*@ author Jamie Mulvaney
*1st of Dec 2012
*/
//Predicates Question
import javax.swing.JOptionPane;

public class MathsProject2App{
	public static void main(String args[]){
		//Declare the Variables
		double x;
		double y;
		String a;
		String b;
		boolean boolVar;
		boolean boolVar2;
		boolean boolVar3;
		double answer;


		//Create Object
		MathsProject2 myMaths2=new MathsProject2();

		//Get Input for the User using JOptionPane

		a=JOptionPane.showInputDialog(null,"Please enter your value for X ");
	    x=Double.parseDouble(a);
	    myMaths2.setX(x);

	    b=JOptionPane.showInputDialog(null,"Please enter your value for Y ");
	    y=Double.parseDouble(b);
	    myMaths2.setY(y);

	    //Get answer from Maths Class and output the answers using System.out.print

	    myMaths2.compute();
	    boolVar=myMaths2.getBoolVar();
            System.out.println("Conjunction");
		    System.out.println();
		    System.out.println(boolVar);
		    System.out.println();
		    boolVar2=myMaths2.getBoolVar2();
		    System.out.println("Disjunction");
		    System.out.println();
		    System.out.println(boolVar2);
		    System.out.println();
		    boolVar3=myMaths2.getBoolVar3();
		    System.out.println("Negation");
			System.out.println();
		    System.out.println(boolVar3);
	}
}

