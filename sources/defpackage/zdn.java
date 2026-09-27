package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zdn {
    public static final void a(String str, e0 e0Var, kjc kjcVar, xxi xxiVar, u6b u6bVar, pq4 pq4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        kjc kjcVar2;
        u6b u6bVar2;
        int i5;
        kjc kjcVar3;
        str.getClass();
        e0Var.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-94693229);
        if (sr8Var.h(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (sr8Var.h(e0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if (sr8Var.h(xxiVar)) {
            i4 = 2048;
        } else {
            i4 = Barcode.FORMAT_UPC_E;
        }
        int i8 = i7 | i4 | 8192;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i8 & 1, z)) {
            sr8Var.a0();
            if ((i & 1) != 0 && !sr8Var.D()) {
                sr8Var.Y();
                i5 = i8 & (-57345);
                kjcVar3 = kjcVar;
                u6bVar2 = u6bVar;
            } else {
                u6bVar2 = cen.e(sr8Var);
                i5 = i8 & (-57345);
                kjcVar3 = hjc.a;
            }
            sr8Var.t();
            eb0 eb0Var = new eb0();
            eb0Var.j(xxiVar.a);
            ib0.c(eb0Var, str, e0Var, u6bVar2);
            eb0Var.e();
            hen.a(eb0Var.k(), kjcVar3, xxiVar, sr8Var, (i5 >> 3) & 1008);
            kjcVar2 = kjcVar3;
        } else {
            sr8Var.Y();
            kjcVar2 = kjcVar;
            u6bVar2 = u6bVar;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new nu0(str, e0Var, kjcVar2, xxiVar, u6bVar2, i, 7);
        }
    }

    public static sb0 b(ec0 ec0Var, xl8 xl8Var) {
        Object obj;
        xl8Var.getClass();
        Iterator it = ec0Var.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((sb0) obj).b(), xl8Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (sb0) obj;
    }

    public static boolean c(ec0 ec0Var, xl8 xl8Var) {
        xl8Var.getClass();
        if (ec0Var.A0(xl8Var) != null) {
            return true;
        }
        return false;
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            dmk.s(sv6.n("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        dmk.s("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
