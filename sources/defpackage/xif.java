package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xif {
    public final Class a;
    public final Class b;

    public xif(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static xif a(Class cls) {
        return new xif(wif.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xif.class == obj.getClass()) {
            xif xifVar = (xif) obj;
            if (this.b.equals(xifVar.b)) {
                return this.a.equals(xifVar.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == wif.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + ApiConstant.SPACE + cls.getName();
    }
}
