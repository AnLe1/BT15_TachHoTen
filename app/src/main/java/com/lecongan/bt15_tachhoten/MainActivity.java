package com.lecongan.bt15_tachhoten;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTach;
    private EditText edtName;
    private TextView tvKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTach = (Button) findViewById(R.id.btn_tach);
        edtName = (EditText) findViewById(R.id.edt_name);
        tvKq = (TextView) findViewById(R.id.tv_kq);
        btnTach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi = edtName.getText().toString();
                //Dung partern de kiem tra chuoi nhap vao co phai so hay khong?
                TachHoten(chuoi);
            }
        });
    }

    private void TachHoten(String chuoi) {
        chuoi = chuoi.trim();
        String s[] = chuoi.split(" ");

//                String [] ht = new String[5];
//                ht=chuoi.split(" ");

        switch (s.length) {
            case 1:
                tvKq.setText("Vui long nhap day du ho va ten!");
                break;
            case 2:
                tvKq.setText("Ho la: " + s[0] + "\n" + "ten la: " + s[1]);
                break;
            case 3:
                tvKq.setText("Ho la: " + s[0] + "\n" + "chu lot la: " + s[1] + "\n" + "ten la: " + s[2]);
                break;
            case 4:
                for (int i = 0; i < s.length - 1; i++) {
                    String str = "";
                    str = str + s[i];
                    tvKq.setText("Ho: " + s[0] + "\n" + "Chu lot: " + s[1] + "\n" + "Ten: " + str + " " + s[s.length - 1]);
                }
                break;
            case 5:
                tvKq.setText("Ho la: " + s[0] + "\n" + "chu lot la: " + s[1] + " " + s[2] + " " + s[3] + "\n" + "ten la: " + s[4]);
                break;
            default:
                tvKq.setText("Ten gi dai qua vay?!!");
                break;
        }
    }
}
