import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListPatients implements InterfacePatient {


    private ArrayList<Patient> ListP;

    public ListPatients(ArrayList<Patient> listP) {
        ListP = listP;
    }


    public void ajouterPatient(Patient p) {
        ListP.add(p);
    }



    public void supprimerPatient(Patient p) {
        ListP.remove(p);
    }







    public boolean rechercherPatient(Patient p){
        return ListP.stream().anyMatch(patient-> patient.equals(p));
    }



    public boolean rechercherPatient(int cin) {
        return ListP.stream().anyMatch(patient-> (patient.getCin() == cin));
    }



    public void afficherPatients() {
        ListP.stream().forEach(p->p.toString());
    }


    public void trierPatientsParNom() {
        this. ListP= (ArrayList<Patient>) ListP.stream()
                .sorted(Comparator.comparing(Patient::getNom))
                .toList();
    }




    public void PatientSansRedondance(){
       ListP.stream().distinct().forEach(p->p.toString());
    }
}