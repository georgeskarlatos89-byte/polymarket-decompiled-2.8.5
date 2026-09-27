package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kf1 implements rx5 {
    public static final lb4 c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public kf1() {
        this.a = 0;
        this.b = new i31(29);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ux5, java.lang.Object] */
    @Override // defpackage.rx5
    public final ux5 a(qeh qehVar, hld hldVar) {
        ImageDecoder.Source b;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new Object();
            default:
                Bitmap.Config b2 = lp9.b(hldVar);
                if ((b2 != Bitmap.Config.ARGB_8888 && b2 != Bitmap.Config.HARDWARE) || (b = jpl.b(qehVar.a, hldVar)) == null) {
                    return null;
                }
                return new sxh(b, qehVar.a, hldVar, (vug) obj);
        }
    }

    public kf1(vug vugVar) {
        this.a = 1;
        this.b = vugVar;
    }
}
