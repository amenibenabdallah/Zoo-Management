package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public String toString(){
        return super.toString()+" , habitat: "+habitat;
    }

    public Aquatic(){}
    public  Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family,name,age, isMammal);
        this.habitat=habitat;
    }
}
