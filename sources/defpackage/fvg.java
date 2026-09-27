package defpackage;

import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.wallet.BuildConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fvg {
    public final rz9 a;

    public fvg(rz9 rz9Var) {
        this.a = rz9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Events events, q55 q55Var) {
        wwk wwkVar;
        int i;
        Response response;
        if (q55Var instanceof wwk) {
            wwkVar = (wwk) q55Var;
            int i2 = wwkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wwkVar.m = i2 - Integer.MIN_VALUE;
                wwk wwkVar2 = wwkVar;
                Object obj = wwkVar2.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wwkVar2.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    wwkVar2.m = 1;
                    obj = this.a.a.a("application/json", str, BuildConfig.SERVICE_NAME, BuildConfig.PRODUCT_VERSION, events, wwkVar2);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                response = ((y4g) obj).a;
                if (!response.getIsSuccessful()) {
                    return new tz9(Unit.INSTANCE);
                }
                int code = response.code();
                String message = response.message();
                message.getClass();
                return new sz9(code, message);
            }
        }
        wwkVar = new wwk(this, q55Var);
        wwk wwkVar22 = wwkVar;
        Object obj2 = wwkVar22.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wwkVar22.m;
        if (i == 0) {
        }
        response = ((y4g) obj2).a;
        if (!response.getIsSuccessful()) {
        }
    }
}
