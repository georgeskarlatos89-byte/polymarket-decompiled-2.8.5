package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kek implements ad0 {
    public final int a;
    public final String b;

    public kek(nfj nfjVar) {
        this.a = nfjVar.a;
        this.b = nfjVar.b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof kek) && dkn.b(Integer.valueOf(this.a), Integer.valueOf(((kek) obj).a)) && dkn.b(1, 1) && dkn.b(null, null)) {
            Boolean bool = Boolean.TRUE;
            if (dkn.b(bool, bool)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
