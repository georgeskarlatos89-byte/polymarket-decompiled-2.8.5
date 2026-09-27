package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eo5 implements rma {
    public final rma b;
    public final rma c;

    public eo5(rma rmaVar, rma rmaVar2) {
        this.b = rmaVar;
        this.c = rmaVar2;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj instanceof eo5) {
            eo5 eo5Var = (eo5) obj;
            if (this.b.equals(eo5Var.b) && this.c.equals(eo5Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.b.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
    }
}
