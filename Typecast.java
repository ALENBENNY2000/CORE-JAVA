public class Typecast{

	public static void main(String args[]){

	byte value = 10;
	short num = value;
	System.out.println("short = "+num);
	int number = num;
	System.out.println("int = "+number);
	long numb = number;
	System.out.println("long = "+numb);
	
	long start = 20;
	int process = (int) start;
	System.out.println("int = "+process);
	short proces = (short) process;
	System.out.println("short = "+proces);
	byte end = (byte) proces;
	System.out.println("byte = "+end);
	
	char val = 'a';
	int vale = val;
	System.out.println("int = "+vale);
	
	int  fun = 111;
	char enjoy = (char) fun;
	System.out.println("char = "+enjoy);
	
	float shift = 15.45f;
	double shaft = shift;
	System.out.println("double = "+shaft);
	
	double come = 15.9465d;
	float go = (float) come;
	System.out.println("float = "+go);
	}
}