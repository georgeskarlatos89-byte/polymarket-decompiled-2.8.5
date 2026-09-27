package defpackage;

import com.polymarket.usviewmodels.ChatUserProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sx3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatUserProfileViewModel b;

    public /* synthetic */ sx3(ChatUserProfileViewModel chatUserProfileViewModel, int i) {
        this.a = i;
        this.b = chatUserProfileViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.sendInput(ChatUserProfileViewModel.Input.INSTANCE.getOnRetry());
                return Unit.INSTANCE;
            default:
                this.b.refreshAfterTrade();
                return Unit.INSTANCE;
        }
    }
}
