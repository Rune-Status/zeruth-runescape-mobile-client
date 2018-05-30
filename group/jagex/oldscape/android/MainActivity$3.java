package group.jagex.oldscape.android;

import android.view.View.OnSystemUiVisibilityChangeListener;
import p000.StringBuilder;

/* compiled from: AndroidLauncher */
class MainActivity$3 implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    MainActivity$3(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void gridTouched(int i) {
        this.this$0.show(16776960);
    }

    public void onItemSelected(int i) {
        this.this$0.show(16776960);
    }

    public void onSystemUiVisibilityChange(int i) {
        try {
            this.this$0.show(16776960);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "com/jagex/oldscape/android/ag.onSystemUiVisibilityChange(" + ')');
        }
    }
}
