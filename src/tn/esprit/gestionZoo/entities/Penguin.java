package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic implements Carnivore <Food> {
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

    public Penguin(String family,String name,int age,boolean isMammal,String habitat,float swimmingDepth) throws InvalidAgeException{
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
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
