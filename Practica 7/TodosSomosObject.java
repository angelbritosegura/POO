package todos.object;

public class TodosSomosObject {
	public String cualEstuClasePadre() {
		return this.getClass().getSuperclass().getName();
	}
}