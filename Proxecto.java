import java.util.ArrayList;

public class Proxecto {

    private String nomeProxecto;
    private Cliente cliente;
    private int horasTotales;
    private ArrayList<Membro> membrosProxecto;

    public Proxecto(String nomeProxecto, Cliente cliente, int horasTotales) {
        this.nomeProxecto = nomeProxecto;
        this.cliente = cliente;
        this.horasTotales = horasTotales;
    }

    public String getNomeProxecto() {
        return nomeProxecto;
    }

    public void setNomeProxecto(String nomeProxecto) {
        this.nomeProxecto = nomeProxecto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public ArrayList<Membro> getMembrosProxecto() {
        return membrosProxecto;
    }

    public void setMembrosProxecto(ArrayList<Membro> membrosProxecto) {
        this.membrosProxecto = membrosProxecto;
    }

    public boolean addMembroProxecto(Membro membro) {

        if (membrosProxecto != null) {
            membrosProxecto.add(membro);
            return true;
        }

        return false;
    }

    public boolean removeMembroProxecto(Membro membro) {

        if (membrosProxecto != null && !membrosProxecto.isEmpty()) {
            membrosProxecto.remove(membro);
            return true;
        }

        return false;

    }

}