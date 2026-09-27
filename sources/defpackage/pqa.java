package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pqa extends iqa {
    public final short a;

    public pqa(short s) {
        this.a = s;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return new vsj(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pqa) && this.a == ((pqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        usj usjVar = vsj.b;
        return Short.hashCode(this.a);
    }
}
