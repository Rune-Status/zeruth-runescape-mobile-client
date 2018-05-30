package p000;

import java.io.IOException;
import java.net.Socket;

/* compiled from: md */
public abstract class Headers {
    Headers() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "md.<init>(" + ')');
        }
    }

    public static Headers add(Socket socket, int i, int i2) throws IOException {
        return new TCharArrayList(socket, i, i2);
    }

    public static Headers addAll(Socket socket, int i, int i2) throws IOException {
        return new TCharArrayList(socket, i, i2);
    }

    public abstract void add();

    public abstract void add(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract boolean add(int i) throws IOException;

    public abstract boolean add(int i, byte b) throws IOException;

    public abstract void addAll(byte[] bArr, int i, int i2) throws IOException;

    public abstract void clear();

    public abstract void close();

    public abstract int fill() throws IOException;

    public abstract int get() throws IOException;

    public abstract int get(int i) throws IOException;

    public abstract int get(byte[] bArr, int i, int i2) throws IOException;

    public abstract int get(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract void get(byte b);

    public abstract int indexOf() throws IOException;

    public abstract int indexOf(byte[] bArr, int i, int i2) throws IOException;

    public abstract void insert(byte[] bArr, int i, int i2) throws IOException;

    public abstract int peek() throws IOException;

    public abstract int read() throws IOException;

    public abstract int remove() throws IOException;

    public abstract void set();

    public abstract void set(byte[] bArr, int i, int i2) throws IOException;

    public abstract int toString(int i) throws IOException;

    public abstract int toString(byte[] bArr, int i, int i2) throws IOException;
}
