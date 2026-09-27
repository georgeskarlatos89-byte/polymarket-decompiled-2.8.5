package io.intercom.android.sdk.helpcenter.utils.networking;

import defpackage.b3j;
import defpackage.bv2;
import defpackage.k84;
import defpackage.uv2;
import defpackage.y4g;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "", "S", "Lbv2;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "delegate", "Lkotlin/Function1;", "", "", "onClientError", "<init>", "(Lbv2;Lkotlin/jvm/functions/Function1;)V", "Luv2;", "callback", "enqueue", "(Luv2;)V", "", "isExecuted", "()Z", "kotlin.jvm.PlatformType", "clone", "()Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponseCall;", "isCanceled", "cancel", "()V", "Ly4g;", "execute", "()Ly4g;", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lb3j;", "timeout", "()Lb3j;", "Lbv2;", "Lkotlin/jvm/functions/Function1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkResponseCall<S> implements bv2<NetworkResponse<? extends S>> {
    public static final int $stable = 8;
    private final bv2<S> delegate;
    private final Function1<Throwable, Unit> onClientError;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkResponseCall(bv2<S> bv2Var, Function1<? super Throwable, Unit> function1) {
        bv2Var.getClass();
        function1.getClass();
        this.delegate = bv2Var;
        this.onClientError = function1;
    }

    public static final /* synthetic */ Function1 access$getOnClientError$p(NetworkResponseCall networkResponseCall) {
        return networkResponseCall.onClientError;
    }

    @Override // defpackage.bv2
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // defpackage.bv2
    public NetworkResponseCall<S> clone() {
        bv2 clone = this.delegate.clone();
        clone.getClass();
        return new NetworkResponseCall<>(clone, this.onClientError);
    }

    @Override // defpackage.bv2
    public void enqueue(final uv2 callback) {
        callback.getClass();
        this.delegate.enqueue(new uv2() { // from class: io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseCall$enqueue$1
            @Override // defpackage.uv2
            public void onFailure(bv2<S> call, Throwable throwable) {
                NetworkResponse clientError;
                call.getClass();
                throwable.getClass();
                if (throwable instanceof IOException) {
                    clientError = new NetworkResponse.NetworkError((IOException) throwable);
                } else {
                    NetworkResponseCall.access$getOnClientError$p(this).invoke(new Exception(k84.g("Client error on ", call.request().url().encodedPath()), throwable));
                    clientError = new NetworkResponse.ClientError(throwable);
                }
                uv2.this.onResponse(this, y4g.a(clientError));
            }

            @Override // defpackage.uv2
            public void onResponse(bv2<S> call, y4g<S> response) {
                call.getClass();
                response.getClass();
                Object obj = response.b;
                Response response2 = response.a;
                int code = response2.code();
                boolean isSuccessful = response2.getIsSuccessful();
                uv2 uv2Var = uv2.this;
                if (isSuccessful) {
                    bv2 bv2Var = this;
                    if (obj != null) {
                        uv2Var.onResponse(bv2Var, y4g.a(new NetworkResponse.Success(obj)));
                        return;
                    } else {
                        uv2Var.onResponse(bv2Var, y4g.a(new NetworkResponse.ClientError(new Throwable())));
                        return;
                    }
                }
                uv2Var.onResponse(this, y4g.a(new NetworkResponse.ServerError(code)));
            }
        });
    }

    public y4g<NetworkResponse<S>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // defpackage.bv2
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // defpackage.bv2
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // defpackage.bv2
    public Request request() {
        Request request = this.delegate.request();
        request.getClass();
        return request;
    }

    @Override // defpackage.bv2
    public b3j timeout() {
        b3j timeout = this.delegate.timeout();
        timeout.getClass();
        return timeout;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m58clone() {
        return clone();
    }

    @Override // defpackage.bv2
    public /* bridge */ /* synthetic */ bv2 clone() {
        return clone();
    }
}
