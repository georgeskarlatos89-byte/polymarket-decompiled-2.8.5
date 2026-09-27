package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kza {
    public final String a;

    public kza(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kza) {
            return this.a.equals(((kza) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return woa.r(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
