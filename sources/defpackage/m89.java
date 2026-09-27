package defpackage;

import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m89 extends h24 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.xnb
    public final void a() {
        try {
            this.i.a(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    bArr = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                    this.j = bArr;
                }
                i = this.i.read(bArr, i2, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            aun.a(this.i);
        } catch (Throwable th) {
            aun.a(this.i);
            throw th;
        }
    }

    @Override // defpackage.xnb
    public final void b() {
        this.k = true;
    }
}
