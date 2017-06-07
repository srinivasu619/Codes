package implementation;

public class Feb23problem {

	public static void mat_print(int mat[][])
	{
		int i=0,j=0;
		boolean toggle=true;
		while(i != 0 || j!=mat[0].length-1)
		{
			if(toggle)
			{
				while(j!=-1)
				{
					System.out.println("\n"+"first "+i+ " "+j+" "+toggle);
					System.out.print(mat[i][j]+" ");
					i++;
					j--;
				}
				j++;
				toggle=!toggle;
			}
			else
			{
				while(i!=-1)
				{
					System.out.println("\n"+"second "+i+ " "+j+" "+toggle);
					System.out.print(mat[i][j]+" ");
					i--;
					j++;
				}
				i++;
				toggle=!toggle;
			}
			
		}
		while(i != mat.length || j!=mat[0].length-1)
		{
			if(toggle)
			{
				while(i!=mat.length)
				{
					System.out.println("\n"+"first2 "+i+ " "+j+" "+toggle);
					System.out.print(mat[i][j]+" ");
					i++;
					j--;
				}
				i--;
				j++;
				toggle=!toggle;
			}
			else
			{
				while(j!=mat[0].length)
				{
					System.out.println("\n"+"second2 "+i+ " "+j+" "+toggle);
					System.out.print(mat[i][j]+" ");
					i--;
					j++;
				}
				i++;
				j--;
				toggle=!toggle;
			}
		}
		//System.out.println("\n"+i+ " "+j+" "+toggle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		mat_print(mat);
	}

}
