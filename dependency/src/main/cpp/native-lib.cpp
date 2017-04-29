#include <jni.h>
#include <string>
extern "C"
JNIEXPORT jint JNICALL
Java_testdomain_com_depmodule_DepClass_getSquareValueFromJNI(JNIEnv *env, jobject instance, int val) {

    // TODO
    jclass cls = env->GetObjectClass(instance);
    jmethodID mid = env->GetMethodID(cls, "SquareCallback", "(I)I");
    if (mid == 0)
        return -1;
    int sq = env->CallIntMethod( instance, mid, val);
    return sq;


}


extern "C"
JNIEXPORT jstring JNICALL
Java_testdomain_com_depmodule_DepClass_getMessageFromJNI(JNIEnv *env, jobject instance) {

    std::string msg = "JNI sends message: Welcome to the test app. Enjoy navigating";
    return env->NewStringUTF(msg.c_str());
}

