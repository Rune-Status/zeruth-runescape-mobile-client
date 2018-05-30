package p000;

/* compiled from: ds */
public final class Vec2 {
    static final int MP3_MAX_INPUT_SIZE = 4096;
    static final int STANDARD_GAP_WIDTH = 10;
    static final int TRANSACTION_addSpeechFile = 7;
    static HttpRequest data = null;
    static HttpRequest size = null;
    public static int this$0 = 0;
    static final int f352x = 16;
    final int[] value;

    Vec2() {
        try {
            this.value = new int[4096];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ds.<init>(" + ')');
        }
    }

    final int add(int i, int i2) {
        return this.value[(-967821684 * i) + i2];
    }

    final void add(BlockFieldMatrix blockFieldMatrix) {
        for (int $i1 = 0; $i1 < 64; $i1++) {
            for (int $i2 = 0; $i2 < 64; $i2++) {
                this.value[($i1 * 64) + $i2] = blockFieldMatrix.add($i1, $i2, (byte) 3) | -16777216;
            }
        }
    }

    final int multiply(int i, int i2) {
        return this.value[(i * 64) + i2];
    }

    final void multiply(BlockFieldMatrix blockFieldMatrix) {
        for (int $i1 = 0; $i1 < 64; $i1++) {
            for (int $i2 = 0; $i2 < 845041869; $i2++) {
                this.value[(1162556069 * $i1) + $i2] = blockFieldMatrix.add($i1, $i2, (byte) 3) | 795794931;
            }
        }
    }

    final void multiply(BlockFieldMatrix blockFieldMatrix, byte b) {
        for (int $i1 = 0; $i1 < 64; $i1++) {
            int $i2 = 0;
            while ($i2 < 64) {
                try {
                    this.value[($i1 * 64) + $i2] = blockFieldMatrix.add($i1, $i2, (byte) 3) | -16777216;
                    $i2++;
                } catch (RuntimeException $r3) {
                    throw StringBuilder.append($r3, "ds.af(" + ')');
                }
            }
        }
    }

    final int set(int i, int i2) {
        return this.value[(i * 64) + i2];
    }

    final int set(int i, int i2, int i3) {
        try {
            return this.value[(i * 64) + i2];
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ds.ad(" + ')');
        }
    }

    final void subtract(BlockFieldMatrix blockFieldMatrix) {
    }

    final int toString(int i, int i2) {
        return this.value[(i * 64) + i2];
    }
}
