package actions;

import modele.Match;

import java.util.ArrayList;
import java.util.List;

public class GoParier extends Environnement {
    private long idMatch;
    private Match match;

    public long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(long idMatch) {
        this.idMatch = idMatch;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public List<String> getResultatsPossibles() {
        return resultatsPossibles;
    }

    public void setResultatsPossibles(List<String> resultatsPossibles) {
        this.resultatsPossibles = resultatsPossibles;
    }

    private List<String> resultatsPossibles;

    @Override
    public String execute() throws Exception {
        match = getFacade().getMatch(idMatch);
        resultatsPossibles = new ArrayList<>();
        resultatsPossibles.add("null");
        resultatsPossibles.add(match.getEquipe1());
        resultatsPossibles.add(match.getEquipe2());

        return SUCCESS;
    }
}