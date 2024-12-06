package Projects.Game.FactoryUtility;

import Projects.Game.ActionUtility.Action;
import Projects.Game.ActionUtility.Attack;
import Projects.Game.ActionUtility.Defend;
import Projects.Game.ActionUtility.Heal;

public class FactoryAction {
    public static Action createActionObject(String actionType) {
        switch (actionType) {
            case "attack":
                return new Attack();
            case "heal":
                return new Heal();
            case "defend":
                return new Defend();
            default:
                break;
        }
        return null;
    }
}
