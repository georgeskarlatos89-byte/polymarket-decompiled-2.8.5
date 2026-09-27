package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ff1 implements k3g {
    public final /* synthetic */ int a;
    public final hf1 b;

    public ff1() {
        this.a = 0;
        this.b = new uwn(24);
    }

    @Override // defpackage.k3g
    public final boolean a(Object obj, ild ildVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.k3g
    public final h3g b(Object obj, int i, int i2, ild ildVar) {
        switch (this.a) {
            case 0:
                return c((ImageDecoder.Source) obj, i, i2, ildVar);
            default:
                return if1.a(this.b, ((tuh) obj).b());
        }
    }

    public if1 c(ImageDecoder.Source source, int i, int i2, ild ildVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new w96(i, i2, ildVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new if1((uwn) this.b, decodeBitmap);
    }

    public ff1(hf1 hf1Var) {
        this.a = 1;
        this.b = hf1Var;
    }
}
