package apkmarvel.butterknifesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtHello)TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick({R.id.btnClick,R.id.btnClear})
    void submit(View v) {
        switch (v.getId()){
            case R.id.btnClick:
                txtHello.setText("button click");
                break;
            case R.id.btnClear:
                txtHello.setText("button clear");
                break;
        }
    }
}
