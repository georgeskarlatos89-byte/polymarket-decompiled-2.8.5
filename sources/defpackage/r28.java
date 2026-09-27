package defpackage;

import android.content.Context;
import com.stripe.android.financialconnections.FinancialConnectionsSheetKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class r28 {
    public static final Function1 a(p28 p28Var, Context context) {
        context.getClass();
        int i = q28.a[p28Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new f71(context, 2);
            }
            dmk.a();
            return null;
        }
        return FinancialConnectionsSheetKt.intentBuilder(context);
    }
}
