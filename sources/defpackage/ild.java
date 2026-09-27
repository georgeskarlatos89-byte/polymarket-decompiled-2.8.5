package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ild implements rma {
    public final xt2 b = new b7h();

    public final Object a(cld cldVar) {
        xt2 xt2Var = this.b;
        if (xt2Var.containsKey(cldVar)) {
            return xt2Var.get(cldVar);
        }
        return cldVar.a;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj instanceof ild) {
            return this.b.equals(((ild) obj).b);
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            xt2 xt2Var = this.b;
            if (i < xt2Var.c) {
                cld cldVar = (cld) xt2Var.f(i);
                Object j = this.b.j(i);
                bld bldVar = cldVar.b;
                if (cldVar.d == null) {
                    cldVar.d = cldVar.c.getBytes(rma.a);
                }
                bldVar.b(cldVar.d, j, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }
}
