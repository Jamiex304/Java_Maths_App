/*
*MathsProject2.java
*@ author Jamie Mulvaney
*29th of Nov 2012
*/

import java.lang.Math;
public class MathsProject2{
	//Declare Variables
	private double x;
	private double y;
	private boolean boolVar;
	private boolean boolVar2;
	private boolean boolVar3;
	private double answer;
	String choice;
        public MathsProject2(){
		x=0.0;
		y=0.0;
		answer=0.0;
		choice=new String();
        }

        //Set the Strings to accecpt Input

		public void setChoice(String choice){
					this.choice=choice;
		}
		public void setX(double x){
					 this.x=x;
	    }
	    public void setY(double y){
			         this.y=y;
		}
		//Maths Part of the Programme

	 public void compute(){
		 //Conjunction
        boolVar = (x % 2 ==0) && (y <= 10);
        //Disjunction
        boolVar2= (x % 2 ==0) || (y <= 10);
        //Negation
        boolVar3= !(x % 2 ==0) && !(y <= 10);
}
	  //Get Answers
	 	 public boolean getBoolVar(){
	 	 		return boolVar;
	 	}
	 	public boolean getBoolVar2(){
			return boolVar2;
		}
		public boolean getBoolVar3(){
			return boolVar3;
		}
}

