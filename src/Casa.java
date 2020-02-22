
public class Casa {
	public static void main(String[] args) {
		double custoCasa = 60;
		double larguraCasa = 20;
		double alturaCasa  = 20;
		double totalCasa = total(larguraCasa , alturaCasa , custoCasa);
		System.out.println("total : " + totalCasa);
		
	}
	
	public static double area(double larguraCasa , double alturaCasa )
	{
		return (larguraCasa  * alturaCasa ) * 0.5;
	}
	
	public static double total(double larguraCasa , double alturaCasa , double custoCasa )
	{
		return area(larguraCasa , alturaCasa ) * custoCasa;
	}
}

