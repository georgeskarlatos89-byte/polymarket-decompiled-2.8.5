package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/models/TicketAttributeType;", "", "<init>", "(Ljava/lang/String;I)V", "STRING", "INTEGER", "FLOAT", "BOOLEAN", "DATETIME", "LIST", "FILES", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TicketAttributeType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TicketAttributeType[] $VALUES;

    @SerializedName("string")
    public static final TicketAttributeType STRING = new TicketAttributeType("STRING", 0);

    @SerializedName(AttributeType.INTEGER)
    public static final TicketAttributeType INTEGER = new TicketAttributeType("INTEGER", 1);

    @SerializedName(AttributeType.FLOAT)
    public static final TicketAttributeType FLOAT = new TicketAttributeType("FLOAT", 2);

    @SerializedName(AttributeType.BOOLEAN)
    public static final TicketAttributeType BOOLEAN = new TicketAttributeType("BOOLEAN", 3);

    @SerializedName("datetime")
    public static final TicketAttributeType DATETIME = new TicketAttributeType("DATETIME", 4);

    @SerializedName(AttributeType.LIST)
    public static final TicketAttributeType LIST = new TicketAttributeType("LIST", 5);

    @SerializedName("files")
    public static final TicketAttributeType FILES = new TicketAttributeType("FILES", 6);

    private static final /* synthetic */ TicketAttributeType[] $values() {
        return new TicketAttributeType[]{STRING, INTEGER, FLOAT, BOOLEAN, DATETIME, LIST, FILES};
    }

    static {
        TicketAttributeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private TicketAttributeType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TicketAttributeType valueOf(String str) {
        return (TicketAttributeType) Enum.valueOf(TicketAttributeType.class, str);
    }

    public static TicketAttributeType[] values() {
        return (TicketAttributeType[]) $VALUES.clone();
    }
}
