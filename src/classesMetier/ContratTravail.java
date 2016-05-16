
package classesMetier;

import java.util.ArrayList;

/**
 *
 * @author mfautras
 */
public class ContratTravail {
    private String numContratTravail;
    private String role;
    private int nombreHeures;
    private boolean edition;
    private ContratCession leContratCession;
    private Intermittent lintermittent;
    public static ArrayList<Representation> lesRepresentations;

    
    /**
     * Constructeur de la classe ContratTravail
     * @param numContratTravail
     * @param role
     * @param nombreHeures
     * @param edition
     * @param leContratCession
     * @param lintermittent 
     */
    public ContratTravail(String numContratTravail, String role, int nombreHeures, 
            boolean edition, ContratCession leContratCession, 
            Intermittent lintermittent) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.edition = edition;
        this.leContratCession = leContratCession;
        lesRepresentations = new ArrayList<Representation>();
        this.lintermittent = lintermittent;
    }
    
    public void modifier(String numContratTravail, String role, int nombreHeures, 
            ContratCession leContratCession, 
            Intermittent lintermittent) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.leContratCession = leContratCession;
        this.lintermittent = lintermittent;
        this.edition = false; //l'indicateur d'édition est mis à FAUX
    }
    
    /**
     * Getter du numero de contrat de travail
     * @return numContratTravail
     */
    public String getNumContratTravail() {
        return numContratTravail;
    }

    public String getRole() {
        return role;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public boolean getEdition() {
        return edition;
    }

    public ContratCession getLeContratCession() {
        return leContratCession;
    }

    public Intermittent getLintermittent() {
        return lintermittent;
    }

    public ArrayList<Representation> getLesRepresentations() {
        return lesRepresentations;
    }

    
    /**
     * Setter du numero de contrat de travail
     * @param numContratTravail 
     */
    public void setNumContratTravail(String numContratTravail) {
        this.numContratTravail = numContratTravail;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public void setEdition(boolean edition) {
        this.edition = edition;
    }

    public void setLeContratCession(ContratCession leContratCession) {
        this.leContratCession = leContratCession;
    }

    public void setLintermittent(Intermittent lintermittent) {
        this.lintermittent = lintermittent;
    }

    public void setLesRepresentations(ArrayList<Representation> lesRepresentations) {
        this.lesRepresentations = lesRepresentations;
    }  
    
}
