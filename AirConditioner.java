public class AirConditioner {
    
    public static void main(String[] args) {
        
        AirCondition ac = new AirCondition("LG",2.0f,"White",15000);

        ac.printAll();

        AirCondition ac1 = new AirCondition("Godrej",1.8f,"Gray");

        ac1.printAll();

        AirCondition ac2 = new AirCondition("Whirlpool");

        ac2.printAll();

        AirCondition ac3 = new AirCondition("Haier",2.8f,"Red",14000,false);

        ac3.printAll();

        AirCondition ac4 = new AirCondition("Samsung",3.2f);

        ac4.printAll();

        AirCondition ac5 = new AirCondition("American Staandard",2.6f,"Light Red",18000,true,3);

        ac5.printAll();


    }
}
