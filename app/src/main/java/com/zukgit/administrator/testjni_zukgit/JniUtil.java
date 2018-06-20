package com.zukgit.administrator.testjni_zukgit;

import android.content.Context;
import android.util.ArrayMap;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class JniUtil {

    static {
        System.loadLibrary("zukgit");
    }


    //------------------- Object Property
    public Object objectValue;


    public ArrayList<Object> objectListValue;
    public ArrayList<String> stringListValue;

    public ArrayMap<String, String> stringMapValue;

    public Context mContext;

    public JniUtil(Context mContext) {
        this.mContext = mContext;
        booleanValue = false;
        byteValue = 0x02;
        charValue = 'b';
        shortValue = 2;
        intValue = 0;
        longValue = 20000;
        floatValue = 6.28f;
        doubleValue = 6.2883826;
        objectValue = new Object();
        stringValue = new String("JavaValue");
        stringListValue = new ArrayList<String>(10);
        stringMapValue = new ArrayMap<String, String>(10);
        beanObjectValue = new Bean(-1, "object_init");

        listobjectValue = new ArrayList<Bean>();
        for (int i = 0; i < 3; i++) {
            listobjectValue.add(new Bean(i, "test" + i));
        }
        liststringValue = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            listobjectValue.add(new Bean(i, "init_" + i));
        }


        for (int i = 0; i < stringListValue.size(); i++) {
            stringListValue.add("Object String" + i);
        }
        mapstringValue = new ArrayMap<String,Bean>();
        mapstringValue.put("-3",new Bean(-3,"object_init1"));
        mapstringValue.put("-4",new Bean(-4,"object_init2"));

        //mapstringValue.values();//  Collection<Bean>
        //mapstringValue.keySet().iterator(); // Set<String>
        //mapstringValue.entrySet().size();
        //java.util.Set value = mapstringValue.keySet();//Set<String>
        //int length = value.size();

        //mapstringValue.get(new Object ());

        for (int i = 0; i < stringMapValue.size(); i++) {
            stringMapValue.put("" + i, "map" + i);
        }

    }


    //==============================boolean Begin ================================

    public boolean booleanValue;
    public static boolean booleanStaticValue;

    // boolean Native  Method
    public native void booleanNvMethod00();

    public native void booleanNvMethod01(boolean booleanValue);

    public native boolean booleanNvMethod10();

    public native boolean booleanNvMethod11(boolean booleanValue);


    // boolean  Class  Static Method
    public static native void booleanStaticNvMethod00();

    public static native void booleanStaticNvMethod01(boolean booleanValue);

    public static native boolean booleanStaticNvMethod10();

    public static native boolean booleanStaticNvMethod11(boolean booleanValue);

    public void callbyJNIboolean00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIboolean00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIboolean00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIboolean01(boolean booleanValue) {
        android.util.Log.i("zukgit", " callbyJNIboolean01() call by JNI boolean param=" + booleanValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIboolean01() call by JNI boolean param=" + booleanValue, Toast.LENGTH_SHORT).show();
        this.booleanValue = booleanValue;
    }

    public boolean callbyJNIboolean10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIboolean10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIboolean10() call by JNI", Toast.LENGTH_SHORT).show();
        this.booleanValue = true;
        return this.booleanValue;
    }

    public boolean callbyJNIboolean11(boolean booleanValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIboolean10() call by JNI boolean param= " + booleanValue);
        android.util.Log.i("zukgit", "Java@@callbyJNIboolean10() call by JNI booleanValue= " + this.booleanValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIboolean11() call by JNI boolean param=" + booleanValue, Toast.LENGTH_SHORT).show();
        this.booleanValue = booleanValue;
        return this.booleanValue;
    }


    public static void callbyJNIStaticboolean00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticboolean00() call by JNIStatic ");
    }

    public static void callbyJNIStaticboolean01(boolean booleanValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticboolean01() call by JNIStatic boolean param=" + booleanValue);

        booleanStaticValue = booleanValue;
    }

    public static boolean callbyJNIStaticboolean10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticboolean10() call by JNIStatic booleanStaticValue=" + booleanStaticValue);
        booleanStaticValue = false;
        return booleanStaticValue;
    }

    public static boolean callbyJNIStaticboolean11(boolean booleanValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticboolean11() call by JNIStatic param booleanValue =" + booleanValue);
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticboolean11() call by JNIStatic booleanStaticValue =" + booleanStaticValue);
        booleanStaticValue = booleanValue;
        return booleanStaticValue;
    }

    //==============================boolean End ================================


    //==============================byte Begin ================================

    public byte byteValue;
    public static byte byteStaticValue;

    // byte Native  Method
    public native void byteNvMethod00();

    public native void byteNvMethod01(byte byteValue);

    public native byte byteNvMethod10();

    public native byte byteNvMethod11(byte byteValue);


    // byte  Class  Static Method
    public static native void byteStaticNvMethod00();

    public static native void byteStaticNvMethod01(byte byteValue);

    public static native byte byteStaticNvMethod10();

    public static native byte byteStaticNvMethod11(byte byteValue);

    public void callbyJNIbyte00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIbyte00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbyte00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIbyte01(byte byteValue) {
        android.util.Log.i("zukgit", " callbyJNIbyte01() call by JNI byte param=" + "0x" + Integer.toHexString((byteValue & 0xFF)));
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIbyte01() call by JNI byte param=" + "0x" + Integer.toHexString((byteValue & 0xFF)), Toast.LENGTH_SHORT).show();
        this.byteValue = byteValue;
    }

    public byte callbyJNIbyte10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIbyte10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbyte10() call by JNI", Toast.LENGTH_SHORT).show();
        this.byteValue = (byte) 0x2F;
        return this.byteValue;
    }

    public byte callbyJNIbyte11(byte byteValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIbyte10() call by JNI byte param= " + "0x" + Integer.toHexString((byteValue & 0xFF)));
        android.util.Log.i("zukgit", "Java@@callbyJNIbyte10() call by JNI byteValue= " + "0x" + Integer.toHexString((this.byteValue & 0xFF)));
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbyte11() call by JNI byte param=" + "0x" + Integer.toHexString((byteValue & 0xFF)), Toast.LENGTH_SHORT).show();
        this.byteValue = byteValue;
        return this.byteValue;
    }


    public static void callbyJNIStaticbyte00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticbyte00() call by JNIStatic ");
    }

    public static void callbyJNIStaticbyte01(byte byteValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticbyte01() call by JNIStatic byte param=" + "0x" + Integer.toHexString((byteValue & 0xFF)));

        byteStaticValue = byteValue;
    }

    public static byte callbyJNIStaticbyte10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbyte10() call by JNIStatic byteStaticValue=" + "0x" + Integer.toHexString((byteStaticValue & 0xFF)));
        byteStaticValue = (byte) 0x0A;
        return byteStaticValue;
    }

    public static byte callbyJNIStaticbyte11(byte byteValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbyte11() call by JNIStatic param byteValue =" + "0x" + Integer.toHexString((byteValue & 0xFF)));
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbyte11() call by JNIStatic byteStaticValue =" + "0x" + Integer.toHexString((byteStaticValue & 0xFF)));
        byteStaticValue = byteValue;
        return byteStaticValue;
    }


    //==============================byte End ================================

    //==============================char Begin ================================

    public char charValue;
    public static char charStaticValue;

    // char Native  Method
    public native void charNvMethod00();

    public native void charNvMethod01(char charValue);

    public native char charNvMethod10();

    public native char charNvMethod11(char charValue);


    // char  Class  Static Method
    public static native void charStaticNvMethod00();

    public static native void charStaticNvMethod01(char charValue);

    public static native char charStaticNvMethod10();

    public static native char charStaticNvMethod11(char charValue);

    public void callbyJNIchar00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIchar00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIchar00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIchar01(char charValue) {
        android.util.Log.i("zukgit", " callbyJNIchar01() call by JNI char param=" + charValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIchar01() call by JNI char param=" + charValue, Toast.LENGTH_SHORT).show();
        this.charValue = charValue;
    }

    public char callbyJNIchar10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIchar10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIchar10() call by JNI", Toast.LENGTH_SHORT).show();
        this.charValue = 'H';
        return this.charValue;
    }

    public char callbyJNIchar11(char charValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIchar10() call by JNI char param= " + charValue);
        android.util.Log.i("zukgit", "Java@@callbyJNIchar10() call by JNI charValue= " + this.charValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIchar11() call by JNI char param=" + charValue, Toast.LENGTH_SHORT).show();
        this.charValue = charValue;
        return this.charValue;
    }


    public static void callbyJNIStaticchar00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticchar00() call by JNIStatic ");
    }

    public static void callbyJNIStaticchar01(char charValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticchar01() call by JNIStatic char param=" + charValue);

        charStaticValue = charValue;
    }

    public static char callbyJNIStaticchar10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticchar10() call by JNIStatic charStaticValue=" + charStaticValue);
        charStaticValue = 'Z';
        return charStaticValue;
    }

    public static char callbyJNIStaticchar11(char charValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticchar11() call by JNIStatic param charValue =" + charValue);
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticchar11() call by JNIStatic charStaticValue =" + charStaticValue);
        charStaticValue = charValue;
        return charStaticValue;
    }


    //==============================char End ================================

    //==============================short Begin ================================

    public short shortValue;
    public static short shortStaticValue;

    // short Native  Method
    public native void shortNvMethod00();

    public native void shortNvMethod01(short shortValue);

    public native short shortNvMethod10();

    public native short shortNvMethod11(short shortValue);


    // short  Class  Static Method
    public static native void shortStaticNvMethod00();

    public static native void shortStaticNvMethod01(short shortValue);

    public static native short shortStaticNvMethod10();

    public static native short shortStaticNvMethod11(short shortValue);

    public void callbyJNIshort00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIshort00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIshort00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIshort01(short shortValue) {
        android.util.Log.i("zukgit", " callbyJNIshort01() call by JNI short param=" + shortValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIshort01() call by JNI short param=" + shortValue, Toast.LENGTH_SHORT).show();
        this.shortValue = shortValue;
    }

    public short callbyJNIshort10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIshort10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIshort10() call by JNI", Toast.LENGTH_SHORT).show();
        return (short) (this.shortValue + 10);
    }

    public short callbyJNIshort11(short shortValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIshort10() call by JNI short param= " + shortValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIshort11() call by JNI short param=" + shortValue, Toast.LENGTH_SHORT).show();
        short value = (short) (shortValue + this.shortValue);
        return value;
    }


    public static void callbyJNIStaticshort00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticshort00() call by JNIStatic ");
    }

    public static void callbyJNIStaticshort01(short shortValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticshort01() call by JNIStatic short param=" + shortValue);

        shortStaticValue = shortValue;
    }

    public static short callbyJNIStaticshort10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticshort10() call by JNIStatic");
        shortStaticValue = (short) (shortStaticValue + 11);
        return shortStaticValue;
    }

    public static short callbyJNIStaticshort11(short shortValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticshort11() call by JNIStatic");
        return (short) (shortValue + shortStaticValue);
    }


    //==============================short End ================================


    //==============================int Begin ================================

    public int intValue;
    public static int intStaticValue;

    // int Native  Method
    public native void intNvMethod00();

    public native void intNvMethod01(int intValue);

    public native int intNvMethod10();

    public native int intNvMethod11(int intValue);


    // int  Class  Static Method
    public static native void intStaticNvMethod00();

    public static native void intStaticNvMethod01(int intValue);

    public static native int intStaticNvMethod10();

    public static native int intStaticNvMethod11(int intValue);

    public void callbyJNIint00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIint00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIint00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIint01(int intValue) {
        android.util.Log.i("zukgit", " callbyJNIint01() call by JNI int param=" + intValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIint01() call by JNI int param=" + intValue, Toast.LENGTH_SHORT).show();
        this.intValue = intValue;
    }

    public int callbyJNIint10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIint10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIint10() call by JNI", Toast.LENGTH_SHORT).show();
        return this.intValue + 100;
    }

    public int callbyJNIint11(int intValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIint10() call by JNI int param= " + intValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIint11() call by JNI int param=" + intValue, Toast.LENGTH_SHORT).show();
        int value = intValue + this.intValue;
        return value;
    }


    public static void callbyJNIStaticint00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticint00() call by JNIStatic ");
    }

    public static void callbyJNIStaticint01(int intValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticint01() call by JNIStatic int param=" + intValue);

        intStaticValue = intValue;
    }

    public static int callbyJNIStaticint10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticint10() call by JNIStatic");
        intStaticValue = intStaticValue + 100;
        return intStaticValue;
    }

    public static int callbyJNIStaticint11(int intValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticint11() call by JNIStatic");
        return intValue + intStaticValue;
    }


    //==============================int End ================================


    //==============================long Begin ================================

    public long longValue;
    public static long longStaticValue;

    // long Native  Method
    public native void longNvMethod00();

    public native void longNvMethod01(long longValue);

    public native long longNvMethod10();

    public native long longNvMethod11(long longValue);


    // long  Class  Static Method
    public static native void longStaticNvMethod00();

    public static native void longStaticNvMethod01(long longValue);

    public static native long longStaticNvMethod10();

    public static native long longStaticNvMethod11(long longValue);

    public void callbyJNIlong00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIlong00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlong00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIlong01(long longValue) {
        android.util.Log.i("zukgit", " callbyJNIlong01() call by JNI long param=" + longValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIlong01() call by JNI long param=" + longValue, Toast.LENGTH_SHORT).show();
        this.longValue = longValue;
    }

    public long callbyJNIlong10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIlong10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlong10() call by JNI", Toast.LENGTH_SHORT).show();
        return this.longValue + 100;
    }

    public long callbyJNIlong11(long longValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIlong10() call by JNI long param= " + longValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlong11() call by JNI long param=" + longValue, Toast.LENGTH_SHORT).show();
        long value = longValue + this.longValue;
        return value;
    }


    public static void callbyJNIStaticlong00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticlong00() call by JNIStatic ");
    }

    public static void callbyJNIStaticlong01(long longValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticlong01() call by JNIStatic long param=" + longValue);

        longStaticValue = longValue;
    }

    public static long callbyJNIStaticlong10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticlong10() call by JNIStatic");
        longStaticValue = longStaticValue + 100;
        return longStaticValue;
    }

    public static long callbyJNIStaticlong11(long longValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticlong11() call by JNIStatic");
        return longValue + longStaticValue;
    }


    //==============================long End ================================

    //==============================float Begin ================================

    public float floatValue;
    public static float floatStaticValue;

    // float Native  Method
    public native void floatNvMethod00();

    public native void floatNvMethod01(float floatValue);

    public native float floatNvMethod10();

    public native float floatNvMethod11(float floatValue);


    // float  Class  Static Method
    public static native void floatStaticNvMethod00();

    public static native void floatStaticNvMethod01(float floatValue);

    public static native float floatStaticNvMethod10();

    public static native float floatStaticNvMethod11(float floatValue);

    public void callbyJNIfloat00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIfloat00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIfloat00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIfloat01(float floatValue) {
        android.util.Log.i("zukgit", " callbyJNIfloat01() call by JNI float param=" + floatValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIfloat01() call by JNI float param=" + floatValue, Toast.LENGTH_SHORT).show();
        this.floatValue = floatValue;
    }

    public float callbyJNIfloat10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIfloat10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIfloat10() call by JNI", Toast.LENGTH_SHORT).show();
        return this.floatValue + 100;
    }

    public float callbyJNIfloat11(float floatValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIfloat10() call by JNI float param= " + floatValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIfloat11() call by JNI float param=" + floatValue, Toast.LENGTH_SHORT).show();
        float value = floatValue + this.floatValue;
        return value;
    }


    public static void callbyJNIStaticfloat00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticfloat00() call by JNIStatic ");
    }

    public static void callbyJNIStaticfloat01(float floatValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticfloat01() call by JNIStatic float param=" + floatValue);

        floatStaticValue = floatValue;
    }

    public static float callbyJNIStaticfloat10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticfloat10() call by JNIStatic");
        floatStaticValue = floatStaticValue + 100;
        return floatStaticValue;
    }

    public static float callbyJNIStaticfloat11(float floatValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticfloat11() call by JNIStatic");
        return floatValue + floatStaticValue;
    }


    //==============================float End ================================

    //==============================double Begin ================================

    public double doubleValue;
    public static double doubleStaticValue;

    // double Native  Method
    public native void doubleNvMethod00();

    public native void doubleNvMethod01(double doubleValue);

    public native double doubleNvMethod10();

    public native double doubleNvMethod11(double doubleValue);


    // double  Class  Static Method
    public static native void doubleStaticNvMethod00();

    public static native void doubleStaticNvMethod01(double doubleValue);

    public static native double doubleStaticNvMethod10();

    public static native double doubleStaticNvMethod11(double doubleValue);

    public void callbyJNIdouble00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIdouble00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIdouble00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIdouble01(double doubleValue) {
        android.util.Log.i("zukgit", " callbyJNIdouble01() call by JNI double param=" + doubleValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIdouble01() call by JNI double param=" + doubleValue, Toast.LENGTH_SHORT).show();
        this.doubleValue = doubleValue;
    }

    public double callbyJNIdouble10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIdouble10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIdouble10() call by JNI", Toast.LENGTH_SHORT).show();
        return this.doubleValue + 100;
    }

    public double callbyJNIdouble11(double doubleValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIdouble10() call by JNI double param= " + doubleValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIdouble11() call by JNI double param=" + doubleValue, Toast.LENGTH_SHORT).show();
        double value = doubleValue + this.doubleValue;
        return value;
    }


    public static void callbyJNIStaticdouble00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticdouble00() call by JNIStatic ");
    }

    public static void callbyJNIStaticdouble01(double doubleValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticdouble01() call by JNIStatic double param=" + doubleValue);

        doubleStaticValue = doubleValue;
    }

    public static double callbyJNIStaticdouble10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticdouble10() call by JNIStatic");
        doubleStaticValue = doubleStaticValue + 100;
        return doubleStaticValue;
    }

    public static double callbyJNIStaticdouble11(double doubleValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticdouble11() call by JNIStatic");
        return doubleValue + doubleStaticValue;
    }


    //==============================double End ================================


    //==============================Bean Object Begin ================================

    public Bean beanObjectValue;


    public static Bean beanObjectStaticValue;


    static {
        beanObjectStaticValue = new Bean(-1, "static-init");
    }

    // BeanNative  Method
    public native void beanObjectNvMethod00();

    public native void beanObjectNvMethod01(Bean ObjectValue);

    public native Bean beanObjectNvMethod10();

    public native Bean beanObjectNvMethod11(Bean ObjectValue);


    // Bean Class  Static Method
    public static native void beanObjectStaticNvMethod00();

    public static native void beanObjectStaticNvMethod01(Bean ObjectValue);

    public static native Bean beanObjectStaticNvMethod10();

    public static native Bean beanObjectStaticNvMethod11(Bean ObjectValue);

    public void callbyJNIbeanObject00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIbeanObject00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbeanObject00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIbeanObject01(Bean ObjectValue) {
        android.util.Log.i("zukgit", " callbyJNIbeanObject01() call by JNI Beanparam=" + beanObjectValue);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIbeanObject01() call by JNI Beanparam=" + beanObjectValue, Toast.LENGTH_SHORT).show();
        this.beanObjectValue = ObjectValue;
    }

    public Bean callbyJNIbeanObject10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIbeanObject10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbeanObject10() call by JNI", Toast.LENGTH_SHORT).show();
        beanObjectValue = new Bean(300, "JUtil-define");
        return this.beanObjectValue;
    }

    public Bean callbyJNIbeanObject11(Bean ObjectValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIbeanObject10() call by JNI Beanparam= " + beanObjectValue);
        android.util.Log.i("zukgit", "Java@@callbyJNIbeanObject10() call by JNI beanObjectValue= " + this.beanObjectValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIbeanObject11() call by JNI Beanparam=" + beanObjectValue, Toast.LENGTH_SHORT).show();
        ObjectValue.str = "JNI_int$java-Str";
        this.beanObjectValue = ObjectValue;
        return this.beanObjectValue;
    }


    public static void callbyJNIStaticbeanObject00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticbeanObject00() call by JNIStatic ");
    }

    public static void callbyJNIStaticbeanObject01(Bean ObjectValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticbeanObject01() call by JNIStatic Beanparam=" + ObjectValue);

        beanObjectStaticValue = ObjectValue;
    }

    public static Bean callbyJNIStaticbeanObject10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbeanObject10() call by JNIStatic beanObjectStaticValue=" + beanObjectStaticValue);
        beanObjectStaticValue = new Bean(666, "StaticbeanObject10");
        return beanObjectStaticValue;
    }

    public static Bean callbyJNIStaticbeanObject11(Bean ObjectValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbeanObject11() call by JNIStatic param beanObjectValue =" + ObjectValue);
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbeanObject11() call by JNIStatic beanObjectStaticValue =" + beanObjectStaticValue);
        ObjectValue.str = "static-callbyJNIStaticbeanObject11";
        beanObjectStaticValue = ObjectValue;
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticbeanObject11() call by JNIStatic beanObjectStaticValue =" + beanObjectStaticValue);
        return beanObjectStaticValue;
    }


    public Bean getBeanObjectValue() {
        return beanObjectValue;
    }

    public void setBeanObjectValue(Bean beanObjectValue) {
        this.beanObjectValue = beanObjectValue;
    }

    public static Bean getBeanObjectStaticValue() {
        return beanObjectStaticValue;
    }

    public static void setBeanObjectStaticValue(Bean beanObjectStaticValue) {
        JniUtil.beanObjectStaticValue = beanObjectStaticValue;
    }

    //==============================Bean End ================================


