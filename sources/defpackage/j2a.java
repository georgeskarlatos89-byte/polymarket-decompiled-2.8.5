package defpackage;

import com.polymarket.usviewmodels.IntegrityCheckViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntegrityCheckViewModel b;

    public /* synthetic */ j2a(IntegrityCheckViewModel integrityCheckViewModel, int i) {
        this.a = i;
        this.b = integrityCheckViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        IntegrityCheckViewModel integrityCheckViewModel = this.b;
        switch (i) {
            case 0:
                integrityCheckViewModel.sendInput(IntegrityCheckViewModel.Input.onUpdateApp);
                return Unit.INSTANCE;
            default:
                integrityCheckViewModel.sendInput(IntegrityCheckViewModel.Input.onUpdateApp);
                return Unit.INSTANCE;
        }
    }
}
