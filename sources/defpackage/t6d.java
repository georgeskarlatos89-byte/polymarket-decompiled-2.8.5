package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class t6d implements u6d {
    public final d49 a;

    public t6d(d49 d49Var) {
        d49Var.getClass();
        this.a = d49Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t6d) && this.a == ((t6d) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TriggerHapticFeedback(type=" + this.a + ")";
    }
}
