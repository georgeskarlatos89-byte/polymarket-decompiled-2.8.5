package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kqa extends iqa {
    public final short a;

    public kqa(short s) {
        this.a = s;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Short.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kqa) && this.a == ((kqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
