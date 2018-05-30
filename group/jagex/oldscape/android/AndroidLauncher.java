package group.jagex.oldscape.android;

import android.app.NativeActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import group.jagex.android.AndroidKeyboard;
import p000.Connection;
import p000.Response;
import p000.StringBuilder;
import p000.client;

public class AndroidLauncher extends NativeActivity {
    static client name;
    Preferences data;

    public static void init() {
        try {
            name.getBytes(-729603494);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "com/jagex/oldscape/android/AndroidLauncher.init(" + ')');
        }
    }

    void init(String str) {
        name = new client();
        name.token = true;
        name.content = 1388941014;
        name.set("http://oldschool.runescape.com/slr.ws?order=LPWM", 1733775449);
        this.data = new Preferences(this);
        this.data.clear(false, 1106059539);
        name.clear(this.data, -1568625990);
        name.append(new Response(str), 1234581373);
        name.execute(537618701);
    }

    void init(String str, byte b) {
        try {
            name = new client();
            name.token = true;
            name.content = 1388941014;
            name.set("http://oldschool.runescape.com/slr.ws?order=LPWM", 2034977989);
            this.data = new Preferences(this);
            this.data.clear(false, 1999367323);
            name.clear(this.data, 827155824);
            name.append(new Response(str), 1657302182);
            name.execute(537618701);
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "com/jagex/oldscape/android/AndroidLauncher.af(" + ')');
        }
    }

    public void onCreate(Bundle bundle) {
        try {
            System.setOut(new Logger(this, System.out));
            AndroidKeyboard.SetupMainActivity(this);
            getWindow().setFormat(3);
            super.onCreate(bundle);
            Intent $r5 = getIntent();
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            String $r9 = getString(C0003R.string.jav_config_url);
            if ($r5 != null) {
                Uri $r10 = $r5.getData();
                String $r11 = $r5.getAction();
                if (!($r10 == null || $r11 == null)) {
                    if ($r11.equals("android.intent.action.VIEW")) {
                        $r9 = "http://" + $r10.toString().split("//")[1];
                    }
                }
            }
            init($r9, (byte) -56);
        } catch (Throwable $r14) {
            throw StringBuilder.append($r14, "com/jagex/oldscape/android/AndroidLauncher.onCreate(" + ')');
        }
    }

    public void onPause() {
        try {
            name.toString(false, -1201175365);
            this.data.get(true, 842696807);
            if (Connection.this$0 != null) {
                if (Connection.this$0.parse(-2140033866)) {
                    Connection.this$0.toString(-1147035743);
                }
            }
            super.onPause();
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/AndroidLauncher.onPause(" + ')');
        }
    }

    public void onResume() {
        try {
            View $r2 = getWindow().getDecorView();
            $r2.setFocusableInTouchMode(true);
            show(16776960);
            name.toString(true, -1659702226);
            this.data.get(false, 842696807);
            $r2.setOnSystemUiVisibilityChangeListener(new MainActivity$3(this));
            $r2.setOnFocusChangeListener(new MainActivity$4(this));
            super.onResume();
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "com/jagex/oldscape/android/AndroidLauncher.onResume(" + ')');
        }
    }

    void reset(String str) {
        name = new client();
        name.token = true;
        name.content = 1388941014;
        name.set("http://oldschool.runescape.com/slr.ws?order=LPWM", 1584036627);
        this.data = new Preferences(this);
        this.data.clear(false, 1748920263);
        name.clear(this.data, 10594692);
        name.append(new Response(str), -1462319734);
        name.execute(537618701);
    }

    void run(String str) {
        name = new client();
        name.token = true;
        name.content = 205152668;
        name.set("http://oldschool.runescape.com/slr.ws?order=LPWM", 1579666372);
        this.data = new Preferences(this);
        this.data.clear(false, 1531237509);
        name.clear(this.data, -799314200);
        name.append(new Response(str), 964508427);
        name.execute(537618701);
    }

    void set(String str) {
        name = new client();
        name.token = true;
        name.content = 1388941014;
        name.set("http://oldschool.runescape.com/slr.ws?order=LPWM", 1838337916);
        this.data = new Preferences(this);
        this.data.clear(false, 1808005800);
        name.clear(this.data, 666123670);
        name.append(new Response(str), 105779833);
        name.execute(537618701);
    }

    void setImmersiveMode() {
        getWindow().getDecorView().setSystemUiVisibility(28155791);
    }

    void setNavVisibility() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    void show(int i) {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5895);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/AndroidLauncher.ad(" + ')');
        }
    }
}
