package okhttp3;

import defpackage.dmk;
import defpackage.hm6;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lokhttp3/Protocol;", "", "protocol", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "HTTP_3", "toString", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Protocol {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Protocol[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String protocol;
    public static final Protocol HTTP_1_0 = new Protocol("HTTP_1_0", 0, "http/1.0");
    public static final Protocol HTTP_1_1 = new Protocol("HTTP_1_1", 1, "http/1.1");

    @hm6
    public static final Protocol SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
    public static final Protocol HTTP_2 = new Protocol("HTTP_2", 3, "h2");
    public static final Protocol H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    public static final Protocol QUIC = new Protocol("QUIC", 5, "quic");
    public static final Protocol HTTP_3 = new Protocol("HTTP_3", 6, "h3");

    private static final /* synthetic */ Protocol[] $values() {
        return new Protocol[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC, HTTP_3};
    }

    static {
        Protocol[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private Protocol(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static final /* synthetic */ String access$getProtocol$p(Protocol protocol) {
        return protocol.protocol;
    }

    public static final Protocol get(String str) {
        return INSTANCE.get(str);
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "<init>", "()V", "get", "Lokhttp3/Protocol;", "protocol", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Protocol get(String protocol) {
            protocol.getClass();
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol2))) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol3))) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol4))) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol5))) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol6))) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (Intrinsics.areEqual(protocol, Protocol.access$getProtocol$p(protocol7))) {
                return protocol7;
            }
            Protocol protocol8 = Protocol.HTTP_3;
            if (e.u(protocol, Protocol.access$getProtocol$p(protocol8), false)) {
                return protocol8;
            }
            dmk.x("Unexpected protocol: ".concat(protocol));
            return null;
        }

        private Companion() {
        }
    }
}
