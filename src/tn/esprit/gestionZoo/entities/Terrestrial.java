package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal implements Omnivore <Food> {
    private int nbrLegs;

    public int getNbrLegs(){
        return this.nbrLegs;
    }
    public void setNbrLegs(int nbrLegs){
        this.nbrLegs=nbrLegs;
    }

    public String toString(){
        return super.toString()+" , nbrLegs: "+nbrLegs;
    }

    public Terrestrial(){}
    public Terrestrial(String family,String name,int age,boolean isMammal,int nbrLegs) throws InvalidAgeException{
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal prefers to eat both at the same time.");
        }
    }
    }

