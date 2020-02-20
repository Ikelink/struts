package actions;

import java.util.Collection;
import modele.Pari;

public class GoToMesParis extends Environnement {

    private Collection<Pari> paris;

    public Collection<Pari> getParis() {
        return paris;
    }

    @Override
    public String execute() throws Exception {
        paris = getFacade().getMesParis(getUtilisateur().getLogin());
        return SUCCESS;
    }

}