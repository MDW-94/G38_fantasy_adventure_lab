package Player.mage;

import Player.Player;

import Player.mage.familiar.Assistant;
import Player.mage.spells.DNA_Ability;

public abstract class GeneticDesigner extends Player {

    Assistant assistant;

    DNA_Ability dnaAbility;

    public GeneticDesigner(String name, int hp, Assistant assistant, DNA_Ability dnaAbility) {
        super(name, hp);
        this.assistant = assistant;
        this.dnaAbility = dnaAbility;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public DNA_Ability getDnaAbility() {
        return dnaAbility;
    }

    public void setDnaAbility(DNA_Ability dnaAbility) {
        this.dnaAbility = dnaAbility;
    }

    public void selectDnaAbility(DNA_Ability dnaAbility){
        this.dnaAbility = dnaAbility;
    }
}
