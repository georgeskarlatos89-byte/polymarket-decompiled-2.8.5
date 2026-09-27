package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class d50 implements rma {
    public final int b;
    public final rma c;

    public d50(int i, rma rmaVar) {
        this.b = i;
        this.c = rmaVar;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj instanceof d50) {
            d50 d50Var = (d50) obj;
            if (this.b == d50Var.b && this.c.equals(d50Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return o1k.j(this.b, this.c);
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }
}
