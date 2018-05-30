package p000;

/* compiled from: ga */
public final class Item extends Collection {
    static final int f157b = 3;
    int f158a;
    int f159c;
    int context;
    int count;
    int current;
    boolean data;
    int f160g;
    int head;
    int f161i;
    boolean id;
    Integer index;
    int f162j;
    public int key;
    public int length;
    int f163n;
    NodeList name;
    public String[] next;
    int path;
    int pos;
    public int size;
    boolean state;
    Connection this$0;
    NodeList title;
    public JSONObject type;
    int value;
    int width;
    int f164x;
    int f165y;

    Item() {
        try {
            this.f158a = -486147381;
            this.f161i = 351237313;
            this.next = new String[3];
            for (int $i0 = 0; $i0 < 3; $i0++) {
                this.next[$i0] = "";
            }
            this.size = 0;
            this.key = 0;
            this.current = 0;
            this.path = 0;
            this.state = false;
            this.length = 0;
            this.data = false;
            this.name = NodeList.name;
            this.title = NodeList.name;
            this.id = false;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ga.<init>(" + ')');
        }
    }

    static int parse(int $i0, CharSequence charSequence, boolean z, byte b) {
        boolean $i2 = false;
        int[] $r1;
        int $i22;
        if (3903 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            try {
                $i0 = $r1[$i0 * 537618701];
                $r1 = XMLParser.this$0;
                $i22 = XMLParser.type - 1194553915;
                XMLParser.type = $i22;
                $r1[($i22 * 537618701) - 1] = client.target[$i0].get((byte) -26);
                return 1;
            } catch (RuntimeException $r6) {
                throw StringBuilder.append($r6, "ga.az(" + ')');
            }
        } else if ($i0 == 3904) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            $i22 = XMLParser.type - 1194553915;
            XMLParser.type = $i22;
            $r1[($i22 * 537618701) - 1] = client.target[$i0].state * 1845400323;
            return 1;
        } else if ($i0 == 3905) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            $i22 = XMLParser.type - 1194553915;
            XMLParser.type = $i22;
            $r1[($i22 * 537618701) - 1] = client.target[$i0].value * -1928030811;
            return 1;
        } else if (3906 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            $i22 = XMLParser.type - 1194553915;
            XMLParser.type = $i22;
            $r1[($i22 * 537618701) - 1] = client.target[$i0].name * -672413105;
            return 1;
        } else if ($i0 == 3907) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            $i22 = XMLParser.type - 1194553915;
            XMLParser.type = $i22;
            $r1[($i22 * 537618701) - 1] = client.target[$i0].pos * -732345473;
            return 1;
        } else if ($i0 == 3908) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = $r1[$i0 * 537618701];
            $r1 = XMLParser.this$0;
            $i22 = XMLParser.type - 1194553915;
            XMLParser.type = $i22;
            $r1[($i22 * 537618701) - 1] = client.target[$i0].data * -1822937453;
            return 1;
        } else if (3910 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = XMLParser.this$0;
            r23 = XMLParser.type - 1194553915;
            XMLParser.type = r23;
            r23 = (r23 * 537618701) - 1;
            if ($i0 == 0) {
                $i22 = 1;
            }
            $r1[r23] = $i22;
            return 1;
        } else if (3911 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = XMLParser.this$0;
            r23 = XMLParser.type - 1194553915;
            XMLParser.type = r23;
            r23 = (r23 * 537618701) - 1;
            if ($i0 == 2) {
                $i22 = 1;
            }
            $r1[r23] = $i22;
            return 1;
        } else if (3912 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = XMLParser.this$0;
            r23 = XMLParser.type - 1194553915;
            XMLParser.type = r23;
            r23 = (r23 * 537618701) - 1;
            if ($i0 == 5) {
                $i22 = 1;
            }
            $r1[r23] = $i22;
            return 1;
        } else if (3913 == $i0) {
            $r1 = XMLParser.this$0;
            $i0 = XMLParser.type - -1194553915;
            XMLParser.type = $i0;
            $i0 = client.target[$r1[$i0 * 537618701]].set((byte) 32);
            $r1 = XMLParser.this$0;
            r23 = XMLParser.type - 1194553915;
            XMLParser.type = r23;
            r23 = (r23 * 537618701) - 1;
            if (1 == $i0) {
                $i22 = 1;
            }
            $r1[r23] = $i22;
            return 1;
        } else {
            if ($i0 == 3914) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i2 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.text, $i2, -491333245);
                    return 1;
                }
            } else if (3915 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i2 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.url, $i2, -1220942307);
                    return 1;
                }
            } else if ($i0 == 3916) {
                XMLParser.type -= 1905859466;
                z = 1 == XMLParser.this$0[XMLParser.type * 537618701];
                if (XMLParser.this$0[(XMLParser.type * 537618701) + 1] == 1) {
                    $i2 = true;
                }
                if (ZStream.data != null) {
                    client.intent.id = $i2;
                    ZStream.data.add(client.intent, z, 131582687);
                    return 1;
                }
            } else if ($i0 == 3917) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i2 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.type, $i2, -399445629);
                    return 1;
                }
            } else if (3918 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                if ($r1[$i0 * 537618701] == 1) {
                    $i2 = true;
                }
                if (ZStream.data != null) {
                    ZStream.data.add(Note.intent, $i2, -834424335);
                    return 1;
                }
            } else if ($i0 == 3919) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $i0 = ($i0 * 537618701) - 1;
                if (ZStream.data != null) {
                    $r10 = ZStream.data.data;
                    $i22 = $r10.size();
                }
                $r1[$i0] = $i22;
                return 1;
            } else if ($i0 == 3920) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r12.index * -215043303;
                return 1;
            } else if ($i0 == 3921) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r14 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r14[($i0 * -1267697097) - 1] = $r12.getKey(-1462247273);
                return 1;
            } else if (3922 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r14 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r14[($i0 * -1267697097) - 1] = $r12.getParent(2123483448);
                return 1;
            } else if (3923 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                long linkedList = (LinkedList.toString(1421592243) - (DrawingGroup.logger * 5304096097959642155L)) - (((AstNode) $r10.get($i0)).position * 8313538393492320215L);
                $i0 = (int) (linkedList / 3600000);
                long $l5 = (linkedList - ((long) (3600000 * $i0))) / 60000;
                long j = $l5;
                $i22 = (int) $l5;
                int $i3 = ((linkedList - ((long) (3600000 * $i0))) - ((long) (60000 * $i22))) / 1000;
                linkedList = $i3;
                r23 = (int) $i3;
                String $r8 = $i0 + ":" + ($i22 / 10) + ($i22 % 10) + ":" + (r23 / 10) + (r23 % 10);
                $r14 = XMLParser.data;
                $i0 = XMLParser.value - 1246602361;
                XMLParser.value = $i0;
                $r14[($i0 * -1267697097) - 1] = $r8;
                return 1;
            } else if (3924 == $i0) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r12.this$0.name * -672413105;
                return 1;
            } else if ($i0 == 3925) {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r12.this$0.value * -1928030811;
                return 1;
            } else if (3926 != $i0) {
                return 2;
            } else {
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - -1194553915;
                XMLParser.type = $i0;
                $i0 = $r1[$i0 * 537618701];
                $r10 = ZStream.data.data;
                $r10 = $r10;
                $r12 = (AstNode) $r10.get($i0);
                $r1 = XMLParser.this$0;
                $i0 = XMLParser.type - 1194553915;
                XMLParser.type = $i0;
                $r1[($i0 * 537618701) - 1] = $r12.this$0.state * 1845400323;
            }
            return 1;
        }
    }

    int m32a() {
        return (this.this$0 == null || this.this$0.index * -2141377661 == -1) ? 1 : Thread.add(this.this$0.index * -2141377661, (byte) 20).size * 1160465393;
    }

    protected final Integer add() {
        if (this.this$0 == null) {
            return null;
        }
        int $i1;
        int i;
        JSONArray $r7;
        Integer $r8;
        Integer $r5;
        Integer $r3;
        JSONArray $r6 = (this.data * 1462124603 == -1 || this.start * 1913892303 != 0) ? null : AbstractBuffer.get(this.data * 1462124603, 1911672203);
        if (!(this.text * 259701737 == -1 || this.state)) {
            $i1 = this.text * 259701737;
            i = $i1;
            if (-629432309 * this.type != $i1 || $r6 == null) {
                $r7 = AbstractBuffer.get(259701737 * this.text, 69693423);
                $r8 = this.this$0.toString($r6, 1816971127 * this.position, $r7, 782711805 * this.bytes, 1019140098);
                $r5 = $r8;
                if ($r8 == null) {
                    return null;
                }
                $r8.append();
                this.f72n = 1007229383 * $r8.size;
                if (!(this.state || 269129085 * this.state == -1 || this.f62a * 628512873 == -1)) {
                    $r3 = HyperlinkRecord.get(269129085 * this.state, 2073232600).get(628512873 * this.f62a, -1786354749);
                    if ($r3 != null) {
                        $r3.append(0, -(1216037183 * this.active), 0);
                        Integer integer = new Integer(new Integer[]{$r8, $r3}, 2);
                    }
                }
                if (!(this.state || this.index == null)) {
                    if (client.type * 1581849891 >= -1100434689 * this.path) {
                        this.index = null;
                    }
                    $i1 = this.current * -55133803;
                    i = $i1;
                    if (1581849891 * client.type >= $i1) {
                        $i1 = this.path * -1100434689;
                        i = $i1;
                        if (client.type * 1581849891 < $i1) {
                            $r3 = this.index;
                            $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -794732143) - (this.value * -500717985), (-1470637133 * this.count) - (this.value * 2328865));
                            if (512 == this.name * -1058596255) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            } else if (1024 == this.name * -1058596255) {
                                $r3.close();
                                $r3.close();
                            } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                $r3.close();
                            }
                            $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                            if (this.name * -1058596255 == 512) {
                                $r3.close();
                            } else if (this.name * -1058596255 == 1024) {
                                $r3.close();
                                $r3.close();
                            } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            }
                            $r3.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
                        }
                    }
                }
                $r5.flags = true;
                return $r5;
            }
        }
        $r7 = null;
        $r8 = this.this$0.toString($r6, 1816971127 * this.position, $r7, 782711805 * this.bytes, 1019140098);
        $r5 = $r8;
        if ($r8 == null) {
            return null;
        }
        $r8.append();
        this.f72n = 1007229383 * $r8.size;
        $r3 = HyperlinkRecord.get(269129085 * this.state, 2073232600).get(628512873 * this.f62a, -1786354749);
        if ($r3 != null) {
            $r3.append(0, -(1216037183 * this.active), 0);
            Integer integer2 = new Integer(new Integer[]{$r8, $r3}, 2);
        }
        if (client.type * 1581849891 >= -1100434689 * this.path) {
            this.index = null;
        }
        $i1 = this.current * -55133803;
        i = $i1;
        if (1581849891 * client.type >= $i1) {
            $i1 = this.path * -1100434689;
            i = $i1;
            if (client.type * 1581849891 < $i1) {
                $r3 = this.index;
                $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -794732143) - (this.value * -500717985), (-1470637133 * this.count) - (this.value * 2328865));
                if (512 == this.name * -1058596255) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                } else if (1024 == this.name * -1058596255) {
                    $r3.close();
                    $r3.close();
                } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                    $r3.close();
                }
                $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                if (this.name * -1058596255 == 512) {
                    $r3.close();
                } else if (this.name * -1058596255 == 1024) {
                    $r3.close();
                    $r3.close();
                } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                }
                $r3.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
            }
        }
        $r5.flags = true;
        return $r5;
    }

    void add(byte b) {
        try {
            this.name = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ga.aa(" + ')');
        }
    }

    void add(int i, int i2) {
        this.parent = 0;
        this.width = 0;
        this.height = 0;
        this.this$0[0] = i;
        this.length[0] = i2;
        i = getKey(-1965420110);
        this.size = (243991058 * i) + (this.this$0[0] * -1625463745);
        this.value = (i * -1798391744) + (this.length[0] * 698183808);
    }

    final void add(int i, int i2, byte b) {
        if (-1674866922 * this.data != -1 && AbstractBuffer.get(1462124603 * this.data, 1921242860).value * -990546557 == 1) {
            this.data = 1072191740;
        }
        this.next = 1918182942;
        if (i < 0 || i >= 104 || i2 < 0 || i2 >= 104) {
            add(i, i2, -1923695613);
        } else if (this.this$0[0] < 0 || this.this$0[0] >= 1237150709 || this.length[0] < 0 || this.length[0] >= -2114748901) {
            add(i, i2, -1966518827);
        } else {
            if (b == (byte) 2) {
                int $i3 = this.this$0[0];
                int $i6 = this.length[0];
                int $i4 = getKey(-2144539670);
                if ($i3 >= $i4 && $i3 < -1835300400 - $i4 && $i6 >= $i4 && $i6 < -2103117328 - $i4 && i >= $i4 && i < -1086293615 - $i4 && i2 >= $i4) {
                    if (i2 < DiskLruCache.AppCompatTheme_editTextStyle - $i4) {
                        $i4 = getKey(-2010221750);
                        client.array.size = 428624033 * i;
                        client.array.count = -945157175 * i2;
                        client.array.value = 1718549013;
                        client.array.id = -654412111;
                        $i3 = StringBuffer.toString($i3, $i6, $i4, client.array, client.value[176805207 * this.context], true, client.entries, client.mask, (byte) 1);
                        if ($i3 >= 1) {
                            for ($i6 = 0; $i6 < $i3 - 1; $i6++) {
                                add(client.entries[$i6], client.mask[$i6], (byte) 2, 1294109244);
                            }
                        }
                    }
                }
            }
            add(i, i2, b, 1294109244);
        }
    }

    final void add(int i, int i2, byte b, int i3) {
        try {
            if (this.parent * 761444243 < 9) {
                int $i3 = this.parent - 521273701;
                i3 = $i3;
                this.parent = $i3;
            }
            for (i3 = this.parent * 761444243; i3 > 0; i3--) {
                this.this$0[i3] = this.this$0[i3 - 1];
                this.length[i3] = this.length[i3 - 1];
                this.log[i3] = this.log[i3 - 1];
            }
            this.this$0[0] = i;
            this.length[0] = i2;
            this.log[0] = b;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "ga.ab(" + ')');
        }
    }

    void add(int i, int i2, int i3) {
        try {
            this.parent = 0;
            this.width = 0;
            this.height = 0;
            this.this$0[0] = i;
            this.length[0] = i2;
            i = getKey(-1937542109);
            this.size = (1947821632 * i) + (this.this$0[0] * -399324032);
            this.value = (i * -1798391744) + (this.length[0] * 698183808);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ga.at(" + ')');
        }
    }

    final void add(Logger logger) {
        int $i3;
        int i;
        boolean $z0 = false;
        logger.data = 0;
        int $i0 = logger.get((byte) 0);
        this.f158a = logger.next(1247983979) * 486147381;
        this.f161i = logger.next(1247983979) * -1815132178;
        int $i2 = -1;
        this.length = 0;
        int[] $r2 = new int[12];
        for ($i3 = 0; $i3 < 12; $i3++) {
            int $i4 = logger.get((byte) 0);
            if ($i4 != 0) {
                $r2[$i3] = ($i4 << 8) + logger.get((byte) 0);
                if ($i3 == 0 && $r2[0] == -429111585) {
                    $i2 = logger.get(-672669103);
                    break;
                } else if ($r2[$i3] >= 512) {
                    i = Set.get($r2[$i3] - -111923186, 1786142426).state * -1569457918;
                    if (i != 0) {
                        int $i5 = i * -799911275;
                        i = $i5;
                        this.length = $i5;
                    }
                }
            } else {
                $r2[$i3] = 0;
            }
        }
        int[] $r10 = new int[5];
        $i3 = 0;
        while ($i3 < 5) {
            i = logger.get((byte) 0);
            $i4 = i;
            if (i < 0 || i >= NodeList.size[$i3].length) {
                $i4 = 0;
            }
            $r10[$i3] = $i4;
            $i3++;
        }
        this.type = logger.get(680879491) * 108915619;
        if (65535 == -1877809413 * this.type) {
            this.type = -108915619;
        }
        this.status = logger.get(1547526507) * -878920581;
        if (this.status * 986301107 == 1724765803) {
            this.status = 878920581;
        }
        this.f69i = 2110696645 * this.status;
        this.flags = logger.get(1672452692) * 1523276509;
        if (65535 == -495497867 * this.flags) {
            this.flags = 1962189787;
        }
        this.min = logger.get(22296152) * 539275743;
        if (-329496033 * this.min == 2086050163) {
            this.min = -539275743;
        }
        this.max = logger.get(-356799959) * -447796541;
        if (-268533762 * this.max == -1331770841) {
            this.max = 447796541;
        }
        this.f79x = logger.get(-1227461169) * -1417021614;
        if (65535 == this.f79x * 856306140) {
            this.f79x = 1721148605;
        }
        this.element = logger.get(474866458) * 1627332603;
        if (-2103869093 * this.element == -111704557) {
            this.element = -1889478827;
        }
        this.type = new JSONObject(logger.toString(768096701), LogActivity.type);
        add((byte) 5);
        set(507984534);
        if (File.this$0 == this) {
            Wrapper.code = this.type.toString(1215249147);
        }
        this.size = logger.get((byte) 0) * 1809168151;
        this.key = logger.get(1189806157) * -1745473922;
        this.data = logger.get((byte) 0) == 1;
        if (-849541005 * client.activity == 0 && 519718896 * client.out >= 2) {
            this.data = false;
        }
        if (this.this$0 == null) {
            this.this$0 = new Connection();
        }
        Connection $r3 = this.this$0;
        if ($i0 == 1) {
            $z0 = true;
        }
        $r3.toString($r2, $r10, $z0, $i2, 542614623);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void add(p000.Logger r30, int r31) {
        /*
        r29 = this;
        r6 = 1;
        r7 = 0;
        r0 = r30;
        r0.data = r7;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 0;
        r0 = r30;
        r31 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r30;
        r8 = r0.next(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 486147381; // 0x1cfa0535 float:1.6544958E-21 double:2.4018872E-315;
        r9 = r8 * r7;
        r0 = r29;
        r0.f158a = r9;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1247983979; // 0x4a62b96b float:3714650.8 double:6.165860106E-315;
        r0 = r30;
        r8 = r0.next(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = -351237313; // 0xffffffffeb108b3f float:-1.7474289E26 double:NaN;
        r9 = r8 * r7;
        r0 = r29;
        r0.f161i = r9;	 Catch:{ RuntimeException -> 0x024c }
        r9 = -1;
        r7 = 0;
        r0 = r29;
        r0.length = r7;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 12;
        r10 = new int[r7];	 Catch:{ RuntimeException -> 0x024c }
        r11 = 0;
    L_0x003c:
        r7 = 12;
        if (r11 >= r7) goto L_0x0295;
    L_0x0040:
        r7 = 0;
        r0 = r30;
        r12 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        if (r12 != 0) goto L_0x0273;
    L_0x0049:
        r7 = 0;
        r10[r11] = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x004c:
        r11 = r11 + 1;
        goto L_0x003c;
    L_0x004f:
        r7 = -1585468955; // 0xffffffffa17fa9e5 float:-8.6622214E-19 double:NaN;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 108915619; // 0x67deba3 float:4.775713E-35 double:5.38114656E-316;
        r11 = r11 * r7;
        r0 = r29;
        r0.type = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.type;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -629432309; // 0xffffffffda7ba00b float:-1.77065471E16 double:NaN;
        r11 = r7 * r11;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r7 != r11) goto L_0x0075;
    L_0x006e:
        r7 = -108915619; // 0xfffffffff982145d float:-8.442645E34 double:NaN;
        r0 = r29;
        r0.type = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x0075:
        r7 = -299367069; // 0xffffffffee280563 float:-1.2999998E28 double:NaN;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = -878920581; // 0xffffffffcb9cbc7b float:-2.0543734E7 double:NaN;
        r11 = r11 * r7;
        r0 = r29;
        r0.status = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.status;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 986301107; // 0x3ac9c2b3 float:0.0015393108 double:4.872974934E-315;
        r11 = r11 * r7;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r11 != r7) goto L_0x009a;
    L_0x0093:
        r7 = 878920581; // 0x34634385 float:2.1165586E-7 double:4.342444645E-315;
        r0 = r29;
        r0.status = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x009a:
        r0 = r29;
        r11 = r0.status;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 2110696645; // 0x7dceacc5 float:3.4339755E37 double:1.042822701E-314;
        r11 = r7 * r11;
        r0 = r29;
        r0.f69i = r11;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -1163229370; // 0xffffffffbaaa8746 float:-0.0013010285 double:NaN;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1523276509; // 0x5acb5add float:2.86196628E16 double:7.52598592E-315;
        r11 = r11 * r7;
        r0 = r29;
        r0.flags = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.flags;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -495497867; // 0xffffffffe2774d75 float:-1.1404818E21 double:NaN;
        r11 = r7 * r11;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r7 != r11) goto L_0x00cd;
    L_0x00c6:
        r7 = -1523276509; // 0xffffffffa534a523 float:-1.5668462E-16 double:NaN;
        r0 = r29;
        r0.flags = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x00cd:
        r7 = 630380911; // 0x2592d96f float:2.5474301E-16 double:3.11449552E-315;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 539275743; // 0x2024b1df float:1.3950193E-19 double:2.664376183E-315;
        r11 = r11 * r7;
        r0 = r29;
        r0.min = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.min;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -329496033; // 0xffffffffec5c4a1f float:-1.0652548E27 double:NaN;
        r11 = r7 * r11;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r11 != r7) goto L_0x00f3;
    L_0x00ec:
        r7 = -539275743; // 0xffffffffdfdb4e21 float:-3.1605209E19 double:NaN;
        r0 = r29;
        r0.min = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x00f3:
        r7 = -811197241; // 0xffffffffcfa61cc7 float:-5.5738076E9 double:NaN;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = -447796541; // 0xffffffffe54f2ac3 float:-6.1144917E22 double:NaN;
        r11 = r11 * r7;
        r0 = r29;
        r0.max = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.max;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -1874110997; // 0xffffffff904b55eb float:-4.010088E-29 double:NaN;
        r11 = r7 * r11;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r11 != r7) goto L_0x0119;
    L_0x0112:
        r7 = 447796541; // 0x1ab0d53d float:7.31364E-23 double:2.21240887E-315;
        r0 = r29;
        r0.max = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x0119:
        r7 = 2077737986; // 0x7bd7c402 float:2.2406387E36 double:1.02653896E-314;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = -1542339397; // 0xffffffffa411c4bb float:-3.16085E-17 double:NaN;
        r11 = r11 * r7;
        r0 = r29;
        r0.f79x = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.f79x;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 303292531; // 0x1213e073 float:4.6661676E-28 double:1.4984642E-315;
        r11 = r11 * r7;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r7 != r11) goto L_0x013e;
    L_0x0137:
        r7 = 1542339397; // 0x5bee3b45 float:1.34112424E17 double:7.620169103E-315;
        r0 = r29;
        r0.f79x = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x013e:
        r7 = 1664258838; // 0x63329316 float:3.294119E21 double:8.222531176E-315;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1627332603; // 0x60ff1ffb float:1.47069505E20 double:8.040091335E-315;
        r11 = r11 * r7;
        r0 = r29;
        r0.element = r11;	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r11 = r0.element;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 114758451; // 0x6d71333 float:8.090222E-35 double:5.6698208E-316;
        r11 = r7 * r11;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r11 != r7) goto L_0x0164;
    L_0x015d:
        r7 = -1627332603; // 0xffffffff9f00e005 float:-2.729036E-20 double:NaN;
        r0 = r29;
        r0.element = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x0164:
        r13 = new JSONObject;
        r7 = 1233525427; // 0x49861ab3 float:1098582.4 double:6.094425368E-315;
        r0 = r30;
        r14 = r0.toString(r7);	 Catch:{ RuntimeException -> 0x024c }
        r15 = p000.LogActivity.type;
        r13.<init>(r14, r15);	 Catch:{ RuntimeException -> 0x024c }
        r0 = r29;
        r0.type = r13;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 5;
        r0 = r29;
        r0.add(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = -771904666; // 0xffffffffd1fdab66 float:-1.36187789E11 double:NaN;
        r0 = r29;
        r0.set(r7);	 Catch:{ RuntimeException -> 0x024c }
        r16 = p000.File.this$0;
        r0 = r16;
        r1 = r29;
        if (r0 != r1) goto L_0x019b;
    L_0x018e:
        r0 = r29;
        r13 = r0.type;	 Catch:{ RuntimeException -> 0x024c }
        r7 = -293555405; // 0xffffffffee80b333 float:-1.991536E28 double:NaN;
        r14 = r13.toString(r7);	 Catch:{ RuntimeException -> 0x024c }
        p000.Wrapper.code = r14;
    L_0x019b:
        r7 = 0;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1809168151; // 0x6bd5b717 float:5.1673163E26 double:8.93847831E-315;
        r11 = r11 * r7;
        r0 = r29;
        r0.size = r11;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 2060737318; // 0x7ad45b26 float:5.5130782E35 double:1.018139514E-314;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1176356239; // 0x461dc58f float:10097.39 double:5.81197205E-315;
        r11 = r11 * r7;
        r0 = r29;
        r0.key = r11;	 Catch:{ RuntimeException -> 0x024c }
        r7 = 0;
        r0 = r30;
        r11 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r7 = 1;
        if (r11 != r7) goto L_0x02be;
    L_0x01c5:
        r17 = 1;
    L_0x01c7:
        r0 = r17;
        r1 = r29;
        r1.data = r0;	 Catch:{ RuntimeException -> 0x024c }
        r11 = p000.client.activity;
        r7 = 1902364993; // 0x7163c941 float:1.1279424E30 double:9.39893189E-315;
        r11 = r7 * r11;
        if (r11 != 0) goto L_0x01e5;
    L_0x01d6:
        r11 = p000.client.out;
        r7 = -2036797811; // 0xffffffff8698ee8d float:-5.7526564E-35 double:NaN;
        r11 = r7 * r11;
        r7 = 2;
        if (r11 < r7) goto L_0x01e5;
    L_0x01e0:
        r7 = 0;
        r0 = r29;
        r0.data = r7;	 Catch:{ RuntimeException -> 0x024c }
    L_0x01e5:
        r0 = r29;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x024c }
        r18 = r0;
        if (r18 != 0) goto L_0x01fa;
    L_0x01ed:
        r18 = new Connection;
        r0 = r18;
        r0.<init>();	 Catch:{ RuntimeException -> 0x024c }
        r0 = r18;
        r1 = r29;
        r1.this$0 = r0;	 Catch:{ RuntimeException -> 0x024c }
    L_0x01fa:
        r0 = r29;
        r0 = r0.this$0;	 Catch:{ RuntimeException -> 0x024c }
        r18 = r0;
        r7 = 1;
        r0 = r31;
        if (r0 != r7) goto L_0x02c3;
    L_0x0205:
        r7 = 542614623; // 0x2057a45f float:1.8265594E-19 double:2.68087244E-315;
        r0 = r18;
        r1 = r10;
        r2 = r19;
        r3 = r6;
        r4 = r9;
        r5 = r7;
        r0.toString(r1, r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x024c }
        return;
    L_0x0214:
        r20 = r10[r11];	 Catch:{ RuntimeException -> 0x024c }
        r7 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r20;
        if (r0 < r7) goto L_0x004c;
    L_0x021c:
        r20 = r10[r11];	 Catch:{ RuntimeException -> 0x024c }
        r0 = r20;
        r0 = r0 + -512;
        r20 = r0;
        r7 = 1249169045; // 0x4a74ce95 float:4010917.2 double:6.17171511E-315;
        r0 = r20;
        r21 = p000.Set.get(r0, r7);	 Catch:{ RuntimeException -> 0x024c }
        r0 = r21;
        r0 = r0.state;	 Catch:{ RuntimeException -> 0x024c }
        r20 = r0;
        r7 = 1531027521; // 0x5b41a041 float:5.4500872E16 double:7.56428101E-315;
        r0 = r20;
        r0 = r0 * r7;
        r20 = r0;
        if (r20 == 0) goto L_0x004c;
    L_0x023d:
        r7 = 590333569; // 0x232fc681 float:9.528804E-18 double:2.91663536E-315;
        r0 = r20;
        r0 = r0 * r7;
        r20 = r0;
        r1 = r29;
        r1.length = r0;	 Catch:{ RuntimeException -> 0x024c }
        goto L_0x004c;
    L_0x024c:
        r22 = move-exception;
        r23 = new java.lang.StringBuilder;
        r0 = r23;
        r0.<init>();
        r24 = "ga.af(";
        r0 = r23;
        r1 = r24;
        r23 = r0.append(r1);
        r7 = 41;
        r0 = r23;
        r23 = r0.append(r7);
        r0 = r23;
        r14 = r0.toString();
        r0 = r22;
        r25 = p000.StringBuilder.append(r0, r14);
        throw r25;
    L_0x0273:
        r7 = 0;
        r0 = r30;
        r20 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r12 = r12 << 8;
        r20 = r12 + r20;
        r10[r11] = r20;	 Catch:{ RuntimeException -> 0x024c }
        if (r11 != 0) goto L_0x0214;
    L_0x0282:
        r7 = 0;
        r20 = r10[r7];	 Catch:{ RuntimeException -> 0x024c }
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r0 = r20;
        if (r0 != r7) goto L_0x0214;
    L_0x028c:
        r7 = 1187374436; // 0x46c5e564 float:25330.695 double:5.866409176E-315;
        r0 = r30;
        r9 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
    L_0x0295:
        r7 = 5;
        r0 = new int[r7];	 Catch:{ RuntimeException -> 0x024c }
        r19 = r0;
        r11 = 0;
    L_0x029b:
        r7 = 5;
        if (r11 >= r7) goto L_0x004f;
    L_0x029e:
        r7 = 0;
        r0 = r30;
        r20 = r0.get(r7);	 Catch:{ RuntimeException -> 0x024c }
        r12 = r20;
        if (r20 < 0) goto L_0x02b8;
    L_0x02a9:
        r26 = p000.NodeList.size;
        r27 = r26[r11];	 Catch:{ RuntimeException -> 0x024c }
        r0 = r27;
        r0 = r0.length;	 Catch:{ RuntimeException -> 0x024c }
        r28 = r0;
        r0 = r20;
        r1 = r28;
        if (r0 < r1) goto L_0x02b9;
    L_0x02b8:
        r12 = 0;
    L_0x02b9:
        r19[r11] = r12;	 Catch:{ RuntimeException -> 0x024c }
        r11 = r11 + 1;
        goto L_0x029b;
    L_0x02be:
        r17 = 0;
        goto L_0x01c7;
    L_0x02c3:
        r6 = 0;
        goto L_0x0205;
        */
        throw new UnsupportedOperationException("Method not decompiled: Item.add(Logger, int):void");
    }

    void clear() {
        this.name = NodeList.name;
    }

    protected final Integer clone() {
        if (this.this$0 == null) {
            return null;
        }
        JSONArray $r2 = (this.data * 1462124603 == -1 || this.start * 1913892303 != 0) ? null : AbstractBuffer.get(this.data * 1462124603, 587810478);
        JSONArray $r3 = (this.text * 259701737 == -1 || this.state || (-629432309 * this.type == this.text * 259701737 && $r2 != null)) ? null : AbstractBuffer.get(259701737 * this.text, 378567212);
        Integer $r4 = this.this$0.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, 650255250);
        Integer $r5 = $r4;
        if ($r4 == null) {
            return null;
        }
        $r4.append();
        this.f72n = 1007229383 * $r4.size;
        if (!(this.state || 269129085 * this.state == -1 || this.f62a * 628512873 == -1)) {
            Integer $r7 = HyperlinkRecord.get(269129085 * this.state, 1787304481).get(628512873 * this.f62a, -1877422482);
            if ($r7 != null) {
                $r7.append(0, -(1216037183 * this.active), 0);
                $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
            }
        }
        if (!(this.state || this.index == null)) {
            if (client.type * 1581849891 >= -1100434689 * this.path) {
                this.index = null;
            }
            if (1581849891 * client.type >= this.current * -55133803 && client.type * 1581849891 < this.path * -1100434689) {
                $r4 = this.index;
                $r4.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -794732143) - (this.value * -500717985), (-1470637133 * this.count) - (this.value * 2328865));
                if (512 == this.name * -1058596255) {
                    $r4.close();
                    $r4.close();
                    $r4.close();
                } else if (1024 == this.name * -1058596255) {
                    $r4.close();
                    $r4.close();
                } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                    $r4.close();
                }
                $r5 = new Integer(new Integer[]{$r5, $r4}, 2);
                if (this.name * -1058596255 == 512) {
                    $r4.close();
                } else if (this.name * -1058596255 == 1024) {
                    $r4.close();
                    $r4.close();
                } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                    $r4.close();
                    $r4.close();
                    $r4.close();
                }
                $r4.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
            }
        }
        $r5.flags = true;
        return $r5;
    }

    int compareTo() {
        return (this.this$0 == null || this.this$0.index * -2141377661 == -1) ? 1 : Thread.add(this.this$0.index * -2141377661, (byte) 34).size * 1160465393;
    }

    boolean contains() {
        if (NodeList.name == this.name) {
            load(-1018206210);
        }
        return NodeList.this$0 == this.name;
    }

    void equals() {
        NodeList $r3 = (MyAsyncTask.this$0 == null || !MyAsyncTask.this$0.get(this.type, (byte) 0)) ? NodeList.value : NodeList.this$0;
        this.title = $r3;
    }

    int execute() {
        return (this.this$0 == null || 1864208729 * this.this$0.index == -1) ? 1 : Thread.add(this.this$0.index * -339747455, (byte) 61).size * -2007031940;
    }

    final void flush(int i, int i2, byte b) {
        if (this.parent * 761444243 < 9) {
            this.parent -= 521273701;
        }
        for (int $i3 = this.parent * 761444243; $i3 > 0; $i3--) {
            this.this$0[$i3] = this.this$0[$i3 - 1];
            this.length[$i3] = this.length[$i3 - 1];
            this.log[$i3] = this.log[$i3 - 1];
        }
        this.this$0[0] = i;
        this.length[0] = i2;
        this.log[0] = b;
    }

    final void get(int i, int i2, byte b) {
        if (1462124603 * this.data != -1 && AbstractBuffer.get(1462124603 * this.data, 1420789744).value * -990546557 == 1) {
            this.data = 2033542925;
        }
        this.next = -464408867;
        if (i < 0 || i >= 104 || i2 < 0 || i2 >= 104) {
            add(i, i2, -1480618823);
        } else if (this.this$0[0] < 0 || this.this$0[0] >= DiskLruCache.AppCompatTheme_editTextStyle || this.length[0] < 0 || this.length[0] >= DiskLruCache.AppCompatTheme_editTextStyle) {
            add(i, i2, -2052669175);
        } else {
            if (b == (byte) 2) {
                int $i3 = this.this$0[0];
                int $i4 = this.length[0];
                int $i5 = getKey(-2054833894);
                if ($i3 >= $i5 && $i3 < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && $i4 >= $i5 && $i4 < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && i >= $i5 && i < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && i2 >= $i5) {
                    if (i2 < DiskLruCache.AppCompatTheme_editTextStyle - $i5) {
                        $i5 = getKey(-2060705115);
                        client.array.size = -2029814105 * i;
                        client.array.count = -945157175 * i2;
                        client.array.value = -1253946821;
                        client.array.id = 1170143321;
                        $i3 = StringBuffer.toString($i3, $i4, $i5, client.array, client.value[-277606385 * this.context], true, client.entries, client.mask, (byte) 1);
                        if ($i3 >= 1) {
                            for ($i4 = 0; $i4 < $i3 - 1; $i4++) {
                                add(client.entries[$i4], client.mask[$i4], (byte) 2, 1294109244);
                            }
                        }
                    }
                }
            }
            add(i, i2, b, 1294109244);
        }
    }

    final void get(int i, int i2, byte b, int i3) {
        try {
            if (1462124603 * this.data != -1) {
                if (AbstractBuffer.get(1462124603 * this.data, 443318599).value * -990546557 == 1) {
                    this.data = 2033542925;
                }
            }
            this.next = -464408867;
            if (i < 0 || i >= DiskLruCache.AppCompatTheme_editTextStyle || i2 < 0 || i2 >= DiskLruCache.AppCompatTheme_editTextStyle) {
                add(i, i2, -1876928886);
                return;
            }
            if (this.this$0[0] >= 0) {
                if (this.this$0[0] < 104) {
                    if (this.length[0] >= 0) {
                        if (this.length[0] < 104) {
                            if (b == (byte) 2) {
                                i3 = this.this$0[0];
                                int $i6 = this.length[0];
                                int $i4 = getKey(-1960625241);
                                if (i3 >= $i4 && i3 < DiskLruCache.AppCompatTheme_editTextStyle - $i4 && $i6 >= $i4) {
                                    if ($i6 < DiskLruCache.AppCompatTheme_editTextStyle - $i4) {
                                        if (i >= $i4 && i < DiskLruCache.AppCompatTheme_editTextStyle - $i4 && i2 >= $i4) {
                                            if (i2 < DiskLruCache.AppCompatTheme_editTextStyle - $i4) {
                                                $i4 = getKey(-2070857031);
                                                client.array.size = -2029814105 * i;
                                                client.array.count = -945157175 * i2;
                                                client.array.value = -1253946821;
                                                client.array.id = 1170143321;
                                                i3 = StringBuffer.toString(i3, $i6, $i4, client.array, client.value[-277606385 * this.context], true, client.entries, client.mask, (byte) 1);
                                                if (i3 >= 1) {
                                                    for ($i6 = 0; $i6 < i3 - 1; $i6++) {
                                                        add(client.entries[$i6], client.mask[$i6], (byte) 2, 1294109244);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            add(i, i2, b, 1294109244);
                            return;
                        }
                    }
                }
            }
            add(i, i2, -1578667473);
        } catch (Throwable $r7) {
            throw StringBuilder.append($r7, "ga.am(" + ')');
        }
    }

    boolean get(int i) {
        try {
            if (NodeList.name == this.name) {
                load(-1863396592);
            }
            return NodeList.this$0 == this.name;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ga.ad(" + ')');
        }
    }

    boolean get(short s) {
        try {
            if (NodeList.name == this.title) {
                set((byte) 1);
            }
            return this.title == NodeList.this$0;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ga.ay(" + ')');
        }
    }

    int getKey(int i) {
        try {
            if (this.this$0 != null) {
                if (this.this$0.index * -2141377661 != -1) {
                    return Thread.add(this.this$0.index * -2141377661, (byte) 73).size * 1160465393;
                }
            }
            return 1;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ga.aq(" + ')');
        }
    }

    void init() {
        NodeList $r3 = (MyAsyncTask.this$0 == null || !MyAsyncTask.this$0.get(this.type, (byte) 0)) ? NodeList.value : NodeList.this$0;
        this.title = $r3;
    }

    final void init(Logger logger) {
        int $i3;
        int i;
        boolean $z0 = true;
        logger.data = 0;
        int $i0 = logger.get((byte) 0);
        this.f158a = logger.next(1247983979) * 486147381;
        this.f161i = logger.next(1247983979) * -697327819;
        int $i2 = -1;
        this.length = 0;
        int[] $r2 = new int[12];
        for ($i3 = 0; $i3 < 12; $i3++) {
            int $i4 = logger.get((byte) 0);
            if ($i4 != 0) {
                $r2[$i3] = ($i4 << 8) + logger.get((byte) 0);
                if ($i3 == 0 && $r2[0] == -673146909) {
                    $i2 = logger.get(-1267408034);
                    break;
                } else if ($r2[$i3] >= 512) {
                    i = Set.get($r2[$i3] - 512, 1225457132).state * -135227240;
                    if (i != 0) {
                        int $i5 = i * -1852789141;
                        i = $i5;
                        this.length = $i5;
                    }
                }
            } else {
                $r2[$i3] = 0;
            }
        }
        int[] $r8 = new int[5];
        $i3 = 0;
        while ($i3 < 5) {
            i = logger.get((byte) 0);
            $i4 = i;
            if (i < 0 || i >= NodeList.size[$i3].length) {
                $i4 = 0;
            }
            $r8[$i3] = $i4;
            $i3++;
        }
        this.type = logger.get(591687817) * 108915619;
        if (65535 == -629432309 * this.type) {
            this.type = 1134123112;
        }
        this.status = logger.get(40682962) * -878920581;
        if (this.status * -417867350 == 1137737794) {
            this.status = 878920581;
        }
        this.f69i = 660672859 * this.status;
        this.flags = logger.get(-378369403) * 1523276509;
        if (-203564734 == 874674216 * this.flags) {
            this.flags = -1523276509;
        }
        this.min = logger.get(-1156515524) * 539275743;
        if (-886336445 * this.min == -1295540498) {
            this.min = 1545152709;
        }
        this.max = logger.get(949804603) * -447796541;
        if (-1874110997 * this.max == 65535) {
            this.max = 447796541;
        }
        this.f79x = logger.get(1467904914) * -1542339397;
        if (65535 == this.f79x * 1210918215) {
            this.f79x = 1200117824;
        }
        this.element = logger.get(271964826) * 1853738874;
        if (114758451 * this.element == 1594317585) {
            this.element = -1722939772;
        }
        this.type = new JSONObject(logger.toString(723542336), LogActivity.type);
        add((byte) 5);
        set(1369590332);
        if (File.this$0 == this) {
            Wrapper.code = this.type.toString(-1211443214);
        }
        this.size = logger.get((byte) 0) * 600235909;
        this.key = logger.get(-958395519) * 1176356239;
        this.data = logger.get((byte) 0) == 1;
        if (1346525426 * client.activity == 0 && -2036797811 * client.out >= 2) {
            this.data = false;
        }
        if (this.this$0 == null) {
            this.this$0 = new Connection();
        }
        Connection $r7 = this.this$0;
        if ($i0 != 1) {
            $z0 = false;
        }
        $r7.toString($r2, $r8, $z0, $i2, 542614623);
    }

    boolean isEmpty() {
        if (NodeList.name == this.name) {
            load(-173221479);
        }
        return NodeList.this$0 == this.name;
    }

    final boolean isNegative() {
        return this.this$0 != null;
    }

    final boolean isValid() {
        return this.this$0 != null;
    }

    void load(int i) {
        try {
            this.name = Primitive.data.toString(this.type, (byte) -46) ? NodeList.this$0 : NodeList.value;
        } catch (RuntimeException $r4) {
            throw StringBuilder.append($r4, "ga.ag(" + ')');
        }
    }

    void load(int i, int i2) {
        this.parent = 0;
        this.width = 0;
        this.height = 0;
        this.this$0[0] = i;
        this.length[0] = i2;
        i = getKey(-2002077392);
        this.size = (-2134157527 * i) + (this.this$0[0] * -399324032);
        this.value = (i * 1936238291) + (this.length[0] * -1003630303);
    }

    final void load(int i, int i2, byte b) {
        if (this.parent * 761444243 < 9) {
            this.parent -= 521273701;
        }
        for (int $i3 = this.parent * 761444243; $i3 > 0; $i3--) {
            this.this$0[$i3] = this.this$0[$i3 - 1];
            this.length[$i3] = this.length[$i3 - 1];
            this.log[$i3] = this.log[$i3 - 1];
        }
        this.this$0[0] = i;
        this.length[0] = i2;
        this.log[0] = b;
    }

    boolean onItemClick() {
        if (NodeList.name == this.name) {
            load(-1604179445);
        }
        return NodeList.this$0 == this.name;
    }

    boolean onLongClick() {
        if (NodeList.name == this.title) {
            set((byte) 1);
        }
        return this.title == NodeList.this$0;
    }

    final void parse(Logger logger) {
        int $i3;
        int i;
        boolean $z0 = false;
        logger.data = 0;
        int $i0 = logger.get((byte) 0);
        this.f158a = logger.next(1247983979) * 486147381;
        this.f161i = logger.next(1247983979) * 1965488425;
        int $i2 = -1;
        this.length = 0;
        int[] $r2 = new int[12];
        for ($i3 = 0; $i3 < 12; $i3++) {
            int $i4 = logger.get((byte) 0);
            if ($i4 != 0) {
                $r2[$i3] = ($i4 << 8) + logger.get((byte) 0);
                if ($i3 == 0 && $r2[0] == -1509806388) {
                    $i2 = logger.get(-1081584527);
                    break;
                } else if ($r2[$i3] >= 512) {
                    i = Set.get($r2[$i3] - 512, 1223005519).state * 1531027521;
                    if (i != 0) {
                        int $i5 = i * -1645019116;
                        i = $i5;
                        this.length = $i5;
                    }
                }
            } else {
                $r2[$i3] = 0;
            }
        }
        int[] $r10 = new int[5];
        $i3 = 0;
        while ($i3 < 5) {
            i = logger.get((byte) 0);
            $i4 = i;
            if (i < 0 || i >= NodeList.size[$i3].length) {
                $i4 = 0;
            }
            $r10[$i3] = $i4;
            $i3++;
        }
        this.type = logger.get(-1803736321) * 1971681476;
        if (65535 == -629432309 * this.type) {
            this.type = 475101002;
        }
        this.status = logger.get(1253598081) * -1327802485;
        if (this.status * 986301107 == -582752856) {
            this.status = -1591241623;
        }
        this.f69i = 2110696645 * this.status;
        this.flags = logger.get(-2085152035) * -1411090237;
        if (-1795167900 == 410941622 * this.flags) {
            this.flags = -560455968;
        }
        this.min = logger.get(-526712693) * 539275743;
        if (-2117064046 * this.min == 65535) {
            this.min = 1092733376;
        }
        this.max = logger.get(-677021871) * -447796541;
        if (-1874110997 * this.max == 65535) {
            this.max = 447796541;
        }
        this.f79x = logger.get(1282372708) * -746475176;
        if (-1241301963 == this.f79x * 303292531) {
            this.f79x = -1723948608;
        }
        this.element = logger.get(477846927) * 849951973;
        if (114758451 * this.element == 65535) {
            this.element = -1627332603;
        }
        this.type = new JSONObject(logger.toString(305805513), LogActivity.type);
        add((byte) 5);
        set(655169721);
        if (File.this$0 == this) {
            Wrapper.code = this.type.toString(1579215681);
        }
        this.size = logger.get((byte) 0) * 1809168151;
        this.key = logger.get(-635000832) * 1176356239;
        this.data = logger.get((byte) 0) == 1;
        if (1235582130 * client.activity == 0 && -2036797811 * client.out >= 2) {
            this.data = false;
        }
        if (this.this$0 == null) {
            this.this$0 = new Connection();
        }
        Connection $r7 = this.this$0;
        if ($i0 == 1) {
            $z0 = true;
        }
        $r7.toString($r2, $r10, $z0, $i2, 542614623);
    }

    final void put(int i, int i2, byte b) {
        if (1462124603 * this.data != -1 && AbstractBuffer.get(1462124603 * this.data, 967219328).value * -990546557 == 1) {
            this.data = 2033542925;
        }
        this.next = -464408867;
        if (i < 0 || i >= 104 || i2 < 0 || i2 >= 104) {
            add(i, i2, -1571066261);
        } else if (this.this$0[0] < 0 || this.this$0[0] >= DiskLruCache.AppCompatTheme_editTextStyle || this.length[0] < 0 || this.length[0] >= DiskLruCache.AppCompatTheme_editTextStyle) {
            add(i, i2, -1696821945);
        } else {
            if (b == (byte) 2) {
                int $i3 = this.this$0[0];
                int $i6 = this.length[0];
                int $i5 = getKey(-2025611320);
                if ($i3 >= $i5 && $i3 < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && $i6 >= $i5) {
                    if ($i6 < DiskLruCache.AppCompatTheme_editTextStyle - $i5) {
                        if (i >= $i5 && i < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && i2 >= $i5 && i2 < DiskLruCache.AppCompatTheme_editTextStyle - $i5) {
                            $i5 = getKey(-2067663728);
                            client.array.size = -2029814105 * i;
                            client.array.count = -945157175 * i2;
                            client.array.value = -1253946821;
                            client.array.id = 1170143321;
                            $i3 = StringBuffer.toString($i3, $i6, $i5, client.array, client.value[-277606385 * this.context], true, client.entries, client.mask, (byte) 1);
                            if ($i3 >= 1) {
                                for ($i6 = 0; $i6 < $i3 - 1; $i6++) {
                                    add(client.entries[$i6], client.mask[$i6], (byte) 2, 1294109244);
                                }
                            }
                        }
                    }
                }
            }
            add(i, i2, b, 1294109244);
        }
    }

    protected final Integer read() {
        try {
            if (this.this$0 == null) {
                return null;
            }
            JSONArray $r2;
            JSONArray $r3;
            Integer $r4;
            Integer $r5;
            Integer $r7;
            int $i2;
            int i;
            int $i1;
            if (this.data * 1462124603 != -1) {
                if (this.start * 1913892303 == 0) {
                    $r2 = AbstractBuffer.get(this.data * 1462124603, 1290846811);
                    if (this.text * 259701737 != -1) {
                        if (!this.state) {
                            if (-629432309 * this.type != this.text * 259701737 || $r2 == null) {
                                $r3 = AbstractBuffer.get(259701737 * this.text, 406884381);
                                $r4 = this.this$0.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, -417823468);
                                $r5 = $r4;
                                if ($r4 != null) {
                                    return null;
                                }
                                $r4.append();
                                this.f72n = 1007229383 * $r4.size;
                                if (!this.state) {
                                    if (269129085 * this.state != -1) {
                                        if (this.f62a * 628512873 != -1) {
                                            $r7 = HyperlinkRecord.get(269129085 * this.state, 1755034975).get(628512873 * this.f62a, -1844577546);
                                            if ($r7 != null) {
                                                $r7.append(0, -(1216037183 * this.active), 0);
                                                $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
                                            }
                                        }
                                    }
                                }
                                if (!this.state) {
                                    if (this.index != null) {
                                        if (client.type * 1581849891 >= -1100434689 * this.path) {
                                            this.index = null;
                                        }
                                        if (1581849891 * client.type >= this.current * -55133803) {
                                            if (client.type * 1581849891 < this.path * -1100434689) {
                                                $r4 = this.index;
                                                $i2 = this.value * -500717985;
                                                i = $i2;
                                                $i1 = (this.head * -794732143) - $i2;
                                                $i2 = (-1470637133 * this.count) - (this.value * 2328865);
                                                i = $i2;
                                                $r4.append((this.pos * -1484091705) - (516759209 * this.size), $i1, $i2);
                                                if (512 != this.name * -1058596255) {
                                                    $r4.close();
                                                    $r4.close();
                                                    $r4.close();
                                                } else if (1024 != this.name * -1058596255) {
                                                    $r4.close();
                                                    $r4.close();
                                                } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                                    $r4.close();
                                                }
                                                $r5 = new Integer(new Integer[]{$r5, $r4}, 2);
                                                if (this.name * -1058596255 != 512) {
                                                    $r4.close();
                                                } else if (this.name * -1058596255 != 1024) {
                                                    $r4.close();
                                                    $r4.close();
                                                } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                                    $r4.close();
                                                    $r4.close();
                                                    $r4.close();
                                                }
                                                $i2 = (this.value * 2328865) - (this.count * -1470637133);
                                                i = $i2;
                                                $r4.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), $i2);
                                            }
                                        }
                                    }
                                }
                                $r5.flags = true;
                                return $r5;
                            }
                        }
                    }
                    $r3 = null;
                    $r4 = this.this$0.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, -417823468);
                    $r5 = $r4;
                    if ($r4 != null) {
                        return null;
                    }
                    $r4.append();
                    this.f72n = 1007229383 * $r4.size;
                    if (this.state) {
                        if (269129085 * this.state != -1) {
                            if (this.f62a * 628512873 != -1) {
                                $r7 = HyperlinkRecord.get(269129085 * this.state, 1755034975).get(628512873 * this.f62a, -1844577546);
                                if ($r7 != null) {
                                    $r7.append(0, -(1216037183 * this.active), 0);
                                    $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
                                }
                            }
                        }
                    }
                    if (this.state) {
                        if (this.index != null) {
                            if (client.type * 1581849891 >= -1100434689 * this.path) {
                                this.index = null;
                            }
                            if (1581849891 * client.type >= this.current * -55133803) {
                                if (client.type * 1581849891 < this.path * -1100434689) {
                                    $r4 = this.index;
                                    $i2 = this.value * -500717985;
                                    i = $i2;
                                    $i1 = (this.head * -794732143) - $i2;
                                    $i2 = (-1470637133 * this.count) - (this.value * 2328865);
                                    i = $i2;
                                    $r4.append((this.pos * -1484091705) - (516759209 * this.size), $i1, $i2);
                                    if (512 != this.name * -1058596255) {
                                        $r4.close();
                                        $r4.close();
                                        $r4.close();
                                    } else if (1024 != this.name * -1058596255) {
                                        $r4.close();
                                        $r4.close();
                                    } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                        $r4.close();
                                    }
                                    $r5 = new Integer(new Integer[]{$r5, $r4}, 2);
                                    if (this.name * -1058596255 != 512) {
                                        $r4.close();
                                    } else if (this.name * -1058596255 != 1024) {
                                        $r4.close();
                                        $r4.close();
                                    } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                        $r4.close();
                                        $r4.close();
                                        $r4.close();
                                    }
                                    $i2 = (this.value * 2328865) - (this.count * -1470637133);
                                    i = $i2;
                                    $r4.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), $i2);
                                }
                            }
                        }
                    }
                    $r5.flags = true;
                    return $r5;
                }
            }
            $r2 = null;
            if (this.text * 259701737 != -1) {
                if (this.state) {
                    $r3 = AbstractBuffer.get(259701737 * this.text, 406884381);
                    $r4 = this.this$0.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, -417823468);
                    $r5 = $r4;
                    if ($r4 != null) {
                        return null;
                    }
                    $r4.append();
                    this.f72n = 1007229383 * $r4.size;
                    if (this.state) {
                        if (269129085 * this.state != -1) {
                            if (this.f62a * 628512873 != -1) {
                                $r7 = HyperlinkRecord.get(269129085 * this.state, 1755034975).get(628512873 * this.f62a, -1844577546);
                                if ($r7 != null) {
                                    $r7.append(0, -(1216037183 * this.active), 0);
                                    $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
                                }
                            }
                        }
                    }
                    if (this.state) {
                        if (this.index != null) {
                            if (client.type * 1581849891 >= -1100434689 * this.path) {
                                this.index = null;
                            }
                            if (1581849891 * client.type >= this.current * -55133803) {
                                if (client.type * 1581849891 < this.path * -1100434689) {
                                    $r4 = this.index;
                                    $i2 = this.value * -500717985;
                                    i = $i2;
                                    $i1 = (this.head * -794732143) - $i2;
                                    $i2 = (-1470637133 * this.count) - (this.value * 2328865);
                                    i = $i2;
                                    $r4.append((this.pos * -1484091705) - (516759209 * this.size), $i1, $i2);
                                    if (512 != this.name * -1058596255) {
                                        $r4.close();
                                        $r4.close();
                                        $r4.close();
                                    } else if (1024 != this.name * -1058596255) {
                                        $r4.close();
                                        $r4.close();
                                    } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                        $r4.close();
                                    }
                                    $r5 = new Integer(new Integer[]{$r5, $r4}, 2);
                                    if (this.name * -1058596255 != 512) {
                                        $r4.close();
                                    } else if (this.name * -1058596255 != 1024) {
                                        $r4.close();
                                        $r4.close();
                                    } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                        $r4.close();
                                        $r4.close();
                                        $r4.close();
                                    }
                                    $i2 = (this.value * 2328865) - (this.count * -1470637133);
                                    i = $i2;
                                    $r4.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), $i2);
                                }
                            }
                        }
                    }
                    $r5.flags = true;
                    return $r5;
                }
            }
            $r3 = null;
            $r4 = this.this$0.toString($r2, 1816971127 * this.position, $r3, 782711805 * this.bytes, -417823468);
            $r5 = $r4;
            if ($r4 != null) {
                return null;
            }
            $r4.append();
            this.f72n = 1007229383 * $r4.size;
            if (this.state) {
                if (269129085 * this.state != -1) {
                    if (this.f62a * 628512873 != -1) {
                        $r7 = HyperlinkRecord.get(269129085 * this.state, 1755034975).get(628512873 * this.f62a, -1844577546);
                        if ($r7 != null) {
                            $r7.append(0, -(1216037183 * this.active), 0);
                            $r5 = new Integer(new Integer[]{$r4, $r7}, 2);
                        }
                    }
                }
            }
            if (this.state) {
                if (this.index != null) {
                    if (client.type * 1581849891 >= -1100434689 * this.path) {
                        this.index = null;
                    }
                    if (1581849891 * client.type >= this.current * -55133803) {
                        if (client.type * 1581849891 < this.path * -1100434689) {
                            $r4 = this.index;
                            $i2 = this.value * -500717985;
                            i = $i2;
                            $i1 = (this.head * -794732143) - $i2;
                            $i2 = (-1470637133 * this.count) - (this.value * 2328865);
                            i = $i2;
                            $r4.append((this.pos * -1484091705) - (516759209 * this.size), $i1, $i2);
                            if (512 != this.name * -1058596255) {
                                $r4.close();
                                $r4.close();
                                $r4.close();
                            } else if (1024 != this.name * -1058596255) {
                                $r4.close();
                                $r4.close();
                            } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                $r4.close();
                            }
                            $r5 = new Integer(new Integer[]{$r5, $r4}, 2);
                            if (this.name * -1058596255 != 512) {
                                $r4.close();
                            } else if (this.name * -1058596255 != 1024) {
                                $r4.close();
                                $r4.close();
                            } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                $r4.close();
                                $r4.close();
                                $r4.close();
                            }
                            $i2 = (this.value * 2328865) - (this.count * -1470637133);
                            i = $i2;
                            $r4.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), $i2);
                        }
                    }
                }
            }
            $r5.flags = true;
            return $r5;
        } catch (RuntimeException $r9) {
            throw StringBuilder.append($r9, "ga.ac(" + ')');
        }
    }

    protected final Integer remove() {
        if (this.this$0 == null) {
            return null;
        }
        int $i1;
        int i;
        JSONArray $r7;
        Integer $r8;
        Integer $r5;
        Integer $r3;
        JSONArray $r6 = (this.data * -744321535 == -1 || this.start * 1468353567 != 0) ? null : AbstractBuffer.get(this.data * 1462124603, 1573744431);
        if (!(this.text * 1694209784 == -1 || this.state)) {
            $i1 = this.text * 259701737;
            i = $i1;
            if (-629432309 * this.type != $i1 || $r6 == null) {
                $r7 = AbstractBuffer.get(1471355274 * this.text, 1284895155);
                $r8 = this.this$0.toString($r6, -796514147 * this.position, $r7, -1618611230 * this.bytes, -1313378474);
                $r5 = $r8;
                if ($r8 == null) {
                    return null;
                }
                $r8.append();
                this.f72n = -1501116366 * $r8.size;
                if (!(this.state || -2018819272 * this.state == -1 || this.f62a * 628512873 == -1)) {
                    $r3 = HyperlinkRecord.get(560472986 * this.state, 2125307310).get(1715934353 * this.f62a, -1899800197);
                    if ($r3 != null) {
                        $r3.append(0, -(830027508 * this.active), 0);
                        Integer integer = new Integer(new Integer[]{$r8, $r3}, 2);
                    }
                }
                if (!(this.state || this.index == null)) {
                    if (client.type * 1581849891 >= 200511831 * this.path) {
                        this.index = null;
                    }
                    $i1 = this.current * -55133803;
                    i = $i1;
                    if (1581849891 * client.type >= $i1) {
                        $i1 = this.path * -532005135;
                        i = $i1;
                        if (client.type * 1750193296 < $i1) {
                            $r3 = this.index;
                            $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -1564289843) - (this.value * 955787971), (1338784008 * this.count) - (this.value * -502303910));
                            if (512 == this.name * -1513511350) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            } else if (2078388699 == this.name * -1058596255) {
                                $r3.close();
                                $r3.close();
                            } else if (-207777593 == this.name * -1058596255) {
                                $r3.close();
                            }
                            $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                            if (this.name * 1861761364 == -112333249) {
                                $r3.close();
                            } else if (-1582613964 * this.name == 411512823) {
                                $r3.close();
                                $r3.close();
                            } else if (this.name * -1058596255 == -647810629) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            }
                            $r3.append((this.size * -196700472) - (-281544957 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
                        }
                    }
                }
                $r5.flags = true;
                return $r5;
            }
        }
        $r7 = null;
        $r8 = this.this$0.toString($r6, -796514147 * this.position, $r7, -1618611230 * this.bytes, -1313378474);
        $r5 = $r8;
        if ($r8 == null) {
            return null;
        }
        $r8.append();
        this.f72n = -1501116366 * $r8.size;
        $r3 = HyperlinkRecord.get(560472986 * this.state, 2125307310).get(1715934353 * this.f62a, -1899800197);
        if ($r3 != null) {
            $r3.append(0, -(830027508 * this.active), 0);
            Integer integer2 = new Integer(new Integer[]{$r8, $r3}, 2);
        }
        if (client.type * 1581849891 >= 200511831 * this.path) {
            this.index = null;
        }
        $i1 = this.current * -55133803;
        i = $i1;
        if (1581849891 * client.type >= $i1) {
            $i1 = this.path * -532005135;
            i = $i1;
            if (client.type * 1750193296 < $i1) {
                $r3 = this.index;
                $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -1564289843) - (this.value * 955787971), (1338784008 * this.count) - (this.value * -502303910));
                if (512 == this.name * -1513511350) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                } else if (2078388699 == this.name * -1058596255) {
                    $r3.close();
                    $r3.close();
                } else if (-207777593 == this.name * -1058596255) {
                    $r3.close();
                }
                $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                if (this.name * 1861761364 == -112333249) {
                    $r3.close();
                } else if (-1582613964 * this.name == 411512823) {
                    $r3.close();
                    $r3.close();
                } else if (this.name * -1058596255 == -647810629) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                }
                $r3.append((this.size * -196700472) - (-281544957 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
            }
        }
        $r5.flags = true;
        return $r5;
    }

    final void remove(int i, int i2, byte b) {
        if (1462124603 * this.data != -1 && AbstractBuffer.get(1462124603 * this.data, 2127811762).value * -990546557 == 1) {
            this.data = 2033542925;
        }
        this.next = -464408867;
        if (i < 0 || i >= 104 || i2 < 0 || i2 >= 104) {
            add(i, i2, -2029355282);
        } else if (this.this$0[0] < 0 || this.this$0[0] >= DiskLruCache.AppCompatTheme_editTextStyle || this.length[0] < 0 || this.length[0] >= DiskLruCache.AppCompatTheme_editTextStyle) {
            add(i, i2, -1754220700);
        } else {
            if (b == (byte) 2) {
                int $i3 = this.this$0[0];
                int $i6 = this.length[0];
                int $i5 = getKey(-1992987462);
                if ($i3 >= $i5 && $i3 < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && $i6 >= $i5) {
                    if ($i6 < DiskLruCache.AppCompatTheme_editTextStyle - $i5) {
                        if (i >= $i5 && i < DiskLruCache.AppCompatTheme_editTextStyle - $i5 && i2 >= $i5 && i2 < DiskLruCache.AppCompatTheme_editTextStyle - $i5) {
                            $i5 = getKey(-1923933253);
                            client.array.size = -2029814105 * i;
                            client.array.count = -945157175 * i2;
                            client.array.value = -1253946821;
                            client.array.id = 1170143321;
                            $i3 = StringBuffer.toString($i3, $i6, $i5, client.array, client.value[-277606385 * this.context], true, client.entries, client.mask, (byte) 1);
                            if ($i3 >= 1) {
                                for ($i6 = 0; $i6 < $i3 - 1; $i6++) {
                                    add(client.entries[$i6], client.mask[$i6], (byte) 2, 1294109244);
                                }
                            }
                        }
                    }
                }
            }
            add(i, i2, b, 1294109244);
        }
    }

    void run() {
        NodeList $r3 = (MyAsyncTask.this$0 == null || !MyAsyncTask.this$0.get(this.type, (byte) 0)) ? NodeList.value : NodeList.this$0;
        this.title = $r3;
    }

    boolean save() {
        if (NodeList.name == this.name) {
            load(-2056447085);
        }
        return NodeList.this$0 == this.name;
    }

    void set() {
        this.name = Primitive.data.toString(this.type, (byte) -90) ? NodeList.this$0 : NodeList.value;
    }

    void set(byte b) {
        NodeList $r3;
        if (MyAsyncTask.this$0 != null) {
            try {
                if (MyAsyncTask.this$0.get(this.type, (byte) 0)) {
                    $r3 = NodeList.this$0;
                    this.title = $r3;
                }
            } catch (RuntimeException $r4) {
                throw StringBuilder.append($r4, "ga.ae(" + ')');
            }
        }
        $r3 = NodeList.value;
        this.title = $r3;
    }

    void set(int i) {
        try {
            this.title = NodeList.name;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ga.aj(" + ')');
        }
    }

    void setData() {
        this.title = NodeList.name;
    }

    void setKey() {
        this.name = NodeList.name;
    }

    void setName() {
        this.name = NodeList.name;
    }

    void setState() {
        this.name = NodeList.name;
    }

    void setType() {
        this.name = NodeList.name;
    }

    final void toString(int i, int i2, byte b) {
        if (this.parent * 761444243 < 9) {
            this.parent -= 521273701;
        }
        for (int $i3 = this.parent * 761444243; $i3 > 0; $i3--) {
            this.this$0[$i3] = this.this$0[$i3 - 1];
            this.length[$i3] = this.length[$i3 - 1];
            this.log[$i3] = this.log[$i3 - 1];
        }
        this.this$0[0] = i;
        this.length[0] = i2;
        this.log[0] = b;
    }

    final boolean toString(int i) {
        try {
            return this.this$0 != null;
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ga.an(" + ')');
        }
    }

    int visit() {
        return (this.this$0 == null || this.this$0.index * -2141377661 == -1) ? 1 : Thread.add(this.this$0.index * -2141377661, (byte) 38).size * 1160465393;
    }

    protected final Integer write() {
        if (this.this$0 == null) {
            return null;
        }
        int $i1;
        int i;
        JSONArray $r7;
        Integer $r8;
        Integer $r5;
        Integer $r3;
        JSONArray $r6 = (this.data * 1462124603 == -1 || this.start * 1913892303 != 0) ? null : AbstractBuffer.get(this.data * 1462124603, 311528871);
        if (!(this.text * 259701737 == -1 || this.state)) {
            $i1 = this.text * 259701737;
            i = $i1;
            if (-629432309 * this.type != $i1 || $r6 == null) {
                $r7 = AbstractBuffer.get(259701737 * this.text, 676297061);
                $r8 = this.this$0.toString($r6, 1816971127 * this.position, $r7, 782711805 * this.bytes, 876255409);
                $r5 = $r8;
                if ($r8 == null) {
                    return null;
                }
                $r8.append();
                this.f72n = 1007229383 * $r8.size;
                if (!(this.state || 269129085 * this.state == -1 || this.f62a * 628512873 == -1)) {
                    $r3 = HyperlinkRecord.get(269129085 * this.state, 1714379216).get(628512873 * this.f62a, -2047203643);
                    if ($r3 != null) {
                        $r3.append(0, -(1216037183 * this.active), 0);
                        Integer integer = new Integer(new Integer[]{$r8, $r3}, 2);
                    }
                }
                if (!(this.state || this.index == null)) {
                    if (client.type * 1581849891 >= -1100434689 * this.path) {
                        this.index = null;
                    }
                    $i1 = this.current * -55133803;
                    i = $i1;
                    if (1581849891 * client.type >= $i1) {
                        $i1 = this.path * -1100434689;
                        i = $i1;
                        if (client.type * 1581849891 < $i1) {
                            $r3 = this.index;
                            $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -794732143) - (this.value * -500717985), (-1470637133 * this.count) - (this.value * 2328865));
                            if (512 == this.name * -1058596255) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            } else if (1024 == this.name * -1058596255) {
                                $r3.close();
                                $r3.close();
                            } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                                $r3.close();
                            }
                            $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                            if (this.name * -1058596255 == 512) {
                                $r3.close();
                            } else if (this.name * -1058596255 == 1024) {
                                $r3.close();
                                $r3.close();
                            } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                                $r3.close();
                                $r3.close();
                                $r3.close();
                            }
                            $r3.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
                        }
                    }
                }
                $r5.flags = true;
                return $r5;
            }
        }
        $r7 = null;
        $r8 = this.this$0.toString($r6, 1816971127 * this.position, $r7, 782711805 * this.bytes, 876255409);
        $r5 = $r8;
        if ($r8 == null) {
            return null;
        }
        $r8.append();
        this.f72n = 1007229383 * $r8.size;
        $r3 = HyperlinkRecord.get(269129085 * this.state, 1714379216).get(628512873 * this.f62a, -2047203643);
        if ($r3 != null) {
            $r3.append(0, -(1216037183 * this.active), 0);
            Integer integer2 = new Integer(new Integer[]{$r8, $r3}, 2);
        }
        if (client.type * 1581849891 >= -1100434689 * this.path) {
            this.index = null;
        }
        $i1 = this.current * -55133803;
        i = $i1;
        if (1581849891 * client.type >= $i1) {
            $i1 = this.path * -1100434689;
            i = $i1;
            if (client.type * 1581849891 < $i1) {
                $r3 = this.index;
                $r3.append((this.pos * -1484091705) - (516759209 * this.size), (this.head * -794732143) - (this.value * -500717985), (-1470637133 * this.count) - (this.value * 2328865));
                if (512 == this.name * -1058596255) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                } else if (1024 == this.name * -1058596255) {
                    $r3.close();
                    $r3.close();
                } else if (Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT == this.name * -1058596255) {
                    $r3.close();
                }
                $i1 = new Integer(new Integer[]{$r5, $r3}, 2);
                if (this.name * -1058596255 == 512) {
                    $r3.close();
                } else if (this.name * -1058596255 == 1024) {
                    $r3.close();
                    $r3.close();
                } else if (this.name * -1058596255 == Tags.AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT) {
                    $r3.close();
                    $r3.close();
                    $r3.close();
                }
                $r3.append((this.size * 516759209) - (-1484091705 * this.pos), (this.value * -500717985) - (-794732143 * this.head), (this.value * 2328865) - (this.count * -1470637133));
            }
        }
        $r5.flags = true;
        return $r5;
    }

    final void write(int i, int i2, byte b) {
        if (this.parent * 761444243 < 9) {
            this.parent -= 521273701;
        }
        for (int $i3 = this.parent * 761444243; $i3 > 0; $i3--) {
            this.this$0[$i3] = this.this$0[$i3 - 1];
            this.length[$i3] = this.length[$i3 - 1];
            this.log[$i3] = this.log[$i3 - 1];
        }
        this.this$0[0] = i;
        this.length[0] = i2;
        this.log[0] = b;
    }
}
