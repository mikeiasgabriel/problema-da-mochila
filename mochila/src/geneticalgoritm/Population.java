package geneticalgoritm;

import java.util.Arrays;

public class Population {
	
	private Individual [] individuals;
	
	public Population(int size , Individual prototype, Selection selection) {
		individuals = new Individual[size];
		for(int i = 0; i < size; i++) {
			individuals[i] = prototype.clone();
		}
	}
	
	public Individual getBest() {
		Arrays.sort(individuals);
		return individuals[0];
	}
	
	public void nextGeneration() {
		
	}
}
