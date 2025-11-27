public class Main {

    public static void main(String[] args) {
        Heroe gohan = new Heroe("Gohan", 100,80 );
        Villano cell = new Villano("Cell", 300,90);
        Curador dende = new Curador("Dende", 100,20);
        Saiyajin goku = new Saiyajin("Goku", 200,40);

        Personaje [] personajes = {gohan, cell, dende, goku};

        for (int i = 0; i < personajes.length-1; i++) {
            Personaje atacante = personajes[i];
            Personaje enemigo = personajes[i+1];

            atacante.atacar(enemigo);
            System.out.println(enemigo.mostrarInformacion());

        }
        System.out.println(" Fin de la batalla ! ");





    }
}