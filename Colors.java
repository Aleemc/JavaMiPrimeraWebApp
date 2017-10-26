
public class Colors {

	public String getColors(int calificacion) {
		String szColor = "";
		if (calificacion == 1) {
			szColor = "Rojo";
		}
		
		if (calificacion == 2) {
			szColor = "Amarillo";
		}
		
		if (calificacion == 3) {
			szColor = "Verde";
		}
		if (calificacion == 4) {
			szColor = "Azul";
		}
		return szColor;

	}

}
