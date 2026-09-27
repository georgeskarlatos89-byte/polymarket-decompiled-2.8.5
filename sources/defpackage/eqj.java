package defpackage;

import com.polymarket.usviewmodels.USGameLineSectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eqj implements Function0 {
    public final /* synthetic */ USGameLineSectionViewModel a;

    public eqj(USGameLineSectionViewModel uSGameLineSectionViewModel) {
        this.a = uSGameLineSectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(USGameLineSectionViewModel.Input.INSTANCE.getOnToggleRowsExpanded());
        return Unit.INSTANCE;
    }
}
