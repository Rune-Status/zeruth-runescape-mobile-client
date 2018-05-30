package p000;

/* compiled from: jk */
public class CompositeMap implements Converter {
    public static final CompositeMap backgroundColor = new CompositeMap("game5", "Game 5", 4);
    public static final CompositeMap color = new CompositeMap("game4", "Game 4", 3);
    public static final CompositeMap content = new CompositeMap("stellardawn", "Stellar Dawn", 1);
    public static final CompositeMap end = new CompositeMap("game3", "Game 3", 2);
    public static final CompositeMap font = new CompositeMap("oldscape", "RuneScape 2007", 5);
    public static final CompositeMap style = new CompositeMap("runescape", "RuneScape", 0);
    public final String key;
    final int value;

    CompositeMap(String str, String str2, int $i0) {
        try {
            this.key = str;
            this.value = 114850703 * $i0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "jk.<init>(" + ')');
        }
    }

    static final int write(int i, int i2, int i3) {
        try {
            i = ((int) (((double) (((Cell.create(45365 + i, 91923 + i2, 4, -1603457738) - 128) + ((Cell.create(i + 10294, 37821 + i2, 2, 192180088) - 128) >> 1)) + ((Cell.create(i, i2, 1, 876314827) - 128) >> 2))) * 0.3d)) + 35;
            return i < 10 ? 10 : i <= 60 ? i : 60;
        } catch (RuntimeException $r0) {
            throw StringBuilder.append($r0, "jk.aj(" + ')');
        }
    }

    public int get() {
        return -311147665 * this.value;
    }

    public int get(int i) {
        try {
            return -311147665 * this.value;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "jk.af(" + ')');
        }
    }

    public int read() {
        return -669886061 * this.value;
    }

    public int write() {
        return -1004527016 * this.value;
    }
}
