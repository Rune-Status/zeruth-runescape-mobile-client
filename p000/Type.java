package p000;

/* compiled from: ev */
public abstract class Type {
    public static final int HEADER = 72;
    static final int PLS = 2;
    public int count;
    public int id;
    public int size;
    public int value;

    protected Type() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ev.<init>(" + ')');
        }
    }

    public static boolean add(long $l0) {
        boolean $z0 = $l0 != 0;
        if (!$z0) {
            return $z0;
        }
        return !(((int) (($l0 >>> 16) & 1)) == 1);
    }

    public static R$attr[] write(byte b) {
        try {
            R$attr[] $r0 = new R$attr[84];
            $r0[0] = R$attr.settings;
            $r0[1] = R$attr.count;
            $r0[2] = R$attr.context;
            $r0[3] = R$attr.handler;
            $r0[4] = R$attr.port;
            $r0[5] = R$attr.host;
            $r0[6] = R$attr.user;
            $r0[7] = R$attr.title;
            $r0[8] = R$attr.owner;
            $r0[9] = R$attr.filename;
            $r0[10] = R$attr.line;
            $r0[11] = R$attr.offset;
            $r0[12] = R$attr.encoding;
            $r0[13] = R$attr.out;
            $r0[14] = R$attr.inflater;
            $r0[15] = R$attr.children;
            $r0[16] = R$attr.start;
            $r0[17] = R$attr.content;
            $r0[18] = R$attr.length;
            $r0[19] = R$attr.items;
            $r0[20] = R$attr.lock;
            $r0[21] = R$attr.left;
            $r0[22] = R$attr.right;
            $r0[23] = R$attr.parent;
            $r0[24] = R$attr.f231g;
            $r0[25] = R$attr.f232s;
            $r0[26] = R$attr.root;
            $r0[27] = R$attr.values;
            $r0[28] = R$attr.type;
            $r0[29] = R$attr.body;
            $r0[30] = R$attr.header;
            $r0[31] = R$attr.file;
            $r0[32] = R$attr.password;
            $r0[33] = R$attr.err;
            $r0[34] = R$attr.options;
            $r0[35] = R$attr.TAG;
            $r0[36] = R$attr.version;
            $r0[37] = R$attr.key;
            $r0[38] = R$attr.listener;
            $r0[39] = R$attr.active;
            $r0[40] = R$attr.address;
            $r0[41] = R$attr.label;
            $r0[42] = R$attr.enabled;
            $r0[43] = R$attr.level;
            $r0[44] = R$attr.value;
            $r0[45] = R$attr.format;
            $r0[46] = R$attr.writer;
            $r0[47] = R$attr.builder;
            $r0[48] = R$attr.style;
            $r0[49] = R$attr.props;
            $r0[50] = R$attr.transform;
            $r0[51] = R$attr.position;
            $r0[52] = R$attr.$assertionsDisabled;
            $r0[53] = R$attr.points;
            $r0[54] = R$attr.TYPE;
            $r0[55] = R$attr.f233x;
            $r0[56] = R$attr.f234y;
            $r0[57] = R$attr.f230a;
            $r0[58] = R$attr.size;
            $r0[59] = R$attr.INSTANCE;
            $r0[60] = R$attr.filter;
            $r0[61] = R$attr.index;
            $r0[62] = R$attr.tag;
            $r0[63] = R$attr.message;
            $r0[64] = R$attr.defaultValue;
            $r0[65] = R$attr.max;
            $r0[66] = R$attr.path;
            $r0[67] = R$attr.min;
            $r0[68] = R$attr.id;
            $r0[69] = R$attr.map;
            $r0[70] = R$attr.queue;
            $r0[71] = R$attr.pos;
            $r0[72] = R$attr.name;
            $r0[73] = R$attr.text;
            $r0[74] = R$attr.this$0;
            $r0[75] = R$attr.members;
            $r0[76] = R$attr.log;
            $r0[77] = R$attr.session;
            $r0[78] = R$attr.stream;
            $r0[79] = R$attr.buf;
            $r0[80] = R$attr.data;
            $r0[81] = R$attr.state;
            $r0[82] = R$attr.logger;
            $r0[83] = R$attr.directory;
            return $r0;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ev.af(" + ')');
        }
    }

    protected abstract boolean check(int i, int i2, int i3, Context context);

    protected abstract boolean equals(int i, int i2, int i3, Context context);

    protected abstract boolean get(int i, int i2, int i3, Context context);

    protected abstract boolean get(int i, int i2, int i3, Context context, byte b);
}
