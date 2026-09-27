package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.polymarket.data.APIUSNotification;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ f71(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                URI uri = (URI) obj;
                uri.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                vkj.b(context, uri2);
                return Unit.INSTANCE;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                Throwable cause = th.getCause();
                if (cause == null) {
                    cause = th;
                }
                String concat = "StreamChat.".concat(cause.getClass().getSimpleName());
                jw jwVar = new jw(context);
                List listOf = CollectionsKt.listOf("chat", concat);
                Map v = hdi.v("error.category", "chat");
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                jwVar.captureErrorEvent(concat, "error", listOf, v, hdi.v("error.message", message));
                return Unit.INSTANCE;
            case 2:
                a48 a48Var = (a48) obj;
                a48Var.getClass();
                int i2 = FinancialConnectionsSheetLiteActivity.d;
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetLiteActivity.class);
                intent.addFlags(65536);
                intent.putExtra("FinancialConnectionsSheetActivityArgs", a48Var);
                return intent;
            case 3:
                URI uri3 = (URI) obj;
                uri3.getClass();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType(ApiConstant.TEXT_PLAIN_MEDIA_TYPE);
                intent2.putExtra("android.intent.extra.TEXT", uri3.toString());
                context.startActivity(Intent.createChooser(intent2, null));
                return Unit.INSTANCE;
            case 4:
                String uri4 = ((URI) obj).toString();
                uri4.getClass();
                vkj.b(context, uri4);
                return Unit.INSTANCE;
            case 5:
                hbd.a((APIUSNotification) obj, context);
                return Unit.INSTANCE;
            case 6:
                URI uri5 = (URI) obj;
                uri5.getClass();
                String uri6 = uri5.toString();
                uri6.getClass();
                l55.d(context, uri6);
                return Unit.INSTANCE;
            case 7:
                URI uri7 = (URI) obj;
                uri7.getClass();
                String uri8 = uri7.toString();
                uri8.getClass();
                l55.d(context, uri8);
                return Unit.INSTANCE;
            case 8:
                String uri9 = ((URI) obj).toString();
                uri9.getClass();
                vkj.b(context, uri9);
                return Unit.INSTANCE;
            case 9:
                hbd.a((APIUSNotification) obj, context);
                return Unit.INSTANCE;
            case 10:
                pzc b = iin.b(context);
                b.j((Bundle) obj);
                return b;
            case 11:
                URI uri10 = (URI) obj;
                uri10.getClass();
                String uri11 = uri10.toString();
                uri11.getClass();
                l55.d(context, uri11);
                return Unit.INSTANCE;
            case 12:
                URI uri12 = (URI) obj;
                uri12.getClass();
                String uri13 = uri12.toString();
                uri13.getClass();
                vkj.b(context, uri13);
                return Unit.INSTANCE;
            case 13:
                URI uri14 = (URI) obj;
                uri14.getClass();
                String uri15 = uri14.toString();
                uri15.getClass();
                vkj.b(context, uri15);
                return Unit.INSTANCE;
            case 14:
                URI uri16 = (URI) obj;
                uri16.getClass();
                String uri17 = uri16.toString();
                uri17.getClass();
                vkj.b(context, uri17);
                return Unit.INSTANCE;
            case 15:
                String uri18 = ((URI) obj).toString();
                uri18.getClass();
                vkj.b(context, uri18);
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                str.getClass();
                l55.d(context, str);
                return Unit.INSTANCE;
        }
    }
}
