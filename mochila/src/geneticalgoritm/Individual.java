package geneticalgoritm;

public abstract class Individual implements Comparable<Individual>, Cloneable, Variable {
	private double fitnessValue;

	public Individual() {
		super();
	}
	
	public double getFitness() {
		this.fitnessValue = evaluate();
		return this.fitnessValue;
	}
	
	protected abstract double evaluate();
	
	public boolean isIdeal() {
		if(Math.abs(fitnessValue) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Individual object) {
		if(this.fitnessValue < object.fitnessValue) {
			return 1;
		} else if(this.fitnessValue == object.fitnessValue) {
			return 0;
		} else {
			return -1;
		}
	}
	
	@Override
	public Individual clone() {
		try {
			return (Individual) super.clone();
	    } catch (CloneNotSupportedException e) {
	    	System.out.println("Cloning not allowed.");
	        return this;
	    }
	}
}
