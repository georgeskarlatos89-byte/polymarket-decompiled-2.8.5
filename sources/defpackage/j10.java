package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j10 {
    public final int a;

    public /* synthetic */ j10(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j10) {
            if (this.a != ((j10) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.a + ')';
    }
}
