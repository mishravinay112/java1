package GraphColoring;

public class App {

	public static void main(String[] args) 
	{	
		int graphMetrix[][]={{0,1,0,1,0},
							 {1,0,1,1,0},
							 {0,1,0,1,0},
							 {1,1,1,0,1},
							 {0,0,0,1,0}};
		int numOfColors=4;
		GreedyColoring gc= new GreedyColoring(graphMetrix, numOfColors);
		gc.solveColoringProblem();

	}

}
