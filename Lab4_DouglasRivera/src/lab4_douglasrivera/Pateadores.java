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
public class Pateadores extends Jugadores {

    int HabilidadPateadora;
    int Fuerza;
    int HabilidadRegateadora;

    public Pateadores() {
    }

    public Pateadores(int HabilidadPateadora, int Fuerza, int HabilidadRegateadora) {
        setHabilidadPateadora(HabilidadPateadora);
        setFuerza(Fuerza);
        setHabilidadRegateadora(HabilidadRegateadora);
    }

    public Pateadores(String Nombre, String Apodo, int Numero, String EquipoFutbol, String EquipoBasket, String JugadorFavorito, boolean MayorEdad, int YearNacimiento, int NumeroEstrellas, Equipos MiEquipo, int HabilidadPateadora, int Fuerza, int HabilidadRegateadora) {
        super(Nombre, Apodo, Numero, EquipoFutbol, EquipoBasket, JugadorFavorito, MayorEdad, YearNacimiento, NumeroEstrellas, MiEquipo);
        setHabilidadPateadora(HabilidadPateadora);
        setFuerza(Fuerza);
        setHabilidadRegateadora(HabilidadRegateadora);
    }

    public int getHabilidadPateadora() {
        return HabilidadPateadora;
    }

    public void setHabilidadPateadora(int HabilidadPateadora) {
        if (HabilidadPateadora >= 1 || HabilidadPateadora <= 100) {
            this.HabilidadPateadora = HabilidadPateadora;
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso una habilidad pateadora que no existe");
        }
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        if (Fuerza >= 1 || Fuerza <= 100) {
            this.Fuerza = Fuerza;
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso una poder de fuerza que ni el Bicho tiene");
        }
    }

    public int getHabilidadRegateadora() {
        return HabilidadRegateadora;
    }

    public void setHabilidadRegateadora(int HabilidadRegateadora) {
        if (HabilidadRegateadora >= 1 || HabilidadRegateadora <= 100) {
            this.HabilidadRegateadora = HabilidadRegateadora;
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso una habilidad que ni Messi tiene");
        }

    }

    public boolean Atacar() {
        Random rand = new Random();
        double ProbabilidadAnotar;
        ProbabilidadAnotar = (HabilidadPateadora + Fuerza + HabilidadRegateadora) * 0.65 * (NumeroEstrellas / 10);
        int low = 1;
        int high = 101;
        int result = rand.nextInt(high - low) + low;
        if (result >= 1 && result <= ProbabilidadAnotar) {
            PuntosAnotados += 1;
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " Tipo jugador: Pateador " + "Puntos anotados " + PuntosAnotados;
    }

}
