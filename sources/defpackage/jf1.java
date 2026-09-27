package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jf1 implements mbj {
    public abstract Bitmap transform(hf1 hf1Var, Bitmap bitmap, int i, int i2);

    @Override // defpackage.mbj
    public final h3g transform(Context context, h3g h3gVar, int i, int i2) {
        if (o1k.k(i, i2)) {
            hf1 hf1Var = a.a(context).a;
            Bitmap bitmap = (Bitmap) h3gVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap transform = transform(hf1Var, bitmap, i, i2);
            if (bitmap.equals(transform)) {
                return h3gVar;
            }
            return if1.a(hf1Var, transform);
        }
        dmk.v(m51.j(i, "Cannot apply transformation on width: ", i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        return null;
    }
}
