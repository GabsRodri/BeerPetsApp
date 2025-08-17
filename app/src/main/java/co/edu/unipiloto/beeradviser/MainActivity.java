package co.edu.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void findBeer(View view) {
        Spinner spinner = findViewById(R.id.spinnerBeer);
        TextView brandsText = findViewById(R.id.textBrands);
        String color = spinner.getSelectedItem().toString();
        List<String> brands = expert.getBrands(color);
        brandsText.setText(getString(R.string.result_header) + "\n" + String.join("\n", brands));
    }

    public void findPets(View view) {
        Spinner spinner = findViewById(R.id.spinnerPets);
        TextView breedsText = findViewById(R.id.textPets);

        String category = spinner.getSelectedItem().toString();
        PetExpert petExpert = new PetExpert();
        List<String> breeds = petExpert.getBreeds(category);

        StringBuilder breedsFormatted = new StringBuilder("Razas encontradas:\n");
        for (String breed : breeds) {
            breedsFormatted.append(breed).append("\n");
        }

        breedsText.setText(breedsFormatted.toString());
    }

}
