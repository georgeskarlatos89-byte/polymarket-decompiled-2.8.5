package defpackage;

import com.polymarket.usviewmodels.WireDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class wmk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WireDetailsViewModel b;

    public /* synthetic */ wmk(WireDetailsViewModel wireDetailsViewModel, int i) {
        this.a = i;
        this.b = wireDetailsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(WireDetailsViewModel.Input.INSTANCE.getOnContactSupport());
                return Unit.INSTANCE;
            case 1:
                this.b.sendInput(WireDetailsViewModel.Input.INSTANCE.getOnCompleted());
                return Unit.INSTANCE;
            default:
                this.b.sendInput(WireDetailsViewModel.Input.INSTANCE.getOnCopyAll());
                return Unit.INSTANCE;
        }
    }
}
