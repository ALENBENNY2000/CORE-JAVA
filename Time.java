public class Time{

	int num;
	long hr;
	char ch;

	Time(int num)
	{
		System.out.println("Num :"+num);
	}
	Time(char ch, int num)
	{
		System.out.println("Character :"+ch+" Num :"+num);
	}
	Time(long hr, int num)
	{
		System.out.println("Hour :"+hr+" Num :"+num);
	}
	Time()
	{
		System.out.println("Time Created");
	}
	
	public static void main(String args[]){

		new Time();

		new Time(22);
		new Time('1',36);
	        new Time(12,3);

	}
}
	
	