package group.jagex.oldscape.android;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: aj */
class EmulatorView extends InputConnectionWrapper {
    final /* synthetic */ EditText this$1;

    EmulatorView(EditText editText, InputConnection inputConnection, boolean z) {
        this.this$1 = editText;
        super(inputConnection, z);
    }

    public boolean onKeyPreIme(KeyEvent keyEvent) {
        boolean $z0 = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() == 1) {
                deleteSurroundingText(1, 0);
                return true;
            }
        } else if (keyEvent.getAction() == 0) {
            if (this.this$1.this$0.this$0.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                $z0 = true;
            }
            return $z0;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendKeyEvent(android.view.KeyEvent r14) {
        /*
        r13 = this;
        r0 = 0;
        r1 = r14.getKeyCode();	 Catch:{ RuntimeException -> 0x0031 }
        r2 = 67;
        if (r1 != r2) goto L_0x0017;
    L_0x0009:
        r1 = r14.getAction();	 Catch:{ RuntimeException -> 0x0031 }
        r2 = 1;
        if (r1 != r2) goto L_0x004c;
    L_0x0010:
        r2 = 1;
        r3 = 0;
        r13.deleteSurroundingText(r2, r3);	 Catch:{ RuntimeException -> 0x0031 }
        r2 = 1;
        return r2;
    L_0x0017:
        r1 = r14.getAction();	 Catch:{ RuntimeException -> 0x0031 }
        if (r1 != 0) goto L_0x004c;
    L_0x001d:
        r4 = r13.this$1;	 Catch:{ RuntimeException -> 0x0031 }
        r5 = r4.this$0;	 Catch:{ RuntimeException -> 0x0031 }
        r6 = r5.this$0;	 Catch:{ RuntimeException -> 0x0031 }
        r7 = r6.dispatchKeyEvent(r14);	 Catch:{ RuntimeException -> 0x0031 }
        if (r7 != 0) goto L_0x002f;
    L_0x0029:
        r7 = super.sendKeyEvent(r14);	 Catch:{ RuntimeException -> 0x0031 }
        if (r7 == 0) goto L_0x0030;
    L_0x002f:
        r0 = 1;
    L_0x0030:
        return r0;
    L_0x0031:
        r8 = move-exception;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = "com/jagex/oldscape/android/aa.sendKeyEvent(";
        r9 = r9.append(r10);
        r2 = 41;
        r9 = r9.append(r2);
        r11 = r9.toString();
        r12 = p000.StringBuilder.append(r8, r11);
        throw r12;
    L_0x004c:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: group.jagex.oldscape.android.EmulatorView.sendKeyEvent(android.view.KeyEvent):boolean");
    }
}
