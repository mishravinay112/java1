package HamiltonianCycle;

public class App 
{
	public static void main(String[] args) 
	{
		HamiltonianAlgorithm h=new HamiltonianAlgorithm();
		int[][] adjencyMetric={{0,1,0,1},
							   {1,0,1,0},
							   {0,1,0,1},
							   {1,0,1,0}};
		h.hamiltonianCycle(adjencyMetric);
		
	}
}
