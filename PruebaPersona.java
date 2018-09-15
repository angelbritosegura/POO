//Práctica 5
public class PruebaPersona {

	public static void main(String[] args) {
		Persona per1 = new Persona();
		Fecha nac = new Fecha();
		per1.setNombre("Juan");
		per1.setApellido("Perez");
		nac.setDia(15);
		nac.setMes(8);
		nac.setAnio(1950);
		per1.setFNacimiento(nac);
		System.out.println("Nombre: " + per1.getNombre());
		System.out.println("Apellido: " + per1.getApellido());
		System.out.println("Fecha Nacimiento: " + per1.getFNacimiento().getDia() + "/" + per1.getFNacimiento().getMes()+"/"+per1.getFNacimiento().getAnio());
		Persona per2 = new Persona();
		per2.setNombre("Juan");
		per2.setApellido("Perez");
		per2.setFNacimiento(15, 8, 1950);
		System.out.println("Nombre: " + per2.getNombre());
		System.out.println("Apellido: " + per2.getApellido());
		System.out.println("Fecha Nacimiento: " + per2.getFNacimiento());
	}

}
