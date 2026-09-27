package defpackage;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y4g<T> {
    public final Response a;
    public final Object b;
    public final ResponseBody c;

    public y4g(Response response, Object obj, ResponseBody responseBody) {
        this.a = response;
        this.b = obj;
        this.c = responseBody;
    }

    public static y4g a(NetworkResponse networkResponse) {
        return b(networkResponse, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static y4g b(Object obj, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.getIsSuccessful()) {
            return new y4g(response, obj, null);
        }
        dmk.v("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
