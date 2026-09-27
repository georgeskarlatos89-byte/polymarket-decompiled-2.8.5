package io.ably.lib.network;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ProxyConfig {
    private ProxyAuthType authType;
    private String host;
    private List<String> nonProxyHosts;
    private String password;
    private int port;
    private String username;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class ProxyConfigBuilder {
        private ProxyAuthType authType;
        private String host;
        private List<String> nonProxyHosts;
        private String password;
        private int port;
        private String username;

        public ProxyConfigBuilder authType(ProxyAuthType proxyAuthType) {
            this.authType = proxyAuthType;
            return this;
        }

        public ProxyConfig build() {
            return new ProxyConfig(this.host, this.port, this.username, this.password, this.nonProxyHosts, this.authType);
        }

        public ProxyConfigBuilder host(String str) {
            this.host = str;
            return this;
        }

        public ProxyConfigBuilder nonProxyHosts(List<String> list) {
            this.nonProxyHosts = list;
            return this;
        }

        public ProxyConfigBuilder password(String str) {
            this.password = str;
            return this;
        }

        public ProxyConfigBuilder port(int i) {
            this.port = i;
            return this;
        }

        public String toString() {
            return "ProxyConfig.ProxyConfigBuilder(host=" + this.host + ", port=" + this.port + ", username=" + this.username + ", password=" + this.password + ", nonProxyHosts=" + this.nonProxyHosts + ", authType=" + this.authType + ")";
        }

        public ProxyConfigBuilder username(String str) {
            this.username = str;
            return this;
        }
    }

    public ProxyConfig(String str, int i, String str2, String str3, List<String> list, ProxyAuthType proxyAuthType) {
        this.host = str;
        this.port = i;
        this.username = str2;
        this.password = str3;
        this.nonProxyHosts = list;
        this.authType = proxyAuthType;
    }

    public static ProxyConfigBuilder builder() {
        return new ProxyConfigBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ProxyConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProxyConfig)) {
            return false;
        }
        ProxyConfig proxyConfig = (ProxyConfig) obj;
        if (!proxyConfig.canEqual(this) || getPort() != proxyConfig.getPort()) {
            return false;
        }
        String host = getHost();
        String host2 = proxyConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = proxyConfig.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String password = getPassword();
        String password2 = proxyConfig.getPassword();
        if (password != null ? !password.equals(password2) : password2 != null) {
            return false;
        }
        List<String> nonProxyHosts = getNonProxyHosts();
        List<String> nonProxyHosts2 = proxyConfig.getNonProxyHosts();
        if (nonProxyHosts != null ? !nonProxyHosts.equals(nonProxyHosts2) : nonProxyHosts2 != null) {
            return false;
        }
        ProxyAuthType authType = getAuthType();
        ProxyAuthType authType2 = proxyConfig.getAuthType();
        if (authType != null ? authType.equals(authType2) : authType2 == null) {
            return true;
        }
        return false;
    }

    public ProxyAuthType getAuthType() {
        return this.authType;
    }

    public String getHost() {
        return this.host;
    }

    public List<String> getNonProxyHosts() {
        return this.nonProxyHosts;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPort() {
        return this.port;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int port = getPort() + 59;
        String host = getHost();
        int i = port * 59;
        int i2 = 43;
        if (host == null) {
            hashCode = 43;
        } else {
            hashCode = host.hashCode();
        }
        int i3 = i + hashCode;
        String username = getUsername();
        int i4 = i3 * 59;
        if (username == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = username.hashCode();
        }
        int i5 = i4 + hashCode2;
        String password = getPassword();
        int i6 = i5 * 59;
        if (password == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = password.hashCode();
        }
        int i7 = i6 + hashCode3;
        List<String> nonProxyHosts = getNonProxyHosts();
        int i8 = i7 * 59;
        if (nonProxyHosts == null) {
            hashCode4 = 43;
        } else {
            hashCode4 = nonProxyHosts.hashCode();
        }
        ProxyAuthType authType = getAuthType();
        int i9 = (i8 + hashCode4) * 59;
        if (authType != null) {
            i2 = authType.hashCode();
        }
        return i9 + i2;
    }

    public String toString() {
        return "ProxyConfig(host=" + getHost() + ", port=" + getPort() + ", username=" + getUsername() + ", password=" + getPassword() + ", nonProxyHosts=" + getNonProxyHosts() + ", authType=" + getAuthType() + ")";
    }
}
