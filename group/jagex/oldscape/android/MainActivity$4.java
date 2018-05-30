package group.jagex.oldscape.android;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import p000.StringBuilder;

/* compiled from: AndroidLauncher */
class MainActivity$4 implements OnFocusChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    MainActivity$4(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.this$0.show(16776960);
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "com/jagex/oldscape/android/ay.onFocusChange(" + ')');
            }
        }
    }

    public void onItemSelected(View view, boolean z) {
        if (z) {
            this.this$0.show(16776960);
        }
    }

    public void onRefresh(View view, boolean z) {
        if (z) {
            this.this$0.show(16776960);
        }
    }
}
