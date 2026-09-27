package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Set;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ww4 {
    public static final k70 a = new Object();

    public static final void a(boolean z, wmg wmgVar, kjc kjcVar, Set set, ll9 ll9Var, pq4 pq4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        kjc kjcVar2;
        vmg vmgVar;
        boolean j;
        int i5;
        int i6;
        boolean j2;
        int i7;
        int i8;
        wmgVar.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(931955743);
        if ((i & 6) == 0) {
            if (sr8Var.i(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                j2 = sr8Var.h(wmgVar);
            } else {
                j2 = sr8Var.j(wmgVar);
            }
            if (j2) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (sr8Var.h(kjcVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            if (sr8Var.j(set)) {
                i6 = 2048;
            } else {
                i6 = Barcode.FORMAT_UPC_E;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                j = sr8Var.h(ll9Var);
            } else {
                j = sr8Var.j(ll9Var);
            }
            if (j) {
                i5 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sr8Var.V(i3 & 1, z2)) {
            if (i9 != 0) {
                kjcVar = hjc.a;
            }
            kjcVar2 = kjcVar;
            if (!set.contains(wmgVar.d())) {
                sr8Var.e0(-2038684364);
                xmg i10 = wmgVar.i();
                if (i10 instanceof vmg) {
                    vmgVar = (vmg) i10;
                } else {
                    vmgVar = null;
                }
                if (vmgVar == null) {
                    sr8Var.e0(1225294157);
                } else {
                    sr8Var.e0(-2038684364);
                    vmgVar.m(z, wmgVar, kjcVar2, set, ll9Var, sr8Var, i3 & 65534);
                }
                sr8Var.s(false);
            } else {
                sr8Var.e0(1224721123);
            }
            sr8Var.s(false);
        } else {
            sr8Var.Y();
            kjcVar2 = kjcVar;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new oe(z, wmgVar, kjcVar2, set, ll9Var, i, i2);
        }
    }

    public static final wg7 b(Enum[] enumArr) {
        enumArr.getClass();
        return new wg7(enumArr);
    }

    public static final void c(t9k t9kVar, LayoutNode layoutNode) {
        long Z = layoutNode.G.c.Z(0L);
        int round = Math.round(Float.intBitsToFloat((int) (Z >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (Z & 4294967295L)));
        t9kVar.layout(round, round2, t9kVar.getMeasuredWidth() + round, t9kVar.getMeasuredHeight() + round2);
    }
}
