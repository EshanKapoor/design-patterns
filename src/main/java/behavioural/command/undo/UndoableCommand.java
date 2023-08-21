package behavioural.command.undo;

import behavioural.command.fx.Command;

public interface UndoableCommand extends Command {
    void unexecute();
}
