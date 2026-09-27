package defpackage;

import com.polymarket.usviewmodels.USUserActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qsj implements Function0 {
    public final /* synthetic */ USUserActivityViewModel a;
    public final /* synthetic */ USUserActivityViewModel.Activity b;

    public qsj(USUserActivityViewModel uSUserActivityViewModel, USUserActivityViewModel.Activity activity) {
        this.a = uSUserActivityViewModel;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(USUserActivityViewModel.Input.INSTANCE.onActivitySelected(this.b));
        return Unit.INSTANCE;
    }
}
