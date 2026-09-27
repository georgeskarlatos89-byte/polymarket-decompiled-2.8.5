package skip.model;

import defpackage.ikl;
import defpackage.qqc;
import defpackage.rqc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003RB\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\t2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\t8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0016R>\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lskip/model/MutableStateBacking;", "Lskip/model/StateTracker;", "<init>", "()V", "", "stateAt", "", "initialize", "(I)V", "", "Lskip/model/StateMutationTransaction;", "ensureLedger", "()Ljava/util/List;", "access", "update", "trackState", "Lqqc;", "newValue", "state", "Ljava/util/List;", "getState", "setState", "(Ljava/util/List;)V", "lastWriteTransactions", "getLastWriteTransactions", "setLastWriteTransactions", "", "isTracking", "Z", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutableStateBacking implements StateTracker {
    private boolean isTracking;
    private List<StateMutationTransaction> lastWriteTransactions;
    private List<qqc> state = new ArrayList();

    public MutableStateBacking() {
        StateTracking.INSTANCE.register(this);
    }

    private static final Unit _get_lastWriteTransactions_$lambda$1(MutableStateBacking mutableStateBacking, List list) {
        mutableStateBacking.setLastWriteTransactions(list);
        return Unit.INSTANCE;
    }

    private static final Unit _get_state_$lambda$0(MutableStateBacking mutableStateBacking, List list) {
        list.getClass();
        mutableStateBacking.setState(list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(MutableStateBacking mutableStateBacking, List list) {
        return _get_state_$lambda$0(mutableStateBacking, list);
    }

    public static /* synthetic */ Unit b(MutableStateBacking mutableStateBacking, List list) {
        return _get_lastWriteTransactions_$lambda$1(mutableStateBacking, list);
    }

    private final List<StateMutationTransaction> ensureLedger() {
        List list = (List) StructKt.sref$default(getLastWriteTransactions(), null, 1, null);
        if (list != null) {
            return (List) StructKt.sref$default(list, null, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        setLastWriteTransactions(arrayList);
        return (List) StructKt.sref$default(arrayList, null, 1, null);
    }

    private final List<StateMutationTransaction> getLastWriteTransactions() {
        return (List) StructKt.sref(this.lastWriteTransactions, new rqc(this, 1));
    }

    private final List<qqc> getState() {
        return (List) StructKt.sref(this.state, new rqc(this, 0));
    }

    private final void initialize(int stateAt) {
        while (getState().size() <= stateAt) {
            getState().add(ikl.c(0));
        }
    }

    private final void setLastWriteTransactions(List<StateMutationTransaction> list) {
        this.lastWriteTransactions = (List) StructKt.sref$default(list, null, 1, null);
    }

    private final void setState(List<qqc> list) {
        this.state = (List) StructKt.sref$default(list, null, 1, null);
    }

    public final void access(int stateAt) {
        StateMutationTransaction stateMutationTransaction;
        synchronized (this) {
            try {
                initialize(stateAt);
                List list = (List) StructKt.sref$default(getLastWriteTransactions(), null, 1, null);
                if (list != null && stateAt < list.size() && (stateMutationTransaction = (StateMutationTransaction) StructKt.sref$default(list.get(stateAt), null, 1, null)) != null) {
                    StateTracking.INSTANCE.recordRead(stateMutationTransaction);
                }
                ((Number) StructKt.sref$default(getState().get(stateAt).getValue(), null, 1, null)).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // skip.model.StateTracker
    public void trackState() {
        synchronized (this) {
            this.isTracking = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x0027, B:10:0x002b, B:15:0x0015, B:16:0x0019, B:18:0x001f, B:20:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(int stateAt) {
        synchronized (this) {
            try {
                initialize(stateAt);
                StateMutationTransaction currentTransaction = StateTracking.INSTANCE.getCurrentTransaction();
                if (currentTransaction == null) {
                    if (getLastWriteTransactions() != null) {
                    }
                    if (this.isTracking) {
                        qqc qqcVar = getState().get(stateAt);
                        qqcVar.setValue(Integer.valueOf(((Number) qqcVar.getValue()).intValue() + 1));
                    }
                }
                List<StateMutationTransaction> ensureLedger = ensureLedger();
                while (ensureLedger.size() <= stateAt) {
                    ensureLedger.add(null);
                }
                ensureLedger.set(stateAt, currentTransaction);
                if (this.isTracking) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
