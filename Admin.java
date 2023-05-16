package com.mycompany.oscartarefa;

/**
 *
 * @author A22OscarNM
 */
public class Admin extends Membro{
    private String nomeMembro;
    private Equipo equipo;
    private int horasTraballadas;
    
    public Admin(){
    
    }
    
    public Admin(String nomeMembro){
        super(nomeMembro);
    }
    
    public Admin(String nomeMembro, Equipo equipo){
        super(nomeMembro, equipo);
    }
    
    public void createProxecto(String nome){
        
    }
    
    public void createProxecto(String nome, Cliente cliente){
        
    }
    public void createProxecto(String nome, Cliente cliente, int horasTotales){
    
    }
    public void createProxecto(String nome, Cliente cliente, int horasTotales, Membro[] membrosProxecto){
   
    }
    
    public void removeProxecto(Proxecto proxecto){
        
    }
    
    public void removeOfEquipo(Membro membro, Equipo equipo){
    
    }
    
    public void engadirAEquipo(Membro membro, Equipo equipo){
    
    }
    
    public void modificarHorasProxecto(int horas){
        
    }
}
