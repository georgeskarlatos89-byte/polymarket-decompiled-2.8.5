package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jqa extends iqa {
    public final long a;

    public jqa(long j) {
        this.a = j;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jqa) && this.a == ((jqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
