package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ya8 extends ab8 {
    public final c98 a;

    public ya8(c98 c98Var) {
        this.a = c98Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ya8) || this.a != ((ya8) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Denied(reason=" + this.a + ")";
    }
}
