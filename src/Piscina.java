
public class Piscina {
	public static void main(String[] args) {
		
		double diametroPiscina =  6;
		double custoPiscina = 75;
		double totalPiscina = total(diametroPiscina, custoPiscina);
		System.out.println("Total : " + totalPiscina );		
	}
	
	public static double raio(double diametroPiscina)
	{
		return diametroPiscina / 2;
	}
	
	public static double areaPiscina(double diametroPiscina)
	{
		return Math.PI * Math.pow(raio(diametroPiscina), 2);
	}
	
	public static double total(double diametroPiscina , double custoPiscina)
	{
		return areaPiscina(diametroPiscina) * custoPiscina;
	}

}
