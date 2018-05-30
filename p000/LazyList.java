package p000;

import java.lang.reflect.Array;

/* compiled from: cn */
public abstract class LazyList {
    static final int COLUMN_CODE = 2;
    static final int RIGHT_M = 48;
    static final int[] f11c = Point.f196i;
    public static boolean f12i = true;
    static final int loadedCount = 1600;
    static final int[] offset = Point.f197x;
    static final int[] state = Point.f198y;
    static final int[] text = Point.count;
    final int[] buffer;
    final int[] count;
    final int[] data;
    final int[] flags;
    final int[][] head;
    final int[] id;
    final int[] index;
    final int[] items;
    final int[] key;
    final int[] length;
    final int[][] limit;
    final int[] log;
    final boolean[] name;
    final int[] next;
    final boolean[] parent;
    final int[] pos;
    final int[] size;
    final Point this$0;
    final int[] value;

    LazyList(Point point) {
        try {
            this.parent = new boolean[4700];
            this.name = new boolean[4700];
            this.count = new int[4700];
            this.next = new int[4700];
            this.data = new int[4700];
            this.length = new int[4700];
            this.key = new int[4700];
            this.value = new int[4700];
            this.size = new int[loadedCount];
            this.limit = (int[][]) Array.newInstance(Integer.TYPE, new int[]{loadedCount, 512});
            this.buffer = new int[12];
            this.head = (int[][]) Array.newInstance(Integer.TYPE, new int[]{12, 2000});
            this.pos = new int[2000];
            this.log = new int[2000];
            this.index = new int[12];
            this.id = new int[10];
            this.flags = new int[10];
            this.items = new int[10];
            this.this$0 = point;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "cn.<init>(" + ')');
        }
    }

    static boolean get(byte b) {
        try {
            if (client.$assertionsDisabled.name * -356911569 != -1) {
                if (!Settings.this$0.get(834178112)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "cn.bf(" + ')');
        }
    }

    public abstract void add(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j);

    public abstract void add(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void add(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void add(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public abstract void get(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j);

    public abstract void process(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void read(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j);

    public abstract void remove(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract void toString(ArrayMap arrayMap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j);

    public abstract void toString(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract void toString(Integer integer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);
}
