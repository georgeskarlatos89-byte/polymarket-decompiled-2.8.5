package defpackage;

import com.polymarket.usviewmodels.FeedModuleViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xlj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FeedModuleViewModel b;

    public /* synthetic */ xlj(FeedModuleViewModel feedModuleViewModel, int i) {
        this.a = i;
        this.b = feedModuleViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FeedModuleViewModel feedModuleViewModel = this.b;
        switch (i) {
            case 0:
                feedModuleViewModel.sendInput(FeedModuleViewModel.Input.onShowMoreTapped);
                return Unit.INSTANCE;
            case 1:
                feedModuleViewModel.sendInput(FeedModuleViewModel.Input.onHeaderTapped);
                return Unit.INSTANCE;
            case 2:
                feedModuleViewModel.sendInput(FeedModuleViewModel.Input.onNearEnd);
                return Unit.INSTANCE;
            default:
                feedModuleViewModel.sendInput(FeedModuleViewModel.Input.onHeaderTapped);
                return Unit.INSTANCE;
        }
    }
}
