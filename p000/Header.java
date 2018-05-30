package p000;

/* compiled from: fs */
public abstract class Header extends Object {
    int value;

    Header() throws Throwable {
        throw new Error();
    }

    abstract int getField(Field field);

    abstract int getValue(Field field);

    abstract void init();

    abstract void setField();

    abstract int setValue(Field field);
}
