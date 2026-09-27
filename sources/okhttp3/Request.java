package okhttp3;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.dmk;
import defpackage.f27;
import defpackage.hm6;
import defpackage.k84;
import defpackage.lvf;
import defpackage.py2;
import defpackage.sv6;
import defpackage.vzm;
import io.ably.lib.http.HttpConstants;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.e;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00015B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u000bJ\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010\u001e\u001a\u00020\u000bJ\u001e\u0010 \u001a\u0004\u0018\u0001H!\"\n\b\u0000\u0010!\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\"\u0010#J%\u0010 \u001a\u0004\u0018\u0001H!\"\b\b\u0000\u0010!*\u00020\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H!0%¢\u0006\u0002\u0010&J\b\u0010 \u001a\u0004\u0018\u00010\u0001J#\u0010 \u001a\u0004\u0018\u0001H!\"\u0004\b\u0000\u0010!2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H!0'¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b,J\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b-J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b.J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b/J\r\u0010*\u001a\u00020\u0019H\u0007¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u000bH\u0016J\u0012\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u001bH\u0007J\f\u00104\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0011\u0010*\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00066"}, d2 = {"Lokhttp3/Request;", "", "builder", "Lokhttp3/Request$Builder;", "<init>", "(Lokhttp3/Request$Builder;)V", "url", "Lokhttp3/HttpUrl;", "headers", "Lokhttp3/Headers;", "method", "", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "()Lokhttp3/HttpUrl;", "()Ljava/lang/String;", "()Lokhttp3/Headers;", "()Lokhttp3/RequestBody;", "cacheUrlOverride", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lokhttp3/CacheControl;", "isHttps", "", "()Z", "header", Keys.KEY_NAME, "", "tag", "T", "reifiedTag", "()Ljava/lang/Object;", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "cacheControl", "()Lokhttp3/CacheControl;", "-deprecated_url", "-deprecated_method", "-deprecated_headers", "-deprecated_body", "-deprecated_cacheControl", "toString", "toCurl", "includeBody", "shellEscape", "Builder", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Request {
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public Request(Builder builder) {
        builder.getClass();
        HttpUrl url = builder.getUrl();
        if (url != null) {
            this.url = url;
            this.method = builder.getMethod();
            this.headers = builder.getHeaders().build();
            this.body = builder.getBody();
            this.cacheUrlOverride = builder.getCacheUrlOverride();
            this.tags = builder.getTags();
            return;
        }
        dmk.n("url == null");
        throw null;
    }

    private final String shellEscape(String str) {
        return "'" + e.s(str, "'", "'\\''") + '\'';
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return request.toCurl(z);
    }

    @hm6
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @hm6
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m1014deprecated_cacheControl() {
        return cacheControl();
    }

    @hm6
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @hm6
    /* renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @hm6
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.INSTANCE.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    /* renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    /* renamed from: getTags$okhttp, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    public final String header(String name) {
        name.getClass();
        return this.headers.get(name);
    }

    public final List<String> headers(String name) {
        name.getClass();
        return this.headers.values(name);
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final <T> T reifiedTag() {
        Intrinsics.h();
        throw null;
    }

    public final <T> T tag(KClass<T> type) {
        type.getClass();
        return (T) vzm.m(type).cast(this.tags.get(type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [tp1, java.lang.Object, kq1, jq1] */
    public final String toCurl(boolean includeBody) {
        String str;
        String str2;
        RequestBody requestBody;
        MediaType mediaType;
        StringBuilder sb = new StringBuilder("curl " + shellEscape(this.url.getUrl()));
        RequestBody requestBody2 = this.body;
        if (requestBody2 != null && (mediaType = requestBody2.get$contentType()) != null) {
            str = mediaType.toString();
        } else {
            str = null;
        }
        if (includeBody && this.body != null) {
            str2 = HttpConstants.Methods.POST;
        } else {
            str2 = HttpConstants.Methods.GET;
        }
        if (!Intrinsics.areEqual(this.method, str2)) {
            sb.append(" \\\n  -X " + shellEscape(this.method));
        }
        Iterator<Pair<? extends String, ? extends String>> it = this.headers.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            String str3 = (String) next.first;
            String str4 = (String) next.second;
            if (str == null || !e.o(str3, "Content-Type", true)) {
                sb.append(" \\\n  -H " + shellEscape(ace.m(str3, ": ", str4)));
            }
        }
        if (str != null) {
            sb.append(" \\\n  -H " + shellEscape("Content-Type: ".concat(str)));
        }
        if (includeBody && (requestBody = this.body) != 0) {
            ?? obj = new Object();
            requestBody.writeTo(obj);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(obj, 0L, 1, null)) {
                sb.append(" \\\n  --data " + shellEscape(obj.R()));
            } else {
                sb.append(" \\\n  --data-binary " + shellEscape(obj.k0(obj.b).e()));
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.first;
                String str2 = (String) pair2.second;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!Intrinsics.areEqual(this.tags, EmptyTags.INSTANCE)) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        return sb.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0016J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0000H\u0016J\b\u00103\u001a\u00020\u0000H\u0016J\u0010\u00104\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u0010\u00106\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u00107\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u00108\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u00109\u001a\u00020\u0000\"\n\b\u0000\u0010:\u0018\u0001*\u00020\u00012\b\u00109\u001a\u0004\u0018\u0001H:H\u0087\b¢\u0006\u0004\b;\u0010<J-\u00109\u001a\u00020\u0000\"\b\b\u0000\u0010:*\u00020\u00012\f\u0010=\u001a\b\u0012\u0004\u0012\u0002H:0>2\b\u00109\u001a\u0004\u0018\u0001H:¢\u0006\u0002\u0010?J\u0012\u00109\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0016J-\u00109\u001a\u00020\u0000\"\u0004\b\u0000\u0010:2\u000e\u0010=\u001a\n\u0012\u0006\b\u0000\u0012\u0002H:0@2\b\u00109\u001a\u0004\u0018\u0001H:H\u0016¢\u0006\u0002\u0010AJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0006\u0010B\u001a\u00020\u0000J\b\u0010C\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006D"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "method", "", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "body", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "cacheUrlOverride", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V", "canonicalUrl", "Ljava/net/URL;", "header", Keys.KEY_NAME, "value", "addHeader", "removeHeader", "Lokhttp3/Headers;", "cacheControl", "Lokhttp3/CacheControl;", "get", "head", "post", "delete", "put", "patch", "query", "tag", "T", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "gzip", "build", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static class Builder {
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;

        public Builder(Request request) {
            request.getClass();
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        private final String canonicalUrl(String url) {
            if (e.u(url, "ws:", true)) {
                return "http:".concat(url.substring(3));
            }
            if (e.u(url, "wss:", true)) {
                return "https:".concat(url.substring(4));
            }
            return url;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = RequestBody.EMPTY;
                }
                return builder.delete(requestBody);
            }
            py2.f("Super calls with default arguments not supported in this target, function: delete");
            return null;
        }

        public Builder addHeader(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder cacheControl(CacheControl cacheControl) {
            cacheControl.getClass();
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public final Builder cacheUrlOverride(HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method(HttpConstants.Methods.GET, null);
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* renamed from: getTags$okhttp, reason: from getter */
        public final Tags getTags() {
            return this.tags;
        }

        /* renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody != null) {
                String str = this.headers.get("Content-Encoding");
                if (str == null) {
                    this.headers.add("Content-Encoding", "gzip");
                    this.body = new GzipRequestBody(requestBody);
                    return this;
                }
                f27.k(k84.g("Content-Encoding already set: ", str));
                return null;
            }
            dmk.n("cannot gzip a request that has no body");
            return null;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String method, RequestBody body) {
            method.getClass();
            if (method.length() > 0) {
                if (body == null) {
                    if (HttpMethod.requiresRequestBody(method)) {
                        f27.q(sv6.n("method ", method, " must have a request body."));
                        return null;
                    }
                } else if (!HttpMethod.permitsRequestBody(method)) {
                    f27.q(sv6.n("method ", method, " must not have a request body."));
                    return null;
                }
                this.method = method;
                this.body = body;
                return this;
            }
            dmk.v("method.isEmpty() == true");
            return null;
        }

        public Builder patch(RequestBody body) {
            body.getClass();
            return method(HttpConstants.Methods.PATCH, body);
        }

        public Builder post(RequestBody body) {
            body.getClass();
            return method(HttpConstants.Methods.POST, body);
        }

        public Builder put(RequestBody body) {
            body.getClass();
            return method(HttpConstants.Methods.PUT, body);
        }

        public Builder query(RequestBody body) {
            body.getClass();
            return method("QUERY", body);
        }

        public final <T> Builder reifiedTag(T tag) {
            Intrinsics.h();
            throw null;
        }

        public Builder removeHeader(String name) {
            name.getClass();
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            str.getClass();
            this.method = str;
        }

        public final void setTags$okhttp(Tags tags) {
            tags.getClass();
            this.tags = tags;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object tag) {
            return tag((KClass<KClass>) lvf.a.getOrCreateKotlinClass(Object.class), (KClass) tag);
        }

        public Builder url(URL url) {
            url.getClass();
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String url2 = url.toString();
            url2.getClass();
            return url(companion.get(url2));
        }

        public Builder delete(RequestBody body) {
            return method(HttpConstants.Methods.DELETE, body);
        }

        public final <T> Builder tag(KClass<T> type, T tag) {
            type.getClass();
            this.tags = this.tags.plus(type, tag);
            return this;
        }

        public <T> Builder tag(Class<? super T> type, T tag) {
            type.getClass();
            return tag((KClass<KClass<T>>) vzm.p(type), (KClass<T>) tag);
        }

        public Builder url(String url) {
            url.getClass();
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        public Builder url(HttpUrl url) {
            url.getClass();
            this.url = url;
            return this;
        }

        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = HttpConstants.Methods.GET;
            this.headers = new Headers.Builder();
        }
    }

    public final Headers headers() {
        return this.headers;
    }

    public final <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(vzm.p(type));
    }

    public final Object tag() {
        return tag(lvf.a.getOrCreateKotlinClass(Object.class));
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i & 2) != 0 ? Headers.INSTANCE.of(new String[0]) : headers, (i & 4) != 0 ? WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR : str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody) {
        this(r2.method(str, requestBody));
        httpUrl.getClass();
        headers.getClass();
        str.getClass();
        Builder headers2 = new Builder().url(httpUrl).headers(headers);
        if (Intrinsics.areEqual(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (requestBody != null) {
                str = HttpConstants.Methods.POST;
            } else {
                str = HttpConstants.Methods.GET;
            }
        }
    }

    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }
}
