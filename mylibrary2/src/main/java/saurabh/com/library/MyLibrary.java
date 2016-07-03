package saurabh.com.library;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Saurabh on 03-07-2016.
 */

public class MyLibrary {
    private static MyLibrary newInstance = new MyLibrary();

    private MyLibrary() {

    }

    public static MyLibrary getInstance() {
        return newInstance;
    }

    public void showToast(Context context, String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }
}
