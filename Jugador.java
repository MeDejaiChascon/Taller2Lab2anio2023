public class Jugador {
    private int numero;
    private String nombre;
    private Posicion posicion;
    private Seleccion seleccion;
    
    public Jugador(int numero, String nombre, Posicion posicion, Seleccion seleccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.seleccion = seleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
}
