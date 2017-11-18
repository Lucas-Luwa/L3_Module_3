package abstract_classes;

public class LosAngeles extends City{
double special = (growthRate*0.5);
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population*growthRate*special;
	}
}
