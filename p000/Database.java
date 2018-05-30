package p000;

/* compiled from: gw */
public class Database {
    static int[] $assertionsDisabled = new int[Constants.ACC_STRICT];
    static final int VERSION = 2;
    public static int buffer;
    static int[] context = new int[Constants.ACC_STRICT];
    static int data = 0;
    static HttpRequest header;
    static Logger[] id = new Logger[Constants.ACC_STRICT];
    static int[] key = new int[Constants.ACC_STRICT];
    static Logger logger = new Logger(new byte[5000]);
    static int[] name = new int[Constants.ACC_STRICT];
    public static int[] next = new int[Constants.ACC_STRICT];
    static byte[] parent = new byte[Constants.ACC_STRICT];
    public static int size = 0;
    static int state = 0;
    static byte[] type = new byte[Constants.ACC_STRICT];
    static int[] values = new int[Constants.ACC_STRICT];

    Database() throws Throwable {
        try {
            throw new Error();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gw.<init>(" + ')');
        }
    }

    static void init() {
        size = 0;
        for (int $i0 = 0; $i0 < Constants.ACC_STRICT; $i0++) {
            id[$i0] = null;
            parent[$i0] = (byte) 1;
        }
    }

    static final void init(Handler handler) {
        handler.debug(1565299499);
        int $i0 = client.flags * -2008569217;
        Item[] $r1 = client.size;
        Item $r2 = new Item();
        $r1[$i0] = $r2;
        File.this$0 = $r2;
        $r2.f163n = 143390840 * $i0;
        int $i1 = handler.add(30, (byte) -15);
        byte $b3 = (byte) ($i1 >> 28);
        int $i2 = ($i1 >> 14) & 16383;
        $i1 &= 16383;
        $r2.this$0[0] = $i2 - (Build$VERSION.type * 1570707981);
        $r2.size = (($r2.this$0[0] << 7) + ($r2.getKey(-2099411658) << 6)) * 1506829721;
        $r2.length[0] = $i1 - (Level.type * -2009533281);
        $r2.value = (($r2.length[0] << 7) + ($r2.getKey(-1974268155) << 6)) * -686833664;
        $i1 = 1651220631 * $b3;
        $r2.context = $i1;
        Msg.size = $i1 * 1582934563;
        if (id[$i0] != null) {
            $r2.add(id[$i0], -1635189479);
        }
        size = 0;
        int[] $r3 = next;
        $i1 = size - 1328615221;
        size = $i1;
        $r3[($i1 * -1675758365) - 1] = $i0;
        type[$i0] = (byte) 0;
        state = 0;
        for ($i1 = 1; $i1 < 1160418157; $i1++) {
            if ($i1 != $i0) {
                $i2 = handler.add(18, (byte) -95);
                int $i4 = $i2 >> 16;
                int $i5 = ($i2 >> 8) & -1478936582;
                values[$i1] = ($i2 & -1489751259) + (($i4 << 28) + ($i5 << 14));
                $assertionsDisabled[$i1] = 0;
                name[$i1] = -1;
                $r3 = key;
                $i2 = state - 1369387450;
                state = $i2;
                $r3[($i2 * -844313837) - 1] = $i1;
                type[$i1] = (byte) 0;
            }
        }
        handler.create(1885733558);
    }

    static void init(Handler handler, int $i0) {
        int $i1;
        boolean $z0 = handler.add(1, (byte) -77) == 1;
        if ($z0) {
            int[] $r1 = context;
            $i1 = data + 1377463787;
            data = $i1;
            $r1[($i1 * 482038467) - 1] = $i0;
        }
        $i1 = handler.add(2, (byte) -3);
        Item $r3 = client.size[$i0];
        if ($i1 == 0) {
            if ($z0) {
                $r3.id = false;
            } else if ($i0 == -1522892003 * client.flags) {
                throw new RuntimeException();
            } else {
                values[$i0] = (($r3.length[0] + (1289967967 * Level.type)) >> 13) + (((-277606385 * $r3.context) << 28) + ((($r3.this$0[0] + (Build$VERSION.type * 1407993063)) >> 13) << 14));
                if (323118731 * $r3.next != -1) {
                    $assertionsDisabled[$i0] = 323118731 * $r3.next;
                } else {
                    $assertionsDisabled[$i0] = -1058596255 * $r3.name;
                }
                name[$i0] = $r3.key * -609375913;
                client.size[$i0] = null;
                if (handler.add(1, (byte) -100) != 0) {
                    FileUtils.add(handler, $i0, 1349631211);
                }
            }
        } else if (1 == $i1) {
            $i3 = handler.add(3, (byte) -25);
            $i2 = $r3.this$0[0];
            $i1 = $r3.length[0];
            if ($i3 == 0) {
                $i2--;
                $i1--;
            } else if (1 == $i3) {
                $i1--;
            } else if ($i3 == 2) {
                $i2++;
                $i1--;
            } else if ($i3 == 3) {
                $i2--;
            } else if ($i3 == 4) {
                $i2++;
            } else if (5 == $i3) {
                $i2--;
                $i1++;
            } else if ($i3 == 6) {
                $i1++;
            } else if (7 == $i3) {
                $i2++;
                $i1++;
            }
            if ($i0 == -1522892003 * client.flags && ($r3.size * 516759209 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i1, -1932079817);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i1;
            } else {
                $r3.id = false;
                $r3.get($i2, $i1, parent[$i0], -1859334855);
            }
        } else if (2 == $i1) {
            $i3 = handler.add(4, (byte) -31);
            $i2 = $r3.this$0[0];
            $i1 = $r3.length[0];
            if ($i3 == 0) {
                $i2 -= 2;
                $i1 -= 2;
            } else if (1 == $i3) {
                $i2--;
                $i1 -= 2;
            } else if (2 == $i3) {
                $i1 -= 2;
            } else if ($i3 == 3) {
                $i2++;
                $i1 -= 2;
            } else if ($i3 == 4) {
                $i2 += 2;
                $i1 -= 2;
            } else if ($i3 == 5) {
                $i2 -= 2;
                $i1--;
            } else if (6 == $i3) {
                $i2 += 2;
                $i1--;
            } else if (7 == $i3) {
                $i2 -= 2;
            } else if (8 == $i3) {
                $i2 += 2;
            } else if (9 == $i3) {
                $i2 -= 2;
                $i1++;
            } else if ($i3 == 10) {
                $i2 += 2;
                $i1++;
            } else if (11 == $i3) {
                $i2 -= 2;
                $i1 += 2;
            } else if (12 == $i3) {
                $i2--;
                $i1 += 2;
            } else if ($i3 == 13) {
                $i1 += 2;
            } else if (14 == $i3) {
                $i2++;
                $i1 += 2;
            } else if ($i3 == 15) {
                $i2 += 2;
                $i1 += 2;
            }
            if (-1522892003 * client.flags == $i0 && (516759209 * $r3.size < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i1, -1656084609);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i1;
            } else {
                $r3.id = false;
                $r3.get($i2, $i1, parent[$i0], -1518418587);
            }
        } else if (handler.add(1, (byte) -121) == 0) {
            $i3 = handler.add(12, (byte) 6);
            $i1 = $i3 >> 10;
            $i2 = ($i3 >> 5) & 31;
            if ($i2 > 15) {
                $i2 -= 32;
            }
            $i3 &= 31;
            if ($i3 > 15) {
                $i3 -= 32;
            }
            $i2 += $r3.this$0[0];
            $i3 += $r3.length[0];
            if (client.flags * -1522892003 == $i0 && ($r3.size * 516759209 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i3, -1618486814);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i3;
            } else {
                $r3.id = false;
                $r3.get($i2, $i3, parent[$i0], -495292582);
            }
            $r3.context = ((byte) (((-277606385 * $r3.context) + $i1) & 3)) * -1345790225;
            if (client.flags * -1522892003 == $i0) {
                Msg.size = $r3.context * -1742053899;
            }
        } else {
            $i3 = handler.add(30, (byte) -69);
            $i1 = $i3 >> 28;
            $i2 = ($i3 >> 14) & 16383;
            int $i6 = Build$VERSION.type * 1407993063;
            int i = $i6;
            $i2 = (($i2 + ($r3.this$0[0] + $i6)) & 16383) - (Build$VERSION.type * 1407993063);
            $i3 = ((($i3 & 16383) + ((Level.type * 1289967967) + $r3.length[0])) & 16383) - (1289967967 * Level.type);
            if ($i0 == -1522892003 * client.flags && (516759209 * $r3.size < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || 516759209 * $r3.size >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i3, -2082488995);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i3;
            } else {
                $r3.id = false;
                $r3.get($i2, $i3, parent[$i0], -1551169751);
            }
            $r3.context = -1345790225 * ((byte) (((-277606385 * $r3.context) + $i1) & 3));
            if ($i0 == -1522892003 * client.flags) {
                Msg.size = $r3.context * -1742053899;
            }
        }
    }

    static final void load(Handler handler) {
        handler.debug(1565299499);
        int $i0 = 1414648865 * client.flags;
        Item[] $r1 = client.size;
        Item $r2 = new Item();
        $r1[$i0] = $r2;
        File.this$0 = $r2;
        $r2.f163n = -1174618595 * $i0;
        int $i1 = handler.add(30, (byte) -44);
        byte $b3 = (byte) ($i1 >> 28);
        int $i2 = ($i1 >> 14) & -1489294180;
        $i1 &= 1828072980;
        $r2.this$0[0] = $i2 - (Build$VERSION.type * -84840920);
        $r2.size = (($r2.this$0[0] << 7) + ($r2.getKey(-2124905592) << 6)) * 1506829721;
        $r2.length[0] = $i1 - (Level.type * -383462541);
        $r2.value = (($r2.length[0] << 7) + ($r2.getKey(-1955330370) << 6)) * -1638712607;
        $i1 = -1418139486 * $b3;
        $r2.context = $i1;
        Msg.size = $i1 * -2082259295;
        if (id[$i0] != null) {
            $r2.add(id[$i0], -1500583085);
        }
        size = 0;
        int[] $r3 = next;
        $i1 = size - 1328615221;
        size = $i1;
        $r3[($i1 * -1675758365) - 1] = $i0;
        type[$i0] = (byte) 0;
        state = 0;
        handler.create(1885733558);
    }

    static boolean load(Handler handler, int i) {
        int $i1 = handler.add(2, (byte) -20);
        int $i2;
        int $i3;
        int $i4;
        if ($i1 == 0) {
            if (handler.add(1, (byte) -84) != 0) {
                FileUtils.add(handler, i, 1449660429);
            }
            $i2 = handler.add(13, (byte) -61);
            $i1 = handler.add(13, (byte) -123);
            if (handler.add(1, (byte) -53) == 1) {
                int[] $r1 = context;
                $i3 = data + 1377463787;
                data = $i3;
                $r1[($i3 * 1300038090) - 1] = i;
            }
            if (client.size[i] != null) {
                throw new RuntimeException();
            }
            Item[] $r2 = client.size;
            Item $r3 = new Item();
            $r2[i] = $r3;
            $r3.f163n = -1174618595 * i;
            if (id[i] != null) {
                $r3.add(id[i], -2075536230);
            }
            $r3.name = 1453001121 * $assertionsDisabled[i];
            $r3.key = name[i] * 1173518700;
            $i3 = values[i];
            $i4 = $i3 >> 28;
            int $i5 = ($i3 >> 14) & 255;
            $i3 &= 255;
            $r3.log[0] = parent[i];
            $r3.context = ((byte) $i4) * -663435586;
            $r3.add(($i2 + ($i5 << 13)) - (Build$VERSION.type * 1407993063), (($i3 << 13) + $i1) - (Level.type * 2086112216), -1550414534);
            $r3.id = false;
            return true;
        } else if ($i1 == 1) {
            $i2 = handler.add(2, (byte) -111);
            $i3 = values[i];
            values[i] = ((($i2 + ($i3 >> 28)) & 3) << 28) + (268435455 & $i3);
            return false;
        } else if (2 == $i1) {
            $i1 = handler.add(5, (byte) -85);
            $i3 = $i1 >> 3;
            $i1 &= 7;
            $i2 = values[i];
            $i3 = ($i3 + ($i2 >> 28)) & 3;
            $i4 = ($i2 >> 14) & 1069746820;
            $i2 &= 1893962747;
            if ($i1 == 0) {
                $i4--;
                $i2--;
            }
            if ($i1 == 1) {
                $i2--;
            }
            if ($i1 == 2) {
                $i4++;
                $i2--;
            }
            if ($i1 == 3) {
                $i4--;
            }
            if ($i1 == 4) {
                $i4++;
            }
            if ($i1 == 5) {
                $i4--;
                $i2++;
            }
            if (6 == $i1) {
                $i2++;
            }
            if (7 == $i1) {
                $i4++;
                $i2++;
            }
            values[i] = $i2 + (($i4 << 14) + ($i3 << 28));
            return false;
        } else {
            $i1 = handler.add(18, (byte) -24);
            $i3 = $i1 >> 16;
            $i4 = ($i1 >> 8) & 255;
            $i1 &= 255;
            $i2 = values[i];
            values[i] = (($i1 + $i2) & 380629771) + (((($i3 + ($i2 >> 28)) & 3) << 28) + ((($i4 + ($i2 >> 14)) & -1405369718) << 14));
            return false;
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, int i) {
        System $r1 = z ? Constants.data : XMLParser.state;
        int[] $r2;
        if ($i0 == 1500) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            try {
                $r2[($i0 * 537618701) - 1] = $r1.head * 642824123;
                return 1;
            } catch (RuntimeException $r3) {
                throw StringBuilder.append($r3, "gw.aj(" + ')');
            }
        } else if ($i0 == 1501) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.max * 384720325;
            return 1;
        } else if (1502 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.this$0 * 256177861;
            return 1;
        } else if ($i0 == 1503) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.$assertionsDisabled * 57307023;
            return 1;
        } else if (1504 == $i0) {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.start ? (byte) 1 : (byte) 0;
            return 1;
        } else if ($i0 != 1505) {
            return 2;
        } else {
            $r2 = XMLParser.this$0;
            $i0 = XMLParser.type - 1194553915;
            XMLParser.type = $i0;
            $r2[($i0 * 537618701) - 1] = $r1.type * -1008623461;
            return 1;
        }
    }

    static void parse(Handler handler, int $i0) {
        int $i1;
        boolean $z0 = handler.add(1, (byte) -68) == 1;
        if ($z0) {
            int[] $r1 = context;
            $i1 = data + 1377463787;
            data = $i1;
            $r1[($i1 * 482038467) - 1] = $i0;
        }
        $i1 = handler.add(2, (byte) -22);
        Item $r3 = client.size[$i0];
        if ($i1 == 0) {
            if ($z0) {
                $r3.id = false;
            } else if ($i0 == -1522892003 * client.flags) {
                throw new RuntimeException();
            } else {
                values[$i0] = (($r3.length[0] + (1289967967 * Level.type)) >> 13) + (((-277606385 * $r3.context) << 28) + ((($r3.this$0[0] + (Build$VERSION.type * 1407993063)) >> 13) << 14));
                if (323118731 * $r3.next != -1) {
                    $assertionsDisabled[$i0] = 323118731 * $r3.next;
                } else {
                    $assertionsDisabled[$i0] = -1058596255 * $r3.name;
                }
                name[$i0] = $r3.key * -609375913;
                client.size[$i0] = null;
                if (handler.add(1, (byte) -35) != 0) {
                    FileUtils.add(handler, $i0, 1553489687);
                }
            }
        } else if (1 == $i1) {
            $i3 = handler.add(3, (byte) -109);
            $i2 = $r3.this$0[0];
            $i1 = $r3.length[0];
            if ($i3 == 0) {
                $i2--;
                $i1--;
            } else if (1 == $i3) {
                $i1--;
            } else if ($i3 == 2) {
                $i2++;
                $i1--;
            } else if ($i3 == 3) {
                $i2--;
            } else if ($i3 == 4) {
                $i2++;
            } else if (5 == $i3) {
                $i2--;
                $i1++;
            } else if ($i3 == 6) {
                $i1++;
            } else if (7 == $i3) {
                $i2++;
                $i1++;
            }
            if ($i0 == -1522892003 * client.flags && ($r3.size * 516759209 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i1, -2001163032);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i1;
            } else {
                $r3.id = false;
                $r3.get($i2, $i1, parent[$i0], -110563280);
            }
        } else if (2 == $i1) {
            $i3 = handler.add(4, (byte) -102);
            $i2 = $r3.this$0[0];
            $i1 = $r3.length[0];
            if ($i3 == 0) {
                $i2 -= 2;
                $i1 -= 2;
            } else if (1 == $i3) {
                $i2--;
                $i1 -= 2;
            } else if (2 == $i3) {
                $i1 -= 2;
            } else if ($i3 == 3) {
                $i2++;
                $i1 -= 2;
            } else if ($i3 == 4) {
                $i2 += 2;
                $i1 -= 2;
            } else if ($i3 == 5) {
                $i2 -= 2;
                $i1--;
            } else if (6 == $i3) {
                $i2 += 2;
                $i1--;
            } else if (7 == $i3) {
                $i2 -= 2;
            } else if (8 == $i3) {
                $i2 += 2;
            } else if (9 == $i3) {
                $i2 -= 2;
                $i1++;
            } else if ($i3 == 10) {
                $i2 += 2;
                $i1++;
            } else if (11 == $i3) {
                $i2 -= 2;
                $i1 += 2;
            } else if (12 == $i3) {
                $i2--;
                $i1 += 2;
            } else if ($i3 == 13) {
                $i1 += 2;
            } else if (14 == $i3) {
                $i2++;
                $i1 += 2;
            } else if ($i3 == 15) {
                $i2 += 2;
                $i1 += 2;
            }
            if (-1522892003 * client.flags == $i0 && (516759209 * $r3.size < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i1, -1788183654);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i1;
            } else {
                $r3.id = false;
                $r3.get($i2, $i1, parent[$i0], -1286567119);
            }
        } else if (handler.add(1, (byte) -22) == 0) {
            $i3 = handler.add(12, (byte) -59);
            $i1 = $i3 >> 10;
            $i2 = ($i3 >> 5) & 31;
            if ($i2 > 15) {
                $i2 -= 32;
            }
            $i3 &= 31;
            if ($i3 > 15) {
                $i3 -= 32;
            }
            $i2 += $r3.this$0[0];
            $i3 += $r3.length[0];
            if (client.flags * -1522892003 == $i0 && ($r3.size * 516759209 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.size * 516759209 >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i3, -2007307443);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i3;
            } else {
                $r3.id = false;
                $r3.get($i2, $i3, parent[$i0], 94908094);
            }
            $r3.context = ((byte) (((-277606385 * $r3.context) + $i1) & 3)) * -1345790225;
            if (client.flags * -1522892003 == $i0) {
                Msg.size = $r3.context * -1742053899;
            }
        } else {
            $i3 = handler.add(30, (byte) 7);
            $i1 = $i3 >> 28;
            $i2 = (((($i3 >> 14) & 16383) + ($r3.this$0[0] + (Build$VERSION.type * 1407993063))) & 16383) - (Build$VERSION.type * 1407993063);
            $i3 = ((($i3 & 16383) + ((Level.type * 1289967967) + $r3.length[0])) & 16383) - (1289967967 * Level.type);
            if ($i0 == -1522892003 * client.flags && (516759209 * $r3.size < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || $r3.value * 2328865 < Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT || 516759209 * $r3.size >= 11776 || $r3.value * 2328865 >= 11776)) {
                $r3.add($i2, $i3, -1997781817);
                $r3.id = false;
            } else if ($z0) {
                $r3.id = true;
                $r3.f164x = -1732185005 * $i2;
                $r3.f165y = -1115815949 * $i3;
            } else {
                $r3.id = false;
                $r3.get($i2, $i3, parent[$i0], -1783028837);
            }
            $r3.context = -1345790225 * ((byte) (((-277606385 * $r3.context) + $i1) & 3));
            if ($i0 == -1522892003 * client.flags) {
                Msg.size = $r3.context * -1742053899;
            }
        }
    }

    static final void read(Handler handler) {
        handler.debug(1565299499);
        int $i0 = client.flags * -1522892003;
        Item[] $r1 = client.size;
        Item $r2 = new Item();
        $r1[$i0] = $r2;
        File.this$0 = $r2;
        $r2.f163n = -1174618595 * $i0;
        int $i1 = handler.add(30, (byte) -127);
        byte $b3 = (byte) ($i1 >> 28);
        int $i2 = ($i1 >> 14) & 16383;
        $i1 &= 16383;
        $r2.this$0[0] = $i2 - (Build$VERSION.type * 1407993063);
        $r2.size = (($r2.this$0[0] << 7) + ($r2.getKey(-2078438109) << 6)) * 1506829721;
        $r2.length[0] = $i1 - (Level.type * 1289967967);
        $r2.value = (($r2.length[0] << 7) + ($r2.getKey(-1935257918) << 6)) * -1638712607;
        $i1 = -1345790225 * $b3;
        $r2.context = $i1;
        Msg.size = $i1 * -1742053899;
        if (id[$i0] != null) {
            $r2.add(id[$i0], -1382147617);
        }
        size = 0;
        int[] $r3 = next;
        $i1 = size - 1328615221;
        size = $i1;
        $r3[($i1 * -1675758365) - 1] = $i0;
        type[$i0] = (byte) 0;
        state = 0;
        for ($i1 = 1; $i1 < Constants.ACC_STRICT; $i1++) {
            if ($i1 != $i0) {
                $i2 = handler.add(18, (byte) -17);
                int $i4 = $i2 >> 16;
                int $i5 = ($i2 >> 8) & 597;
                values[$i1] = ($i2 & 597) + (($i4 << 28) + ($i5 << 14));
                $assertionsDisabled[$i1] = 0;
                name[$i1] = -1;
                $r3 = key;
                $i2 = state - 948652261;
                state = $i2;
                $r3[($i2 * -844313837) - 1] = $i1;
                type[$i1] = (byte) 0;
            }
        }
        handler.create(1885733558);
    }

    static void reset() {
        size = 0;
        for (int $i0 = 0; $i0 < Constants.ACC_STRICT; $i0++) {
            id[$i0] = null;
            parent[$i0] = (byte) 1;
        }
    }

    static final void run(Handler handler) {
        for (int $i2 = 0; $i2 < data * 482038467; $i2++) {
            int $i1;
            int $i6;
            int $i7;
            int $i10;
            int $i0 = context[$i2];
            Collection $r4 = client.size[$i0];
            int $i3 = handler.get((byte) 0);
            if (($i3 & 1) != 0) {
                $i3 += handler.get((byte) 0) << 8;
            }
            byte $b5 = (byte) -1;
            if (($i3 & 512) != 0) {
                $r4.state = handler.getName(-1005835619) * -2015474731;
                int $i4 = handler.size(726136758);
                $i1 = ($i4 >> 16) * -2073088321;
                int i = $i1;
                $r4.active = $i1;
                $r4.out = (($i4 & 65535) + (1581849891 * client.type)) * 243104753;
                $r4.f62a = 0;
                $r4.f64c = 0;
                $i1 = client.type * 1581849891;
                i = $i1;
                if ($r4.out * 645928209 > $i1) {
                    $r4.f62a = 367216679;
                }
                if ($r4.state * 269129085 == 65535) {
                    $r4.state = 2015474731;
                }
            }
            if (($i3 & 256) != 0) {
                $b5 = handler.read((byte) 37);
            }
            if (($i3 & Constants.f93X) != 0) {
                $r4.key = handler.getInstance(41759730) * 1968525927;
                if ($r4.key * -609375913 == 65535) {
                    $r4.key = -1968525927;
                }
            }
            if (($i3 & 64) != 0) {
                $i4 = handler.get((byte) 0);
                byte[] $r5 = new byte[$i4];
                Logger logger = new Logger($r5);
                handler.read($r5, 0, $i4, -1883148941);
                id[$i0] = logger;
                $r4.add(logger, -1836178815);
            }
            if (($i3 & 32) != 0) {
                int $i8;
                $i4 = handler.decode(1662057653);
                if ($i4 > 0) {
                    for (i = 0; i < $i4; i++) {
                        $i6 = -1;
                        $i7 = -1;
                        $i8 = -1;
                        int $i9 = handler.add((byte) 27);
                        $i10 = $i9;
                        if (32767 == $i9) {
                            $i10 = handler.add((byte) 61);
                            $i7 = handler.add((byte) 89);
                            $i6 = handler.add((byte) 82);
                            $i8 = handler.add((byte) 10);
                        } else if ($i9 != 32766) {
                            $i7 = handler.add((byte) 22);
                        } else {
                            $i10 = -1;
                        }
                        $r4.init($i10, $i7, $i6, $i8, 1581849891 * client.type, handler.add((byte) 16), -492484058);
                    }
                }
                $i4 = handler.get((byte) 0);
                if ($i4 > 0) {
                    for (i = 0; i < $i4; i++) {
                        $i10 = handler.add((byte) 4);
                        $i6 = handler.add((byte) 100);
                        if (32767 != $i6) {
                            $i7 = handler.add((byte) 36);
                            $i8 = handler.decode(1071335821);
                            $r4.get($i10, 1581849891 * client.type, $i6, $i7, $i8, $i6 > 0 ? handler.read(-1783060735) : $i8, (byte) 0);
                        } else {
                            $r4.get($i10, -758658090);
                        }
                    }
                }
            }
            if (($i3 & 4) != 0) {
                $r4.next = handler.get(-1913548117) * 464408867;
                if ($r4.parent * 761444243 == 0) {
                    $r4.name = $r4.next * 981885035;
                    $r4.next = -464408867;
                }
            }
            if (($i3 & ScrollingTextView.MP3_MAX_INPUT_SIZE) != 0) {
                parent[$i0] = handler.read((byte) 68);
            }
            if (($i3 & Constants.ACC_STRICT) != 0) {
                $r4.items = handler.next(1247983979) * 1177469221;
                $r4.offset = handler.read((byte) 12) * -153025727;
                $r4.color = handler.next(1247983979) * 533146735;
                $r4.location = handler.next(1247983979) * -1865694973;
                $i1 = client.type * 1581849891;
                i = $i1;
                $r4.body = (handler.get(-1297017907) + $i1) * 1386585013;
                $i1 = client.type * 1581849891;
                i = $i1;
                $r4.title = (handler.getInstance(-662178605) + $i1) * -511796865;
                $r4.uri = handler.getInstance(-1726345001) * 814763455;
                if ($r4.id) {
                    $i1 = $r4.f164x * 1226261927;
                    i = $i1;
                    $r4.items += $i1;
                    $i1 = $r4.f165y * -1172262661;
                    i = $i1;
                    $r4.offset += $i1;
                    $i1 = $r4.f164x * 615654389;
                    i = $i1;
                    $r4.color += $i1;
                    $i1 = $r4.f165y * 112692913;
                    i = $i1;
                    $r4.location += $i1;
                    $r4.parent = 0;
                } else {
                    $r4.items += 1177469221 * $r4.this$0[0];
                    $i1 = $r4.length[0] * -153025727;
                    i = $i1;
                    $r4.offset += $i1;
                    $i1 = $r4.this$0[0] * 533146735;
                    i = $i1;
                    $r4.color += $i1;
                    $i1 = $r4.length[0] * -1865694973;
                    i = $i1;
                    $r4.location += $i1;
                    $r4.parent = -521273701;
                }
                $r4.width = 0;
            }
            if (($i3 & 16) != 0) {
                $i10 = handler.getInstance(-1506171421);
                CircularBuffer $r8 = (CircularBuffer) Calendar.add(new CircularBuffer[]{CircularBuffer.count, CircularBuffer.cache, CircularBuffer.context, CircularBuffer.buffer, CircularBuffer.f44s, CircularBuffer.this$0}, handler.read(243776521), (byte) 58);
                boolean $z0 = handler.read(-565712146) == 1;
                $i4 = handler.read(-1130300694);
                i = 1978945739 * handler.data;
                if (!($r4.type == null || $r4.this$0 == null)) {
                    Object obj = null;
                    if ($r8.address) {
                        if (Primitive.data.add($r4.type, (byte) -75)) {
                            obj = 1;
                        }
                    }
                    if (obj == null && client.timer * 783729645 == 0 && !$r4.data) {
                        String $r15;
                        boolean $z1;
                        byte $b12;
                        logger.data = 0;
                        handler.init(logger.size, 0, $i4, (byte) -55);
                        logger.data = 0;
                        Logger $r1 = logger;
                        try {
                            $i7 = $r1.add((byte) 15);
                            $i6 = $i7;
                            if ($i7 > 32767) {
                                $i6 = 32767;
                            }
                            $r5 = new byte[$i6];
                            $r1.data = (MimeType.data.write($r1.size, $r1.data * 1978945739, $r5, 0, $i6, 1457895674) * 2065011939) + $r1.data;
                            $r15 = Class.toString($r5, 0, $i6, -1943847171);
                        } catch (Exception e) {
                            $r15 = "Cabbage";
                        }
                        $r15 = List.add(Downloader.parse($r15, 678093770));
                        $r4.f63b = $r15.trim();
                        $i1 = ($i10 >> 8) * 169672723;
                        $i6 = $i1;
                        $r4.f67g = $i1;
                        $i1 = ($i10 & 255) * -2058240637;
                        $i10 = $i1;
                        $r4.f71m = $i1;
                        $r4.buffer = -309974418;
                        $r4.f68h = $z0;
                        if (!(File.this$0 == $r4 || !$r8.address || client.address == "")) {
                            if ($r15.toLowerCase().indexOf(client.address) == -1) {
                                $z1 = true;
                                $r4.f78w = $z1;
                                $b12 = $r8.data ? $z0 ? (byte) 91 : (byte) 1 : $z0 ? (byte) 90 : (byte) 2;
                                if (1675619249 * $r8.size == -1) {
                                    Message.add($b12, CompassView.get(1675619249 * $r8.size, (byte) -3) + $r4.type.toString(-586585308), $r15, 446264062);
                                } else {
                                    Message.add($b12, $r4.type.toString(462050769), $r15, 334242515);
                                }
                            }
                        }
                        $z1 = false;
                        $r4.f78w = $z1;
                        if ($r8.data) {
                            if ($z0) {
                            }
                        }
                        if (1675619249 * $r8.size == -1) {
                            Message.add($b12, $r4.type.toString(462050769), $r15, 334242515);
                        } else {
                            Message.add($b12, CompassView.get(1675619249 * $r8.size, (byte) -3) + $r4.type.toString(-586585308), $r15, 446264062);
                        }
                    }
                }
                handler.data = 2065011939 * ($i4 + i);
            }
            if (($i3 & 2) != 0) {
                $r4.f63b = handler.toString(387827904);
                if ($r4.f63b.charAt(0) == '~') {
                    $r4.f63b = $r4.f63b.substring(1);
                    Message.add(2, $r4.type.toString(437461435), $r4.f63b, 1654242659);
                } else if (File.this$0 == $r4) {
                    Message.add(2, $r4.type.toString(-1213452814), $r4.f63b, 707612950);
                }
                $r4.f68h = false;
                $r4.f67g = 0;
                $r4.f71m = 0;
                $r4.buffer = -309974418;
            }
            if (($i3 & 8) != 0) {
                i = handler.getInstance(-530300500);
                $i4 = i;
                if (65535 == i) {
                    $i4 = -1;
                }
                Status.write($r4, $i4, handler.write(125767971), (byte) -41);
            }
            if (($i3 & 1024) != 0) {
                for ($i3 = 0; $i3 < 3; $i3++) {
                    $r4.next[$i3] = handler.toString(1757132481);
                }
            }
            if ($r4.id) {
                if ($b5 == Byte.MAX_VALUE) {
                    $r4.add($r4.f164x * 589656027, $r4.f165y * -1060785861, -1803726097);
                } else {
                    if ($b5 == (byte) -1) {
                        $b5 = parent[$i0];
                    }
                    $r4.get($r4.f164x * 589656027, $r4.f165y * -1060785861, $b5, 172406728);
                }
            }
        }
    }

    static boolean update(Handler handler, int i) {
        int $i1 = handler.add(2, (byte) -94);
        int $i2;
        int $i3;
        int $i4;
        if ($i1 == 0) {
            if (handler.add(1, (byte) -98) != 0) {
                FileUtils.add(handler, i, 1194942548);
            }
            $i2 = handler.add(13, (byte) -2);
            $i1 = handler.add(13, (byte) -41);
            if (handler.add(1, (byte) -121) == 1) {
                int[] $r1 = context;
                $i3 = data + 1377463787;
                data = $i3;
                $r1[($i3 * 482038467) - 1] = i;
            }
            if (client.size[i] != null) {
                throw new RuntimeException();
            }
            Item[] $r2 = client.size;
            Item $r3 = new Item();
            $r2[i] = $r3;
            $r3.f163n = -1174618595 * i;
            if (id[i] != null) {
                $r3.add(id[i], -1285242702);
            }
            $r3.name = 1600514549 * $assertionsDisabled[i];
            $r3.key = name[i] * 1968525927;
            $i3 = values[i];
            $i4 = $i3 >> 28;
            int $i5 = ($i3 >> 14) & -1342150239;
            $i3 &= 1485562552;
            $r3.log[0] = parent[i];
            $r3.context = ((byte) $i4) * -662285038;
            $r3.add(($i2 + ($i5 << 13)) - (Build$VERSION.type * 1407993063), (($i3 << 13) + $i1) - (Level.type * 1289967967), -1720423790);
            $r3.id = false;
            return true;
        } else if ($i1 == 1) {
            $i2 = handler.add(2, (byte) 3);
            $i3 = values[i];
            values[i] = ((($i2 + ($i3 >> 28)) & 3) << 28) + (268435455 & $i3);
            return false;
        } else if (2 == $i1) {
            $i1 = handler.add(5, (byte) -50);
            $i3 = $i1 >> 3;
            $i1 &= 7;
            $i2 = values[i];
            $i3 = (($i2 >> 28) + $i3) & 3;
            $i4 = ($i2 >> 14) & 2108093769;
            $i2 = -1431034431 & $i2;
            if ($i1 == 0) {
                $i4--;
                $i2--;
            }
            if ($i1 == 1) {
                $i2--;
            }
            if ($i1 == 2) {
                $i4++;
                $i2--;
            }
            if ($i1 == 3) {
                $i4--;
            }
            if ($i1 == 4) {
                $i4++;
            }
            if ($i1 == 5) {
                $i4--;
                $i2++;
            }
            if (6 == $i1) {
                $i2++;
            }
            if (7 == $i1) {
                $i4++;
                $i2++;
            }
            values[i] = $i2 + (($i4 << 14) + ($i3 << 28));
            return false;
        } else {
            $i1 = handler.add(18, (byte) -96);
            $i3 = $i1 >> 16;
            $i4 = ($i1 >> 8) & -1328743425;
            $i1 &= 255;
            $i2 = values[i];
            values[i] = (($i1 + $i2) & 987107640) + (((($i3 + ($i2 >> 28)) & 3) << 28) + ((($i4 + ($i2 >> 14)) & -1061903184) << 14));
            return false;
        }
    }

    static void write() {
        size = 0;
        for (int $i0 = 0; $i0 < Constants.ACC_STRICT; $i0++) {
            id[$i0] = null;
            parent[$i0] = (byte) 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void write(int r19) {
        /*
        r1 = p000.R$string.channel;
        r2 = p000.client.this$0;
        r3 = r2.key;	 Catch:{ RuntimeException -> 0x005f }
        r5 = 17;
        r4 = p000.Logger.add(r1, r3, r5);	 Catch:{ RuntimeException -> 0x005f }
        r2 = p000.client.this$0;
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2.add(r4, r5);	 Catch:{ RuntimeException -> 0x005f }
        r6 = p000.client.position;
        r7 = r6.next();	 Catch:{ RuntimeException -> 0x005f }
        r9 = r7;
        r9 = (p000.Character) r9;	 Catch:{ RuntimeException -> 0x005f }
        r8 = r9;
    L_0x001d:
        if (r8 == 0) goto L_0x0050;
    L_0x001f:
        r0 = r8.length;	 Catch:{ RuntimeException -> 0x005f }
        r19 = r0;
        r5 = 396494185; // 0x17a20569 float:1.047037E-24 double:1.958941556E-315;
        r0 = r19;
        r0 = r0 * r5;
        r19 = r0;
        if (r19 == 0) goto L_0x003e;
    L_0x002d:
        r0 = r8.length;	 Catch:{ RuntimeException -> 0x005f }
        r19 = r0;
        r5 = 396494185; // 0x17a20569 float:1.047037E-24 double:1.958941556E-315;
        r0 = r19;
        r0 = r0 * r5;
        r19 = r0;
        r5 = 3;
        r0 = r19;
        if (r5 != r0) goto L_0x0045;
    L_0x003e:
        r5 = 1;
        r10 = 580505822; // 0x2299d0de float:4.169188E-18 double:2.86807984E-315;
        p000.Vector2D.add(r8, r5, r10);	 Catch:{ RuntimeException -> 0x005f }
    L_0x0045:
        r6 = p000.client.position;
        r7 = r6.get();	 Catch:{ RuntimeException -> 0x005f }
        r11 = r7;
        r11 = (p000.Character) r11;	 Catch:{ RuntimeException -> 0x005f }
        r8 = r11;
        goto L_0x001d;
    L_0x0050:
        r12 = p000.client.buffer;
        if (r12 == 0) goto L_0x007e;
    L_0x0054:
        r12 = p000.client.buffer;
        r5 = 97;
        p000.client.add(r12, r5);	 Catch:{ RuntimeException -> 0x005f }
        r13 = 0;
        p000.client.buffer = r13;
        return;
    L_0x005f:
        r14 = move-exception;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r16 = "gw.fg(";
        r0 = r16;
        r15 = r15.append(r0);
        r5 = 41;
        r15 = r15.append(r5);
        r17 = r15.toString();
        r0 = r17;
        r18 = p000.StringBuilder.append(r14, r0);
        throw r18;
    L_0x007e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: Database.write(int):void");
    }
}
