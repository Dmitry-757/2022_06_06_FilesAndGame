package org.dng;

/**
 * ножницы режут бумагу,
 * камень ломает ножницы,
 * бумага накрывает  камень
 */
public class Game {

    public static void play(){

        VariantsOfChoice playerChoice = Player.getChoice(ChoiceGetter::choiceOfPlayer);
        VariantsOfChoice computerChoice = Player.getChoice(ChoiceGetter::choiceOfComputer);

        //Referee.getGameResult(playerChoice, computerChoice);
        ReadWrite.writeToDisk("player choice = "
                + playerChoice.name()
                + "; computer choice = "
                +computerChoice.name()
                + "; result of game = "
                + Referee.getGameResult(playerChoice, computerChoice).name()
        );

    }
}
