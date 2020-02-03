public class Currency {

public static void main(String[] args){

	double cad = 10.0;

	// USD
	double usd = 1.32 * cad;

	// EUR
	double eur = 1.46 * cad;

	// Initial currency
	System.out.println("Initial currency is " + cad);

	// Convert USD to CAD
	System.out.printf("Currency of USD to CAD is " + "%.2f\n", usd);

	// Convert EUR to CAD
	System.out.println("Currency of EUR to CAD is " + eur);
	}
}
