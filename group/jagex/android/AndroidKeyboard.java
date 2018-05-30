package group.jagex.android;

import android.app.NativeActivity;
import android.view.KeyCharacterMap;
import android.view.inputmethod.InputMethodManager;
import p000.StringBuilder;

public class AndroidKeyboard {
    static KeyCharacterMap dataCount;
    static int dataCursor = 0;
    static NativeActivity mainActivity;

    AndroidKeyboard() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "com/jagex/android/AndroidKeyboard.<init>(" + ')');
        }
    }

    public static void Hide() {
        try {
            ((InputMethodManager) mainActivity.getSystemService("input_method")).hideSoftInputFromWindow(mainActivity.getWindow().getDecorView().getWindowToken(), 0);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "com/jagex/android/AndroidKeyboard.Hide(" + ')');
        }
    }

    public static boolean IsVisible() {
        try {
            return ((InputMethodManager) mainActivity.getSystemService("input_method")).isAcceptingText();
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/android/AndroidKeyboard.IsVisible(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int $i0, int i) {
        try {
            return KeyCodeToUnicodeCharacter($i0, i, dataCursor * 158562673);
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int $i0, int i, int $i2) {
        if (dataCount == null || $i2 != 158562673 * dataCursor) {
            try {
                dataCount = KeyCharacterMap.load($i2);
                dataCursor = -1550309487 * $i2;
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
            }
        }
        return dataCount.get($i0, i);
    }

    public static void SetupMainActivity(NativeActivity nativeActivity) {
        mainActivity = nativeActivity;
    }

    public static void Show() {
        try {
            ((InputMethodManager) mainActivity.getSystemService("input_method")).showSoftInput(mainActivity.getWindow().getDecorView(), 2);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/android/AndroidKeyboard.Show(" + ')');
        }
    }
}
