package codingPrac;

import java.util.Scanner;

public class Recursionex {
	public static String duplicate(String s,int posd)
	{
		if(posd>=s.length())
			return "";
		int pos=posd+1;
		String aux="";
		aux+=s.charAt(posd);
		for(int i=posd;i<s.length();i++)
		{
			if(s.charAt(posd)!=s.charAt(i))
			{
				pos=i;
				break;
			}
	
		}
		System.out.println(pos);
		return aux+duplicate(s, pos);
	}
	public static String  dup(String s)
	{
		System.out.println("STRING "+s);
		boolean flag=true;
		if(s.length()==0)
		{
			return "";
		}
		String aux=""+s.charAt(0);
		int i=0;
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(0)!=s.charAt(i+1))
			{
				flag=false;
				break;
			}
		}
		System.out.println(i+"   A:"+s.substring(i)+":A");
		if(!flag)
			return aux+dup(s.substring(i));
		else
			return aux+dup("");
		
	}
/*public static String dup1(String S)
{
	char refchar;
	int i=0;
	while(i<S.length())
	{
		refchar=S.charAt(i);
		for(int j=i+1;j<S.length()-1;j++)
		{
			
		}
	}
}*/
public static boolean question2(String s,String t,int position,int tindex)
{
	boolean flag=true,tempflag=false;
	int pos=0;
	if(tindex>=t.length())
	{
		return flag;
	}
	for(int i=position;i<s.length();i++)
	{
		if(s.charAt(i)==t.charAt(tindex))
		{
			tempflag=true;
			pos=i;
			break;
		}
	}
	if(tempflag)
		return flag&&question2(s,t,pos+1,tindex+1);
	else
		return false;
	
}
public static boolean question3(String s)
{
	boolean flag=true,rigthp=false,leftp=false;
	int posleftp=0,posrightp=0;
	if(s.length()==0)
		return flag;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='(')
		{
			leftp=true;
			posleftp=i;
			break;
		}
	}
	for(int i=s.length()-1;i>posleftp;i--)
	{
		if(s.charAt(i)==')')
		{
			rigthp=true;
			posrightp=i;
			break;
		}
	}
	if(leftp==true&&rigthp==true)
	{
		return flag&&question3(s.substring(posleftp+1, posrightp));
	}
	else if(leftp==false&&rigthp==false)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
public static int []arr(int input[],int start,int end)
{
    int A[]=new int[end-start];
    for(int i=start;i<end;i++)
    {
        A[i-start]=input[i];
    }
    return A;
}
public static int bsearch(int input[],int element,int left,int right)
{
	if(left<=right)
	{
		int mid=left+(right-left)/2;
		if(element==input[mid])
		    return mid;
		else if(element>input[mid])
		    {
			return bsearch(input,element,mid+1,right);
		    }
		else if(element<input[mid])
		{
			return bsearch(input,element,left,mid-1);
		}
		
	}
		return -1;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(dup("aaaab"));
		//System.out.println(duplicate("abcdef",0));
//System.out.println(question2("adecfgh", "acgh",0,0));
	//System.out.println(question3("(babajskdaksd(amsdmasbdj)as_))"));
	/*int A[]={6,7,10,11,12,13,14,15,18,18,19,22,23,25,26,26,30,35,35,36,39,40,42,46,46,47,48,49,49,51,51,52,54,56,58,58,58,59,61,61,66,66,69,71,72,75,75,76,77,78,81,82,84,85,92,93,95,95,97,98,98,100,105,106,107,108,108,110,115,115,117,118,118,119,119,122,123,124,129,132,133,137,139,143,144,144,145,147,148,149,150,151,156,157,158,158,163,167,167,170,174,174,175,176,176,178,181,181,182,182,184,186,190,194,195,196,198,200,202,203,206,207,207,207,208,209,210,210,211,211,212,213,214,214,217,217,221,224,226,228,229,230,233,234,235,238,238,238,240,242,242,243,243,244,246,247,249,251,254,256,257,257,260,262,264,268,273,273,273,276,277,278,281,281,282,282,282,283,284,284,286,292,293,299,305,306,311,311,312,313,316,320,323,324,325,330,337,337,341,345,350,352,353,355,357,357,358,358,360,365,365,365,367,367,369,370,370,371,372,374,376,378,379,379,382,385,388,388,389,389,394,395,396,396,396,398,399,400,401,402,403,404,405,405,408,415,417,418,418,418,421,424,426,426,428,428,434,437,439,440,441,443,444,445,449,449,451,452,452,454,454,456,458,461,465,466,468,470,472,473,473,475,479,479,480,480,481,483,484,485,488,488,489,489,492,493,493,493,494,496,499}	;
	System.out.println(bsearch(A, 198, 0, A.length-1));*/
	Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    for(int i=0;i<test;i++)
    {
    	String S=sc.next();
    	for(int j=S.length()-1;j>=0;j--)
    	{
    		System.out.print(S.charAt(j));
    	}
    	System.out.println();
    }

	}

}
