public class ExibeSomAnimal implements Operacao {
    @Override
    public void executa(Object object) {
        Animal animal = (Animal) object;
        System.out.println(animal.som());
    }
}
