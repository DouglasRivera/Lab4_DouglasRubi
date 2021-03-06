/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_douglasrivera;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class Tiradores extends Jugadores {

    int TiroTres;
    int TiroDeDos;
    int ManejoBalon;

    public Tiradores() {
    }

    public Tiradores(int TiroTres, int TiroDeDos, int ManejoBalon) {
        setTiroTres(TiroTres);
        setTiroDeDos(TiroDeDos);
        setManejoBalon(ManejoBalon);
    }

    public Tiradores(String Nombre, String Apodo, int Numero, String EquipoFutbol, String EquipoBasket, String JugadorFavorito, boolean MayorEdad, int YearNacimiento, int NumeroEstrellas, Equipos MiEquipo, int TiroTres, int TiroDeDos, int ManejoBalon) {
        super(Nombre, Apodo, Numero, EquipoFutbol, EquipoBasket, JugadorFavorito, MayorEdad, YearNacimiento, NumeroEstrellas, MiEquipo);
        setTiroTres(TiroTres);
        setTiroDeDos(TiroDeDos);
        setManejoBalon(ManejoBalon);
    }

    public int getTiroTres() {
        return TiroTres;
    }

    public void setTiroTres(int TiroTres) {
        if (TiroTres >= 1 || TiroTres <= 100) {
            this.TiroTres = TiroTres;
        } else {
            JOptionPane.showMessageDialog(null, "No Ingreso el numero correcto");
        }
    }

    public int getTiroDeDos() {
        return TiroDeDos;
    }

    public void setTiroDeDos(int TiroDeDos) {
        if (TiroDeDos >= 1 || TiroDeDos <= 100) {
            this.TiroDeDos = TiroDeDos;
        } else {
            JOptionPane.showMessageDialog(null, "No ingreso el numero correcto");
        }
    }

    public int getManejoBalon() {
        return ManejoBalon;
    }

    public void setManejoBalon(int ManejoBalon) {
        if (ManejoBalon >= 1 || ManejoBalon <= 100) {
            this.ManejoBalon = ManejoBalon;
        } else {
            JOptionPane.showMessageDialog(null, "Ni Neymar tenia ese manejo");
        }
    }

    public boolean AtacarTiroTres() {
        Random rand = new Random();
        double ProbabilidadAnotar;
        ProbabilidadAnotar = (TiroTres + ManejoBalon) * 0.90 * (NumeroEstrellas / 10);
        int low = 1;
        int high = 101;
        int result = rand.nextInt(high - low) + low;
        if (result >= 1 && result <= ProbabilidadAnotar) {
            PuntosAnotados += 3;
            return true;
        } else {
            return false;
        }
    }

    public boolean AtacarTiroDos() {
        Random rand = new Random();
        double ProbabilidadAnotar;
        ProbabilidadAnotar = (TiroDeDos + ManejoBalon) * 0.90 * (NumeroEstrellas / 10);
        int low = 1;
        int high = 101;
        int result = rand.nextInt(high - low) + low;
        if (result >= 1 && result <= ProbabilidadAnotar) {
            PuntosAnotados += 2;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Nombre: " + Nombre + " Tipo jugador: Tirador " + "Puntos anotados " + PuntosAnotados;
    }
}
