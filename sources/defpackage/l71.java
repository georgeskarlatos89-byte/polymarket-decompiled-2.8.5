package defpackage;

import com.polymarket.usviewmodels.BannerResolvedPositionsViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l71 implements eb8 {
    public final /* synthetic */ BannerResolvedPositionsViewModel a;

    public l71(BannerResolvedPositionsViewModel bannerResolvedPositionsViewModel) {
        this.a = bannerResolvedPositionsViewModel;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int intValue = ((Number) obj).intValue();
        BannerResolvedPositionsViewModel bannerResolvedPositionsViewModel = this.a;
        if (intValue != bannerResolvedPositionsViewModel.getCurrentCardIndex()) {
            bannerResolvedPositionsViewModel.sendInput(BannerResolvedPositionsViewModel.Input.INSTANCE.onCardIndexChanged(intValue));
        }
        return Unit.INSTANCE;
    }
}
