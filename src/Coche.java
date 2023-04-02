
public class Coche {

	public int velocidad;

	public void acelerar_AlbertPB(int aceleracion) {
		// TODO Auto-generated method stub
		velocidad += aceleracion;
	}

	 public void decelerar_AlbertPB(int deceleracion) {
	        velocidad -=deceleracion;
	        if (velocidad<0) velocidad=0;
	    }

	//class
}
