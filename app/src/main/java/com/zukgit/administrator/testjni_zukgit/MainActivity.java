package com.zukgit.administrator.testjni_zukgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.ArrayMap;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    JniUtil util;
    public TextView tx_boolean;
    public TextView tx_byte;
    public TextView tx_char;
    public TextView tx_short;
    public TextView tx_int;
    public TextView tx_long;
    public TextView tx_float;
    public TextView tx_double;
    public TextView tx_object;


    // String
    public TextView tx_string00;
    public TextView tx_string01;
    public TextView tx_string10;
    public TextView tx_string11;
    public TextView tx_staticstring00;
    public TextView tx_staticstring01;
    public TextView tx_staticstring10;
    public TextView tx_staticstring11;


    public TextView tx_listobject;
    public TextView tx_liststring;
    public TextView tx_mapstring;

    //---------------------------------------
    public Button btn_boolean;
    public Button btn_byte;
    public Button btn_char;
    public Button btn_short;
    public Button btn_int;
    public Button btn_long;
    public Button btn_float;
    public Button btn_double;
    public Button btn_object;

    // string-button
    public Button btn_string00;
    public Button btn_string01;
    public Button btn_string10;
    public Button btn_string11;
    public Button btn_staticstring00;
    public Button btn_staticstring01;
    public Button btn_staticstring10;
    public Button btn_staticstring11;

    public Button btn_listobject;
    public Button btn_liststring;
    public Button btn_mapstring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataInit();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_boolean:
                Toast.makeText(getApplicationContext(), "boolean-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_byte:
                Toast.makeText(getApplicationContext(), "byte-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_char:
                Toast.makeText(getApplicationContext(), "char-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_short:
                Toast.makeText(getApplicationContext(), "short-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_int:
                Toast.makeText(getApplicationContext(), "int-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_long:
                Toast.makeText(getApplicationContext(), "long-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_float:
                Toast.makeText(getApplicationContext(), "float-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_double:
                Toast.makeText(getApplicationContext(), "double-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_object:
                Toast.makeText(getApplicationContext(), "object-jni", Toast.LENGTH_SHORT).show();
                break;


            //  String ---Begin
            case R.id.btn_string00:
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                String old =util.getStringValue();
                util.stringNvMethod00();
                String newValue = util.getStringValue();
                tx_string00.setText("old:"+old+" new:"+newValue);

                break;
            case R.id.btn_string01:
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                util.stringNvMethod01("javaString");
                tx_string01.setText(util.getStringValue());
                break;
            case R.id.btn_string10:
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                tx_string10.setText(util.stringNvMethod10());
                break;
            case R.id.btn_string11:
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                tx_string11.setText(util.stringNvMethod11("javaString"));
                break;
            case R.id.btn_staticstring00:
                Toast.makeText(getApplicationContext(), "native stringStaticNvMethod00 JNI be called", Toast.LENGTH_SHORT).show();
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】

                String oldValue_00s =util.getStringStaticValue();
                util.stringStaticNvMethod00();
                String newValue_00s = util.getStringStaticValue();
                tx_staticstring00.setText(" old:"+oldValue_00s+" ==new:"+newValue_00s);


                break;
            case R.id.btn_staticstring01:
                Toast.makeText(getApplicationContext(), " native stringStaticNvMethod01 JNI be called ", Toast.LENGTH_SHORT).show();
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】

                util.stringStaticNvMethod01("javaStaticString");
                tx_staticstring01.setText("StringStaticValue="+ util.getStringStaticValue());
                break;
            case R.id.btn_staticstring10:
                Toast.makeText(getApplicationContext(), " native stringStaticNvMethod10 JNI be called", Toast.LENGTH_SHORT).show();
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                tx_staticstring10.setText(util.stringStaticNvMethod10());
                break;
            case R.id.btn_staticstring11:
                Toast.makeText(getApplicationContext(), "native stringStaticNvMethod11 JNI be called", Toast.LENGTH_SHORT).show();
                // 0-0 无参数无返回值【通用】     0-1 无返回值 有参数【】       1-0  有返回值 无参数 【】      1-1  有返回值 有参数【】
                tx_staticstring11.setText(util.stringStaticNvMethod11("javaStaticString"));
                break;

            // String - end




            case R.id.btn_listobject:
                Toast.makeText(getApplicationContext(), "listobject-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_liststring:
                Toast.makeText(getApplicationContext(), "liststring-jni", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_mapstring:
                Toast.makeText(getApplicationContext(), "mapstring-jni", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void DataInit() {
        util = new JniUtil(this);


        tx_boolean = (TextView) findViewById(R.id.tx_boolean);
        tx_byte = (TextView) findViewById(R.id.tx_byte);
        tx_char = (TextView) findViewById(R.id.tx_char);
        tx_short = (TextView) findViewById(R.id.tx_short);
        tx_int = (TextView) findViewById(R.id.tx_int);
        tx_long = (TextView) findViewById(R.id.tx_long);
        tx_float = (TextView) findViewById(R.id.tx_float);
        tx_double = (TextView) findViewById(R.id.tx_double);
        tx_object = (TextView) findViewById(R.id.tx_object);


        // String
        tx_string00 = (TextView) findViewById(R.id.tx_string00);
        tx_string01 = (TextView) findViewById(R.id.tx_string01);
        tx_string10 = (TextView) findViewById(R.id.tx_string10);
        tx_string11 = (TextView) findViewById(R.id.tx_string11);
        tx_staticstring00 = (TextView) findViewById(R.id.tx_staticstring00);
        tx_staticstring01 = (TextView) findViewById(R.id.tx_staticstring01);
        tx_staticstring10 = (TextView) findViewById(R.id.tx_staticstring10);
        tx_staticstring11 = (TextView) findViewById(R.id.tx_staticstring11);




        tx_listobject = (TextView) findViewById(R.id.tx_listobject);
        tx_liststring = (TextView) findViewById(R.id.tx_liststring);
        tx_mapstring = (TextView) findViewById(R.id.tx_mapstring);


        btn_boolean = (Button) findViewById(R.id.btn_boolean);
        btn_byte = (Button) findViewById(R.id.btn_byte);
        btn_char = (Button) findViewById(R.id.btn_char);
        btn_short = (Button) findViewById(R.id.btn_short);
        btn_int = (Button) findViewById(R.id.btn_int);
        btn_long = (Button) findViewById(R.id.btn_long);
        btn_float = (Button) findViewById(R.id.btn_float);
        btn_double = (Button) findViewById(R.id.btn_double);
        btn_object = (Button) findViewById(R.id.btn_object);


        // String
        tx_string00 = (TextView) findViewById(R.id.tx_string00);
        tx_string01 = (TextView) findViewById(R.id.tx_string01);
        tx_string10 = (TextView) findViewById(R.id.tx_string10);
        tx_string11 = (TextView) findViewById(R.id.tx_string11);
        tx_staticstring00 = (TextView) findViewById(R.id.tx_staticstring00);
        tx_staticstring01 = (TextView) findViewById(R.id.tx_staticstring01);
        tx_staticstring10 = (TextView) findViewById(R.id.tx_staticstring10);
        tx_staticstring11 = (TextView) findViewById(R.id.tx_staticstring11);

        // String
        btn_string00 = (Button) findViewById(R.id.btn_string00);
        btn_string01 = (Button) findViewById(R.id.btn_string01);
        btn_string10 = (Button) findViewById(R.id.btn_string10);
        btn_string11 = (Button) findViewById(R.id.btn_string11);
        btn_staticstring00 = (Button) findViewById(R.id.btn_staticstring00);
        btn_staticstring01 = (Button) findViewById(R.id.btn_staticstring01);
        btn_staticstring10 = (Button) findViewById(R.id.btn_staticstring10);
        btn_staticstring11 = (Button) findViewById(R.id.btn_staticstring11);


        btn_listobject = (Button) findViewById(R.id.btn_listobject);
        btn_liststring = (Button) findViewById(R.id.btn_liststring);
        btn_mapstring = (Button) findViewById(R.id.btn_mapstring);

        btn_boolean.setOnClickListener(this);
        btn_byte.setOnClickListener(this);
        btn_char.setOnClickListener(this);
        btn_short.setOnClickListener(this);
        btn_int.setOnClickListener(this);
        btn_long.setOnClickListener(this);
        btn_float.setOnClickListener(this);
        btn_double.setOnClickListener(this);
        btn_object.setOnClickListener(this);

        // String
        btn_string00.setOnClickListener(this);
        btn_string01.setOnClickListener(this);
        btn_string10.setOnClickListener(this);
        btn_string11.setOnClickListener(this);
        btn_staticstring00.setOnClickListener(this);
        btn_staticstring01.setOnClickListener(this);
        btn_staticstring10.setOnClickListener(this);
        btn_staticstring11.setOnClickListener(this);




        btn_listobject.setOnClickListener(this);
        btn_liststring.setOnClickListener(this);
        btn_mapstring.setOnClickListener(this);
    }


}
