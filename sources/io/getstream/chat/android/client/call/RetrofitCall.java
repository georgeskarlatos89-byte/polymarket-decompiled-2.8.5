package io.getstream.chat.android.client.call;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.a85;
import defpackage.bv2;
import defpackage.coc;
import defpackage.cv2;
import defpackage.f27;
import defpackage.go3;
import defpackage.gq6;
import defpackage.j6g;
import defpackage.k6g;
import defpackage.knn;
import defpackage.ks3;
import defpackage.lca;
import defpackage.lv6;
import defpackage.m67;
import defpackage.mx7;
import defpackage.qh7;
import defpackage.qsn;
import defpackage.rv3;
import defpackage.s5g;
import defpackage.sh7;
import defpackage.t85;
import defpackage.u85;
import defpackage.w5g;
import defpackage.whn;
import defpackage.xym;
import defpackage.y4g;
import defpackage.zu2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\f*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lio/getstream/chat/android/client/call/RetrofitCall;", "", "T", "Lcv2;", "Lbv2;", "call", "Lks3;", "parser", "Lt85;", "scope", "<init>", "(Lbv2;Lks3;Lt85;)V", "Lw5g;", Keys.KEY_SOCURE_RESULT, "Lzu2;", "callback", "", "notifyResult", "(Lw5g;Lzu2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toFailedResult", "(Ljava/lang/Throwable;)Lw5g;", "Lsh7;", "toFailedError", "(Ljava/lang/Throwable;)Lsh7;", "getResult", "(Lbv2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly4g;", "(Ly4g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "execute", "()Lw5g;", "enqueue", "(Lzu2;)V", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbv2;", "Lks3;", "callScope", "Lt85;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RetrofitCall<T> implements cv2 {
    private final bv2<T> call;
    private final t85 callScope;
    private final ks3 parser;

    public RetrofitCall(bv2<T> bv2Var, ks3 ks3Var, t85 t85Var) {
        bv2Var.getClass();
        ks3Var.getClass();
        t85Var.getClass();
        this.call = bv2Var;
        this.parser = ks3Var;
        this.callScope = qsn.i(t85Var, new lca(xym.h(t85Var.getCoroutineContext())));
    }

    public static final /* synthetic */ bv2 access$getCall$p(RetrofitCall retrofitCall) {
        return retrofitCall.call;
    }

    public static final /* synthetic */ t85 access$getCallScope$p(RetrofitCall retrofitCall) {
        return retrofitCall.callScope;
    }

    public static final /* synthetic */ ks3 access$getParser$p(RetrofitCall retrofitCall) {
        return retrofitCall.parser;
    }

    public static final /* synthetic */ Object access$getResult(RetrofitCall retrofitCall, bv2 bv2Var, Continuation continuation) {
        return retrofitCall.getResult(bv2Var, (Continuation<? super w5g>) continuation);
    }

    public static final /* synthetic */ Object access$notifyResult(RetrofitCall retrofitCall, w5g w5gVar, zu2 zu2Var, Continuation continuation) {
        return retrofitCall.notifyResult(w5gVar, zu2Var, continuation);
    }

    public static final /* synthetic */ w5g access$toFailedResult(RetrofitCall retrofitCall, Throwable th) {
        return retrofitCall.toFailedResult(th);
    }

    private final Object getResult(y4g<T> y4gVar, Continuation<? super w5g> continuation) {
        return coc.d(this.callScope.getCoroutineContext(), new mx7(y4gVar, this, null, 24), continuation);
    }

    private final Object notifyResult(w5g w5gVar, zu2 zu2Var, Continuation<? super Unit> continuation) {
        Object d = coc.d(lv6.a, new a85(zu2Var, w5gVar, null, 4), continuation);
        if (d == u85.COROUTINE_SUSPENDED) {
            return d;
        }
        return Unit.INSTANCE;
    }

    private final sh7 toFailedError(Throwable th) {
        if (th instanceof rv3) {
            rv3 rv3Var = (rv3) th;
            return new qh7(String.valueOf(th.getMessage()), rv3Var.a, rv3Var.b, th.getCause());
        }
        return knn.a(go3.NETWORK_FAILED, 0, th, 2);
    }

    private final w5g toFailedResult(Throwable th) {
        return new s5g(toFailedError(th));
    }

    @Override // defpackage.cv2
    public Object await(Continuation<? super w5g> continuation) {
        return m67.H(new gq6(this, null, 16), continuation);
    }

    @Override // defpackage.cv2
    public void cancel() {
        this.call.cancel();
        xym.f(this.callScope.getCoroutineContext());
    }

    @Override // defpackage.cv2
    public void enqueue(zu2 callback) {
        callback.getClass();
        coc.c(this.callScope, null, null, new k6g(this, callback, null, 0), 3);
    }

    @Override // defpackage.cv2
    public w5g execute() {
        return (w5g) whn.b(g.a, new j6g(this, null, 1));
    }

    public static final /* synthetic */ Object access$getResult(RetrofitCall retrofitCall, y4g y4gVar, Continuation continuation) {
        return retrofitCall.getResult(y4gVar, (Continuation<? super w5g>) continuation);
    }

    @Override // defpackage.cv2
    public void enqueue() {
        enqueue(new f27(26));
    }

    private final Object getResult(bv2<T> bv2Var, Continuation<? super w5g> continuation) {
        return coc.d(this.callScope.getCoroutineContext(), new k6g(this, bv2Var, null, 1), continuation);
    }
}
