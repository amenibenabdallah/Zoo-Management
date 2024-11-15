package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;


public class ZooManagement {
    public static void main(String[] args) {




        Zoo myZoo=new Zoo("fun tn.esprit.gestionZoo.entities.Zoo","LA");
        Zoo zoo2=new Zoo("hello zoo","carthage");
        myZoo.displayZoo();
        System.out.println(myZoo);





        myZoo.displayAnimeaux();


        System.out.println("zoo after remove animal: "+myZoo);
        System.out.println("test isFull zoo: "+myZoo.isZooFull());
        System.out.println("test comapare zoo: "+ Zoo.comparerZoo(myZoo,zoo2));

        // PROSIT 5
        System.out.println("test Affichage prosit 5");
        try{
            Dolphin dolphin = new Dolphin("Cetacea", "Bottlenose Dolphin", 10, true, "Ocean", 25.5f);
            System.out.println(dolphin);
            Penguin penguin = new Penguin("Spheniscidae", "Emperor Penguin", 5, false, "Antarctic", 200f);
            System.out.println(penguin);
            Terrestrial lion2 = new Terrestrial("Felidae", "Lion", 8, true, 4);
            System.out.println(lion2);

            dolphin.swim();
            penguin.swim();

            //prosit 6

            myZoo.addAquaticAnimal(dolphin);
            myZoo.addAquaticAnimal(penguin);
            System.out.println(myZoo.maxPenguinSwimmingDepth());
            myZoo.displayNumberOfAquaticsByType();
            System.out.println(penguin.equals(dolphin));
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }







        //prosit 7
        try{
            Animal animal1 = new Animal("mammal","Lion", 5,true);
            myZoo.addAnimal(animal1);
            Animal animal2 = new Animal("mammal","Tiger", 3,true);
            myZoo.addAnimal(animal2);
            Animal animal3 = new Animal("mammal","Elephant", 10,true);
            myZoo.addAnimal(animal3);
            Animal animal4 = new Animal("mammal","Giraffe", 7,true);
            myZoo.addAnimal(animal4);
            Animal animalWithInvalidAge = new Animal("mammal", "Zebra", -20, true);
            System.out.println(animalWithInvalidAge);

        }
        catch (ZooFullException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidAgeException e){
            System.out.println("Invalid age error: " +e.getMessage());
        }

        // prosit 8
        try {
            Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctic", 25.0f);
            System.out.println("\nTesting penguin methods:");
            penguin.eatMeat(Food.MEAT);
            penguin.eatMeat(Food.PLANT);
            penguin.eatMeat(Food.BOTH);
            Terrestrial terrestrial = new Terrestrial("Mammalia", "Elephant", 8, true, 4);
            System.out.println("\nTesting Terrestrial methods:");
            terrestrial.eatPlantAndMeet(Food.BOTH);
            terrestrial.eatPlantAndMeet(Food.PLANT);

        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }





    }
}
