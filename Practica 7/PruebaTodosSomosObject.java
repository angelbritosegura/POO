package todos.object;

public class PruebaTodosSomosObject {
	public static void main(String[] args) {
		TodosSomosObject todosSomosObject = new TodosSomosObject();
		System.out.println("todosSomosObject.toString(): " + todosSomosObject.toString());
		System.out.println("todosSomosObject.cualEstuClasePadre(): " + todosSomosObject.cualEstuClasePadre());
		System.out.println("Clase padre de PruebaTodosSomosObject: " + PruebaTodosSomosObject.class.getSuperclass().getName());
	}
}
