package io.getstream.chat.android.models;

import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/models/ChatPreferenceToggle;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatPreferenceToggle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ChatPreferenceToggle all = new ChatPreferenceToggle("all");
    private static final ChatPreferenceToggle none = new ChatPreferenceToggle("none");
    private final String value;

    public ChatPreferenceToggle(String str) {
        str.getClass();
        this.value = str;
    }

    public static final /* synthetic */ ChatPreferenceToggle access$getAll$cp() {
        return all;
    }

    public static final /* synthetic */ ChatPreferenceToggle access$getNone$cp() {
        return none;
    }

    public static /* synthetic */ ChatPreferenceToggle copy$default(ChatPreferenceToggle chatPreferenceToggle, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatPreferenceToggle.value;
        }
        return chatPreferenceToggle.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ChatPreferenceToggle copy(String value) {
        value.getClass();
        return new ChatPreferenceToggle(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ChatPreferenceToggle) && Intrinsics.areEqual(this.value, ((ChatPreferenceToggle) other).value)) {
            return true;
        }
        return false;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return sv6.n("ChatPreferenceToggle(value=", this.value, ")");
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lio/getstream/chat/android/models/ChatPreferenceToggle$Companion;", "", "<init>", "()V", "all", "Lio/getstream/chat/android/models/ChatPreferenceToggle;", "getAll", "()Lio/getstream/chat/android/models/ChatPreferenceToggle;", "none", "getNone", "fromValue", "value", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChatPreferenceToggle fromValue(String value) {
            if (value != null && !Intrinsics.areEqual(value, "")) {
                if (Intrinsics.areEqual(value, getAll().getValue())) {
                    return getAll();
                }
                if (Intrinsics.areEqual(value, getNone().getValue())) {
                    return getNone();
                }
                return new ChatPreferenceToggle(value);
            }
            return null;
        }

        public final ChatPreferenceToggle getAll() {
            return ChatPreferenceToggle.access$getAll$cp();
        }

        public final ChatPreferenceToggle getNone() {
            return ChatPreferenceToggle.access$getNone$cp();
        }

        private Companion() {
        }
    }
}
