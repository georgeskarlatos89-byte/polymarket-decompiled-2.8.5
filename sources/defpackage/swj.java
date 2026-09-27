package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class swj extends uzm {
    public final boolean b;

    public swj(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof swj) && this.b == ((swj) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return m51.l("SetAsDefaultCheckboxChanged(isChecked=", ")", this.b);
    }
}
