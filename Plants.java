public class Plants{

	String name;
	String climate;
	String flowerColor;

	Plants(){
	
		this("Rose");
		System.out.println("__| Default Constructor |__");
	
	}

	Plants(String name){
	
		this("Jasmine","Mild");
		System.out.println("__| Flower: Rose |__");
	
	}

	Plants(String name, String climate){
	
		this("Hibiscus","Cool","Red");
		System.out.println("__| Flower: Jasmine | Climate: Mild |__");
	
	}

	Plants(String name, String climate, String flowerClolor){
	
		System.out.println("__| Flower: Hibiscus | Climate: Cool | flowerColor: Red |__");
	
	}

	public static void main(String args[]){

	new Plants();

	}
}