package okhttp3;

import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.dmk;
import defpackage.f27;
import defpackage.hm6;
import defpackage.woa;
import defpackage.xbc;
import io.sentry.okhttp.f;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u0000 \u0084\u00012\u00020\u00012\u00020\u0002:\u0004\u0083\u0001\u0084\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000e\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]J\b\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0016J\u0018\u0010d\u001a\u00020e2\u0006\u0010b\u001a\u00020c2\u0006\u0010f\u001a\u00020gH\u0016J\b\u0010h\u001a\u00020\u0004H\u0016J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\biJ\r\u0010W\u001a\u00020XH\u0007¢\u0006\u0002\bjJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\bkJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\blJ\r\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\bmJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bnJ\r\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\boJ\r\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0002\bpJ\r\u0010\u001b\u001a\u00020\u0014H\u0007¢\u0006\u0002\bqJ\r\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\brJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0002\bsJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\btJ\u000f\u0010%\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\buJ\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\bvJ\r\u0010+\u001a\u00020\u0018H\u0007¢\u0006\u0002\bwJ\r\u0010,\u001a\u00020-H\u0007¢\u0006\u0002\bxJ\r\u00103\u001a\u000200H\u0007¢\u0006\u0002\byJ\u0013\u00107\u001a\b\u0012\u0004\u0012\u0002080\fH\u0007¢\u0006\u0002\bzJ\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020:0\fH\u0007¢\u0006\u0002\b{J\r\u0010;\u001a\u00020<H\u0007¢\u0006\u0002\b|J\r\u0010>\u001a\u00020?H\u0007¢\u0006\u0002\b}J\r\u0010D\u001a\u00020EH\u0007¢\u0006\u0002\b~J\r\u0010G\u001a\u00020EH\u0007¢\u0006\u0002\b\u007fJ\u000e\u0010H\u001a\u00020EH\u0007¢\u0006\u0003\b\u0080\u0001J\u000e\u0010I\u001a\u00020EH\u0007¢\u0006\u0003\b\u0081\u0001J\u000e\u0010J\u001a\u00020EH\u0007¢\u0006\u0003\b\u0082\u0001R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0010\u001a\u00020\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0013\u0010\u0013\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0013\u0010\u0016\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0017\u001a\u00020\u00188\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u001a\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u001b\u001a\u00020\u00148\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u001c\u001a\u00020\u001d8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u0015\u0010\u001f\u001a\u0004\u0018\u00010 8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0015\u0010%\u001a\u0004\u0018\u00010&8\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020\u00188\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010,\u001a\u00020-8\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010.R\u0016\u0010/\u001a\u0004\u0018\u000100X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b3\u00102R\u0015\u00104\u001a\u0004\u0018\u0001058\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00106R\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002080\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000eR\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020:0\f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000eR\u0013\u0010;\u001a\u00020<8\u0007¢\u0006\b\n\u0000\u001a\u0004\b;\u0010=R\u0013\u0010>\u001a\u00020?8\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010@R\u0015\u0010A\u001a\u0004\u0018\u00010B8\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010CR\u0013\u0010D\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010FR\u0013\u0010G\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bG\u0010FR\u0013\u0010H\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010FR\u0013\u0010I\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010FR\u0013\u0010J\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u0013\u0010K\u001a\u00020E8\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010FR\u0013\u0010L\u001a\u00020M8\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010NR\u0014\u0010O\u001a\u00020PX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020TX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010W\u001a\u00020X8\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010Y¨\u0006\u0085\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "builder", "Lokhttp3/OkHttpClient$Builder;", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "dispatcher", "Lokhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "interceptors", "", "Lokhttp3/Interceptor;", "()Ljava/util/List;", "networkInterceptors", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "retryOnConnectionFailure", "", "()Z", "fastFallback", "authenticator", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "followRedirects", "followSslRedirects", "cookieJar", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "cache", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "dns", "Lokhttp3/Dns;", "()Lokhttp3/Dns;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxyAuthenticator", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "protocols", "Lokhttp3/Protocol;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "callTimeoutMillis", "", "()I", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "pingIntervalMillis", "webSocketCloseTimeout", "minWebSocketMessageToCompress", "", "()J", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", PlaceTypes.ADDRESS, "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "verifyClientState", "", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "newWebSocket", "Lokhttp3/WebSocket;", "listener", "Lokhttp3/WebSocketListener;", "newBuilder", "-deprecated_dispatcher", "-deprecated_connectionPool", "-deprecated_interceptors", "-deprecated_networkInterceptors", "-deprecated_eventListenerFactory", "-deprecated_retryOnConnectionFailure", "-deprecated_authenticator", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_cookieJar", "-deprecated_cache", "-deprecated_dns", "-deprecated_proxy", "-deprecated_proxySelector", "-deprecated_proxyAuthenticator", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "-deprecated_connectionSpecs", "-deprecated_protocols", "-deprecated_hostnameVerifier", "-deprecated_certificatePinner", "-deprecated_callTimeoutMillis", "-deprecated_connectTimeoutMillis", "-deprecated_readTimeoutMillis", "-deprecated_writeTimeoutMillis", "-deprecated_pingIntervalMillis", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean fastFallback;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final TaskRunner taskRunner;
    private final int webSocketCloseTimeout;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = _UtilJvmKt.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = _UtilJvmKt.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        builder.getClass();
        builder.eventListener(new f(builder.getEventListenerFactory()));
        this.dispatcher = builder.getDispatcher();
        this.interceptors = _UtilJvmKt.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = _UtilJvmKt.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.fastFallback = builder.getFastFallback();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner == null ? TaskRunner.INSTANCE : taskRunner;
        ConnectionPool connectionPool = builder.getConnectionPool();
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            builder.setConnectionPool$okhttp(connectionPool);
        }
        this.connectionPool = connectionPool;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        certificateChainCleaner.getClass();
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        x509TrustManagerOrNull.getClass();
                        this.x509TrustManager = x509TrustManagerOrNull;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.INSTANCE;
                        X509TrustManager platformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = platformTrustManager;
                        this.sslSocketFactoryOrNull = companion.get().newSslSocketFactory(platformTrustManager);
                        CertificateChainCleaner certificateChainCleaner2 = CertificateChainCleaner.INSTANCE.get(platformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                    }
                    verifyClientState();
                }
            }
        }
        this.sslSocketFactoryOrNull = null;
        this.certificateChainCleaner = null;
        this.x509TrustManager = null;
        this.certificatePinner = CertificatePinner.DEFAULT;
        verifyClientState();
    }

    public static final /* synthetic */ List access$getDEFAULT_CONNECTION_SPECS$cp() {
        return DEFAULT_CONNECTION_SPECS;
    }

    public static final /* synthetic */ List access$getDEFAULT_PROTOCOLS$cp() {
        return DEFAULT_PROTOCOLS;
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        list.getClass();
        if (!list.contains(null)) {
            List<Interceptor> list2 = this.networkInterceptors;
            list2.getClass();
            if (!list2.contains(null)) {
                List<ConnectionSpec> list3 = this.connectionSpecs;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (((ConnectionSpec) it.next()).getIsTls()) {
                            if (this.sslSocketFactoryOrNull != null) {
                                if (this.certificateChainCleaner != null) {
                                    if (this.x509TrustManager == null) {
                                        dmk.n("x509TrustManager == null");
                                        return;
                                    }
                                    return;
                                }
                                dmk.n("certificateChainCleaner == null");
                                return;
                            }
                            dmk.n("sslSocketFactory == null");
                            return;
                        }
                    }
                }
                if (this.sslSocketFactoryOrNull == null) {
                    if (this.certificateChainCleaner == null) {
                        if (this.x509TrustManager == null) {
                            if (Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
                                return;
                            }
                            dmk.n("Check failed.");
                            return;
                        }
                        dmk.n("Check failed.");
                        return;
                    }
                    dmk.n("Check failed.");
                    return;
                }
                dmk.n("Check failed.");
                return;
            }
            xbc.i(this.networkInterceptors, "Null network interceptor: ");
            return;
        }
        xbc.i(this.interceptors, "Null interceptor: ");
    }

    @hm6
    /* renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @hm6
    /* renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @hm6
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @hm6
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @hm6
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @hm6
    /* renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @hm6
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m985deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @hm6
    /* renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @hm6
    /* renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @hm6
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @hm6
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @hm6
    /* renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @hm6
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @hm6
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @hm6
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m993deprecated_interceptors() {
        return this.interceptors;
    }

    @hm6
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m994deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @hm6
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @hm6
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m996deprecated_protocols() {
        return this.protocols;
    }

    @hm6
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @hm6
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @hm6
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @hm6
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @hm6
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @hm6
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @hm6
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m1003deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @hm6
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Address address(HttpUrl url) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        url.getClass();
        if (url.isHttps()) {
            sSLSocketFactory = sslSocketFactory();
            hostnameVerifier = this.hostnameVerifier;
            certificatePinner = this.certificatePinner;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(url.host(), url.port(), this.dns, this.socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: fastFallback, reason: from getter */
    public final boolean getFastFallback() {
        return this.fastFallback;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: getRouteDatabase$okhttp, reason: from getter */
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    /* renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
    public final SSLSocketFactory getSslSocketFactoryOrNull() {
        return this.sslSocketFactoryOrNull;
    }

    /* renamed from: getTaskRunner$okhttp, reason: from getter */
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    /* renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        request.getClass();
        listener.getClass();
        RealWebSocket realWebSocket = new RealWebSocket(this.taskRunner, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        dmk.n("CLEARTEXT-only client");
        return null;
    }

    /* renamed from: webSocketCloseTimeout, reason: from getter */
    public final int getWebSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    /* renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "<init>", "()V", "DEFAULT_PROTOCOLS", "", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "()Ljava/util/List;", "DEFAULT_CONNECTION_SPECS", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.access$getDEFAULT_CONNECTION_SPECS$cp();
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.access$getDEFAULT_PROTOCOLS$cp();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bn\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0013J)\u0010\u001b\u001a\u00020\u00002\u0014\b\u0004\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b*\u0010%J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b,\u0010%J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020'¢\u0006\u0004\b@\u0010)J\u0015\u0010B\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u001d\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bE\u0010IJ\u001b\u0010L\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0004\bL\u0010MJ\u001b\u0010O\u001a\u00020\u00002\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0J¢\u0006\u0004\bO\u0010MJ\u0015\u0010Q\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bT\u0010UJ\u001d\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0017\u0010Z\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bZ\u0010^J\u0015\u0010Z\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bb\u0010[J\u0017\u0010b\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bb\u0010^J\u0015\u0010b\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bc\u0010aJ\u001d\u0010d\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bd\u0010[J\u0017\u0010d\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bd\u0010^J\u0015\u0010d\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\be\u0010aJ\u001d\u0010f\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bf\u0010[J\u0017\u0010f\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bf\u0010^J\u0015\u0010f\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bg\u0010aJ\u001d\u0010i\u001a\u00020\u00002\u0006\u0010h\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bi\u0010[J\u0017\u0010i\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bi\u0010^J\u0015\u0010i\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bj\u0010aJ\u001d\u0010k\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bk\u0010[J\u0017\u0010k\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bk\u0010^J\u0015\u0010k\u001a\u00020\u00002\u0006\u0010]\u001a\u00020_¢\u0006\u0004\bl\u0010aJ\u0015\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020V¢\u0006\u0004\bn\u0010aJ\r\u0010o\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010{\u001a\u0004\b|\u0010\u0010R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010{\u001a\u0004\b}\u0010\u0010R%\u0010!\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b!\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b$\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010&\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b&\u0010\u0083\u0001\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001\"\u0006\b\u0089\u0001\u0010\u0087\u0001R'\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b(\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010\u0083\u0001\u001a\u0006\b\u008f\u0001\u0010\u0085\u0001\"\u0006\b\u0090\u0001\u0010\u0087\u0001R'\u0010,\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b,\u0010\u0083\u0001\u001a\u0006\b\u0091\u0001\u0010\u0085\u0001\"\u0006\b\u0092\u0001\u0010\u0087\u0001R'\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b.\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u00101\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b1\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u00108\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b8\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010;\u001a\u0004\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b;\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R)\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b>\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R'\u0010@\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010\u008a\u0001\u001a\u0006\b¬\u0001\u0010\u008c\u0001\"\u0006\b\u00ad\u0001\u0010\u008e\u0001R'\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bB\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R+\u0010³\u0001\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R+\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bL\u0010{\u001a\u0005\b¿\u0001\u0010\u0010\"\u0006\bÀ\u0001\u0010Á\u0001R+\u0010O\u001a\b\u0012\u0004\u0012\u00020N0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bO\u0010{\u001a\u0005\bÂ\u0001\u0010\u0010\"\u0006\bÃ\u0001\u0010Á\u0001R'\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bQ\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R'\u0010T\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bT\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R,\u0010Ï\u0001\u001a\u0005\u0018\u00010Î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R(\u0010Z\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bZ\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R(\u0010b\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bb\u0010Ö\u0001\u001a\u0006\bÛ\u0001\u0010Ø\u0001\"\u0006\bÜ\u0001\u0010Ú\u0001R(\u0010d\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bd\u0010Ö\u0001\u001a\u0006\bÝ\u0001\u0010Ø\u0001\"\u0006\bÞ\u0001\u0010Ú\u0001R(\u0010f\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bf\u0010Ö\u0001\u001a\u0006\bß\u0001\u0010Ø\u0001\"\u0006\bà\u0001\u0010Ú\u0001R(\u0010i\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bi\u0010Ö\u0001\u001a\u0006\bá\u0001\u0010Ø\u0001\"\u0006\bâ\u0001\u0010Ú\u0001R(\u0010k\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bk\u0010Ö\u0001\u001a\u0006\bã\u0001\u0010Ø\u0001\"\u0006\bä\u0001\u0010Ú\u0001R'\u0010n\u001a\u00020V8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bn\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R,\u0010ë\u0001\u001a\u0005\u0018\u00010ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R)\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b4\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ö\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "fastFallback", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "taskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "Ld47;", "callTimeout-LRDsOJo", "(J)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "connectTimeout-LRDsOJo", "readTimeout", "readTimeout-LRDsOJo", "writeTimeout", "writeTimeout-LRDsOJo", "interval", "pingInterval", "pingInterval-LRDsOJo", "webSocketCloseTimeout", "webSocketCloseTimeout-LRDsOJo", "bytes", "minWebSocketMessageToCompress", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "getFastFallback$okhttp", "setFastFallback$okhttp", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "getWebSocketCloseTimeout$okhttp", "setWebSocketCloseTimeout$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "setTaskRunner$okhttp", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean fastFallback;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private TaskRunner taskRunner;
        private int webSocketCloseTimeout;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            okHttpClient.getClass();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt.o(this.interceptors, okHttpClient.interceptors());
            CollectionsKt.o(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.fastFallback = okHttpClient.getFastFallback();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.getSslSocketFactoryOrNull();
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.getWebSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.taskRunner = okHttpClient.getTaskRunner();
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m1005addInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            block.getClass();
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return block.invoke(chain);
                }
            });
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m1006addNetworkInterceptor(final Function1<? super Interceptor.Chain, Response> block) {
            block.getClass();
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return block.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            interceptor.getClass();
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            duration.getClass();
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m1007callTimeoutLRDsOJo(long duration) {
            this.callTimeout = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            if (!Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            duration.getClass();
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m1008connectTimeoutLRDsOJo(long duration) {
            this.connectTimeout = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            connectionPool.getClass();
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
            connectionSpecs.getClass();
            if (!Intrinsics.areEqual(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = _UtilJvmKt.toImmutableList(connectionSpecs);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            dns.getClass();
            if (!Intrinsics.areEqual(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            eventListener.getClass();
            this.eventListenerFactory = _UtilJvmKt.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
            eventListenerFactory.getClass();
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final Builder fastFallback(boolean fastFallback) {
            this.fastFallback = fastFallback;
            return this;
        }

        public final Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /* renamed from: getAuthenticator$okhttp, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        /* renamed from: getCache$okhttp, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        /* renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        /* renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* renamed from: getConnectionPool$okhttp, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        /* renamed from: getCookieJar$okhttp, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        /* renamed from: getDispatcher$okhttp, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        /* renamed from: getDns$okhttp, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        /* renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: getFastFallback$okhttp, reason: from getter */
        public final boolean getFastFallback() {
            return this.fastFallback;
        }

        /* renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        /* renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        /* renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        /* renamed from: getProxy$okhttp, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* renamed from: getProxySelector$okhttp, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        /* renamed from: getSocketFactory$okhttp, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        /* renamed from: getWebSocketCloseTimeout$okhttp, reason: from getter */
        public final int getWebSocketCloseTimeout() {
            return this.webSocketCloseTimeout;
        }

        /* renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            if (!Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes >= 0) {
                this.minWebSocketMessageToCompress = bytes;
                return this;
            }
            f27.q(woa.m(bytes, "minWebSocketMessageToCompress must be positive: "));
            return null;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(Duration duration) {
            duration.getClass();
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final Builder m1009pingIntervalLRDsOJo(long duration) {
            this.pingInterval = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> protocols) {
            protocols.getClass();
            ArrayList arrayList = new ArrayList(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                xbc.p(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                xbc.p(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return null;
            }
            if (!arrayList.contains(Protocol.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(Protocol.SPDY_3);
                    if (!Intrinsics.areEqual(arrayList, this.protocols)) {
                        this.routeDatabase = null;
                    }
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(arrayList);
                    unmodifiableList.getClass();
                    this.protocols = unmodifiableList;
                    return this;
                }
                dmk.v("protocols must not contain null");
                return null;
            }
            xbc.p(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }

        public final Builder proxy(Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
            proxyAuthenticator.getClass();
            if (!Intrinsics.areEqual(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            proxySelector.getClass();
            if (!Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            duration.getClass();
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m1010readTimeoutLRDsOJo(long duration) {
            this.readTimeout = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            certificatePinner.getClass();
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            list.getClass();
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            cookieJar.getClass();
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            dispatcher.getClass();
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            dns.getClass();
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            factory.getClass();
            this.eventListenerFactory = factory;
        }

        public final void setFastFallback$okhttp(boolean z) {
            this.fastFallback = z;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            hostnameVerifier.getClass();
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            list.getClass();
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            authenticator.getClass();
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            socketFactory.getClass();
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setTaskRunner$okhttp(TaskRunner taskRunner) {
            this.taskRunner = taskRunner;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i) {
            this.webSocketCloseTimeout = i;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            socketFactory.getClass();
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory;
                return this;
            }
            dmk.v("socketFactory instanceof SSLSocketFactory");
            return null;
        }

        @hm6
        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) {
            sslSocketFactory.getClass();
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager trustManager = companion.get().trustManager(sslSocketFactory);
            if (trustManager != null) {
                this.x509TrustManagerOrNull = trustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                x509TrustManager.getClass();
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
            sb.append(companion.get());
            xbc.r(sb, ", sslSocketFactory is ", sslSocketFactory.getClass());
            return null;
        }

        public final Builder taskRunner$okhttp(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.taskRunner = taskRunner;
            return this;
        }

        public final Builder webSocketCloseTimeout(Duration duration) {
            duration.getClass();
            webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m1011webSocketCloseTimeoutLRDsOJo(long duration) {
            this.webSocketCloseTimeout = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            duration.getClass();
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m1012writeTimeoutLRDsOJo(long duration) {
            this.writeTimeout = _UtilJvmKt.m1035checkDurationHG0u8IE("duration", duration);
            return this;
        }

        public final Builder callTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.callTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder connectTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.connectTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder pingInterval(long interval, TimeUnit unit) {
            unit.getClass();
            this.pingInterval = _UtilJvmKt.checkDuration("interval", interval, unit);
            return this;
        }

        public final Builder readTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.readTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder webSocketCloseTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.webSocketCloseTimeout = _UtilJvmKt.checkDuration("webSocketCloseTimeout", timeout, unit);
            return this;
        }

        public final Builder writeTimeout(long timeout, TimeUnit unit) {
            unit.getClass();
            this.writeTimeout = _UtilJvmKt.checkDuration("timeout", timeout, unit);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            sslSocketFactory.getClass();
            trustManager.getClass();
            if (!Intrinsics.areEqual(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.areEqual(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = _UtilJvmKt.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
