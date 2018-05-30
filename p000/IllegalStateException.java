package p000;

/* compiled from: ad */
public class IllegalStateException {
    static final int ATTENDEES_INDEX_RELATIONSHIP = 3;
    static final int FILE_TYPE_DIVX = 31;
    static final int MIN_FLING_VELOCITY = 400;

    IllegalStateException() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ad.<init>(" + ')');
        }
    }

    static int add(Date date, int i, int i2) {
        if (date == null) {
            return i2;
        }
        Value $r2 = (Value) date.get((long) i);
        return $r2 != null ? $r2.value : i2;
    }

    static final Date add(Logger logger, Date $r1) {
        int $i0 = logger.get((byte) 0);
        if ($r1 == null) {
            int $i1 = $i0 - 1;
            $i1 |= $i1 >>> 1;
            $i1 |= $i1 >>> 2;
            $i1 |= $i1 >>> 4;
            $i1 |= $i1 >>> 8;
            $r1 = r4;
            Date r4 = new Date(($i1 | ($i1 >>> 16)) + 1);
        }
        for ($i1 = 0; $i1 < $i0; $i1++) {
            Object $r2;
            boolean $z0 = logger.get((byte) 0) == 1;
            int $i2 = logger.set(-1410926840);
            if ($z0) {
                $r2 = r5;
                Object r5 = new Shell(logger.toString(1975136943));
            } else {
                $r2 = r6;
                Object r6 = new Value(logger.size(987417519));
            }
            $r1.get($r2, (long) $i2);
        }
        return $r1;
    }

    static final Date add(Logger logger, Date date, byte b) {
        try {
            int $i2;
            int $i1 = logger.get((byte) 0);
            if (date == null) {
                $i2 = $i1 - 1;
                $i2 |= $i2 >>> 1;
                $i2 |= $i2 >>> 2;
                $i2 |= $i2 >>> 4;
                $i2 |= $i2 >>> 8;
                date = r7;
                Date r7 = new Date(($i2 | ($i2 >>> 16)) + 1);
            }
            for ($i2 = 0; $i2 < $i1; $i2++) {
                Object $r2;
                boolean $z0 = logger.get((byte) 0) == 1;
                int $i3 = logger.set(1881715191);
                if ($z0) {
                    $r2 = r8;
                    Object r8 = new Shell(logger.toString(1405173544));
                } else {
                    $r2 = r9;
                    Object r9 = new Value(logger.size(-719710469));
                }
                date.get($r2, (long) $i3);
            }
            return date;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ad.af(" + ')');
        }
    }

    static String add(Date date, int i, String $r2) {
        if (date == null) {
            return $r2;
        }
        Shell $r3 = (Shell) date.get((long) i);
        if ($r3 != null) {
            $r2 = (String) $r3.activity;
        }
        return $r2;
    }

    static final void add(byte b) {
        int[] $r0 = Database.next;
        for (int $i2 = 0; $i2 < -1675758365 * Database.size; $i2++) {
            Item $r2 = client.size[$r0[$i2]];
            if ($r2 != null) {
                if ($r2.buffer * 842381197 > 0) {
                    try {
                        $r2.buffer -= 942826309;
                        if ($r2.buffer * 842381197 == 0) {
                            $r2.f63b = null;
                        } else {
                            continue;
                        }
                    } catch (RuntimeException $r5) {
                        throw StringBuilder.append($r5, "ad.ba(" + ')');
                    }
                }
                continue;
            }
        }
        for (int $i1 = 0; $i1 < 453104899 * client.length; $i1++) {
            Time $r4 = client.next[client.hasNext[$i1]];
            if ($r4 != null) {
                if ($r4.buffer * 842381197 > 0) {
                    $r4.buffer -= 942826309;
                    if ($r4.buffer * 842381197 == 0) {
                        $r4.f63b = null;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    static void add(int $i0, int i) {
        byte $b2 = (byte) 0;
        if ($i0 != client.data * -1088302269) {
            if (client.data * -1088302269 == 0) {
                try {
                    client.context.putByte((byte) 16);
                } catch (RuntimeException $r7) {
                    throw StringBuilder.append($r7, "ad.ai(" + ')');
                }
            }
            if (20 == $i0 || 40 == $i0 || $i0 == 45) {
                client.f385a = 0;
                client.hour = 0;
                client.f398n = 0;
                client.names.create($i0, -1596163988);
                if (20 != $i0) {
                    HashMap.add(false, 1135368824);
                }
            }
            if (!($i0 == 20 || 40 == $i0 || JGitText.value == null)) {
                JGitText.value.get(Byte.MIN_VALUE);
                JGitText.value = null;
            }
            if (25 == client.data * -1088302269) {
                client.len = 0;
                client.pos = 0;
                client.exception = 1873613409;
                client.off = 0;
                client.chars = 679308713;
            }
            if (5 == $i0 || 10 == $i0) {
                LinkedList.init(StringBuilder.data, ByteBuffer.this$0, true, 0, client.context.this$0.get(-419639088), (byte) 6);
            } else if ($i0 == 20) {
                HttpRequest $r3 = StringBuilder.data;
                Class $r4 = ByteBuffer.this$0;
                if (client.data * -1088302269 == 11) {
                    $b2 = (byte) 4;
                }
                LinkedList.init($r3, $r4, true, $b2, client.context.this$0.get(-2005395652), (byte) 6);
            } else if (11 == $i0) {
                LinkedList.init(StringBuilder.data, ByteBuffer.this$0, false, 4, client.context.this$0.get(-1209443660), (byte) 6);
            } else {
                ObjectMap.init(-708368827);
                client.context.add((Preference) client.$assertionsDisabled, (byte) 24);
            }
            client.data = 291623275 * $i0;
        }
    }

    static String execute(Date date, int i, String $r2) {
        if (date == null) {
            return $r2;
        }
        Shell $r3 = (Shell) date.get((long) i);
        if ($r3 != null) {
            $r2 = (String) $r3.activity;
        }
        return $r2;
    }

    static String executeCommand(Date date, int i, String $r2) {
        if (date == null) {
            return $r2;
        }
        Shell $r4 = (Shell) date.get((long) i);
        return $r4 == null ? $r2 : (String) $r4.activity;
    }

    static int get(Date date, int i, int i2) {
        if (date == null) {
            return i2;
        }
        Value $r2 = (Value) date.get((long) i);
        return $r2 != null ? $r2.value : i2;
    }

    static final Date read(Logger logger, Date $r1) {
        int $i0 = logger.get((byte) 0);
        if ($r1 == null) {
            int $i1 = $i0 - 1;
            $i1 |= $i1 >>> 1;
            $i1 |= $i1 >>> 2;
            $i1 |= $i1 >>> 4;
            $i1 |= $i1 >>> 8;
            $r1 = r4;
            Date r4 = new Date(($i1 | ($i1 >>> 16)) + 1);
        }
        for ($i1 = 0; $i1 < $i0; $i1++) {
            Object $r2;
            boolean $z0 = logger.get((byte) 0) == 1;
            int $i2 = logger.set(882319090);
            if ($z0) {
                $r2 = r5;
                Object r5 = new Shell(logger.toString(1701146501));
            } else {
                $r2 = r6;
                Object r6 = new Value(logger.size(735681201));
            }
            $r1.get($r2, (long) $i2);
        }
        return $r1;
    }

    static int toString(Date date, int i, int i2) {
        if (date == null) {
            return i2;
        }
        Value $r2 = (Value) date.get((long) i);
        return $r2 != null ? $r2.value : i2;
    }

    static void update(int i) {
        try {
            Path $r2 = client.context.getInstance(-1290553606).getData(664971502);
            $r2.add(Contact.text, 0, -1371752334);
            $r2.add(Contact.data, 1, 173342490);
            if (Contact.level && Contact.text != null) {
                if (Contact.text.length() > 0) {
                    Contact.f108x = 291675233;
                    client.context.getInstance(-1290553606).getData(664971502).toString(1, 549981377);
                    return;
                }
            }
            Contact.f108x = 0;
            client.context.getInstance(-1290553606).getData(664971502).toString(0, -875488061);
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ad.ay(" + ')');
        }
    }
}
