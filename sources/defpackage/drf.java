package defpackage;

import com.polymarket.usviewmodels.ReceiptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class drf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReceiptViewModel b;

    public /* synthetic */ drf(ReceiptViewModel receiptViewModel, int i) {
        this.a = i;
        this.b = receiptViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(ReceiptViewModel.Input.INSTANCE.getOnDone());
                return Unit.INSTANCE;
            default:
                return this.b.getComboReceiptCard();
        }
    }
}
