package skip.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import skip.foundation.Scheduler;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lskip/model/ObservableObjectPublisher;", "Lskip/model/Publisher;", "", "", "Lskip/lib/Never;", "<init>", "()V", "helper", "Lskip/model/SubjectHelper;", "sink", "Lskip/model/AnyCancellable;", "receiveValue", "Lkotlin/Function1;", "send", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ObservableObjectPublisher implements Publisher {
    private final SubjectHelper helper = new SubjectHelper();

    @Override // skip.model.Publisher
    public <Root> AnyCancellable assign(Function2<? super Root, ? super Unit, Unit> function2, Root root) {
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
    public Publisher filter(Function1<? super Unit, Boolean> function1) {
        return super.filter(function1);
    }

    @Override // skip.model.Publisher
    public <T> Publisher map(Function1<? super Unit, ? extends T> function1) {
        return super.map(function1);
    }

    @Override // skip.model.Publisher
    public Publisher receive(Scheduler scheduler) {
        return super.receive(scheduler);
    }

    public final void send() {
        this.helper.send(Unit.INSTANCE);
    }

    @Override // skip.model.Publisher
    public AnyCancellable sink(Function1<? super Unit, Unit> receiveValue) {
        receiveValue.getClass();
        return this.helper.sink(receiveValue);
    }
}
