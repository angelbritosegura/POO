/** Equipo 3
* Brito Segura Angel
* Carranza Escobar Luis Enrique
* Osnaya Molina Victor Iv·n
* Vel·zquez MÈndez Diego Ignacio
*/
import java.util.ArrayList;
import java.util.Scanner;

//Solo si sirven los nuevos metodos
import java.util.Date;
import java.text.SimpleDateFormat;

public class AgendaApp2 {
	static ArrayList<Cita> agenda = new ArrayList<Cita>();
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("\nBienvenido a la agenda de citas");
			System.out.println("Elige que quieres hacer:\n1.-Dar de alta nueva cita");
			System.out.println("2.-Agregar asistentes a una cita \n3.-Consultar citas por fecha");
			System.out.println("4.-Ver todas las citas de la agenda\n5.-Salir");
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				nuevaCita();
				break;
			case 2:
				agregarAsistentes();
				break;
			case 3: 
				consultarCitas();
				break;
			case 4:
				verAgenda();
				break;
			case 5:
				System.out.println("Gracias por usar la agenda, hasta luego");
				break;
			default:
				System.out.println("La opcion no es valida");
			}
			
		}while(opcion != 5);
		teclado.close();
	}

	public static void nuevaCita() {
		String titulo;
		String calle;
		int numero;
		String colonia;
		String delegacion;
		String estado;
		System.out.println("Ingrese el tÌtulo de la cita: ");
		teclado.nextLine();
		titulo = teclado.nextLine();
		System.out.println("Ingrese la fecha de la cita (dd:mm:aaaa): ");
		Fecha fecha = new Fecha(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		System.out.println("Ingrese la hora de la cita (hh:mm:ss): ");
		Hora hora = new Hora(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		Cita cita = new Cita(titulo, fecha, hora);
		System.out.println("Ingrese el lugar de la cita: ");
		System.out.println("Calle: ");
		teclado.nextLine();
		calle = teclado.nextLine();
		System.out.println("Numero: ");
		numero = teclado.nextInt();
		System.out.println("Colonia: ");
		teclado.nextLine();
		colonia = teclado.nextLine();
		System.out.println("Delegacion: ");
		delegacion = teclado.nextLine();
		System.out.println("Estado: ");
		estado = teclado.nextLine();
		Direccion lugar = new Direccion(calle, numero, colonia, delegacion, estado);
		cita.setLugar(lugar);
		agenda.add(cita);
	}
	
	public static void agregarAsistentes() {
		int numcita;
		int num_asistentes;
		String nombre;
		String paterno;
		String materno;
		String calle;
		int numero;
		String colonia;
		String delegacion;
		String estado;
		Cita cita;
		System.out.print("\nIngrese el n˙mero de cita a buscar: ");
		numcita = teclado.nextInt();
		numcita = numcita-1;
		for(int i=0; i<agenda.size(); i++){
			if (i==numcita) {
				cita = agenda.get(numcita);
				System.out.println("Cita encontrada.\nIngrese n˙mero de asistentes a ingresar: ");
				num_asistentes=teclado.nextInt();
				for(int j=0; j<num_asistentes; j++){
					int numa;
					numa=cita.getAsistentes().size();
					System.out.println("\nAsistente "+(numa+1)+":");
					System.out.print("Ingrese nombre completo (nombre, apellido paterno y apellido materno): ");
					nombre = teclado.next();
					paterno = teclado.next();
					materno = teclado.next();
					System.out.println("Ingrese su fecha de nacimiento (dd:mm:aaaa): ");
					Fecha fecha = new Fecha(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
					System.out.println("Ingrese su domicilio: ");
					System.out.println("Calle: ");
					teclado.nextLine();
					calle = teclado.nextLine();
					System.out.println("Numero: ");
					numero = teclado.nextInt();
					System.out.println("Colonia: ");
					teclado.nextLine();
					colonia = teclado.nextLine();
					System.out.println("Delegacion: ");
					delegacion = teclado.nextLine();
					System.out.println("Estado: ");
					estado = teclado.nextLine();
					Direccion direccion = new Direccion(calle, numero, colonia, delegacion, estado);
					Persona asistente = new Persona(nombre, paterno, materno, fecha, direccion);
					cita.agregaAsistente(asistente);
				}
			}
		}
	}

	public static void consultarCitas() {
		String hora;
		System.out.print("\nIngrese la fecha a buscar (dd:mm:aaaa): ");
		Fecha fecha = new Fecha(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
		for(Cita i:agenda){
			//El mètodo equals tendría que ser modificado para poder ver que de fecha es igual a fecha
			if (i.getFecha().equals(fecha)) {
				System.out.println("TÌtulo de la cita: "+i.getTitulo());
				System.out.println("Hora: "+imprimeHora(i.getHora()));
				System.out.println("Lugar: "+i.getLugar());
				System.out.println("Asistentes: "+i.getAsistentes());
			}
		}
	}
	
	public static void verAgenda() {
		int j;
		j=0;
		for(Cita i:agenda){
			j++;
			System.out.println("\n");
			System.out.println("Cita "+j+":");
			System.out.println("TÌtulo de la cita: "+i.getTitulo());
			System.out.println("Fecha: "+i.getFecha());
			System.out.println("Hora: "+i.getHora());
			System.out.println("Lugar: "+i.getLugar());
			System.out.println("Asistentes: "+i.getAsistentes());
		}
	}
	public String imprimeHora(Hora hora){
		Date h = new Date();
		h.setHours(hora.getHoras());
		h.setMinutes(hora.getMinutos());
		h.setSeconds(hora.getSegundos());
		SimpleDateFormat standar = new SimpleDateFormat("HH:mm:ss");
		return standar.format(h);
	}
	public String imprimeFecha(Fecha fecha){
		Date f = new Date();
		f.setDate(fecha.getDia());
		f.setMonth(fecha.getMes()-1);
		f.setYear(fecha.getAnio()-1900);
		SimpleDateFormat standar = new SimpleDateFormat("dd/MM/yyyy");
		return standar.format(f);
	}
}