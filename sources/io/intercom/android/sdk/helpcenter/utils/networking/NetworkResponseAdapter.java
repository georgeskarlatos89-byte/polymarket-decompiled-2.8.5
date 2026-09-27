package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.bv2;
import defpackage.ev2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00040\u0003B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseAdapter;", "", "S", "Lev2;", "Lbv2;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Ljava/lang/reflect/Type;", "successType", "Lkotlin/Function1;", "", "", "onClientError", "<init>", "(Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function1;)V", "responseType", "()Ljava/lang/reflect/Type;", "call", "adapt", "(Lbv2;)Lbv2;", "Ljava/lang/reflect/Type;", "Lkotlin/jvm/functions/Function1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkResponseAdapter<S> implements ev2 {
    public static final int $stable = 8;
    private final Function1<Throwable, Unit> onClientError;
    private final Type successType;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseAdapter(Type type, Function1<? super Throwable, Unit> function1) {
        type.getClass();
        function1.getClass();
        this.successType = type;
        this.onClientError = function1;
    }

    @Override // defpackage.ev2
    public bv2<NetworkResponse<S>> adapt(bv2<S> call) {
        call.getClass();
        return new NetworkResponseCall(call, this.onClientError);
    }

    @Override // defpackage.ev2
    /* renamed from: responseType, reason: from getter */
    public Type getSuccessType() {
        return this.successType;
    }

    @Override // defpackage.ev2
    public /* bridge */ /* synthetic */ Object adapt(bv2 bv2Var) {
        return adapt(bv2Var);
    }
}
