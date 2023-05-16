import java.util.ArrayList;

public class Tarefa {

    private ArrayList<Membro> membrosTarefa;
    private int horasTotales;
    private int horasConsumidas;

    public Tarefa(ArrayList<Membro> membrosTarefa, int horasTotales, int horasConsumidas) {
        this.membrosTarefa = membrosTarefa;
        this.horasTotales = horasTotales;
        this.horasConsumidas = horasConsumidas;
    }

    public boolean addMembroTarefa(Membro membro) {
        if (membrosTarefa != null) {
            membrosTarefa.add(membro);
            return true;
        }

        return false;
    }

    public boolean removeMembroTarefa(Membro membro) {
        if (membrosTarefa != null && !membrosTarefa.isEmpty()) {
            membrosTarefa.remove(membro);
            return true;
        }

        return false;
    }

    public void addHorasConsumidas(int horas) {
        this.horasConsumidas += horas;
    }

    public ArrayList<Membro> getMembrosTarefa() {
        return membrosTarefa;
    }

    public void setMembrosTarefa(ArrayList<Membro> membrosTarefa) {
        this.membrosTarefa = membrosTarefa;
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