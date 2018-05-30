package p000;

/* compiled from: bo */
public class CompassView {
    public static final int CALENDARS_INDEX_CAN_ORGANIZER_RESPOND = 4;
    public static final int Id_pow = 14;
    static final int PADDING = 2;
    static final int REFRESH_TIME = 5000;
    static Double[] data;

    CompassView() {
        try {
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "bo.<init>(" + ')');
        }
    }

    static String get(int i, byte b) {
        try {
            return "<img=" + i + ">";
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bo.af(" + ')');
        }
    }

    static final void init(String str, int i) {
        try {
            Locale.append(str + R$id.appName, (byte) 4);
        } catch (RuntimeException $r2) {
            throw StringBuilder.append($r2, "bo.aq(" + ')');
        }
    }

    static void read(int $i0, int i) {
        if ($i0 == -1 && !client.index) {
            try {
                Target.add((byte) 42);
            } catch (RuntimeException $r1) {
                throw StringBuilder.append($r1, "bo.be(" + ')');
            }
        } else if (!(-1 == $i0 || $i0 == client.table * 1387447661 || client.user * -1819605895 == 0 || client.index)) {
            HttpRequest $r0 = client.header;
            i = client.user * -1819605895;
            MultiInputStream.index = 63807465;
            ParserHelper.index = $r0;
            DirCache.value = -1919717083 * $i0;
            MultiInputStream.value = 0;
            FieldInfo.index = -1734207119 * i;
            Time.index = false;
            AssertionError.name = -777381582;
        }
        client.table = -541914011 * $i0;
    }

    static final int write(int i) {
        try {
            if (Main.this$0.f276i) {
                return Msg.size * -1674539149;
            }
            i = 3;
            if (Segment.f277y * -1421687705 < 310) {
                int $i2;
                int $i1;
                if (1 == client.info * 780758273) {
                    $i2 = (Shape.data * -1216222673) >> 7;
                    $i1 = (1417186721 * Cell.data) >> 7;
                } else {
                    $i2 = (File.this$0.size * 516759209) >> 7;
                    $i1 = (File.this$0.value * 2328865) >> 7;
                }
                int $i4 = (-721800181 * ClassWriter.f48x) >> 7;
                int $i3 = (Wallet.f372y * -2076152847) >> 7;
                if ($i4 < 0 || $i3 < 0 || $i4 >= DiskLruCache.AppCompatTheme_editTextStyle || $i3 >= DiskLruCache.AppCompatTheme_editTextStyle) {
                    return Msg.size * -1674539149;
                }
                if ($i2 < 0 || $i1 < 0 || $i2 >= DiskLruCache.AppCompatTheme_editTextStyle || $i1 >= DiskLruCache.AppCompatTheme_editTextStyle) {
                    return Msg.size * -1674539149;
                }
                if ((Chart.size[Msg.size * -1674539149][$i4][$i3] & (byte) 4) != (byte) 0) {
                    i = Msg.size * -1674539149;
                }
                int $i5 = $i2 > $i4 ? $i2 - $i4 : $i4 - $i2;
                int $i6 = $i1 > $i3 ? $i1 - $i3 : $i3 - $i1;
                if ($i5 > $i6) {
                    $i5 = ($i6 * PingManager.STATE_SENSOR_ON_FLAG) / $i5;
                    $i6 = 32768;
                    while ($i2 != $i4) {
                        if ($i4 < $i2) {
                            $i4++;
                        } else if ($i4 > $i2) {
                            $i4--;
                        }
                        if ((Chart.size[Msg.size * -1674539149][$i4][$i3] & (byte) 4) != (byte) 0) {
                            i = Msg.size * -1674539149;
                        }
                        $i6 += $i5;
                        if ($i6 >= PingManager.STATE_SENSOR_ON_FLAG) {
                            $i6 -= PingManager.STATE_SENSOR_ON_FLAG;
                            if ($i3 < $i1) {
                                $i3++;
                            } else if ($i3 > $i1) {
                                $i3--;
                            }
                            if ((Chart.size[Msg.size * -1674539149][$i4][$i3] & (byte) 4) != (byte) 0) {
                                i = Msg.size * -1674539149;
                            }
                        }
                    }
                } else if ($i6 > 0) {
                    $i5 = ($i5 * PingManager.STATE_SENSOR_ON_FLAG) / $i6;
                    $i6 = $i4;
                    $i4 = 32768;
                    while ($i3 != $i1) {
                        if ($i3 < $i1) {
                            $i3++;
                        } else if ($i3 > $i1) {
                            $i3--;
                        }
                        if ((Chart.size[Msg.size * -1674539149][$i6][$i3] & (byte) 4) != (byte) 0) {
                            i = Msg.size * -1674539149;
                        }
                        $i4 += $i5;
                        if ($i4 >= PingManager.STATE_SENSOR_ON_FLAG) {
                            $i4 -= PingManager.STATE_SENSOR_ON_FLAG;
                            if ($i6 < $i2) {
                                $i6++;
                            } else if ($i6 > $i2) {
                                $i6--;
                            }
                            if ((Chart.size[Msg.size * -1674539149][$i6][$i3] & (byte) 4) != (byte) 0) {
                                i = Msg.size * -1674539149;
                            }
                        }
                    }
                }
            }
            if (File.this$0.size * 516759209 >= 0) {
                if (File.this$0.value * 2328865 >= 0) {
                    if (File.this$0.size * 516759209 < 13312) {
                        if (File.this$0.value * 2328865 < 13312) {
                            return (Chart.size[Msg.size * -1674539149][(File.this$0.size * 516759209) >> 7][(File.this$0.value * 2328865) >> 7] & (byte) 4) != (byte) 0 ? Msg.size * -1674539149 : i;
                        }
                    }
                }
            }
            return Msg.size * -1674539149;
        } catch (RuntimeException $r5) {
            throw StringBuilder.append($r5, "bo.dk(" + ')');
        }
    }
}
