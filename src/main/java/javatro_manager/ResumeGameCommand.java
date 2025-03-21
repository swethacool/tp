/**
 * The {@code ResumeGameCommand} class represents a command that allows the player to return to the
 * main game screen after navigating away.
 */
package javatro_manager;

import javatro_exception.JavatroException;

import javatro_view.JavatroView;

/** A command that enables players to return to the game screen. */
public class ResumeGameCommand implements Command {

    /**
     * Provides a brief description of the command.
     *
     * @return A string describing the command.
     */
    @Override
    public String getDescription() {
        return "Return To Game";
    }

    /**
     * Executes the resume game command, updating the game screen to return the player to the main
     * game interface.
     *
     * @throws JavatroException If an error occurs during execution.
     */
    @Override
    public void execute() throws JavatroException {
        // Update the main screen to show game screen
        JavatroManager.setScreen(JavatroView.getGameScreen());
    }
}
