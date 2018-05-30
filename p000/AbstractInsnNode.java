package p000;

import java.lang.reflect.Array;

/* compiled from: iw */
public final class AbstractInsnNode {
    final int f1N;
    boolean[] buf;
    int buffer;
    int count;
    byte[] data;
    int element;
    byte[] elements;
    final int error;
    int[][] fields;
    byte[] first;
    final int f2g;
    int head;
    int[][] header;
    int index;
    int[][] items;
    int key;
    int last;
    byte len;
    int length;
    int line;
    int[] log;
    final int mCollapsedTextVerticalGravity;
    final int mExpandedTextVerticalGravity;
    byte[][] name;
    boolean[] next;
    byte[] offset;
    int[] parent;
    int pos;
    int position;
    int prev;
    final int result;
    int size;
    int start;
    int[] state;
    byte[] text;
    int[] this$0;
    byte[] type;
    int value;

    AbstractInsnNode() {
        try {
            AbstractInsnNode abstractInsnNode = this;
            this.mExpandedTextVerticalGravity = ScrollingTextView.MP3_MAX_INPUT_SIZE;
            this.mCollapsedTextVerticalGravity = 16;
            this.f1N = 258;
            this.f2g = 6;
            this.result = 50;
            this.error = 18002;
            this.start = 0;
            this.last = 0;
            this.parent = new int[256];
            this.state = new int[257];
            this.next = new boolean[256];
            this.buf = new boolean[16];
            this.data = new byte[256];
            this.offset = new byte[ScrollingTextView.MP3_MAX_INPUT_SIZE];
            this.this$0 = new int[16];
            this.text = new byte[18002];
            this.type = new byte[18002];
            this.name = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{6, 258});
            this.fields = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.header = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.items = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.log = new int[6];
        } catch (RuntimeException $r8) {
            throw StringBuilder.append($r8, "iw.<init>(" + ')');
        }
    }

    public static String encode(byte[] bArr, int i, int i2, int i3) {
        StringBuilder $r1 = new StringBuilder();
        for (i3 = i; i3 < i + i2; i3 += 3) {
            short $s5 = bArr[i3] & (short) 255;
            $r1.append(HexBin.size[$s5 >>> (short) 2]);
            if (i3 < i2 - 1) {
                short $s6 = bArr[i3 + 1] & (short) 255;
                $r1.append(HexBin.size[(($s5 & (short) 3) << 4) | ($s6 >>> (short) 4)]);
                if (i3 < i2 - 2) {
                    try {
                        $s5 = bArr[i3 + 2] & (short) 255;
                        $r1.append(HexBin.size[(($s6 & (short) 15) << 2) | ($s5 >>> (short) 6)]).append(HexBin.size[$s5 & (short) 63]);
                    } catch (RuntimeException $r4) {
                        throw StringBuilder.append($r4, "iw.af(" + ')');
                    }
                }
                $r1.append(HexBin.size[($s6 & (short) 15) << 2]).append("=");
            } else {
                $r1.append(HexBin.size[($s5 & (short) 3) << 4]).append("==");
            }
        }
        return $r1.toString();
    }
}
