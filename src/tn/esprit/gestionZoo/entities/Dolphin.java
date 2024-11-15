package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic implements Carnivore <Food>{
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

    @Override
    public void eatMeat(Food meat) {
           switch (meat){
               case MEAT :
                   System.out.println("This Dolphin animal eats meat.");
                   break;
               case PLANT:
                   System.out.println("This aquatic animal does not eat plants.");
                   break;
               case BOTH:
                   System.out.println("This aquatic animal only eats the meat portion.");
                   break;
               default:
                   System.out.println("Unknown food type.");
                   break;
           }

    }
}
