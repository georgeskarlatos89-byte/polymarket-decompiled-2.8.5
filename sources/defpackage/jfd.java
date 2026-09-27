package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jfd implements rma {
    public final Object b;

    public jfd(Object obj) {
        zqn.c(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj instanceof jfd) {
            return this.b.equals(((jfd) obj).b);
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return woa.q(new StringBuilder("ObjectKey{object="), this.b, '}');
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(rma.a));
    }
}
