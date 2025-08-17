package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color.toLowerCase()) {
            case "light":
                brands.add("Jail Pale Ale"); brands.add("Lager Lite"); break;
            case "amber":
                brands.add("Jack Amber"); brands.add("Red Moose"); break;
            case "brown":
                brands.add("Brown Bear Beer"); brands.add("Nut Brown"); break;
            case "dark":
                brands.add("Gout Stout"); brands.add("Dark Daniel"); break;
        }
        return brands;
    }
}
