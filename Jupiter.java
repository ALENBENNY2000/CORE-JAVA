public class Jupiter{

	int num;
	long hr;
	char ch;

	Jupiter(int num)
	{
		System.out.println("Num :"+num);
	}
	Jupiter(char ch, int num)
	{
		System.out.println("Character :"+ch+" Num :"+num);
	}
	Jupiter(long hr, int num)
	{
		System.out.println("Hour :"+hr+" Num :"+num);
	}
	Jupiter()
	{
		System.out.println("Jupiter Created");
	}
	
	public static void main(String args[]){

		new Jupiter();

		new Jupiter(365);
		new Jupiter('5',364);
	        new Jupiter(2342352,363);

	}
}
	
	
	
	