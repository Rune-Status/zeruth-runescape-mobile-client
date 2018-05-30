package p000;

/* compiled from: le */
public class DatabaseUtil {
    static final int DB_VERSION = 3;
    static final int NAME = 0;
    static int[] buffer;
    static String data = null;

    DatabaseUtil() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "le.<init>(" + ')');
        }
    }

    public static void close(Object obj, String str) {
        data = str;
    }

    public static void close(String str, boolean z, boolean z2) {
        if (!z) {
            AsyncTask.get(str, 3, (byte) 3);
        } else if (data.startsWith("win") && !z2) {
            AsyncTask.get(str, 0, (byte) 3);
        } else if (data.startsWith("mac")) {
            Tools.add(str, 1, "openjs", -2043536893);
        } else {
            AsyncTask.get(str, 2, (byte) 3);
        }
    }

    public static void delete(Object obj, String str) {
        data = str;
    }

    public static void delete(String str, boolean z, boolean z2) {
        if (!z) {
            AsyncTask.get(str, 3, (byte) 3);
        } else if (data.startsWith("win") && !z2) {
            AsyncTask.get(str, 0, (byte) 3);
        } else if (data.startsWith("mac")) {
            Tools.add(str, 1, "openjs", -2043536893);
        } else {
            AsyncTask.get(str, 2, (byte) 3);
        }
    }

    public static void insert(Object obj, String str) {
        data = str;
    }

    public static void insert(String str, boolean z, boolean z2) {
        if (!z) {
            AsyncTask.get(str, 3, (byte) 3);
        } else if (data.startsWith("win") && !z2) {
            AsyncTask.get(str, 0, (byte) 3);
        } else if (data.startsWith("mac")) {
            Tools.add(str, 1, "openjs", -2043536893);
        } else {
            AsyncTask.get(str, 2, (byte) 3);
        }
    }

    public static void loadAsync(Object obj, String str) {
        data = str;
    }

    public static void onListItemClick(String str, boolean z, boolean z2) {
        if (!z) {
            AsyncTask.get(str, 3, (byte) 3);
        } else if (data.startsWith("win") && !z2) {
            AsyncTask.get(str, 0, (byte) 3);
        } else if (data.startsWith("mac")) {
            Tools.add(str, 1, "openjs", -2043536893);
        } else {
            AsyncTask.get(str, 2, (byte) 3);
        }
    }

    public static void update(Object obj, String str) {
        data = str;
    }

    public static void update(String str, boolean z, boolean z2) {
        if (!z) {
            AsyncTask.get(str, 3, (byte) 3);
        } else if (data.startsWith("win") && !z2) {
            AsyncTask.get(str, 0, (byte) 3);
        } else if (data.startsWith("mac")) {
            Tools.add(str, 1, "openjs", -2043536893);
        } else {
            AsyncTask.get(str, 2, (byte) 3);
        }
    }

    static boolean update(String str, int i) {
        return Tools.add(str, i, "openjs", -2043536893);
    }
}
