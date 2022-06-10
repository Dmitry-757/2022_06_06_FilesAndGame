package org.dng;

public class Referee {
    public static VariantsOfGameResult getGameResult(VariantsOfChoice playerChoice, VariantsOfChoice computerChoice){
        if(computerChoice == playerChoice) {
            return VariantsOfGameResult.TIE;
        } else if (playerChoice == VariantsOfChoice.PAPER && computerChoice == VariantsOfChoice.ROCK
                || playerChoice == VariantsOfChoice.SCISSORS && computerChoice == VariantsOfChoice.PAPER
                || playerChoice == VariantsOfChoice.ROCK && computerChoice == VariantsOfChoice.SCISSORS) {
            return VariantsOfGameResult.PlayerWin;
        } else {
            return VariantsOfGameResult.ComputerWin;
        }
    }
}
