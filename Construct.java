public class Construct{

	int num;
	long mobile;
	char ch;

	void LinkedIn()
	{
		System.out.println("LinkedIn Account");
	}
	void Number(int num)
	{
		System.out.println("A Number = "+num);
	}
	void Jupiter(char ch)
	{
		System.out.println("The Jupiter is in position = "+ch);
	}
	void Time()
	{
		System.out.println("High Time");
	}
	void Telephone(long mobile)
	{
		System.out.println("A Telephone number = "+mobile);
	}
	
	public static void main(String args[]){

		Construct build = new Construct();

		build.LinkedIn();
		build.Number(365);
		build.Jupiter('5');
		build.Time();
		build.Telephone(1209348756);

	}
}
	
	