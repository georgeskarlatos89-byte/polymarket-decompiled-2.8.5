package io.radar.sdk;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lio/radar/sdk/NetworkErrorKind;", "", "(Ljava/lang/String;I)V", "DNS_FAILURE", "TIMEOUT", "SSL_FAILURE", "CONNECT_REFUSED", "IO_OTHER", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkErrorKind {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ NetworkErrorKind[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NetworkErrorKind DNS_FAILURE = new NetworkErrorKind("DNS_FAILURE", 0);
    public static final NetworkErrorKind TIMEOUT = new NetworkErrorKind("TIMEOUT", 1);
    public static final NetworkErrorKind SSL_FAILURE = new NetworkErrorKind("SSL_FAILURE", 2);
    public static final NetworkErrorKind CONNECT_REFUSED = new NetworkErrorKind("CONNECT_REFUSED", 3);
    public static final NetworkErrorKind IO_OTHER = new NetworkErrorKind("IO_OTHER", 4);

    private static final /* synthetic */ NetworkErrorKind[] $values() {
        return new NetworkErrorKind[]{DNS_FAILURE, TIMEOUT, SSL_FAILURE, CONNECT_REFUSED, IO_OTHER};
    }

    static {
        NetworkErrorKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private NetworkErrorKind(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static NetworkErrorKind valueOf(String str) {
        return (NetworkErrorKind) Enum.valueOf(NetworkErrorKind.class, str);
    }

    public static NetworkErrorKind[] values() {
        return (NetworkErrorKind[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/NetworkErrorKind$Companion;", "", "()V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lio/radar/sdk/NetworkErrorKind;", "e", "Ljava/io/IOException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkErrorKind from(IOException e) {
            e.getClass();
            if (e instanceof UnknownHostException) {
                return NetworkErrorKind.DNS_FAILURE;
            }
            if (e instanceof SocketTimeoutException) {
                return NetworkErrorKind.TIMEOUT;
            }
            if (e instanceof SSLException) {
                return NetworkErrorKind.SSL_FAILURE;
            }
            if (e instanceof ConnectException) {
                return NetworkErrorKind.CONNECT_REFUSED;
            }
            return NetworkErrorKind.IO_OTHER;
        }

        private Companion() {
        }
    }
}
