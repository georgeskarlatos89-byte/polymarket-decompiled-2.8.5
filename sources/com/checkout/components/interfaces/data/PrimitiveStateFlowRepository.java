package com.checkout.components.interfaces.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.n0n;
import defpackage.sqc;
import defpackage.swh;
import defpackage.tkl;
import defpackage.uwh;
import defpackage.z5f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\b\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "T", "", "default", "<init>", "(Ljava/lang/Object;)V", "value", "", "update", "Lkotlin/Function1;", "function", "(Lkotlin/jvm/functions/Function1;)V", "Lsqc;", "_flow", "Lsqc;", "Lswh;", Keys.KEY_FLOW, "Lswh;", "getFlow", "()Lswh;", "Companion", "z5f", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PrimitiveStateFlowRepository<T> {
    public static final int $stable = 8;
    public static final z5f Companion = new Object();
    private final sqc _flow;
    private final swh flow;

    public PrimitiveStateFlowRepository(T t) {
        uwh a = n0n.a(t);
        this._flow = a;
        this.flow = tkl.b(a);
    }

    public final swh getFlow() {
        return this.flow;
    }

    public final void update(Function1<? super T, ? extends T> function) {
        uwh uwhVar;
        Object value;
        function.getClass();
        sqc sqcVar = this._flow;
        do {
            uwhVar = (uwh) sqcVar;
            value = uwhVar.getValue();
        } while (!uwhVar.k(value, function.invoke(value)));
    }

    public final void update(T value) {
        uwh uwhVar;
        sqc sqcVar = this._flow;
        do {
            uwhVar = (uwh) sqcVar;
        } while (!uwhVar.k(uwhVar.getValue(), value));
    }
}
