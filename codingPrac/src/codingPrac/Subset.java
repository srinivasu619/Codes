package codingPrac;

public class Subset {
public static int [][] subset(int A[],int index)
{
	if(index==-1)
	{
		return new int[1][0];
	}
	int output[][]=subset(A, index-1);
	int k=0;
	int finalSub[][]=new int[2*output.length][];
	for(int i=0;i<output.length;i++)
	{
		finalSub[i]=new int[output[k].length];
		for(int j=0;j<output[k].length;j++)
		{
			finalSub[i][j]=output[k][j];
		}
		k++;
	}
	k=0;
	for(int i=output.length;i<finalSub.length;i++)
	{
		finalSub[i]=new int[output[k].length+1];
		for(int j=0;j<output[k].length;j++)
		{
			finalSub[i][j]=output[k][j];
		}
		finalSub[i][output[k].length]=A[index];
		k++;
	}
	return finalSub;
}
public static int [][] subset2(int A[],int index)
{
	if(index==-1)
	{
		return new int[1][0];
	}
	int output[][]=subset(A, index-1);
	int k=0;
	int finalSub[][]=new int[2*output.length][];
	for(int i=0;i<output.length;i++)
	{
		finalSub[i]=new int[output[k].length];
		for(int j=0;j<output[k].length;j++)
		{
			finalSub[i][j]=output[k][j];
		}
		k++;
	}
	k=0;
	for(int i=output.length;i<finalSub.length;i++)
	{
		finalSub[i]=new int[output[k].length+1];
		for(int j=0;j<output[k].length;j++)
		{
			finalSub[i][j]=output[k][j];
		}
		finalSub[i][output[k].length]=A[index];
		k++;
	}
	return finalSub;
}
/*ublic static String [] codes(String s)
{
	if(s.length()==1)
	{
		String A[]=new String [1];
		int diff=Integer.parseInt(s)-96;
		A[0]=""+(char)diff;
		return A;
	}
	String output[]=codes(s.substring(0, s.length()-1));
	String finalString[]=new String[output.length+(s.length()-2)];
	String aux="";
	aux+=s.charAt(s.length()-1);
	int diff=Integer.parseInt(aux)-96;
	for(int i=0;i<output.length;i++)
	{
		finalString[i]=output[i]+(char)diff;
	}
	for(int i=output.length;i<finalString.length;i++)
	{
		aux=s.substring(s.length()-2,s.length());
		diff=Integer.parseInt(aux)-96;
		
	}
}*/
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={0,1,2};
		int A[][]=subset(num,2);
		//System.out.println(A.length);
		for(int i=0;i<A.length;i++)
		{
			//System.out.println("j "+A[i].length);
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

}
