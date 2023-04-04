/*
*SportActivity.java
*@author YuehMingTeng
*08/11/2022
*/
import javax.swing.JOptionPane;

public class SportActivity{

	//create variable
	private int duration[];
	private int i;
	private double sum;
	private int low;
	private int times;

	//create constructor
	public SportActivity(){
		duration= new int[5000];
	    duration[0]=0;
		int i=0;
		int times=0;
	}

	//compute the average of all entered sports
	public void computeAvg(){
		sum=0;

		//remind user to input value
		if(duration[0]==0){
			JOptionPane.showMessageDialog(null,"You have't entered any value");
		}//if

		//compute average
		else{
			for(i=0;i<(times+1);i++){
				sum=sum+duration[i];
			}
		JOptionPane.showMessageDialog(null,"The average duration of all sports is "+(sum/(times+1)));

		}//else
	}//computeAvg

	//compute the lowest duration
    public void computeLow(){

		//remind user to input value
		if(duration[0]==0){
			JOptionPane.showMessageDialog(null,"You have't entered any value");
		}//if

		//compute lowest value
		else{
			if(times==0){
				low=duration[0];
			}		
			else{
				low=duration[0];
				for(i=1;i<times+1;i++){
					if(low>duration[i]){
						low=duration[i];
					}//if
				}//for
			}	
			JOptionPane.showMessageDialog(null,"The lowest duration of sport is: "+low);
		}//else
	}//computeLow



	//set method
	public void setTimes(int times){
		this.times=times;
	}//setTimes

	public void setDuration(int [] duration){
		this.duration=duration;
	}//setDuration

}//class