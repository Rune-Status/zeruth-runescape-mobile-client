package p000;

/* compiled from: ex */
public class ParserHelper {
    static final int KEYCODE_MEDIA_PAUSE = 127;
    static final int RIGHT_M = 48;
    static final ParserHelper active = new ParserHelper(0);
    static final ParserHelper current = new ParserHelper(1);
    public static Class index = null;
    static final int f224n = 100;
    static CopyOnWriteArrayList values;
    final int value;

    ParserHelper(int $i0) {
        try {
            this.value = -370536703 * $i0;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ex.<init>(" + ')');
        }
    }

    static final void set(System $r0, int $i0, int i, int i2) {
        if (client.name == null) {
            try {
                if (!(Settings.this$0.get(1837668692) || $r0 == null)) {
                    if (Msg.serialize($r0, 1773673955) != null) {
                        client.$assertionsDisabled.add(TimeUnit.this$0, -893478109);
                        client.name = $r0;
                        client.format = Msg.serialize($r0, 1773673955);
                        client.time = 122320485 * $i0;
                        client.weight = -382162159 * i;
                        Page.size = 0;
                        client.width = false;
                    }
                }
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "ex.fd(" + ')');
            }
        }
    }
}
