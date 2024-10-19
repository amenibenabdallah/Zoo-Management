package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animal;
import tn.esprit.gestionZoo.entities.Zoo;
import tn.esprit.gestionZoo.entities.Aquatic;
import tn.esprit.gestionZoo.entities.Terrestrial;
import tn.esprit.gestionZoo.entities.Dolphin;
import tn.esprit.gestionZoo.entities.Penguin;




public class ZooManagement {
    public static void main(String[] args) {

        Animal test=new Animal();
        test.setName("testName");
        test.setFamily("testFamily");
        test.setMammal(false);

        Animal lion=new Animal("mammal","lion1",3,true);
        Zoo myZoo=new Zoo("fun tn.esprit.gestionZoo.entities.Zoo","LA");
        Zoo zoo2=new Zoo("hello zoo","carthage");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion));
        myZoo.addAnimal(test);

        myZoo.displayAnimeaux();

        System.out.println("test search: "+myZoo.searchAnimal(lion));
        System.out.println("test remove: "+myZoo.removeAnimal(lion));
        System.out.println("zoo after remove animal: "+myZoo);
        System.out.println("test isFull zoo: "+myZoo.isZooFull());
        System.out.println("test comapare zoo: "+ Zoo.comparerZoo(myZoo,zoo2));

        // PROSIT 5
        System.out.println("test Affichage prosit 5");
        Aquatic aquaticAnimal = new Aquatic("Fish", "Clownfish", 2, false, "Coral Reef");
        System.out.println(aquaticAnimal);
        Dolphin dolphin = new Dolphin("Cetacea", "Bottlenose Dolphin", 10, true, "Ocean", 25.5f);
        System.out.println(dolphin);
        Penguin penguin = new Penguin("Spheniscidae", "Emperor Penguin", 5, false, "Antarctic", 200f);
        System.out.println(penguin);
        Terrestrial lion2 = new Terrestrial("Felidae", "Lion", 8, true, 4);
        System.out.println(lion2);



    }
}
