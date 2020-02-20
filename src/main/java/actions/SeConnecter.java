package actions;

import facade.exceptions.InformationsSaisiesIncoherentesException;
import facade.exceptions.UtilisateurDejaConnecteException;
import modele.Utilisateur;

public class SeConnecter extends Environnement{

    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String execute() throws Exception{
        try{
            Utilisateur utilisateur = getFacade().connexion(login,password);
            setUtilisateur(utilisateur);
        }catch (UtilisateurDejaConnecteException e){
            addFieldError("login","le login est deja connecté");
            return INPUT;
        }catch (InformationsSaisiesIncoherentesException e){
            addFieldError("login","info incohérentes");
            return INPUT;
        }

        return SUCCESS;
    }

}