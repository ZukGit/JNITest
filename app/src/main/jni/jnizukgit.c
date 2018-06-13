//
// https://www.jianshu.com/p/afbbdafabc8b
#include <jni.h>
#include <malloc.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_voidNvMethod
        (JNIEnv *env, jobject obj) {

    return;
};

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    booleanNvMethod             jboolean flag = JNI_FALSE;  |  jboolean flag = JNI_TRUE;
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_booleanNvMethod
        (JNIEnv *env, jobject obj) {
    jboolean flag = JNI_FALSE;
    return flag;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    byteNvMethod
 * Signature: ()B
 */
JNIEXPORT jbyte JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_byteNvMethod
        (JNIEnv *env, jobject obj) {
    jbyte mByte = 0x22;
    return mByte;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    charNvMethod
 * Signature: ()C       // 一个 jchar 是一个无符号16位值  // jchar jca_result[3] = { ‘e’, ‘r’, ‘r’ };
 */
JNIEXPORT jchar JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_charNvMethod
        (JNIEnv *env, jobject obj) {
    jchar mChar = 'Z';
    return mChar;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    shortNvMethod
 * Signature: ()S
 */
JNIEXPORT jshort JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_shortNvMethod
        (JNIEnv *env, jobject obj) {
    jshort mShort = 255;
    return mShort;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    intNvMethod
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_intNvMethod
        (JNIEnv *env, jobject obj) {
    jint mInt = 30000;
    return mInt;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    longNvMethod
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_longNvMethod
        (JNIEnv *env, jobject obj) {
    jlong mlong = 90000000;
    return mlong;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    floatNvMethod
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_floatNvMethod
        (JNIEnv *env, jobject obj) {
    jfloat mfloat = 10.08f;
    return mfloat;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    doubleNvMethod
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_doubleNvMethod
        (JNIEnv *env, jobject obj) {
    jdouble mdouble = 11.0809086;
    return mdouble;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    booleanArrayNvMethod
 * Signature: ()[Z
 */
JNIEXPORT jbooleanArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_booleanArrayNvMethod
        (JNIEnv *env, jobject obj) {
    jsize size = 10;
    jbooleanArray mBooleanArray = (jbooleanArray) (*env)->NewBooleanArray(env, size);
    if (mBooleanArray == NULL) {
        return NULL;
    }

    jboolean *boolean_ptr = calloc(size, sizeof(jboolean));
    if (boolean_ptr == NULL) {
        return NULL;
    }


    for (int i = 0; i < size; i++) {
        boolean_ptr[i] = i % 2 == 0 ? JNI_FALSE : JNI_TRUE;
    }

    (*env)->SetBooleanArrayRegion(env, mBooleanArray, 0, size, (jboolean *) boolean_ptr);

    free(boolean_ptr);
    return mBooleanArray;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    byteArrayNvMethod
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_byteArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    charArrayNvMethod
 * Signature: ()[C
 */
JNIEXPORT jcharArray JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_charArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    shortArrayNvMethod
 * Signature: ()[S
 */
JNIEXPORT jshortArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_shortArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    intArrayNvMethod
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_intArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    longArrayNvMethod
 * Signature: ()[J
 */
JNIEXPORT jlongArray JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_longArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    floatArrayNvMethod
 * Signature: ()[F
 */
JNIEXPORT jfloatArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_floatArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    doubleArrayNvMethod
 * Signature: ()[D
 */
JNIEXPORT jdoubleArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_doubleArrayNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    objectNvMethod
 * Signature: ()Ljava/lang/Object;
 */
JNIEXPORT jobject JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_objectNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}


JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringNvMethod00
        (JNIEnv *env, jobject jobj) {

    jclass jcla = (*env)->GetObjectClass(env, jobj);

    jfieldID fid = (*env)->GetFieldID(env, jcla, "stringValue", "Ljava/lang/String;");


    jstring jstr = (*env)->GetObjectField(env, jobj, fid);

    char *c_str = (*env)->GetStringUTFChars(env, jstr, NULL);  // 读取到 stringValue的值

    char text[100] = "stringValue change in JNI ";

    strcat(text, c_str);  // 创建新的值

    jstring new_str = (*env)->NewStringUTF(env, text);

    (*env)->SetObjectField(env, jobj, fid, new_str);  // 设置 stringValue新的值

    return;
}


JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringNvMethod01
        (JNIEnv *env, jobject obj, jstring str) {
    return;
}


/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringNvMethod
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringNvMethod10
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "stringNvMethod10 from JNI");
}


JNIEXPORT jstring  JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringNvMethod11
        (JNIEnv *env, jobject obj, jstring str) {

    char buf[128];
    const char *cStr = (*env)->GetStringUTFChars(env, str, 0);  // jstring 转为 C语言 char* 类型
    printf("%s", cStr);
    char *mChar = "stringNvMethod11 from JNI";
    char *result = (char *) malloc(strlen(cStr) + strlen(mChar) + 1);
    if (result == NULL)
        return NULL;
    strcpy(result, cStr);
    strcat(result, mChar);   // 完成字符的拼接
    return (*env)->NewStringUTF(env, result);
}



JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringStaticNvMethod00
        (JNIEnv *env, jobject jobj) {


    jclass jcla = (*env)->GetObjectClass(env, jobj);
    jfieldID fid = (*env)->GetStaticFieldID(env, jcla, "stringStaticValue", "Ljava/lang/String;");
    jstring jstr = (*env)->GetStaticObjectField(env, jcla, fid);
    char *c_str = (*env)->GetStringUTFChars(env, jstr, NULL);
    char text[100] = "stringStaticValue change in JNI ";
    strcat(text, c_str);
    jstring new_str = (*env)->NewStringUTF(env, text);
    (*env)->SetStaticObjectField(env, jcla, fid, new_str);

    return;
}

JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringStaticNvMethod01
        (JNIEnv *env, jobject obj , jstring str) {
    return;
}


/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringStaticNvMethod
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringStaticNvMethod10
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "staticstring_10 from JNI");
}

JNIEXPORT jstring JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringStaticNvMethod11
        (JNIEnv *env, jobject obj, jstring str) {
    char buf[128];
    const char *cStr = (*env)->GetStringUTFChars(env, str, 0);  // jstring 转为 C语言 char* 类型
    printf("%s", cStr);
    char *mChar = "staticstring_11 from JNI";
    char *result = (char *) malloc(strlen(cStr) + strlen(mChar) + 1);
    if (result == NULL)
        return NULL;
    strcpy(result, cStr);
    strcat(result, mChar);   // 完成字符的拼接
    return (*env)->NewStringUTF(env, result);
}


/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringListNvMethod
 * Signature: ()Ljava/util/ArrayList;
 */
JNIEXPORT jobject JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringListNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    objectListNvMethod
 * Signature: ()Ljava/util/ArrayList;
 */
JNIEXPORT jobject JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_objectListNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringMapNvMethod
 * Signature: ()Landroid/util/ArrayMap;
 */
JNIEXPORT jobject JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringMapNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    allNvMethod
 * Signature: (ZBCSIJFDLjava/util/ArrayList;Ljava/util/ArrayList;Landroid/util/ArrayMap;)V
 */
JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_allNvMethod
        (JNIEnv *env, jobject obj, jboolean bool, jbyte byte, jchar charValue, jshort shortValue,
         jint intValue, jlong longValue,
         jfloat floatValue, jdouble doubleValue, jobject obj0,
         jobject obj1, jobject obj2) {
    return;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    voidStaticNvMethod
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_voidStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    booleanStaticNvMethod
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_booleanStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    byteStaticNvMethod
 * Signature: ()B
 */
JNIEXPORT jbyte JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_byteStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    charStaticNvMethod
 * Signature: ()C
 */
JNIEXPORT jchar JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_charStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    shortStaticNvMethod
 * Signature: ()S
 */
JNIEXPORT jshort JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_shortStaticNvMethod
        (JNIEnv *env, jobject obj) {
    jshort jshort = 100;
    return jshort;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    intStaticNvMethod
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_intStaticNvMethod
        (JNIEnv *env, jobject obj) {
    jint mjint = 100000;
    return mjint;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    longStaticNvMethod
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_longStaticNvMethod
        (JNIEnv *env, jobject obj) {
    jlong mjlong = 12345;
    return mjlong;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    floatStaticNvMethod
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_floatStaticNvMethod
        (JNIEnv *env, jobject obj) {
    jfloat mjfloat = 3.14;
    return mjfloat;
}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    doubleStaticNvMethod
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_doubleStaticNvMethod
        (JNIEnv *env, jobject obj) {

    jdouble mjdouble = 3.1415926;
    return mjdouble;

}
/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    booleanArrayStaticNvMethod
 * Signature: ()[Z
 */
JNIEXPORT jbooleanArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_booleanArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    byteArrayStaticNvMethod
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_byteArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    charArrayStaticNvMethod
 * Signature: ()[C
 */
JNIEXPORT jcharArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_charArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    shortArrayStaticNvMethod
 * Signature: ()[S
 */
JNIEXPORT jshortArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_shortArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    intArrayStaticNvMethod
 * Signature: ()[I
 */
JNIEXPORT jintArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_intArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    longArrayStaticNvMethod
 * Signature: ()[J
 */
JNIEXPORT jlongArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_longArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    floatArrayStaticNvMethod
 * Signature: ()[F
 */
JNIEXPORT jfloatArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_floatArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    doubleArrayStaticNvMethod
 * Signature: ()[D
 */
JNIEXPORT jdoubleArray JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_doubleArrayStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    objectStaticNvMethod
 * Signature: ()Ljava/lang/Object;
 */
JNIEXPORT jobject JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_objectStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}








/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringListStaticNvMethod
 * Signature: ()Ljava/util/ArrayList;
 */
JNIEXPORT jobject JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringListStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    objectListStaticNvMethod
 * Signature: ()Ljava/util/ArrayList;
*/
JNIEXPORT jobject JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_objectListStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    stringMapStaticNvMethod
 * Signature: ()Landroid/util/ArrayMap;
 */
JNIEXPORT jobject JNICALL
Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_stringMapStaticNvMethod
        (JNIEnv *env, jobject obj) {
    return NULL;
}

/*
 * Class:     com_zukgit_administrator_testjni_zukgit_JniUtil
 * Method:    allStaticNvMethod
 * Signature: (ZBCSIJFDLjava/util/ArrayList;Ljava/util/ArrayList;Landroid/util/ArrayMap;)V
 */
JNIEXPORT void JNICALL Java_com_zukgit_administrator_testjni_1zukgit_JniUtil_allStaticNvMethod
        (JNIEnv *env, jobject obj, jboolean bool, jbyte byte, jchar charValue, jshort shortValue,
         jint intValue, jlong longValue,
         jfloat floatValue, jdouble doubleValue, jobject obj0,
         jobject obj1, jobject obj2) {
    return;
}