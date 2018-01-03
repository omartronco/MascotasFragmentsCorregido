package mx.com.clupp.recyclerviewmiscontactos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by omartronco on 02/01/18.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView simpleTextView;

    public ViewHolder(final View itemView) {
        super(itemView);
        simpleTextView = (TextView) itemView.findViewById(R.id.simple_text);
    }

    public void bindData(final ViewModel viewModel) {
        simpleTextView.setText(viewModel.getSimpleText());
    }
}

