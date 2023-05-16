package com.mycompany.oscartarefa;

/**
 *
 * @author A22OscarNM
 */
public class Membro {

    private String nomeMembro;
    private Equipo equipo;
    private int horasTraballadas;
    
    public Membro(String nome){
        nomeMembro = nome;
    }
    
    public Membro(String nome, Equipo equipo){
        nomeMembro = nome;
        this.equipo = equipo;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }
    
    public int getHorasTraballadas(){
        return horasTraballadas;
    }
    
    public void fichar(int horas){
        horasTraballadas += horas;
    }
    
}
