public class Personaje {
    private String nombre;
    private int vida;
    private int poder;

    public Personaje(String nombre, int vida, int poder) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con un golpe básico ");
        enemigo.vida -= poder;
        if (enemigo.vida < 0) enemigo.vida = 0;
    }

    public String mostrarInformacion(){
        String informacion= (nombre + " tiene " + vida + " puntos de vida "
                             + " Su valor de poder es: " + poder);
        return informacion;
    }
}
