package skip.model;

import kotlin.Metadata;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lskip/model/CapturedRead;", "T", "", "value", "transaction", "Lskip/model/StateMutationTransaction;", "<init>", "(Ljava/lang/Object;Lskip/model/StateMutationTransaction;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTransaction", "()Lskip/model/StateMutationTransaction;", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CapturedRead<T> {
    private final StateMutationTransaction transaction;
    private final T value;

    public CapturedRead(T t, StateMutationTransaction stateMutationTransaction) {
        this.value = (T) StructKt.sref$default(t, null, 1, null);
        this.transaction = stateMutationTransaction;
    }

    public final StateMutationTransaction getTransaction() {
        return this.transaction;
    }

    public final T getValue() {
        return this.value;
    }
}
