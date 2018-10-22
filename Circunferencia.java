
public class Circunferencia implements AreaCalculavel {

	/**
	 * Metodo para Calculo da Area
	 */
	double raio;
	
	public double calcularArea(double raio) {
		this.raio = raio;
		return Math.PI * raio * raio;
	}
	
	/**
	 * Metodos Get e Set
	 * @return
	 */
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	/**
	 * Construtor
	 */
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return raio;
	}
	
	

}
