package io.ably.lib.network;

import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class WebSocketEngineConfig {
    private final String host;
    private final ProxyConfig proxy;
    private final SSLSocketFactory sslSocketFactory;
    private final boolean tls;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class WebSocketEngineConfigBuilder {
        private String host;
        private ProxyConfig proxy;
        private SSLSocketFactory sslSocketFactory;
        private boolean tls;

        public WebSocketEngineConfig build() {
            return new WebSocketEngineConfig(this.proxy, this.tls, this.host, this.sslSocketFactory);
        }

        public WebSocketEngineConfigBuilder host(String str) {
            this.host = str;
            return this;
        }

        public WebSocketEngineConfigBuilder proxy(ProxyConfig proxyConfig) {
            this.proxy = proxyConfig;
            return this;
        }

        public WebSocketEngineConfigBuilder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        public WebSocketEngineConfigBuilder tls(boolean z) {
            this.tls = z;
            return this;
        }

        public String toString() {
            return "WebSocketEngineConfig.WebSocketEngineConfigBuilder(proxy=" + this.proxy + ", tls=" + this.tls + ", host=" + this.host + ", sslSocketFactory=" + this.sslSocketFactory + ")";
        }
    }

    public WebSocketEngineConfig(ProxyConfig proxyConfig, boolean z, String str, SSLSocketFactory sSLSocketFactory) {
        this.proxy = proxyConfig;
        this.tls = z;
        this.host = str;
        this.sslSocketFactory = sSLSocketFactory;
    }

    public static WebSocketEngineConfigBuilder builder() {
        return new WebSocketEngineConfigBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WebSocketEngineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebSocketEngineConfig)) {
            return false;
        }
        WebSocketEngineConfig webSocketEngineConfig = (WebSocketEngineConfig) obj;
        if (!webSocketEngineConfig.canEqual(this) || isTls() != webSocketEngineConfig.isTls()) {
            return false;
        }
        ProxyConfig proxy = getProxy();
        ProxyConfig proxy2 = webSocketEngineConfig.getProxy();
        if (proxy != null ? !proxy.equals(proxy2) : proxy2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = webSocketEngineConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        SSLSocketFactory sslSocketFactory = getSslSocketFactory();
        SSLSocketFactory sslSocketFactory2 = webSocketEngineConfig.getSslSocketFactory();
        if (sslSocketFactory != null ? sslSocketFactory.equals(sslSocketFactory2) : sslSocketFactory2 == null) {
            return true;
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public ProxyConfig getProxy() {
        return this.proxy;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        if (isTls()) {
            i = 79;
        } else {
            i = 97;
        }
        ProxyConfig proxy = getProxy();
        int i2 = (i + 59) * 59;
        int i3 = 43;
        if (proxy == null) {
            hashCode = 43;
        } else {
            hashCode = proxy.hashCode();
        }
        int i4 = i2 + hashCode;
        String host = getHost();
        int i5 = i4 * 59;
        if (host == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = host.hashCode();
        }
        SSLSocketFactory sslSocketFactory = getSslSocketFactory();
        int i6 = (i5 + hashCode2) * 59;
        if (sslSocketFactory != null) {
            i3 = sslSocketFactory.hashCode();
        }
        return i6 + i3;
    }

    public boolean isTls() {
        return this.tls;
    }

    public String toString() {
        return "WebSocketEngineConfig(proxy=" + getProxy() + ", tls=" + isTls() + ", host=" + getHost() + ", sslSocketFactory=" + getSslSocketFactory() + ")";
    }
}
