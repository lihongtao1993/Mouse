import test_diaoyong.pingfang;
public class hello_world{
	public static void main (String[] args){
		System.out.println("Hello world");
		add(5,7);
		test_diaoyong.pingfang(4);
	}
	public static void add(int a,int b){
		//int a,b
		int c;
		c=a+b;
		System.out.println(a+"+"+b+"="+c);	
	}
}