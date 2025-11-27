public class Main {

    public static void main(String[] args) {
        Heroe gohan = new Heroe("Gohan", 100,80 );
        Villano cell = new Villano("Cell", 300,90);
        Curador dende = new Curador("Dende", 100,20);
        Saiyajin goku = new Saiyajin("Goku", 200,40);

        System.out.println(" ¡Comienza la batalla ! ");

        gohan.atacar(cell);
        cell.atacar(gohan);
        gohan.atacar(cell);
        dende.atacar(gohan);
        goku.atacar(cell);


        System.out.println(gohan.mostrarInformacion());
        System.out.println(cell.mostrarInformacion());
        System.out.println(dende.mostrarInformacion());
        System.out.println(goku.mostrarInformacion());

    }
}