package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c9j {
    public final long a;
    public final long b;
    public final boolean c;

    public c9j(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final c9j a(c9j c9jVar) {
        boolean z;
        long f = ogd.f(this.a, c9jVar.a);
        long max = Math.max(this.b, c9jVar.b);
        if (!this.c && !c9jVar.c) {
            z = false;
        } else {
            z = true;
        }
        return new c9j(f, max, z);
    }
}
