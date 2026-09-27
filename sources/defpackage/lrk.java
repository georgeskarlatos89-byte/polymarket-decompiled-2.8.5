package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lrk extends Adler32 {
    public volatile int a;

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final long getValue() {
        int i = ((65535 & r0) - 1) % 65521;
        int value = ((((int) super.getValue()) >>> 16) - this.a) % 65521;
        if (value < 0) {
            value += 65521;
        }
        if (i < 0) {
            i += 65521;
        }
        return ((value << 16) | i) & 4294967295L;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void reset() {
        super.reset();
        this.a = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2048];
        while (true) {
            int min = Math.min(2048, byteBuffer.remaining());
            if (min > 0) {
                byteBuffer.get(bArr, 0, min);
                update(bArr, 0, min);
            } else {
                return;
            }
        }
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        this.a = (int) ((this.a + i2) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr) {
        super.update(bArr);
        this.a = (int) ((this.a + bArr.length) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(int i) {
        super.update(i);
        this.a = (int) ((this.a + 1) % 65521);
    }
}
