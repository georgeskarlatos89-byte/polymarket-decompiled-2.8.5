package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uv1 extends OutputStream {
    public final /* synthetic */ int a;

    public /* synthetic */ uv1(int i) {
        this.a = i;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ByteStreams.nullOutputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return "ByteStreams.nullOutputStream()";
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        String d;
        switch (this.a) {
            case 0:
                bArr.getClass();
                brn.o(i, i2 + i, bArr.length);
                return;
            case 1:
            default:
                super.write(bArr, i, i2);
                return;
            case 2:
                bArr.getClass();
                int i3 = i2 + i;
                int length = bArr.length;
                if (i >= 0 && i3 >= i && i3 <= length) {
                    return;
                }
                if (i >= 0 && i <= length) {
                    if (i3 >= 0 && i3 <= length) {
                        d = cen.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i));
                    } else {
                        d = tcn.d(i3, length, "end index");
                    }
                } else {
                    d = tcn.d(i, length, "start index");
                }
                throw new IndexOutOfBoundsException(d);
        }
    }

    private final void e(int i) {
    }

    private final void g(int i) {
    }

    private final void o(int i) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                return;
            case 1:
            default:
                super.write(bArr);
                return;
            case 2:
                bArr.getClass();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
    }
}
