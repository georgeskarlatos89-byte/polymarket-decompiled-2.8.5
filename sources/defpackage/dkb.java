package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class dkb {
    public final Object a;
    public final String b;

    public dkb(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        int identityHashCode = System.identityHashCode(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dkb) {
                dkb dkbVar = (dkb) obj;
                if (this.a == dkbVar.a && this.b.equals(dkbVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
