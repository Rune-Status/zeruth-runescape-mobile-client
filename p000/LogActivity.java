package p000;

/* compiled from: hn */
public class LogActivity extends Object {
    static final int MENU_SEARCH = 4;
    static final int MENU_SHARE = 4;
    static Scalar type;
    static Double[] value;
    Task name;
    Preferences next;

    LogActivity(Task task) {
        try {
            this.next = new Preferences();
            this.name = task;
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "hn.<init>(" + ')');
        }
    }

    static void init(int i) {
        try {
            TIntArrayList.append(R$id.max, R$id.logger, R$id.directory, (byte) -38);
            Contact.f109y = 1421889271;
            Path $r5 = client.context.getInstance(-1290553606).add(3, -300368959);
            $r5.add(Contact.text, (byte) -9);
            $r5.append((byte) 2);
        } catch (RuntimeException $r6) {
            throw StringBuilder.append($r6, "hn.aq(" + ')');
        }
    }

    void add(int i, int i2, int i3, int i4, byte b) {
        int $i5 = 0;
        Intent $r1 = null;
        Intent $r4 = (Intent) this.next.get();
        while ($r4 != null) {
            $i5++;
            try {
                if (i == $r4.next * -1702207435) {
                    $r4.init(i, i2, i3, i4, (byte) 0);
                    return;
                }
                if ($r4.next * -1702207435 <= i) {
                    $r1 = $r4;
                }
                $r4 = (Intent) this.next.next();
            } catch (RuntimeException $r5) {
                throw StringBuilder.append($r5, "hn.af(" + ')');
            }
        }
        if ($r1 != null) {
            Preferences.add(new Intent(i, i2, i3, i4), $r1);
            if ($i5 >= 4) {
                this.next.get().iterator();
            }
        } else if ($i5 < 4) {
            this.next.add(new Intent(i, i2, i3, i4));
        }
    }

    Intent convert(int i) {
        Intent $r3 = (Intent) this.next.get();
        if ($r3 == null || $r3.next * -1702207435 > i) {
            return null;
        }
        Intent $r4 = (Intent) this.next.next();
        while ($r4 != null && $r4.next * -1702207435 <= i) {
            $r3.iterator();
            $r3 = $r4;
            $r4 = (Intent) this.next.next();
        }
        if ((this.name.f312e * -1267670247) + ((1196171631 * $r3.f154e) + ($r3.next * -1702207435)) > i) {
            return $r3;
        }
        $r3.iterator();
        return null;
    }

    Intent execute(int i) {
        Intent $r3 = (Intent) this.next.get();
        if ($r3 == null || $r3.next * -1889807148 > i) {
            return null;
        }
        Intent $r6 = (Intent) this.next.next();
        while ($r6 != null && -1530856141 * $r6.next <= i) {
            $r3.iterator();
            $r3 = $r6;
            $r6 = (Intent) this.next.next();
        }
        if ((this.name.f312e * 1186203536) + ((412943509 * $r3.f154e) + ($r3.next * 1241968865)) > i) {
            return $r3;
        }
        $r3.iterator();
        return null;
    }

    Intent execute(int i, int i2) {
        try {
            Intent $r3 = (Intent) this.next.get();
            if ($r3 != null) {
                int $i1 = $r3.next * -1702207435;
                i2 = $i1;
                if ($i1 <= i) {
                    Intent $r4 = (Intent) this.next.next();
                    while ($r4 != null) {
                        $i1 = $r4.next * -1702207435;
                        i2 = $i1;
                        if ($i1 <= i) {
                            $r3.iterator();
                            $r3 = $r4;
                            $r4 = (Intent) this.next.next();
                        }
                    }
                    $i1 = (this.name.f312e * -1267670247) + ((1196171631 * $r3.f154e) + ($r3.next * -1702207435));
                    i2 = $i1;
                    if ($i1 > i) {
                        return $r3;
                    }
                    $r3.iterator();
                    return null;
                }
            }
            return null;
        } catch (RuntimeException $r7) {
            throw StringBuilder.append($r7, "hn.ad(" + ')');
        }
    }

    void execute(int i, int i2, int i3, int i4) {
        Intent $r1 = null;
        Intent $r4 = (Intent) this.next.get();
        int $i4 = 0;
        while ($r4 != null) {
            $i4++;
            if (i == $r4.next * 1153925010) {
                $r4.init(i, i2, i3, i4, (byte) 0);
                return;
            }
            if (-1930082563 * $r4.next <= i) {
                $r1 = $r4;
            }
            $r4 = (Intent) this.next.next();
        }
        if ($r1 != null) {
            Preferences.add(new Intent(i, i2, i3, i4), $r1);
            if ($i4 >= 4) {
                this.next.get().iterator();
            }
        } else if ($i4 < 4) {
            this.next.add(new Intent(i, i2, i3, i4));
        }
    }

    Intent m80init(int i) {
        Intent $r3 = (Intent) this.next.get();
        if ($r3 == null || $r3.next * 544050671 > i) {
            return null;
        }
        Intent $r5 = (Intent) this.next.next();
        while ($r5 != null && 587564175 * $r5.next <= i) {
            $r3.iterator();
            $r3 = $r5;
            $r5 = (Intent) this.next.next();
        }
        if ((this.name.f312e * -1267670247) + ((1196171631 * $r3.f154e) + ($r3.next * -699535365)) > i) {
            return $r3;
        }
        $r3.iterator();
        return null;
    }

    void init(int i, int i2, int i3, int i4) {
        Intent $r1 = null;
        Intent $r4 = (Intent) this.next.get();
        int $i4 = 0;
        while ($r4 != null) {
            $i4++;
            if (i == $r4.next * -1702207435) {
                $r4.init(i, i2, i3, i4, (byte) 0);
                return;
            }
            if ($r4.next * -1702207435 <= i) {
                $r1 = $r4;
            }
            $r4 = (Intent) this.next.next();
        }
        if ($r1 != null) {
            Preferences.add(new Intent(i, i2, i3, i4), $r1);
            if ($i4 >= 4) {
                this.next.get().iterator();
            }
        } else if ($i4 < 4) {
            this.next.add(new Intent(i, i2, i3, i4));
        }
    }

    boolean invoke(int i) {
        try {
            return this.next.equals();
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "hn.an(" + ')');
        }
    }

    boolean isEmpty() {
        return this.next.equals();
    }

    boolean onCreate() {
        return this.next.equals();
    }

    Intent onOptionsItemSelected(int i) {
        Intent $r3 = (Intent) this.next.get();
        if ($r3 == null || $r3.next * -1702207435 > i) {
            return null;
        }
        Intent $r5 = (Intent) this.next.next();
        while ($r5 != null && -1946373053 * $r5.next <= i) {
            $r3.iterator();
            $r3 = $r5;
            $r5 = (Intent) this.next.next();
        }
        if ((this.name.f312e * -1267670247) + ((1196171631 * $r3.f154e) + ($r3.next * 1160077049)) > i) {
            return $r3;
        }
        $r3.iterator();
        return null;
    }

    boolean onOptionsItemSelected() {
        return this.next.equals();
    }

    Intent reset(int i) {
        Intent $r3 = (Intent) this.next.get();
        if ($r3 == null || $r3.next * -1702207435 > i) {
            return null;
        }
        Intent $r5 = (Intent) this.next.next();
        while ($r5 != null && $r5.next * -1702207435 <= i) {
            $r3.iterator();
            $r3 = $r5;
            $r5 = (Intent) this.next.next();
        }
        if ((this.name.f312e * -1267670247) + ((1196171631 * $r3.f154e) + ($r3.next * -1702207435)) > i) {
            return $r3;
        }
        $r3.iterator();
        return null;
    }

    void reset(int i, int i2, int i3, int i4) {
        Intent $r1 = null;
        Intent $r4 = (Intent) this.next.get();
        int $i4 = 0;
        while ($r4 != null) {
            $i4++;
            if (i == $r4.next * -1702207435) {
                $r4.init(i, i2, i3, i4, (byte) 0);
                return;
            }
            if ($r4.next * -1702207435 <= i) {
                $r1 = $r4;
            }
            $r4 = (Intent) this.next.next();
        }
        if ($r1 != null) {
            Preferences.add(new Intent(i, i2, i3, i4), $r1);
            if ($i4 >= 4) {
                this.next.get().iterator();
            }
        } else if ($i4 < 4) {
            this.next.add(new Intent(i, i2, i3, i4));
        }
    }

    boolean reset() {
        return this.next.equals();
    }
}
