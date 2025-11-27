public class Heroe extends Personaje{

    public Heroe(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un Kamehameha ");
        enemigo.setVida(enemigo.getVida() - getPoder());
    }
}
