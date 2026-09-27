package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class a4n {
    /* JADX WARN: Removed duplicated region for block: B:114:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(kjc kjcVar, z2b z2bVar, iqd iqdVar, boolean z, mk0 mk0Var, in inVar, x78 x78Var, boolean z2, apd apdVar, Function1 function1, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        z2b z2bVar2;
        iqd iqdVar2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        mk0 mk0Var2;
        int i8;
        in inVar2;
        int i9;
        x78 x78Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        sr8 sr8Var;
        kjc kjcVar2;
        z2b z2bVar3;
        iqd iqdVar3;
        boolean z5;
        mk0 mk0Var3;
        in inVar3;
        x78 x78Var3;
        boolean z6;
        apd apdVar2;
        nrf u;
        kjc kjcVar3;
        iqd iqdVar4;
        mk0 mk0Var4;
        in inVar4;
        x78 x78Var4;
        kjc kjcVar4;
        int i15;
        boolean z7;
        iqd iqdVar5;
        mk0 mk0Var5;
        in inVar5;
        x78 x78Var5;
        apd a;
        boolean z8;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(53695811);
        int i21 = i2 & 1;
        if (i21 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (sr8Var2.h(kjcVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                z2bVar2 = z2bVar;
                if (sr8Var2.h(z2bVar2)) {
                    i20 = 32;
                    i3 |= i20;
                }
            } else {
                z2bVar2 = z2bVar;
            }
            i20 = 16;
            i3 |= i20;
        } else {
            z2bVar2 = z2bVar;
        }
        int i22 = i2 & 4;
        if (i22 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            iqdVar2 = iqdVar;
            if (sr8Var2.h(iqdVar2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            i6 = i2 & 8;
            if (i6 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                if (sr8Var2.i(z3)) {
                    i7 = 2048;
                } else {
                    i7 = Barcode.FORMAT_UPC_E;
                }
                i3 |= i7;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        mk0Var2 = mk0Var;
                        if (sr8Var2.h(mk0Var2)) {
                            i19 = Http2.INITIAL_MAX_FRAME_SIZE;
                            i3 |= i19;
                        }
                    } else {
                        mk0Var2 = mk0Var;
                    }
                    i19 = 8192;
                    i3 |= i19;
                } else {
                    mk0Var2 = mk0Var;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    inVar2 = inVar;
                    if (sr8Var2.h(inVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            x78Var2 = x78Var;
                            if (sr8Var2.h(x78Var2)) {
                                i18 = 1048576;
                                i3 |= i18;
                            }
                        } else {
                            x78Var2 = x78Var;
                        }
                        i18 = 524288;
                        i3 |= i18;
                    } else {
                        x78Var2 = x78Var;
                    }
                    i10 = i2 & 128;
                    if (i10 == 0) {
                        i3 |= 12582912;
                        i11 = i21;
                    } else {
                        i11 = i21;
                        if ((i & 12582912) == 0) {
                            if (sr8Var2.i(z2)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if (sr8Var2.j(function1)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i3 |= i17;
                    }
                    i13 = i3 & 306783379;
                    i14 = i3;
                    boolean z9 = false;
                    boolean z10 = true;
                    if (i13 == 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!sr8Var2.V(i14 & 1, z4)) {
                        sr8Var2.a0();
                        if ((i & 1) != 0 && !sr8Var2.D()) {
                            sr8Var2.Y();
                            if ((i2 & 2) != 0) {
                                i16 = i14 & (-113);
                            } else {
                                i16 = i14;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i16 &= -3670017;
                            }
                            i15 = i16 & (-234881025);
                            z8 = z2;
                            a = apdVar;
                            iqdVar5 = iqdVar2;
                            z7 = z3;
                            mk0Var5 = mk0Var2;
                            inVar5 = inVar2;
                            x78Var5 = x78Var2;
                            kjcVar4 = kjcVar;
                        } else {
                            if (i11 != 0) {
                                kjcVar3 = hjc.a;
                            } else {
                                kjcVar3 = kjcVar;
                            }
                            if ((i2 & 2) != 0) {
                                z2bVar2 = a3b.a(0, 0, 3, sr8Var2);
                                i14 &= -113;
                            }
                            if (i22 != 0) {
                                iqdVar4 = new mqd(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                iqdVar4 = iqdVar2;
                            }
                            if (i6 == 0) {
                                z9 = z3;
                            }
                            if ((i2 & 16) != 0) {
                                if (!z9) {
                                    mk0Var4 = nk0.c;
                                } else {
                                    mk0Var4 = nk0.d;
                                }
                                i14 &= -57345;
                            } else {
                                mk0Var4 = mk0Var2;
                            }
                            if (i8 != 0) {
                                inVar4 = gdn.o;
                            } else {
                                inVar4 = inVar2;
                            }
                            if ((i2 & 64) != 0) {
                                rw5 a2 = ohh.a(sr8Var2);
                                boolean h = sr8Var2.h(a2);
                                Object Q = sr8Var2.Q();
                                if (h || Q == oq4.a) {
                                    Q = new z36(a2);
                                    sr8Var2.o0(Q);
                                }
                                x78Var4 = (z36) Q;
                                i14 &= -3670017;
                            } else {
                                x78Var4 = x78Var2;
                            }
                            if (i10 == 0) {
                                z10 = z2;
                            }
                            kjcVar4 = kjcVar3;
                            i15 = i14 & (-234881025);
                            z7 = z9;
                            iqdVar5 = iqdVar4;
                            mk0Var5 = mk0Var4;
                            inVar5 = inVar4;
                            x78Var5 = x78Var4;
                            a = cpd.a(sr8Var2);
                            z8 = z10;
                        }
                        z2b z2bVar4 = z2bVar2;
                        sr8Var2.t();
                        int i23 = i15 >> 3;
                        sr8Var = sr8Var2;
                        g5n.a(kjcVar4, z2bVar4, iqdVar5, z7, true, x78Var5, z8, a, inVar5, mk0Var5, null, null, function1, sr8Var, (i15 & 14) | 24576 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (458752 & i23) | (i23 & 3670016) | ((i15 << 12) & 1879048192), ((i15 >> 12) & 14) | ((i15 >> 18) & 7168), 6400);
                        kjcVar2 = kjcVar4;
                        z2bVar3 = z2bVar4;
                        iqdVar3 = iqdVar5;
                        z5 = z7;
                        x78Var3 = x78Var5;
                        z6 = z8;
                        apdVar2 = a;
                        inVar3 = inVar5;
                        mk0Var3 = mk0Var5;
                    } else {
                        sr8Var = sr8Var2;
                        sr8Var.Y();
                        kjcVar2 = kjcVar;
                        z2bVar3 = z2bVar2;
                        iqdVar3 = iqdVar2;
                        z5 = z3;
                        mk0Var3 = mk0Var2;
                        inVar3 = inVar2;
                        x78Var3 = x78Var2;
                        z6 = z2;
                        apdVar2 = apdVar;
                    }
                    u = sr8Var.u();
                    if (u == null) {
                        u.d = new dd2(kjcVar2, z2bVar3, iqdVar3, z5, mk0Var3, inVar3, x78Var3, z6, apdVar2, function1, i, i2);
                        return;
                    }
                    return;
                }
                inVar2 = inVar;
                if ((1572864 & i) != 0) {
                }
                i10 = i2 & 128;
                if (i10 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i13 = i3 & 306783379;
                i14 = i3;
                boolean z92 = false;
                boolean z102 = true;
                if (i13 == 306783378) {
                }
                if (!sr8Var2.V(i14 & 1, z4)) {
                }
                u = sr8Var.u();
                if (u == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            inVar2 = inVar;
            if ((1572864 & i) != 0) {
            }
            i10 = i2 & 128;
            if (i10 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i13 = i3 & 306783379;
            i14 = i3;
            boolean z922 = false;
            boolean z1022 = true;
            if (i13 == 306783378) {
            }
            if (!sr8Var2.V(i14 & 1, z4)) {
            }
            u = sr8Var.u();
            if (u == null) {
            }
        }
        iqdVar2 = iqdVar;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        inVar2 = inVar;
        if ((1572864 & i) != 0) {
        }
        i10 = i2 & 128;
        if (i10 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i13 = i3 & 306783379;
        i14 = i3;
        boolean z9222 = false;
        boolean z10222 = true;
        if (i13 == 306783378) {
        }
        if (!sr8Var2.V(i14 & 1, z4)) {
        }
        u = sr8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(kjc kjcVar, z2b z2bVar, iqd iqdVar, jk0 jk0Var, gd1 gd1Var, x78 x78Var, boolean z, apd apdVar, Function1 function1, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        z2b z2bVar2;
        iqd iqdVar2;
        int i5;
        int i6;
        jk0 jk0Var2;
        int i7;
        gd1 gd1Var2;
        int i8;
        x78 x78Var2;
        int i9;
        boolean z2;
        int i10;
        int i11;
        boolean z3;
        sr8 sr8Var;
        kjc kjcVar2;
        apd apdVar2;
        z2b z2bVar3;
        iqd iqdVar3;
        jk0 jk0Var3;
        gd1 gd1Var3;
        x78 x78Var3;
        boolean z4;
        nrf u;
        kjc kjcVar3;
        int i12;
        iqd iqdVar4;
        jk0 jk0Var4;
        gd1 gd1Var4;
        x78 x78Var4;
        kjc kjcVar4;
        int i13;
        jk0 jk0Var5;
        gd1 gd1Var5;
        x78 x78Var5;
        apd a;
        boolean z5;
        iqd iqdVar5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-1884325601);
        int i19 = i2 & 1;
        if (i19 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (sr8Var2.h(kjcVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                z2bVar2 = z2bVar;
                if (sr8Var2.h(z2bVar2)) {
                    i18 = 32;
                    i3 |= i18;
                }
            } else {
                z2bVar2 = z2bVar;
            }
            i18 = 16;
            i3 |= i18;
        } else {
            z2bVar2 = z2bVar;
        }
        int i20 = i2 & 4;
        if (i20 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            iqdVar2 = iqdVar;
            if (sr8Var2.h(iqdVar2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            i6 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    jk0Var2 = jk0Var;
                    if (sr8Var2.h(jk0Var2)) {
                        i17 = Http2.INITIAL_MAX_FRAME_SIZE;
                        i6 |= i17;
                    }
                } else {
                    jk0Var2 = jk0Var;
                }
                i17 = 8192;
                i6 |= i17;
            } else {
                jk0Var2 = jk0Var;
            }
            i7 = i2 & 32;
            if (i7 == 0) {
                i6 |= 196608;
            } else if ((196608 & i) == 0) {
                gd1Var2 = gd1Var;
                if (sr8Var2.h(gd1Var2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        x78Var2 = x78Var;
                        if (sr8Var2.h(x78Var2)) {
                            i16 = 1048576;
                            i6 |= i16;
                        }
                    } else {
                        x78Var2 = x78Var;
                    }
                    i16 = 524288;
                    i6 |= i16;
                } else {
                    x78Var2 = x78Var;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    if (sr8Var2.i(z2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i6 |= i10;
                    if ((100663296 & i) == 0) {
                        i6 |= 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        if (sr8Var2.j(function1)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i6 |= i15;
                    }
                    i11 = i6;
                    if ((i6 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!sr8Var2.V(i11 & 1, z3)) {
                        sr8Var2.a0();
                        if ((i & 1) != 0 && !sr8Var2.D()) {
                            sr8Var2.Y();
                            if ((i2 & 2) != 0) {
                                i14 = i11 & (-113);
                            } else {
                                i14 = i11;
                            }
                            if ((i2 & 16) != 0) {
                                i14 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i14 &= -3670017;
                            }
                            i13 = i14 & (-234881025);
                            a = apdVar;
                            jk0Var5 = jk0Var2;
                            gd1Var5 = gd1Var2;
                            x78Var5 = x78Var2;
                            z5 = z2;
                            kjcVar4 = kjcVar;
                            iqdVar5 = iqdVar2;
                        } else {
                            if (i19 != 0) {
                                kjcVar3 = hjc.a;
                            } else {
                                kjcVar3 = kjcVar;
                            }
                            if ((i2 & 2) != 0) {
                                z2bVar2 = a3b.a(0, 0, 3, sr8Var2);
                                i12 = i11 & (-113);
                            } else {
                                i12 = i11;
                            }
                            if (i20 != 0) {
                                iqdVar4 = new mqd(0.0f, 0.0f, 0.0f, 0.0f);
                            } else {
                                iqdVar4 = iqdVar2;
                            }
                            if ((i2 & 16) != 0) {
                                i12 &= -57345;
                                jk0Var4 = nk0.a;
                            } else {
                                jk0Var4 = jk0Var2;
                            }
                            if (i7 != 0) {
                                gd1Var4 = gdn.l;
                            } else {
                                gd1Var4 = gd1Var2;
                            }
                            if ((i2 & 64) != 0) {
                                rw5 a2 = ohh.a(sr8Var2);
                                boolean h = sr8Var2.h(a2);
                                Object Q = sr8Var2.Q();
                                if (h || Q == oq4.a) {
                                    Q = new z36(a2);
                                    sr8Var2.o0(Q);
                                }
                                x78Var4 = (z36) Q;
                                i12 &= -3670017;
                            } else {
                                x78Var4 = x78Var2;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            kjcVar4 = kjcVar3;
                            i13 = (-234881025) & i12;
                            jk0Var5 = jk0Var4;
                            gd1Var5 = gd1Var4;
                            x78Var5 = x78Var4;
                            a = cpd.a(sr8Var2);
                            z5 = z2;
                            iqdVar5 = iqdVar4;
                        }
                        z2b z2bVar4 = z2bVar2;
                        sr8Var2.t();
                        int i21 = i13 >> 3;
                        sr8Var = sr8Var2;
                        g5n.a(kjcVar4, z2bVar4, iqdVar5, false, false, x78Var5, z5, a, null, null, gd1Var5, jk0Var5, function1, sr8Var, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (458752 & i21) | (i21 & 3670016), ((i13 >> 12) & 112) | ((i13 >> 6) & 896) | ((i13 >> 18) & 7168), 1792);
                        kjcVar2 = kjcVar4;
                        z2bVar3 = z2bVar4;
                        iqdVar3 = iqdVar5;
                        x78Var3 = x78Var5;
                        z4 = z5;
                        apdVar2 = a;
                        gd1Var3 = gd1Var5;
                        jk0Var3 = jk0Var5;
                    } else {
                        sr8Var = sr8Var2;
                        sr8Var.Y();
                        kjcVar2 = kjcVar;
                        apdVar2 = apdVar;
                        z2bVar3 = z2bVar2;
                        iqdVar3 = iqdVar2;
                        jk0Var3 = jk0Var2;
                        gd1Var3 = gd1Var2;
                        x78Var3 = x78Var2;
                        z4 = z2;
                    }
                    u = sr8Var.u();
                    if (u == null) {
                        u.d = new ur1(kjcVar2, z2bVar3, iqdVar3, jk0Var3, gd1Var3, x78Var3, z4, apdVar2, function1, i, i2);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((100663296 & i) == 0) {
                }
                if ((805306368 & i) == 0) {
                }
                i11 = i6;
                if ((i6 & 306783379) == 306783378) {
                }
                if (!sr8Var2.V(i11 & 1, z3)) {
                }
                u = sr8Var.u();
                if (u == null) {
                }
            }
            gd1Var2 = gd1Var;
            if ((1572864 & i) == 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            z2 = z;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            i11 = i6;
            if ((i6 & 306783379) == 306783378) {
            }
            if (!sr8Var2.V(i11 & 1, z3)) {
            }
            u = sr8Var.u();
            if (u == null) {
            }
        }
        iqdVar2 = iqdVar;
        i6 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        gd1Var2 = gd1Var;
        if ((1572864 & i) == 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        z2 = z;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        i11 = i6;
        if ((i6 & 306783379) == 306783378) {
        }
        if (!sr8Var2.V(i11 & 1, z3)) {
        }
        u = sr8Var.u();
        if (u == null) {
        }
    }

    public static final kjc c(kjc kjcVar, iqd iqdVar) {
        return kjcVar.e(new jqd(iqdVar, wz9.a));
    }

    public static final kjc d(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new i05(function1, wz9.a));
    }

    public static final kjc e(kjc kjcVar, alk alkVar) {
        return kjcVar.e(new lz9(alkVar, wz9.a));
    }
}
