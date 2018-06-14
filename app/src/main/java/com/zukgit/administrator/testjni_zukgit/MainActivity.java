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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataInit();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //  ==================================== boolean Begin
            case R.id.btn_boolean00:

                break;
            case R.id.btn_boolean01:
                break;
            case R.id.btn_boolean10:
                break;
            case R.id.btn_boolean11:
                break;
            case R.id.btn_staticboolean00:
                break;
            case R.id.btn_staticboolean01:
                break;
            case R.id.btn_staticboolean10:
                break;
            case R.id.btn_staticboolean11:
                break;

            //==================================== boolean - end


            //  ==================================== byte Begin
            case R.id.btn_byte00:

                break;
            case R.id.btn_byte01:
                break;
            case R.id.btn_byte10:
                break;
            case R.id.btn_byte11:
                break;
            case R.id.btn_staticbyte00:
                break;
            case R.id.btn_staticbyte01:
                break;
            case R.id.btn_staticbyte10:
                break;
            case R.id.btn_staticbyte11:
                break;

            //==================================== byte - end



            //  ==================================== char Begin
            case R.id.btn_char00:

                break;
            case R.id.btn_char01:
                break;
            case R.id.btn_char10:
                break;
            case R.id.btn_char11:
                break;
            case R.id.btn_staticchar00:
                break;
            case R.id.btn_staticchar01:
                break;
            case R.id.btn_staticchar10:
                break;
            case R.id.btn_staticchar11:
                break;

            //==================================== char - end



            //  ==================================== short Begin
            case R.id.btn_short00:

                break;
            case R.id.btn_short01:
                break;
            case R.id.btn_short10:
                break;
            case R.id.btn_short11:
                break;
            case R.id.btn_staticshort00:
                break;
            case R.id.btn_staticshort01:
                break;
            case R.id.btn_staticshort10:
                break;
            case R.id.btn_staticshort11:
                break;

            //==================================== short - end


            //  ==================================== int Begin
            case R.id.btn_int00:

                break;
            case R.id.btn_int01:
                break;
            case R.id.btn_int10:
                break;
            case R.id.btn_int11:
                break;
            case R.id.btn_staticint00:
                break;
            case R.id.btn_staticint01:
                break;
            case R.id.btn_staticint10:
                break;
            case R.id.btn_staticint11:
                break;

            //==================================== int - end




            //  ==================================== long Begin
            case R.id.btn_long00:

                break;
            case R.id.btn_long01:
                break;
            case R.id.btn_long10:
                break;
            case R.id.btn_long11:
                break;
            case R.id.btn_staticlong00:
                break;
            case R.id.btn_staticlong01:
                break;
            case R.id.btn_staticlong10:
                break;
            case R.id.btn_staticlong11:
                break;

            //==================================== long - end


            //  ==================================== float Begin
            case R.id.btn_float00:

                break;
            case R.id.btn_float01:
                break;
            case R.id.btn_float10:
                break;
            case R.id.btn_float11:
                break;
            case R.id.btn_staticfloat00:
                break;
            case R.id.btn_staticfloat01:
                break;
            case R.id.btn_staticfloat10:
                break;
            case R.id.btn_staticfloat11:
                break;

            //==================================== float - end



            //  ==================================== double Begin
            case R.id.btn_double00:

                break;
            case R.id.btn_double01:
                break;
            case R.id.btn_double10:
                break;
            case R.id.btn_double11:
                break;
            case R.id.btn_staticdouble00:
                break;
            case R.id.btn_staticdouble01:
                break;
            case R.id.btn_staticdouble10:
                break;
            case R.id.btn_staticdouble11:
                break;

            //==================================== double - end



            //  ==================================== Object Begin
            case R.id.btn_Object00:

                break;
            case R.id.btn_Object01:
                break;
            case R.id.btn_Object10:
                break;
            case R.id.btn_Object11:
                break;
            case R.id.btn_staticObject00:
                break;
            case R.id.btn_staticObject01:
                break;
            case R.id.btn_staticObject10:
                break;
            case R.id.btn_staticObject11:
                break;

            //==================================== Object - end

            //  ==================================== String Begin
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

            //==================================== String - end


            //  ==================================== listobject Begin
            case R.id.btn_listobject00:

                break;
            case R.id.btn_listobject01:
                break;
            case R.id.btn_listobject10:
                break;
            case R.id.btn_listobject11:
                break;
            case R.id.btn_staticlistobject00:
                break;
            case R.id.btn_staticlistobject01:
                break;
            case R.id.btn_staticlistobject10:
                break;
            case R.id.btn_staticlistobject11:
                break;

            //==================================== listobject - end



            //  ==================================== liststring Begin
            case R.id.btn_liststring00:

                break;
            case R.id.btn_liststring01:
                break;
            case R.id.btn_liststring10:
                break;
            case R.id.btn_liststring11:
                break;
            case R.id.btn_staticliststring00:
                break;
            case R.id.btn_staticliststring01:
                break;
            case R.id.btn_staticliststring10:
                break;
            case R.id.btn_staticliststring11:
                break;

            //==================================== liststring - end

            //  ==================================== mapstring Begin
            case R.id.btn_mapstring00:

                break;
            case R.id.btn_mapstring01:
                break;
            case R.id.btn_mapstring10:
                break;
            case R.id.btn_mapstring11:
                break;
            case R.id.btn_staticmapstring00:
                break;
            case R.id.btn_staticmapstring01:
                break;
            case R.id.btn_staticmapstring10:
                break;
            case R.id.btn_staticmapstring11:
                break;

            //==================================== mapstring - end

        }
    }

    public void DataInit() {
        util = new JniUtil(this);


        // ================boolean   Begin Init
        // boolean-Text
        tx_boolean00 = (TextView) findViewById(R.id.tx_boolean00);
        tx_boolean01 = (TextView) findViewById(R.id.tx_boolean01);
        tx_boolean10 = (TextView) findViewById(R.id.tx_boolean10);
        tx_boolean11 = (TextView) findViewById(R.id.tx_boolean11);
        tx_staticboolean00 = (TextView) findViewById(R.id.tx_staticboolean00);
        tx_staticboolean01 = (TextView) findViewById(R.id.tx_staticboolean01);
        tx_staticboolean10 = (TextView) findViewById(R.id.tx_staticboolean10);
        tx_staticboolean11 = (TextView) findViewById(R.id.tx_staticboolean11);

        // boolean-Btn
        btn_boolean00 = (Button) findViewById(R.id.btn_boolean00);
        btn_boolean01 = (Button) findViewById(R.id.btn_boolean01);
        btn_boolean10 = (Button) findViewById(R.id.btn_boolean10);
        btn_boolean11 = (Button) findViewById(R.id.btn_boolean11);
        btn_staticboolean00 = (Button) findViewById(R.id.btn_staticboolean00);
        btn_staticboolean01 = (Button) findViewById(R.id.btn_staticboolean01);
        btn_staticboolean10 = (Button) findViewById(R.id.btn_staticboolean10);
        btn_staticboolean11 = (Button) findViewById(R.id.btn_staticboolean11);
        btn_boolean00.setOnClickListener(this);
        btn_boolean01.setOnClickListener(this);
        btn_boolean10.setOnClickListener(this);
        btn_boolean11.setOnClickListener(this);
        btn_staticboolean00.setOnClickListener(this);
        btn_staticboolean01.setOnClickListener(this);
        btn_staticboolean10.setOnClickListener(this);
        btn_staticboolean11.setOnClickListener(this);
        // ================boolean   End  Init




        // ================byte   Begin Init
        // byte-Text
        tx_byte00 = (TextView) findViewById(R.id.tx_byte00);
        tx_byte01 = (TextView) findViewById(R.id.tx_byte01);
        tx_byte10 = (TextView) findViewById(R.id.tx_byte10);
        tx_byte11 = (TextView) findViewById(R.id.tx_byte11);
        tx_staticbyte00 = (TextView) findViewById(R.id.tx_staticbyte00);
        tx_staticbyte01 = (TextView) findViewById(R.id.tx_staticbyte01);
        tx_staticbyte10 = (TextView) findViewById(R.id.tx_staticbyte10);
        tx_staticbyte11 = (TextView) findViewById(R.id.tx_staticbyte11);

        // byte-Btn
        btn_byte00 = (Button) findViewById(R.id.btn_byte00);
        btn_byte01 = (Button) findViewById(R.id.btn_byte01);
        btn_byte10 = (Button) findViewById(R.id.btn_byte10);
        btn_byte11 = (Button) findViewById(R.id.btn_byte11);
        btn_staticbyte00 = (Button) findViewById(R.id.btn_staticbyte00);
        btn_staticbyte01 = (Button) findViewById(R.id.btn_staticbyte01);
        btn_staticbyte10 = (Button) findViewById(R.id.btn_staticbyte10);
        btn_staticbyte11 = (Button) findViewById(R.id.btn_staticbyte11);
        btn_byte00.setOnClickListener(this);
        btn_byte01.setOnClickListener(this);
        btn_byte10.setOnClickListener(this);
        btn_byte11.setOnClickListener(this);
        btn_staticbyte00.setOnClickListener(this);
        btn_staticbyte01.setOnClickListener(this);
        btn_staticbyte10.setOnClickListener(this);
        btn_staticbyte11.setOnClickListener(this);
        // ================byte   End  Init



        // ================char   Begin Init
        // char-Text
        tx_char00 = (TextView) findViewById(R.id.tx_char00);
        tx_char01 = (TextView) findViewById(R.id.tx_char01);
        tx_char10 = (TextView) findViewById(R.id.tx_char10);
        tx_char11 = (TextView) findViewById(R.id.tx_char11);
        tx_staticchar00 = (TextView) findViewById(R.id.tx_staticchar00);
        tx_staticchar01 = (TextView) findViewById(R.id.tx_staticchar01);
        tx_staticchar10 = (TextView) findViewById(R.id.tx_staticchar10);
        tx_staticchar11 = (TextView) findViewById(R.id.tx_staticchar11);

        // char-Btn
        btn_char00 = (Button) findViewById(R.id.btn_char00);
        btn_char01 = (Button) findViewById(R.id.btn_char01);
        btn_char10 = (Button) findViewById(R.id.btn_char10);
        btn_char11 = (Button) findViewById(R.id.btn_char11);
        btn_staticchar00 = (Button) findViewById(R.id.btn_staticchar00);
        btn_staticchar01 = (Button) findViewById(R.id.btn_staticchar01);
        btn_staticchar10 = (Button) findViewById(R.id.btn_staticchar10);
        btn_staticchar11 = (Button) findViewById(R.id.btn_staticchar11);
        btn_char00.setOnClickListener(this);
        btn_char01.setOnClickListener(this);
        btn_char10.setOnClickListener(this);
        btn_char11.setOnClickListener(this);
        btn_staticchar00.setOnClickListener(this);
        btn_staticchar01.setOnClickListener(this);
        btn_staticchar10.setOnClickListener(this);
        btn_staticchar11.setOnClickListener(this);
        // ================char   End  Init



        // ================short   Begin Init
        // short-Text
        tx_short00 = (TextView) findViewById(R.id.tx_short00);
        tx_short01 = (TextView) findViewById(R.id.tx_short01);
        tx_short10 = (TextView) findViewById(R.id.tx_short10);
        tx_short11 = (TextView) findViewById(R.id.tx_short11);
        tx_staticshort00 = (TextView) findViewById(R.id.tx_staticshort00);
        tx_staticshort01 = (TextView) findViewById(R.id.tx_staticshort01);
        tx_staticshort10 = (TextView) findViewById(R.id.tx_staticshort10);
        tx_staticshort11 = (TextView) findViewById(R.id.tx_staticshort11);

        // short-Btn
        btn_short00 = (Button) findViewById(R.id.btn_short00);
        btn_short01 = (Button) findViewById(R.id.btn_short01);
        btn_short10 = (Button) findViewById(R.id.btn_short10);
        btn_short11 = (Button) findViewById(R.id.btn_short11);
        btn_staticshort00 = (Button) findViewById(R.id.btn_staticshort00);
        btn_staticshort01 = (Button) findViewById(R.id.btn_staticshort01);
        btn_staticshort10 = (Button) findViewById(R.id.btn_staticshort10);
        btn_staticshort11 = (Button) findViewById(R.id.btn_staticshort11);
        btn_short00.setOnClickListener(this);
        btn_short01.setOnClickListener(this);
        btn_short10.setOnClickListener(this);
        btn_short11.setOnClickListener(this);
        btn_staticshort00.setOnClickListener(this);
        btn_staticshort01.setOnClickListener(this);
        btn_staticshort10.setOnClickListener(this);
        btn_staticshort11.setOnClickListener(this);
        // ================short   End  Init



        // ================int   Begin Init
        // int-Text
        tx_int00 = (TextView) findViewById(R.id.tx_int00);
        tx_int01 = (TextView) findViewById(R.id.tx_int01);
        tx_int10 = (TextView) findViewById(R.id.tx_int10);
        tx_int11 = (TextView) findViewById(R.id.tx_int11);
        tx_staticint00 = (TextView) findViewById(R.id.tx_staticint00);
        tx_staticint01 = (TextView) findViewById(R.id.tx_staticint01);
        tx_staticint10 = (TextView) findViewById(R.id.tx_staticint10);
        tx_staticint11 = (TextView) findViewById(R.id.tx_staticint11);

        // int-Btn
        btn_int00 = (Button) findViewById(R.id.btn_int00);
        btn_int01 = (Button) findViewById(R.id.btn_int01);
        btn_int10 = (Button) findViewById(R.id.btn_int10);
        btn_int11 = (Button) findViewById(R.id.btn_int11);
        btn_staticint00 = (Button) findViewById(R.id.btn_staticint00);
        btn_staticint01 = (Button) findViewById(R.id.btn_staticint01);
        btn_staticint10 = (Button) findViewById(R.id.btn_staticint10);
        btn_staticint11 = (Button) findViewById(R.id.btn_staticint11);
        btn_int00.setOnClickListener(this);
        btn_int01.setOnClickListener(this);
        btn_int10.setOnClickListener(this);
        btn_int11.setOnClickListener(this);
        btn_staticint00.setOnClickListener(this);
        btn_staticint01.setOnClickListener(this);
        btn_staticint10.setOnClickListener(this);
        btn_staticint11.setOnClickListener(this);
        // ================int   End  Init




        // ================long   Begin Init
        // long-Text
        tx_long00 = (TextView) findViewById(R.id.tx_long00);
        tx_long01 = (TextView) findViewById(R.id.tx_long01);
        tx_long10 = (TextView) findViewById(R.id.tx_long10);
        tx_long11 = (TextView) findViewById(R.id.tx_long11);
        tx_staticlong00 = (TextView) findViewById(R.id.tx_staticlong00);
        tx_staticlong01 = (TextView) findViewById(R.id.tx_staticlong01);
        tx_staticlong10 = (TextView) findViewById(R.id.tx_staticlong10);
        tx_staticlong11 = (TextView) findViewById(R.id.tx_staticlong11);

        // long-Btn
        btn_long00 = (Button) findViewById(R.id.btn_long00);
        btn_long01 = (Button) findViewById(R.id.btn_long01);
        btn_long10 = (Button) findViewById(R.id.btn_long10);
        btn_long11 = (Button) findViewById(R.id.btn_long11);
        btn_staticlong00 = (Button) findViewById(R.id.btn_staticlong00);
        btn_staticlong01 = (Button) findViewById(R.id.btn_staticlong01);
        btn_staticlong10 = (Button) findViewById(R.id.btn_staticlong10);
        btn_staticlong11 = (Button) findViewById(R.id.btn_staticlong11);
        btn_long00.setOnClickListener(this);
        btn_long01.setOnClickListener(this);
        btn_long10.setOnClickListener(this);
        btn_long11.setOnClickListener(this);
        btn_staticlong00.setOnClickListener(this);
        btn_staticlong01.setOnClickListener(this);
        btn_staticlong10.setOnClickListener(this);
        btn_staticlong11.setOnClickListener(this);
        // ================long   End  Init



        // ================float   Begin Init
        // float-Text
        tx_float00 = (TextView) findViewById(R.id.tx_float00);
        tx_float01 = (TextView) findViewById(R.id.tx_float01);
        tx_float10 = (TextView) findViewById(R.id.tx_float10);
        tx_float11 = (TextView) findViewById(R.id.tx_float11);
        tx_staticfloat00 = (TextView) findViewById(R.id.tx_staticfloat00);
        tx_staticfloat01 = (TextView) findViewById(R.id.tx_staticfloat01);
        tx_staticfloat10 = (TextView) findViewById(R.id.tx_staticfloat10);
        tx_staticfloat11 = (TextView) findViewById(R.id.tx_staticfloat11);

        // float-Btn
        btn_float00 = (Button) findViewById(R.id.btn_float00);
        btn_float01 = (Button) findViewById(R.id.btn_float01);
        btn_float10 = (Button) findViewById(R.id.btn_float10);
        btn_float11 = (Button) findViewById(R.id.btn_float11);
        btn_staticfloat00 = (Button) findViewById(R.id.btn_staticfloat00);
        btn_staticfloat01 = (Button) findViewById(R.id.btn_staticfloat01);
        btn_staticfloat10 = (Button) findViewById(R.id.btn_staticfloat10);
        btn_staticfloat11 = (Button) findViewById(R.id.btn_staticfloat11);
        btn_float00.setOnClickListener(this);
        btn_float01.setOnClickListener(this);
        btn_float10.setOnClickListener(this);
        btn_float11.setOnClickListener(this);
        btn_staticfloat00.setOnClickListener(this);
        btn_staticfloat01.setOnClickListener(this);
        btn_staticfloat10.setOnClickListener(this);
        btn_staticfloat11.setOnClickListener(this);
        // ================float   End  Init




        // ================double   Begin Init
        // double-Text
        tx_double00 = (TextView) findViewById(R.id.tx_double00);
        tx_double01 = (TextView) findViewById(R.id.tx_double01);
        tx_double10 = (TextView) findViewById(R.id.tx_double10);
        tx_double11 = (TextView) findViewById(R.id.tx_double11);
        tx_staticdouble00 = (TextView) findViewById(R.id.tx_staticdouble00);
        tx_staticdouble01 = (TextView) findViewById(R.id.tx_staticdouble01);
        tx_staticdouble10 = (TextView) findViewById(R.id.tx_staticdouble10);
        tx_staticdouble11 = (TextView) findViewById(R.id.tx_staticdouble11);

        // double-Btn
        btn_double00 = (Button) findViewById(R.id.btn_double00);
        btn_double01 = (Button) findViewById(R.id.btn_double01);
        btn_double10 = (Button) findViewById(R.id.btn_double10);
        btn_double11 = (Button) findViewById(R.id.btn_double11);
        btn_staticdouble00 = (Button) findViewById(R.id.btn_staticdouble00);
        btn_staticdouble01 = (Button) findViewById(R.id.btn_staticdouble01);
        btn_staticdouble10 = (Button) findViewById(R.id.btn_staticdouble10);
        btn_staticdouble11 = (Button) findViewById(R.id.btn_staticdouble11);
        btn_double00.setOnClickListener(this);
        btn_double01.setOnClickListener(this);
        btn_double10.setOnClickListener(this);
        btn_double11.setOnClickListener(this);
        btn_staticdouble00.setOnClickListener(this);
        btn_staticdouble01.setOnClickListener(this);
        btn_staticdouble10.setOnClickListener(this);
        btn_staticdouble11.setOnClickListener(this);
        // ================double   End  Init


        // ================Object   Begin Init
        // Object-Text
        tx_Object00 = (TextView) findViewById(R.id.tx_Object00);
        tx_Object01 = (TextView) findViewById(R.id.tx_Object01);
        tx_Object10 = (TextView) findViewById(R.id.tx_Object10);
        tx_Object11 = (TextView) findViewById(R.id.tx_Object11);
        tx_staticObject00 = (TextView) findViewById(R.id.tx_staticObject00);
        tx_staticObject01 = (TextView) findViewById(R.id.tx_staticObject01);
        tx_staticObject10 = (TextView) findViewById(R.id.tx_staticObject10);
        tx_staticObject11 = (TextView) findViewById(R.id.tx_staticObject11);

        // Object-Btn
        btn_Object00 = (Button) findViewById(R.id.btn_Object00);
        btn_Object01 = (Button) findViewById(R.id.btn_Object01);
        btn_Object10 = (Button) findViewById(R.id.btn_Object10);
        btn_Object11 = (Button) findViewById(R.id.btn_Object11);
        btn_staticObject00 = (Button) findViewById(R.id.btn_staticObject00);
        btn_staticObject01 = (Button) findViewById(R.id.btn_staticObject01);
        btn_staticObject10 = (Button) findViewById(R.id.btn_staticObject10);
        btn_staticObject11 = (Button) findViewById(R.id.btn_staticObject11);
        btn_Object00.setOnClickListener(this);
        btn_Object01.setOnClickListener(this);
        btn_Object10.setOnClickListener(this);
        btn_Object11.setOnClickListener(this);
        btn_staticObject00.setOnClickListener(this);
        btn_staticObject01.setOnClickListener(this);
        btn_staticObject10.setOnClickListener(this);
        btn_staticObject11.setOnClickListener(this);
        // ================Object   End  Init


        // ================String   Begin Init
        // String-Text
        tx_string00 = (TextView) findViewById(R.id.tx_string00);
        tx_string01 = (TextView) findViewById(R.id.tx_string01);
        tx_string10 = (TextView) findViewById(R.id.tx_string10);
        tx_string11 = (TextView) findViewById(R.id.tx_string11);
        tx_staticstring00 = (TextView) findViewById(R.id.tx_staticstring00);
        tx_staticstring01 = (TextView) findViewById(R.id.tx_staticstring01);
        tx_staticstring10 = (TextView) findViewById(R.id.tx_staticstring10);
        tx_staticstring11 = (TextView) findViewById(R.id.tx_staticstring11);

        // String-Btn
        btn_string00 = (Button) findViewById(R.id.btn_string00);
        btn_string01 = (Button) findViewById(R.id.btn_string01);
        btn_string10 = (Button) findViewById(R.id.btn_string10);
        btn_string11 = (Button) findViewById(R.id.btn_string11);
        btn_staticstring00 = (Button) findViewById(R.id.btn_staticstring00);
        btn_staticstring01 = (Button) findViewById(R.id.btn_staticstring01);
        btn_staticstring10 = (Button) findViewById(R.id.btn_staticstring10);
        btn_staticstring11 = (Button) findViewById(R.id.btn_staticstring11);
        btn_string00.setOnClickListener(this);
        btn_string01.setOnClickListener(this);
        btn_string10.setOnClickListener(this);
        btn_string11.setOnClickListener(this);
        btn_staticstring00.setOnClickListener(this);
        btn_staticstring01.setOnClickListener(this);
        btn_staticstring10.setOnClickListener(this);
        btn_staticstring11.setOnClickListener(this);
       // ================String   End  Init


        // ================listobject   Begin Init
        // listobject-Text
        tx_listobject00 = (TextView) findViewById(R.id.tx_listobject00);
        tx_listobject01 = (TextView) findViewById(R.id.tx_listobject01);
        tx_listobject10 = (TextView) findViewById(R.id.tx_listobject10);
        tx_listobject11 = (TextView) findViewById(R.id.tx_listobject11);
        tx_staticlistobject00 = (TextView) findViewById(R.id.tx_staticlistobject00);
        tx_staticlistobject01 = (TextView) findViewById(R.id.tx_staticlistobject01);
        tx_staticlistobject10 = (TextView) findViewById(R.id.tx_staticlistobject10);
        tx_staticlistobject11 = (TextView) findViewById(R.id.tx_staticlistobject11);

        // listobject-Btn
        btn_listobject00 = (Button) findViewById(R.id.btn_listobject00);
        btn_listobject01 = (Button) findViewById(R.id.btn_listobject01);
        btn_listobject10 = (Button) findViewById(R.id.btn_listobject10);
        btn_listobject11 = (Button) findViewById(R.id.btn_listobject11);
        btn_staticlistobject00 = (Button) findViewById(R.id.btn_staticlistobject00);
        btn_staticlistobject01 = (Button) findViewById(R.id.btn_staticlistobject01);
        btn_staticlistobject10 = (Button) findViewById(R.id.btn_staticlistobject10);
        btn_staticlistobject11 = (Button) findViewById(R.id.btn_staticlistobject11);
        btn_listobject00.setOnClickListener(this);
        btn_listobject01.setOnClickListener(this);
        btn_listobject10.setOnClickListener(this);
        btn_listobject11.setOnClickListener(this);
        btn_staticlistobject00.setOnClickListener(this);
        btn_staticlistobject01.setOnClickListener(this);
        btn_staticlistobject10.setOnClickListener(this);
        btn_staticlistobject11.setOnClickListener(this);
        // ================listobject   End  Init

        // ================liststring   Begin Init
        // liststring-Text
        tx_liststring00 = (TextView) findViewById(R.id.tx_liststring00);
        tx_liststring01 = (TextView) findViewById(R.id.tx_liststring01);
        tx_liststring10 = (TextView) findViewById(R.id.tx_liststring10);
        tx_liststring11 = (TextView) findViewById(R.id.tx_liststring11);
        tx_staticliststring00 = (TextView) findViewById(R.id.tx_staticliststring00);
        tx_staticliststring01 = (TextView) findViewById(R.id.tx_staticliststring01);
        tx_staticliststring10 = (TextView) findViewById(R.id.tx_staticliststring10);
        tx_staticliststring11 = (TextView) findViewById(R.id.tx_staticliststring11);

        // liststring-Btn
        btn_liststring00 = (Button) findViewById(R.id.btn_liststring00);
        btn_liststring01 = (Button) findViewById(R.id.btn_liststring01);
        btn_liststring10 = (Button) findViewById(R.id.btn_liststring10);
        btn_liststring11 = (Button) findViewById(R.id.btn_liststring11);
        btn_staticliststring00 = (Button) findViewById(R.id.btn_staticliststring00);
        btn_staticliststring01 = (Button) findViewById(R.id.btn_staticliststring01);
        btn_staticliststring10 = (Button) findViewById(R.id.btn_staticliststring10);
        btn_staticliststring11 = (Button) findViewById(R.id.btn_staticliststring11);
        btn_liststring00.setOnClickListener(this);
        btn_liststring01.setOnClickListener(this);
        btn_liststring10.setOnClickListener(this);
        btn_liststring11.setOnClickListener(this);
        btn_staticliststring00.setOnClickListener(this);
        btn_staticliststring01.setOnClickListener(this);
        btn_staticliststring10.setOnClickListener(this);
        btn_staticliststring11.setOnClickListener(this);
        // ================liststring   End  Init



        // ================mapstring   Begin Init
        // mapstring-Text
        tx_mapstring00 = (TextView) findViewById(R.id.tx_mapstring00);
        tx_mapstring01 = (TextView) findViewById(R.id.tx_mapstring01);
        tx_mapstring10 = (TextView) findViewById(R.id.tx_mapstring10);
        tx_mapstring11 = (TextView) findViewById(R.id.tx_mapstring11);
        tx_staticmapstring00 = (TextView) findViewById(R.id.tx_staticmapstring00);
        tx_staticmapstring01 = (TextView) findViewById(R.id.tx_staticmapstring01);
        tx_staticmapstring10 = (TextView) findViewById(R.id.tx_staticmapstring10);
        tx_staticmapstring11 = (TextView) findViewById(R.id.tx_staticmapstring11);

        // mapstring-Btn
        btn_mapstring00 = (Button) findViewById(R.id.btn_mapstring00);
        btn_mapstring01 = (Button) findViewById(R.id.btn_mapstring01);
        btn_mapstring10 = (Button) findViewById(R.id.btn_mapstring10);
        btn_mapstring11 = (Button) findViewById(R.id.btn_mapstring11);
        btn_staticmapstring00 = (Button) findViewById(R.id.btn_staticmapstring00);
        btn_staticmapstring01 = (Button) findViewById(R.id.btn_staticmapstring01);
        btn_staticmapstring10 = (Button) findViewById(R.id.btn_staticmapstring10);
        btn_staticmapstring11 = (Button) findViewById(R.id.btn_staticmapstring11);
        btn_mapstring00.setOnClickListener(this);
        btn_mapstring01.setOnClickListener(this);
        btn_mapstring10.setOnClickListener(this);
        btn_mapstring11.setOnClickListener(this);
        btn_staticmapstring00.setOnClickListener(this);
        btn_staticmapstring01.setOnClickListener(this);
        btn_staticmapstring10.setOnClickListener(this);
        btn_staticmapstring11.setOnClickListener(this);
        // ================mapstring   End  Init

    }




    // ==========boolean  View Begin
    // boolean-Text
    public TextView tx_boolean00;
    public TextView tx_boolean01;
    public TextView tx_boolean10;
    public TextView tx_boolean11;
    public TextView tx_staticboolean00;
    public TextView tx_staticboolean01;
    public TextView tx_staticboolean10;
    public TextView tx_staticboolean11;

    // boolean-button
    public Button btn_boolean00;
    public Button btn_boolean01;
    public Button btn_boolean10;
    public Button btn_boolean11;
    public Button btn_staticboolean00;
    public Button btn_staticboolean01;
    public Button btn_staticboolean10;
    public Button btn_staticboolean11;
    // ==========boolean  View End


    // ==========byte  View Begin
    // byte-Text
    public TextView tx_byte00;
    public TextView tx_byte01;
    public TextView tx_byte10;
    public TextView tx_byte11;
    public TextView tx_staticbyte00;
    public TextView tx_staticbyte01;
    public TextView tx_staticbyte10;
    public TextView tx_staticbyte11;

    // byte-button
    public Button btn_byte00;
    public Button btn_byte01;
    public Button btn_byte10;
    public Button btn_byte11;
    public Button btn_staticbyte00;
    public Button btn_staticbyte01;
    public Button btn_staticbyte10;
    public Button btn_staticbyte11;
    // ==========byte  View End



    // ==========char  View Begin
    // char-Text
    public TextView tx_char00;
    public TextView tx_char01;
    public TextView tx_char10;
    public TextView tx_char11;
    public TextView tx_staticchar00;
    public TextView tx_staticchar01;
    public TextView tx_staticchar10;
    public TextView tx_staticchar11;

    // char-button
    public Button btn_char00;
    public Button btn_char01;
    public Button btn_char10;
    public Button btn_char11;
    public Button btn_staticchar00;
    public Button btn_staticchar01;
    public Button btn_staticchar10;
    public Button btn_staticchar11;
    // ==========char  View End



    // ==========short  View Begin
    // short-Text
    public TextView tx_short00;
    public TextView tx_short01;
    public TextView tx_short10;
    public TextView tx_short11;
    public TextView tx_staticshort00;
    public TextView tx_staticshort01;
    public TextView tx_staticshort10;
    public TextView tx_staticshort11;

    // short-button
    public Button btn_short00;
    public Button btn_short01;
    public Button btn_short10;
    public Button btn_short11;
    public Button btn_staticshort00;
    public Button btn_staticshort01;
    public Button btn_staticshort10;
    public Button btn_staticshort11;
    // ==========short  View End


    // ==========int  View Begin
    // int-Text
    public TextView tx_int00;
    public TextView tx_int01;
    public TextView tx_int10;
    public TextView tx_int11;
    public TextView tx_staticint00;
    public TextView tx_staticint01;
    public TextView tx_staticint10;
    public TextView tx_staticint11;

    // int-button
    public Button btn_int00;
    public Button btn_int01;
    public Button btn_int10;
    public Button btn_int11;
    public Button btn_staticint00;
    public Button btn_staticint01;
    public Button btn_staticint10;
    public Button btn_staticint11;
    // ==========int  View End


    // ==========long  View Begin
    // long-Text
    public TextView tx_long00;
    public TextView tx_long01;
    public TextView tx_long10;
    public TextView tx_long11;
    public TextView tx_staticlong00;
    public TextView tx_staticlong01;
    public TextView tx_staticlong10;
    public TextView tx_staticlong11;

    // long-button
    public Button btn_long00;
    public Button btn_long01;
    public Button btn_long10;
    public Button btn_long11;
    public Button btn_staticlong00;
    public Button btn_staticlong01;
    public Button btn_staticlong10;
    public Button btn_staticlong11;
    // ==========long  View End


    // ==========float  View Begin
    // float-Text
    public TextView tx_float00;
    public TextView tx_float01;
    public TextView tx_float10;
    public TextView tx_float11;
    public TextView tx_staticfloat00;
    public TextView tx_staticfloat01;
    public TextView tx_staticfloat10;
    public TextView tx_staticfloat11;

    // float-button
    public Button btn_float00;
    public Button btn_float01;
    public Button btn_float10;
    public Button btn_float11;
    public Button btn_staticfloat00;
    public Button btn_staticfloat01;
    public Button btn_staticfloat10;
    public Button btn_staticfloat11;
    // ==========float  View End



    // ==========double  View Begin
    // double-Text
    public TextView tx_double00;
    public TextView tx_double01;
    public TextView tx_double10;
    public TextView tx_double11;
    public TextView tx_staticdouble00;
    public TextView tx_staticdouble01;
    public TextView tx_staticdouble10;
    public TextView tx_staticdouble11;

    // double-button
    public Button btn_double00;
    public Button btn_double01;
    public Button btn_double10;
    public Button btn_double11;
    public Button btn_staticdouble00;
    public Button btn_staticdouble01;
    public Button btn_staticdouble10;
    public Button btn_staticdouble11;
    // ==========double  View End


    // ==========Object  View Begin
    // Object-Text
    public TextView tx_Object00;
    public TextView tx_Object01;
    public TextView tx_Object10;
    public TextView tx_Object11;
    public TextView tx_staticObject00;
    public TextView tx_staticObject01;
    public TextView tx_staticObject10;
    public TextView tx_staticObject11;

    // Object-button
    public Button btn_Object00;
    public Button btn_Object01;
    public Button btn_Object10;
    public Button btn_Object11;
    public Button btn_staticObject00;
    public Button btn_staticObject01;
    public Button btn_staticObject10;
    public Button btn_staticObject11;
    // ==========Object  View End


    // ==========String  View Begin
    // String-Text
    public TextView tx_string00;
    public TextView tx_string01;
    public TextView tx_string10;
    public TextView tx_string11;
    public TextView tx_staticstring00;
    public TextView tx_staticstring01;
    public TextView tx_staticstring10;
    public TextView tx_staticstring11;

    // string-button
    public Button btn_string00;
    public Button btn_string01;
    public Button btn_string10;
    public Button btn_string11;
    public Button btn_staticstring00;
    public Button btn_staticstring01;
    public Button btn_staticstring10;
    public Button btn_staticstring11;
    // ==========String  View End


    // ==========listobject  View Begin
    // listobject-Text
    public TextView tx_listobject00;
    public TextView tx_listobject01;
    public TextView tx_listobject10;
    public TextView tx_listobject11;
    public TextView tx_staticlistobject00;
    public TextView tx_staticlistobject01;
    public TextView tx_staticlistobject10;
    public TextView tx_staticlistobject11;

    // listobject-button
    public Button btn_listobject00;
    public Button btn_listobject01;
    public Button btn_listobject10;
    public Button btn_listobject11;
    public Button btn_staticlistobject00;
    public Button btn_staticlistobject01;
    public Button btn_staticlistobject10;
    public Button btn_staticlistobject11;
    // ==========listobject  View End



    // ==========liststring  View Begin
    // liststring-Text
    public TextView tx_liststring00;
    public TextView tx_liststring01;
    public TextView tx_liststring10;
    public TextView tx_liststring11;
    public TextView tx_staticliststring00;
    public TextView tx_staticliststring01;
    public TextView tx_staticliststring10;
    public TextView tx_staticliststring11;

    // liststring-button
    public Button btn_liststring00;
    public Button btn_liststring01;
    public Button btn_liststring10;
    public Button btn_liststring11;
    public Button btn_staticliststring00;
    public Button btn_staticliststring01;
    public Button btn_staticliststring10;
    public Button btn_staticliststring11;
    // ==========liststring  View End




    // ==========mapstring  View Begin
    // mapstring-Text
    public TextView tx_mapstring00;
    public TextView tx_mapstring01;
    public TextView tx_mapstring10;
    public TextView tx_mapstring11;
    public TextView tx_staticmapstring00;
    public TextView tx_staticmapstring01;
    public TextView tx_staticmapstring10;
    public TextView tx_staticmapstring11;

    // mapstring-button
    public Button btn_mapstring00;
    public Button btn_mapstring01;
    public Button btn_mapstring10;
    public Button btn_mapstring11;
    public Button btn_staticmapstring00;
    public Button btn_staticmapstring01;
    public Button btn_staticmapstring10;
    public Button btn_staticmapstring11;
    // ==========mapstring  View End


}
