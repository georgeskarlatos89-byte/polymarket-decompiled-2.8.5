package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kva {
    public final String a;
    public final String b;

    static {
        u1k.G(0);
        u1k.G(1);
    }

    public kva(String str, String str2) {
        this.a = u1k.M(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kva.class == obj.getClass()) {
            kva kvaVar = (kva) obj;
            if (Objects.equals(this.a, kvaVar.a) && Objects.equals(this.b, kvaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
