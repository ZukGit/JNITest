package com.zukgit.administrator.testjni_zukgit;

import android.content.Context;
import android.util.ArrayMap;
import android.widget.Toast;

import java.util.ArrayList;


public class JniUtil {

    static {
        System.loadLibrary("zukgit");
    }


    //------------------- Object Property
    public boolean booleanValue;
    public byte byteValue;
    public char charValue;
    public short shortValue;
    public int intValue;
    public long longValue;
    public float floatValue;
    public double doubleValue;
    public Object objectValue;


    public ArrayList<Object> objectListValue;
    public ArrayList<String> stringListValue;

    public ArrayMap<String,String> stringMapValue;

    public Context mContext;
    public    JniUtil(Context mContext){
        this.mContext = mContext;
        booleanValue = false;
        byteValue = 0x02;
        charValue = 'b';
        shortValue = 2;
        intValue = 200;
        longValue = 20000;
        floatValue = 6.28f;
        doubleValue = 6.2883826;
        objectValue = new Object();
        stringValue = new String("JavaValue");
        stringListValue = new  ArrayList<String>(10);
        objectListValue = new  ArrayList<Object>(10);
        stringMapValue =  new ArrayMap<String,String>(10);
        for (int i=0; i < stringListValue.size(); i++){
            stringListValue.add("Object String"+i);
        }
        for (int i=0; i < objectListValue.size(); i++){
            objectListValue.add(new ObjectA(i));
        }

        for (int i=0; i < stringMapValue.size(); i++){
            stringMapValue.put(""+i,"map"+i);
        }


    }

//==============================String Begin ================================

    public String stringValue;
    public static String stringStaticValue;

    // String Native  Object Method
    public native void stringNvMethod00();
    public native void stringNvMethod01( String str);
    public native String stringNvMethod10();
    public native String stringNvMethod11( String str);


    // String Native Class Method
    public static native  void stringStaticNvMethod00();
    public static native void  stringStaticNvMethod01( String str);
    public static native String stringStaticNvMethod10();
    public static native String stringStaticNvMethod11( String str);

    public void callbyJNIString00(){
        android.util.Log.i("zukgit"," Java@@callbyJNIString00() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString00() call by JNI", Toast.LENGTH_SHORT).show();
    }


    public void callbyJNIString01(String str){
        android.util.Log.i("zukgit"," callbyJNIString01() call by JNI param="+str);
        Toast.makeText(mContext.getApplicationContext(), " Java@@ccallbyJNIString01() call by JNI param="+str, Toast.LENGTH_SHORT).show();
        stringValue = str;
    }

    public String  callbyJNIString10() {
        android.util.Log.i("zukgit","Java@@callbyJNIString10() call by JNI ");
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString10() call by JNI", Toast.LENGTH_SHORT).show();
        return "callbyJNIString10() call by JNI";
    }

    public String  callbyJNIString11( String str) {
        android.util.Log.i("zukgit","Java@@callbyJNIString10() call by JNI "+str);
        Toast.makeText(mContext.getApplicationContext(), "callbyJNIString11() call by JNI param="+str, Toast.LENGTH_SHORT).show();
        String value = str+" callbyJNIString11()";
        return value;
    }


    public static  void callbyJNIStaticString00() {

        android.util.Log.i("zukgit","Java@@callbyJNIStaticString00() call by JNIStatic ");
    }

    public static void callbyJNIStaticString01( String str) {

        android.util.Log.i("zukgit","Java@@callbyJNIStaticString01() call by JNIStatic param=\"+jmChar");

        stringStaticValue = str;
    }

    public static  String callbyJNIStaticString10() {
        android.util.Log.i("zukgit"," Java@@callbyJNIStaticString10() call by JNIStatic");
        return "callbyJNIStaticString10() call by JNIStatic";
    }

    public static String  callbyJNIStaticString11( String str) {
        android.util.Log.i("zukgit"," Java@@callbyJNIStaticString11() call by JNIStatic");
        return  str+"callbyJNIStaticString11()" ;
    }


    //==============================String End ================================


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
            ArrayList<Object> objectListValue ,ArrayList<String> stringListValue,ArrayMap<String, String> stringMapValue );
    //========================Object End===================================


    //========================Class Begin===================================

    //------------------- Class Property
    public static boolean booleanStaticValue;
    public static byte byteStaticValue;
    public static char charStaticValue;
    public static short shortStaticValue;
    public static int intStaticValue;
    public static long longStaticValue;
    public static float floatStaticValue;
    public static double doubleStaticValue;
    public static Object objectStaticValue;


    public static ArrayList<String> stringListStaticValue;
    public static ArrayList<Object> objectListStaticValue;
    public static ArrayMap<String,String>  stringMapStaticValue;


    static{
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
        stringListStaticValue = new  ArrayList<String>(10);
        objectListStaticValue = new  ArrayList<Object>(10);
        stringMapStaticValue = new ArrayMap<String,String>(10);
        for (int i=0; i < stringListStaticValue.size(); i++){
            stringListStaticValue.add("staticString"+i);
        }
        for (int i=0; i < objectListStaticValue.size(); i++){
            objectListStaticValue.add(new ObjectA(i));
        }

        for (int i=0; i < stringMapStaticValue.size(); i++){
            stringMapStaticValue.put(""+i," static-map-value-"+i);
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

    public static  native ArrayMap<String,String> stringMapStaticNvMethod();

    public static native void allStaticNvMethod(
            boolean booleanValue, byte byteValue, char charValue, short shortValue, int intValue,
            long longValue, float floatValue, double doubleValue,
            ArrayList<Object> objectListValue ,   ArrayList<String> stringListValue, ArrayMap<String,String> stringMapValue);
}

