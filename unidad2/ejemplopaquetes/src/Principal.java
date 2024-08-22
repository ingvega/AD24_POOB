
import java.util.Date;
import paquete1.Paciente;
import paquete2.Cuarto;
import paquete2.subpaquete.Padecimiento;


public class Principal {
    public static void main(String[] args) {
        /*
        public - todos desde donde sea 
        protected - toda clase dentro de la misma carpeta + 
                           las clases hijas que esten en otro paquete
        default - toda clase dentro de la misma carpeta
        private - solo lo que haya en la misma clase
        */
        
        Paciente objeto1=new Paciente();
        //objeto1.nombre="Luis Perez";
        //objeto1.fechaNac=new Date();
        Padecimiento objeto2=new Padecimiento();
        objeto2.nombre="Diabetes";
        
        Cuarto objeto3=new Cuarto();
        objeto3.planta="A";
        //objeto3.numero=4;
    }
}
