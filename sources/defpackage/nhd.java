package defpackage;

import okhttp3.Protocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class nhd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Protocol.values().length];
        try {
            iArr[Protocol.HTTP_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Protocol.HTTP_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Protocol.SPDY_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Protocol.HTTP_2.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Protocol.QUIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
