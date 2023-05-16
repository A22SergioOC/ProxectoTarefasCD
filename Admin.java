import java.util.ArrayList;

/**
 *
 * @author A22OscarNM
 */
public class Admin extends Membro{
    private String nomeMembro;
    private Equipo equipo;
    private int horasTraballadas;
    
    public Admin(String nomeMembro){
        super(nomeMembro);
        proxectos = new ArrayList();
    }
    
    public Admin(String nomeMembro, Equipo equipo){
        super(nomeMembro, equipo);
        proxectos = new ArrayList();
    }
    
    public void createProxecto(String nome, Cliente cliente, int horasTotales){
        Proxecto prox = new Proxecto(nome, cliente, horasTotales);
        proxectos.add(prox);
    }
    
    public void removeProxecto(Proxecto prox){
        proxectos.remove(prox);
    }
    
    public void removeOfEquipo(Membro membro, Equipo equipo){
        equipo.getMembrosEquipo().remove(membro);
    }
    
    public void addToEquipo(Membro membro, Equipo equipo){
        equipo.getMembrosEquipo().add(membro);
    }
}
