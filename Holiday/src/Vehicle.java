/* Author: Sushil
 * Date; 21 Feb 2022
 * Description: Vehicle using the UML(Unified Modeling Language)
*/
public class Vehicle {

	//Attributes :
	int passengers;
	double fuelCapacity;
	double fuelConssumption;
	String Make;
	double iDist;
	double tTime;
	double range;
	double gasReq;
	double speed;

	/* Max Range
	 * Range
	 * Gas needed
	 * speed
	 */
	//Instances
	
	double maxRange () {
	double fCapacity= fuelCapacity*1.6;
	double mpg= fuelConssumption;
	return fCapacity*mpg;
	
	}
	
	
	
	//main method
	public static void main(String[] args) {
		Vehicle honda=new Vehicle();
		honda.passengers=5;
		honda.fuelCapacity=17.5;
		honda.fuelConssumption=29.3;
		honda.gasReq=3;
		honda.iDist=400;
		System.out.println("The max range is " + honda.maxRange());
		
		
		
				
				
				
				
				
		
		
		
		

	}

}
