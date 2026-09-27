package io.getstream.chat.android.models;

import defpackage.c1c;
import defpackage.ug7;
import defpackage.ww4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/models/SyncStatus;", "", "status", "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "SYNC_NEEDED", "COMPLETED", "FAILED_PERMANENTLY", "IN_PROGRESS", "AWAITING_ATTACHMENTS", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncStatus {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SyncStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<Integer, SyncStatus> map;
    private final int status;
    public static final SyncStatus SYNC_NEEDED = new SyncStatus("SYNC_NEEDED", 0, -1);
    public static final SyncStatus COMPLETED = new SyncStatus("COMPLETED", 1, 1);
    public static final SyncStatus FAILED_PERMANENTLY = new SyncStatus("FAILED_PERMANENTLY", 2, 2);
    public static final SyncStatus IN_PROGRESS = new SyncStatus("IN_PROGRESS", 3, 3);
    public static final SyncStatus AWAITING_ATTACHMENTS = new SyncStatus("AWAITING_ATTACHMENTS", 4, 4);

    private static final /* synthetic */ SyncStatus[] $values() {
        return new SyncStatus[]{SYNC_NEEDED, COMPLETED, FAILED_PERMANENTLY, IN_PROGRESS, AWAITING_ATTACHMENTS};
    }

    static {
        SyncStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
        ug7 entries = getEntries();
        int a = c1c.a(CollectionsKt.w(entries));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((SyncStatus) obj).status), obj);
        }
        map = linkedHashMap;
    }

    private SyncStatus(String str, int i, int i2) {
        this.status = i2;
    }

    public static final /* synthetic */ Map access$getMap$cp() {
        return map;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SyncStatus valueOf(String str) {
        return (SyncStatus) Enum.valueOf(SyncStatus.class, str);
    }

    public static SyncStatus[] values() {
        return (SyncStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/models/SyncStatus$Companion;", "", "<init>", "()V", "map", "", "", "Lio/getstream/chat/android/models/SyncStatus;", "fromInt", "type", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SyncStatus fromInt(int type) {
            return (SyncStatus) SyncStatus.access$getMap$cp().get(Integer.valueOf(type));
        }

        private Companion() {
        }
    }
}
