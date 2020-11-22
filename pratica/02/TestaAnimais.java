import java.util.ArrayList;
import java.util.List;

public class TestaAnimais {
    public static void main(String[] args) {
        TestaAnimais testaAnimais = new TestaAnimais();
        List<Animal> animais = new ArrayList<>();

        animais.add(new Sapo());
        animais.add(new Boi());
        animais.add(new Cachorro());

        testaAnimais.executaOperacao(animais, new ExibeSomAnimal());
    }

    public void exibeSonsAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }

    public void executaOperacao(List<Animal> animais, Operacao operacao) {
        for (Animal animal : animais) {
            operacao.executa(animal);
        }
    }

}
