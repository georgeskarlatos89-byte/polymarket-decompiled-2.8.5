package io.ably.lib.types;

import io.ably.lib.http.HttpAuth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ProxyOptions {
    public String host;
    public String[] nonProxyHosts;
    public String password;
    public int port;
    public HttpAuth.Type prefAuthType = HttpAuth.Type.BASIC;
    public String username;
}
