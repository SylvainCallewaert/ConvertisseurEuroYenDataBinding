package sylvain.advancedlayoutapp.fr.convertisseureuroyendatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import sylvain.advancedlayoutapp.fr.convertisseureuroyendatabinding.BR;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter extends BaseObservable{
    private Double euro;
    private Double yen;

    public Converter(Double euro, Double yen) {
        this.euro = euro;
        this.yen = yen;
    }

    public Converter() {

    }
    @Bindable
    public String getEuro() {
        return String.valueOf(euro);
    }

    public Converter setEuro(String euro) {
        if (! euro.equals("")){
        this.euro = Double.valueOf(euro);
        this.yen = this.euro * Double.valueOf(135.86);}
        else {
            this.yen=0.0;
        }
        //notifie la classe BR (bindingreference)
        notifyPropertyChanged(BR.euro);
        notifyPropertyChanged(BR.yen);
        return this;
    }
    @Bindable
    public String getYen() {
        return String.valueOf(yen);
    }

    public Converter setYen(String yen) {
        this.yen = Double.valueOf(yen);
        return this;
    }
}
