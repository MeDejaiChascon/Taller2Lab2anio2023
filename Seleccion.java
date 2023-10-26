public class Seleccion {
    private int id;
    private String nombre;
    private int rankingFIFA;
    private String bandera;


    public Seleccion(int id, String nombre, int rankingFIFA, String bandera) {
        this.id = id;
        this.nombre = nombre;
        this.rankingFIFA = rankingFIFA;
        this.bandera = bandera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRankingFIFA() {
        return rankingFIFA;
    }

    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
}

