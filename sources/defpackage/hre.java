package defpackage;

import com.polymarket.usviewmodels.USPlayerPropRowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hre implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USPlayerPropRowViewModel b;

    public /* synthetic */ hre(USPlayerPropRowViewModel uSPlayerPropRowViewModel, int i) {
        this.a = i;
        this.b = uSPlayerPropRowViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        USPlayerPropRowViewModel uSPlayerPropRowViewModel = this.b;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                uSPlayerPropRowViewModel.sendInput(USPlayerPropRowViewModel.Input.INSTANCE.onMarkerSelected(intValue));
                return Unit.INSTANCE;
            default:
                uSPlayerPropRowViewModel.sendInput(USPlayerPropRowViewModel.Input.INSTANCE.onMarkerSelected(intValue));
                return Unit.INSTANCE;
        }
    }
}
