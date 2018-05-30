package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: nj */
public class Note {
    public static final int OTHER = 99;
    public static Comparator intent = new Score();
    public static Comparator text = new DateValidator();
    public static Comparator type = new App();
    public static Comparator url = new FolderPicker$1();
    public final List data;

    static {
        RefComparator $r1 = new RefComparator();
    }

    public Note(Logger logger, boolean z) {
        byte $b0 = (byte) 1;
        int $i2 = logger.get(1739373058);
        if (!(logger.get((byte) 0) == 1)) {
            $b0 = (byte) 0;
        }
        try {
            int $i3 = logger.get(-840206376);
            this.data = new ArrayList($i3);
            for (int $i1 = 0; $i1 < $i3; $i1++) {
                this.data.add(new AstNode(logger, $b0, $i2));
            }
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "nj.<init>(" + ')');
        }
    }

    public void add(Comparator $r1, boolean z, int i) {
        if (z) {
            try {
                Collections.sort(this.data, $r1);
                return;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "nj.af(" + ')');
            }
        }
        Collections.sort(this.data, Collections.reverseOrder($r1));
    }

    public void flush(Comparator $r1, boolean z) {
        if (z) {
            Collections.sort(this.data, $r1);
        } else {
            Collections.sort(this.data, Collections.reverseOrder($r1));
        }
    }
}
