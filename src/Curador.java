public class Curador extends Personaje {


    public Curador(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    public void atacar(Personaje aliado) {
        aliado.setVida(aliado.getVida()
                + getPoder());
    }
}
