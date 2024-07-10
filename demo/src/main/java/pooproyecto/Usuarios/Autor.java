package pooproyecto.Usuarios;
import java.util.*;
public class Autor {
    public static final String set = null;
    private int codigoIdentificacion;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String institucion;
    private String campoInvestigacion;
    // private Articulo articulo;
    
    
    public Autor(int codigoIdentificacion, String nombre, String apellido, String correoElectronico, String institucion, String campoInvestigacion){
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.institucion = institucion;
        this.campoInvestigacion = campoInvestigacion;
        // this.articulo = articulo; Recordar descomentarlo cuando este la clase articulo
    }
    public int getCodigoId(){
    return codigoIdentificacion;
    }
    public void setCodigoId(int codigo){
    this.codigoIdentificacion = codigo;
    }
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public String getApellido(){
    return apellido;
    }
    public void setApellido(String apellido){
    this.apellido = apellido;
    }
    public String getCorreo(){
    return correoElectronico;
    }
    public void setCorreo(String correo){
    this.correoElectronico = correo;
    }
    public String getInstitucion(){
    return institucion;
    }
    public void setInstitucion(String institucion){
    this.institucion = institucion;
    }
    public String getCampoInvestigacion(){
    return campoInvestigacion;
    }
    public void setCampoInvestigacion(String campo){
        this.campoInvestigacion = campo;
    }
    // public Articulo getArticulo(){
    // return articulo;
    // }
    // public void setArticulo(Articulo articulo){
    // this.articulo = articulo;
    // }
    
    public void someterArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese su correo electronico: ");
        String correo = sc.nextLine();
        System.out.print("Ingrese su institucion: ");
        String institucion = sc.nextLine();
        System.out.print("Ingrese su campo de investigacion: ");
        String campoInvestigacion = sc.nextLine();
        System.out.println("Ingrese los  datos de su artículo: ");
        System.out.print("Ingrese el título: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el resumen: ");
        String resumen = sc.nextLine();
        System.out.print("Ingrese el contenido: ");
        String contenido = sc.nextLine();
        System.out.print("Ingrese las palabras claves: ");
        String palabrasClave = sc.nextLine();
        //Autor a = new Autor()
    }
}
