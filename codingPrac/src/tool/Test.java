package tool;

public class Test {

	public static void print_digits(int number,String num)
	{
		if(number==1)
		{
			System.out.println(number+","+num);
			return;
		}
		String aux;
		for(int i=1;i<number;i++)
		{
			if(num=="")
			{
				aux=number-i+"";
			}
			else
			aux=number-i+","+num;
			print_digits(i,aux);
		}
		if(number!=1&&num!="")
		{
			System.out.println(number+","+num);
		}
	}
	public static void print_digits2(int number,String num)
	{
		if(number==0)
		{
			System.out.println(num);
			return;
		}
		if(number==1)
		{
			System.out.println(number+","+num);
			return;
		}
		
		for(int i=1;i<number;i++)
		{
			String aux="";
			if(num=="")
			{
				aux+=number-i;
			}
			else
			{
				if(number!=1)
				{
					aux+=number+","+num;
					print_digits2(0, aux);
				}
				
				aux=number-i+","+num;
			}
			print_digits2(i,aux);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_digits(4, "");
	}

}
