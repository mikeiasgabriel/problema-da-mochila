package geneticalgoritm;

import java.util.Arrays;

public class SubsetSumIndividual extends Individual {

	private int [] values;
	private int sum;
	private boolean genomes;
	
	public SubsetSumIndividual(int[] values, int sum) {
		boolean [] genomes= new boolean[values.length];
		
	}	
	
	@Override
	public Individual mutate() {
		return null;
	}

	@Override
	public Individual crossover(Individual other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected double evaluate() {
		int valuesSum = Arrays.stream(values).reduce(0, (x,y) -> x + y);
		return Math.abs(sum - valuesSum);
	}

	@Override
	public SubsetSumIndividual clone() {
		return (SubsetSumIndividual) super.clone();
	}
	
}
