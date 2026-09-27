package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q6g {
    public static final q6g d = new q6g(0, false, false);
    public static final q6g e = new q6g(500, true, false);
    public static final q6g f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new q6g(100L, true, false);
        f = new q6g(0L, false, true);
    }

    public q6g(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            grn.b("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
