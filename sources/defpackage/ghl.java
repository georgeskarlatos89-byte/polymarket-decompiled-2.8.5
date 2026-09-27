package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ghl extends ygl {
    public final zgf a;

    public ghl(zgf zgfVar) {
        this.a = zgfVar;
    }

    @Override // defpackage.ygl
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ygl
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ghl) {
            return this.a.equals(((ghl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return sv6.n("Optional.of(", this.a.toString(), ")");
    }
}
