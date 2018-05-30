package p000;

/* compiled from: mk */
public class Wallet {
    static int f372y;
    public int data;
    public int message;
    public int type;
    public int value;

    public Wallet(int i, int i2) {
        try {
            this(0, 0, i, i2);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.<init>(" + ')');
        }
    }

    public Wallet(int i, int i2, int i3, int i4) {
        try {
            update(i, i2, (byte) -126);
            add(i3, i4, 414659992);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.<init>(" + ')');
        }
    }

    public void add(int $i0, int i, int i2) {
        try {
            this.data = 181415445 * $i0;
            this.value = 879382385 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.ad(" + ')');
        }
    }

    public void checkAESKey(Wallet wallet, Wallet wallet2) {
        decrypt(wallet, wallet2, 1274279474);
        toString(wallet, wallet2, 2104367222);
    }

    int clear(int i) {
        try {
            return (this.message * -22382459) + (this.data * 1292316989);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.ay(" + ')');
        }
    }

    int decrypt() {
        return (1953141137 * this.value) + (this.type * 1508303939);
    }

    public void decrypt(int $i0, int i) {
        this.data = 181415445 * $i0;
        this.value = 879382385 * i;
    }

    void decrypt(Wallet wallet, Wallet wallet2) {
        wallet2.type = this.type * 1;
        wallet2.value = this.value * 1;
        if (this.type * 1508303939 < wallet.type * 1508303939) {
            wallet2.value -= (wallet.type * -1052236979) - (253324947 * this.type);
            wallet2.type = wallet.type * 1;
        }
        if (wallet2.toString(-645690166) > wallet.toString(839098725)) {
            wallet2.value -= (wallet2.toString(-1169891023) - wallet.toString(1141557829)) * 374666312;
        }
        if (1953141137 * wallet2.value < 0) {
            wallet2.value = 0;
        }
    }

    void decrypt(Wallet wallet, Wallet wallet2, int i) {
        try {
            wallet2.message = this.message * 1;
            wallet2.data = this.data * 1;
            if (this.message * -22382459 < wallet.message * -22382459) {
                wallet2.data -= (wallet.message * -1548498711) - (this.message * -1548498711);
                wallet2.message = wallet.message * 1;
            }
            if (wallet2.clear(-2141406008) > wallet.clear(-2139871172)) {
                wallet2.data -= (wallet2.clear(-2132292972) - wallet.clear(-2138250812)) * 181415445;
            }
            if (1292316989 * wallet2.data < 0) {
                wallet2.data = 0;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mk.aa(" + ')');
        }
    }

    public void encrypt(int $i0, int i) {
        this.message = -1243692979 * $i0;
        this.type = -240547733 * i;
    }

    void encrypt(Wallet wallet, Wallet wallet2) {
        wallet2.message = this.message * 1;
        wallet2.data = this.data * 1;
        if (this.message * -1690104521 < wallet.message * -1829921132) {
            wallet2.data -= (-1548498711 * wallet.message) - (1047224681 * this.message);
            wallet2.message = wallet.message * 1;
        }
        if (wallet2.clear(-2141529919) > wallet.clear(-2138406981)) {
            wallet2.data -= (wallet2.clear(-2143477672) - wallet.clear(-2133180133)) * -148182114;
        }
        if (1292316989 * wallet2.data < 0) {
            wallet2.data = 0;
        }
    }

    public String findKeyFromPubHash() {
        return null;
    }

    public String findKeyFromPubKey() {
        return null;
    }

    int getBloomFilterElementCount() {
        return (19565505 * this.value) + (this.type * 1508303939);
    }

    public String getLastBlockSeenTime() {
        return null;
    }

    public void killTx(Wallet wallet, Wallet wallet2) {
        decrypt(wallet, wallet2, 1640055790);
        toString(wallet, wallet2, 1228324997);
    }

    public void read(Wallet wallet, Wallet wallet2, int i) {
        try {
            decrypt(wallet, wallet2, 2070614209);
            toString(wallet, wallet2, 1141209388);
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mk.an(" + ')');
        }
    }

    void receive(Wallet wallet, Wallet wallet2) {
        wallet2.type = this.type * 1;
        wallet2.value = this.value * 1;
        if (this.type * 1508303939 < wallet.type * 1508303939) {
            wallet2.value -= (wallet.type * 253324947) - (this.type * 253324947);
            wallet2.type = wallet.type * 1;
        }
        if (wallet2.toString(233435279) > wallet.toString(-57835116)) {
            wallet2.value -= (wallet2.toString(1229315473) - wallet.toString(-1746008767)) * 879382385;
        }
        if (1953141137 * wallet2.value < 0) {
            wallet2.value = 0;
        }
    }

    int reset() {
        return (this.message * -22382459) + (this.data * 1292316989);
    }

    public void reset(int $i0, int i) {
        this.data = 181415445 * $i0;
        this.value = -2013495308 * i;
    }

    void reset(Wallet wallet, Wallet wallet2) {
        wallet2.message = this.message * 1;
        wallet2.data = this.data * 1;
        if (this.message * -22382459 < wallet.message * -22382459) {
            wallet2.data -= (wallet.message * -1548498711) - (this.message * -1548498711);
            wallet2.message = wallet.message * 1;
        }
        if (wallet2.clear(-2135094831) > wallet.clear(-2135786579)) {
            wallet2.data -= (wallet2.clear(-2132193518) - wallet.clear(-2142691568)) * 181415445;
        }
        if (1292316989 * wallet2.data < 0) {
            wallet2.data = 0;
        }
    }

    int toString(int i) {
        try {
            return (1953141137 * this.value) + (this.type * 1508303939);
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.as(" + ')');
        }
    }

    public String toString() {
        return null;
    }

    void toString(Wallet wallet, Wallet wallet2, int i) {
        try {
            wallet2.type = this.type * 1;
            wallet2.value = this.value * 1;
            if (this.type * 1508303939 < wallet.type * 1508303939) {
                wallet2.value -= (wallet.type * 253324947) - (this.type * 253324947);
                wallet2.type = wallet.type * 1;
            }
            if (wallet2.toString(-636103716) > wallet.toString(-1290018636)) {
                wallet2.value -= (wallet2.toString(-1104599082) - wallet.toString(236341349)) * 879382385;
            }
            if (1953141137 * wallet2.value < 0) {
                wallet2.value = 0;
            }
        } catch (RuntimeException $r3) {
            throw StringBuilder.append($r3, "mk.ag(" + ')');
        }
    }

    public void update(int $i0, int i, byte b) {
        try {
            this.message = -1243692979 * $i0;
            this.type = -240547733 * i;
        } catch (RuntimeException $r1) {
            throw StringBuilder.append($r1, "mk.af(" + ')');
        }
    }
}
