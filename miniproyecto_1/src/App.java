import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Crud.limparPantalla();
        Scanner scanner = new Scanner(System.in);
        byte opciones;
        do{
            System.out.println("--------Bienvenido Ciudadano/Ciudadana-----------\n");
            System.out.println("--------Digite la opcion a la cual desee acceder---------\n");
            System.out.println("1) Sistema de registro candidato");
            System.out.println("2) Mostrar los votos de candidatos");
            System.out.println("3) Motrar candidato ganador");
            System.out.println("4) Mostrar las ciudades con menos candidatos inscritos");
            System.out.println("5) Mostrar partido politico con mas candidatos");
            System.out.println("0) Salir de la aplicacion");
            System.out.print("Digite una opcion: ");
            String input = scanner.nextLine();

            try {
                opciones = Byte.parseByte(input);
            } catch (NumberFormatException e) {
                // Si no se puede convertir a byte, asignamos un valor que no afectará el bucle
                opciones = -1;
            }

            System.out.println();
            switch(opciones){
                case 1: Menu(args); break;
                case 2: Crud.reporte(); break;
                case 3: Crud.candidatoGanador(Crud.listaCandidato); break;
                case 4: Crud.top3Ciudades(Crud.listaCandidato); break;
                case 5: Crud.partidoConMasCandidatos(Crud.listaCandidato); break;
                case 0: break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(opciones != 0);
        scanner.close();
    }
    
    public static void Menu(String[] args) throws Exception {
        Crud.limparPantalla();
        Scanner scanner = new Scanner(System.in);
        byte opciones;
        do{
        System.out.println("---Sistema de registro---\n");
        System.out.println("1) Insertar candidato");
        System.out.println("2) Lista de todos los candidatos");
        System.out.println("3) Actualizar candidato");
        System.out.println("4) Eliminar candidato");
        System.out.println("0) Volver menu principal");
        System.out.print("Seleccione alguna opcion: ");
        String input = scanner.nextLine();

        try {
            opciones = Byte.parseByte(input);
        } catch (NumberFormatException e) {
            // Si no se puede convertir a byte, asignamos un valor que no afectará el bucle
            opciones = -1;
        }

        System.out.println();
            switch(opciones) {
                case 1: 
                    Crud.crearCandidato(); 
                    break;
                case 2: Crud.leerCandidato();
                    break;
                case 3: Crud.ActualizarCandidato();
                    break;
                case 4: Crud.EliminarCandidato();
                    break;
                case 0: break;
                default: System.out.println("Opcion Invalida");
            }
        }while(opciones != 0);

    }    
}