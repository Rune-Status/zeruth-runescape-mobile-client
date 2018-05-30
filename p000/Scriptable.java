package p000;

/* compiled from: eb */
public interface Scriptable {
    JSONObject getClassName();

    JSONObject getEntry(int i);

    JSONObject getType();

    JSONObject nextToken();
}
