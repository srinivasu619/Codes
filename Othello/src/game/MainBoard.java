package game;

public class MainBoard {
	char boardArr[][]=new char[10][10];
	private static final int PLACES=64;
	int playeroneCount,playertwoCount;
	//constructor
	public MainBoard() {
		playeroneCount=2;
		playertwoCount=2;
		boardInitialize();//initializes the initial state of the board
	}
	private void boardInitialize() {
		for(int i=1;i<9;i++)
		{
			boardArr[boardArr.length-1][i]=boardArr[0][i]=(char)(96+i);
			boardArr[i][boardArr.length-1]=boardArr[i][0]=(char)(48+i);
		}
		boardArr[4][4]='B';
		boardArr[4][5]='W';
		boardArr[5][4]='W';
		boardArr[5][5]='B';
	}
	//displaying the game board
	public void display()
	{
		for(int i=0;i<boardArr.length;i++)
		{
			System.out.print("|");
			for(int j=0;j<boardArr.length;j++)
			{
				if(boardArr[i][j]==' ')
				{
					System.out.print(" |");
				}
				else
				{
					System.out.print(boardArr[i][j]+"|");
				}
			}
			System.out.println();
		}
	}
	//updating player count after each move
	public void updatePlayerCount()
	{
		int localp1Count=0,localp2Count=0;
		for(int i=1;i<boardArr.length-1;i++)
		{
			for(int j=1;j<boardArr.length-1;j++)
			{
				if(boardArr[i][j]=='B')
				{
					localp1Count++;
				}
				if(boardArr[i][j]=='W')
				{
					localp2Count++;
				}
			}
		}
		if(playeroneCount!=localp1Count)
		{
			playeroneCount=localp1Count;
		}
		if(playertwoCount!=localp2Count)
		{
			playertwoCount=localp2Count;
		}
	}
	//returns boolean if the board is incomplete or not
	public boolean incompleteStatus()
	{
		return playeroneCount+playertwoCount==PLACES;
	}
	public static void main(String[] args) {
		MainBoard board=new MainBoard();
		board.display();
	}
}
