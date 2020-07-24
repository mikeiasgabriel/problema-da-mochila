package geneticalgoritm;

import java.util.Random;

public class TournamentSelection implements Selection {

	private double mutationProb;
	private double crossoverProb;
	
	public TournamentSelection(double mutationProb, double crossoverProb) {
		this.mutationProb = mutationProb;
		this.crossoverProb = crossoverProb;
	}
	
	@Override
	public Individual reproduce(Individual[] pop) {
		
		Individual resultIndividual;
		
		Random random = new Random();

		int firstPosition = random.nextInt() * pop.length;
		int secondPosition = random.nextInt() * pop.length;
		
		if(random.nextDouble() <= crossoverProb) {
			resultIndividual = pop[firstPosition].crossover(pop[secondPosition]);
		} else {			
			resultIndividual = pop[(firstPosition < secondPosition) ? firstPosition : secondPosition];
		}
		
		if(random.nextDouble() <= mutationProb) {
			resultIndividual = resultIndividual.mutate();
		}
		
		return resultIndividual;
	}
}
