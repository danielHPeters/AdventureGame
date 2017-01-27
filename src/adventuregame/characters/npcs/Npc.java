package adventuregame.characters.npcs;

import adventuregame.characters.GameCharacter;
import adventuregame.characters.professions.Profession;
import adventuregame.items.Item;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Npc extends GameCharacter {

    /**
     *
     */
    private Profession profession;

    /**
     * Default constructor. Creates a new NPC character.
     *
     * @param name Name of the character
     * @param gender Gender of the character
     * @param inventory initial inventory list of the character
     * @param profession the profession of the character;
     */
    public Npc(String name, String gender, List<Item> inventory, Profession profession) {

        this.name = name;
        this.gender = gender;
        this.inventory = inventory;
        this.profession = profession;

    }
    
    /**
     * Do something according to profesion when idle.
     */
    public void idleAction(){
        this.profession.doWork();
    }

}
