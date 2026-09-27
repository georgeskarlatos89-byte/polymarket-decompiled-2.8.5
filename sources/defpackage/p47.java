package defpackage;

import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class p47 extends n47 {
    public static final long b(long j, m47 m47Var) {
        long j2;
        m47Var.getClass();
        int i = o47.a[m47Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            j2 = 1;
                        } else {
                            f05.g(m47Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j2 = 1000;
                    }
                } else {
                    j2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                }
            } else {
                j2 = 3600000;
            }
        } else {
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }
}
