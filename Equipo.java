import java.util.List;

/**
 *
 * @author A22OscarNM
 */
public class Equipo {

    private String nomeEquipo;
    private List<Membro> membrosEquipo;

    public String getNomeEquipo() {
        return nomeEquipo;
    }

    public void setNomeEquipo(String nomeEquipo) {
        this.nomeEquipo = nomeEquipo;
    }

    public List<Membro> getMembrosEquipo() {
        return membrosEquipo;
    }

    public boolean addMembroEquipo(Membro membro) {
        if (membrosEquipo != null) {
            this.membrosEquipo.add(membro);
            return true;
        }

        return false;
    }

    public boolean removeMembroEquipo(Membro membro) {
        if (membrosEquipo != null) {
            this.membrosEquipo.remove(membro);
            return true;
        }

        return false;
    }

    public String verMembrosEquipo() {
        StringBuilder sb = new StringBuilder();
        for (Membro membro : membrosEquipo) {
            sb.append(membro).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
