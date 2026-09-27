package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class aqa extends iqa {
    public final boolean a;

    public aqa(boolean z) {
        this.a = z;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aqa) && this.a == ((aqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
