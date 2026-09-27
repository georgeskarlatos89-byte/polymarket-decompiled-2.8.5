package io.sentry.okhttp;

import java.net.InetAddress;
import java.net.Proxy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d extends Lambda implements Function1 {
    public static final d i = new d(1, 0);
    public static final d j = new d(1, 1);
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                inetAddress.getClass();
                String inetAddress2 = inetAddress.toString();
                inetAddress2.getClass();
                return inetAddress2;
            default:
                Proxy proxy = (Proxy) obj;
                proxy.getClass();
                String proxy2 = proxy.toString();
                proxy2.getClass();
                return proxy2;
        }
    }
}
