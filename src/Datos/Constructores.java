package Datos;


public class Constructores {
String nombreJugador;
int cedulaJugador;

    public Constructores(String nombreJugador, int cedulaJugador) {
        this.nombreJugador = nombreJugador;
        this.cedulaJugador = cedulaJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCedulaJugador() {
        return cedulaJugador;
    }

    public void setCedulaJugador(int cedulaJugador) {
        this.cedulaJugador = cedulaJugador;
    }
}
