package abstract_classes;

public class Boston extends City{
double special = (population*0.5);
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate + special;
	}
}
