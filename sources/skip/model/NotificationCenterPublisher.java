package skip.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import skip.foundation.Notification;
import skip.foundation.NotificationCenter;
import skip.foundation.Scheduler;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0017H\u0016J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0002H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lskip/model/NotificationCenterPublisher;", "Lskip/model/Publisher;", "Lskip/foundation/Notification;", "", "Lskip/lib/Never;", "center", "Lskip/foundation/NotificationCenter;", "<init>", "(Lskip/foundation/NotificationCenter;)V", "helper", "Lskip/model/SubjectHelper;", "newValue", "", "observer", "getObserver$SkipModel", "()Ljava/lang/Object;", "setObserver$SkipModel", "(Ljava/lang/Object;)V", "finalize", "", "sink", "Lskip/model/AnyCancellable;", "receiveValue", "Lkotlin/Function1;", "send", "notification", "send$SkipModel", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationCenterPublisher implements Publisher {
    private final NotificationCenter center;
    private final SubjectHelper helper;
    private Object observer;

    public NotificationCenterPublisher(NotificationCenter notificationCenter) {
        notificationCenter.getClass();
        this.helper = new SubjectHelper();
        this.center = notificationCenter;
    }

    private static final Unit _get_observer_$lambda$0(NotificationCenterPublisher notificationCenterPublisher, Object obj) {
        notificationCenterPublisher.setObserver$SkipModel(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(NotificationCenterPublisher notificationCenterPublisher, Object obj) {
        return _get_observer_$lambda$0(notificationCenterPublisher, obj);
    }

    @Override // skip.model.Publisher
    public <Root> AnyCancellable assign(Function2<? super Root, ? super Notification, Unit> function2, Root root) {
        return super.assign(function2, root);
    }

    @Override // skip.model.Publisher
    public <P> Publisher combineLatest(Publisher publisher) {
        return super.combineLatest(publisher);
    }

    @Override // skip.model.Publisher
    public <P0, P1> Publisher combineLatest3(Publisher publisher, Publisher publisher2) {
        return super.combineLatest3(publisher, publisher2);
    }

    @Override // skip.model.Publisher
    public <P0, P1, P2> Publisher combineLatest4(Publisher publisher, Publisher publisher2, Publisher publisher3) {
        return super.combineLatest4(publisher, publisher2, publisher3);
    }

    @Override // skip.model.Publisher
    public Publisher debounce(double d, Scheduler scheduler) {
        return super.debounce(d, scheduler);
    }

    @Override // skip.model.Publisher
    public Publisher dropFirst(int i) {
        return super.dropFirst(i);
    }

    @Override // skip.model.Publisher
    public AnyPublisher eraseToAnyPublisher() {
        return super.eraseToAnyPublisher();
    }

    @Override // skip.model.Publisher
    public Publisher filter(Function1<? super Notification, Boolean> function1) {
        return super.filter(function1);
    }

    public final void finalize() {
        Object sref$default = StructKt.sref$default(getObserver$SkipModel(), null, 1, null);
        if (sref$default != null) {
            this.center.removeObserver(sref$default);
        }
    }

    public final Object getObserver$SkipModel() {
        return StructKt.sref(this.observer, new h(this, 1));
    }

    @Override // skip.model.Publisher
    public <T> Publisher map(Function1<? super Notification, ? extends T> function1) {
        return super.map(function1);
    }

    @Override // skip.model.Publisher
    public Publisher receive(Scheduler scheduler) {
        return super.receive(scheduler);
    }

    public final void send$SkipModel(Notification notification) {
        notification.getClass();
        this.helper.send(notification);
    }

    public final void setObserver$SkipModel(Object obj) {
        this.observer = StructKt.sref$default(obj, null, 1, null);
    }

    @Override // skip.model.Publisher
    public AnyCancellable sink(Function1<? super Notification, Unit> receiveValue) {
        receiveValue.getClass();
        return new AnyCancellable(new ReferencingCancellable(this, this.helper.sink(receiveValue)));
    }
}
