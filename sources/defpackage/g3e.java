package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g3e {
    public final boolean a;
    public final boolean b;

    public g3e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3e)) {
            return false;
        }
        g3e g3eVar = (g3e) obj;
        if (this.a == g3eVar.a && this.b == g3eVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Metadata(isReloadingAfterProcessDeath=" + this.a + ", initializedViaCompose=" + this.b + ")";
    }
}
