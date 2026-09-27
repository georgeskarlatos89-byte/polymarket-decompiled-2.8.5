package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ns8 implements Comparable {
    public final int a;
    public final jnk b;
    public final boolean c;

    public ns8(int i, jnk jnkVar, boolean z) {
        this.a = i;
        this.b = jnkVar;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((ns8) obj).a;
    }
}
