
public class Coche {

	public int velocidad;

	public void acelerar(int aceleracion) {
		// TODO Auto-generated method stub
		velocidad += aceleracion;
	}

	 public void decelerar(int deceleracion) {
	        velocidad -=deceleracion;
	        if (velocidad<0) velocidad=0;
	    }

	//class
}
