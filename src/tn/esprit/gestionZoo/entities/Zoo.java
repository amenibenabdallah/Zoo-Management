package tn.esprit.gestionZoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name,city;
    private final int nbcages=3;
    private int countAnimal=0;

    public Aquatic[] aquaticAnimals;

    public void displayZoo(){
        System.out.println("name: "+name+", "+" city: "+city+", "+" number of cages: "+nbcages);
    }
    public void displayAnimeaux(){
        String str="";
        for(int i=0;i<countAnimal;i++){
            str=str+animals[i].getName()+", ";
        }
        System.out.println("les animaux dans cette zoo sont : "+str);
    }

    public String toString(){
        if (countAnimal == 0) {
            return "name: " + name + ", city: " + city + ", number of cages: " + nbcages + ", there are no animals in this zoo.";
        }
        String str="";
        for(int i=0;i<countAnimal;i++){
                str=str+animals[i]+", ";
        }
        return "name: "+name+", city:"+city+", number of cages: "+nbcages+", Animals of this zoo are: "+str;
    };

    public int searchAnimal(Animal animal){
        for(int i=0;i<countAnimal;i++){
            if(animals[i].getName()==animal.getName()){
                return i;
            }
        }
        return -1;

    }
   public void addAnimal(Animal animal) throws ZooFullException{
        if(isZooFull()){
            throw new ZooFullException("zoo is full !!");
        }
                if(searchAnimal(animal)==-1){
                    animals[countAnimal]=animal;
                    countAnimal++;

                }
    }

    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index==-1){
            return false;
        }
        for(int i=0;i<countAnimal;i++){
            animals[index]=animals[index+1];
            countAnimal=countAnimal-1;
        }
        return true;
    }
    public boolean isZooFull(){
        if(countAnimal==nbcages){
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo (Zoo z1, Zoo z2){
        if(z1.countAnimal>z2.countAnimal){
            return z1;
        }
        return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        for(int i=0;i<10;i++){
            if(aquaticAnimals[i]==null){
                aquaticAnimals[i]=aquatic;
                break;
            }
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if(aquaticAnimals[i] instanceof Penguin P){
                if (P.swimmingDepth > maxDepth) {
                    maxDepth = P.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrPeguin=0;
        int nbrDophain=0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nbrPeguin=nbrPeguin+1;
            }
            if(aquaticAnimals[i] instanceof Dolphin){
                nbrDophain=nbrDophain+1;
            }
        }
        System.out.println("the number of Dophain is : "+nbrDophain+"  the number of penguin is : "+nbrPeguin);
    }

    Zoo(){}
    public Zoo(String name,String city){
        this.animals=new Animal[nbcages];
        this.name=name;
        this.city=city;
        aquaticAnimals=new Aquatic[10];

    }

}
