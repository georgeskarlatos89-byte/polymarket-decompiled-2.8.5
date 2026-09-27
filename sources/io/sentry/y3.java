package io.sentry;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class y3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[io.sentry.rrweb.c.values().length];
        b = iArr;
        try {
            iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[io.sentry.rrweb.d.values().length];
        a = iArr2;
        try {
            iArr2[io.sentry.rrweb.d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[io.sentry.rrweb.d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
