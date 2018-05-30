package group.jagex.oldscape.android;

import p000.Constants;
import p000.StringBuilder;

/* compiled from: as */
class Main$1 implements Runnable {
    final /* synthetic */ Preferences this$0;
    final /* synthetic */ boolean val$keepScreenOn;

    Main$1(Preferences preferences, boolean z) {
        this.this$0 = preferences;
        this.val$keepScreenOn = z;
    }

    public void loadPreferences() {
        if (this.val$keepScreenOn) {
            this.this$0.this$0.getWindow().addFlags(Constants.f93X);
        } else {
            this.this$0.this$0.getWindow().clearFlags(-1733507279);
        }
    }

    public void onPostExecute() {
        if (this.val$keepScreenOn) {
            this.this$0.this$0.getWindow().addFlags(-120664434);
        } else {
            this.this$0.this$0.getWindow().clearFlags(Constants.f93X);
        }
    }

    public void run() {
        try {
            if (this.val$keepScreenOn) {
                this.this$0.this$0.getWindow().addFlags(Constants.f93X);
            } else {
                this.this$0.this$0.getWindow().clearFlags(Constants.f93X);
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/af.run(" + ')');
        }
    }

    public void setScreenOn() {
        if (this.val$keepScreenOn) {
            this.this$0.this$0.getWindow().addFlags(-308454283);
        } else {
            this.this$0.this$0.getWindow().clearFlags(Constants.f93X);
        }
    }
}
