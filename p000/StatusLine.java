package p000;

/* compiled from: cy */
public interface StatusLine {
    boolean add(int i, int i2);

    int clear();

    Token clear(int i);

    boolean equals(int i);

    boolean equals(int i, int i2);

    int get(byte b);

    Token get(int i, byte b);

    int[] get(int i);

    int[] get(int i, short s);

    int hashCode(int i);

    boolean moveTo(int i);

    int[][] parse();

    int[][] parse(int i);

    int peek();

    int peek(int i);

    int pop(int i);

    boolean process(int i);

    Token read(int i);

    int[] remove(int i);

    boolean size(int i);

    boolean skip(int i);

    int toString(int i, int i2);

    int[] toString(int i);
}
