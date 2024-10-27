package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic {
    float swimmingDepth;

    public float getSwimmingDepth(){
        return this.swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }

    public void swim(){
        System.out.println("This peguin is swimming.");
    }
    public String toString(){
        return super.toString()+" , swimmingDepth: "+swimmingDepth;
    }
    public Penguin(){}

    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
}
