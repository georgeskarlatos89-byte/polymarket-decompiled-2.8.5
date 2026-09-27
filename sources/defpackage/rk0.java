package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rk0 extends bv1 {
    public final byte[] a;
    public int b;

    public rk0(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.bv1
    public final byte a() {
        try {
            byte[] bArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            ahh.i(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < this.a.length) {
            return true;
        }
        return false;
    }
}
