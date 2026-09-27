package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class if1 implements h3g, nv9 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public if1(hf1 hf1Var, Bitmap bitmap) {
        zqn.c(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        zqn.c(hf1Var, "BitmapPool must not be null");
        this.c = hf1Var;
    }

    public static if1 a(hf1 hf1Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new if1(hf1Var, bitmap);
    }

    @Override // defpackage.h3g
    public final void b() {
        switch (this.a) {
            case 0:
                ((hf1) this.c).c((Bitmap) this.b);
                return;
            default:
                ((h3g) this.c).b();
                return;
        }
    }

    @Override // defpackage.h3g
    public final Class c() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.h3g
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((h3g) this.c).get());
        }
    }

    @Override // defpackage.h3g
    public final int getSize() {
        switch (this.a) {
            case 0:
                return o1k.d((Bitmap) this.b);
            default:
                return ((h3g) this.c).getSize();
        }
    }

    @Override // defpackage.nv9
    public final void initialize() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                return;
            default:
                h3g h3gVar = (h3g) this.c;
                if (h3gVar instanceof nv9) {
                    ((nv9) h3gVar).initialize();
                    return;
                }
                return;
        }
    }

    public if1(Resources resources, h3g h3gVar) {
        zqn.c(resources, "Argument must not be null");
        this.b = resources;
        zqn.c(h3gVar, "Argument must not be null");
        this.c = h3gVar;
    }
}
