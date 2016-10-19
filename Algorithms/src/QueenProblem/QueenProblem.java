package QueenProblem;

public class QueenProblem 
{
	int[] QueensArray;
	int numOfQueens=0;
	int count=0;
	public QueenProblem(int numOfQueens) {
		this.numOfQueens=numOfQueens;
		QueensArray=new int[numOfQueens];
	}
	
	public void solveQueenProblem()
	{
		arrangeQueens(0);
	}

	private void arrangeQueens(int rowIndex)
	{
		
		for (int i = 0; i < numOfQueens; i++) 
		{
			if(isPlaceValid(rowIndex,i))
			{
				QueensArray[rowIndex]=i;
				if(rowIndex==numOfQueens-1)
				{
						printQueens();
				}
				else
				{
					arrangeQueens(rowIndex+1);
				}
			}
		}
	}

	private void printQueens() {
		for (int i = 0; i < numOfQueens; i++)
		{
			for (int j = 0; j < numOfQueens; j++)
			{
				if(QueensArray[i]==j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		count ++;
		System.out.println("\n"+count+"\n\n");
		
	}

	private boolean isPlaceValid(int rowIndex, int columnIndex) {
		
		for (int i = 0; i < rowIndex; i++) 
		{
			if(QueensArray[i]==columnIndex)
			{
				return false;
			}
			if((i-rowIndex)==(QueensArray[i]-columnIndex))
			{
				return false;
			}
			if((i-rowIndex)==(columnIndex-QueensArray[i]))
			{
				return false;
			}
		}
		return true;
	}
	
}
