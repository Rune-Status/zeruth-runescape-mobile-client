package p000;

import java.util.Collection;

/* compiled from: ge */
public abstract class Fragment {
    static final int SATURDAY = 39;
    public static final int mIndex = 1011;
    static Long version;
    protected Preference this$0;

    protected Fragment() {
        try {
            this.this$0 = new DroidGap();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ge.<init>(" + ')');
        }
    }

    static final void read(int $i0, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        BigInteger $r2 = (BigInteger) client.buf.get();
        while ($r2 != null) {
            int $i9 = $r2.data * -1783248061;
            i9 = $i9;
            if ($i0 == $i9) {
                $i9 = $r2.value * -1294114749;
                i9 = $i9;
                if ($i9 == i) {
                    if (-401817923 * $r2.length == i2) {
                        try {
                            $i9 = $r2.count * -1833730097;
                            i9 = $i9;
                            if ($i9 == i3) {
                                break;
                            }
                        } catch (RuntimeException $r3) {
                            throw StringBuilder.append($r3, "ge.dm(" + ')');
                        }
                    }
                }
            }
            $r2 = (BigInteger) client.buf.next();
        }
        $r2 = null;
        if ($r2 == null) {
            $r2 = new BigInteger();
            $r2.data = -599549589 * $i0;
            $r2.count = 1207772975 * i3;
            $r2.value = 1781132395 * i;
            $r2.length = 134655125 * i2;
            AESCipher.write($r2, -1273164221);
            client.buf.toString($r2);
        }
        $r2.buffer = 1516219155 * i4;
        $r2.offset = 287659945 * i5;
        $r2.buf = -1187658655 * i6;
        $r2.pos = 645588417 * i7;
        $r2.size = 1558812355 * i8;
    }

    public static void saveFile(Collection collection, int i) {
        try {
            collection.add(Connection.file);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ge.ae(" + ')');
        }
    }

    public static void toString(Collection collection, int i) {
        try {
            collection.add(HyperlinkRecord.data);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ge.aa(" + ')');
        }
    }

    public void add(Preference preference, byte b) {
        if (preference == null) {
            try {
                throw new NullPointerException();
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "ge.af(" + ')');
            }
        }
        this.this$0 = preference;
    }

    protected final long next(byte b) {
        try {
            return LinkedList.toString(334761458);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ge.ad(" + ')');
        }
    }

    public void onActivityCreated(Preference preference) {
        if (preference == null) {
            throw new NullPointerException();
        }
        this.this$0 = preference;
    }

    public void restoreViewState(Preference preference) {
        if (preference == null) {
            throw new NullPointerException();
        }
        this.this$0 = preference;
    }

    protected final long setIndex() {
        return LinkedList.toString(90039301);
    }

    protected final long setInitialSavedState() {
        return LinkedList.toString(1279843253);
    }

    public void setInitialSavedState(Preference preference) {
        if (preference == null) {
            throw new NullPointerException();
        }
        this.this$0 = preference;
    }
}
