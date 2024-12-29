public class main
{	public static void functiona(int n) {
		if(n<=0)
			return ;
		System.out.print(n+" ");

		functionb(n-2);

	}
	public static void functionb(int n) {
		if(n<=0)		return ;
		System.out.print(n+" ");
		functionc(n-2);

	}
	public static void functionc(int n)
	{
		if(n<=0)
			return ;
		System.out.print(n+" ");
		functiona(n-1);

	}
	public static void main(String[] args) {
		functiona(100);
	}
}
