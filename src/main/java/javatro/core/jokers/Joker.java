package javatro.core.jokers;

import javatro.core.Card;
import javatro.core.Round;
import javatro.core.Score;

/**
 * Represents a Joker card. Each Joker card has a description and a string representation of the
 * Joker Object.
 */
public abstract class Joker {
    public String description;
    public ScoreType scoreType;

    public void apply(Round round) {}

    /** Enum representing the type of Joker Card. */
    public enum ScoreType {
        AFTERHANDPLAY,
        ONCARDPLAY,
    }

    public Joker() {}

    /**
     * Abstract method of Joker for scoring purposes. The playedCard parameter should be null if not
     * required. Overriden by Joker subclasses.
     *
     * @param playedCard
     * @param scoreClass Score Class containing relevant information such as totalChips,
     *     totalMultiplier.
     */
    public abstract void interact(Score scoreClass, Card playedCard);
}
