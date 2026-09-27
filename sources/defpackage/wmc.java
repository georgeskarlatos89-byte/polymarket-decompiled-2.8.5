package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wmc {
    public Class a;
    public Class b;
    public Class c;

    public wmc(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wmc.class != obj.getClass()) {
            return false;
        }
        wmc wmcVar = (wmc) obj;
        if (this.a.equals(wmcVar.a) && this.b.equals(wmcVar.b) && o1k.c(this.c, wmcVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
