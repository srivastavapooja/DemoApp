package testdomain.com.depmodule;

/**
 * Created by sriva on 4/26/2017.
 */

public class DepClass {

    static {
        System.loadLibrary("native-lib");
    }

    public native String getMessageFromJNI();
    public native int getSquareValueFromJNI(int val);

    private int SquareCallback (int num){
        System.out.print("in SquareCallback");
        return num*num;
    }

}
