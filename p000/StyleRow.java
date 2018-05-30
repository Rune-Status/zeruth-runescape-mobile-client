package p000;

import java.nio.ByteBuffer;

/* compiled from: ii */
public class StyleRow extends Property {
    ByteBuffer buf;

    StyleRow() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ii.<init>(" + ')');
        }
    }

    void allocate(byte[] bArr) {
        this.buf = ByteBuffer.allocateDirect(bArr.length);
        this.buf.position(0);
        this.buf.put(bArr);
    }

    void copy(byte[] bArr) {
        this.buf = ByteBuffer.allocateDirect(bArr.length);
        this.buf.position(0);
        this.buf.put(bArr);
    }

    void copy(byte[] bArr, int i) {
        try {
            this.buf = ByteBuffer.allocateDirect(bArr.length);
            this.buf.position(0);
            this.buf.put(bArr);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ii.ag(" + ')');
        }
    }

    byte[] copy() {
        byte[] $r2 = new byte[this.buf.capacity()];
        this.buf.position(0);
        this.buf.get($r2);
        return $r2;
    }

    byte[] get() {
        byte[] $r2 = new byte[this.buf.capacity()];
        this.buf.position(0);
        this.buf.get($r2);
        return $r2;
    }

    byte[] get(int i) {
        try {
            byte[] $r2 = new byte[this.buf.capacity()];
            this.buf.position(0);
            this.buf.get($r2);
            return $r2;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ii.aa(" + ')');
        }
    }
}
