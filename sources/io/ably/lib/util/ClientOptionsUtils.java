package io.ably.lib.util;

import io.ably.lib.http.HttpAuth;
import io.ably.lib.network.ProxyAuthType;
import io.ably.lib.network.ProxyConfig;
import io.ably.lib.types.ClientOptions;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ClientOptionsUtils {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.ably.lib.util.ClientOptionsUtils$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[HttpAuth.Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[HttpAuth.Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[HttpAuth.Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static ProxyConfig convertToProxyConfig(ClientOptions clientOptions) {
        if (clientOptions.proxy == null) {
            return null;
        }
        ProxyConfig.ProxyConfigBuilder builder = ProxyConfig.builder();
        builder.host(clientOptions.proxy.host).port(clientOptions.proxy.port).username(clientOptions.proxy.username).password(clientOptions.proxy.password);
        String[] strArr = clientOptions.proxy.nonProxyHosts;
        if (strArr != null) {
            builder.nonProxyHosts(Arrays.asList(strArr));
        }
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[clientOptions.proxy.prefAuthType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                builder.authType(ProxyAuthType.DIGEST);
            }
        } else {
            builder.authType(ProxyAuthType.BASIC);
        }
        return builder.build();
    }
}
