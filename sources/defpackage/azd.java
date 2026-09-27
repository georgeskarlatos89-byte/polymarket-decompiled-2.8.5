package defpackage;

import android.content.Context;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class azd extends Lambda implements Function1 {
    public final /* synthetic */ cs1 h;
    public final /* synthetic */ es1 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azd(cs1 cs1Var, es1 es1Var, int i, String str) {
        super(1);
        this.h = cs1Var;
        this.i = es1Var;
        this.j = i;
        this.k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        PayButton payButton = new PayButton(context, null);
        ButtonOptions buttonOptions = new ButtonOptions();
        buttonOptions.b = this.h.a();
        buttonOptions.a = this.i.a();
        buttonOptions.c = this.j;
        buttonOptions.e = true;
        buttonOptions.d = this.k;
        payButton.a(buttonOptions);
        return payButton;
    }
}
