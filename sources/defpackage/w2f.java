package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w2f extends eld {
    public final Object a;

    public w2f(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.eld
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.eld
    public final boolean b() {
        return true;
    }

    @Override // defpackage.eld
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w2f) {
            return this.a.equals(((w2f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return ix2.o(new StringBuilder("Optional.of("), this.a, ")");
    }
}
