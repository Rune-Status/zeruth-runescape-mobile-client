package p000;

import java.io.IOException;
import java.net.Socket;

/* compiled from: my */
public class TCharArrayList extends Headers {
    public static final int Id_cbrt = 20;
    static int[] index;
    Request data;
    Socket delegate;
    DiskLruCache this$0;

    TCharArrayList(Socket socket, int i, int i2) throws IOException {
        try {
            this.delegate = socket;
            this.delegate.setSoTimeout(30000);
            this.delegate.setTcpNoDelay(true);
            this.delegate.setReceiveBufferSize(PingManager.STATE_SENSOR_ON_FLAG);
            this.delegate.setSendBufferSize(PingManager.STATE_SENSOR_ON_FLAG);
            this.this$0 = new DiskLruCache(this.delegate.getInputStream(), i);
            this.data = new Request(this.delegate.getOutputStream(), i2);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "my.<init>(" + ')');
        }
    }

    public void add() {
        this.data.close(-951479974);
        try {
            this.delegate.close();
        } catch (IOException e) {
        }
        this.this$0.close(-255972606);
    }

    public void add(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            this.data.add(bArr, i, i2, (byte) 9);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "my.as(" + ')');
        }
    }

    public boolean add(int i) throws IOException {
        return this.this$0.get(i, -1136663345);
    }

    public boolean add(int i, byte b) throws IOException {
        try {
            return this.this$0.get(i, -968522914);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "my.aa(" + ')');
        }
    }

    protected void addAll() {
        get((byte) -20);
    }

    public void addAll(byte[] bArr, int i, int i2) throws IOException {
        this.data.add(bArr, i, i2, (byte) 2);
    }

    public void clear() {
        this.data.close(-951479974);
        try {
            this.delegate.close();
        } catch (IOException e) {
        }
        this.this$0.close(2027372292);
    }

    public void close() {
        this.data.close(-951479974);
        try {
            this.delegate.close();
        } catch (IOException e) {
        }
        this.this$0.close(51226660);
    }

    public int fill() throws IOException {
        return this.this$0.read(2144726747);
    }

    protected void finalize() {
        try {
            get((byte) -86);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "my.finalize(" + ')');
        }
    }

    public int get() throws IOException {
        return this.this$0.read(-1137400062);
    }

    public int get(int i) throws IOException {
        try {
            return this.this$0.read(-1450659274);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "my.an(" + ')');
        }
    }

    public int get(byte[] bArr, int $i0, int i) throws IOException {
        return this.this$0.get(bArr, $i0, i, -73290051);
    }

    public int get(byte[] bArr, int $i0, int i, int i2) throws IOException {
        try {
            return this.this$0.get(bArr, $i0, i, 463161166);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "my.ag(" + ')');
        }
    }

    public void get(byte b) {
        try {
            this.data.close(-951479974);
            try {
                this.delegate.close();
            } catch (IOException e) {
            }
            this.this$0.close(274982988);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "my.af(" + ')');
        }
    }

    public int indexOf() throws IOException {
        return this.this$0.get(901229119);
    }

    public int indexOf(byte[] bArr, int $i0, int i) throws IOException {
        return this.this$0.get(bArr, $i0, i, 1707098619);
    }

    public void insert(byte[] bArr, int i, int i2) throws IOException {
        this.data.add(bArr, i, i2, (byte) 120);
    }

    public int peek() throws IOException {
        return this.this$0.get(901229119);
    }

    public int read() throws IOException {
        return this.this$0.read(965635108);
    }

    public int remove() throws IOException {
        return this.this$0.get(901229119);
    }

    public void set() {
        this.data.close(-951479974);
        try {
            this.delegate.close();
        } catch (IOException e) {
        }
        this.this$0.close(-1551809741);
    }

    public void set(byte[] bArr, int i, int i2) throws IOException {
        this.data.add(bArr, i, i2, (byte) 14);
    }

    public int toString(int i) throws IOException {
        try {
            return this.this$0.get(901229119);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "my.ad(" + ')');
        }
    }

    public int toString(byte[] bArr, int $i0, int i) throws IOException {
        return this.this$0.get(bArr, $i0, i, 1840679807);
    }
}
