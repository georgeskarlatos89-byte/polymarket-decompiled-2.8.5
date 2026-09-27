package defpackage;

import com.polymarket.usviewmodels.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class cmj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedViewModel b;

    public /* synthetic */ cmj(FeedViewModel feedViewModel, int i) {
        this.a = i;
        this.b = feedViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FeedViewModel feedViewModel = this.b;
        switch (i) {
            case 0:
                feedViewModel.openPolymapMiniMap();
                return Unit.INSTANCE;
            case 1:
                feedViewModel.sendInput(FeedViewModel.Input.onRetry);
                return Unit.INSTANCE;
            case 2:
                feedViewModel.sendInput(FeedViewModel.Input.onRetry);
                return Unit.INSTANCE;
            case 3:
                feedViewModel.sendInput(FeedViewModel.Input.onNearBottom);
                return Unit.INSTANCE;
            default:
                feedViewModel.sendInput(FeedViewModel.Input.onPullToRefresh);
                return Unit.INSTANCE;
        }
    }
}
