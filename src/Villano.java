public class Villano extends Personaje {
    public Villano(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un Rayo de la Muerte ");
        enemigo.setVida(enemigo.getVida() - getPoder());
    }
}