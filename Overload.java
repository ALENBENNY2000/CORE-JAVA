public class Overload{

	public static void main(String args[]){

		short value = 20;		
		add(10, 25.0f, value);		//order
		add(value, 25.0f, 35);
		add(40.0f, value, 56);

		sum('a');			//datatype
		sum(40);
		sum(34.8f);

		num(40);			//number
		num(50,20L);
		num(20,10L,'b');
	}
static void add(int n, float f, short s){
	System.out.println("1st Method");}
static void add(short s, float f, int n){
	System.out.println("2nd Method");}
static void add(float f, short s, int n){
	System.out.println("3rd Method");
	System.out.println("---------------");}
	

static void sum(char a){
	System.out.println("4th Method");}
static void sum(int i){
	System.out.println("5th Method");}
static void sum(float f){
	System.out.println("6th Method");
	System.out.println("---------------");}

static void num(int f){
	System.out.println("7th Method");}
static void num(int f, long l){
	System.out.println("8th Method");}
static void num(int i, long h, char a){
	System.out.println("9th Method");
	System.out.println("---------------");}
}