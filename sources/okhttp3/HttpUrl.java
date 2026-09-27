package okhttp3;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.dmk;
import defpackage.dsn;
import defpackage.f27;
import defpackage.fd7;
import defpackage.fi9;
import defpackage.hm6;
import defpackage.ix2;
import defpackage.k84;
import defpackage.lnf;
import defpackage.qp7;
import defpackage.r2i;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.e;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 K2\u00020\u0001:\u0002JKBc\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\b\u001aJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bJ\u0010\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010*\u001a\u00020\bJ\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u000201J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u0003J\u0013\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u0004\u0018\u00010\u0003J\r\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0002\b7J\r\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0002\b8J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b9J\r\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b:J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b;J\r\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0002\b<J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b=J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\r\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0002\b@J\r\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0002\bAJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bBJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bCJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bDJ\u000f\u0010!\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bEJ\r\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0007¢\u0006\u0002\bGJ\u000f\u0010,\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bHJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bIR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&8G¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b,\u0010\u0010¨\u0006L"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Ljava/util/List;", "isHttps", "", "()Z", "toUrl", "Ljava/net/URL;", "toUri", "Ljava/net/URI;", "uri", "encodedUsername", "encodedPassword", "pathSize", "encodedPath", "encodedPathSegments", "encodedQuery", "query", "querySize", "queryParameter", Keys.KEY_NAME, "queryParameterNames", "", "()Ljava/util/Set;", "queryParameterValues", "queryParameterName", "index", "queryParameterValue", "encodedFragment", "redact", "resolve", ActionType.LINK, "newBuilder", "Lokhttp3/HttpUrl$Builder;", "equals", "other", "hashCode", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_pathSegments", "-deprecated_encodedQuery", "-deprecated_query", "-deprecated_querySize", "-deprecated_queryParameterNames", "-deprecated_encodedFragment", "-deprecated_fragment", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fragment;
    private final String host;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    private HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    @hm6
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m946deprecated_encodedFragment() {
        return encodedFragment();
    }

    @hm6
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m947deprecated_encodedPassword() {
        return encodedPassword();
    }

    @hm6
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m948deprecated_encodedPath() {
        return encodedPath();
    }

    @hm6
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m949deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @hm6
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m950deprecated_encodedQuery() {
        return encodedQuery();
    }

    @hm6
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m951deprecated_encodedUsername() {
        return encodedUsername();
    }

    @hm6
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @hm6
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @hm6
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @hm6
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m955deprecated_pathSegments() {
        return this.pathSegments;
    }

    @hm6
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m956deprecated_pathSize() {
        return pathSize();
    }

    @hm6
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @hm6
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m958deprecated_query() {
        return query();
    }

    @hm6
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m959deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @hm6
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m960deprecated_querySize() {
        return querySize();
    }

    @hm6
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @hm6
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m962deprecated_uri() {
        return uri();
    }

    @hm6
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m963deprecated_url() {
        return url();
    }

    @hm6
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(StringsKt.Q(this.url, '#', 0, 6) + 1);
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        return this.url.substring(StringsKt.Q(this.url, ':', this.scheme.length() + 3, 4) + 1, StringsKt.Q(this.url, '@', 0, 6));
    }

    public final String encodedPath() {
        int Q = StringsKt.Q(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        return this.url.substring(Q, _UtilCommonKt.delimiterOffset(str, "?#", Q, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int Q = StringsKt.Q(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", Q, str.length());
        ArrayList arrayList = new ArrayList();
        while (Q < delimiterOffset) {
            int i = Q + 1;
            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i, delimiterOffset);
            arrayList.add(this.url.substring(i, delimiterOffset2));
            Q = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int Q = StringsKt.Q(this.url, '?', 0, 6) + 1;
        String str = this.url;
        return this.url.substring(Q, _UtilCommonKt.delimiterOffset(str, '#', Q, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object other) {
        if ((other instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) other).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return Intrinsics.areEqual(this.scheme, "https");
    }

    public final Builder newBuilder() {
        int i;
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        if (this.port != INSTANCE.defaultPort(this.scheme)) {
            i = this.port;
        } else {
            i = -1;
        }
        builder.setPort$okhttp(i);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.access$toQueryString(INSTANCE, this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        name.getClass();
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            a j = lnf.j(2, lnf.k(0, list.size()));
            int i = j.a;
            int i2 = j.b;
            int i3 = j.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(i))) {
                    if (i != i2) {
                        i += i3;
                    } else {
                        return null;
                    }
                }
                return this.queryNamesAndValues.get(i + 1);
            }
            return null;
        }
        return null;
    }

    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(index * 2);
            str.getClass();
            return str;
        }
        qp7.f();
        return null;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return fd7.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        a j = lnf.j(2, lnf.k(0, this.queryNamesAndValues.size()));
        int i = j.a;
        int i2 = j.b;
        int i3 = j.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                str.getClass();
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        qp7.f();
        return null;
    }

    public final List<String> queryParameterValues(String name) {
        name.getClass();
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        a j = lnf.j(2, lnf.k(0, this.queryNamesAndValues.size()));
        int i = j.a;
        int i2 = j.b;
        int i3 = j.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        newBuilder.getClass();
        return newBuilder.username("").password("").build().getUrl();
    }

    public final HttpUrl resolve(String link) {
        link.getClass();
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                qp7.n(e);
                return null;
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            qp7.n(e);
            return null;
        }
    }

    public final String username() {
        return this.username;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\b\u001a\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002J\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0007¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0007H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0013H\u0007¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0014H\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0016J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0017J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0002\b\u0016J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0002\b\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "defaultPort", "", "scheme", "", "toQueryString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toHttpUrl", "Lokhttp3/HttpUrl;", "get", "toHttpUrlOrNull", "parse", "Ljava/net/URL;", "Ljava/net/URI;", "url", "-deprecated_get", "-deprecated_parse", "uri", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ void access$toQueryString(Companion companion, List list, StringBuilder sb) {
            companion.toQueryString(list, sb);
        }

        private final void toQueryString(List<String> list, StringBuilder sb) {
            a j = lnf.j(2, lnf.k(0, list.size()));
            int i = j.a;
            int i2 = j.b;
            int i3 = j.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        @hm6
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m965deprecated_get(String url) {
            url.getClass();
            return get(url);
        }

        @hm6
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m968deprecated_parse(String url) {
            url.getClass();
            return parse(url);
        }

        public final int defaultPort(String scheme) {
            scheme.getClass();
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            if (Intrinsics.areEqual(scheme, "https")) {
                return Defaults.TLS_PORT;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @hm6
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m967deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @hm6
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m966deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        public final HttpUrl get(URL url) {
            url.getClass();
            String url2 = url.toString();
            url2.getClass();
            return parse(url2);
        }

        public final HttpUrl get(URI uri) {
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            return parse(uri2);
        }
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, list, list2, str5, str6);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0014J\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0005J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0005J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0005J\u0018\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005J\u0018\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0005J\u0018\u0010<\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0005J\u000e\u0010>\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0005J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0005H\u0002J\u0010\u0010C\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010\u0005J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0005J\r\u0010D\u001a\u00020\u0000H\u0000¢\u0006\u0002\bEJ\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u00020\u0014H\u0002J\b\u0010I\u001a\u00020\u0005H\u0016J\u001e\u0010J\u001a\u00020A*\b\u0012\u0004\u0012\u00020\u00050K2\n\u0010L\u001a\u00060Mj\u0002`NH\u0002J\u001f\u0010O\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010G2\u0006\u0010Q\u001a\u00020\u0005H\u0000¢\u0006\u0002\bRJ \u0010S\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J0\u0010V\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u00142\u0006\u0010X\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010Y\u001a\u00020AH\u0002J\u0010\u0010Z\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0010\u0010[\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0014\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001a*\u00020\u0005H\u0002J \u0010]\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J\u001c\u0010^\u001a\u00020\u0014*\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J \u0010_\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J \u0010`\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\t¨\u0006a"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "scheme", "", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedFragment", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "username", "password", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "alreadyEncoded", "", "setPathSegment", "index", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "addQueryParameter", Keys.KEY_NAME, "value", "addEncodedQueryParameter", "encodedName", "encodedValue", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "removeAllCanonicalQueryParameters", "", "canonicalName", "fragment", "reencodeForUri", "reencodeForUri$okhttp", "build", "Lokhttp3/HttpUrl;", "effectivePort", "toString", "toPathString", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "parse", "base", MetricTracker.Object.INPUT, "parse$okhttp", "resolvePath", "startPos", "limit", MetricTracker.Place.PUSH, "pos", "addTrailingSlash", "pop", "isDot", "isDotDot", "toQueryNamesAndValues", "schemeDelimiterOffset", "slashCount", "portColonOffset", "parsePort", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {
        private String encodedFragment;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;
        private final List<String> encodedPathSegments = CollectionsKt.g0("");

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            boolean z;
            Builder builder;
            String str;
            boolean z2;
            int i = 0;
            while (true) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                if (delimiterOffset < pathSegments.length()) {
                    z = true;
                    str = pathSegments;
                    z2 = alreadyEncoded;
                    builder = this;
                } else {
                    z = false;
                    builder = this;
                    str = pathSegments;
                    z2 = alreadyEncoded;
                }
                builder.push(str, i, delimiterOffset, z, z2);
                i = delimiterOffset + 1;
                if (i > str.length()) {
                    return builder;
                }
                this = builder;
                pathSegments = str;
                alreadyEncoded = z2;
            }
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            str.getClass();
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            if (Intrinsics.areEqual(input, ".") || e.o(input, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String input) {
            if (Intrinsics.areEqual(input, "..") || e.o(input, "%2e.", true) || e.o(input, ".%2e", true) || e.o(input, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final int parsePort(String input, int pos, int limit) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(_UrlKt.canonicalize$default(input, pos, limit, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > parseInt || parseInt >= 65536) {
                return -1;
            }
            return parseInt;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final int portColonOffset(String input, int pos, int limit) {
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if (charAt != ':') {
                    if (charAt != '[') {
                        pos++;
                    }
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                        pos++;
                    } while (input.charAt(pos) != ']');
                    pos++;
                } else {
                    return pos;
                }
            }
            return limit;
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$default = _UrlKt.canonicalize$default(input, pos, limit, _UrlKt.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, 112, null);
            if (!isDot(canonicalize$default)) {
                if (isDotDot(canonicalize$default)) {
                    pop();
                    return;
                }
                int length = this.encodedPathSegments.get(r12.size() - 1).length();
                List<String> list = this.encodedPathSegments;
                if (length == 0) {
                    list.set(list.size() - 1, canonicalize$default);
                } else {
                    list.add(canonicalize$default);
                }
                if (addTrailingSlash) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int c = dsn.c(size, 0, -2);
            if (c > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (Intrinsics.areEqual(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != c) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            boolean z;
            if (startPos != limit) {
                char charAt = input.charAt(startPos);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    startPos++;
                }
                int i = startPos;
                while (i < limit) {
                    int delimiterOffset = _UtilCommonKt.delimiterOffset(input, "/\\", i, limit);
                    if (delimiterOffset < limit) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Builder builder = this;
                    String str = input;
                    builder.push(str, i, delimiterOffset, z, true);
                    if (z) {
                        i = delimiterOffset + 1;
                        this = builder;
                        input = str;
                    } else {
                        this = builder;
                        input = str;
                        i = delimiterOffset;
                    }
                }
            }
        }

        private final int schemeDelimiterOffset(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char charAt = input.charAt(pos);
            if ((Intrinsics.d(charAt, 97) >= 0 && Intrinsics.d(charAt, 122) <= 0) || (Intrinsics.d(charAt, 65) >= 0 && Intrinsics.d(charAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '/' && charAt != '\\') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private final void toPathString(List<String> list, StringBuilder sb) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int Q = StringsKt.Q(str, '&', i, 4);
                if (Q == -1) {
                    Q = str.length();
                }
                int Q2 = StringsKt.Q(str, '=', i, 4);
                if (Q2 != -1 && Q2 <= Q) {
                    arrayList.add(str.substring(i, Q2));
                    arrayList.add(str.substring(Q2 + 1, Q));
                } else {
                    arrayList.add(str.substring(i, Q));
                    arrayList.add(null);
                }
                i = Q + 1;
            }
            return arrayList;
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            encodedPathSegment.getClass();
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            encodedPathSegments.getClass();
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            String str;
            encodedName.getClass();
            List list = this.encodedQueryNamesAndValues;
            if (list == null) {
                list = new ArrayList();
                this.encodedQueryNamesAndValues = list;
            }
            list.getClass();
            list.add(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (encodedValue != null) {
                str = _UrlKt.canonicalize$default(encodedValue, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            pathSegment.getClass();
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addQueryParameter(String name, String value) {
            String str;
            name.getClass();
            List list = this.encodedQueryNamesAndValues;
            if (list == null) {
                list = new ArrayList();
                this.encodedQueryNamesAndValues = list;
            }
            list.getClass();
            list.add(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            list2.getClass();
            if (value != null) {
                str = _UrlKt.canonicalize$default(value, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                String percentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    String str4 = null;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        List<String> list3 = list2;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(list3));
                        for (String str5 : list3) {
                            if (str5 != null) {
                                str = _UrlKt.percentDecode$default(str5, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList3.add(str);
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str4 = _UrlKt.percentDecode$default(str6, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$default, percentDecode$default2, str3, effectivePort, arrayList2, arrayList, str4, toString(), null);
                }
                dmk.n("host == null");
                return null;
            }
            dmk.n("scheme == null");
            return null;
        }

        public final Builder encodedFragment(String encodedFragment) {
            String str;
            if (encodedFragment != null) {
                str = _UrlKt.canonicalize$default(encodedFragment, 0, 0, "", true, false, false, true, 51, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            encodedPassword.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            encodedPath.getClass();
            if (e.u(encodedPath, AgentHeaderCreator.AGENT_DIVIDER, false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            f27.q("unexpected encodedPath: ".concat(encodedPath));
            return null;
        }

        public final Builder encodedQuery(String encodedQuery) {
            List<String> list;
            String canonicalize$default;
            if (encodedQuery != null && (canonicalize$default = _UrlKt.canonicalize$default(encodedQuery, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            encodedUsername.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder fragment(String fragment) {
            String str;
            if (fragment != null) {
                str = _UrlKt.canonicalize$default(fragment, 0, 0, "", false, false, false, true, 59, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            host.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            dmk.v(k84.g("unexpected host: ", host));
            return null;
        }

        public final Builder parse$okhttp(HttpUrl base, String input) {
            String str;
            int delimiterOffset;
            char c;
            Builder builder;
            boolean z;
            int i;
            int i2;
            char c2;
            String str2 = input;
            str2.getClass();
            Builder builder2 = null;
            int indexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int schemeDelimiterOffset = schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z2 = true;
            if (schemeDelimiterOffset != -1) {
                if (e.t(indexOfFirstNonAsciiWhitespace$default, str2, true, "https:")) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (e.t(indexOfFirstNonAsciiWhitespace$default, str2, true, "http:")) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, schemeDelimiterOffset) + '\'');
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (str2.length() > 6) {
                    str = r2i.H(6, str2).concat("...");
                } else {
                    str = str2;
                }
                dmk.v("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str));
                return null;
            }
            int slashCount = slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '#';
            if (slashCount < 2 && base != null && Intrinsics.areEqual(base.scheme(), this.scheme)) {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            } else {
                boolean z3 = false;
                boolean z4 = false;
                int i3 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = _UtilCommonKt.delimiterOffset(str2, "@/\\?#", i3, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str2.charAt(delimiterOffset);
                    } else {
                        c = 65535;
                    }
                    if (c == 65535 || c == c3 || c == '/' || c == '\\' || c == '?') {
                        break;
                    }
                    if (c == '@') {
                        if (!z3) {
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str2, ':', i3, delimiterOffset);
                            builder = builder2;
                            z = z2;
                            String canonicalize$default = _UrlKt.canonicalize$default(str2, i3, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z4) {
                                canonicalize$default = ix2.p(new StringBuilder(), this.encodedUsername, "%40", canonicalize$default);
                            }
                            this.encodedUsername = canonicalize$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(input, delimiterOffset2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z3 = z;
                            } else {
                                i2 = delimiterOffset;
                            }
                            str2 = input;
                            i = i2;
                            z4 = z;
                        } else {
                            builder = builder2;
                            z = z2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str2 = input;
                            i = delimiterOffset;
                            sb.append(_UrlKt.canonicalize$default(str2, i3, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb.toString();
                        }
                        i3 = i + 1;
                        z2 = z;
                        builder2 = builder;
                        c3 = '#';
                    }
                }
                Builder builder3 = builder2;
                int portColonOffset = portColonOffset(str2, i3, delimiterOffset);
                int i4 = portColonOffset + 1;
                if (i4 < delimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    int parsePort = parsePort(str2, i4, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        fi9.j("Invalid URL port: \"", str2.substring(i4, delimiterOffset), 34);
                        return builder3;
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str2, i3, portColonOffset, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str3 = this.scheme;
                    str3.getClass();
                    this.port = companion.defaultPort(str3);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    fi9.j("Invalid URL host: \"", str2.substring(i3, portColonOffset), 34);
                    return builder3;
                }
            }
            int delimiterOffset3 = _UtilCommonKt.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == '?') {
                c2 = '#';
                int delimiterOffset4 = _UtilCommonKt.delimiterOffset(str2, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, delimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                delimiterOffset3 = delimiterOffset4;
            } else {
                c2 = '#';
            }
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && str2.charAt(delimiterOffset3) == c2) {
                this.encodedFragment = _UrlKt.canonicalize$default(str2, delimiterOffset3 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final Builder password(String password) {
            password.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            f27.q(ace.f(port, "unexpected port: "));
            return null;
        }

        public final Builder query(String query) {
            List<String> list;
            String canonicalize$default;
            if (query != null && (canonicalize$default = _UrlKt.canonicalize$default(query, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                str = new Regex("[\"<>^`{|}]").replace(str3, "");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, _UrlKt.canonicalize$default(list.get(i), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = _UrlKt.canonicalize$default(str5, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = _UrlKt.canonicalize$default(str6, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            scheme.getClass();
            if (e.o(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (e.o(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            dmk.v(k84.g("unexpected scheme: ", scheme));
            return null;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            encodedPathSegment.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(encodedPathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.encodedPathSegments.set(index, canonicalize$default);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                return this;
            }
            f27.q(k84.g("unexpected path segment: ", encodedPathSegment));
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            pathSegment.getClass();
            String canonicalize$default = _UrlKt.canonicalize$default(pathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, 123, null);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                this.encodedPathSegments.set(index, canonicalize$default);
                return this;
            }
            f27.q(k84.g("unexpected path segment: ", pathSegment));
            return null;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String name, String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (StringsKt.M(str2, ':')) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.INSTANCE.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            toPathString(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion = HttpUrl.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                Companion.access$toQueryString(companion, list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder username(String username) {
            username.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            pathSegments.getClass();
            return addPathSegments(pathSegments, false);
        }
    }

    public final Builder newBuilder(String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
