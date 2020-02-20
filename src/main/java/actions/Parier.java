package actions;

import modele.Match;
import modele.Pari;

import java.util.List;

public class Parier extends Environnement{

    //sorties
    private List<String> resultatsPossibles;
    private Pari pari;
    private Match match;

    //entrées
    private double montant;
    private String resultat;
    private Long idMatch;

    //getters pour les sorties
    public List<String> getResultatsPossibles() {
        return resultatsPossibles;
    }

    public Pari getPari() {
        return pari;
    }

    public Match getMatch() {
        return match;
    }

    //setters pour le entrées
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }



    @Override
    public String execute() throws Exception {
        match = getFacade().getMatch(idMatch);
        if (montant <= 0){
            addFieldError("montant", "le montant doit être positif");
            return INPUT;
        }
        if (match == null){
            addFieldError("match","le match");
            return INPUT;
        }

        long idPari = 0L;
        idPari = getFacade().parier(getUtilisateur().getLogin(),idMatch,resultat,montant);

        pari=getFacade().getPari(idPari);
        match=pari.getMatch();
        return SUCCESS;
    }

}