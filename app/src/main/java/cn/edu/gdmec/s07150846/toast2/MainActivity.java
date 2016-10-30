package cn.edu.gdmec.s07150846.toast2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View a){
        Toast t= Toast.makeText(this,"哈哈，我早会了",Toast.LENGTH_SHORT);
        t.show();
    }
    public void b2(View a){
        LayoutInflater lf= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vroot =lf.inflate(R.layout.toastroot,null);
        LinearLayout li= (LinearLayout) vroot.findViewById(R.id.rootlayout);
        lf.inflate(R.layout.toastinfo,li);
        Toast toast=new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
    public void b3(View a){
        Toast toast=Toast.makeText(this,"我是小黄人" ,Toast.LENGTH_SHORT);
        LinearLayout li=new LinearLayout(this);
        li.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage= new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView=toast.getView();
        li.addView(mImage);
        li.addView(toastView);
        toast.setView(li);
        toast.show();
    }
}