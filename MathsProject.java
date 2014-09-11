/*
*MathsProject.java
*@author Jamie Mulvaney
*16th of Nov 2012
*/
//Function Question
import java.lang.Math;
public class MathsProject{
	//Declare Variables
	private double x;
	private String choice;
	private double y;
	private double answer;
	private double answer2;
	private double answer3;
	private double answer4;
	private double answer5;
	private double answer6;


	public MathsProject(){
		x=0.0;
		y=0.0;
	    choice=new String();
		answer=0.0;
		answer2=0.0;
		answer3=0.0;
		answer4=0.0;
		answer5=0.0;
		answer6=0.0;
	}

	//Set the Strings to accept Input

	public void setChoice(String choice){
			this.choice=choice;
		}
		public void setX(double x){
			 this.x=x;
	 }
	 //Maths Part of Programme
	 public void compute(){
		 //FoF
		 y=Math.pow(x,2)+(2*x)+1;
		 answer=Math.pow(y,2)+(2*y)+1;
		 //GoG
		 y=9*(Math.pow(x,2))-1;
		 answer2=9*(y*y)-1;
		 //FoG
		 y=9*(Math.pow(x,2))-1;
		 answer3=Math.pow(y,2)+(2*y)+1;
		 //GoF
		 y=Math.pow(x,2)+(2*x)+1;
		 answer4=9*(Math.pow(y,2))-1;
		 //F-1oF
		 y=Math.pow(x,2)+(2*x)+1;
		 answer5=Math.sqrt(y+2)-1;
		 //G-1oG
		 y=9*(Math.pow(x,2))-1;
		 answer6=Math.sqrt(y+1)/9;

	 }

	 //Get Answers
	 public double getAnswer(){
	 		return answer;
	 	}
	 	public double getAnswer2(){
	 		return answer2;
	 	}
	 	public double getAnswer3(){
	 		return answer3;
	 	}
	 	public double getAnswer4(){
			return answer4;
		}
		public double getAnswer5(){
			return answer5;
		}
		public double getAnswer6(){
			return answer6;
		}
}
