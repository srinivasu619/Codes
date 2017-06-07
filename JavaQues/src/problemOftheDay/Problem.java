package problemOftheDay;
import java.util.*;
class helper
{
	int hats;
	int Position;
}
public class Problem {
	public static void print_list(ArrayList<helper> help)
	{
		for(helper h:help)
		{
			System.out.print(h.hats+" '"+h.Position+"' ");
		}
		System.out.println();
	}
	public static int distributeHats(int[] arr,int n,int m) {
		// Write your code here
        ArrayList<helper> numbering=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        	helper help=new helper();
        	help.hats=arr[i];
        	help.Position=i+1;
        	numbering.add(help);
        }
        while(numbering.size()!=1)
        {
        	if(numbering.get(0).hats<=m)
        	{
        		numbering.remove(0);
        	}
        	else
        	{
        		helper help=numbering.remove(0);
        		help.hats-=m;
        		numbering.add(help);
        	}
        	//print_list(numbering);
        }
        return numbering.get(0).Position;
	}
	public static void pattern(int number)
	{
		for(int i=1;i<=number;i++)
		{
			for(int space=i;space<number;space++)
			{
				System.out.print(" ");
			}
			String print="";
			int num=1;
			while(num<=i)
			{
				if(num==1)
					print=num+print;
				else
					print=num+print+num;
				num++;
			}
			System.out.println(print);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr2[]={14 ,17 ,17, 2, 20, 3, 16, 14, 2, 14, 15, 4, 13, 8, 15 };
		int arr1[]={4,3,1};
		int arr3[]={17 ,18 ,6 ,11 ,2 ,4 };
		System.out.println(distributeHats(arr2, arr2.length, 2));
		System.out.println(distributeHats(arr3, arr3.length, 6));
		System.out.println(distributeHats(arr1, arr1.length, 5));*/
		pattern(5);
	}

}
