public class AirCondition{

    String brand;
    float powerConsumption;
    String color;
    int price;
    boolean isItDualClimate;
    int warranty;

    AirCondition(String brand, float powerConsumption, String color, int price, boolean isItDualClimate,int warranty)
    {
        this(brand, powerConsumption, color, price, isItDualClimate);
        this.warranty = warranty;
    }
    AirCondition(String brand, float powerConsumption, String color, int price, boolean isItDualClimate)
    {
        this(brand, powerConsumption, color, price);
        this.isItDualClimate = isItDualClimate;
    }
    AirCondition(String brand, float powerConsumption, String color, int price)
    {
        this(brand, powerConsumption, color);
        this.price = price;
    }
    AirCondition(String brand, float powerConsumption, String color)
    {
        this(brand, powerConsumption);
        this.color = color;
    }
    AirCondition(String brand, float powerConsumption)
    {
        this(brand);
        this.powerConsumption = powerConsumption;
    }
    AirCondition(String brand)
    {
        this();
        this.brand = brand;
    }
    AirCondition()
    {
        System.out.println("------------------------------------------------");
    }
    void printAll()
    {
        System.out.println("AC Brand:" + brand);
        System.out.println("AC Power Usage:" + powerConsumption);
        System.out.println("AC Color:" + color);
        System.out.println("AC Price:" + price);
        System.out.println("Is It Dual Climate:" + isItDualClimate);
        System.out.println("AC Warranty:" + warranty);
    }
        
}