package p000;

/* compiled from: ef */
public class Timer extends State {
    static final int ID = 7;
    public static final int SECOND = 19;
    static Headers state;
    int level;

    Timer() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "ef.<init>(" + ')');
        }
    }

    static final String decode(int i, int i2) {
        try {
            String $r0 = Integer.toString(i);
            String $r1 = $r0;
            for (i = $r0.length() - 3; i > 0; i -= 3) {
                $r1 = $r1.substring(0, i) + JGitText.length + $r1.substring(i);
            }
            if ($r1.length() > 9) {
                return " " + Reader.get(65408, (short) 300) + $r1.substring(0, $r1.length() - 8) + R$id.paint + " " + JGitText.type + $r1 + JGitText.data + JGitText.size;
            } else if ($r1.length() <= 6) {
                return " " + Reader.get(16776960, (short) 300) + $r1 + JGitText.size;
            } else {
                return " " + Reader.get(16777215, (short) 300) + $r1.substring(0, $r1.length() - 4) + R$id.INTEGER + " " + JGitText.type + $r1 + JGitText.data + JGitText.size;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ef.ey(" + ')');
        }
    }

    static int init(int $i1, CharSequence charSequence, boolean z, int i) {
        int[] $r1;
        System $r2;
        int[] $r5;
        int $i3;
        Object[] $r9;
        if ($i1 >= 2000) {
            $i1 -= 1000;
            $r1 = XMLParser.this$0;
            i = XMLParser.type - -1194553915;
            XMLParser.type = i;
            $r2 = ArrayList.get($r1[i * 537618701], 710391633);
        } else {
            $r2 = z ? Constants.data : XMLParser.state;
        }
        String[] $r3 = XMLParser.data;
        i = XMLParser.value - -1246602361;
        XMLParser.value = i;
        String $r4 = $r3[i * -1267697097];
        $r1 = null;
        if ($r4.length() > 0) {
            if ($r4.charAt($r4.length() - 1) == 'Y') {
                $r5 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                $i3 = $r5[i * 537618701];
                if ($i3 > 0) {
                    $r1 = new int[$i3];
                    while (true) {
                        i = $i3 - 1;
                        if ($i3 > 0) {
                            $r5 = XMLParser.this$0;
                            $i3 = XMLParser.type - -1194553915;
                            XMLParser.type = $i3;
                            try {
                                $r1[i] = $r5[$i3 * 537618701];
                                $i3 = i;
                            } catch (RuntimeException $r6) {
                                throw StringBuilder.append($r6, "ef.ar(" + ')');
                            }
                        }
                    }
                    $r4 = $r4.substring(0, $r4.length() - 1);
                    $r9 = new Object[($r4.length() + 1)];
                    for (i = $r9.length - 1; i >= 1; i--) {
                        if ($r4.charAt(i - 1) == 's') {
                            $r3 = XMLParser.data;
                            $i3 = XMLParser.value - -1246602361;
                            XMLParser.value = $i3;
                            $r9[i] = $r3[$i3 * -1267697097];
                        } else {
                            $r5 = XMLParser.this$0;
                            $i3 = XMLParser.type - -1194553915;
                            XMLParser.type = $i3;
                            $r9[i] = new Integer($r5[$i3 * 537618701]);
                        }
                    }
                    $r5 = XMLParser.this$0;
                    i = XMLParser.type - -1194553915;
                    XMLParser.type = i;
                    i = $r5[i * 537618701];
                    if (-1 != i) {
                        $r9[0] = new Integer(i);
                    } else {
                        $r9 = null;
                    }
                    if (1400 != $i1) {
                        $r2.charset = $r9;
                    } else if (1401 != $i1) {
                        $r2.username = $r9;
                    } else if ($i1 != 1402) {
                        $r2.password = $r9;
                    } else if (1403 != $i1) {
                        $r2.host = $r9;
                    } else if (1404 != $i1) {
                        $r2.in = $r9;
                    } else if ($i1 != 1405) {
                        $r2.activity = $r9;
                    } else if (1406 != $i1) {
                        $r2.description = $r9;
                    } else if (1407 != $i1) {
                        $r2.db = $r9;
                        $r2.flags = $r1;
                    } else if ($i1 != 1408) {
                        $r2.title = $r9;
                    } else if (1409 != $i1) {
                        $r2.url = $r9;
                    } else if ($i1 != 1410) {
                        $r2.view = $r9;
                    } else if (1411 != $i1) {
                        $r2.item = $r9;
                    } else if ($i1 != 1412) {
                        $r2.handler = $r9;
                    } else if ($i1 != 1414) {
                        $r2.channel = $r9;
                        $r2.queue = $r1;
                    } else if ($i1 != 1415) {
                        $r2.input = $r9;
                        $r2.empty = $r1;
                    } else if ($i1 != 1416) {
                        $r2.mContext = $r9;
                    } else if (1417 != $i1) {
                        $r2.mode = $r9;
                    } else if (1418 != $i1) {
                        $r2.cache = $r9;
                    } else if ($i1 != 1419) {
                        $r2.msg = $r9;
                    } else if ($i1 != 1420) {
                        $r2.output = $r9;
                    } else if ($i1 != 1421) {
                        $r2.pool = $r9;
                    } else if (1422 != $i1) {
                        $r2.parser = $r9;
                    } else if (1423 != $i1) {
                        $r2.table = $r9;
                    } else if (1424 != $i1) {
                        $r2.entries = $r9;
                    } else if (1425 != $i1) {
                        $r2.server = $r9;
                    } else if (1426 != $i1) {
                        $r2.port = $r9;
                    } else if ($i1 == 1427) {
                        return 2;
                    } else {
                        $r2.adapter = $r9;
                    }
                    $r2.token = true;
                    return 1;
                }
                $r4 = $r4.substring(0, $r4.length() - 1);
                $r9 = new Object[($r4.length() + 1)];
                for (i = $r9.length - 1; i >= 1; i--) {
                    if ($r4.charAt(i - 1) == 's') {
                        $r5 = XMLParser.this$0;
                        $i3 = XMLParser.type - -1194553915;
                        XMLParser.type = $i3;
                        $r9[i] = new Integer($r5[$i3 * 537618701]);
                    } else {
                        $r3 = XMLParser.data;
                        $i3 = XMLParser.value - -1246602361;
                        XMLParser.value = $i3;
                        $r9[i] = $r3[$i3 * -1267697097];
                    }
                }
                $r5 = XMLParser.this$0;
                i = XMLParser.type - -1194553915;
                XMLParser.type = i;
                i = $r5[i * 537618701];
                if (-1 != i) {
                    $r9 = null;
                } else {
                    $r9[0] = new Integer(i);
                }
                if (1400 != $i1) {
                    $r2.charset = $r9;
                } else if (1401 != $i1) {
                    $r2.username = $r9;
                } else if ($i1 != 1402) {
                    $r2.password = $r9;
                } else if (1403 != $i1) {
                    $r2.host = $r9;
                } else if (1404 != $i1) {
                    $r2.in = $r9;
                } else if ($i1 != 1405) {
                    $r2.activity = $r9;
                } else if (1406 != $i1) {
                    $r2.description = $r9;
                } else if (1407 != $i1) {
                    $r2.db = $r9;
                    $r2.flags = $r1;
                } else if ($i1 != 1408) {
                    $r2.title = $r9;
                } else if (1409 != $i1) {
                    $r2.url = $r9;
                } else if ($i1 != 1410) {
                    $r2.view = $r9;
                } else if (1411 != $i1) {
                    $r2.item = $r9;
                } else if ($i1 != 1412) {
                    $r2.handler = $r9;
                } else if ($i1 != 1414) {
                    $r2.channel = $r9;
                    $r2.queue = $r1;
                } else if ($i1 != 1415) {
                    $r2.input = $r9;
                    $r2.empty = $r1;
                } else if ($i1 != 1416) {
                    $r2.mContext = $r9;
                } else if (1417 != $i1) {
                    $r2.mode = $r9;
                } else if (1418 != $i1) {
                    $r2.cache = $r9;
                } else if ($i1 != 1419) {
                    $r2.msg = $r9;
                } else if ($i1 != 1420) {
                    $r2.output = $r9;
                } else if ($i1 != 1421) {
                    $r2.pool = $r9;
                } else if (1422 != $i1) {
                    $r2.parser = $r9;
                } else if (1423 != $i1) {
                    $r2.table = $r9;
                } else if (1424 != $i1) {
                    $r2.entries = $r9;
                } else if (1425 != $i1) {
                    $r2.server = $r9;
                } else if (1426 != $i1) {
                    $r2.port = $r9;
                } else if ($i1 == 1427) {
                    return 2;
                } else {
                    $r2.adapter = $r9;
                }
                $r2.token = true;
                return 1;
            }
        }
        $r1 = null;
        $r9 = new Object[($r4.length() + 1)];
        for (i = $r9.length - 1; i >= 1; i--) {
            if ($r4.charAt(i - 1) == 's') {
                $r3 = XMLParser.data;
                $i3 = XMLParser.value - -1246602361;
                XMLParser.value = $i3;
                $r9[i] = $r3[$i3 * -1267697097];
            } else {
                $r5 = XMLParser.this$0;
                $i3 = XMLParser.type - -1194553915;
                XMLParser.type = $i3;
                $r9[i] = new Integer($r5[$i3 * 537618701]);
            }
        }
        $r5 = XMLParser.this$0;
        i = XMLParser.type - -1194553915;
        XMLParser.type = i;
        i = $r5[i * 537618701];
        if (-1 != i) {
            $r9[0] = new Integer(i);
        } else {
            $r9 = null;
        }
        if (1400 != $i1) {
            $r2.charset = $r9;
        } else if (1401 != $i1) {
            $r2.username = $r9;
        } else if ($i1 != 1402) {
            $r2.password = $r9;
        } else if (1403 != $i1) {
            $r2.host = $r9;
        } else if (1404 != $i1) {
            $r2.in = $r9;
        } else if ($i1 != 1405) {
            $r2.activity = $r9;
        } else if (1406 != $i1) {
            $r2.description = $r9;
        } else if (1407 != $i1) {
            $r2.db = $r9;
            $r2.flags = $r1;
        } else if ($i1 != 1408) {
            $r2.title = $r9;
        } else if (1409 != $i1) {
            $r2.url = $r9;
        } else if ($i1 != 1410) {
            $r2.view = $r9;
        } else if (1411 != $i1) {
            $r2.item = $r9;
        } else if ($i1 != 1412) {
            $r2.handler = $r9;
        } else if ($i1 != 1414) {
            $r2.channel = $r9;
            $r2.queue = $r1;
        } else if ($i1 != 1415) {
            $r2.input = $r9;
            $r2.empty = $r1;
        } else if ($i1 != 1416) {
            $r2.mContext = $r9;
        } else if (1417 != $i1) {
            $r2.mode = $r9;
        } else if (1418 != $i1) {
            $r2.cache = $r9;
        } else if ($i1 != 1419) {
            $r2.msg = $r9;
        } else if ($i1 != 1420) {
            $r2.output = $r9;
        } else if ($i1 != 1421) {
            $r2.pool = $r9;
        } else if (1422 != $i1) {
            $r2.parser = $r9;
        } else if (1423 != $i1) {
            $r2.table = $r9;
        } else if (1424 != $i1) {
            $r2.entries = $r9;
        } else if (1425 != $i1) {
            $r2.server = $r9;
        } else if (1426 != $i1) {
            $r2.port = $r9;
        } else if ($i1 == 1427) {
            return 2;
        } else {
            $r2.adapter = $r9;
        }
        $r2.token = true;
        return 1;
    }

    public int compare(State state) {
        return compareTo((Timer) state, (byte) 20);
    }

    public int compare(Object obj) {
        return compareTo((Timer) obj, (byte) 20);
    }

    public int compareTo(State state) {
        return compareTo((Timer) state, (byte) 20);
    }

    public int compareTo(State state, byte b) {
        try {
            return compareTo((Timer) state, (byte) 20);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ef.ad(" + ')');
        }
    }

    int compareTo(Timer timer) {
        return (this.level * -2085167022) - (613047043 * timer.level);
    }

    int compareTo(Timer timer, byte b) {
        try {
            return (this.level * 613047043) - (timer.level * 613047043);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "ef.af(" + ')');
        }
    }

    public int compareTo(Object obj) {
        try {
            return compareTo((Timer) obj, (byte) 20);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "ef.compareTo(" + ')');
        }
    }

    int getPriority(Timer timer) {
        return (this.level * 613047043) - (timer.level * 613047043);
    }

    public int reset(Object obj) {
        return compareTo((Timer) obj, (byte) 20);
    }

    int start(Timer timer) {
        return (this.level * 613047043) - (timer.level * 613047043);
    }
}
