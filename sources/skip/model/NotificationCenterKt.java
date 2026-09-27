package skip.model;

import kotlin.Metadata;
import kotlin.Unit;
import skip.foundation.Notification;
import skip.foundation.NotificationCenter;
import skip.foundation.OperationQueue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a.\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"publisher", "Lskip/model/Publisher;", "Lskip/foundation/Notification;", "", "Lskip/lib/Never;", "Lskip/foundation/NotificationCenter;", "for_", "Lskip/foundation/Notification$Name;", "object_", "", "SkipModel"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationCenterKt {
    public static /* synthetic */ Unit a(NotificationCenterPublisher notificationCenterPublisher, Notification notification) {
        return publisher$lambda$0(notificationCenterPublisher, notification);
    }

    public static final Publisher publisher(NotificationCenter notificationCenter, Notification.Name name, Object obj) {
        notificationCenter.getClass();
        name.getClass();
        NotificationCenterPublisher notificationCenterPublisher = new NotificationCenterPublisher(notificationCenter);
        notificationCenterPublisher.setObserver$SkipModel(notificationCenter.addObserver(name, obj, (OperationQueue) null, new h(notificationCenterPublisher, 0)));
        return notificationCenterPublisher;
    }

    public static /* synthetic */ Publisher publisher$default(NotificationCenter notificationCenter, Notification.Name name, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return publisher(notificationCenter, name, obj);
    }

    private static final Unit publisher$lambda$0(NotificationCenterPublisher notificationCenterPublisher, Notification notification) {
        notification.getClass();
        notificationCenterPublisher.send$SkipModel(notification);
        return Unit.INSTANCE;
    }
}
