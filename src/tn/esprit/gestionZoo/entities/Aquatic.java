package tn.esprit.gestionZoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    private String habitat;

    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj instanceof Aquatic a){
            return this.getName()==a.getName() && this.getAge()==a.getAge() && this.getHabitat()==a.getHabitat();
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString()+" , habitat: "+habitat;
    }

    public Aquatic(){}
    public  Aquatic(String family,String name,int age,boolean isMammal,String habitat) throws InvalidAgeException{
        super(family,name,age, isMammal);
        this.habitat=habitat;
    }
}
