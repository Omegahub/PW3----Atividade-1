
public class Construcao {
	public static void main(String[] args) {
		
		double larguraCasa = 20;
		double alturaCasa = 20;
		double custoCasa = 60;
		double diametroPiscina = 6;
		double custoPiscina = 75;
		
		double casaTotal = Casa.total(larguraCasa, alturaCasa, custoCasa);
		double piscinaTotal = Piscina.total(diametroPiscina, custoPiscina);
		
		System.out.println("Rsultado : " + String.format("custo total casa R$ %.2f \n"
				+ "custo total piscina R$ %.2f \n"
				+ "custo total R$ %.2f", casaTotal, piscinaTotal, total(casaTotal, piscinaTotal)));
		
		
	}
	
	public static double total (double casaTotal, double piscinaTotal)
	{
		return casaTotal + piscinaTotal;
	}

}
