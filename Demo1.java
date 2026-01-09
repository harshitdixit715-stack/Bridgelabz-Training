public class Demo1{
	static int x = 10;
	int y = 20;
	
	public static void m2(){
		int z = 40;
		System.out.println("m2 local var"+z);
	}
	
	public static void m1(){
		int z = 50;
		System.out.println("m1 local var"+z);
		m2();
	}
	
	public static void main(String[] args){
		int z = 30;
		System.out.println("HelloWorld");
		System.out.println("main static var x" + x);
		System.out.println("main local var z" + z);
		m1();
		Demo1 obj = new Demo1();
		System.out.println("instance/non-static/object-level var" + obj.y)
	}
	
}