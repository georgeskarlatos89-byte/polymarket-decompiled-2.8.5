package defpackage;

import com.polymarket.usviewmodels.USGameLineSectionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cqj implements Function1 {
    public final /* synthetic */ USGameLineSectionViewModel a;

    public cqj(USGameLineSectionViewModel uSGameLineSectionViewModel) {
        this.a = uSGameLineSectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.sendInput(USGameLineSectionViewModel.Input.INSTANCE.onAlternativeLineSelected(((Number) obj).intValue()));
        return Unit.INSTANCE;
    }
}
