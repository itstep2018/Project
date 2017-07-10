package ua.kek.dobriy_kot.diplomwork.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import ua.kek.dobriy_kot.diplomwork.R;
import ua.kek.dobriy_kot.diplomwork.fragment.SingInFragment;

public class MainActivity extends AppCompatActivity {
private Fragment fragment;

    @BindView(R.id.mainContainer)
    LinearLayout mainContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        replaceFragment(new SingInFragment());
    }
    public void replaceFragment(Fragment fragment) {
        this.fragment = fragment;
        getSupportFragmentManager().beginTransaction().replace(mainContainer.getId(),fragment).commit();

    }



}
