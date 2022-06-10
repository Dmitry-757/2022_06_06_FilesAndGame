package org.dng;


public class Player {
    public static VariantsOfChoice getChoice(ChoicableI choiceMeth) {
        return choiceMeth.getChoice();
    }
}
