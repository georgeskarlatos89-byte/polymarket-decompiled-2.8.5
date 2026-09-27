package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pt1 extends l5f {
    public byte[] a;
    public int b;

    @Override // defpackage.l5f
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.l5f
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.l5f
    public final int d() {
        return this.b;
    }
}
