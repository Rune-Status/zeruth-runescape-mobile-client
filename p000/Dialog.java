package p000;

/* compiled from: gb */
public class Dialog {
    static byte[][][] index;
    static Long[] type;
    int f113b;
    long id;
    int name;
    Page path;
    int status;
    int title;

    public Dialog() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gb.<init>(" + ')');
        }
    }

    public static int add(String str, int i) {
        try {
            return str.length() + 2;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gb.am(" + ')');
        }
    }

    final void add(Preference preference, int i) {
        try {
            switch (-101668333 * this.path.base) {
                case 0:
                    preference.add(2101218755 * this.name, -1835995739 * this.status, 335447501 * this.title, -2022910059 * this.f113b, -2183583863069760901L * this.id);
                    return;
                case 1:
                    preference.add(this.name * 2101218755, this.id * -2183583863069760901L);
                    return;
                case 2:
                    preference.toString(this.name * 2101218755, this.id * -2183583863069760901L);
                    return;
                case 3:
                    preference.init(2101218755 * this.name, 335447501 * this.title, this.f113b * -2022910059, this.id * -2183583863069760901L);
                    return;
                case 4:
                    preference.init(2101218755 * this.name, -1835995739 * this.status, 335447501 * this.title, -2022910059 * this.f113b, -2183583863069760901L * this.id);
                    return;
                case 5:
                    preference.init(this.title * 335447501, this.f113b * -2022910059, this.id * -2183583863069760901L);
                    return;
                case 6:
                    preference.send(this.name * 2101218755, this.id * -2183583863069760901L);
                    return;
                case 7:
                    char $c5 = this.name * 'ස';
                    char c = $c5;
                    preference.add((char) $c5, this.id * -2183583863069760901L);
                    return;
                default:
                    throw new IllegalStateException();
            }
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "gb.af(" + ')');
        }
        throw StringBuilder.append($r4, "gb.af(" + ')');
    }
}
