package p000;

import java.io.IOException;

/* compiled from: in */
public class Format {
    static final int LONG = 3500;
    static final int TextView_drawableTop = 50;
    static long blocks;
    static long value;

    Format() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "in.<init>(" + ')');
        }
    }

    public static byte[] toString(short s) {
        byte[] $r0 = new byte[24];
        try {
            Transport.state.get(0);
            Transport.state.get($r0, (byte) 14);
            int $i2 = 0;
            while ($i2 < 24) {
                try {
                    if ($r0[$i2] != (byte) 0) {
                        break;
                    }
                    $i2++;
                } catch (RuntimeException $r4) {
                    throw StringBuilder.append($r4, "in.an(" + ')');
                }
            }
            if ($i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            for (int $i1 = 0; $i1 < 24; $i1++) {
                $r0[$i1] = (byte) -1;
            }
        }
        return $r0;
    }
}
