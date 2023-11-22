import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private HashSet<Medecin> setM;

    public SetMedecins(HashSet<Medecin> setM) {
        this.setM = setM;
    }


    public void ajouterMedecin(Medecin m) {

        //hashset n'accept aps des doublons si o nredefinie esuqlas et hashset (ell utulise contains)
        setM.add(m);
    }

    public boolean rechercherMedecin(int cin) {

        return setM.stream().anyMatch(medecin-> medecin.getCin()==cin);
    }


    public void afficherMedecins() {
        setM.stream().forEach(m -> m.toString());

    }


    public long nombreMedecins(){
        return setM.stream().count();
    }

    public TreeSet<Medecin> trierMedecin(){
        return setM.stream()
                .collect(Collectors.toCollection(TreeSet::new));
    }


}