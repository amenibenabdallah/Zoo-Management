package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public float getSwimmingSpeed(){
        return this.swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed){
        this.swimmingSpeed=swimmingSpeed;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

    public String toString(){
        return super.toString()+" , swimmingSpeed: "+swimmingSpeed;
    }

    public Dolphin(){}
    public Dolphin(String family,String name,int age,boolean isMammal,String habitat,float swimmingSpeed) throws InvalidAgeException{
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
}
