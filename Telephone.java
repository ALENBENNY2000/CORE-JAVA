public class Telephone{

	int num;
	long hr;
	char ch;

	Telephone(int num)
	{
		System.out.println("Num :"+num);
	}
	Telephone(char ch, int num)
	{
		System.out.println("Character :"+ch+" Num :"+num);
	}
	Telephone(long hr, int num)
	{
		System.out.println("Hour :"+hr+" Num :"+num);
	}
	Telephone()
	{
		System.out.println("Telephone Created");
	}
	
	public static void main(String args[]){

		new Telephone();

		new Telephone(3452);
		new Telephone('4',3452);
	        new Telephone(96967976,4534);

	}
}
	
	