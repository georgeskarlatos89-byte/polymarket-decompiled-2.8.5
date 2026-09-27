package skip.model;

import kotlin.Metadata;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lskip/model/ReferencingCancellable;", "Lskip/model/Cancellable;", "publisher", "Lskip/model/NotificationCenterPublisher;", "cancellable", "<init>", "(Lskip/model/NotificationCenterPublisher;Lskip/model/Cancellable;)V", "cancel", "", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ReferencingCancellable implements Cancellable {
    private final Cancellable cancellable;
    private NotificationCenterPublisher publisher;

    public ReferencingCancellable(NotificationCenterPublisher notificationCenterPublisher, Cancellable cancellable) {
        cancellable.getClass();
        this.publisher = notificationCenterPublisher;
        this.cancellable = (Cancellable) StructKt.sref$default(cancellable, null, 1, null);
    }

    @Override // skip.model.Cancellable
    public void cancel() {
        this.publisher = null;
        this.cancellable.cancel();
    }
}
