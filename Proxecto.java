import java.util.ArrayList;

public class Proxecto {

    private String nomeProxecto;
    private Cliente cliente;
    private int horasTotales;
    private ArrayList<Equipo> equiposProxecto;

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

    public ArrayList<Equipo> getEquiposProxecto() {
        return equiposProxecto;
    }

    public boolean addEquipoProxecto(Equipo equipo) {

        if (equiposProxecto != null) {
            equiposProxecto.add(equipo);
            return true;
        }

        return false;
    }

    public boolean removeEquipoProxecto(Equipo equipo) {

        if (equiposProxecto != null && !equiposProxecto.isEmpty()) {
            equiposProxecto.remove(equipo);
            return true;
        }

        return false;

    }

}
