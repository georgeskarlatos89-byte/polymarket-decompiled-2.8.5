package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.a;
import com.polymarket.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class xun {
    public static final void a(kjc kjcVar, pq4 pq4Var, int i) {
        int i2;
        boolean z;
        sr8 sr8Var;
        int i3;
        kjcVar.getClass();
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-499228189);
        if ((i & 6) == 0) {
            if (sr8Var2.h(kjcVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var2.V(i2 & 1, z)) {
            sr8Var = sr8Var2;
            mwi.b(pql.g(sr8Var2, R.string.stripe_wallet_default), a.a(kjcVar, "default_payment_method_label"), ((h6i) sr8Var2.l(k9i.c)).g, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, xxi.b(((hjj) sr8Var2.l(njj.b)).l, 0L, 0L, qi8.h, null, 0L, 0L, null, null, 0, 0L, null, null, 16777211), sr8Var, 0, 3120, 55288);
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new t10(kjcVar, i, 8);
        }
    }

    public static final il9 b(int i) {
        return new il9(i, CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }

    public static final uxh c(String str) {
        str.getClass();
        return new uxh(str, CollectionsKt.emptyList());
    }

    public static final d3g d(d3g d3gVar) {
        if (d3gVar == null) {
            return c("");
        }
        return d3gVar;
    }

    public static final il9 e(int i, Object[] objArr, List list) {
        list.getClass();
        return new il9(i, list, ArraysKt.e0(objArr));
    }

    public static /* synthetic */ il9 f(int i, Object[] objArr) {
        return e(i, objArr, CollectionsKt.emptyList());
    }

    public static final Object[] g(Context context, List list) {
        context.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
        for (Object obj : list2) {
            if (obj instanceof d3g) {
                obj = ((d3g) obj).M(context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }
}
