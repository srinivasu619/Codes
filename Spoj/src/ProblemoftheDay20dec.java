import java.util.*;
public class ProblemoftheDay20dec {
	public static ArrayList<Integer> countArray(String input,char c)
	{
		ArrayList<Integer> index=new ArrayList<>();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c)
			{
				index.add(i);
				//System.out.println(i);
			}
		}
		
		return index;
	}
	public static long solve1(String input)
	{
		ArrayList<Integer> RArray=countArray(input, 'R');
		ArrayList<Integer> OArray=countArray(input, 'O');
		int i=0,j=0,count=0;
		while(i<RArray.size()-1)
		{
			if(RArray.get(i).compareTo(OArray.get(j))<0)
			{
				//System.out.println(i);
				if(i+1!=RArray.size())
				{
					int nextRindex=i+1;
					for(int k=j;k<OArray.size();)
					{
						if(RArray.get(i).compareTo(OArray.get(k))<0&&RArray.get(nextRindex).compareTo(OArray.get(k))>0)
						{
							count+=RArray.size()-nextRindex;
							k++;
						}
						else
						{
							if(nextRindex!=RArray.size()-1)
							{
								nextRindex+=1;
							}
							else
							{
								break;
							}
						}
					}
				}
				i++;
			}
			else
			{
				j++;
			}
		}
		return count;
	}
	public static long solve(String input)
	{
		ArrayList<Integer> RArray=countArray(input, 'R');
		ArrayList<Integer> OArray=countArray(input, 'O');
		int count=0;
		for(int i=0;i<RArray.size()-1;i++)
		{
			//System.out.println("i"+i);
			int nextR=i+1;
			for(int j=0;j<OArray.size();)
			{
				if(RArray.get(i).compareTo(OArray.get(j))<0)
				{
					if(OArray.get(j).compareTo(RArray.get(nextR))<0)
					{
						count+=RArray.size()-nextR;
						j++;
					}
					else
					{
						nextR+=1;
					}
					//System.out.println("n"+nextR);
				}
				else
				{
					j++;
				}
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		System.out.println(solve("ROROR"));
		System.out.println(solve("ROOR"));

	}
}
