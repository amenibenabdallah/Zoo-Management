package tn.esprit.gestionZoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name,city;
    private final int nbcages=25;
    private int countAnimal=0;

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
   public boolean addAnimal(Animal animal){
        if(isZooFull()==false){
            if(searchAnimal(animal)==-1){
                animals[countAnimal]=animal;
                countAnimal++;
                return true;
        }
        }
    return false;
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

    Zoo(){}
    public Zoo(String name,String city){
        this.animals=new Animal[nbcages];
        this.name=name;
        this.city=city;

    }

}
