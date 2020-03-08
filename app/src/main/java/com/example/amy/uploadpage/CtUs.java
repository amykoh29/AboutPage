package com.example.amy.uploadpage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CtUs.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CtUs#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CtUs extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private ImageButton plus1;
    private ImageButton minus1;
    private ImageButton plus2;
    private ImageButton minus2;
    private ImageButton plus3;
    private ImageButton minus3;

    private OnFragmentInteractionListener mListener;

    public CtUs() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CtUs.
     */
    // TODO: Rename and change types and number of parameters
    public static CtUs newInstance(String param1, String param2) {
        CtUs fragment = new CtUs();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        String ft1= "messaging \n our app allows you to contact students from other schools stuff about how to use this feature blah blah blah";
        SpannableString ss1=  new SpannableString(ft1);
        ss1.setSpan(new RelativeSizeSpan(2f), 0,9, 0);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);


        plus1 = view.findViewById(R.id.plus1);
        minus1 = view.findViewById(R.id.minus1);
        plus2 = view.findViewById(R.id.plus2);
        minus2 = view.findViewById(R.id.minus2);
        plus3 = view.findViewById(R.id.plus3);
        minus3 = view.findViewById(R.id.minus3);
        tv1 = view.findViewById(R.id.feature1);
        tv2 = view.findViewById(R.id.feature2);
        tv3 = view.findViewById(R.id.feature3);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus1.setVisibility(View.GONE);
                minus1.setVisibility(View.VISIBLE);
                tv1.setMaxLines(Integer.MAX_VALUE);
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus1.setVisibility(View.VISIBLE);
                minus1.setVisibility(View.GONE);
                tv1.setMaxLines(1);
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus2.setVisibility(View.GONE);
                minus2.setVisibility(View.VISIBLE);
                tv2.setMaxLines(Integer.MAX_VALUE);
            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus2.setVisibility(View.VISIBLE);
                minus2.setVisibility(View.GONE);
                tv2.setMaxLines(1);
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus3.setVisibility(View.GONE);
                minus3.setVisibility(View.VISIBLE);
                tv3.setMaxLines(Integer.MAX_VALUE);
            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                plus3.setVisibility(View.VISIBLE);
                minus3.setVisibility(View.GONE);
                tv3.setMaxLines(1);
            }
        });


        String ft1= "messaging \nour app allows you to contact students from other schools stuff about how to use this feature blah blah blah maybe add some pictures to help explain if necessary";
        SpannableString ss1=  new SpannableString(ft1);
        ss1.setSpan(new AbsoluteSizeSpan(25, true), 0,9, 0);
        String ft2= "sharing notes \nyou can take pictures of stuff and share them because sharing is caring and stuff kwjbfkjbkjbkjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjnnnnnnnnnnknjjjjjjjjjjbhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        SpannableString ss2=  new SpannableString(ft2);
        ss2.setSpan(new AbsoluteSizeSpan(25, true), 0,13, 0);

        tv1.setText(ss1);
        tv1.setMaxLines(1);
        tv2.setText(ss2);
        tv2.setMaxLines(1);
        tv3.setText(ss1);
        tv3.setMaxLines(1);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /*@Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}


