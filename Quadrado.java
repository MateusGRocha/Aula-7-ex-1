
public class Quadrado implements AreaCalculavel {

	/**
	 * Metodo para calcular Quadrado
	 */
	double lado;
	
	public double calcularArea(double lado) {
		this.lado = lado;
		
		return lado * lado;
	}

	/**
	 * Metodos Get e Set
	 * @return
	 */
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	/**
	 * Construtor
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado;
	}
	
	

}
