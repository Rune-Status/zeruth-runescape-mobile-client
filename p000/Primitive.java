package p000;

/* compiled from: dm */
public class Primitive {
    static final int DIGEST_LENGTH = 28;
    static final int MAX_SETTLE_DURATION = 600;
    static final int NULL = 24624;
    public static Rect data;
    static byte[][][] name;
    static int[] value;
    Method count;
    int type;

    Primitive(int $i0, Method method) {
        try {
            this.type = -8443403 * $i0;
            this.count = method;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "dm.<init>(" + ')');
        }
    }

    static void init(Buffer buffer, File file, int i) {
        boolean $z1;
        int $i2;
        if (Contact.f101i) {
            i = -1859364873 * Contact.out.text;
            int $i1 = Contact.out.context * -880399799;
            $z1 = Contact.out.f323r;
            Contact.out.add(-2010107267);
            if ($z1) {
                $i2 = (286016249 * Contact.state) + 280;
                if (i >= $i2 && i <= $i2 + 14 && $i1 >= 4 && $i1 <= 18) {
                    ByteBufferList.add(0, 0, (byte) 63);
                    return;
                } else if (i < $i2 + 15 || i > $i2 + 80 || $i1 < 4 || $i1 > 18) {
                    $i2 = (286016249 * Contact.state) + 390;
                    if (i >= $i2 && i <= $i2 + 14 && $i1 >= 4 && $i1 <= 18) {
                        ByteBufferList.add(1, 0, (byte) -5);
                        return;
                    } else if (i < $i2 + 15 || i > $i2 + 80 || $i1 < 4 || $i1 > 18) {
                        $i2 = (286016249 * Contact.state) + 500;
                        if (i >= $i2 && i <= $i2 + 14 && $i1 >= 4 && $i1 <= 18) {
                            ByteBufferList.add(2, 0, (byte) -87);
                            return;
                        } else if (i < $i2 + 15 || i > $i2 + 80 || $i1 < 4 || $i1 > 18) {
                            $i2 = (Contact.state * 286016249) + 610;
                            if (i >= $i2 && i <= $i2 + 14 && $i1 >= 4 && $i1 <= 18) {
                                ByteBufferList.add(3, 0, (byte) 46);
                                return;
                            } else if (i >= $i2 + 15 && i <= $i2 + 80 && $i1 >= 4 && $i1 <= 18) {
                                ByteBufferList.add(3, 1, (byte) -1);
                                return;
                            } else if (i >= (286016249 * Contact.state) + 708 && $i1 >= 4 && i <= ((Contact.state * 286016249) + 708) + 50 && $i1 <= 20) {
                                Contact.f101i = false;
                                Resources.add(file, (byte) -65);
                                return;
                            } else if (-1 != 488305351 * Contact.count) {
                                Utils.add(Short.value[Contact.count * 488305351], 1499466761);
                                Contact.f101i = false;
                                Resources.add(file, (byte) 43);
                                return;
                            }
                        } else {
                            ByteBufferList.add(2, 1, (byte) -60);
                            return;
                        }
                    } else {
                        ByteBufferList.add(1, 1, (byte) 64);
                        return;
                    }
                } else {
                    ByteBufferList.add(0, 1, (byte) 58);
                    return;
                }
            }
        }
        $i1 = -1859364873 * Contact.out.text;
        i = Contact.out.context * -880399799;
        boolean $z0 = Contact.out.f323r;
        $z1 = Contact.out.value;
        boolean $z2 = Contact.out.count;
        boolean $z3 = Contact.out.index;
        Contact.out.add(-1557409212);
        if ($z0 && $i1 >= ((Contact.state * 286016249) + 765) - 50 && $i1 < (Contact.state * 286016249) + 765 && i >= 453 && i < 503) {
            try {
                Main.this$0.length = !Main.this$0.length;
                KeyPair.toString(-618640015);
                if (Main.this$0.length) {
                    Target.add((byte) 46);
                } else {
                    Class $r14 = client.header;
                    $i2 = $r14.get("scape main", -265658165);
                    Hashtable.read($r14, $i2, $r14.get($i2, "", 558344547), 255, false, -173028072);
                }
            } catch (Throwable $r6) {
                throw StringBuilder.append($r6, "dm.ar(" + ')');
            }
        }
        if (client.data * -1088302269 != 5) {
            if (-1 == Contact.f97d * 5805024227786355085L) {
                Contact.f97d = (LinkedList.toString(420850819) + 1000) * 7983316922449770821L;
            }
            long $l5 = LinkedList.toString(1936721650);
            if (Build$VERSION.add((byte) -89) && Contact.f100h * -1555930555276393901L == -1) {
                Contact.f100h = $l5 * -5168998457504656933L;
                if (-1555930555276393901L * Contact.f100h > 5805024227786355085L * Contact.f97d) {
                    Contact.f97d = 8773352624854309727L * Contact.f100h;
                }
            }
            Contact.f103n += 87175693;
            if (10 == client.data * -1088302269 || -1088302269 * client.data == 11) {
                if (client.title * -1387037251 == 0) {
                    if ($z0) {
                        $i2 = (286016249 * Contact.state) + 5;
                        if ($i1 >= $i2 && $i1 <= $i2 + 100 && i >= 463 && i <= 498) {
                            Hashtable.add((byte) 21);
                            return;
                        }
                    }
                    if (Chart.data != null) {
                        Hashtable.add((byte) -98);
                    }
                }
                $i2 = client.context.add((byte) 103);
                if (Contact.context * -1128182195 != $i2) {
                    Contact.context = -1403479419 * $i2;
                    ISO9796d2Signer.text = -352953765 * client.type;
                }
                if (1581849891 * client.type >= (2127459033 * ISO9796d2Signer.text) + 8) {
                    if (Contact.context * -1128182195 == -1 || $i2 >= (965797195 * Contact.f102m) + 171) {
                        Contact.f95b = -382493535;
                    } else {
                        Contact.f95b = (($i2 - (965797195 * Contact.f102m)) / 2) * -981790749;
                        if (Contact.f95b * 2130357707 < 0) {
                            Contact.f95b = 0;
                        }
                    }
                }
                if (Contact.f104p * -1519423211 != Contact.f95b * 2130357707) {
                    float $f0 = (((float) (2130357707 * Contact.f95b)) - Contact.f99g) * 0.25f;
                    if ($f0 > -0.5f && $f0 < 0.5f) {
                        $f0 = (float) ((Contact.f95b * 2130357707) - (Contact.f104p * -1519423211));
                    }
                    Contact.f99g = $f0 + Contact.f99g;
                    Contact.f104p = -35563971 * ((int) Contact.f99g);
                }
                int $i3;
                if (1773673955 * Contact.f109y == 0) {
                    if ($z2) {
                        client.context.getInstance(-1290553606).getBoolean(2015561932);
                        return;
                    }
                    $i3 = (-2051486435 * Main.f207x) - 80;
                    $i2 = ((-1519423211 * Contact.f104p) + 100) + 20;
                    if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                        IntegerPolynomial.update(PreferenceManager.get("secure", true, 1481093917) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, (byte) 14);
                    }
                    $i3 = (Main.f207x * -2051486435) + 80;
                    if (($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) || $z1) {
                        if (((1164415301 * client.f397m) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0) {
                            Contact.f105q = "";
                            Contact.id = R$id.ID;
                            Contact.last = R$id.TITLE;
                            Contact.f98e = R$id.f249e;
                            Contact.f109y = -574615605;
                            IllegalStateException.update(1405694588);
                        } else if (((client.f397m * 1164415301) & 4) != 0) {
                            int $i0 = client.f397m * 1164415301;
                            i = $i0;
                            if (($i0 & 1024) != 0) {
                                Contact.id = R$id.prefs;
                                Contact.last = R$id.edit;
                                Contact.f98e = R$id.model;
                            } else {
                                Contact.id = R$id.top;
                                Contact.last = R$id.zoom;
                                Contact.f98e = R$id.right;
                            }
                            Contact.f105q = R$id.left;
                            Contact.f109y = -574615605;
                            IllegalStateException.update(-908955434);
                        } else if (((1164415301 * client.f397m) & 1024) != 0) {
                            Contact.id = R$id.ZERO;
                            Contact.last = R$id.engine;
                            Contact.f98e = R$id.client;
                            Contact.f105q = R$id.left;
                            Contact.f109y = -574615605;
                            IllegalStateException.update(2090503641);
                        } else {
                            Rect.init(false, -516156937);
                        }
                    }
                } else if (1773673955 * Contact.f109y == 1) {
                    if ($z2) {
                        File.update(false, 750059213);
                    } else if ($z1) {
                        Rect.init(false, -1993658797);
                    }
                    $i3 = (Main.f207x * -2051486435) - 80;
                    $i2 = ((-1519423211 * Contact.f104p) + 100) + 50;
                    if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                        Rect.init(false, -1261810911);
                    }
                    $i3 = (-2051486435 * Main.f207x) + 80;
                    if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                        File.update(false, 750059213);
                    }
                } else if (Contact.f109y * 1773673955 == 2) {
                    $i2 = client.context.getInstance(-1290553606).getData(664971502).get((short) 6868);
                    if ($i2 >= 0) {
                        Contact.f108x = $i2 * 291675233;
                    }
                    $i2 = (((-1519423211 * Contact.f104p) + 100) - 70) + 52;
                    if ($z0 && i >= $i2 - 12 && i < $i2 + 2) {
                        Contact.f108x = 0;
                        client.context.getInstance(-1290553606).getData(664971502).toString(0, 1007712854);
                    }
                    $i2 += 15;
                    if ($z0 && i >= $i2 - 12 && i < $i2 + 2) {
                        Contact.f108x = 291675233;
                        client.context.getInstance(-1290553606).getData(664971502).toString(1, -112843060);
                    }
                    $i2 = ((-1519423211 * Contact.f104p) + 100) + 90;
                    if (!$z0 || i < $i2 - 15 || i >= $i2) {
                        $i3 = (-2051486435 * Main.f207x) - 80;
                        $i2 = ((Contact.f104p * -1519423211) + 100) + 50;
                        if (!$z0 || $i1 < $i3 - 75 || $i1 > $i3 + 75 || i < $i2 - 20 || i > $i2 + 20) {
                            $i3 = ((Contact.this$0 * 1103198973) + 180) + 80;
                            if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                                File.update(true, 750059213);
                                Contact.f106s = true;
                            }
                            $i3 = (Main.f207x * -2051486435) - 117;
                            $i2 = (-1519423211 * Contact.f104p) + Caption.Theme_spinnerStyle;
                            boolean z = $i1 >= $i3 && $i1 < $i3 + (JGitText.f166i * -436696909) && i >= $i2 && i < (1239940751 * LruCache.length) + $i2;
                            Contact.root = z;
                            if ($z0 && Contact.root) {
                                Contact.level = !Contact.level;
                                if (!Contact.level) {
                                    if (Main.this$0.text != null) {
                                        Main.this$0.text = null;
                                        KeyPair.toString(-560655959);
                                    }
                                }
                            }
                            $i3 = (-2051486435 * Main.f207x) + 24;
                            $i2 = (-1519423211 * Contact.f104p) + Caption.Theme_spinnerStyle;
                            z = $i1 >= $i3 && $i1 < $i3 + (JGitText.f166i * -436696909) && i >= $i2 && i < (LruCache.length * 1239940751) + $i2;
                            Contact.page = z;
                            if ($z0 && Contact.page) {
                                Main.this$0.count = !Main.this$0.count;
                                if (!Main.this$0.count) {
                                    Contact.text = "";
                                    Main.this$0.text = null;
                                    IllegalStateException.update(-727006865);
                                }
                                KeyPair.toString(-1593175052);
                            }
                            if ($z2) {
                                File.update(true, 750059213);
                                Contact.f106s = true;
                                return;
                            } else if ($z1) {
                                if (Contact.f108x * -2099968095 == 0) {
                                    Contact.f108x = 291675233;
                                    client.context.getInstance(-1290553606).getData(664971502).toString(1, -790663138);
                                    return;
                                }
                                Contact.f108x = 0;
                                client.context.getInstance(-1290553606).getData(664971502).toString(0, 170459678);
                                Contact.text = Contact.text.trim();
                                if (Contact.text.length() == 0) {
                                    TIntArrayList.append(R$id.page, R$id.repository, R$id.level, (byte) -46);
                                    return;
                                } else if (Contact.data.length() == 0) {
                                    TIntArrayList.append(R$id.app, R$id.input, R$id.parent, (byte) -85);
                                    return;
                                } else {
                                    TIntArrayList.append(R$id.f258s, R$id.f254n, R$id.f251h, (byte) -45);
                                    HashMap.add(false, 1135368824);
                                    IllegalStateException.add(20, -2142377188);
                                    return;
                                }
                            } else if ($z3) {
                                if (-2099968095 * Contact.f108x == 0) {
                                    Contact.f108x = 291675233;
                                    client.context.getInstance(-1290553606).getData(664971502).toString(1, 465134848);
                                    return;
                                }
                                Contact.f108x = 0;
                                client.context.getInstance(-1290553606).getData(664971502).toString(0, -1026071673);
                                return;
                            }
                        }
                        Contact.text = Contact.text.trim();
                        if (Contact.text.length() == 0) {
                            TIntArrayList.append(R$id.page, R$id.repository, R$id.level, (byte) -118);
                            return;
                        } else if (Contact.data.length() == 0) {
                            TIntArrayList.append(R$id.app, R$id.input, R$id.parent, (byte) -19);
                            return;
                        } else {
                            TIntArrayList.append(R$id.f258s, R$id.f254n, R$id.f251h, (byte) -3);
                            HashMap.add(false, 1135368824);
                            IllegalStateException.add(20, -2050971295);
                            return;
                        }
                    }
                    LogActivity.init(-1505346456);
                } else if (3 == Contact.f109y * 1773673955) {
                    $i2 = (Contact.this$0 * 1103198973) + 180;
                    $i3 = ((Contact.f104p * -1519423211) + 100) + 5;
                    if ($z1 || $z2 || ($z0 && $i1 >= $i2 - 75 && $i1 <= $i2 + 75 && i >= $i3 - 20 && i <= $i3 + 20)) {
                        Rect.init(false, -1300108482);
                    }
                    $i2 = (1103198973 * Contact.this$0) + 180;
                    $i3 = ((-1519423211 * Contact.f104p) + 100) + 55;
                    if ($z0 && $i1 >= $i2 - 75 && $i1 <= $i2 + 75 && i >= $i3 - 20 && i <= $i3 + 20) {
                        LogActivity.init(-673265611);
                    }
                } else if (Contact.f109y * 1773673955 == 4) {
                    $i3 = ((1103198973 * Contact.this$0) + 180) - 80;
                    $i2 = ((Contact.f104p * -1519423211) + 100) + 50;
                    if (!$z0 || $i1 < $i3 - 75 || $i1 > $i3 + 75 || i < $i2 - 20 || i > $i2 + 20) {
                        if ($z0 && $i1 >= ((1103198973 * Contact.this$0) + 180) - 130 && $i1 <= ((1103198973 * Contact.this$0) + 180) - 10 && i >= ((Contact.f104p * -1519423211) + 100) - 8 && i <= ((-1519423211 * Contact.f104p) + 100) + 25) {
                            client.context.getInstance(-1290553606).getData(664971502).append((byte) 2);
                        }
                        if ($z0 && $i1 >= ((1103198973 * Contact.this$0) + 180) - 9 && $i1 <= ((1103198973 * Contact.this$0) + 180) + 130 && i >= ((Contact.f104p * -1519423211) + 100) - 8 && i <= ((-1519423211 * Contact.f104p) + 100) + 25) {
                            Contact.f106s = !Contact.f106s;
                        }
                        if ($z0 && $i1 >= ((1103198973 * Contact.this$0) + 180) - 34 && $i1 <= ((Contact.this$0 * 1103198973) + 180) + 34 && i >= ((Contact.f104p * -1519423211) + 100) + 80 && i <= ((-1519423211 * Contact.f104p) + 100) + 92) {
                            IntegerPolynomial.update(PreferenceManager.get("secure", true, 132995359) + "m=totp-authenticator/disableTOTPRequest", true, false, (byte) 14);
                        }
                        $i3 = ((1103198973 * Contact.this$0) + 180) + 80;
                        if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                            File.update(true, 750059213);
                        }
                        if ($z2) {
                            File.update(true, 750059213);
                            return;
                        } else if ($z1) {
                            Context.value.trim();
                            if (Context.value.length() != 6) {
                                TIntArrayList.append(R$id.user, R$id.pass, R$id.target, (byte) -110);
                                return;
                            }
                            Page.f222n = Integer.parseInt(Context.value) * -1052798469;
                            Context.value = "";
                            HashMap.add(true, 1135368824);
                            TIntArrayList.append(R$id.f258s, R$id.f254n, R$id.f251h, (byte) -77);
                            IllegalStateException.add(20, -2092331270);
                            return;
                        }
                    }
                    Context.value.trim();
                    if (Context.value.length() != 6) {
                        TIntArrayList.append(R$id.user, R$id.pass, R$id.target, (byte) -2);
                        return;
                    }
                    Page.f222n = Integer.parseInt(Context.value) * -1052798469;
                    Context.value = "";
                    HashMap.add(true, 1135368824);
                    TIntArrayList.append(R$id.f258s, R$id.f254n, R$id.f251h, (byte) -46);
                    IllegalStateException.add(20, -2039491502);
                } else if (5 == Contact.f109y * 1773673955) {
                    $i2 = (Contact.this$0 * 1103198973) + 180;
                    $i3 = ((-1519423211 * Contact.f104p) + 100) + 9;
                    if (!$z0 || $i1 < $i2 - 140 || $i1 > $i2 + 140 || i < $i3 - 20 || i > $i3 + 20) {
                        $i3 = ((Contact.this$0 * 1103198973) + 180) - 80;
                        $i2 = ((-1519423211 * Contact.f104p) + 100) + 50;
                        if (!$z0 || $i1 < $i3 - 75 || $i1 > $i3 + 75 || i < $i2 - 20 || i > $i2 + 20) {
                            $i3 = ((Contact.this$0 * 1103198973) + 180) + 80;
                            if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                                Rect.init(true, -1286860287);
                            }
                            if ($z2) {
                                Rect.init(true, 976962522);
                                return;
                            } else if ($z1) {
                                File.execute(397178771);
                                return;
                            }
                        }
                        File.execute(397178771);
                        return;
                    }
                    client.context.getInstance(-1290553606).getData(664971502).append((byte) 2);
                } else if (6 == Contact.f109y * 1773673955) {
                    if ($z1 || $z2) {
                        Rect.init(true, -833619882);
                    }
                    $i1 = ((-1519423211 * Contact.f104p) + 100) + 50;
                    if ($z0 && i >= $i1 - 20 && i <= $i1 + 20) {
                        Rect.init(true, -999786972);
                    }
                } else if (7 == 1773673955 * Contact.f109y) {
                    $i3 = ((1103198973 * Contact.this$0) + 180) - 80;
                    $i2 = ((-1519423211 * Contact.f104p) + 100) + 50;
                    if (!$z0 || $i1 < $i3 - 75 || $i1 > $i3 + 75 || i < $i2 - 20 || i > $i2 + 20) {
                        $i3 = ((Contact.this$0 * 1103198973) + 180) + 80;
                        if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                            Rect.init(true, -2052435263);
                            return;
                        }
                    }
                    IntegerPolynomial.update(PreferenceManager.get("secure", true, 95001306) + "m=dob/set_dob.ws", true, false, (byte) 14);
                    TIntArrayList.append(R$id.f252i, R$id.f262x, R$id.f263y, (byte) -72);
                    Contact.f109y = 847273666;
                } else if (8 == Contact.f109y * 1773673955) {
                    $i3 = ((1103198973 * Contact.this$0) + 180) - 80;
                    $i2 = ((-1519423211 * Contact.f104p) + 100) + 50;
                    if (!$z0 || $i1 < $i3 - 75 || $i1 > $i3 + 75 || i < $i2 - 20 || i > $i2 + 20) {
                        $i3 = ((Contact.this$0 * 1103198973) + 180) + 80;
                        if ($z0 && $i1 >= $i3 - 75 && $i1 <= $i3 + 75 && i >= $i2 - 20 && i <= $i2 + 20) {
                            Rect.init(true, 1370781795);
                            return;
                        }
                    }
                    IntegerPolynomial.update("https://www.jagex.com/terms/privacy/#eight", true, false, (byte) 14);
                    TIntArrayList.append(R$id.f252i, R$id.f262x, R$id.f263y, (byte) -105);
                    Contact.f109y = 847273666;
                }
            }
        }
    }
}
