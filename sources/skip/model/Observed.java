package skip.model;

import defpackage.kvd;
import defpackage.nim;
import defpackage.qqc;
import defpackage.vfd;
import kotlin.Metadata;
import kotlin.Unit;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R:\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u0005¨\u0006\u001c"}, d2 = {"Lskip/model/Observed;", "Value", "Lskip/model/StateTracker;", "wrappedValue", "<init>", "(Ljava/lang/Object;)V", "", "trackState", "()V", "newValue", "_wrappedValue", "Ljava/lang/Object;", "get_wrappedValue", "()Ljava/lang/Object;", "set_wrappedValue", "Lskip/model/StateMutationTransaction;", "lastWriteTransaction", "Lskip/model/StateMutationTransaction;", "Lqqc;", "projectedValue", "Lqqc;", "getProjectedValue", "()Lqqc;", "setProjectedValue", "(Lqqc;)V", "getWrappedValue", "setWrappedValue", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Observed<Value> implements StateTracker {
    private Value _wrappedValue;
    private StateMutationTransaction lastWriteTransaction;
    private qqc projectedValue;

    public Observed(Value value) {
        set_wrappedValue(value);
        StateTracking.INSTANCE.register(this);
    }

    private static final Unit _get__wrappedValue_$lambda$4(Observed observed, Object obj) {
        observed.set_wrappedValue(obj);
        return Unit.INSTANCE;
    }

    private static final Unit _get_projectedValue_$lambda$5(Observed observed, qqc qqcVar) {
        observed.setProjectedValue(qqcVar);
        return Unit.INSTANCE;
    }

    private static final Unit _get_wrappedValue_$lambda$1(Observed observed, Object obj) {
        observed.setWrappedValue(obj);
        return Unit.INSTANCE;
    }

    private static final Unit _get_wrappedValue_$lambda$2(Observed observed, Object obj) {
        observed.setWrappedValue(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(Observed observed, qqc qqcVar) {
        return _get_projectedValue_$lambda$5(observed, qqcVar);
    }

    public static /* synthetic */ Unit b(Observed observed, Object obj) {
        return _get_wrappedValue_$lambda$2(observed, obj);
    }

    public static /* synthetic */ Unit c(Observed observed, Object obj) {
        return _get_wrappedValue_$lambda$1(observed, obj);
    }

    public static /* synthetic */ Unit d(Observed observed, Object obj) {
        return _get__wrappedValue_$lambda$4(observed, obj);
    }

    private final Value get_wrappedValue() {
        return (Value) StructKt.sref(this._wrappedValue, new vfd(this, 2));
    }

    private final void set_wrappedValue(Value value) {
        this._wrappedValue = (Value) StructKt.sref$default(value, null, 1, null);
    }

    public final qqc getProjectedValue() {
        return (qqc) StructKt.sref(this.projectedValue, new vfd(this, 3));
    }

    public final Value getWrappedValue() {
        qqc projectedValue = getProjectedValue();
        if (projectedValue != null) {
            StateMutationTransaction stateMutationTransaction = this.lastWriteTransaction;
            if (stateMutationTransaction != null) {
                StateTracking.INSTANCE.recordRead(stateMutationTransaction);
            }
            return (Value) StructKt.sref(projectedValue.getValue(), new vfd(this, 0));
        }
        return (Value) StructKt.sref(get_wrappedValue(), new vfd(this, 1));
    }

    public final void setProjectedValue(qqc qqcVar) {
        this.projectedValue = (qqc) StructKt.sref$default(qqcVar, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setWrappedValue(Value value) {
        Object sref$default = StructKt.sref$default(value, null, 1, null);
        StateMutationTransaction currentTransaction = StateTracking.INSTANCE.getCurrentTransaction();
        if (currentTransaction != null || this.lastWriteTransaction != null) {
            this.lastWriteTransaction = currentTransaction;
        }
        qqc qqcVar = (qqc) StructKt.sref$default(getProjectedValue(), null, 1, null);
        if (qqcVar != null) {
            qqcVar.setValue(sref$default);
        }
        set_wrappedValue(sref$default);
    }

    @Override // skip.model.StateTracker
    public void trackState() {
        if (getProjectedValue() == null) {
            setProjectedValue(new kvd(get_wrappedValue(), nim.p));
        }
    }
}
