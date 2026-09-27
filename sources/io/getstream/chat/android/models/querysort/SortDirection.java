package io.getstream.chat.android.models.querysort;

import defpackage.dmk;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/models/querysort/SortDirection;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DESC", "ASC", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortDirection {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SortDirection[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final SortDirection DESC = new SortDirection("DESC", 0, -1);
    public static final SortDirection ASC = new SortDirection("ASC", 1, 1);

    private static final /* synthetic */ SortDirection[] $values() {
        return new SortDirection[]{DESC, ASC};
    }

    static {
        SortDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private SortDirection(String str, int i, int i2) {
        this.value = i2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SortDirection valueOf(String str) {
        return (SortDirection) Enum.valueOf(SortDirection.class, str);
    }

    public static SortDirection[] values() {
        return (SortDirection[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/getstream/chat/android/models/querysort/SortDirection$Companion;", "", "<init>", "()V", "fromNumber", "Lio/getstream/chat/android/models/querysort/SortDirection;", "value", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SortDirection fromNumber(int value) {
            if (value != -1) {
                if (value == 1) {
                    return SortDirection.ASC;
                }
                dmk.v("Unsupported sort direction");
                return null;
            }
            return SortDirection.DESC;
        }

        private Companion() {
        }
    }
}
