package trees;

import java.util.HashMap;

public class TreiNode {
	char value;
	boolean isTerminal;
	HashMap<Character, TreiNode> children;
	public TreiNode(char value)
	{
		this.value=value;
		children=new HashMap<>();
	}
}
