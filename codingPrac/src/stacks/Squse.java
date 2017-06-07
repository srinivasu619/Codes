package stacks;

public class Squse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue<Integer> stack=new StackUsingQueue<Integer>();
		for(int i=0;i<5;i++)
		{
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack.pop());
		stack.push(400);
		System.out.println(stack.pop());
	}

}
