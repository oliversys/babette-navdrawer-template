package br.com.oliversys.babetteunhas.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.oliversys.babetteunhas.Constants;
import br.com.oliversys.babetteunhas.OnFragmentInteractionListener;
import pedepizza.oliversoft.com.br.babetteunhas.R;

public class BuscarProfissionaisFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public static BuscarProfissionaisFragment newInstance(int numberSection) {
        BuscarProfissionaisFragment fragment = new BuscarProfissionaisFragment();
        Bundle args = new Bundle();
        args.putInt(Constants.ARG_SECTION_NUMBER,numberSection);
        fragment.setArguments(args);
        return fragment;
    }

    public BuscarProfissionaisFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buscar_profissionais, container, false);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
