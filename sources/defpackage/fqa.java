package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fqa extends iqa {
    public final float a;

    public fqa(float f) {
        this.a = f;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fqa) && Float.compare(this.a, ((fqa) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
