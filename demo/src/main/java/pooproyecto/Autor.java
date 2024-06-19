package pooproyecto

public class Autor{

  private int codigoIdenteificacion;
  private String institucion;
  private String campoInvestigaccion;
  
  public Autor(int codigoIdentificacion, String institucion, String campoInvestigacion){
    this.codigoIdentificacion = codigoIdentificacion;
    this.institucion = institucion;
    this.campoInvestigacion = campoInvestigacion;
  }

  public int getCodigoIdentificacion(){
    return codigoIdentificacion;
  }

  public void setCodigoIdentificacion(int codigoIdentificacion){
    this.codigoIdentificacion = codigoIdentificacion;
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

  public void setCampoInvestigacion(String campoInvestigacion){
    this.campoInvestigacion = campoInvestigacion;
  }

  
    
