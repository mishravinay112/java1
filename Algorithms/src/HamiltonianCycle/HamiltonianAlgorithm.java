package HamiltonianCycle;

public class HamiltonianAlgorithm 
{
	private int numOfVertex;
	private int hamiltonianPath[];
	private int[][] adjencyMatrix;
	
	public void hamiltonianCycle(int[][] adjencyMetric) 
	{
		this.numOfVertex=adjencyMetric[0].length;
		hamiltonianPath=new int[numOfVertex];
		this.adjencyMatrix=adjencyMetric;
		
		this.hamiltonianPath[0]=0;
		if(!findFesibleSolution(1))
		{
			System.out.println("No Feasible Solution Found...");
			return;
		}
		
		else
		{
		showHamiltonianPath();
		}
	}

	private void showHamiltonianPath()
	{
		System.out.println("Hamiltonian path exists-");
		for (int i = 0; i < this.numOfVertex; i++) 
		{
			System.out.print(this.hamiltonianPath[i]+" ");
		}
		
	}

	
	private boolean findFesibleSolution(int position) 
	{
		if(position==numOfVertex)
		{
			if(this.adjencyMatrix[this.hamiltonianPath[position-1]][0]==1)
			{
				return true;
			}
			else
				{
				return false;
				}
		}
		
		for (int vertexIndex = 1; vertexIndex < this.numOfVertex; vertexIndex++) 
		{
			if(isFeasible(vertexIndex,position))
			{
				this.hamiltonianPath[position]=vertexIndex;
				if(findFesibleSolution(position+1))
				{
					return true;
				}
			}
		}
		return false;
	}

	private boolean isFeasible(int vertex, int actualPosition)
	{
		if(this.adjencyMatrix[actualPosition-1][vertex]==0)
		{
			return false;
		}
		for (int i = 0; i < actualPosition; i++) 
		{
			if(hamiltonianPath[i]==vertex)
			{
				return false;
			}
		}
		
		return true;
	}
	
}
