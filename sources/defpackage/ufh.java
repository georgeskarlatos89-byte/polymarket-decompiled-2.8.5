package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.mlkit.common.MlKitException;
import com.polymarket.designtokens.DesignTokens;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class ufh {
    public static final void a(DesignTokens.Padding padding, pq4 pq4Var, int i, int i2) {
        int i3;
        int ordinal;
        int i4;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(646473356);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (padding == null) {
                ordinal = -1;
            } else {
                ordinal = padding.ordinal();
            }
            if (sr8Var.f(ordinal)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            if (i5 != 0) {
                padding = DesignTokens.Padding.medium;
            }
            wnl.a(sr8Var, b.q(hjc.a, c(padding)));
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new sfh(padding, i, i2, 1);
        }
    }

    public static final void b(DesignTokens.Padding padding, pq4 pq4Var, int i, int i2) {
        int i3;
        int ordinal;
        int i4;
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(665403358);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (padding == null) {
                ordinal = -1;
            } else {
                ordinal = padding.ordinal();
            }
            if (sr8Var.f(ordinal)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i3 & 1, z)) {
            if (i5 != 0) {
                padding = DesignTokens.Padding.medium;
            }
            wnl.a(sr8Var, b.e(hjc.a, c(padding)));
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new sfh(padding, i, i2, 0);
        }
    }

    public static final float c(DesignTokens.Padding padding) {
        padding.getClass();
        switch (tfh.a[padding.ordinal()]) {
            case 1:
                return 0.0f;
            case 2:
                return 2.0f;
            case 3:
                return 4.0f;
            case 4:
                return 6.0f;
            case 5:
                return 8.0f;
            case 6:
                return 10.0f;
            case 7:
                return 12.0f;
            case 8:
                return 16.0f;
            case 9:
                return 20.0f;
            case 10:
                return 24.0f;
            case 11:
                return 32.0f;
            case 12:
                return 40.0f;
            case 13:
                return 48.0f;
            case 14:
                return 56.0f;
            case 15:
                return 64.0f;
            case 16:
                return 72.0f;
            case 17:
                return 80.0f;
            case MlKitException.UNSUPPORTED /* 18 */:
                return 96.0f;
            default:
                dmk.a();
                return 0.0f;
        }
    }

    public static final float d(DesignTokens.Radius radius) {
        radius.getClass();
        switch (tfh.c[radius.ordinal()]) {
            case 1:
                return 0.0f;
            case 2:
                return 8.0f;
            case 3:
                return 12.0f;
            case 4:
                return 16.0f;
            case 5:
                return 20.0f;
            case 6:
                return 24.0f;
            default:
                dmk.a();
                return 0.0f;
        }
    }

    public static final float e(DesignTokens.Size size) {
        size.getClass();
        switch (tfh.b[size.ordinal()]) {
            case 1:
                return 6.0f;
            case 2:
                return 8.0f;
            case 3:
                return 10.0f;
            case 4:
                return 12.0f;
            case 5:
                return 16.0f;
            case 6:
                return 20.0f;
            case 7:
                return 24.0f;
            case 8:
                return 32.0f;
            case 9:
                return 40.0f;
            case 10:
                return 48.0f;
            case 11:
                return 56.0f;
            case 12:
                return 64.0f;
            case 13:
                return 72.0f;
            case 14:
                return 80.0f;
            case 15:
                return 96.0f;
            case 16:
                return 114.0f;
            case 17:
                return 130.0f;
            case MlKitException.UNSUPPORTED /* 18 */:
                return 160.0f;
            default:
                dmk.a();
                return 0.0f;
        }
    }
}
