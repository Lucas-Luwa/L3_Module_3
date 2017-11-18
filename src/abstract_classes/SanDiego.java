package abstract_classes;

import javax.swing.JOptionPane;

public class SanDiego extends City{
	int population = getPopulation();
	double growthRate = getGrowthRate();
	int special = 1000000;
public static void main(String[] args) {

}
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (population*growthRate)+special;
		
	}
}
