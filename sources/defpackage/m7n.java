package defpackage;

import com.polymarket.android.R;
import com.stripe.android.model.LinkBrand;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class m7n {
    public static final hok d(xok xokVar) {
        xokVar.getClass();
        return new hok(xokVar.a, xokVar.t);
    }

    public static final int e(LinkBrand linkBrand, mfb mfbVar) {
        linkBrand.getClass();
        mfbVar.getClass();
        int i = nfb.b[linkBrand.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = nfb.a[mfbVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return R.drawable.stripe_onelink_logo_knockout_white;
                            }
                            dmk.a();
                            return 0;
                        }
                        return R.drawable.stripe_onelink_logo_knockout_black;
                    }
                    return R.drawable.stripe_onelink_logo_knockout;
                }
                return R.drawable.stripe_onelink_logo;
            }
            dmk.a();
            return 0;
        }
        int i3 = nfb.a[mfbVar.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return R.drawable.stripe_link_logo_knockout_white;
                    }
                    dmk.a();
                    return 0;
                }
                return R.drawable.stripe_link_logo_knockout_black;
            }
            return R.drawable.stripe_link_logo_knockout;
        }
        return R.drawable.stripe_link_logo;
    }

    public abstract boolean a(f5 f5Var, b5 b5Var, b5 b5Var2);

    public abstract boolean b(f5 f5Var, Object obj, Object obj2);

    public abstract boolean c(f5 f5Var, e5 e5Var, e5 e5Var2);

    public abstract void f(e5 e5Var, e5 e5Var2);

    public abstract void g(e5 e5Var, Thread thread);
}
