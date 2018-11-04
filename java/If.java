
public class If{
	public static void main(String[] args){
		int x = 3;
		if(x > 5){
			System.out.println(x + "<5");
		}
			else if(x > 1){
				System.out.println(x + ">1");
				}
			else {
				System.out.println(x + ">1");
				}
		{
			int y = 5;
			System.out.println(y);
		} //局部代码块，y只能应用在大括号内
		//System.out.println(y);
	}
	
}

/*1、if（条件表达式）
	{
		执行语句;
	}
	
2、if（条件表达式）
	{
		执行语句1；
	}
   else
   {
	   执行语句2；
   }
   
3、if（条件表达式1）

	{
		执行语句1；
	}
	else if（条件表达式2）
	{
		执行语句2；
	}
	else
	{
		执行语句3
	}*/