package trees;

public class Trie {
	TreiNode root;
	int count;
	public Trie()
	{
		root=new TreiNode('\0');
	}
	public void add(String word)
	{
		add(root,word);
	}
	private void add(TreiNode root,String word)
	{
		if(word.length()==0)
		{
			if(root.isTerminal)
			{
				return;
			}
			root.isTerminal=true;
			count++;
			return;
		}
		TreiNode child=root.children.get(word.charAt(0));
		if(child==null)
		{
			child=new TreiNode(word.charAt(0));
			root.children.put(word.charAt(0),child);
		}
		add(child,word.substring(1));
	}
	public void remove(String word)
	{
		remove(word,root);
	}
	private void remove(String word,TreiNode root)
	{
		if(word.length()==0)
		{
			if(root.isTerminal)
			{
				root.isTerminal=false;
				count--;
			}
			return;
		}
		TreiNode child=root.children.get(word.charAt(0));
		if(child==null)
		{
			return;
		}
		remove(word.substring(1), child);
		if(!child.isTerminal&&child.children.isEmpty())
		{
			root.children.remove(word.charAt(0));
		}
	}
	public boolean findWord(String word)
	{
		TreiNode currNode=root;
		for(int i=0;i<word.length();i++)
		{
			TreiNode children=currNode.children.get(word.charAt(i));
			if(children==null)
			{
				return false;
			}
			currNode=children;
		}
		return currNode.isTerminal;
	}
}
