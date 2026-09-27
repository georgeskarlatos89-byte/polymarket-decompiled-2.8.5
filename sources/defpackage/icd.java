package defpackage;

import com.polymarket.usviewmodels.NotificationsFeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class icd implements Function0 {
    public final /* synthetic */ NotificationsFeedViewModel a;
    public final /* synthetic */ NotificationsFeedViewModel.Notification b;

    public icd(NotificationsFeedViewModel notificationsFeedViewModel, NotificationsFeedViewModel.Notification notification) {
        this.a = notificationsFeedViewModel;
        this.b = notification;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(NotificationsFeedViewModel.Input.INSTANCE.onNotificationSelected(this.b));
        return Unit.INSTANCE;
    }
}
