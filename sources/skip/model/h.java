package skip.model;

import kotlin.jvm.functions.Function1;
import skip.foundation.Notification;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenterPublisher b;

    public /* synthetic */ h(NotificationCenterPublisher notificationCenterPublisher, int i) {
        this.a = i;
        this.b = notificationCenterPublisher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        NotificationCenterPublisher notificationCenterPublisher = this.b;
        switch (i) {
            case 0:
                return NotificationCenterKt.a(notificationCenterPublisher, (Notification) obj);
            default:
                return NotificationCenterPublisher.b(notificationCenterPublisher, obj);
        }
    }
}
