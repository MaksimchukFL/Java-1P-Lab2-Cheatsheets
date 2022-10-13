package Excepciones;

public class DivisionPorCero extends RuntimeException{
    /*
    Cuando creamos errores, pueden heredar de IOExeption o RuntimeExeption, lo ideal es que hereden de este primero (parece), ya que
    nos obligará a capturar la exepción con el bloque trycatch. Las clases con las que se construyen excepciones deben contener 2
    constructores, uno por defecto y uno que puede tener un parámetro.
     */

    public DivisionPorCero() {
    }

    public DivisionPorCero(String mensajeerror) {
        super(mensajeerror);
    }
}
