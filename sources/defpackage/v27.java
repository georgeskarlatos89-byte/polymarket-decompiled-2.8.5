package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class v27 implements w27 {
    public final boolean a;

    public v27(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof v27) || this.a != ((v27) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return m51.l("Full(selectsFirstOptionAsDefault=", ")", this.a);
    }
}
