package Command.View2;

/**
 * Created by sylvain on 22/02/2016.
 */
public class Annuler implements Command {
    private String libelle;

    public Annuler(){
        this.libelle = "ANNULER";
    }

    @Override
    public String toString() {
        return libelle;
    }

    @Override
    public void execute() {
        System.out.println("Annuler");
    }
}
