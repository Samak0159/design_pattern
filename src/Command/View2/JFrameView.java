package Command.View2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

/**
 * Created by sylvain on 20/02/2016.
 */
public class JFrameView extends JFrame {
    //Container
    private Container cp;

    //CENTER
    private JPanel panelPrint;
    private Label labPrint;
    private JTextField fieldPrint;

    //SOUTH
    private JPanel panelBoutons;
    private Button buttonValider;
    private Button buttonAnnuler;

    //private ListCommand lc = new ListCommand();
    private ArrayList<Command> listCommand;

    public JFrameView() {
        /*
        public void setBounds(int x, int y, int width, int height)

        Parameters:
            x - the new x-coordinate of this component
            y - the new y-coordinate of this component
            width - the new width of this component
            height - the new height of this component
        */
        this.setBounds(100, 200, 350, 300);
        this.setTitle("Command");

        // contener
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());

        //Panel CENTER (print)
        panelPrint = new JPanel();
        cp.add(panelPrint, BorderLayout.CENTER);

        fieldPrint = new JTextField();
        fieldPrint.setPreferredSize(new Dimension(300, 50));
        fieldPrint.setText("Liste des commandes");
        panelPrint.add(fieldPrint);

        // Panel South (button)
        panelBoutons = new JPanel();
        cp.add(panelBoutons, BorderLayout.SOUTH);

        panelBoutons.setLayout(new FlowLayout());
        buttonValider = new Button("Valider");
        buttonAnnuler = new Button("Annuler");
        panelBoutons.add(buttonValider);
        panelBoutons.add(buttonAnnuler);

        listCommand = new ArrayList<Command>();


        // Listener windows
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                closeWindows();
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        // Listener on Button
        buttonValider.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exe_ajt_aff(new Valider());
            }
        });
        // Listener on Button
        buttonAnnuler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exe_ajt_aff(new Annuler());
            }
        });
    }

    //When the windows close : Stop application
    private void closeWindows() {
        System.exit(0);
    }

    private void ajtCmd(Command cmd) {
        listCommand.add(cmd);
    }

    private void aff() {
        StringBuffer strb = new StringBuffer();

        for (int i = 0; i < listCommand.size(); i++) {
            strb.append(listCommand.get(i).toString() + "\n");
        }

        fieldPrint.setText(strb.toString());
    }

    private void exe_ajt_aff(Command cmd) {
        cmd.execute();
        ajtCmd(cmd);
        aff();
    }
}
