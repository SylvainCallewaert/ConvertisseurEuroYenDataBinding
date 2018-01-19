package sylvain.advancedlayoutapp.fr.convertisseureuroyendatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sylvain.advancedlayoutapp.fr.convertisseureuroyendatabinding.databinding.ActivityMainBinding;
import sylvain.advancedlayoutapp.fr.convertisseureuroyendatabinding.model.Converter;

public class MainActivity extends AppCompatActivity {
    //Déclaration de instances
    private Converter convertisseur;
    private ActivityMainBinding binding;
    private Double euro = 1.0;
    private Double yen = 135.86;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciation des valeur euro et yen
        convertisseur = new Converter(euro,yen);

        //Création d'un objet de liaison
        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        //Définition des variables à lier
        binding.setConverter(convertisseur);



    }
}
