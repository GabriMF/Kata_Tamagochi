package com.kata;

public class Tamagotchi {
    
   private int mood = 4;
   private int hunger = 4;
   private int energy = 4;
   private boolean isSleeping = false;
   private boolean isPlaying = false;
   private boolean isEating = false;

    //====================================================\\

    public Tamagotchi(){}

    //====================================================\\
    public void sleep(){
        if(isSleeping = true){
            energy += 2;
        }
    }

    public void mood(){
        if(isPlaying = true){
            energy -=1;
            hunger += 1;
            mood += 1;
        }
    }

    public void hunger(){
        if(isEating = true){
            hunger -= 2;
            energy += 1;
        }
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
        return errorMsg;
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
        return errorMsg;
    }

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

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isEating() {
        return isEating;
    }

    public void setEating(boolean isEating) {
        this.isEating = isEating;
    }

    
}
