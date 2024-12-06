package Projects.Game.CharacterUtility;

import Projects.Game.ActionUtility.Action;
import Projects.Game.FactoryUtility.FactoryAction;

public abstract class GameCharacter {
    String name;

    public void action(String actionType) {
        Action action = FactoryAction.createActionObject(actionType);
        action.performAction();

    }
}
