public class Saiyajin extends Heroe{

    public Saiyajin(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un Kamehameha Triple ");
        enemigo.setVida(enemigo.getVida() - getPoder() * 3);
        setVida(getVida() - 15);
    }
}
