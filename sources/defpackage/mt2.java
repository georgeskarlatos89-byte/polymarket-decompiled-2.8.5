package defpackage;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import io.ably.lib.http.HttpConstants;
import kotlin.text.e;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class mt2 {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if ((!"Warning".equalsIgnoreCase(name) || !e.u(value, ModuleRequestExtKt.CAPTURE_DELTA, false)) && ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || "Content-Type".equalsIgnoreCase(name) || !b(name) || headers2.get(name) == null)) {
                builder.addUnsafeNonAscii(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String name2 = headers2.name(i2);
            if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !"Content-Type".equalsIgnoreCase(name2) && b(name2)) {
                builder.addUnsafeNonAscii(name2, headers2.value(i2));
            }
        }
        return builder.build();
    }

    public static boolean b(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !HttpConstants.Headers.PROXY_AUTHENTICATE.equalsIgnoreCase(str) && !HttpConstants.Headers.PROXY_AUTHORIZATION.equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
