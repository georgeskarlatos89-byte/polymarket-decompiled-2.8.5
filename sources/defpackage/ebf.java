package defpackage;

import com.polymarket.data.EPromoBannerTemplate;
import com.polymarket.usviewmodels.PromoBannerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ebf implements Function0 {
    public final /* synthetic */ PromoBannerViewModel a;
    public final /* synthetic */ EPromoBannerTemplate b;

    public ebf(PromoBannerViewModel promoBannerViewModel, EPromoBannerTemplate ePromoBannerTemplate) {
        this.a = promoBannerViewModel;
        this.b = ePromoBannerTemplate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(PromoBannerViewModel.Input.INSTANCE.onAction(this.b));
        return Unit.INSTANCE;
    }
}
