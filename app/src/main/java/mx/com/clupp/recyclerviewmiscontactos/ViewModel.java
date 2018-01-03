package mx.com.clupp.recyclerviewmiscontactos;

import android.support.annotation.NonNull;

/**
 * Created by omartronco on 02/01/18.
 */

public class ViewModel {
    private String simpleText;

    public ViewModel(@NonNull final String simpleText) {
        setSimpleText(simpleText);
    }

    @NonNull
    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(@NonNull final String simpleText) {
        this.simpleText = simpleText;
    }
}
