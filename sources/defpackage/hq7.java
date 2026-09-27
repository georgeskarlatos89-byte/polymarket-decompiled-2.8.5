package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hq7 implements ao9 {
    @Override // defpackage.ao9
    public final int a(InputStream inputStream, bxb bxbVar) {
        int d = new gq7(inputStream).d(1, "Orientation");
        if (d == 0) {
            return -1;
        }
        return d;
    }

    @Override // defpackage.ao9
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.ao9
    public final int c(ByteBuffer byteBuffer, bxb bxbVar) {
        AtomicReference atomicReference = hu1.a;
        return a(new iq7(byteBuffer), bxbVar);
    }

    @Override // defpackage.ao9
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
