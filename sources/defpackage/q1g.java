package defpackage;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q1g {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    public q1g(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.newBuilder();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.g = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(k84.g("Malformed content type: ", str2), e);
            }
        } else {
            Headers.Builder builder = this.f;
            if (z) {
                builder.addUnsafeNonAscii(str, str2);
            } else {
                builder.add(str, str2);
            }
        }
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            HttpUrl.Builder newBuilder = httpUrl.newBuilder(str3);
            this.d = newBuilder;
            if (newBuilder != null) {
                this.c = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                ahh.n(sb, ", Relative: ", this.c);
                return;
            }
        }
        HttpUrl.Builder builder = this.d;
        if (z) {
            builder.addEncodedQueryParameter(str, str2);
        } else {
            builder.addQueryParameter(str, str2);
        }
    }
}
