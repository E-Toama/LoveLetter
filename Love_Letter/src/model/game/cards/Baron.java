package model.game.cards;

public class Baron extends Card {
    int value = 3;
    String description = "Compare Cards";

    @Override
    public int getValue() {
        return value;
    }
}
