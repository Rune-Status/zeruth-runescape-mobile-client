package group.jagex.oldscape.android;

import java.io.OutputStream;
import java.io.PrintStream;
import p000.StringBuilder;

/* compiled from: AndroidLauncher */
class Logger extends PrintStream {
    final /* synthetic */ AndroidLauncher this$0;

    Logger(AndroidLauncher androidLauncher, OutputStream outputStream) {
        this.this$0 = androidLauncher;
        super(outputStream);
    }

    public void debug(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void error(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void info(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void println(String str) {
        try {
            super.println("com.jagex.oldscape: " + str);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "com/jagex/oldscape/android/ar.println(" + ')');
        }
    }

    public void trace(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void warn(String str) {
        super.println("com.jagex.oldscape: " + str);
    }
}
