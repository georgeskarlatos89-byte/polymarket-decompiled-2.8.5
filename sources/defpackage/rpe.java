package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rpe extends Exception {
    public final int a;
    public final long b;

    static {
        ix2.v(0, 1, 2, 3, 4);
        u1k.G(5);
    }

    public rpe(String str, Throwable th, int i, long j) {
        super(str, th);
        this.a = i;
        this.b = j;
    }
}
