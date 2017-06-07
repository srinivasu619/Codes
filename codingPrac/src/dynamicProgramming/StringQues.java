package dynamicProgramming;

public class StringQues {
	public static int  fibo(int number)
	{
		if(number==0||number==1)
		{
			return number;
		}
		int storage[]=new int[number+1];
		return fiboStorage(number,storage);
	}

	private static int fiboStorage(int number, int[] storage) {
		// TODO Auto-generated method stub
		if(number==0||number==1)
		{
			return number;
		}
		if(storage[number]!=0)
		{
			return storage[number];
		}
		int ans=fiboStorage(number-1, storage)+fiboStorage(number-2, storage);
		storage[number]=ans;
		return ans;
	}
	public static int EditDis(String s,String t)
	{
		if(s.length()==0||t.length()==0)
		{
			if(s.length()==0)
				return t.length();
			else
				return s.length();
		}
		
		if(s.charAt(0)==t.charAt(0))
		{
			return EditDis(s.substring(1), t.substring(1));
		}
		else
		{
			int op1=1+EditDis(s, t.substring(1));//insert
			int op2=1+EditDis(s.substring(1), t);//delete
			int op3=1+EditDis(s.substring(1), t.substring(1));//substitute
			return Math.min(op1, Math.min(op2, op3));
		}
	}
	public static int EditDis1(String s,String t)
	{
		if(s.equals(t))
		{
			return 0;
		}
		int storage[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<storage.length;i++)
		{
			for(int j=0;j<storage[0].length;j++)
			{
				storage[i][j]=-1;
			}
		}
		return editDis(s,t,storage);
		
	}
	private static int editDis(String s, String t, int[][] storage) {
		// TODO Auto-generated method stub
		int m=s.length();
		int n=s.length();
		if(s.length()==0||t.length()==0)
		{
			if(s.length()==0)
			{
				storage[m][n]=t.length();
			}
			else
			{
				storage[m][n]=s.length();
			}
		}
		int ans;
		if(storage[m][n]!=-1)
		{
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0))
		{
			ans=editDis(s.substring(1), t.substring(1), storage);
		}
		else
		{
			int op1=1+EditDis(s, t.substring(1));//insert
			int op3=1+EditDis(s.substring(1), t.substring(1));//substitute
			int op2=1+EditDis(s.substring(1), t);//delete
			
			ans=Math.min(op1, Math.min(op2, op3));
		}
		storage[m][n]=ans;
		return storage[m][n];
				
	}
	public static void main(String args[])
	{
		System.out.println(EditDis1("abc", "abcdefes"));
	}
}
