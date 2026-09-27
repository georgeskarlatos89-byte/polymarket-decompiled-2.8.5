package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kv8 implements h3g, nv9 {
    public final Drawable a;
    public final /* synthetic */ int b;

    public kv8(Drawable drawable, int i) {
        this.b = i;
        zqn.c(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.h3g
    public final void b() {
        bxb bxbVar;
        bxb bxbVar2;
        bxb bxbVar3;
        switch (this.b) {
            case 0:
                jv8 jv8Var = (jv8) this.a;
                jv8Var.stop();
                jv8Var.d = true;
                pv8 pv8Var = (pv8) jv8Var.a.b;
                j2g j2gVar = pv8Var.d;
                pv8Var.c.clear();
                Bitmap bitmap = pv8Var.l;
                if (bitmap != null) {
                    pv8Var.e.c(bitmap);
                    pv8Var.l = null;
                }
                pv8Var.f = false;
                nv8 nv8Var = pv8Var.i;
                if (nv8Var != null) {
                    j2gVar.a(nv8Var);
                    pv8Var.i = null;
                }
                nv8 nv8Var2 = pv8Var.k;
                if (nv8Var2 != null) {
                    j2gVar.a(nv8Var2);
                    pv8Var.k = null;
                }
                nv8 nv8Var3 = pv8Var.m;
                if (nv8Var3 != null) {
                    j2gVar.a(nv8Var3);
                    pv8Var.m = null;
                }
                tuh tuhVar = pv8Var.a;
                bw4 bw4Var = tuhVar.c;
                tuhVar.l = null;
                byte[] bArr = tuhVar.i;
                if (bArr != null && (bxbVar3 = (bxb) bw4Var.c) != null) {
                    bxbVar3.g(bArr);
                }
                int[] iArr = tuhVar.j;
                if (iArr != null && (bxbVar2 = (bxb) bw4Var.c) != null) {
                    bxbVar2.g(iArr);
                }
                Bitmap bitmap2 = tuhVar.m;
                if (bitmap2 != null) {
                    ((hf1) bw4Var.b).c(bitmap2);
                }
                tuhVar.m = null;
                tuhVar.d = null;
                tuhVar.s = null;
                byte[] bArr2 = tuhVar.e;
                if (bArr2 != null && (bxbVar = (bxb) bw4Var.c) != null) {
                    bxbVar.g(bArr2);
                }
                pv8Var.j = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.h3g
    public final Class c() {
        switch (this.b) {
            case 0:
                return jv8.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.h3g
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        return constantState.newDrawable();
    }

    @Override // defpackage.h3g
    public final int getSize() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                pv8 pv8Var = (pv8) ((jv8) drawable).a.b;
                tuh tuhVar = pv8Var.a;
                return (tuhVar.j.length * 4) + tuhVar.d.limit() + tuhVar.i.length + pv8Var.n;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.nv9
    public void initialize() {
        int i = this.b;
        Drawable drawable = this.a;
        switch (i) {
            case 0:
                ((pv8) ((jv8) drawable).a.b).l.prepareToDraw();
                return;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof jv8) {
                        ((pv8) ((jv8) drawable).a.b).l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    private final void a() {
    }
}
