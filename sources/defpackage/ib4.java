package defpackage;

import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultColors;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ib4 {
    public static final long b = hpn.c(DefaultColors.PRIMARY);
    public static final long c = hpn.c(4282664004L);
    public static final long d = hpn.c(4287137928L);
    public static final long e = hpn.c(4291611852L);
    public static final long f = hpn.c(4294967295L);
    public static final long g = hpn.c(4294901760L);
    public static final long h = hpn.c(4278255360L);
    public static final long i = hpn.c(4278190335L);
    public static final long j = hpn.c(4294967040L);
    public static final long k;
    public static final long l;
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final long a;

    static {
        hpn.c(4278255615L);
        k = hpn.c(4294902015L);
        l = hpn.b(0);
        m = hpn.a(0.0f, 0.0f, 0.0f, 0.0f, bc4.u);
    }

    public /* synthetic */ ib4(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, zb4 zb4Var) {
        dx4 dx4Var;
        zb4 e2 = e(j2);
        int i2 = e2.c;
        int i3 = zb4Var.c;
        if ((i2 | i3) < 0) {
            dx4Var = mpn.d(e2, zb4Var);
        } else {
            bpc bpcVar = ex4.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = bpcVar.b(i4);
            if (b2 == null) {
                b2 = mpn.d(e2, zb4Var);
                bpcVar.i(i4, b2);
            }
            dx4Var = (dx4) b2;
        }
        return dx4Var.a(j2);
    }

    public static long b(long j2, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = c(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = g(j2);
        }
        if ((i2 & 4) != 0) {
            f4 = f(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = d(j2);
        }
        return hpn.a(f3, f4, f5, f2, e(j2));
    }

    public static final float c(long j2) {
        float h2;
        float f2;
        long j3 = 63 & j2;
        gkj gkjVar = hkj.b;
        if (j3 == 0) {
            h2 = (float) ozm.h((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            h2 = (float) ozm.h((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return h2 / f2;
    }

    public static final float d(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        gkj gkjVar = hkj.b;
        if (j3 == 0) {
            return ((float) ozm.h((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b88.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final zb4 e(long j2) {
        float[] fArr = bc4.a;
        gkj gkjVar = hkj.b;
        return bc4.y[(int) (j2 & 63)];
    }

    public static final float f(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        gkj gkjVar = hkj.b;
        if (j3 == 0) {
            return ((float) ozm.h((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b88.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        gkj gkjVar = hkj.b;
        if (j3 == 0) {
            return ((float) ozm.h((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - b88.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String h(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(f(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        sb.append(c(j2));
        sb.append(", ");
        return m51.m(sb, e(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib4) {
            if (this.a != ((ib4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
