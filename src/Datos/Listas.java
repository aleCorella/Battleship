package Datos;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static List<Constructores> list = new ArrayList<Constructores>();
    public static List<DatosBarcos> listaPosicion = new ArrayList<DatosBarcos>();
    public static List<DatosBarcos> listaPosJ2 = new ArrayList<DatosBarcos>();
    public static List<contador> ContadorJ1 = new ArrayList<contador>();
    public static List<contador> ContadorJ2 = new ArrayList<contador>();
    public static List<contador> ContBarcosJ1 = new ArrayList<contador>();
    public static List<contador> ContBarcosJ2 = new ArrayList<contador>();

    public static void agregarlista(String nombreJugador, int cedulaJugador) {
        list.add(new Constructores(nombreJugador, cedulaJugador));

    }

    public static void AgreBarJ1(int contador) {
        ContBarcosJ1.add(new contador(contador));
    }

    public static void AgreBarJ2(int contador) {
        ContBarcosJ2.add(new contador(contador));

    }

    public static void SumaCont(int contador) {
        ContadorJ1.add(new contador(contador));

    }

    public static void SumaCont2(int contador) {
        ContadorJ2.add(new contador(contador));

    }

    public static void añadirPosicion(int col, int fil, int tamañoC) {
        listaPosicion.add(new DatosBarcos(col, fil, tamañoC));
    }

    public static void añadirPosJ2(int col, int fil, int tamañoC) {
        listaPosJ2.add(new DatosBarcos(col, fil, tamañoC));
    }

    public static String ObtenerNom1() {
        String NombreJ = list.get(1).getNombreJugador();
        return NombreJ;
    }

    public static String ObtenerNom2() {
        String NombreJ = list.get(0).getNombreJugador();
        return NombreJ;
    }
}
