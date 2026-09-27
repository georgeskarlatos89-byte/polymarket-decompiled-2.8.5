package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bgn {
    public static final void a(hs0 hs0Var, kjc kjcVar, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(1258453288);
        if ((i & 6) == 0) {
            if (sr8Var.j(hs0Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sr8Var.h(kjcVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i2 & 1, z)) {
            String str = hs0Var.b;
            if (str == null) {
                str = "";
            }
            zd9.b(pql.f(R.string.stripe_au_becs_mandate, new Object[]{str}, sr8Var), kjcVar, null, ((h6i) sr8Var.l(k9i.c)).e, ((hjj) sr8Var.l(njj.b)).j, false, null, 0, null, sr8Var, i2 & 112, 484);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new jb0(hs0Var, kjcVar, i, 1);
        }
    }

    public static boolean b(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }
}
