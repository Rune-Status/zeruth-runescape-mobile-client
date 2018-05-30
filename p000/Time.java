package p000;

/* compiled from: gm */
public final class Time extends Collection {
    public static boolean index;
    public Vector value;

    Time() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "gm.<init>(" + ')');
        }
    }

    protected final Integer add() {
        if (this.value == null) {
            return null;
        }
        JSONArray $r2 = (this.data * 1462124603 == -1 || this.start * 261583063 != 0) ? null : AbstractBuffer.get(-1511493055 * this.data, 1198855821);
        JSONArray $r3 = (-1 == this.text * 259701737 || (this.text * -382232225 == -629432309 * this.type && $r2 != null)) ? null : AbstractBuffer.get(259701737 * this.text, 2012513173);
        Integer $r4 = this.value.toString($r2, 385151342 * this.position, $r3, 782711805 * this.bytes, 781475413);
        Integer $r5 = $r4;
        if ($r4 == null) {
            return null;
        }
        $r4.append();
        this.f72n = 1007229383 * $r4.size;
        if (!(269129085 * this.state == -1 || -1 == 628512873 * this.f62a)) {
            Integer $r7 = HyperlinkRecord.get(this.state * -576546616, 1755275377).get(628512873 * this.f62a, -2124009656);
            if ($r7 != null) {
                $r7.append(0, -(this.active * 1216037183), 0);
                $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
            }
        }
        if (this.value.size * 1160465393 == 1) {
            $r5.flags = true;
        }
        return $r5;
    }

    final void add(int i, byte b) {
        int $i2 = this.this$0[0];
        int $i3 = this.length[0];
        if (i == 0) {
            $i2--;
            $i3++;
        }
        if (i == 1) {
            $i3++;
        }
        if (i == 2) {
            $i2++;
            $i3++;
        }
        if (3 == i) {
            $i2--;
        }
        if (i == 4) {
            $i2++;
        }
        if (5 == i) {
            $i2--;
            $i3--;
        }
        if (6 == i) {
            $i3--;
        }
        if (7 == i) {
            $i2++;
            $i3--;
        }
        if (1462124603 * this.data != -1 && AbstractBuffer.get(-1712854521 * this.data, 792821100).value * -1265995482 == 1) {
            this.data = 2033542925;
        }
        if (1936859088 * this.parent < 9) {
            this.parent -= 521273701;
        }
        for (i = this.parent * -1759204034; i > 0; i--) {
            this.this$0[i] = this.this$0[i - 1];
            this.length[i] = this.length[i - 1];
            this.log[i] = this.log[i - 1];
        }
        this.this$0[0] = $i2;
        this.length[0] = $i3;
        this.log[0] = b;
    }

    final void add(int i, byte b, byte b2) {
        try {
            int $i3 = this.this$0[0];
            int $i4 = this.length[0];
            if (i == 0) {
                $i3--;
                $i4++;
            }
            if (i == 1) {
                $i4++;
            }
            if (i == 2) {
                $i3++;
                $i4++;
            }
            if (3 == i) {
                $i3--;
            }
            if (i == 4) {
                $i3++;
            }
            if (5 == i) {
                $i3--;
                $i4--;
            }
            if (6 == i) {
                $i4--;
            }
            if (7 == i) {
                i = $i3 + 1;
                $i4--;
            } else {
                i = $i3;
            }
            if (this.data * 1462124603 != -1) {
                if (AbstractBuffer.get(this.data * 1462124603, 607801957).value * -990546557 == 1) {
                    this.data = 2033542925;
                }
            }
            if (this.parent * 761444243 < 9) {
                this.parent -= 521273701;
            }
            for ($i3 = this.parent * 761444243; $i3 > 0; $i3--) {
                this.this$0[$i3] = this.this$0[$i3 - 1];
                this.length[$i3] = this.length[$i3 - 1];
                this.log[$i3] = this.log[$i3 - 1];
            }
            this.this$0[0] = i;
            this.length[0] = $i4;
            this.log[0] = b;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "gm.af(" + ')');
        }
    }

    final void add(int $i0, int $i1, boolean z) {
        if (-1 != this.data * 1462124603 && AbstractBuffer.get(this.data * 1462124603, 1058248023).value * -45967584 == 1) {
            this.data = 2033542925;
        }
        if (!z) {
            int $i2 = $i0 - this.this$0[0];
            int $i3 = $i1 - this.length[0];
            if ($i2 >= -120931801 && $i2 <= 8 && $i3 >= -8 && $i3 <= 8) {
                if (this.parent * 761444243 < 9) {
                    this.parent -= 1876621762;
                }
                for ($i2 = this.parent * 761444243; $i2 > 0; $i2--) {
                    this.this$0[$i2] = this.this$0[$i2 - 1];
                    this.length[$i2] = this.length[$i2 - 1];
                    this.log[$i2] = this.log[$i2 - 1];
                }
                this.this$0[0] = $i0;
                this.length[0] = $i1;
                this.log[0] = (byte) 1;
                return;
            }
        }
        this.parent = 0;
        this.width = 0;
        this.height = 0;
        this.this$0[0] = $i0;
        this.length[0] = $i1;
        this.size = (-8932469 * this.count) + (this.this$0[0] * -399324032);
        this.value = (this.length[0] * 261319887) + (this.count * 1111802196);
    }

    final void add(int i, int i2, boolean z, short s) {
        try {
            if (-1 != 1462124603 * this.data) {
                if (AbstractBuffer.get(1462124603 * this.data, 1876830129).value * -990546557 == 1) {
                    this.data = 2033542925;
                }
            }
            if (!z) {
                int $i3 = i - this.this$0[0];
                int $i4 = i2 - this.length[0];
                if ($i3 >= -8 && $i3 <= 8 && $i4 >= -8 && $i4 <= 8) {
                    if (this.parent * 761444243 < 9) {
                        this.parent -= 521273701;
                    }
                    for ($i3 = this.parent * 761444243; $i3 > 0; $i3--) {
                        this.this$0[$i3] = this.this$0[$i3 - 1];
                        this.length[$i3] = this.length[$i3 - 1];
                        this.log[$i3] = this.log[$i3 - 1];
                    }
                    this.this$0[0] = i;
                    this.length[0] = i2;
                    this.log[0] = (byte) 1;
                    return;
                }
            }
            this.parent = 0;
            this.width = 0;
            this.height = 0;
            this.this$0[0] = i;
            this.length[0] = i2;
            int $i0 = (962703424 * this.count) + (this.this$0[0] * -399324032);
            i = $i0;
            this.size = $i0;
            $i0 = (this.length[0] * 698183808) + (this.count * -1948888512);
            i = $i0;
            this.value = $i0;
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "gm.ad(" + ')');
        }
    }

    protected final Integer clone() {
        if (this.value == null) {
            return null;
        }
        JSONArray $r6 = (this.data * 1011027883 == -1 || this.start * -1197119548 != 0) ? null : AbstractBuffer.get(-858033740 * this.data, 1435594398);
        JSONArray $r7 = (-1 == this.text * -69964977 || (this.text * 1778256908 == -629432309 * this.type && $r6 != null)) ? null : AbstractBuffer.get(-1640277959 * this.text, 352520947);
        Integer $r8 = this.value.toString($r6, -1664717226 * this.position, $r7, 782711805 * this.bytes, 445930737);
        Integer $r5 = $r8;
        if ($r8 == null) {
            return null;
        }
        $r8.append();
        this.f72n = 1007229383 * $r8.size;
        if (!(1116696674 * this.state == -1 || -1 == -1005228260 * this.f62a)) {
            Integer $r3 = HyperlinkRecord.get(this.state * 269129085, 2012102365).get(-668332879 * this.f62a, -2131139493);
            if ($r3 != null) {
                $r3.append(0, -(this.active * 1216037183), 0);
                $r5 = new Integer(new Integer[]{$r8, $r3}, 2);
            }
        }
        if (this.value.size * 734028455 == 1) {
            $r5.flags = true;
        }
        return $r5;
    }

    final boolean isNegative() {
        return this.value != null;
    }

    final boolean isValid() {
        return this.value != null;
    }

    protected final Integer read() {
        try {
            if (this.value == null) {
                return null;
            }
            JSONArray $r11;
            JSONArray $r2;
            Integer $r3;
            Integer $r5;
            if (this.data * 1462124603 != -1) {
                if (this.start * 1913892303 == 0) {
                    $r11 = AbstractBuffer.get(1462124603 * this.data, 1651157890);
                    if (-1 != this.text * 259701737) {
                        if (this.text * 259701737 != -629432309 * this.type || $r11 == null) {
                            $r2 = AbstractBuffer.get(this.text * 259701737, 751591128);
                            $r3 = this.value.toString($r11, 1816971127 * this.position, $r2, 782711805 * this.bytes, -185956694);
                            if ($r3 == null) {
                                return null;
                            }
                            $r3.append();
                            this.f72n = 1007229383 * $r3.size;
                            if (269129085 * this.state != -1) {
                                if (-1 != 628512873 * this.f62a) {
                                    $r5 = HyperlinkRecord.get(this.state * 269129085, 1854745375).get(628512873 * this.f62a, -1908524361);
                                    if ($r5 != null) {
                                        $r5.append(0, -(this.active * 1216037183), 0);
                                        $r3 = new Integer(new Integer[]{$r3, $r5}, 2);
                                        if (this.value.size * 1160465393 != 1) {
                                            return $r3;
                                        }
                                        $r3.flags = true;
                                        return $r3;
                                    }
                                }
                            }
                            if (this.value.size * 1160465393 != 1) {
                                return $r3;
                            }
                            $r3.flags = true;
                            return $r3;
                        }
                    }
                    $r2 = null;
                    $r3 = this.value.toString($r11, 1816971127 * this.position, $r2, 782711805 * this.bytes, -185956694);
                    if ($r3 == null) {
                        return null;
                    }
                    $r3.append();
                    this.f72n = 1007229383 * $r3.size;
                    if (269129085 * this.state != -1) {
                        if (-1 != 628512873 * this.f62a) {
                            $r5 = HyperlinkRecord.get(this.state * 269129085, 1854745375).get(628512873 * this.f62a, -1908524361);
                            if ($r5 != null) {
                                $r5.append(0, -(this.active * 1216037183), 0);
                                $r3 = new Integer(new Integer[]{$r3, $r5}, 2);
                                if (this.value.size * 1160465393 != 1) {
                                    return $r3;
                                }
                                $r3.flags = true;
                                return $r3;
                            }
                        }
                    }
                    if (this.value.size * 1160465393 != 1) {
                        return $r3;
                    }
                    $r3.flags = true;
                    return $r3;
                }
            }
            $r11 = null;
            if (-1 != this.text * 259701737) {
                $r2 = AbstractBuffer.get(this.text * 259701737, 751591128);
                $r3 = this.value.toString($r11, 1816971127 * this.position, $r2, 782711805 * this.bytes, -185956694);
                if ($r3 == null) {
                    return null;
                }
                $r3.append();
                this.f72n = 1007229383 * $r3.size;
                if (269129085 * this.state != -1) {
                    if (-1 != 628512873 * this.f62a) {
                        $r5 = HyperlinkRecord.get(this.state * 269129085, 1854745375).get(628512873 * this.f62a, -1908524361);
                        if ($r5 != null) {
                            $r5.append(0, -(this.active * 1216037183), 0);
                            $r3 = new Integer(new Integer[]{$r3, $r5}, 2);
                            if (this.value.size * 1160465393 != 1) {
                                return $r3;
                            }
                            $r3.flags = true;
                            return $r3;
                        }
                    }
                }
                if (this.value.size * 1160465393 != 1) {
                    return $r3;
                }
                $r3.flags = true;
                return $r3;
            }
            $r2 = null;
            $r3 = this.value.toString($r11, 1816971127 * this.position, $r2, 782711805 * this.bytes, -185956694);
            if ($r3 == null) {
                return null;
            }
            $r3.append();
            this.f72n = 1007229383 * $r3.size;
            if (269129085 * this.state != -1) {
                if (-1 != 628512873 * this.f62a) {
                    $r5 = HyperlinkRecord.get(this.state * 269129085, 1854745375).get(628512873 * this.f62a, -1908524361);
                    if ($r5 != null) {
                        $r5.append(0, -(this.active * 1216037183), 0);
                        $r3 = new Integer(new Integer[]{$r3, $r5}, 2);
                        if (this.value.size * 1160465393 != 1) {
                            return $r3;
                        }
                        $r3.flags = true;
                        return $r3;
                    }
                }
            }
            if (this.value.size * 1160465393 != 1) {
                return $r3;
            }
            $r3.flags = true;
            return $r3;
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "gm.ac(" + ')');
        }
    }

    protected final Integer remove() {
        if (this.value == null) {
            return null;
        }
        JSONArray $r2 = (this.data * 1462124603 == -1 || this.start * 1913892303 != 0) ? null : AbstractBuffer.get(1462124603 * this.data, 941356838);
        JSONArray $r3 = (-1 == this.text * 259701737 || (this.text * 259701737 == -629432309 * this.type && $r2 != null)) ? null : AbstractBuffer.get(this.text * 259701737, 1776396640);
        Integer $r4 = this.value.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, -500802746);
        Integer $r5 = $r4;
        if ($r4 == null) {
            return null;
        }
        $r4.append();
        this.f72n = 1007229383 * $r4.size;
        if (!(269129085 * this.state == -1 || -1 == 628512873 * this.f62a)) {
            Integer $r7 = HyperlinkRecord.get(this.state * 269129085, 1840992371).get(628512873 * this.f62a, -2073836104);
            if ($r7 != null) {
                $r7.append(0, -(this.active * 1216037183), 0);
                $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
            }
        }
        if (this.value.size * 1160465393 == 1) {
            $r5.flags = true;
        }
        return $r5;
    }

    final boolean toString(int i) {
        try {
            return this.value != null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "gm.an(" + ')');
        }
    }

    protected final Integer write() {
        if (this.value == null) {
            return null;
        }
        JSONArray $r2 = (this.data * 1462124603 == -1 || this.start * -450418032 != 0) ? null : AbstractBuffer.get(1462124603 * this.data, 297808573);
        JSONArray $r3 = (-1 == this.text * 259701737 || (this.text * -1435572228 == -1309806276 * this.type && $r2 != null)) ? null : AbstractBuffer.get(259701737 * this.text, 1676826225);
        Integer $r4 = this.value.toString($r2, 970312218 * this.position, $r3, 782711805 * this.bytes, -13388453);
        Integer $r5 = $r4;
        if ($r4 == null) {
            return null;
        }
        $r4.append();
        this.f72n = 7322131 * $r4.size;
        if (!(405831624 * this.state == -1 || -1 == 628512873 * this.f62a)) {
            Integer $r7 = HyperlinkRecord.get(this.state * 1422350977, 2104227197).get(1353032765 * this.f62a, -1882089401);
            if ($r7 != null) {
                $r7.append(0, -(this.active * 1216037183), 0);
                $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
            }
        }
        if (this.value.size * 1160465393 == 1) {
            $r5.flags = true;
        }
        return $r5;
    }

    final void write(int i, byte b) {
        int $i2 = this.this$0[0];
        int $i3 = this.length[0];
        if (i == 0) {
            $i2--;
            $i3++;
        }
        if (i == 1) {
            $i3++;
        }
        if (i == 2) {
            $i2++;
            $i3++;
        }
        if (3 == i) {
            $i2--;
        }
        if (i == 4) {
            $i2++;
        }
        if (5 == i) {
            $i2--;
            $i3--;
        }
        if (6 == i) {
            $i3--;
        }
        if (7 == i) {
            $i2++;
            $i3--;
        }
        if (this.data * 1462124603 != -1 && AbstractBuffer.get(this.data * 1462124603, 2077817997).value * -990546557 == 1) {
            this.data = 2033542925;
        }
        if (this.parent * 761444243 < 9) {
            this.parent -= 521273701;
        }
        for (i = this.parent * 761444243; i > 0; i--) {
            this.this$0[i] = this.this$0[i - 1];
            this.length[i] = this.length[i - 1];
            this.log[i] = this.log[i - 1];
        }
        this.this$0[0] = $i2;
        this.length[0] = $i3;
        this.log[0] = b;
    }
}
