package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sz7 implements k3g {
    public final /* synthetic */ int a;

    public /* synthetic */ sz7(int i) {
        this.a = i;
    }

    @Override // defpackage.k3g
    public final boolean a(Object obj, ild ildVar) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.k3g
    public final h3g b(Object obj, int i, int i2, ild ildVar) {
        switch (this.a) {
            case 0:
                return new f90((File) obj);
            case 1:
                return new f90((Bitmap) obj, 3);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new kv8(drawable, 1);
                }
                return null;
        }
    }
}
