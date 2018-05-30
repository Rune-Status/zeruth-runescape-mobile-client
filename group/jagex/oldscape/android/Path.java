package group.jagex.oldscape.android;

import android.view.inputmethod.InputMethodManager;
import p000.IllegalArgumentException;
import p000.StringBuilder;

/* compiled from: ad */
public class Path extends p000.Path {
    final AndroidLauncher this$0;

    Path(AndroidLauncher androidLauncher, int i, IllegalArgumentException illegalArgumentException) {
        try {
            super(illegalArgumentException);
            this.this$0 = androidLauncher;
            add(i, 1485109906);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/ad.<init>(" + ')');
        }
    }

    public void add(byte b) {
        try {
            append(new SearchFragment$2(this.this$0, this.content, 2, 6), 1484073601);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/ad.ad(" + ')');
        }
    }

    public void add(int i) {
        try {
            super.add(63448936);
            ((InputMethodManager) this.this$0.getSystemService("input_method")).hideSoftInputFromWindow(this.this$0.getWindow().getDecorView().getWindowToken(), 0);
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "com/jagex/oldscape/android/ad.ag(" + ')');
        }
    }

    public void curveTo() {
        append(new SearchFragment$2(this.this$0, this.content, 1, 6), 1484073601);
    }

    public void extract() {
        append(new SearchFragment$2(this.this$0, this.content, -614998781, 5), 1484073601);
        append(new SearchFragment$2(this.this$0, this.content, 219163939, 6), 1484073601);
    }

    public void extract(byte b) {
        try {
            append(new SearchFragment$2(this.this$0, this.content, 33, 6), 1484073601);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/ad.aa(" + ')');
        }
    }

    public void extract(int i) {
        try {
            append(new SearchFragment$2(this.this$0, this.content, 33, 5), 1484073601);
            append(new SearchFragment$2(this.this$0, this.content, 129, 6), 1484073601);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/ad.af(" + ')');
        }
    }

    public void getChild() {
        append(new SearchFragment$2(this.this$0, this.content, 2, 6), 1484073601);
    }

    public void lineTo() {
        append(new SearchFragment$2(this.this$0, this.content, 1, 6), 1484073601);
    }

    public void list() {
        append(new SearchFragment$2(this.this$0, this.content, 33, 6), 1484073601);
    }

    public void onLoadFinished() {
        super.add(-2097726241);
        ((InputMethodManager) this.this$0.getSystemService("input_method")).hideSoftInputFromWindow(this.this$0.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void onPostExecute() {
        super.add(-399630065);
        ((InputMethodManager) this.this$0.getSystemService("input_method")).hideSoftInputFromWindow(this.this$0.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void reset() {
        super.add(-2122495623);
        ((InputMethodManager) this.this$0.getSystemService("input_method")).hideSoftInputFromWindow(this.this$0.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void result() {
        super.add(-821693971);
        ((InputMethodManager) this.this$0.getSystemService("input_method")).hideSoftInputFromWindow(this.this$0.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void toString(byte b) {
        try {
            append(new SearchFragment$2(this.this$0, this.content, 1, 6), 1484073601);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "com/jagex/oldscape/android/ad.an(" + ')');
        }
    }
}
