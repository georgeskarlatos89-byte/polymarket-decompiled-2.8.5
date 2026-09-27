package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hpn {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f, float f2, float f3, float f4, zb4 zb4Var) {
        int i;
        int i2;
        int i3;
        float b;
        float a;
        int i4;
        int i5;
        int i6;
        int i7;
        float b2;
        float a2;
        int i8;
        int i9;
        int i10;
        float f5;
        float f6;
        float f7;
        float f8 = 1.0f;
        float f9 = 0.0f;
        if (zb4Var.c()) {
            if (f4 < 0.0f) {
                f5 = 0.0f;
            } else {
                f5 = f4;
            }
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            if (f < 0.0f) {
                f6 = 0.0f;
            } else {
                f6 = f;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            if (f2 < 0.0f) {
                f7 = 0.0f;
            } else {
                f7 = f2;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            if (f3 >= 0.0f) {
                f9 = f3;
            }
            if (f9 <= 1.0f) {
                f8 = f9;
            }
            gkj gkjVar = hkj.b;
            long j = (i13 | ((int) ((f8 * 255.0f) + 0.5f))) << 32;
            int i14 = ib4.n;
            return j;
        }
        if (((int) (zb4Var.b >> 32)) != 3) {
            jw9.a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = zb4Var.c;
        if (i15 == -1) {
            jw9.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i16 = 0;
        float b3 = zb4Var.b(0);
        float a3 = zb4Var.a(0);
        if (f >= b3) {
            b3 = f;
        }
        if (b3 <= a3) {
            a3 = b3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a3);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            if (i19 != 0) {
                i2 = 512;
            } else {
                i2 = 0;
            }
            i = 31;
        } else {
            i = i18 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i20 = (i19 | 8388608) >> (1 - i);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i2 = i20 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            } else {
                int i21 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i21) + 1) | (i17 << 15);
                    short s = (short) i3;
                    b = zb4Var.b(1);
                    a = zb4Var.a(1);
                    if (f2 >= b) {
                        b = f2;
                    }
                    if (b <= a) {
                        a = b;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a);
                    int i22 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i23 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        if (i23 != 0) {
                            i6 = 512;
                        } else {
                            i6 = 0;
                        }
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 <= 0) {
                            if (i5 >= -10) {
                                int i24 = (i23 | 8388608) >> (1 - i5);
                                if ((i24 & 4096) != 0) {
                                    i24 += 8192;
                                }
                                i6 = i24 >> 13;
                                i5 = 0;
                            } else {
                                i6 = 0;
                                i5 = 0;
                            }
                        } else {
                            int i25 = i23 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i25) + 1) | (i22 << 15);
                                short s2 = (short) i7;
                                b2 = zb4Var.b(2);
                                a2 = zb4Var.a(2);
                                if (f3 >= b2) {
                                    b2 = f3;
                                }
                                if (b2 <= a2) {
                                    a2 = b2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a2);
                                int i26 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i27 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    if (i27 != 0) {
                                        i16 = 512;
                                    }
                                    i9 = i16;
                                    i16 = 31;
                                } else {
                                    int i28 = i8 - 112;
                                    if (i28 >= 31) {
                                        i9 = 0;
                                        i16 = 49;
                                    } else if (i28 <= 0) {
                                        if (i28 >= -10) {
                                            int i29 = (i27 | 8388608) >> (1 - i28);
                                            if ((i29 & 4096) != 0) {
                                                i29 += 8192;
                                            }
                                            i9 = i29 >> 13;
                                        } else {
                                            i9 = 0;
                                        }
                                    } else {
                                        int i30 = i27 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i28 << 10) | i30) + 1) | (i26 << 15);
                                            short s3 = (short) i10;
                                            if (f4 >= 0.0f) {
                                                f9 = f4;
                                            }
                                            if (f9 <= 1.0f) {
                                                f8 = f9;
                                            }
                                            long j2 = (i15 & 63) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s3) << 16) | ((((int) ((f8 * 1023.0f) + 0.5f)) & 1023) << 6);
                                            gkj gkjVar2 = hkj.b;
                                            int i31 = ib4.n;
                                            return j2;
                                        }
                                        i9 = i30;
                                        i16 = i28;
                                    }
                                }
                                i10 = i9 | (i26 << 15) | (i16 << 10);
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                if (f9 <= 1.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s32) << 16) | ((((int) ((f8 * 1023.0f) + 0.5f)) & 1023) << 6);
                                gkj gkjVar22 = hkj.b;
                                int i312 = ib4.n;
                                return j22;
                            }
                            i6 = i25;
                        }
                    }
                    i7 = i6 | (i22 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    b2 = zb4Var.b(2);
                    a2 = zb4Var.a(2);
                    if (f3 >= b2) {
                    }
                    if (b2 <= a2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a2);
                    int i262 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i272 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i262 << 15) | (i16 << 10);
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    if (f9 <= 1.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s22 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s322) << 16) | ((((int) ((f8 * 1023.0f) + 0.5f)) & 1023) << 6);
                    gkj gkjVar222 = hkj.b;
                    int i3122 = ib4.n;
                    return j222;
                }
                i2 = i21;
            }
        }
        i3 = i2 | (i17 << 15) | (i << 10);
        short s4 = (short) i3;
        b = zb4Var.b(1);
        a = zb4Var.a(1);
        if (f2 >= b) {
        }
        if (b <= a) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a);
        int i222 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i232 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i222 << 15) | (i5 << 10);
        short s222 = (short) i7;
        b2 = zb4Var.b(2);
        a2 = zb4Var.a(2);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a2);
        int i2622 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2722 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2622 << 15) | (i16 << 10);
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        if (f9 <= 1.0f) {
        }
        long j2222 = (i15 & 63) | ((s4 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s222 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s3222) << 16) | ((((int) ((f8 * 1023.0f) + 0.5f)) & 1023) << 6);
        gkj gkjVar2222 = hkj.b;
        int i31222 = ib4.n;
        return j2222;
    }

    public static final long b(int i) {
        long j = i;
        gkj gkjVar = hkj.b;
        long j2 = j << 32;
        int i2 = ib4.n;
        return j2;
    }

    public static final long c(long j) {
        long j2 = j << 32;
        gkj gkjVar = hkj.b;
        int i = ib4.n;
        return j2;
    }

    public static long d(float f, float f2, float f3, float f4, zb4 zb4Var, int i) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            zb4Var = bc4.e;
        }
        return a(f, f2, f3, f4, zb4Var);
    }

    public static long e(int i, int i2, int i3) {
        return b(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(int i, int i2, pq4 pq4Var, kjc kjcVar, String str, boolean z) {
        int i3;
        kjc kjcVar2;
        int i4;
        int i5;
        boolean z2;
        sr8 sr8Var;
        boolean z3;
        nrf u;
        int i6;
        kjc kjcVar3;
        str.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-891239469);
        if (sr8Var2.h(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            kjcVar2 = kjcVar;
            if (sr8Var2.h(kjcVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i7 |= i4;
            i5 = i7 | 384;
            if ((i5 & 147) == 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!sr8Var2.V(i5 & 1, z2)) {
                if (i8 != 0) {
                    i6 = i5;
                    kjcVar3 = hjc.a;
                } else {
                    i6 = i5;
                    kjcVar3 = kjcVar2;
                }
                long j = ((h6i) sr8Var2.l(k9i.c)).g;
                sr8Var2.e0(-1782629800);
                sr8Var2.s(false);
                sr8Var = sr8Var2;
                mwi.b(str, kjcVar3, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((hjj) sr8Var2.l(njj.b)).g, sr8Var, i6 & WebSocketProtocol.PAYLOAD_SHORT, 0, 65528);
                kjcVar2 = kjcVar3;
                z3 = true;
            } else {
                sr8Var = sr8Var2;
                sr8Var.Y();
                z3 = z;
            }
            u = sr8Var.u();
            if (u == null) {
                u.d = new p41(str, kjcVar2, z3, i, i2, 3);
                return;
            }
            return;
        }
        kjcVar2 = kjcVar;
        i5 = i7 | 384;
        if ((i5 & 147) == 146) {
        }
        if (!sr8Var2.V(i5 & 1, z2)) {
        }
        u = sr8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long g(float f, float f2, float f3, float f4, zb4 zb4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (zb4Var.c()) {
            gkj gkjVar = hkj.b;
            long j = ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32;
            int i10 = ib4.n;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = Barcode.FORMAT_UPC_A;
        int i16 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i2 = 512;
            } else {
                i2 = 0;
            }
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i17 = (i13 | 8388608) >> (1 - i);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i2 = i17 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            } else {
                int i18 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i18) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i19 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i20 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        if (i20 != 0) {
                            i6 = 512;
                        } else {
                            i6 = 0;
                        }
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 <= 0) {
                            if (i5 >= -10) {
                                int i21 = (i20 | 8388608) >> (1 - i5);
                                if ((i21 & 4096) != 0) {
                                    i21 += 8192;
                                }
                                i6 = i21 >> 13;
                                i5 = 0;
                            } else {
                                i6 = 0;
                                i5 = 0;
                            }
                        } else {
                            int i22 = i20 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i19 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    if (i24 == 0) {
                                        i15 = 0;
                                    }
                                    i16 = i15;
                                    i14 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 < 31) {
                                        if (i25 <= 0) {
                                            if (i25 >= -10) {
                                                int i26 = (i24 | 8388608) >> (1 - i25);
                                                if ((i26 & 4096) != 0) {
                                                    i26 += 8192;
                                                }
                                                i14 = 0;
                                                i16 = i26 >> 13;
                                            } else {
                                                i14 = 0;
                                            }
                                        } else {
                                            i16 = i24 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i25 << 10) | i16) + 1) | (i23 << 15);
                                                short s3 = (short) i9;
                                                long max = ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (zb4Var.c & 63);
                                                gkj gkjVar2 = hkj.b;
                                                int i27 = ib4.n;
                                                return max;
                                            }
                                            i14 = i25;
                                        }
                                    }
                                }
                                i9 = (i23 << 15) | (i14 << 10) | i16;
                                short s32 = (short) i9;
                                long max2 = ((s32 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (zb4Var.c & 63);
                                gkj gkjVar22 = hkj.b;
                                int i272 = ib4.n;
                                return max2;
                            }
                            i6 = i22;
                        }
                    }
                    i7 = i6 | (i19 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i232 << 15) | (i14 << 10) | i16;
                    short s322 = (short) i9;
                    long max22 = ((s322 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s22 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (zb4Var.c & 63);
                    gkj gkjVar222 = hkj.b;
                    int i2722 = ib4.n;
                    return max22;
                }
                i2 = i18;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s4 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i192 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i202 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i192 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2322 << 15) | (i14 << 10) | i16;
        short s3222 = (short) i9;
        long max222 = ((s3222 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((s4 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s222 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (zb4Var.c & 63);
        gkj gkjVar2222 = hkj.b;
        int i27222 = ib4.n;
        return max222;
    }

    public static final long h(long j, long j2) {
        float f;
        float f2;
        long a = ib4.a(j, ib4.e(j2));
        float c = ib4.c(j2);
        float c2 = ib4.c(a);
        float f3 = 1.0f - c2;
        float f4 = (c * f3) + c2;
        float g = ib4.g(a);
        float g2 = ib4.g(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((g2 * c) * f3) + (g * c2)) / f4;
        }
        float f6 = ib4.f(a);
        float f7 = ib4.f(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((f7 * c) * f3) + (f6 * c2)) / f4;
        }
        float d = ib4.d(a);
        float d2 = ib4.d(j2);
        if (f4 != 0.0f) {
            f5 = (((d2 * c) * f3) + (d * c2)) / f4;
        }
        return g(f, f2, f5, f4, ib4.e(j2));
    }

    public static final long i(float f, long j, long j2) {
        phd phdVar = bc4.x;
        long a = ib4.a(j, phdVar);
        long a2 = ib4.a(j2, phdVar);
        float c = ib4.c(a);
        float g = ib4.g(a);
        float f2 = ib4.f(a);
        float d = ib4.d(a);
        float c2 = ib4.c(a2);
        float g2 = ib4.g(a2);
        float f3 = ib4.f(a2);
        float d2 = ib4.d(a2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return ib4.a(g(nfn.d(g, g2, f), nfn.d(f2, f3, f), nfn.d(d, d2, f), nfn.d(c, c2, f), phdVar), ib4.e(j2));
    }

    public static final float j(long j) {
        zb4 e = ib4.e(j);
        if (!kpn.b(e.b, 12884901888L)) {
            jw9.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) kpn.c(e.b)));
        }
        q7g q7gVar = ((t7g) e).p;
        double c = q7gVar.c(ib4.g(j));
        float c2 = (float) ((q7gVar.c(ib4.d(j)) * 0.0722d) + (q7gVar.c(ib4.f(j)) * 0.7152d) + (c * 0.2126d));
        if (c2 < 0.0f) {
            c2 = 0.0f;
        }
        if (c2 > 1.0f) {
            return 1.0f;
        }
        return c2;
    }

    public static final int k(long j) {
        float[] fArr = bc4.a;
        long a = ib4.a(j, bc4.e) >>> 32;
        gkj gkjVar = hkj.b;
        return (int) a;
    }
}
