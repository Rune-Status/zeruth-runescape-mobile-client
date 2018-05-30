package p000;

/* compiled from: ih */
public class ISO9796d2Signer {
    static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    static final int CODE_PLAYLISTMEMBER = 11;
    static final int FILE_TYPE_DIVX = 31;
    static final int HINT_CONTEXT_CAR_HOME = 2;
    static final int Id_cbrt = 20;
    static final int Id_pow = 14;
    static final int TAG_AF_INFO_ARRAY = 18;
    static final int TLS_DHE_RSA_WITH_AES_128_CBC_SHA = 51;
    static final int TRANSACTION_getInfo = 5;
    static final int WEEKS_BUFFER = 1;
    static final int[] block = new int[]{16, 17, 18, 19, 20, 21, 22, 1, 2, 3, 4, 5, 6, 1001, 7, 8, 9, 10, 11, 12, 13, 14, 15, 44, 45, 46, 47, 48, 49, 50, 51, 1002, 1004, 1003};
    static int text = 0;
    static final int trailer = 3;

    ISO9796d2Signer() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ih.<init>(" + ')');
        }
    }

    public static final void init(int $i0, boolean z, int i, int i2) {
        if ($i0 < 8000 || $i0 > 48000) {
            try {
                throw new IllegalArgumentException();
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "ih.af(" + ')');
            }
        }
        FileInfo.data = -1398464295 * $i0;
        Puzzle.data = z;
        FileInfo.text = -813327613 * i;
    }
}
