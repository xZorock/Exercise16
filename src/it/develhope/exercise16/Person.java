package it.develhope.exercise16;

public class Person {
    public int age;

    public Person(){

        double randomValue = Math.floor(Math.random()*(80-5+1)+5);
        int age = (int) randomValue;
        System.out.println(age);
        this.age =age;

    }

    public String getLifeStage(){
        if(age <= 12){
            return "Child";
        }else if(age > 13 && age < 19){
            return "Teen";
        }else if(age > 20 && age <59){
            return "Adult";
        }else {
            return "Senior Adult";
        }
    }
}
