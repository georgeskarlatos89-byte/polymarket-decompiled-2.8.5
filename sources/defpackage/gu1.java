package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gu1 implements wo5 {
    public final /* synthetic */ int a;

    public /* synthetic */ gu1(int i) {
        this.a = i;
    }

    @Override // defpackage.wo5
    public final xo5 a(Object obj) {
        switch (this.a) {
            case 0:
                return new jw8((ByteBuffer) obj, 14);
            case 1:
                return new yo5(obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }

    @Override // defpackage.wo5
    public final Class b() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
