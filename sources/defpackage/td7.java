package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class td7 {
    public final String a;

    public td7(String str) {
        if (str != null) {
            this.a = str;
        } else {
            dmk.s("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td7)) {
            return false;
        }
        return this.a.equals(((td7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return woa.r(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
