package bcreacioninstancias;

public class Cliente {
    private String empresa;
    private String nombreContacto;
    private String telefono;
    private String email;
    
    public String getEmpresa(){
        return empresa;
    }
    
    public void setEmpresa(String empresa){
        String empresaSinEspacios=empresa.trim();
        if(empresaSinEspacios.length()>=1 && 
                empresaSinEspacios.length()<=100){
            this.empresa=empresaSinEspacios;
        }else{
            System.err.println("Empresa no valida");
        }
    }
//    public void setEmpresa(String nombreEmpresa){
//        empresa=nombreEmpresa;
//    }

}