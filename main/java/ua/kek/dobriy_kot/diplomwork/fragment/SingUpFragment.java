package ua.kek.dobriy_kot.diplomwork.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import ua.kek.dobriy_kot.diplomwork.R;

public class SingUpFragment extends BaseFragment{


    @BindView(R.id.userAvatarIW)
    ImageView userAvatar;
    @BindView(R.id.userNickNameED)
    EditText userNickNameED;
    @BindView(R.id.passworUserdED)
    EditText passwordUserED;
    @BindView(R.id.userRepitPasswordEd)
    EditText userRepitPasswordED;
    @BindView(R.id.userEmailED)
    EditText userEmailED;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sign_up_fragment,container,false);
    }




}
