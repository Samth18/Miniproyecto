import java.util.ArrayList;

public class LeerCandidato {
    public static void main(String[] args) throws Exception {
        ArrayList <Candidato> candidato = new ArrayList<Candidato>();
        candidato.forEach((i)->{
            System.out.println(i.getNombre());
            System.out.println(i.getCedula());
            System.out.println(i.getCiudades());
            System.out.println(i.getIdeologia());
            System.out.println(i.getPartido());
            System.out.println(i.getPromesas());
            System.out.println(i.getVotos());
        });
    }
}    