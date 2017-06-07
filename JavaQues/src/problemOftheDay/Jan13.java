package problemOftheDay;

public class Jan13 {
	public static void sequence(int number)
	  {
	    String prevSequence="1";
	    System.out.println(prevSequence);
	    for(int i=1;i<number;i++)
	    {
	      String nextSequence="";
	      for(int j=0;j<prevSequence.length();)
	      {
	        	int count=1;
	        	boolean flag=false;
	        	for(int k=j+1;k<prevSequence.length();k++)
	            {	
	              	if(prevSequence.charAt(k)==prevSequence.charAt(j))
	                {
	                	  count++;
	                }
	              	else
	              	{	flag=true;
	              		nextSequence+=count+""+prevSequence.charAt(j);
	              		break;
	              	}
	            }
	        	if(!flag)
	        		nextSequence+=""+count+""+prevSequence.charAt(j);
	        j=j+count;
	      }
	      prevSequence=nextSequence;
	      System.out.println(prevSequence);
	    }
	  }	
}
