/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_douglasrivera;

import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class Jugadores{
    String Nombre;
    String Apodo;
    int Numero;
    String EquipoFutbol;
    String EquipoBasket;
    String JugadorFavorito;
    boolean MayorEdad;
    int YearNacimiento;
    int NumeroEstrellas;
    Equipos MiEquipo;
    boolean TieneElBalon;

    public Jugadores() {
    
    }

    public Jugadores(String Nombre, String Apodo, int Numero, String EquipoFutbol, String EquipoBasket, String JugadorFavorito, boolean MayorEdad, int YearNacimiento, int NumeroEstrellas, Equipos MiEquipo) {
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Numero = Numero;
        this.EquipoFutbol = EquipoFutbol;
        this.EquipoBasket = EquipoBasket;
        this.JugadorFavorito = JugadorFavorito;
        this.MayorEdad = MayorEdad;
        this.YearNacimiento = YearNacimiento;
        setNumeroEstrellas(NumeroEstrellas);  
        this.MiEquipo = MiEquipo;
        TieneElBalon = false;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getEquipoFutbol() {
        return EquipoFutbol;
    }

    public void setEquipoFutbol(String EquipoFutbol) {
        this.EquipoFutbol = EquipoFutbol;
    }

    public String getEquipoBasket() {
        return EquipoBasket;
    }

    public void setEquipoBasket(String EquipoBasket) {
        this.EquipoBasket = EquipoBasket;
    }

    public String getJugadorFavorito() {
        return JugadorFavorito;
    }

    public void setJugadorFavorito(String JugadorFavorito) {
        this.JugadorFavorito = JugadorFavorito;
    }

    public boolean isMayorEdad() {
        return MayorEdad;
    }

    public void setMayorEdad(boolean MayorEdad) {
        this.MayorEdad = MayorEdad;
    }

    public int getYearNacimiento() {
        return YearNacimiento;
    }

    public void setYearNacimiento(int YearNacimiento) {
        this.YearNacimiento = YearNacimiento;
    }

    public int getNumeroEstrellas() {
        return NumeroEstrellas;
    }

    public void setNumeroEstrellas(int NumeroEstrellas) {
        if(NumeroEstrellas >= 1 || NumeroEstrellas <=5){
         this.NumeroEstrellas = NumeroEstrellas;  
       }else{
             JOptionPane.showMessageDialog(null, "Ingreso un numero de estrellas inexistentes");
        } 
    }

    public Equipos getMiEquipo() {
        return MiEquipo;
    }

    public void setMiEquipo(Equipos MiEquipo) {
        this.MiEquipo = MiEquipo;
    }

    public boolean isTieneElBalon() {
        return TieneElBalon;
    }

    public void setTieneElBalon(boolean TieneElBalon) {
        this.TieneElBalon = TieneElBalon;
    }
    
    public void pasarBalon(int jugador){
        if(jugador<=0 || MiEquipo.getJugadores().size()-1>=jugador){
            JOptionPane.showMessageDialog(null, "Posicion de jugador no existe.");
            return;
        }
        if(!TieneElBalon){
             JOptionPane.showMessageDialog(null, "Este jugador no tiene el balon.");
            return;
        }
        MiEquipo.getJugadores().get(jugador).TieneElBalon = true;
        this.TieneElBalon = false;
    }
    @Override
    public String toString() {
        return "Jugadores{" + "Nombre=" + Nombre + ", Apodo=" + Apodo + ", Numero=" + Numero + ", EquipoFutbol=" + EquipoFutbol + ", EquipoBasket=" + EquipoBasket + '}';
    }
    
}
