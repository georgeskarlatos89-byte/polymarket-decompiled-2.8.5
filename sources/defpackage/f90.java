package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f90 implements h3g {
    public final /* synthetic */ int a;
    public final Object b;

    public f90(byte[] bArr) {
        this.a = 1;
        zqn.c(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.h3g
    public final void b() {
        switch (this.a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override // defpackage.h3g
    public final Class c() {
        switch (this.a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return this.b.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.h3g
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (AnimatedImageDrawable) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return obj;
            default:
                return (Bitmap) obj;
        }
    }

    @Override // defpackage.h3g
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return o1k.e(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) obj).length;
            case 2:
                return 1;
            default:
                return o1k.d((Bitmap) obj);
        }
    }

    public /* synthetic */ f90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public f90(Object obj) {
        this.a = 2;
        zqn.c(obj, "Argument must not be null");
        this.b = obj;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
