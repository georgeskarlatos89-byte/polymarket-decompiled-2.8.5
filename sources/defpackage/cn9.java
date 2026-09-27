package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cn9 extends LruCache {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn9(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj2;
                ((String) obj).getClass();
                bitmap.getClass();
                return bitmap.getByteCount() / Barcode.FORMAT_UPC_E;
            default:
                unb unbVar = (unb) obj2;
                ((String) obj).getClass();
                unbVar.getClass();
                return unbVar.b.getByteCount() / Barcode.FORMAT_UPC_E;
        }
    }
}
