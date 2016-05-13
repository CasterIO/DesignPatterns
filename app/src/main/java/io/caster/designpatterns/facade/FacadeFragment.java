package io.caster.designpatterns.facade;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.caster.designpatterns.R;

public class FacadeFragment extends Fragment {

    private TextView value;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.facade_fragment, container, false);
        value = (TextView) v.findViewById(R.id.facade_value);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        CalculationFacade facade = new CalculationFacadeImpl(
                new ClassA(),
                new ClassB(),
                new ClassC()
        );

        value.setText(Integer.toString(facade.getSum()));
    }
}
