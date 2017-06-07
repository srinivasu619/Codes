package stacks;
public class Getmin {
		private Stack<Integer> s1=new Stack<>(),s2=new Stack<>();
		public void minpush(int  data)
		{
			if(s1.isEmpty())
			{
				s1.push(data);
				s2.push(data);
			}
			else
			{
				if(data<s2.topData())
				{
					 s2.push(data);
					 s1.push(data);
				}
				else
				{
					s1.push(data);
					int a=s2.topData();
					s2.push(a);
				}
			}
		}
		public void pop()
		{
			s1.pop();
			s2.pop();
		}
		public int getminimum()
		{
			return s2.topData();
		}
	}
