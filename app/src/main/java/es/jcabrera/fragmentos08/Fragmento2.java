package es.jcabrera.fragmentos08;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragmento2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Button btn1 = (Button) getActivity().findViewById(
                R.id.importarTexto2);
        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                TextView lbl = (TextView) getActivity().findViewById(
                        R.id.texto1);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button btn2 = (Button) getActivity().findViewById(
                R.id.exportarTexto2);
        btn2.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                TextView texto = (TextView) getActivity().findViewById(
                        R.id.texto3);
                texto.setText("TOCADO FRAG2");
            }
        });

    }
}
