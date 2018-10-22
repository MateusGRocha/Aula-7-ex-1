
public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciar novos Objetos
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Circunferencia circunferencia = new Circunferencia();
			
		//adicionar valores e Imprimir
		double q = quadrado.calcularArea(5.0);
		System.out.println(q);
		
		double r = retangulo.calcularArea(5, 4);
		System.out.println(r);
		
		double c = circunferencia.calcularArea(5);
		System.out.println(c);
		
	}

}
