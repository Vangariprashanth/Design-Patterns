package Projects.Game.FactoryUtility;

import Projects.Game.CharacterUtility.Healer;
import Projects.Game.CharacterUtility.GameCharacter;
import Projects.Game.CharacterUtility.Mage;
import Projects.Game.CharacterUtility.Warrior;

public class FactoryCharacter {
    public static GameCharacter createCharacter(String character) {
        switch (character) {
            case "warrior":
                return new Warrior();
            case "healer":
                return new Healer();
            case "mage":
                return new Mage();
            default:
                break;

        }
        return null;
    }
}
