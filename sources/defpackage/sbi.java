package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sbi {
    public static final sbi c;
    public boolean a;
    public long b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sbi] */
    static {
        ?? obj = new Object();
        obj.b = -9223372036854775807L;
        obj.a = false;
        c = obj;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
