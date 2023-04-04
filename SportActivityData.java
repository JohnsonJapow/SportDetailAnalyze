/*
*SportActivityData.java
*@author YuehMingTeng
*08/11/2022
*/
import javax.swing.JOptionPane;

public class SportActivityData{

	//create variable

	private String sports [];
	private float temperature [];
	private int duration[];
	private int times;

	//create constructor

	public SportActivityData(){
			sports=new String[5000];
			temperature=new float[5000];
			duration= new int[5000];
			int times=0;
	}


	//create compute method for display all details of the first entered item
	public void computeFirst(){

		//if there does not have entered item, show an alert
		if((sports[0]==null)&&(duration[0]==0)&&(temperature[0]==0)){
			JOptionPane.showMessageDialog(null,"You haven't entered any value");
		}//if

		//output all details of the first entered item
		else {
			JOptionPane.showMessageDialog(null,"The first sport is: "+(sports[0])+", the duration is: "+(duration[0])+" second(s), the temperature is :"+(temperature[0])+" Celsius");
		}//else
	}//computeFirst

	//create compute method for display all details of the last entered item
	public void computeLast(){

		//if there does not have entered item, show an alert
		if((sports[0]==null)&&(duration[0]==0)&&(temperature[0]==0)){
			JOptionPane.showMessageDialog(null,"You have't entered any value");
		}//if

		//output all details of the last entered item
		else {
			JOptionPane.showMessageDialog(null,"The last sport is: "+(sports[times])+", the duration is: "+(duration[times])+" second(s), the temperature is :"+(temperature[times])+" Celsius");
		}//else
	}//computeLast

	//set method
	public void setSports(String [] sports){
		this.sports=sports;
	}//setSports

	public void setTemperature(float [] temperature){
		this.temperature=temperature;
	}//setTemerature

	public void setDuration(int [] duration){
		this.duration=duration;
	}//setDuration

	public void setTimes(int times){
		this.times=times;
	}//setTimes

}//class