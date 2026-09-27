package bo.app;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e5 extends LruCache {
    public e5(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        ((String) obj).getClass();
        bitmap.getClass();
        return bitmap.getByteCount();
    }
}
