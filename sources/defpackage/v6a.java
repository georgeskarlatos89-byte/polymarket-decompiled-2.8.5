package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v6a {
    public final int a;
    public final int b;
    public final z0b c;

    public v6a(int i, int i2, z0b z0bVar) {
        this.a = i;
        this.b = i2;
        this.c = z0bVar;
        if (i < 0) {
            nw9.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        nw9.a("size should be > 0");
    }
}
