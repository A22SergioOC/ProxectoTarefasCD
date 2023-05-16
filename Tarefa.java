public class Tarefa {

    private int horasTotales;
    private int horasConsumidas;
    private Proxecto proxectoTarefa;

    public Tarefa(Proxecto proxecto, int horasTotales, int horasConsumidas) {
        this.proxectoTarefa = proxecto;
        this.horasTotales = horasTotales;
        this.horasConsumidas = horasConsumidas;
    }

    public void addHorasConsumidas(int horas) {
        this.horasConsumidas += horas;
    }

    public Proxecto getProxectoTarefa() {
        return proxectoTarefa;
    }

    public void setProxectoTarefa(Proxecto proxecto) {
        this.proxectoTarefa = proxecto;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public int getHorasConsumidas() {
        return horasConsumidas;
    }

    public void setHorasConsumidas(int horasConsumidas) {
        this.horasConsumidas = horasConsumidas;
    }

}
