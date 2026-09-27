package okhttp3.internal.http;

import io.ably.lib.http.HttpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "invalidatesCache", "", "method", "", "requiresRequestBody", "permitsRequestBody", "redirectsWithBody", "redirectsToGet", "isCacheable", "requestMethod", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean invalidatesCache(String method) {
        method.getClass();
        if (!Intrinsics.areEqual(method, HttpConstants.Methods.POST) && !Intrinsics.areEqual(method, HttpConstants.Methods.PATCH) && !Intrinsics.areEqual(method, HttpConstants.Methods.PUT) && !Intrinsics.areEqual(method, HttpConstants.Methods.DELETE) && !Intrinsics.areEqual(method, "MOVE")) {
            return false;
        }
        return true;
    }

    public static final boolean permitsRequestBody(String method) {
        method.getClass();
        if (!Intrinsics.areEqual(method, HttpConstants.Methods.GET) && !Intrinsics.areEqual(method, "HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String method) {
        method.getClass();
        if (!Intrinsics.areEqual(method, HttpConstants.Methods.POST) && !Intrinsics.areEqual(method, HttpConstants.Methods.PUT) && !Intrinsics.areEqual(method, HttpConstants.Methods.PATCH) && !Intrinsics.areEqual(method, "PROPPATCH") && !Intrinsics.areEqual(method, "QUERY") && !Intrinsics.areEqual(method, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean isCacheable(String requestMethod) {
        requestMethod.getClass();
        if (!Intrinsics.areEqual(requestMethod, HttpConstants.Methods.GET) && !Intrinsics.areEqual(requestMethod, "QUERY")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String method) {
        method.getClass();
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        method.getClass();
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
