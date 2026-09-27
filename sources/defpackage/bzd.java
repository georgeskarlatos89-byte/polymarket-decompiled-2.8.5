package defpackage;

import com.google.android.gms.wallet.button.PayButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bzd extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bzd(Function0 function0, int i) {
        super(1);
        this.h = i;
        this.i = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        Function0 function0 = this.i;
        switch (i) {
            case 0:
                PayButton payButton = (PayButton) obj;
                payButton.getClass();
                payButton.setAlpha(1.0f);
                payButton.setEnabled(true);
                payButton.setOnClickListener(new k8(function0, 4));
                return Unit.INSTANCE;
            default:
                function0.invoke();
                return Unit.INSTANCE;
        }
    }
}
