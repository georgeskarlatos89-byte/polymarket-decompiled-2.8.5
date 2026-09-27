package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a29 {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(no9 no9Var) {
        int k = no9Var.k();
        Size size = (Size) no9Var.a(no9.v0, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int d = rkn.d(k);
            boolean z = true;
            if (1 != i) {
                z = false;
            }
            int c = rkn.c(d, i2, z);
            if (c == 90 || c == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public void b(byte[] bArr, int i, int i2) {
        if (!this.c) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = (byte[]) this.d;
        int length = bArr2.length;
        int i4 = this.a + i3;
        byte[] bArr3 = bArr2;
        if (length < i4) {
            ?? copyOf = Arrays.copyOf(bArr2, i4 * 2);
            this.d = copyOf;
            bArr3 = copyOf;
        }
        System.arraycopy(bArr, i, bArr3, this.a, i3);
        this.a += i3;
    }
}
