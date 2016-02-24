package Command.View2;

/**
 * Created by sylvain on 22/02/2016.
 */
public class Valider implements Command {
    private String libelle;

    public Valider(){
        this.libelle = "VALIDER";
    }

    @Override
    public String toString() {
        return libelle;
    }

    @Override
    public void execute() {
        System.out.println("Valider");
    }
}
