package actions;

import com.opensymphony.xwork2.ActionSupport;
import facade.FacadeParis;
import facade.FacadeParisStaticImpl;
import modele.Utilisateur;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Environnement extends ActionSupport implements ApplicationAware, SessionAware {

    private Map<String, Object> session;
    private FacadeParis facade;

    public FacadeParis getFacade() {
        return facade;
    }

    public Utilisateur getUtilisateur(){
        return (Utilisateur) session.get("utilisateur");
    }

    public void setUtilisateur(Utilisateur utilisateur){
        session.put("utilisateur", utilisateur);
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        facade = (FacadeParis) map.get ("facade");
        if (facade == null){
            facade = new FacadeParisStaticImpl();
            map.put("facade", facade);
        }
    }

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}