package Command.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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

    private ListCommand lc = new ListCommand();

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

        /*
        labPrint = new Label();
        labPrint.setText("Command");
        panelPrint.add(labPrint);
        */
        fieldPrint = new JTextField();
        //.addComponent(jTextFieldAff, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
        fieldPrint.setPreferredSize( new Dimension( 300, 50 ) );
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
                command(e);
            }
        });
        // Listener on Button
        buttonAnnuler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                command(e);
            }
        });
    }

    /*
    When the windows close : Stop application
     */
    private void closeWindows() {
        System.exit(0);
    }

    private void command(ActionEvent e) {
        lc.addCommand(e);

        lc.execute();
        String print = lc.getStr();

        System.out.println(print+"\n");
        fieldPrint.setText(print);


    }
}
