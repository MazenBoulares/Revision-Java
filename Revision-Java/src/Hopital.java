import java.util.HashMap;
import java.util.TreeMap;

public class Hopital {

    public TreeMap<Medecin,ListPatients> medecinPatiens;

    public Hopital(TreeMap<Medecin, ListPatients> medecinPatiens) {
        this.medecinPatiens = medecinPatiens;
    }

    public void ajouterMedecin(Medecin m){

        medecinPatiens = new TreeMap<>();
    }
    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){
        medecinPatiens.get(m).ajouterPatient(p);
        }else {
            medecinPatiens.put(m, patients);
        }
    }
    /*Avec l&#39;api stream */
    public void afficherMap(){

    }
    /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
    public void afficherMedcinPatients (Medecin m){

    }
}