/**
 * The {@code MainMenuOption} class represents a command that loads the start screen, allowing
 * players to navigate to the main menu.
 */
package javatro.manager.options;

import javatro.core.JavatroException;
import javatro.display.UI;
import javatro.manager.JavatroManager;

/** A command that loads the run selection screen when executed. */
public class ViewRunListOption implements Option {

    /**
     * Provides a brief description of the command.
     *
     * @return A string describing the command.
     */
    @Override
    public String getDescription() {
        return "View List of Runs";
    }

    /** Executes the command to change the screen to the start menu. */
    @Override
    public void execute() throws JavatroException {
        JavatroManager.setScreen(UI.getJumpToRunScreen());
    }
}