//==============================String Begin ================================

    public String stringValue;
    public static String stringStaticValue;

    // String Native  Object Method
    public native void stringNvMethod00();

    public native void stringNvMethod01(String str);

    public native String stringNvMethod10();

    public native String stringNvMethod11(String str);


    // String Native Class Method
    public static native void stringStaticNvMethod00();

    public static native void stringStaticNvMethod01(String str);

    public static native String stringStaticNvMethod10();

    public static native String stringStaticNvMethod11(String str);

    public void callbyJNIString00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIString00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIString01(String str) {
        android.util.Log.i("zukgit", " callbyJNIString01() call by JNI param=" + str);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIString01() call by JNI param=" + str, Toast.LENGTH_SHORT).show();
        stringValue = str;
    }

    public String callbyJNIString10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIString10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString10() call by JNI", Toast.LENGTH_SHORT).show();
        return "callbyJNIString10() call by JNI";
    }

    public String callbyJNIString11(String str) {
        android.util.Log.i("zukgit", "Java@@callbyJNIString10() call by JNI " + str);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString11() call by JNI param=" + str, Toast.LENGTH_SHORT).show();
        String value = str + " callbyJNIString11()";
        return value;
    }


    public static void callbyJNIStaticString00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticString00() call by JNIStatic ");
    }

    public static void callbyJNIStaticString01(String str) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticString01() call by JNIStatic param=\"+jmChar");

        stringStaticValue = str;
    }

    public static String callbyJNIStaticString10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticString10() call by JNIStatic");
        return "callbyJNIStaticString10() call by JNIStatic";
    }

    public static String callbyJNIStaticString11(String str) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticString11() call by JNIStatic");
        return str + "callbyJNIStaticString11()";
    }


    //==============================String End ================================


    //==============================ArrayList<Bean> Begin ================================


    public ArrayList<Bean> listobjectValue;
    public static ArrayList<Bean> listobjectStaticValue;

    static {

        listobjectStaticValue = new ArrayList<Bean>();
        listobjectStaticValue.add(new Bean(1, "static_1"));
        listobjectStaticValue.add(new Bean(2, "static_2"));
    }


    public ArrayList<Bean> getListobjectValue() {
        return listobjectValue;
    }

    public void setListobjectValue(ArrayList<Bean> listobjectValue) {
        this.listobjectValue = listobjectValue;
    }

    public static ArrayList<Bean> getListobjectStaticValue() {
        return listobjectStaticValue;
    }

    public static void setListobjectStaticValue(ArrayList<Bean> listobjectStaticValue) {
        JniUtil.listobjectStaticValue = listobjectStaticValue;
    }

    // listobject Native  Method
    public native void listobjectNvMethod00();

    public native void listobjectNvMethod01(ArrayList<Bean> listobjectValue);

    public native ArrayList<Bean> listobjectNvMethod10();

    public native ArrayList<Bean> listobjectNvMethod11(ArrayList<Bean> listobjectValue);


    // ArrayList<Bean> listobject  Class  Static Method
    public static native void listobjectStaticNvMethod00();

    public static native void listobjectStaticNvMethod01(ArrayList<Bean> listobjectValue);

    public static native ArrayList<Bean> listobjectStaticNvMethod10();

    public static native ArrayList<Bean> listobjectStaticNvMethod11(ArrayList<Bean> listobjectValue);

    public void callbyJNIlistobject00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIlistobject00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlistobject00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIlistobject01(ArrayList<Bean> listobjectValue) {
        android.util.Log.i("zukgit", " callbyJNIlistobject01() call by JNI listobject param=" + Arrays.toString(listobjectValue.toArray()));
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIlistobject01() call by JNI listobject param=" + listobjectValue, Toast.LENGTH_SHORT).show();
        //this.listobjectValue = listobjectValue;
    }

    public ArrayList<Bean> callbyJNIlistobject10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIlistobject10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlistobject10() call by JNI", Toast.LENGTH_SHORT).show();
        this.listobjectValue = new ArrayList<Bean>();
        this.listobjectValue.add(new Bean(101, "callbyJNIlistobject101"));
        this.listobjectValue.add(new Bean(102, "callbyJNIlistobject102"));
        this.listobjectValue.add(new Bean(103, "callbyJNIlistobject103"));

        return this.listobjectValue;
    }

    public ArrayList<Bean> callbyJNIlistobject11(ArrayList<Bean> listobjectValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIlistobject10() call by JNI listobject param= " + listobjectValue);
        android.util.Log.i("zukgit", "Java@@callbyJNIlistobject10() call by JNI listobjectValue= " + this.listobjectValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIlistobject11() call by JNI listobject param=" + listobjectValue, Toast.LENGTH_SHORT).show();

        if (listobjectValue != null) {

            listobjectValue.add(new Bean(2001, "java_define"));
            listobjectValue.add(new Bean(2002, "java_define"));
        }
        this.listobjectValue = listobjectValue;
        return this.listobjectValue;
    }


    public static void callbyJNIStaticlistobject00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticlistobject00() call by JNIStatic ");
    }

    public static void callbyJNIStaticlistobject01(ArrayList<Bean> listobjectValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticlistobject01() call by JNIStatic listobject param=" + listobjectValue);

        listobjectStaticValue = listobjectValue;
    }

    public static ArrayList<Bean> callbyJNIStaticlistobject10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticlistobject10() call by JNIStatic listobjectStaticValue=" + listobjectStaticValue);
        listobjectStaticValue = new ArrayList<Bean>();
        listobjectStaticValue.add(new Bean(1, "callbyJNI_Static_one"));
        listobjectStaticValue.add(new Bean(2, "callbyJNI_Static_two"));
        listobjectStaticValue.add(new Bean(10, "callbyJNI_Static_ten"));
        return listobjectStaticValue;
    }

    public static ArrayList<Bean> callbyJNIStaticlistobject11(ArrayList<Bean> listobjectValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticlistobject11() call by JNIStatic param listobjectValue =" + listobjectValue);
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticlistobject11() call by JNIStatic listobjectStaticValue =" + listobjectStaticValue);

        if (listobjectValue != null) {

            listobjectValue.add(new Bean(2001, "java_static_define"));
            listobjectValue.add(new Bean(2002, "java_static_define"));
        }
        listobjectStaticValue = listobjectValue;
        return listobjectStaticValue;
    }

    //==============================listobject End ================================

    //==============================ArrayList<String> Begin ================================


    public ArrayList<String> liststringValue;
    public static ArrayList<String> liststringStaticValue;

    static {

        liststringStaticValue = new ArrayList<String>();
        liststringStaticValue.add(new String("staticString_1"));
        liststringStaticValue.add(new String("staticString_2"));
    }


    public ArrayList<String> getliststringValue() {
        return liststringValue;
    }

    public void setliststringValue(ArrayList<String> liststringValue) {
        this.liststringValue = liststringValue;
    }

    public static ArrayList<String> getliststringStaticValue() {
        return liststringStaticValue;
    }

    public static void setliststringStaticValue(ArrayList<String> liststringStaticValue) {
        JniUtil.liststringStaticValue = liststringStaticValue;
    }

    // liststring Native  Method
    public native void liststringNvMethod00();

    public native void liststringNvMethod01(ArrayList<String> liststringValue);

    public native ArrayList<String> liststringNvMethod10();

    public native ArrayList<String> liststringNvMethod11(ArrayList<String> liststringValue);


    // ArrayList<String> liststring  Class  Static Method
    public static native void liststringStaticNvMethod00();

    public static native void liststringStaticNvMethod01(ArrayList<String> liststringValue);

    public static native ArrayList<String> liststringStaticNvMethod10();

    public static native ArrayList<String> liststringStaticNvMethod11(ArrayList<String> liststringValue);

    public void callbyJNIliststring00() {
        android.util.Log.i("zukgit", " Java@@callbyJNIliststring00() call by JNI =" + Arrays.toString(liststringValue.toArray()));
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIliststring00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIliststring01(ArrayList<String> liststringValue) {
        android.util.Log.i("zukgit", " callbyJNIliststring01() call by JNI liststring param=" + Arrays.toString(liststringValue.toArray()));
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIliststring01() call by JNI liststring param=" + liststringValue, Toast.LENGTH_SHORT).show();
        if (liststringValue != null) {
            liststringValue.add("java_add_01");
            liststringValue.add("java_add_02");
        }
        //this.liststringValue = liststringValue;
    }

    public ArrayList<String> callbyJNIliststring10() {
        android.util.Log.i("zukgit", "Java@@callbyJNIliststring10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIliststring10() call by JNI", Toast.LENGTH_SHORT).show();
        this.liststringValue = new ArrayList<String>();
        this.liststringValue.add(new String("callbyJNIliststring101"));
        this.liststringValue.add(new String("callbyJNIliststring102"));
        this.liststringValue.add(new String("callbyJNIliststring103"));

        return this.liststringValue;
    }

    public ArrayList<String> callbyJNIliststring11(ArrayList<String> liststringValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIliststring10() call by JNI liststring param= " + liststringValue);
        android.util.Log.i("zukgit", "Java@@callbyJNIliststring10() call by JNI liststringValue= " + this.liststringValue);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIliststring11() call by JNI liststring param=" + liststringValue, Toast.LENGTH_SHORT).show();

        if (liststringValue != null) {

            liststringValue.add(new String("java11_define1"));
            liststringValue.add(new String("java11_define2"));
        }
        this.liststringValue = liststringValue;
        return this.liststringValue;
    }


    public static void callbyJNIStaticliststring00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticliststring00() call by JNIStatic ");
    }

    public static void callbyJNIStaticliststring01(ArrayList<String> liststringValue) {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticliststring01() call by JNIStatic liststring param=" + liststringValue);
        if (liststringValue != null) {
            liststringValue.add("Java-define mtehod-callbyJNIStaticliststring01_1");
            liststringValue.add("Java-define mtehod-callbyJNIStaticliststring01_2");
        }
        liststringStaticValue = liststringValue;
    }

    public static ArrayList<String> callbyJNIStaticliststring10() {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticliststring10() call by JNIStatic liststringStaticValue=" + liststringStaticValue);
        liststringStaticValue = new ArrayList<String>();
        liststringStaticValue.add(new String("callbyJNImethod10_Static_one"));
        liststringStaticValue.add(new String("callbyJNImethod10_Static_two"));
        liststringStaticValue.add(new String("callbyJNImethod10_Static_ten"));
        return liststringStaticValue;
    }

    public static ArrayList<String> callbyJNIStaticliststring11(ArrayList<String> liststringValue) {
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticliststring11() call by JNIStatic param liststringValue =" + liststringValue);
        android.util.Log.i("zukgit", " Java@@callbyJNIStaticliststring11() call by JNIStatic liststringStaticValue =" + liststringStaticValue);

        if (liststringValue != null) {

            liststringValue.add(new String("java_static11_define1"));
            liststringValue.add(new String("java_static11_define2"));
        }
        liststringStaticValue = liststringValue;
        return liststringStaticValue;
    }
    //==============================ArrayList<String> End ================================


    //==============================ArrayMap<String,Bean> Begin ================================


    public ArrayMap<String,Bean> mapstringValue;
    public static ArrayMap<String,Bean> mapstringStaticValue;

    static {

        mapstringStaticValue = new ArrayMap<String,Bean>();
        mapstringStaticValue.put(new String("-1"),new Bean(-1,"static_init"));
        mapstringStaticValue.put(new String("-2"),new Bean(-2,"static_init"));
    }


    public ArrayMap<String,Bean> getmapstringValue() {
        return mapstringValue;
    }

    public void setmapstringValue(ArrayMap<String,Bean> mapstringValue) {
        this.mapstringValue = mapstringValue;
    }

    public static ArrayMap<String,Bean> getmapstringStaticValue() {
        return mapstringStaticValue;
    }

    public static void setmapstringStaticValue(ArrayMap<String,Bean> mapstringStaticValue) {
        JniUtil.mapstringStaticValue = mapstringStaticValue;
    }

    // liststring Native  Method
    public native void mapstringNvMethod00();

    public native void mapstringNvMethod01(ArrayMap<String,Bean> mapstringValue);

    public native ArrayMap<String,Bean> mapstringNvMethod10();

    public native ArrayMap<String,Bean> mapstringNvMethod11(ArrayMap<String,Bean> mapstringValue);


    // ArrayMap<String,Bean> mapstring  Class  Static Method
    public static native void mapstringStaticNvMethod00();

    public static native void mapstringStaticNvMethod01(ArrayMap<String,Bean> mapstringValue);

    public static native ArrayMap<String,Bean> mapstringStaticNvMethod10();

    public static native ArrayMap<String,Bean> mapstringStaticNvMethod11(ArrayMap<String,Bean> mapstringValue);

    public void callbyJNImapstring00() {
        android.util.Log.i("zukgit", " Java@@callbyJNImapstring00() call by JNI =" + toArrayMapString(mapstringValue));
        Toast.makeText(mContext.getApplicationContext(), "callbyJNImapstring00() call by JNI"+ toArrayMapString(mapstringValue), Toast.LENGTH_SHORT).show();
    }


    public void callbyJNImapstring01(ArrayMap<String,Bean> mapstringValue) {
        android.util.Log.i("zukgit", " callbyJNImapstring01() call by JNI mapstring param=" + toArrayMapString(mapstringValue));
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNImapstring01() call by JNI mapstring param=" + toArrayMapString(mapstringValue), Toast.LENGTH_SHORT).show();
        if (mapstringValue != null) {
            mapstringValue.put(new String("01_object_1"),new Bean(1,"callbyJNImapstring01_add"));
            mapstringValue.put(new String("01_object_2"),new Bean(2,"callbyJNImapstring01_add"));
        }
        this.mapstringValue = mapstringValue;
    }

    public ArrayMap<String,Bean> callbyJNImapstring10() {
        android.util.Log.i("zukgit", "Java@@callbyJNImapstring10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNImapstring10() call by JNI", Toast.LENGTH_SHORT).show();
        this.mapstringValue = new ArrayMap<String,Bean>();
        this.mapstringValue.put(new String("10_object_1"),new Bean(1,"callbyJNImapstring10_add"));
        this.mapstringValue.put(new String("10_object_2"),new Bean(2,"callbyJNImapstring10_add"));
        return this.mapstringValue;
    }

    public ArrayMap<String,Bean> callbyJNImapstring11(ArrayMap<String,Bean> mapstringValueMap) {
        android.util.Log.i("zukgit", "Java@@callbyJNImapstring10() call by JNI mapstring param= " + toArrayMapString(mapstringValueMap));


        if (mapstringValueMap != null) {

            mapstringValueMap.put(new String("11_object_1"),new Bean(1,"callbyJNImapstring11_add"));
            mapstringValueMap.put(new String("11_object_2"),new Bean(2,"callbyJNImapstring11_add"));
        }
        this.mapstringValue = mapstringValueMap;
        Toast.makeText(mContext.getApplicationContext(), "callbyJNImapstring11() call by JNI mapstring param=" + toArrayMapString(mapstringValueMap), Toast.LENGTH_SHORT).show();

        return this.mapstringValue;
    }


    public static void callbyJNIStaticmapstring00() {

        android.util.Log.i("zukgit", "Java@@callbyJNIStaticmapstring00() call by JNIStatic ");
    }

    public static void callbyJNIStaticmapstring01(ArrayMap<String,Bean> mapstringValue) {


        if (mapstringValue != null) {
            mapstringValue.put(new String("01_static_1_s"),new Bean(1,"callbyJNImapstring01_static_add"));
            mapstringValue.put(new String("01_static_2_s"),new Bean(2,"callbyJNImapstring01_static_add"));
        }
        mapstringStaticValue = mapstringValue;
        android.util.Log.i("zukgit", "Java@@callbyJNIStaticmapstring01() call by JNIStatic mapstring param=" + toArrayMapString(mapstringValue));
    }

    public static ArrayMap<String,Bean> callbyJNIStaticmapstring10() {
        android.util.Log.i("zukgit", "Java@@callbyJNImapstring10() call by JNI ");
        mapstringStaticValue = new ArrayMap<String,Bean>();
        mapstringStaticValue.put(new String("10_static_1"),new Bean(1,"callbyJNImapstring10_static_add"));
        mapstringStaticValue.put(new String("10_static_2"),new Bean(2,"callbyJNImapstring10_static_add"));
        return mapstringStaticValue;
    }

    public static ArrayMap<String,Bean> callbyJNIStaticmapstring11(ArrayMap<String,Bean> mapstringValue) {
        android.util.Log.i("zukgit", "Java@@callbyJNIStaticmapstring11() call by JNI ");

        if (mapstringValue != null) {

            mapstringValue.put(new String("11_staic_1"),new Bean(1,"callbyJNImapstring11_staic_add"));
            mapstringValue.put(new String("11_staic_2"),new Bean(2,"callbyJNImapstring11_staic_add"));
        }
        mapstringStaticValue = mapstringValue;
        return mapstringStaticValue;
    }
    //==============================ArrayMap<String,Bean> End ================================





    //-------------------Object Property Getter and Setter


    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue = floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public ArrayList<String> getStringListValue() {
        return stringListValue;
    }

    public void setStringListValue(ArrayList<String> stringListValue) {
        this.stringListValue = stringListValue;
    }

    public ArrayList<Object> getObjectListValue() {
        return objectListValue;
    }

    public void setObjectListValue(ArrayList<Object> objectListValue) {
        this.objectListValue = objectListValue;
    }


    public static void setObjectListStaticValue(ArrayList<Object> objectListStaticValue) {
        JniUtil.objectListStaticValue = objectListStaticValue;
    }

    public ArrayMap<String, String> getStringMapValue() {
        return stringMapValue;
    }

    public void setStringMapValue(ArrayMap<String, String> stringMapValue) {
        this.stringMapValue = stringMapValue;
    }


    //----------------------- Object Native  Method
    public native void voidNvMethod();

    public native boolean booleanNvMethod();

    public native byte byteNvMethod();

    public native char charNvMethod();

    public native short shortNvMethod();

    public native int intNvMethod();

    public native long longNvMethod();

    public native float floatNvMethod();

    public native double doubleNvMethod();


    public native boolean[] booleanArrayNvMethod();

    public native byte[] byteArrayNvMethod();

    public native char[] charArrayNvMethod();

    public native short[] shortArrayNvMethod();

    public native int[] intArrayNvMethod();

    public native long[] longArrayNvMethod();

    public native float[] floatArrayNvMethod();

    public native double[] doubleArrayNvMethod();


    public native Object objectNvMethod();


    public native ArrayList<String> stringListNvMethod();

    public native ArrayList<Object> objectListNvMethod();


    public native ArrayMap<String, String> stringMapNvMethod();


    public native void allNvMethod(
            boolean booleanValue, byte byteValue, char charValue, short shortValue, int intValue,
            long longValue, float floatValue, double doubleValue,
            ArrayList<Object> objectListValue, ArrayList<String> stringListValue, ArrayMap<String, String> stringMapValue);
    //========================Object End===================================


    //========================Class Begin===================================

    //------------------- Class Property


    public static Object objectStaticValue;


    public static ArrayList<String> stringListStaticValue;
    public static ArrayList<Object> objectListStaticValue;
    public static ArrayMap<String, String> stringMapStaticValue;


    static {
        booleanStaticValue = true;
        byteStaticValue = 0x01;
        charStaticValue = 'a';
        shortStaticValue = 1;
        intStaticValue = 100;
        longStaticValue = 10000;
        floatStaticValue = 3.14f;
        doubleStaticValue = 3.1415926;
        objectStaticValue = new Object();
        stringStaticValue = new String("Util's Value");
        stringListStaticValue = new ArrayList<String>(10);
        objectListStaticValue = new ArrayList<Object>(10);
        stringMapStaticValue = new ArrayMap<String, String>(10);
        for (int i = 0; i < stringListStaticValue.size(); i++) {
            stringListStaticValue.add("staticString" + i);
        }
        for (int i = 0; i < objectListStaticValue.size(); i++) {
            objectListStaticValue.add(new Bean(i));
        }

        for (int i = 0; i < stringMapStaticValue.size(); i++) {
            stringMapStaticValue.put("" + i, " static-map-value-" + i);
        }

    }

    //-------------------Class Static  Property Getter and Setter

    public static boolean isBooleanStaticValue() {
        return booleanStaticValue;
    }

    public static void setBooleanStaticValue(boolean booleanStaticValue) {
        JniUtil.booleanStaticValue = booleanStaticValue;
    }

    public static byte getByteStaticValue() {
        return byteStaticValue;
    }

    public static void setByteStaticValue(byte byteStaticValue) {
        JniUtil.byteStaticValue = byteStaticValue;
    }

    public static char getCharStaticValue() {
        return charStaticValue;
    }

    public static void setCharStaticValue(char charStaticValue) {
        JniUtil.charStaticValue = charStaticValue;
    }

    public static short getShortStaticValue() {
        return shortStaticValue;
    }

    public static void setShortStaticValue(short shortStaticValue) {
        JniUtil.shortStaticValue = shortStaticValue;
    }

    public static int getIntStaticValue() {
        return intStaticValue;
    }

    public static void setIntStaticValue(int intStaticValue) {
        JniUtil.intStaticValue = intStaticValue;
    }

    public static long getLongStaticValue() {
        return longStaticValue;
    }

    public static void setLongStaticValue(long longStaticValue) {
        JniUtil.longStaticValue = longStaticValue;
    }

    public static float getFloatStaticValue() {
        return floatStaticValue;
    }

    public static void setFloatStaticValue(float floatStaticValue) {
        JniUtil.floatStaticValue = floatStaticValue;
    }

    public static double getDoubleStaticValue() {
        return doubleStaticValue;
    }

    public static void setDoubleStaticValue(double doubleStaticValue) {
        JniUtil.doubleStaticValue = doubleStaticValue;
    }

    public static Object getObjectStaticValue() {
        return objectStaticValue;
    }

    public static void setObjectStaticValue(Object objectStaticValue) {
        JniUtil.objectStaticValue = objectStaticValue;
    }

    public static String getStringStaticValue() {
        return stringStaticValue;
    }

    public static void setStringStaticValue(String stringStaticValue) {
        JniUtil.stringStaticValue = stringStaticValue;
    }

    public static ArrayList<String> getStringListStaticValue() {
        return stringListStaticValue;
    }

    public static void setStringListStaticValue(ArrayList<String> stringListStaticValue) {
        JniUtil.stringListStaticValue = stringListStaticValue;
    }

    public static ArrayList<Object> getObjectListStaticValue() {
        return objectListStaticValue;
    }


    public static ArrayMap<String, String> getStringMapStaticValue() {
        return stringMapStaticValue;
    }

    public static void setStringMapStaticValue(ArrayMap<String, String> stringMapStaticValue) {
        JniUtil.stringMapStaticValue = stringMapStaticValue;
    }

    //------------------- Class Static Native Method

    public static native void voidStaticNvMethod();

    public static native boolean booleanStaticNvMethod();

    public static native byte byteStaticNvMethod();

    public static native char charStaticNvMethod();

    public static native short shortStaticNvMethod();

    public static native int intStaticNvMethod();

    public static native long longStaticNvMethod();

    public static native float floatStaticNvMethod();

    public static native double doubleStaticNvMethod();


    public static native boolean[] booleanArrayStaticNvMethod();

    public static native byte[] byteArrayStaticNvMethod();

    public static native char[] charArrayStaticNvMethod();

    public static native short[] shortArrayStaticNvMethod();

    public static native int[] intArrayStaticNvMethod();

    public static native long[] longArrayStaticNvMethod();

    public static native float[] floatArrayStaticNvMethod();

    public static native double[] doubleArrayStaticNvMethod();


    public static native Object objectStaticNvMethod();


    public static native ArrayList<String> stringListStaticNvMethod();

    public static native ArrayList<Object> objectListStaticNvMethod();

    public static native ArrayMap<String, String> stringMapStaticNvMethod();

    public static native void allStaticNvMethod(
            boolean booleanValue, byte byteValue, char charValue, short shortValue, int intValue,
            long longValue, float floatValue, double doubleValue,
            ArrayList<Object> objectListValue, ArrayList<String> stringListValue, ArrayMap<String, String> stringMapValue);


    public static String toArrayMapString(ArrayMap<String,Bean> mapString) {
        if(mapString == null){

            return "null";
        }
        java.util.Set setIndex =  mapString.keySet();
        java.util.Iterator it = setIndex.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            String indexStr = (String)it.next();
            Bean bean = mapString.get(indexStr);
            int intValue = bean.num;
            String StringValue = bean.str;
            sb.append("{key="+indexStr+",value=Bean(num="+intValue+":str="+StringValue+")}");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "JniUtil{" +

                "booleanValue=" + booleanValue + "\n" +
                "booleanStaticValue=" + booleanStaticValue + "\n" +
                "\n" +
                "byteValue=" + byteValue + "\n" +
                "byteStaticValue=" + byteStaticValue + "\n" +
                "\n" +
                "charValue=" + charValue + "\n" +
                "charStaticValue=" + charStaticValue + "\n" +
                "\n" +
                "shortValue=" + shortValue + "\n" +
                "shortStaticValue=" + shortStaticValue + "\n" +
                "\n" +
                "intValue=" + intValue + "\n" +
                "intStaticValue=" + intStaticValue + "\n" +
                "\n" +
                "longValue=" + longValue + "\n" +
                "longStaticValue=" + longStaticValue + "\n" +
                "\n" +
                "floatValue=" + floatValue + "\n" +
                "floatStaticValue=" + floatStaticValue + "\n" +
                "\n" +
                "doubleValue=" + doubleValue + "\n" +
                "doubleStaticValue=" + doubleStaticValue + "\n" +
                "\n" +
                "stringValue='" + stringValue + "\n" +
                "stringStaticValue='" + stringStaticValue + "\n" +
                "\n" +
                "beanObjectValue=" + beanObjectValue.toString() + "\n" +
                "beanObjectStaticValue=" + beanObjectStaticValue.toString() + "\n" +
                "\n" +
                "listobjectValue=" + Arrays.toString(listobjectValue.toArray()) + "\n" +
                "listobjectStaticValue=" + listobjectStaticValue + "\n" +
                "\n" +
                "stringListValue=" + Arrays.toString(liststringValue.toArray()) + "\n" +
                "stringListStaticValue=" + Arrays.toString(liststringStaticValue.toArray()) + "\n" +
                "\n" +
                "stringMapValue=" + toArrayMapString(mapstringValue) + "\n" +
                "stringMapStaticValue=" + toArrayMapString(mapstringStaticValue) + '\'' +
                '}';
    }


}
