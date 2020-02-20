package actions;

import modele.Match;
import java.util.Collection;

public class GoToParisOuverts extends Environnement{

    private Collection<Match> matchs;

    public Collection<Match> getMatchs() {
        return matchs;
    }

    @Override
    public String execute() throws Exception {
        matchs = getFacade().getMatchsPasCommences();
        return SUCCESS;
    }


}