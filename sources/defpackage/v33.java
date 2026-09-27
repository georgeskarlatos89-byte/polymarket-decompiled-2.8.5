package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.e;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class v33 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};

    public static final List a(KClass kClass) {
        kClass.getClass();
        Sequence f2 = lwg.f(kClass, ys.h);
        ys ysVar = ys.i;
        f2.getClass();
        return pwg.q(new q78(f2, ysVar, nwg.f));
    }

    public static int b(etf etfVar, gb7 gb7Var, View view, View view2, e eVar, boolean z) {
        if (eVar.v() != 0 && etfVar.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(e.K(view) - e.K(view2)) + 1;
            }
            return Math.min(gb7Var.l(), gb7Var.b(view2) - gb7Var.e(view));
        }
        return 0;
    }

    public static int c(etf etfVar, gb7 gb7Var, View view, View view2, e eVar, boolean z, boolean z2) {
        int max;
        if (eVar.v() == 0 || etfVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(e.K(view), e.K(view2));
        int max2 = Math.max(e.K(view), e.K(view2));
        if (z2) {
            max = Math.max(0, (etfVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(gb7Var.b(view2) - gb7Var.e(view)) / (Math.abs(e.K(view) - e.K(view2)) + 1))) + (gb7Var.k() - gb7Var.e(view)));
    }

    public static int d(etf etfVar, gb7 gb7Var, View view, View view2, e eVar, boolean z) {
        if (eVar.v() != 0 && etfVar.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return etfVar.b();
            }
            return (int) (((gb7Var.b(view2) - gb7Var.e(view)) / (Math.abs(e.K(view) - e.K(view2)) + 1)) * etfVar.b());
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pe7 e(pe7 pe7Var, gp9 gp9Var, hld hldVar, b69 b69Var, q55 q55Var) {
        ef7 ef7Var;
        int i;
        List list;
        int i2;
        boolean z;
        Bitmap b2;
        int size;
        Bitmap bitmap;
        b69 b69Var2;
        pe7 pe7Var2 = pe7Var;
        gp9 gp9Var2 = gp9Var;
        hld hldVar2 = hldVar;
        if (q55Var instanceof ef7) {
            ef7 ef7Var2 = (ef7) q55Var;
            int i3 = ef7Var2.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ef7Var2.s = i3 - Integer.MIN_VALUE;
                ef7Var = ef7Var2;
                Object obj = ef7Var.r;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ef7Var.s;
                if (i == 0) {
                    if (i == 1) {
                        int i4 = ef7Var.q;
                        int i5 = ef7Var.p;
                        List list2 = ef7Var.o;
                        b69Var2 = ef7Var.n;
                        hld hldVar3 = ef7Var.m;
                        gp9 gp9Var3 = ef7Var.l;
                        pe7 pe7Var3 = ef7Var.k;
                        ResultKt.a(obj);
                        xym.g(ef7Var.getContext());
                        size = i4;
                        pe7Var2 = pe7Var3;
                        bitmap = (Bitmap) obj;
                        list = list2;
                        hldVar2 = hldVar3;
                        i2 = i5 + 1;
                        gp9Var2 = gp9Var3;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    list = (List) agl.a(gp9Var2, kp9.a);
                    if (list.isEmpty()) {
                        return pe7Var2;
                    }
                    km9 km9Var = pe7Var2.a;
                    boolean z2 = km9Var instanceof ef1;
                    if (!z2 && !((Boolean) agl.a(gp9Var2, kp9.d)).booleanValue()) {
                        return pe7Var2;
                    }
                    i2 = 0;
                    if (z2) {
                        Bitmap bitmap2 = ((ef1) km9Var).a;
                        Bitmap.Config config = bitmap2.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        if (ArraysKt.i(config, i2k.a)) {
                            b2 = bitmap2;
                            b69Var.getClass();
                            size = list.size();
                            bitmap = b2;
                            b69Var2 = b69Var;
                        }
                    }
                    Drawable a2 = p8m.a(km9Var, hldVar2.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) agl.b(hldVar2, lp9.b);
                    c9h c9hVar = hldVar2.b;
                    qhg qhgVar = hldVar2.c;
                    c9h c9hVar2 = (c9h) agl.b(hldVar2, kp9.b);
                    if (hldVar2.d == b1f.INEXACT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b2 = iyn.b(a2, config2, c9hVar, qhgVar, c9hVar2, z);
                    b69Var.getClass();
                    size = list.size();
                    bitmap = b2;
                    b69Var2 = b69Var;
                }
                if (i2 < size) {
                    b69Var2.getClass();
                    return new pe7(new ef1(bitmap), pe7Var2.b, pe7Var2.c, pe7Var2.d);
                }
                if (list.get(i2) != null) {
                    dmk.p();
                    return null;
                }
                c9h c9hVar3 = hldVar2.b;
                ef7Var.k = pe7Var2;
                ef7Var.l = gp9Var2;
                ef7Var.m = hldVar2;
                ef7Var.n = b69Var2;
                ef7Var.o = list;
                ef7Var.p = i2;
                ef7Var.q = size;
                ef7Var.s = 1;
                throw null;
            }
        }
        ef7Var = new q55(q55Var);
        Object obj2 = ef7Var.r;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ef7Var.s;
        if (i == 0) {
        }
        if (i2 < size) {
        }
    }
}
