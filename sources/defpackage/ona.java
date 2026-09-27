package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ona {
    public static final ona b = new ona("unspecified");
    public static final ona c = new ona("compromised");
    public static final ona d = new ona("superseded");
    public final String a;

    public ona(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ona)) {
            return false;
        }
        return Objects.equals(this.a, ((ona) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
