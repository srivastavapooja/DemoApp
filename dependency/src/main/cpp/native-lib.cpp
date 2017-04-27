#include <jni.h>
#include <string>
extern "C"
JNIEXPORT int JNICALL
Java_testdomain_com_verizonapp_MathScreen_getSquareValueFromJNI(JNIEnv *env, jobject instance, int val) {

    jclass cls = env->GetObjectClass(instance);
    jmethodID mid = env->GetMethodID(cls, "SquareCallback", "(I)I");
    if (mid == 0)
        return -1;
    int sq = env->CallIntMethod( instance, mid, val);
    return sq;

}

extern "C"
JNIEXPORT jstring JNICALL
Java_testdomain_com_verizonapp_TextScreen_getMessageFromJNI(JNIEnv *env, jobject instance) {

    std::string msg = "JNI sends message: Welcome to this test app. Enjoy Navigating.";
    return env->NewStringUTF(msg.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_testdomain_com_depmodule_DepClass_getMessageFromJNI(JNIEnv *env, jobject instance) {

    std::string msg = "JNI sends message: how you doing?";
    return env->NewStringUTF(msg.c_str());
}

