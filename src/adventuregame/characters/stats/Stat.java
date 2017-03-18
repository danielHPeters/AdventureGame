/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.characters.stats;

/**
 * Definition of character stats
 * @author Daniel
 */
public class Stat {
    
    /**
     * Maximum value.
     */
    private double max;
    
    /**
     * Minimum value
     */
    private double min;
    
    /**
     * Current value.
     */
    private double value;
    
    /**
     * Constructor initializes all Stat data
     * @param value
     * @param min
     * @param max 
     */
    public Stat(double value, double min, double max){
        this.value = value;
        this.min = min;
        this.max = max;
    }
    
    /**
     * Temporary stat increase (or heal for health)
     * @param add 
     */
    public void increase(double add){
        this.value = this.value + add < this.max ? this.value + add : this. max;
    }
    
    /**
     * Temporary stat decrease (or damage taken for health)
     * @param sub 
     */
    public void decrease(double sub){
        this.value = this.value - sub > this.min ? this.value +-sub : this. min;
    }
    
    public void increaseMax (double add){
        this.max += add;
    }
    
    public void decreaseMax (double subtract){
        this.max += subtract;
    }
    
    public void increaseMin (double add){
        this.min += add;
    }
    
    public void decreaseMin (double subtract){
        this.min += subtract;
    }
    
}
