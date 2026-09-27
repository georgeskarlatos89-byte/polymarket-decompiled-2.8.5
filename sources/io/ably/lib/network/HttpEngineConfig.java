package io.ably.lib.network;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpEngineConfig {
    private final ProxyConfig proxy;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class HttpEngineConfigBuilder {
        private ProxyConfig proxy;

        public HttpEngineConfig build() {
            return new HttpEngineConfig(this.proxy);
        }

        public HttpEngineConfigBuilder proxy(ProxyConfig proxyConfig) {
            this.proxy = proxyConfig;
            return this;
        }

        public String toString() {
            return "HttpEngineConfig.HttpEngineConfigBuilder(proxy=" + this.proxy + ")";
        }
    }

    public HttpEngineConfig(ProxyConfig proxyConfig) {
        this.proxy = proxyConfig;
    }

    public static HttpEngineConfigBuilder builder() {
        return new HttpEngineConfigBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HttpEngineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpEngineConfig)) {
            return false;
        }
        HttpEngineConfig httpEngineConfig = (HttpEngineConfig) obj;
        if (!httpEngineConfig.canEqual(this)) {
            return false;
        }
        ProxyConfig proxy = getProxy();
        ProxyConfig proxy2 = httpEngineConfig.getProxy();
        if (proxy != null ? proxy.equals(proxy2) : proxy2 == null) {
            return true;
        }
        return false;
    }

    public ProxyConfig getProxy() {
        return this.proxy;
    }

    public int hashCode() {
        int hashCode;
        ProxyConfig proxy = getProxy();
        if (proxy == null) {
            hashCode = 43;
        } else {
            hashCode = proxy.hashCode();
        }
        return 59 + hashCode;
    }

    public String toString() {
        return "HttpEngineConfig(proxy=" + getProxy() + ")";
    }
}
