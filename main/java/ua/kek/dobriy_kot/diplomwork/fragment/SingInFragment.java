package ua.kek.dobriy_kot.diplomwork.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;
import ua.kek.dobriy_kot.diplomwork.R;

public class SingInFragment extends BaseFragment {
    public SingInFragment newInstanse(){
        return new SingInFragment();
    }
    @BindView(R.id.loginUserED)
    EditText loginUser;
    @BindView(R.id.passworUserdED)
    EditText passwordUser;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sign_in_fragment, container, false);
    }

    @OnClick(R.id.sinInBtn)
    public void enterMainMenu(){


    }
    @OnClick(R.id.sinUpBtn)
    public void registration(){
    }
}
