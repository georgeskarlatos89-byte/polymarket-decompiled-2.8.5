package io.getstream.chat.android.models;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/getstream/chat/android/models/InitializationState;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLETE", "INITIALIZING", "NOT_INITIALIZED", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InitializationState {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ InitializationState[] $VALUES;
    public static final InitializationState COMPLETE = new InitializationState("COMPLETE", 0);
    public static final InitializationState INITIALIZING = new InitializationState("INITIALIZING", 1);
    public static final InitializationState NOT_INITIALIZED = new InitializationState("NOT_INITIALIZED", 2);

    private static final /* synthetic */ InitializationState[] $values() {
        return new InitializationState[]{COMPLETE, INITIALIZING, NOT_INITIALIZED};
    }

    static {
        InitializationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private InitializationState(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static InitializationState valueOf(String str) {
        return (InitializationState) Enum.valueOf(InitializationState.class, str);
    }

    public static InitializationState[] values() {
        return (InitializationState[]) $VALUES.clone();
    }
}
