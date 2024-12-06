package Projects.Game;

import Projects.Game.CharacterUtility.GameCharacter;
import Projects.Game.FactoryUtility.FactoryCharacter;

public class Main {
    public static void main(String args[]) {
        GameCharacter warrior = FactoryCharacter.createCharacter("warrior");
        warrior.action("attack");
        GameCharacter healer = FactoryCharacter.createCharacter("healer");
        healer.action("defend");
    }
}
