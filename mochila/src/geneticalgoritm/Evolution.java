package geneticalgoritm;

public class Evolution {
	private Population population;
	private int maxGenerations;
	
	public Evolution(Population population, int maxGenerations) {
		this.population = population;
		this.maxGenerations = maxGenerations;
	}
	
	public Individual getBest() {
		return population.getBest();
	}
	
	public void evolve() {		
		int currentGeneration = 0;
		Individual currentBestIndividual;
		
		do {
			currentBestIndividual = population.getBest();
			System.out.println("Current Generation: " + (++currentGeneration));
			System.out.println("Best of that generation: " + currentBestIndividual);
			population.nextGeneration();
		} while((currentGeneration < this.maxGenerations) && (!currentBestIndividual.isIdeal()));
	}
}
