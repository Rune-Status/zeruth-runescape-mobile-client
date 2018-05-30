package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/* compiled from: jz */
public class DirCacheEntry {
    public static final int INFO_LEN_EXTENDED = 64;
    static final int P_MTIME = 8;
    static final int STAGE_1 = 8;

    DirCacheEntry() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "jz.<init>(" + ')');
        }
    }

    static String get(Throwable th, int i) throws IOException {
        String $r4;
        boolean $z0 = th;
        th = $z0;
        if ($z0 instanceof Wrapper) {
            Wrapper $r1 = (Wrapper) th;
            $r4 = $r1.value + " | ";
            th = $r1.exception;
        } else {
            $r4 = "";
        }
        StringWriter $r5 = new StringWriter();
        PrintWriter $r6 = new PrintWriter($r5);
        th.printStackTrace($r6);
        $r6.close();
        BufferedReader $r7 = new BufferedReader(new StringReader($r5.toString()));
        String $r3 = $r7.readLine();
        while (true) {
            String $r9 = $r7.readLine();
            String $r10 = $r9;
            if ($r9 == null) {
                return $r4 + "| " + $r3;
            }
            i = $r9.indexOf(40);
            int $i1 = $r9.indexOf(41, i + 1);
            if (i >= 0 && $i1 >= 0) {
                $r10 = $r9.substring(i + 1, $i1);
                $i1 = $r10.indexOf(".java:");
                if ($i1 >= 0) {
                    $r4 = $r4 + ($r10.substring(0, $i1) + $r10.substring($i1 + 5)) + ' ';
                } else {
                    try {
                        $r10 = $r9.substring(0, i);
                    } catch (Throwable $r11) {
                        throw StringBuilder.append($r11, "jz.an(" + ')');
                    }
                }
            }
            $r9 = $r10.trim();
            $r9 = $r9.substring($r9.lastIndexOf(32) + 1);
            $r4 = $r4 + $r9.substring($r9.lastIndexOf(9) + 1) + ' ';
        }
    }
}
