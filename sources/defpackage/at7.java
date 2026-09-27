package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class at7 extends ByteArrayOutputStream {
    public final /* synthetic */ int a;

    public /* synthetic */ at7() {
        this.a = 2;
    }

    public byte[] e() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] g() {
        switch (this.a) {
            case 0:
                byte[] bArr = ((ByteArrayOutputStream) this).buf;
                bArr.getClass();
                return bArr;
            default:
                return ((ByteArrayOutputStream) this).buf;
        }
    }

    public synchronized ByteBuffer o() {
        return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count).asReadOnlyBuffer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at7(int i, int i2) {
        super(i);
        this.a = i2;
    }
}
