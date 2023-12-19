public class Number{

	int num;
	long hr;
	char ch;

	Number(int num)
	{
		System.out.println("Num :"+num);
	}
	Number(char ch, int num)
	{
		System.out.println("Character :"+ch+" Num :"+num);
	}
	Number(long hr, int num)
	{
		System.out.println("Hour :"+hr+" Num :"+num);
	}
	Number()
	{
		System.out.println("Number Created");
	}
	
	public static void main(String args[]){

		new Number();

		new Number(4593);
		new Number('2',463);
	        new Number(2434552,36543);

	}
}
	
	