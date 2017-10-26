import java.util.Scanner;

public class Evaluacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		Colors colorEvaluacion= new Colors();
		
		String snombre;
		System.out.println("Ingresa tu nombre");
		snombre=sc.nextLine();
		
		byte bmentalidad;
		byte bpersintencia;
		byte bresponsabilidad;
		byte borientaci�n;
		byte bcomunicaci�n;
		byte btrabajo;
		byte bgesti�n;
		byte bdetalle;
		
		System.out.println("Mentalidades Generation");
		
		System.out.println("Introduce tu calificaci�n de Mentalidad de Crecimiento");
		bmentalidad=sc.nextByte();
		while (bmentalidad !=1 && bmentalidad !=2 &&bmentalidad !=3 && bmentalidad !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bmentalidad=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Persistencia");
		bpersintencia = sc.nextByte();
		while (bpersintencia !=1 && bpersintencia !=2 && bpersintencia !=3 && bpersintencia !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bpersintencia=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Responsabilidad Personal");
		bresponsabilidad=sc.nextByte();
		while (bresponsabilidad !=1 && bresponsabilidad !=2 && bresponsabilidad !=3 && bresponsabilidad !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bresponsabilidad=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Orientaci�n al futuro");
		borientaci�n=sc.nextByte();
		while (borientaci�n !=1 && borientaci�n !=2 && borientaci�n !=3 && borientaci�n !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			borientaci�n=sc.nextByte();
		}
		System.out.println("Mentalidades Back End");
		
		System.out.println("Introduce tu calificaci�n de Comunicaci�n");
		bcomunicaci�n=sc.nextByte();
		while (bcomunicaci�n !=1 && bcomunicaci�n !=2 && bcomunicaci�n !=3 && bcomunicaci�n !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bcomunicaci�n=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Trabajo en Equipo");
		btrabajo=sc.nextByte();
		while (btrabajo !=1 && btrabajo !=2 && btrabajo !=3 && btrabajo !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			btrabajo=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Gesti�n de Tiempo");
		bgesti�n=sc.nextByte();
		while (bgesti�n !=1 && bgesti�n !=2 && bgesti�n !=3 && bgesti�n !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bgesti�n=sc.nextByte();
		}
		System.out.println("Introduce tu calificaci�n de Orientaci�n al detalle");
		bdetalle=sc.nextByte();
		while (bdetalle !=1 && bdetalle !=2 && bdetalle !=3 && bdetalle !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bdetalle=sc.nextByte();
		}
		
		System.out.println("Tabla de datos \n");
		
		System.out.println("Mentalidad \t \t \t color \t  numero ");
		System.out.println("Mentalidad de  crecimiento \t "+colorEvaluacion.getColors(bmentalidad)+"\t "+bmentalidad);
		System.out.println("Persistencia \t \t \t "+colorEvaluacion.getColors(bpersintencia)+"\t "+bpersintencia);
		System.out.println("Responsabilidad Personal \t  "+colorEvaluacion.getColors(bresponsabilidad)+"\t "+bresponsabilidad);
		System.out.println("Orientaci�n al futuro  \t \t "+colorEvaluacion.getColors(borientaci�n)+"\t "+borientaci�n);
		
		System.out.println("Comunicaci�n \t \t \t"+colorEvaluacion.getColors(bcomunicaci�n)+"\t "+bcomunicaci�n);
		System.out.println("Trabajo en Equipo \t \t"+colorEvaluacion.getColors(btrabajo)+"\t "+btrabajo);
		System.out.println("Gesti�n del tiempo  \t \t"+colorEvaluacion.getColors(bgesti�n)+"\t "+bgesti�n);
		System.out.println("Orientaci�n al detalle  \t "+colorEvaluacion.getColors(bdetalle)+"\t "+bdetalle);
				
		int suma=(bmentalidad+bpersintencia+bresponsabilidad+borientaci�n+bcomunicaci�n+btrabajo+bgesti�n+bdetalle);
		System.out.println("Suma:"); System.out.println(suma);
		
		
		float promedio=(bmentalidad+bpersintencia+bresponsabilidad+borientaci�n+bcomunicaci�n+btrabajo+bgesti�n+bdetalle)/8f;
		System.out.println("Promedio Mentalidades:");
		System.out.println(promedio);
		
		float promedioGeneration=(bmentalidad+bpersintencia+bresponsabilidad+borientaci�n)/4f;
		System.out.println("Promedio Mentalidades Generation:");
		System.out.println(promedioGeneration);
		
		float promedioBack=(bcomunicaci�n+btrabajo+bgesti�n+bdetalle)/4f;
		System.out.println("Promedio Mentalidades Backend:");
		System.out.println(promedioBack);
		
}
}
