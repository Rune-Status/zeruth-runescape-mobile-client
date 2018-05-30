package p000;

import java.io.File;

/* compiled from: na */
public interface DatabaseResults {
    File close(int i);

    File get(int i, byte b);

    File get(String str, String str2, int i, int i2);

    File getBoolean();

    File getBoolean(String str, String str2, int i);

    File getBytes();

    File getBytes(int i);

    File getBytes(String str, String str2, int i);

    File getLong(int i);

    File getLong(String str, String str2, int i);

    File read(int i);
}
