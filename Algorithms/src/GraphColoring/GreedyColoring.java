package GraphColoring;

public class GreedyColoring 
{
	private int numOfVertices;
	private int numOfColors;
	private int colors[];
	private int graphMetrix[][];
	
	public GreedyColoring(int graphMetrix[][],int numOfColors)
	{
		this.numOfColors=numOfColors;
		this.graphMetrix=graphMetrix;
		this.numOfVertices=graphMetrix.length;
		this.colors=new int[numOfVertices];
	}
	
	public void solveColoringProblem() 
	{
		try
		{
			solve(0);
			System.out.println("No solution with given parameter......");
		}
		catch(RuntimeException re)
		{
			showResults();
		}

	}

	private void showResults()
	{
		
		for (int i=0;i<this.numOfVertices;i++) 
		{
			System.out.println("Node "+(i+1)+" has color index : "+colors[i]+" ");
		}
		
	}

	private void solve(int nodeIndex) 
	{	
		if(nodeIndex==this.numOfVertices)
		{
			throw new RuntimeException("No solution... ");
		}
		for (int colorIndex = 0; colorIndex < this.numOfColors; colorIndex++) 
		{
			if(isColorValid(nodeIndex,colorIndex))
			{
				colors[nodeIndex]=colorIndex;
				solve(nodeIndex+1);
			}
			
		}
	}

	private boolean isColorValid(int nodeIndex, int colorIndex) 
	{
		for(int i=0;i<this.numOfVertices;i++)
		{
			if(graphMetrix[nodeIndex][i]==1 && colorIndex==colors[i])
			{
				return false;
			}
		}
		return true	;
	}
		
		
}
	
