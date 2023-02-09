package com.kata;

public class Tamagotchi {
    
   private int mood = 4;
   private int hunger = 4;
   private int energy = 4;

    //====================================================\\

    public Tamagotchi() {}

    //====================================================\\
    public void sleep(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy() <=8){
            tamagotchi.setEnergy(getEnergy()+2);
        }
        else{
            notSleepMsg();
        }
    }
    
    public void play(Tamagotchi tamagotchi){
        if(tamagotchi.getEnergy() > 2 && tamagotchi.getHunger()<8){
            tamagotchi.setEnergy(getEnergy()-1);
            tamagotchi.setHunger(getHunger()+1);
            tamagotchi.setMood(getMood()+1);
        }
        else{
            notPlayMsg();
        }
    }
    
    public void eat(Tamagotchi tamagotchi){
        if(tamagotchi.getHunger()>=2){
            tamagotchi.setHunger(getHunger()-2);
            tamagotchi.setEnergy(getEnergy()+1);
        }
        else{
            notEatMsg();
        }
    }

    public String notSleepMsg(){
        return "Im not sleepy!";
    }

    public String notPlayMsg(){
        if(getEnergy()<=2){
            return "Im too tired!";
        }
        else{
            return "Im too hungry!";
        }
    }

    public String notEatMsg(){
        return "Im not hungry at all!";
    }
    
    //============ Moods ============\\

    public String energyFace(){
        String tired = "(-_-)";
        String sleep = "(-_-) Zzz...";
        String normal = ":-|";
        String errorMsg = "ur Tamagochi should be dead, 'cause we dont find any type of energy over here... :/";

        if(energy < 3){
            return tired;
        }
        if(energy == 0){
            return sleep;
        }
        if(energy >= 3){
            return normal;
        }
        else{
            return errorMsg;
        }
    }

    public String moodFace(){
        String cheerfull = ":-D";
        String happy = ":-)";
        String normal = ":-/";
        String angry = "ఠ_ఠ";
        String errorMsg = "ur Tamagochi should be burnout, 'cause we dont find any mood over here... D:";

        if(mood >= 9){
            return cheerfull;
        }
        if(mood<=8 && mood>=6){
            return happy;
        }
        if(mood<6 && mood>3){
            return normal;
        }
        if(mood<=3){
            return angry;
        }
        else{
            return errorMsg;
        }
    }
    //==================================================\\

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}