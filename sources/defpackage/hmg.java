package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hmg implements Function1 {
    public final /* synthetic */ USEventCardViewModel a;

    public hmg(USEventCardViewModel uSEventCardViewModel) {
        this.a = uSEventCardViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((hw6) obj).getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        USEventCardViewModel.Input onVisibilityChanged = USEventCardViewModel.Input.INSTANCE.onVisibilityChanged(true, uuid);
        USEventCardViewModel uSEventCardViewModel = this.a;
        uSEventCardViewModel.sendInput(onVisibilityChanged);
        return new p72(uSEventCardViewModel, uuid, 1);
    }
}
