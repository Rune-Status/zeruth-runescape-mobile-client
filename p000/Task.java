package p000;

/* compiled from: aw */
public class Task extends BitSet {
    static final int META_SAVEDC = 30;
    static final int VERSION_CODE = 70;
    public static Class activity;
    public static RuntimeException context = new RuntimeException(64, null);
    public static Class data;
    public static RuntimeException this$0 = new RuntimeException(64, null);
    int f311a = -533600739;
    public int f312e = -665517770;
    public int f313i = -96953543;
    public int id = -1763073037;
    public int f314j = -231238218;
    public int length = 642169897;
    public int name;
    public int f315s = 1550244493;
    int state = -458835651;
    public int type = 0;

    public static final boolean execute(System system, int i) {
        try {
            i = system.context * -586529633;
            if (205 == i) {
                client.text = -1012553922;
                return true;
            }
            if (i >= 300 && i <= 313) {
                client.hash.toString((i - 300) / 2, 1 == (i & 1), (byte) -63);
            }
            if (i >= 314 && i <= 323) {
                client.hash.parse((i - 314) / 2, 1 == (i & 1), 1624417948);
            }
            if (324 == i) {
                client.hash.get(false, -500776324);
            }
            if (325 == i) {
                client.hash.get(true, -500776324);
            }
            if (i != 326) {
                return false;
            }
            Config $r5 = Logger.add(R$string.queue, client.this$0.key, (byte) 5);
            client.hash.add($r5.this$0, (byte) 67);
            client.this$0.add($r5, (short) 255);
            return true;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "aw.fu(" + ')');
        }
    }

    public static final boolean write(char c, int i) {
        try {
            if (Character.isISOControl(c)) {
                return false;
            }
            if (Logger.write(c, (byte) 112)) {
                return true;
            }
            char[] $r0 = StorageManager.$assertionsDisabled;
            for (char $c3 : $r0) {
                if ($c3 == c) {
                    return true;
                }
            }
            $r0 = StorageManager.log;
            for (char $c32 : $r0) {
                if (c == $c32) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "aw.ad(" + ')');
        }
    }

    public void create(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, (byte) 40);
            } else {
                return;
            }
        }
    }

    public void create(Logger logger, int i) {
        while (true) {
            try {
                i = logger.get((byte) 0);
                if (i != 0) {
                    init(logger, i, (byte) 40);
                } else {
                    return;
                }
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aw.af(" + ')');
            }
        }
    }

    public Long destroy() {
        if (this.state * -635364885 < 0) {
            return null;
        }
        Long $r2 = (Long) this$0.get((long) (this.state * -635364885));
        if ($r2 == null) {
            $r2 = AssertionError.get(data, this.state * -794451677, 0, (byte) 0);
            if ($r2 != null) {
                this$0.get($r2, (long) (this.state * -635364885));
                return $r2;
            }
        }
        return $r2;
    }

    public Long exec() {
        if (this.f311a * 1664480203 < 0) {
            return null;
        }
        Long $r2 = (Long) this$0.get((long) (this.f311a * 1664480203));
        if ($r2 == null) {
            $r2 = AssertionError.get(data, this.f311a * 1664480203, 0, (byte) 0);
            if ($r2 != null) {
                this$0.get($r2, (long) (this.f311a * 1664480203));
                return $r2;
            }
        }
        return $r2;
    }

    public Long execute() {
        if (this.state * -635364885 < 0) {
            return null;
        }
        Long $r3 = (Long) this$0.get((long) (this.state * -635364885));
        if ($r3 == null) {
            $r3 = AssertionError.get(data, this.state * -635364885, 0, (byte) 0);
            if ($r3 != null) {
                this$0.get($r3, (long) (this.state * -635364885));
            }
        }
        return $r3;
    }

    public Long get(byte b) {
        try {
            int $i1 = this.state;
            Object obj = this;
            if ($i1 * -635364885 < 0) {
                return null;
            }
            RuntimeException $r1 = this$0;
            $i1 = obj.state;
            obj = obj;
            Long $r3 = (Long) $r1.get((long) ($i1 * -635364885));
            if ($r3 == null) {
                Class $r4 = data;
                $i1 = obj.state;
                obj = obj;
                $r3 = AssertionError.get($r4, $i1 * -635364885, 0, (byte) 0);
                if ($r3 != null) {
                    $r1 = this$0;
                    $i1 = obj.state;
                    obj = obj;
                    $r1.get($r3, (long) ($i1 * -635364885));
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "aw.aa(" + ')');
        }
    }

    public Long getObject() {
        if (2045918762 * this.f311a < 0) {
            return null;
        }
        Long $r3 = (Long) this$0.get((long) (817139870 * this.f311a));
        if ($r3 == null) {
            $r3 = AssertionError.get(data, 1067161343 * this.f311a, 0, (byte) 0);
            if ($r3 != null) {
                this$0.get($r3, (long) (1410534464 * this.f311a));
            }
        }
        return $r3;
    }

    public Long getResult() {
        if (this.state * -635364885 < 0) {
            return null;
        }
        Long $r3 = (Long) this$0.get((long) (this.state * -635364885));
        if ($r3 == null) {
            $r3 = AssertionError.get(data, this.state * -635364885, 0, (byte) 0);
            if ($r3 != null) {
                this$0.get($r3, (long) (this.state * -635364885));
            }
        }
        return $r3;
    }

    public void init(Logger logger) {
        while (true) {
            int $i0 = logger.get((byte) 0);
            if ($i0 != 0) {
                init(logger, $i0, (byte) 40);
            } else {
                return;
            }
        }
    }

    void init(Logger logger, int $i0) {
        if ($i0 == 1) {
            logger.get(-1997351182);
        } else if (2 == $i0) {
            this.length = logger.get((byte) 0) * -1378608425;
        } else if ($i0 == 3) {
            this.id = logger.get((byte) 0) * -955363569;
        } else if ($i0 == 4) {
            this.f313i = 0;
        } else if (5 == $i0) {
            this.f312e = logger.get(-1647892054) * 620770602;
        } else if (6 == $i0) {
            logger.get((byte) 0);
        } else if ($i0 == 7) {
            this.f311a = logger.add(1408587219) * 533600739;
        } else if (8 == $i0) {
            this.state = logger.add(2021546622) * -244899047;
        } else if ($i0 == 11) {
            this.f313i = logger.get(2084373156) * -1500903126;
        } else {
            if (14 == $i0) {
                this.f314j = logger.get((byte) 0) * 421788789;
            } else if ($i0 == 15) {
                this.type = logger.get((byte) 0) * 75592;
            }
        }
    }

    void init(Logger logger, int $i0, byte b) {
        if ($i0 == 1) {
            try {
                logger.get(-1144029955);
            } catch (RuntimeException $r2) {
                throw StringBuilder.append($r2, "aw.ad(" + ')');
            }
        } else if (2 == $i0) {
            this.length = logger.get((byte) 0) * -1378608425;
        } else if ($i0 == 3) {
            this.id = logger.get((byte) 0) * -394303219;
        } else if ($i0 == 4) {
            this.f313i = 0;
        } else if (5 == $i0) {
            this.f312e = logger.get(-1449089509) * 1831192873;
        } else if (6 == $i0) {
            logger.get((byte) 0);
        } else if ($i0 == 7) {
            this.f311a = logger.add(1637351187) * 533600739;
        } else if (8 == $i0) {
            this.state = logger.add(1701349116) * 458835651;
        } else if ($i0 == 11) {
            this.f313i = logger.get(590812230) * 96953543;
        } else if (14 == $i0) {
            this.f314j = logger.get((byte) 0) * 421788789;
        } else {
            if ($i0 == 15) {
                this.type = logger.get((byte) 0) * 1070260705;
            }
        }
    }

    void next(Logger logger, int $i0) {
        if ($i0 == 1) {
            logger.get(2139171740);
        } else if (2 == $i0) {
            this.length = logger.get((byte) 0) * -1378608425;
        } else if ($i0 == 3) {
            this.id = logger.get((byte) 0) * 710279037;
        } else if ($i0 == 4) {
            this.f313i = 0;
        } else if (5 == $i0) {
            this.f312e = logger.get(1045361136) * 1831192873;
        } else if (6 == $i0) {
            logger.get((byte) 0);
        } else if ($i0 == 7) {
            this.f311a = logger.add(1948409435) * 533600739;
        } else if (8 == $i0) {
            this.state = logger.add(1776162478) * 458835651;
        } else if ($i0 == 11) {
            this.f313i = logger.get(-21840347) * 1229786744;
        } else if (14 == $i0) {
            this.f314j = logger.get((byte) 0) * 421788789;
        } else {
            if ($i0 == 15) {
                this.type = logger.get((byte) 0) * -1809308229;
            }
        }
    }

    public Long save() {
        if (-90732029 * this.f311a < 0) {
            return null;
        }
        Long $r2 = (Long) this$0.get((long) (-996614356 * this.f311a));
        if ($r2 == null) {
            $r2 = AssertionError.get(data, 1970265711 * this.f311a, 0, (byte) 0);
            if ($r2 != null) {
                this$0.get($r2, (long) (1664480203 * this.f311a));
                return $r2;
            }
        }
        return $r2;
    }

    public Long start() {
        if (this.f311a * 1664480203 < 0) {
            return null;
        }
        Long $r2 = (Long) this$0.get((long) (this.f311a * 1664480203));
        if ($r2 == null) {
            $r2 = AssertionError.get(data, this.f311a * 1664480203, 0, (byte) 0);
            if ($r2 != null) {
                this$0.get($r2, (long) (this.f311a * 1664480203));
                return $r2;
            }
        }
        return $r2;
    }

    public Long toString(byte b) {
        try {
            int $i1 = this.f311a;
            Object obj = this;
            if ($i1 * 1664480203 < 0) {
                return null;
            }
            RuntimeException $r1 = this$0;
            $i1 = obj.f311a;
            obj = obj;
            Long $r3 = (Long) $r1.get((long) ($i1 * 1664480203));
            if ($r3 == null) {
                Class $r4 = data;
                $i1 = obj.f311a;
                obj = obj;
                $r3 = AssertionError.get($r4, $i1 * 1664480203, 0, (byte) 0);
                if ($r3 != null) {
                    $r1 = this$0;
                    $i1 = obj.f311a;
                    obj = obj;
                    $r1.get($r3, (long) ($i1 * 1664480203));
                    return $r3;
                }
            }
            return $r3;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "aw.an(" + ')');
        }
    }
}
