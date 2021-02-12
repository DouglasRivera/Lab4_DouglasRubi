/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_douglasrivera;

import java.util.ArrayList;

/**
 *
 * @author famii
 */
public class Equipos {
    String Nombre;
    String Estadio;
    String Pais;
    String Entrenador;
    String Dueño;
    String Mascota;
    int YearCreacion;
    String Color;
    boolean TieneTurno;
    ArrayList <Jugadores> Jugadores = new ArrayList();

    public Equipos() {
    }

    public Equipos(String Nombre, String Estadio, String Pais, String Entrenador, String Dueño, String Mascota, int YearCreacion, String Color) {
        this.Nombre = Nombre;
        this.Estadio = Estadio;
        this.Pais = Pais;
        this.Entrenador = Entrenador;
        this.Dueño = Dueño;
        this.Mascota = Mascota;
        this.YearCreacion = YearCreacion;
        this.Color = Color;
        TieneTurno = false;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String Entrenador) {
        this.Entrenador = Entrenador;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getMascota() {
        return Mascota;
    }

    public void setMascota(String Mascota) {
        this.Mascota = Mascota;
    }

    public int getYearCreacion() {
        return YearCreacion;
    }

    public void setYearCreacion(int YearCreacion) {
        this.YearCreacion = YearCreacion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public ArrayList<Jugadores> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public boolean isTieneTurno() {
        return TieneTurno;
    }

    public void setTieneTurno(boolean TieneTurno) {
        this.TieneTurno = TieneTurno;
    }

}
