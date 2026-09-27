package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yik implements Comparable {
    public final int a;
    public final uik b;

    public yik(int i, uik uikVar) {
        this.a = i;
        this.b = uikVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((yik) obj).a);
    }
}
