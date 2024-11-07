package tn.esprit.gestionZoo.entities;

public class Animal {
    private String family,name;
    private int age;
    private boolean isMammal;

    public String getFamily(){
        return this.family;
    }
    public void setFamily(String family){
        this.family=family;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("name can not be empty");
        }
        else{
        this.name=name;}
    }


    public int getAge(){
        return this.age;
    }
    public void setAge(int age) throws InvalidAgeException{
        if(age < 0){
            System.out.println("InvalidAgeException should be thrown here");
            throw new InvalidAgeException("age must be greater or equal to 0");
        }
        this.age=age;
    }

    public boolean isMammal(){
        return this.isMammal;
    }
    public void setMammal(boolean isMammal){
        this.isMammal=isMammal;
    }

    public String toString(){
        return "family: "+family+", name: "+name+", isMammal: "+isMammal;
    }
    public Animal(){}
    public Animal(String family,String name,int age,boolean isMammal) throws InvalidAgeException{
        this.family=family;
        this.name=name;
        this.setAge(age);
        this.isMammal=isMammal;
    }
}
