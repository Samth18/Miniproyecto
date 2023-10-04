import java.util.ArrayList;
import java.util.Scanner;

public class ElminarCandidato {
    public static void main(String[] args) throws Exception {
        ArrayList <Candidato> lista = new ArrayList<Candidato>();
        try(Scanner scannerEliminar = new Scanner(System.in)){
            System.out.print("Digite la cedula del candidato que desea eliminar: ");
            String cedulaEliminar = scannerEliminar.nextLine();
            lista.forEach((i)->{
                if(i.getCedula().equals(cedulaEliminar)){
                    lista.remove(lista);
                }
            });
        }
    }
}