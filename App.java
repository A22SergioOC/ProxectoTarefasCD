import java.util.Scanner;

public class App{

    private static final String password = "abc";
    private static boolean sudoer = false;
    

    public static void menuMembro(){
        Scanner sc = new Scanner(System.in);
        int resposta = 0;
        do {
            System.out.println("Por favor, indentifíquese:\n1.Usuario\n2.Administrador");
            resposta = sc.nextInt();
        } while (resposta < 1 || resposta >2);

        if (resposta ==1) {
            System.out.println("Benvido ao sistema, dame o teu nome");
            Membro membro = new Membro(sc.next());
        }else{
            System.out.println("Introduza o seu contrasinal: ");
            String pass = sc.next().trim();
            if(pass.equals(password)){
                System.out.println("Benvido ao sistema Admin, introduza os seus datos: ");
                Admin admin = new Admin(sc.next());
                sudoer = true;
            }else{
                System.out.println("Contrasinal incorrecto");
            }
        }
        
    }


    public static void main(String[] args) {
        menuMembro();
        if(sudoer){
        
        }else{
            System.out.println("Que quieres hacer: ");
            System.out.println("    1. Fichar horas: ");
            System.out.println("    2. Marcar como completada unha tarea: ");
            System.out.println("    3. Crear unha tarefa nova: ");
            //Para el siguiente dia hay que modificar tarea para tener estado de completado.
        }
    }
}
