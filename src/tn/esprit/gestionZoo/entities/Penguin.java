package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic {
    float swimmingDepth;

    public float getSwimmingDepth(){
        return this.swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth=swimmingDepth;
    }

    public Penguin(){}

    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingSpeed;
    }
}
