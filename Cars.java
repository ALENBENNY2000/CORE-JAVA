public class Cars{

	String brandName;
	String colour;
	long price;
	int mileage;
	int engineCapacity;
	int noOfAirbags;
	int topSpeed;
	boolean havingAc;
	
	Cars(String brandName, String colour, long price, int mileage, int engineCapacity, int noOfAirbags, int topSpeed, boolean havingAc){
	
		this.brandName = brandName;
		this.colour = colour;
		this.price = price;
		this.mileage = mileage;
		this.engineCapacity = engineCapacity;
		this.noOfAirbags = noOfAirbags;
		this.topSpeed = topSpeed;
		this.havingAc = havingAc;
	}

	public static void main(String args[]){

	System.out.println("	---CAR DETAILS---");

	System.out.println("__________________________________");	

	Cars car1 = new Cars("Ford Mustang GT 2021","Red",7460000,7,4951,2,163,true);
	System.out.println(car1.brandName);
	System.out.println(car1.colour);
	System.out.println(car1.price);
	System.out.println(car1.mileage);
	System.out.println(car1.engineCapacity);
	System.out.println(car1.noOfAirbags);
	System.out.println(car1.topSpeed);
	System.out.println(car1.havingAc);

	System.out.println("__________________________________");

	Cars car2 = new Cars("Chevrolet Camaro ZL1,2023","Gray",5598000,13,3907,2,198,true);
	System.out.println(car2.brandName);
	System.out.println(car2.colour);
	System.out.println(car2.price);
	System.out.println(car2.mileage);
	System.out.println(car2.engineCapacity);
	System.out.println(car2.noOfAirbags);
	System.out.println(car2.topSpeed);
	System.out.println(car2.havingAc);

	System.out.println("__________________________________");

	Cars car3 = new Cars("Toyota GR Supra 2020","Orange ",4235000,16,2998,2,250,true);
	System.out.println(car3.brandName);
	System.out.println(car3.colour);
	System.out.println(car3.price);
	System.out.println(car3.mileage);
	System.out.println(car3.engineCapacity);
	System.out.println(car3.noOfAirbags);
	System.out.println(car3.topSpeed);
	System.out.println(car3.havingAc);

	System.out.println("__________________________________");

	Cars car4 = new Cars("Nissan GT-R Nismo 2016","White",21200000,9,3799,2,196,true);
	System.out.println(car4.brandName);
	System.out.println(car4.colour);
	System.out.println(car4.price);
	System.out.println(car4.mileage);
	System.out.println(car4.engineCapacity);
	System.out.println(car4.noOfAirbags);
	System.out.println(car4.topSpeed);
	System.out.println(car4.havingAc);

	System.out.println("__________________________________");

	Cars car5 = new Cars("Dodge Challenger SRT Demon 2021","Black",8050000,13,3300,2,215,true);
	System.out.println(car5.brandName);
	System.out.println(car5.colour);
	System.out.println(car5.price);
	System.out.println(car5.mileage);
	System.out.println(car5.engineCapacity);
	System.out.println(car5.noOfAirbags);
	System.out.println(car5.topSpeed);
	System.out.println(car5.havingAc);

	System.out.println("__________________________________");

	}
}
