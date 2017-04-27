package testdomain.com.depmodule;

/**
 * Created by sriva on 4/26/2017.
 */

public class DepClass {

    static {
        System.loadLibrary("native-lib");
    }

    public native String getMessageFromJNI();

}
