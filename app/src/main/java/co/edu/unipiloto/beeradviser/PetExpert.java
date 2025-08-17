package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;
public class PetExpert {
    public List<String> getBreeds(String category) {
        List<String> breeds = new ArrayList<>();

        switch (category.toLowerCase()) {
            case "pastores":
                breeds.add("Pastor Catalán");
                breeds.add("Pastor Alemán");
                breeds.add("Komondor");
                breeds.add("Pastor Australiano");
                break;
            case "pinscher":
                breeds.add("Dobermann");
                breeds.add("Pinscher Alemán");
                breeds.add("Pinscher Miniatura");
                breeds.add("Schnauzer");
                break;
            default:
                breeds.add("No se encontraron razas");
                break;
        }
        return breeds;
    }
}
