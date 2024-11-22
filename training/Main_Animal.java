import animal.*;

public class Main_Animal {
    public static void main(String[] args) {

        Animal a1 = new Herbivores();
        a1.eat();

        Animal a2 = new Carnivores();
        a2.eat();

        Animal a3 = new Omnivores();
        a3.eat();

    }
}

/*
 * Output :
 * Herbivores eat plants...
 * Carnivores eat meat...
 * Omnivores eat both plants and meat...
 */
