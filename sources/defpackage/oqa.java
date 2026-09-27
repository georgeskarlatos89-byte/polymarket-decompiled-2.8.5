package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oqa extends iqa {
    public final long a;

    public oqa(long j) {
        this.a = j;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return new hkj(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oqa) && this.a == ((oqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.a);
    }
}
