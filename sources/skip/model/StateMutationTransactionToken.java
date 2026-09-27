package skip.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0015\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lskip/model/StateMutationTransactionToken;", "", "previous", "Lskip/model/StateMutationTransaction;", "<init>", "(Lskip/model/StateMutationTransaction;)V", "getPrevious$SkipModel", "()Lskip/model/StateMutationTransaction;", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StateMutationTransactionToken {
    private final StateMutationTransaction previous;

    public /* synthetic */ StateMutationTransactionToken(StateMutationTransaction stateMutationTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateMutationTransaction);
    }

    /* renamed from: getPrevious$SkipModel, reason: from getter */
    public final StateMutationTransaction getPrevious() {
        return this.previous;
    }

    public StateMutationTransactionToken(StateMutationTransaction stateMutationTransaction) {
        this.previous = stateMutationTransaction;
    }
}
