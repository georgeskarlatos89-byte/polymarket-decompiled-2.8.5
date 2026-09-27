package io.getstream.chat.android.models;

import defpackage.ug7;
import defpackage.ww4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/models/PushProvider;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "FIREBASE", "HUAWEI", "XIAOMI", "UNKNOWN", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushProvider {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ PushProvider[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String key;
    public static final PushProvider FIREBASE = new PushProvider("FIREBASE", 0, "firebase");
    public static final PushProvider HUAWEI = new PushProvider("HUAWEI", 1, "huawei");
    public static final PushProvider XIAOMI = new PushProvider("XIAOMI", 2, "xiaomi");
    public static final PushProvider UNKNOWN = new PushProvider("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ PushProvider[] $values() {
        return new PushProvider[]{FIREBASE, HUAWEI, XIAOMI, UNKNOWN};
    }

    static {
        PushProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private PushProvider(String str, int i, String str2) {
        this.key = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static PushProvider valueOf(String str) {
        return (PushProvider) Enum.valueOf(PushProvider.class, str);
    }

    public static PushProvider[] values() {
        return (PushProvider[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/getstream/chat/android/models/PushProvider$Companion;", "", "<init>", "()V", "fromKey", "Lio/getstream/chat/android/models/PushProvider;", "key", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PushProvider fromKey(String key) {
            Object obj;
            key.getClass();
            Iterator<E> it = PushProvider.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((PushProvider) obj).getKey(), key)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PushProvider pushProvider = (PushProvider) obj;
            if (pushProvider == null) {
                return PushProvider.UNKNOWN;
            }
            return pushProvider;
        }

        private Companion() {
        }
    }
}
