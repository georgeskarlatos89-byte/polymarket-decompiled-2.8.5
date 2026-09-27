package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class h47 {
    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
                return lnf.f(j + j2, -4611686018427387903L, 4611686018427387903L);
            }
            return j2;
        }
        if (-4611686018427387903L < j2 && j2 < 4611686018427387903L) {
            return j;
        }
        if ((j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        d47.b.getClass();
        int i = f47.a;
        return j2;
    }

    public static final long c(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return d(j * 1000000);
        }
        return b(lnf.f(j, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long d(long j) {
        long j2 = j << 1;
        d47.b.getClass();
        int i = f47.a;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b8, code lost:
    
        if (r5 == r26.length()) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        if (r26.charAt(r5) != 'S') goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        r2 = (r14 * skip.lib.Duration.ATTOSECONDS_PER_NANOSECOND) + r15;
        r14 = r9;
        r4 = defpackage.m47.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d6, code lost:
    
        switch(defpackage.g47.a[r4.ordinal()]) {
            case 1: goto L128;
            case 2: goto L127;
            case 3: goto L126;
            case 4: goto L125;
            case 5: goto L124;
            case 6: goto L123;
            case 7: goto L122;
            default: goto L121;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d9, code lost:
    
        defpackage.f05.g(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0210, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e1, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020a, code lost:
    
        r2 = defpackage.i5c.f(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e7, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ed, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f3, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f9, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ff, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0205, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0104, code lost:
    
        defpackage.dmk.v("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0107, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r5 >= r26.length()) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ('0' > r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r3 >= ':') goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r5 == r26.length()) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5 == (r23 + r2)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[LOOP:5: B:75:0x015a->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195 A[LOOP:7: B:87:0x0193->B:88:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long e(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        m47 m47Var;
        int i7;
        int min;
        int i8;
        char charAt;
        int i9;
        int i10;
        if (str.length() != 0) {
            char charAt2 = str.charAt(0);
            int i11 = 1;
            char c = '-';
            char c2 = '+';
            if (charAt2 != '+') {
                if (charAt2 != '-') {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                i = i2;
            } else {
                i = 0;
                i2 = 1;
            }
            if (str.length() > i2) {
                if (str.charAt(i2) == 'P') {
                    int i12 = i2 + 1;
                    if (i12 != str.length()) {
                        int i13 = 0;
                        m47 m47Var2 = null;
                        long j2 = 0;
                        long j3 = 0;
                        while (i12 < str.length()) {
                            char charAt3 = str.charAt(i12);
                            if (charAt3 == 'T') {
                                if (i13 == 0 && (i12 = i12 + 1) != str.length()) {
                                    i13 = i11;
                                } else {
                                    dmk.v("");
                                    return 0L;
                                }
                            } else {
                                ntb ntbVar = ntb.c;
                                int i14 = i11;
                                char charAt4 = str.charAt(i12);
                                if (charAt4 != c2) {
                                    if (charAt4 != c) {
                                        i3 = i12;
                                    } else {
                                        i3 = i12 + 1;
                                        i4 = -1;
                                        while (i3 < str.length() && str.charAt(i3) == '0') {
                                            i3++;
                                        }
                                        j = 0;
                                        while (true) {
                                            if (i3 >= str.length()) {
                                                char charAt5 = str.charAt(i3);
                                                i5 = i12;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i9 = charAt5 - '0';
                                                    i10 = i;
                                                    long j4 = ntbVar.a;
                                                    if (j <= j4 && (j != j4 || i9 <= ntbVar.b)) {
                                                        j = (j << 3) + (j << i14) + i9;
                                                        i3++;
                                                        i12 = i5;
                                                        ntbVar = ntbVar;
                                                        i = i10;
                                                    }
                                                }
                                            } else {
                                                i5 = i12;
                                            }
                                        }
                                        int i15 = i;
                                        if (i3 != str.length()) {
                                            if (charAt3 != '+' && charAt3 != '-') {
                                                i6 = 0;
                                            } else {
                                                i6 = i14;
                                            }
                                            if (i3 == i5 + i6) {
                                            }
                                            long j5 = j;
                                            if (str.charAt(i3) == '.') {
                                                int i16 = i3 + 1;
                                                int min2 = Math.min(i3 + 7, str.length());
                                                int i17 = 0;
                                                for (int i18 = i16; i18 < min2; i18++) {
                                                    char charAt6 = str.charAt(i18);
                                                    if ('0' <= charAt6 && charAt6 < ':') {
                                                        i17 = (charAt6 - '0') + (i17 << 3) + (i17 << 1);
                                                    }
                                                    for (i7 = 0; i7 < 6 - (i18 - i16); i7++) {
                                                        i17 = (i17 << 1) + (i17 << 3);
                                                    }
                                                    min = Math.min(i18 + 9, str.length());
                                                    i3 = i18;
                                                    int i19 = 0;
                                                    while (i3 < min) {
                                                        char charAt7 = str.charAt(i3);
                                                        int i20 = min;
                                                        if ('0' <= charAt7 && charAt7 < ':') {
                                                            i19 = (charAt7 - '0') + (i19 << 3) + (i19 << 1);
                                                            i3++;
                                                            min = i20;
                                                        }
                                                        for (i8 = 0; i8 < 9 - (i3 - i18); i8++) {
                                                            i19 = (i19 << 1) + (i19 << 3);
                                                        }
                                                        while (i3 < str.length() && '0' <= (charAt = str.charAt(i3)) && charAt < ':') {
                                                            i3++;
                                                        }
                                                        dmk.v("");
                                                        return 0L;
                                                    }
                                                    while (i8 < 9 - (i3 - i18)) {
                                                    }
                                                    while (i3 < str.length()) {
                                                        i3++;
                                                    }
                                                    dmk.v("");
                                                    return 0L;
                                                }
                                                while (i7 < 6 - (i18 - i16)) {
                                                }
                                                min = Math.min(i18 + 9, str.length());
                                                i3 = i18;
                                                int i192 = 0;
                                                while (i3 < min) {
                                                }
                                                while (i8 < 9 - (i3 - i18)) {
                                                }
                                                while (i3 < str.length()) {
                                                }
                                                dmk.v("");
                                                return 0L;
                                            }
                                            char charAt8 = str.charAt(i3);
                                            if (charAt8 != 'D') {
                                                if (charAt8 != 'H') {
                                                    if (charAt8 != 'M') {
                                                        if (charAt8 != 'S') {
                                                            m47Var = null;
                                                        } else {
                                                            m47Var = m47.SECONDS;
                                                        }
                                                    } else {
                                                        m47Var = m47.MINUTES;
                                                    }
                                                } else {
                                                    m47Var = m47.HOURS;
                                                }
                                            } else {
                                                m47Var = m47.DAYS;
                                            }
                                            if (m47Var != null) {
                                                if (m47Var2 != null && m47Var2.compareTo(m47Var) <= 0) {
                                                    dmk.v("Unexpected order of duration components");
                                                    return 0L;
                                                }
                                                if (m47Var == m47.DAYS) {
                                                    if (i13 == 0) {
                                                        j2 = p47.b(j5, m47Var) * i4;
                                                    } else {
                                                        dmk.v("");
                                                        return 0L;
                                                    }
                                                } else if (i13 != 0) {
                                                    long a = a(j2, p47.b(j5, m47Var) * i4);
                                                    if (a != 9223372036854759646L) {
                                                        j2 = a;
                                                    } else {
                                                        dmk.v("");
                                                        return 0L;
                                                    }
                                                } else {
                                                    dmk.v("");
                                                    return 0L;
                                                }
                                                i12 = i3 + 1;
                                                m47Var2 = m47Var;
                                                i11 = i14;
                                                i = i15;
                                                c = '-';
                                                c2 = '+';
                                            } else {
                                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                            }
                                        }
                                        dmk.v("");
                                        return 0L;
                                    }
                                } else {
                                    i3 = i12 + 1;
                                }
                                i4 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                j = 0;
                                while (true) {
                                    if (i3 >= str.length()) {
                                    }
                                    j = (j << 3) + (j << i14) + i9;
                                    i3++;
                                    i12 = i5;
                                    ntbVar = ntbVar;
                                    i = i10;
                                }
                                int i152 = i;
                                if (i3 != str.length()) {
                                }
                                dmk.v("");
                                return 0L;
                            }
                        }
                        int i21 = i;
                        long k = d47.k(h(j2, m47.MILLISECONDS), h(j3, m47.NANOSECONDS));
                        if (i21 != 0) {
                            d47.b.getClass();
                            if (!d47.d(k, d47.e)) {
                                return d47.p(k);
                            }
                            return k;
                        }
                        return k;
                    }
                    dmk.v("");
                    return 0L;
                }
                dmk.v("");
                return 0L;
            }
            dmk.v("No components");
            return 0L;
        }
        dmk.v("The string is empty");
        return 0L;
    }

    public static final long f(double d, m47 m47Var) {
        m47Var.getClass();
        double a = n47.a(d, m47Var, m47.NANOSECONDS);
        if (!Double.isNaN(a)) {
            long f = i5c.f(a);
            if (-4611686018426999999L <= f && f < 4611686018427000000L) {
                return d(f);
            }
            return c(i5c.f(n47.a(d, m47Var, m47.MILLISECONDS)));
        }
        dmk.v("Duration value cannot be NaN.");
        return 0L;
    }

    public static final long g(int i, m47 m47Var) {
        m47Var.getClass();
        if (m47Var.compareTo(m47.SECONDS) <= 0) {
            long j = i;
            m47 m47Var2 = m47.NANOSECONDS;
            m47Var2.getClass();
            return d(m47Var2.a().convert(j, m47Var.a()));
        }
        return h(i, m47Var);
    }

    public static final long h(long j, m47 m47Var) {
        m47Var.getClass();
        m47 m47Var2 = m47.NANOSECONDS;
        m47Var2.getClass();
        long convert = m47Var.a().convert(4611686018426999999L, m47Var2.a());
        if ((-convert) <= j && j <= convert) {
            return d(m47Var2.a().convert(j, m47Var.a()));
        }
        m47 m47Var3 = m47.MILLISECONDS;
        if (m47Var.compareTo(m47Var3) >= 0) {
            long signum = Long.signum(j);
            if (j < -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            return b(p47.b(Math.abs(j), m47Var) * signum);
        }
        m47Var3.getClass();
        return b(lnf.f(m47Var3.a().convert(j, m47Var.a()), -4611686018427387903L, 4611686018427387903L));
    }
}
