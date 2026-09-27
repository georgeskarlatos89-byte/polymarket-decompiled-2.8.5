package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cc1 extends zx5 {
    public long j;
    public int k;
    public int l;

    public final boolean B(zx5 zx5Var) {
        ByteBuffer byteBuffer;
        pfn.b(!zx5Var.f(1073741824));
        pfn.b(!zx5Var.f(268435456));
        pfn.b(!zx5Var.f(4));
        if (C()) {
            if (this.k < this.l) {
                ByteBuffer byteBuffer2 = zx5Var.e;
                if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = zx5Var.g;
            if (zx5Var.f(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = zx5Var.e;
        if (byteBuffer3 != null) {
            z(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = zx5Var.g;
        return true;
    }

    public final boolean C() {
        if (this.k > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zx5
    public final void x() {
        super.x();
        this.k = 0;
    }
}
