package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import io.sentry.android.core.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class kq2 extends fq8 implements Function2 {
    public static final kq2 f = new fq8(2, l55.class, "openEmail", "openEmail(Landroid/content/Context;Ljava/lang/String;)V", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        String str = (String) obj2;
        context.getClass();
        str.getClass();
        List list = l55.a;
        try {
            Intent intent = new Intent();
            fum.a(intent, str, null, null);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            m0.e("ContextUtils", "No email app found to email: ".concat(str), e);
        } catch (Exception e2) {
            m0.e("ContextUtils", "Failed to open email app for: ".concat(str), e2);
        }
        return Unit.INSTANCE;
    }
}
