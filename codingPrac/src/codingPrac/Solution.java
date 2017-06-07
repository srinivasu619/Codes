package codingPrac;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int largest=Integer.MIN_VALUE;
        for(int rowt=0;rowt<=3;rowt++)
            {
            for(int colt=0;colt<=3;colt++)
                {int sum=0;int count=1;
                for(int i=0;i<3;i++)
                    {
                    for(int j=0;j<3;j++)
                    {
                    		
                    	if(count==3||count==6)
                    	{
                    		
                    	}
                    	else
                    	{
                    		System.out.print("ARR: "+arr[i+rowt][j+colt]);
                    		sum+=arr[i+rowt][j+colt];
                    	}
                    	count++;
                    	
                    }
                    
                }
                System.out.print("SUM  "+sum);
                System.out.println();
                if(sum>largest)
                {
                	largest=sum;
                }
            }
        }
        System.out.println(largest);
    }
}
