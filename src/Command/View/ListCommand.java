package Command.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * Created by sylvain on 20/02/2016.
 */
public class ListCommand implements Command {
    private ArrayList<ActionEvent> tabCommand;
    private StringBuffer strb;

    public ListCommand() {
        this.tabCommand = new ArrayList<ActionEvent>();
    }

    public void addCommand(ActionEvent ae) {
        this.tabCommand.add(ae);
    }

    @Override
    public void execute() {
        strb = new StringBuffer();

        for (int i = 0; i < tabCommand.size(); i++) {
            strb.append(tabCommand.get(i).getActionCommand() + "\n");
        }
    }

    public String getStr() {
        return this.strb.toString();
    }

    @Override
    public String toString() {
        return "ListCommand{" +
                "tabCommand=" + tabCommand +
                '}';
    }
}
