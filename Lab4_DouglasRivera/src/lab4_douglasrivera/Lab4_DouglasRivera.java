/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_douglasrivera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author famii
 */
public class Lab4_DouglasRivera {

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList <Equipos> Equipos = new ArrayList();
        Equipos P1;
        Equipos P2;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Equipos\n"
                    + "2. Jugadores\n"
                    + "3. Simular\n"
                    + "4. Salir"));
            switch (opcion) {
                case 1: {
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Modificar\n 3.Eliminar\n 4. Listar"));
                    switch (op) {
                        case 1: 
                            String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                            String Estadio = JOptionPane.showInputDialog("Ingrese el Estadio");
                            String Pais = JOptionPane.showInputDialog("Ingrese el Pais");
                            String Entrenador = JOptionPane.showInputDialog("Ingrese nombre del Entrenador");
                            String Dueño = JOptionPane.showInputDialog("Ingrese nombre del Dueño");
                            String Mascota = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
                            int YearCreacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de creacion"));
                            String Color = JOptionPane.showInputDialog("Ingrese el color");
                            Equipos.add(new Equipos(nombre, Estadio, Pais, Entrenador, Dueño, Mascota, YearCreacion, Color));
                            break;
                        case 2:
                            String listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            int posicionEquipo = Integer.parseInt(JOptionPane.showInputDialog(Equipos+"Ingrese la posición del equipo a editar"));
                            String nombre1 = JOptionPane.showInputDialog("Ingrese el Nombre");
                            String Estadio1 = JOptionPane.showInputDialog("Ingrese el Estadio");
                            String Pais1 = JOptionPane.showInputDialog("Ingrese el Pais");
                            String Entrenador1 = JOptionPane.showInputDialog("Ingrese nombre del Entrenador");
                            String Dueño1 = JOptionPane.showInputDialog("Ingrese nombre del Dueño");
                            String Mascota1 = JOptionPane.showInputDialog("Ingrese nombre de la mascota");
                            int YearCreacion1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de creacion"));
                            String Color1 = JOptionPane.showInputDialog("Ingrese el color");
                            Equipos Equipo = Equipos.get(posicionEquipo);
                            Equipo.setColor(Color1);
                            Equipo.setDueño(Dueño1);
                            Equipo.setEntrenador(Entrenador1);
                            Equipo.setEstadio(Estadio1);
                            Equipo.setMascota(Mascota1);
                            Equipo.setNombre(nombre1);
                            Equipo.setPais(Pais1);
                            Equipo.setYearCreacion(YearCreacion1);
                            
                            break;
                        case 3:
                            listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            posicionEquipo = Integer.parseInt(JOptionPane.showInputDialog(Equipos+"Ingrese la posición del equipo a editar"));
                            Equipos.remove(posicionEquipo);
                            break;
                        case 4:
                            for (Equipos equipo : Equipos) {
                                System.out.println(equipo.toString()+"\n");
                            }
                            break;
                    }
                }
                break;
                case 2:{
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?\n 1. Crear\n 2. Modificar\n 3.Eliminar\n 4. Listar"));
                    switch (op) {
                        case 1:
                            String listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            int posicionEquipos = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese que la posición del equipo"));
                            if(Equipos.get(posicionEquipos).getJugadores().size() >= 5){
                                JOptionPane.showMessageDialog(null, "Ya ingreso el maximo de jugadores");
                                break;
                            }
                            String listaJugadores = "Ingresa el tipo de jugador (1: Pateador, 2: Tirador)\n";
                            int tipoJugador = Integer.parseInt(JOptionPane.showInputDialog(listaJugadores));
                            if(tipoJugador==1){
                               int NumeroPateadores = 0;
                                for (Jugadores jugador : Equipos.get(posicionEquipos).getJugadores()) {
                                    if(jugador instanceof Pateadores){
                                        NumeroPateadores++;
                                    }
                                }
                                if(NumeroPateadores>=3){
                                     JOptionPane.showMessageDialog(null, "Ya ingreso el maximo de pateadores");
                                    break;
                                }
                                String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                                String apodo = JOptionPane.showInputDialog("Ingrese el Apodo");
                                int NumeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la camisa"));
                                String EquipoFut = JOptionPane.showInputDialog("Ingrese el equipo de Futbol");
                                String EquipoBasket = JOptionPane.showInputDialog("Ingrese nombre del equipo de basket");
                                String JugadorFav = JOptionPane.showInputDialog("Ingrese nombre del jugador favorito");
                                boolean MayorEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Mayor de edad, 0: Menor de edad")) >= 1 ? true : false;
                                int YearNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
                                int NumeroEstrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas"));
                                int HabilidadPateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad pateadora del 1 al 100"));
                                int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza del 1 al 100"));
                                int HabilidadRegateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad regateadora del 1 al 100"));
                                Equipos.get(posicionEquipos).getJugadores().add(new Pateadores(nombre, apodo, NumeroCamisa, EquipoFut, EquipoBasket, JugadorFav, MayorEdad, YearNacimiento, NumeroEstrellas,Equipos.get(posicionEquipos), HabilidadPateadora, Fuerza, HabilidadRegateadora));
                            } else if(tipoJugador==2){
                                int NumeroTiradores = 0;
                                for (Jugadores jugador : Equipos.get(posicionEquipos).getJugadores()) {
                                    if(jugador instanceof Tiradores){
                                        NumeroTiradores++;
                                    }
                                }
                                if(NumeroTiradores>=2){
                                     JOptionPane.showMessageDialog(null, "Ya ingreso el maximo de pateadores");
                                    break;
                                }
                                String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                                String apodo = JOptionPane.showInputDialog("Ingrese el Apodo");
                                int NumeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la camisa"));
                                String EquipoFut = JOptionPane.showInputDialog("Ingrese el equipo de Futbol");
                                String EquipoBasket = JOptionPane.showInputDialog("Ingrese nombre del equipo de basket");
                                String JugadorFav = JOptionPane.showInputDialog("Ingrese nombre del jugador favorito");
                                boolean MayorEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Mayor de edad, 0: Menor de edad")) >= 1 ? true : false;
                                int YearNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
                                int NumeroEstrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas"));
                                int HabilidadPateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad pateadora del 1 al 100"));
                                int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza del 1 al 100"));
                                int HabilidadRegateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad regateadora del 1 al 100"));
                                int TiroTres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tiro triple del 1 al 100"));
                                int TiroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tiro doble del 1 al 100"));
                                int ManejoBalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el manejo del 1 al 100"));
                                Equipos.get(posicionEquipos).getJugadores().add(new Tiradores(nombre, apodo, NumeroCamisa, EquipoFut, EquipoBasket, JugadorFav, MayorEdad, YearNacimiento, NumeroEstrellas, Equipos.get(posicionEquipos), TiroTres, TiroDos, ManejoBalon));
                            } else {
                                JOptionPane.showMessageDialog(null, "Tipo de jugador incorrecto.");
                            }
                            break;
                        case 2:
                            listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            posicionEquipos = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese que la posición de la corperación a la cual le desea añadir una marca"));
                            listaJugadores = "Ingresa el indice de una de los siguientes jugadores\n";
                            for (int i = 0; i < Equipos.get(posicionEquipos).getJugadores().size(); i++) {
                                listaJugadores+=i+". "+Equipos.get(posicionEquipos).getJugadores().get(i).getNombre()+"\n";
                            }
                            int posicionJugadores = Integer.parseInt(JOptionPane.showInputDialog(listaJugadores));
                            Jugadores jugador = Equipos.get(posicionEquipos).getJugadores().get(posicionJugadores);
                            if(jugador instanceof Pateadores){
                                String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                                String apodo = JOptionPane.showInputDialog("Ingrese el Apodo");
                                int NumeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la camisa"));
                                String EquipoFut = JOptionPane.showInputDialog("Ingrese el equipo de Futbol");
                                String EquipoBasket = JOptionPane.showInputDialog("Ingrese nombre del equipo de basket");
                                String JugadorFav = JOptionPane.showInputDialog("Ingrese nombre del jugador favorito");
                                boolean MayorEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Mayor de edad, 0: Menor de edad")) >= 1 ? true : false;
                                int YearNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
                                int NumeroEstrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas"));
                                int HabilidadPateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad pateadora del 1 al 100"));
                                int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza del 1 al 100"));
                                int HabilidadRegateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad regateadora del 1 al 100"));
                                Pateadores pateador = (Pateadores)jugador;
                                pateador.setApodo(apodo);
                                pateador.setEquipoBasket(EquipoBasket);
                                pateador.setEquipoFutbol(EquipoFut);
                                pateador.setFuerza(Fuerza);
                                pateador.setHabilidadPateadora(HabilidadPateadora);
                                pateador.setHabilidadRegateadora(HabilidadRegateadora);
                                pateador.setJugadorFavorito(JugadorFav);
                                pateador.setMayorEdad(MayorEdad);
                                pateador.setNombre(nombre);
                                pateador.setNumero(NumeroCamisa);
                                pateador.setNumeroEstrellas(NumeroEstrellas);
                                
                
                            } else if(jugador instanceof Tiradores){
                                String nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                                String apodo = JOptionPane.showInputDialog("Ingrese el Apodo");
                                int NumeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la camisa"));
                                String EquipoFut = JOptionPane.showInputDialog("Ingrese el equipo de Futbol");
                                String EquipoBasket = JOptionPane.showInputDialog("Ingrese nombre del equipo de basket");
                                String JugadorFav = JOptionPane.showInputDialog("Ingrese nombre del jugador favorito");
                                boolean MayorEdad = Integer.parseInt(JOptionPane.showInputDialog(null, "1: Mayor de edad, 0: Menor de edad")) >= 1 ? true : false;
                                int YearNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
                                int NumeroEstrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas"));
                                int HabilidadPateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad pateadora del 1 al 100"));
                                int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza del 1 al 100"));
                                int HabilidadRegateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad regateadora del 1 al 100"));
                                int TiroTres = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tiro triple del 1 al 100"));
                                int TiroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Tiro doble del 1 al 100"));
                                int ManejoBalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el manejo del 1 al 100"));
                                Tiradores tirador = (Tiradores)jugador;
                                tirador.setApodo(apodo);
                                tirador.setEquipoBasket(EquipoBasket);
                                tirador.setJugadorFavorito(JugadorFav);
                                tirador.setManejoBalon(ManejoBalon);
                                tirador.setMayorEdad(MayorEdad);
                                tirador.setNombre(nombre);
                                tirador.setNumero(NumeroCamisa);
                                tirador.setNumeroEstrellas(NumeroEstrellas);
                                tirador.setTiroDeDos(TiroDos);
                                tirador.setTiroTres(TiroTres);
                                tirador.setYearNacimiento(YearNacimiento);
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Tipo de jugador incorrecto.");
                            }
                            break;
                        case 3:
                            listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            posicionEquipos = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese que la posición del equipo desea eliminar "));
                            listaJugadores = "Ingresa el indice d una de los siguientes jugadores\n";
                            for (int i = 0; i < Equipos.get(posicionEquipos).getJugadores().size(); i++) {
                                listaJugadores+=i+". "+Equipos.get(posicionEquipos).getJugadores().get(i).getNombre()+"\n";
                            }
                            posicionJugadores = Integer.parseInt(JOptionPane.showInputDialog(listaJugadores));
                            Equipos.get(posicionEquipos).getJugadores().remove(posicionJugadores);
                            break;
                        case 4:
                              listaEquipos = "Ingresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            posicionEquipos = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese que la posición del equipo a mostrar los jugadores"));
                            for (Jugadores Jugador : Equipos.get(posicionEquipos).getJugadores()) {
                                System.out.println(Jugador.toString()+"\n");
                            }
                            break;
                    }
                    
                }
              break;
                case 3:{
                    boolean juegoTerminado = false;
                    int puntosEquipoUno = 0;
                    int puntosEquipoDos = 0;
                    int movimientosEquipo1 = 5;
                    int movimientosEquipo2 = 5;
                     String listaEquipos = "Jugador uno selecciona tu equipo: \nIngresa el indice de una de los siguientes equipos\n";
                            for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre()+"\n";
                            }
                            int posicionEquipos = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese la posición del equipo a usar"));
                            P1 = Equipos.get(posicionEquipos);
                             listaEquipos = "Jugador dos selecciona tu equipo: \nIngresa el indice de una de los siguientes equipos\n";
                             for (int i = 0; i < Equipos.size(); i++) {
                                listaEquipos+=i+". "+Equipos.get(i).getNombre() +"\n";
                            }
                            int posicionEquipos2 = Integer.parseInt(JOptionPane.showInputDialog(listaEquipos+"Ingrese la posición del equipo a usar"));
                            P2 = Equipos.get(posicionEquipos2);
                            System.out.println("Lanzando moneda..");
                     Random rand = new Random();
                    int low = 1;
                    int high = 101;
                    int result = rand.nextInt(high - low) + low;
                    if(result>=50){
                        P1.TieneTurno = true;
                        P1.getJugadores().get(0).TieneElBalon = true;
                        System.out.println("Jugador uno tiene el turno");
                    } else {
                        P2.TieneTurno = true;
                        P2.getJugadores().get(0).TieneElBalon = true;
                         System.out.println("Jugador dos tiene el turno");
                    }
                    while(!juegoTerminado){
                         System.out.println("Jugador uno tiene el turno");
                        while(movimientosEquipo1>0){
                           
                            String accionJugador = "Jugador uno selecciona que quieres hacer:\n 1: dar pase, 2: tirar";
                            int accion = Integer.parseInt(JOptionPane.showInputDialog(accionJugador));
                            if(accion==1){
                                 String listaJugadores = "Ingresa el indice de una de los siguientes jugadores\n";
                            for (int i = 0; i <P1.getJugadores().size(); i++) {
                                if(!P1.getJugadores().get(i).TieneElBalon){
                                    String tipoJugador = P1.getJugadores().get(i) instanceof Pateadores ? "Pateador" : "Tirador";
                                    listaJugadores+=i+". "+Equipos.get(posicionEquipos).getJugadores().get(i).getNombre()+ "Tipo jugador " + tipoJugador + "\n";
                                }
                            }
                            int posicionJugadores = Integer.parseInt(JOptionPane.showInputDialog(listaJugadores));
                                for (int i = 0; i < P1.getJugadores().size(); i++) {
                                    if(P1.getJugadores().get(i).TieneElBalon){
                                        P1.getJugadores().get(i).pasarBalon(posicionJugadores);
                                    }
                                }
                            } else {
                                boolean anotacion = false;
                                 for (int i = 0; i < P1.getJugadores().size(); i++) {
                                    if(P1.getJugadores().get(i).TieneElBalon){
                                        if(P1.getJugadores().get(i) instanceof Pateadores){
                                            anotacion = ((Pateadores)P1.getJugadores().get(i)).Atacar();
                                             if(anotacion){
                                                puntosEquipoUno++;
                                            }
                                        } else if(P1.getJugadores().get(i) instanceof Tiradores){
                                             accionJugador = "Jugador uno selecciona que quieres hacer:\n 1: tirar de 3, 2: tirar de 2";
                                             accion = Integer.parseInt(JOptionPane.showInputDialog(accionJugador));
                                             if(accion==1){
                                                 anotacion = ((Tiradores)P1.getJugadores().get(i)).AtacarTiroTres();
                                                  if(anotacion){
                                                        puntosEquipoUno+=3;
                                                    }
                                             } else if(accion==2){
                                                 anotacion = ((Tiradores)P1.getJugadores().get(i)).AtacarTiroDos();
                                                  if(anotacion){
                                                        puntosEquipoUno+=2;
                                                    }
                                             }
                                        }
                                       
                                    }
                                }
                                movimientosEquipo1 = 0;
                            }
                            
                            movimientosEquipo1--;
                        }
                         System.out.println("Jugador dos tiene el turno");
                         while(movimientosEquipo2>0){
                           
                            String accionJugador = "Jugador uno selecciona que quieres hacer:\n 1: dar pase, 2: tirar";
                            int accion = Integer.parseInt(JOptionPane.showInputDialog(accionJugador));
                            if(accion==1){
                                 String listaJugadores = "Ingresa el indice de uno de los siguientes jugadores\n";
                            for (int i = 0; i <P2.getJugadores().size(); i++) {
                                if(!P1.getJugadores().get(i).TieneElBalon){
                                    String tipoJugador = P1.getJugadores().get(i) instanceof Pateadores ? "Pateador" : "Tirador";
                                    listaJugadores+=i+". "+Equipos.get(posicionEquipos).getJugadores().get(i).getNombre()+"\n";
                                }
                            }
                            int posicionJugadores = Integer.parseInt(JOptionPane.showInputDialog(listaJugadores));
                                for (int i = 0; i < P2.getJugadores().size(); i++) {
                                    if(P2.getJugadores().get(i).TieneElBalon){
                                        P2.getJugadores().get(i).pasarBalon(posicionJugadores);
                                    }
                                }
                            } else {
                                boolean anotacion = false;
                                 for (int i = 0; i < P2.getJugadores().size(); i++) {
                                    if(P2.getJugadores().get(i).TieneElBalon){
                                        if(P2.getJugadores().get(i) instanceof Pateadores){
                                            anotacion = ((Pateadores)P2.getJugadores().get(i)).Atacar();
                                             if(anotacion){
                                                puntosEquipoDos++;
                                            }
                                        } else if(P2.getJugadores().get(i) instanceof Tiradores){
                                             accionJugador = "Jugador uno selecciona que quieres hacer:\n 1: tirar de 3, 2: tirar de 2";
                                             accion = Integer.parseInt(JOptionPane.showInputDialog(accionJugador));
                                             if(accion==1){
                                                 anotacion = ((Tiradores)P2.getJugadores().get(i)).AtacarTiroTres();
                                                  if(anotacion){
                                                        puntosEquipoDos+=3;
                                                    }
                                             } else if(accion==2){
                                                 anotacion = ((Tiradores)P2.getJugadores().get(i)).AtacarTiroDos();
                                                  if(anotacion){
                                                        puntosEquipoDos+=2;
                                                    }
                                             }
                                        }
                                       
                                    }
                                }
                                movimientosEquipo2 = 0;
                            }
                            
                            movimientosEquipo2--;
                        }
                        
                        if(puntosEquipoUno>= 11 || puntosEquipoDos>=11){
                            juegoTerminado = true;
                        }
                        movimientosEquipo1 = 5;
                        movimientosEquipo2 = 5;
                    }
                    // mostrar los puntajes y otros datos
                    if(puntosEquipoUno>=11){
                        System.out.println("El equipo uno gano");
                    }
                    
                    P1.getJugadores().sort(new PointsSort());
                   
                     if(puntosEquipoDos>=11){
                        System.out.println("El equipo dos gano");
                    }
                     
                     System.out.println("El equipo uno logro "+puntosEquipoUno+" puntos");
                      for (int i = 0; i < P1.getJugadores().size(); i++) {
                         if(P2.getJugadores().get(i) instanceof Pateadores){
                               ((Pateadores)P1.getJugadores().get(i)).toString();
                          } else {
                               ((Tiradores)P1.getJugadores().get(i)).toString();
                          }
                    }
                   
                    System.out.println("El equipo dos logro "+puntosEquipoDos+" puntos");
                      P2.getJugadores().sort(new PointsSort());
                      for (int i = 0; i < P2.getJugadores().size(); i++) {
                          if(P2.getJugadores().get(i) instanceof Pateadores){
                               ((Pateadores)P2.getJugadores().get(i)).toString();
                          } else {
                               ((Tiradores)P2.getJugadores().get(i)).toString();
                          }
                       
                    }
                   
                }
                break;
                case 4:{
                    System.out.println("Saliendo......");
                    break;
                }
            }
        }
    }
    
    public static class PointsSort implements Comparator<Jugadores> 
{
    @Override
    public int compare(Jugadores o1, Jugadores o2) {
        return o2.getPuntosAnotados()>o1.getPuntosAnotados() ? o2.PuntosAnotados : o1.PuntosAnotados ;
    }
}
}
