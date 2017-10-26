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
		byte borientación;
		byte bcomunicación;
		byte btrabajo;
		byte bgestión;
		byte bdetalle;
		
		System.out.println("Mentalidades Generation");
		
		System.out.println("Introduce tu calificación de Mentalidad de Crecimiento");
		bmentalidad=sc.nextByte();
		while (bmentalidad !=1 && bmentalidad !=2 &&bmentalidad !=3 && bmentalidad !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bmentalidad=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Persistencia");
		bpersintencia = sc.nextByte();
		while (bpersintencia !=1 && bpersintencia !=2 && bpersintencia !=3 && bpersintencia !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bpersintencia=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Responsabilidad Personal");
		bresponsabilidad=sc.nextByte();
		while (bresponsabilidad !=1 && bresponsabilidad !=2 && bresponsabilidad !=3 && bresponsabilidad !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bresponsabilidad=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Orientación al futuro");
		borientación=sc.nextByte();
		while (borientación !=1 && borientación !=2 && borientación !=3 && borientación !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			borientación=sc.nextByte();
		}
		System.out.println("Mentalidades Back End");
		
		System.out.println("Introduce tu calificación de Comunicación");
		bcomunicación=sc.nextByte();
		while (bcomunicación !=1 && bcomunicación !=2 && bcomunicación !=3 && bcomunicación !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bcomunicación=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Trabajo en Equipo");
		btrabajo=sc.nextByte();
		while (btrabajo !=1 && btrabajo !=2 && btrabajo !=3 && btrabajo !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			btrabajo=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Gestión de Tiempo");
		bgestión=sc.nextByte();
		while (bgestión !=1 && bgestión !=2 && bgestión !=3 && bgestión !=4) {
			System.out.println("Introduce un numero del 1 al 4");
			bgestión=sc.nextByte();
		}
		System.out.println("Introduce tu calificación de Orientación al detalle");
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
		System.out.println("Orientación al futuro  \t \t "+colorEvaluacion.getColors(borientación)+"\t "+borientación);
		
		System.out.println("Comunicación \t \t \t"+colorEvaluacion.getColors(bcomunicación)+"\t "+bcomunicación);
		System.out.println("Trabajo en Equipo \t \t"+colorEvaluacion.getColors(btrabajo)+"\t "+btrabajo);
		System.out.println("Gestión del tiempo  \t \t"+colorEvaluacion.getColors(bgestión)+"\t "+bgestión);
		System.out.println("Orientación al detalle  \t "+colorEvaluacion.getColors(bdetalle)+"\t "+bdetalle);
				
		int suma=(bmentalidad+bpersintencia+bresponsabilidad+borientación+bcomunicación+btrabajo+bgestión+bdetalle);
		System.out.println("Suma:"); System.out.println(suma);
		
		
		float promedio=(bmentalidad+bpersintencia+bresponsabilidad+borientación+bcomunicación+btrabajo+bgestión+bdetalle)/8f;
		System.out.println("Promedio Mentalidades:");
		System.out.println(promedio);
		
		float promedioGeneration=(bmentalidad+bpersintencia+bresponsabilidad+borientación)/4f;
		System.out.println("Promedio Mentalidades Generation:");
		System.out.println(promedioGeneration);
		
		float promedioBack=(bcomunicación+btrabajo+bgestión+bdetalle)/4f;
		System.out.println("Promedio Mentalidades Backend:");
		System.out.println(promedioBack);
		
}
}
