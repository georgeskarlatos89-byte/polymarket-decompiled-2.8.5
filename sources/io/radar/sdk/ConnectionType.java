package io.radar.sdk;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/radar/sdk/ConnectionType;", "", "(Ljava/lang/String;I)V", "cellular", "unknown", "wifi", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectionType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ConnectionType[] $VALUES;
    public static final ConnectionType cellular = new ConnectionType("cellular", 0);
    public static final ConnectionType unknown = new ConnectionType("unknown", 1);
    public static final ConnectionType wifi = new ConnectionType("wifi", 2);

    private static final /* synthetic */ ConnectionType[] $values() {
        return new ConnectionType[]{cellular, unknown, wifi};
    }

    static {
        ConnectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ConnectionType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ConnectionType valueOf(String str) {
        return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
    }

    public static ConnectionType[] values() {
        return (ConnectionType[]) $VALUES.clone();
    }
}
