public class Run {
	public static void main (String[] args){
		int edad = 16;

		try {

			EdadException edadEx = new EdadException();
			edadEx.validarEdad(edad);
		}
		catch (EdadException e){
			e.printStackTrace();
			System.out.println(e.getMessage());

		} catch (Exception e){
			e.printStackTrace();
		}

	}
}