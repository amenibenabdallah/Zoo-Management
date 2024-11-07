package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal {
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

}
