package io.getstream.chat.android.models;

import defpackage.sv6;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/models/MessageModerationAction;", "", "rawValue", "", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageModerationAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MessageModerationAction block;
    private static final MessageModerationAction bounce;
    private static final MessageModerationAction flag;
    private static final Set<MessageModerationAction> values;
    private final String rawValue;

    static {
        MessageModerationAction messageModerationAction = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_BOUNCE");
        bounce = messageModerationAction;
        MessageModerationAction messageModerationAction2 = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_FLAG");
        flag = messageModerationAction2;
        MessageModerationAction messageModerationAction3 = new MessageModerationAction("MESSAGE_RESPONSE_ACTION_BLOCK");
        block = messageModerationAction3;
        values = ArraysKt.l0(new MessageModerationAction[]{messageModerationAction, messageModerationAction2, messageModerationAction3});
    }

    public MessageModerationAction(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public static final /* synthetic */ MessageModerationAction access$getBlock$cp() {
        return block;
    }

    public static final /* synthetic */ MessageModerationAction access$getBounce$cp() {
        return bounce;
    }

    public static final /* synthetic */ MessageModerationAction access$getFlag$cp() {
        return flag;
    }

    public static final /* synthetic */ Set access$getValues$cp() {
        return values;
    }

    public static /* synthetic */ MessageModerationAction copy$default(MessageModerationAction messageModerationAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageModerationAction.rawValue;
        }
        return messageModerationAction.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    public final MessageModerationAction copy(String rawValue) {
        rawValue.getClass();
        return new MessageModerationAction(rawValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof MessageModerationAction) && Intrinsics.areEqual(this.rawValue, ((MessageModerationAction) other).rawValue)) {
            return true;
        }
        return false;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public int hashCode() {
        return this.rawValue.hashCode();
    }

    public String toString() {
        return sv6.n("MessageModerationAction(rawValue=", this.rawValue, ")");
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/getstream/chat/android/models/MessageModerationAction$Companion;", "", "<init>", "()V", "bounce", "Lio/getstream/chat/android/models/MessageModerationAction;", "getBounce", "()Lio/getstream/chat/android/models/MessageModerationAction;", "flag", "getFlag", "block", "getBlock", "values", "", "getValues", "()Ljava/util/Set;", "fromRawValue", "rawValue", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MessageModerationAction fromRawValue(String rawValue) {
            Object obj;
            rawValue.getClass();
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((MessageModerationAction) obj).getRawValue(), rawValue)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MessageModerationAction messageModerationAction = (MessageModerationAction) obj;
            if (messageModerationAction == null) {
                return new MessageModerationAction(rawValue);
            }
            return messageModerationAction;
        }

        public final MessageModerationAction getBlock() {
            return MessageModerationAction.access$getBlock$cp();
        }

        public final MessageModerationAction getBounce() {
            return MessageModerationAction.access$getBounce$cp();
        }

        public final MessageModerationAction getFlag() {
            return MessageModerationAction.access$getFlag$cp();
        }

        public final Set<MessageModerationAction> getValues() {
            return MessageModerationAction.access$getValues$cp();
        }

        private Companion() {
        }
    }
}
