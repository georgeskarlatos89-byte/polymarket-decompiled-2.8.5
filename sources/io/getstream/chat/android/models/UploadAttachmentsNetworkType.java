package io.getstream.chat.android.models;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTED", "UNMETERED", "NOT_ROAMING", "METERED", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UploadAttachmentsNetworkType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ UploadAttachmentsNetworkType[] $VALUES;
    public static final UploadAttachmentsNetworkType CONNECTED = new UploadAttachmentsNetworkType("CONNECTED", 0);
    public static final UploadAttachmentsNetworkType UNMETERED = new UploadAttachmentsNetworkType("UNMETERED", 1);
    public static final UploadAttachmentsNetworkType NOT_ROAMING = new UploadAttachmentsNetworkType("NOT_ROAMING", 2);
    public static final UploadAttachmentsNetworkType METERED = new UploadAttachmentsNetworkType("METERED", 3);

    private static final /* synthetic */ UploadAttachmentsNetworkType[] $values() {
        return new UploadAttachmentsNetworkType[]{CONNECTED, UNMETERED, NOT_ROAMING, METERED};
    }

    static {
        UploadAttachmentsNetworkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private UploadAttachmentsNetworkType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static UploadAttachmentsNetworkType valueOf(String str) {
        return (UploadAttachmentsNetworkType) Enum.valueOf(UploadAttachmentsNetworkType.class, str);
    }

    public static UploadAttachmentsNetworkType[] values() {
        return (UploadAttachmentsNetworkType[]) $VALUES.clone();
    }
}
