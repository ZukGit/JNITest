package com.zukgit.administrator.testjni_zukgit;

public class Bean {
    public int num;
    public String str;
    Bean(){

        android.util.Log.i("Zukgit","Bean");
    }

    Bean(int intValue , String strValue){
        num = intValue;
        str   =strValue;
        android.util.Log.i("Zukgit","Bean");
    }



    Bean( String strValue){
        str   =strValue;
        android.util.Log.i("Zukgit","Bean");
    }

    Bean(int intValue ){
        num = intValue;
        android.util.Log.i("Zukgit","Bean");
    }

    @Override
    public String toString() {
        return "Bean{" +
                "num=" + num +
                ", str='" + str + '\'' +
                '}';
    }
}
