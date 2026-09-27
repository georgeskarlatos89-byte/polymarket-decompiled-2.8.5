package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hqb {
    public final Object a;
    public final Function0 b;

    public hqb(Object obj, Function0 function0) {
        this.a = obj;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hqb.class == obj.getClass() && this.a.equals(((hqb) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
