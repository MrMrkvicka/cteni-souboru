import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceUzivatelu {

    private List<Uzivatel> data = new ArrayList<>();

    public void nactiZeSouboru(String soubor, String oddelovac) throws IllegalArgumentException{
        data.clear();
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(soubor)))){
            while (scanner.hasNextLine()){
                String[] radek = scanner.nextLine().split(oddelovac);
                data.add(parseUzivatel(radek));
            }
        }catch (FileNotFoundException e){
            throw new EvidenceChybaSouboru("soubor nebyl nalezen:" + soubor+ "!" + e.getLocalizedMessage());
        }
    }


    private Uzivatel parseUzivatel(String[] radek){
        String cisloUzivatele = radek[0].trim();
        String jmeno = radek[1].trim();
      //  LocalDate narozeni = LocalDate.parse(radek[2].trim());
        //double uspesnost = Double.parseDouble((radek[3].trim()));
        //int id = Integer.parseInt(radek[4].trim());
        return new Uzivatel(cisloUzivatele,jmeno /*, narozeni, uspesnost, id*/);
    }


    public List<Uzivatel> getKopieSeznamu() {
        return new ArrayList<>(data);
    }
}
