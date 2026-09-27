package defpackage;

import com.polymarket.usviewmodels.USLiveTabViewModel;
import java.net.URI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class xlb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USLiveTabViewModel b;

    public /* synthetic */ xlb(USLiveTabViewModel uSLiveTabViewModel, int i) {
        this.a = i;
        this.b = uSLiveTabViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        USLiveTabViewModel uSLiveTabViewModel = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                USLiveTabViewModel.Input.Companion companion = USLiveTabViewModel.Input.INSTANCE;
                URI create = URI.create(str);
                create.getClass();
                uSLiveTabViewModel.sendInput(companion.onOpenURL(create));
                return Unit.INSTANCE;
            case 1:
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.onSectionSelected(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            default:
                String str2 = (String) obj;
                str2.getClass();
                uSLiveTabViewModel.sendInput(USLiveTabViewModel.Input.INSTANCE.onSubtagToggled(str2));
                return Unit.INSTANCE;
        }
    }
}
