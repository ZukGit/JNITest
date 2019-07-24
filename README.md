# apk设计思路

##  java基本类型分类分为 以下12种
```


boolean
byte
char
short
int
long
float
double
Object
String 
ArrayList<String>
ArrayMap<String ,Bean>



```


### boolean
```

public boolean booleanValue;
public static boolean booleanStaticValue;


4种Object实例方法
// boolean Native  Method
public native void booleanNvMethod00();
public native void booleanNvMethod01(boolean booleanValue);
public native boolean booleanNvMethod10();
public native boolean booleanNvMethod11(boolean booleanValue);

4种Class类静态方法

// boolean  Class  Static Method
public static native void booleanStaticNvMethod00();
public static native void booleanStaticNvMethod01(boolean booleanValue);
public static native boolean booleanStaticNvMethod10();
public static native boolean booleanStaticNvMethod11(boolean booleanValue);
````


### byte
```

public byte byteValue;   //实例属性
public static byte byteStaticValue;  // 类属性 静态


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

```

### char
```

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

```

### short
```

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

```

### int

```


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

```

### long

```

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

```

### float

```

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

```


### double

```

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
```


### Object

```

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


```


### String

```

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

```

### ArrayList<Object>
```


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


```

### ArrayList<String>


```

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


```


### ArrayMap<String ,Bean>


```
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

```

