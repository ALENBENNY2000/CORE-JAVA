public class LinkedIn{

	int num;
	long hr;
	char ch;

	LinkedIn(int num)
	{
		System.out.println("LinkedIn Account");
	}
	LinkedIn(char ch, int num)
	{
		System.out.println("Character :"+ch+" Num :"+num);
	}
	LinkedIn(long hr, int num)
	{
		System.out.println("Hour :"+hr+" Num :"+num);
	}
	LinkedIn()
	{
		System.out.println("LinkedIn Created");
	}
	
	public static void main(String args[]){

		new LinkedIn();

		new LinkedIn(6324);
		new LinkedIn('3',5775);
	        new LinkedIn(57573573,45234);

	}
}
	
