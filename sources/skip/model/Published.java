package skip.model;

import defpackage.ihf;
import defpackage.ikl;
import defpackage.qqc;
import kotlin.Metadata;
import kotlin.Unit;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\nj\u0002`\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR:\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005R!\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\nj\u0002`\u000b0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lskip/model/Published;", "Value", "Lskip/model/StateTracker;", "wrappedValue", "<init>", "(Ljava/lang/Object;)V", "", "trackState", "()V", "Lskip/model/PropertySubject;", "", "Lskip/lib/Never;", "subject", "Lskip/model/PropertySubject;", "Lqqc;", "newValue", "state", "Lqqc;", "getState", "()Lqqc;", "setState", "(Lqqc;)V", "Lskip/model/StateMutationTransaction;", "lastWriteTransaction", "Lskip/model/StateMutationTransaction;", "getWrappedValue", "()Ljava/lang/Object;", "setWrappedValue", "Lskip/model/Publisher;", "getProjectedValue", "()Lskip/model/Publisher;", "projectedValue", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Published<Value> implements StateTracker {
    private StateMutationTransaction lastWriteTransaction;
    private qqc state;
    private final PropertySubject subject;

    public Published(Value value) {
        this.subject = new PropertySubject(value);
        StateTracking.INSTANCE.register(this);
    }

    private static final Unit _get_state_$lambda$0(Published published, qqc qqcVar) {
        published.setState(qqcVar);
        return Unit.INSTANCE;
    }

    private static final Unit _get_wrappedValue_$lambda$2(Published published, Object obj) {
        published.setWrappedValue(obj);
        return Unit.INSTANCE;
    }

    private static final Unit _get_wrappedValue_$lambda$3(Published published, Object obj) {
        published.setWrappedValue(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(Published published, qqc qqcVar) {
        return _get_state_$lambda$0(published, qqcVar);
    }

    public static /* synthetic */ Unit b(Published published, Object obj) {
        return _get_wrappedValue_$lambda$3(published, obj);
    }

    public static /* synthetic */ Unit c(Published published, Object obj) {
        return _get_wrappedValue_$lambda$2(published, obj);
    }

    private final qqc getState() {
        return (qqc) StructKt.sref(this.state, new ihf(this, 0));
    }

    private final void setState(qqc qqcVar) {
        this.state = (qqc) StructKt.sref$default(qqcVar, null, 1, null);
    }

    public final Publisher getProjectedValue() {
        return this.subject;
    }

    public final Value getWrappedValue() {
        qqc state = getState();
        if (state != null) {
            StateMutationTransaction stateMutationTransaction = this.lastWriteTransaction;
            if (stateMutationTransaction != null) {
                StateTracking.INSTANCE.recordRead(stateMutationTransaction);
            }
            return (Value) StructKt.sref(state.getValue(), new ihf(this, 1));
        }
        return (Value) StructKt.sref(this.subject.getCurrent$SkipModel(), new ihf(this, 2));
    }

    public final void setWrappedValue(Value value) {
        Object sref$default = StructKt.sref$default(value, null, 1, null);
        StateMutationTransaction currentTransaction = StateTracking.INSTANCE.getCurrentTransaction();
        if (currentTransaction != null || this.lastWriteTransaction != null) {
            this.lastWriteTransaction = currentTransaction;
        }
        this.subject.send(sref$default);
        qqc state = getState();
        if (state != null) {
            state.setValue(sref$default);
        }
    }

    @Override // skip.model.StateTracker
    public void trackState() {
        if (getState() == null) {
            setState(ikl.c(this.subject.getCurrent$SkipModel()));
        }
    }
}
