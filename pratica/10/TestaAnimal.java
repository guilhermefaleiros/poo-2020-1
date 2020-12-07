public class TestaAnimal {

    public static void main(String[] args) {
        Animal gato = new Animal("gato");
        Animal vaca = new Animal("vaca");
        Animal pato = new Animal("pato");
        Animal sapo = new Animal("sapo");
        Animal rato = new Animal("rato");
        Animal galo = new Animal("galo");
        Animal cachorro = new Animal("cachorro");
        Animal leao = new Animal("leao");

        System.out.println(gato);

        gato.adicionaAmigo(vaca);
        gato.adicionaAmigo(pato);
        gato.adicionaAmigo(sapo);
        gato.adicionaAmigo(rato);
        gato.adicionaAmigo(galo);

        cachorro.adicionaAmigo(leao);

        System.out.println("Amigos de gato: " + gato.amigosAnimal());

        System.out.println("Amigos do cachorro: " + cachorro.amigosAnimal());

        System.out.println("Amigos de rato: " + rato.amigosAnimal());

        rato.removeAmigo(gato);

        System.out.println("Amigos de gato: " + gato.amigosAnimal());
        System.out.println("Amgos de rato: " + rato.amigosAnimal());
    }
}