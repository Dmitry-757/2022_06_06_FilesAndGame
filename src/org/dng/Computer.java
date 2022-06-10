package org.dng;public class Computer {
    public static VariantsOfChoice getChoice(ChoicableI choiceMeth) {
        return choiceMeth.getChoice();
    }
}
