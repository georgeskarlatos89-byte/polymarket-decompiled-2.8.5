package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ug7;
import defpackage.ww4;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/models/MessageStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CHAT", HttpConstants.Methods.POST, "NOTE", "ADMIN_IS_TYPING_STYLE", "QUICK_REPLY", "ATTRIBUTE_COLLECTOR", "TICKET_STATE_UPDATED", "MERGED_PRIMARY_CONVERSATION", "FIN_ANSWER", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageStyle {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ MessageStyle[] $VALUES;

    @SerializedName("chat")
    public static final MessageStyle CHAT = new MessageStyle("CHAT", 0);

    @SerializedName("announcement")
    public static final MessageStyle POST = new MessageStyle(HttpConstants.Methods.POST, 1);

    @SerializedName("small-announcement")
    public static final MessageStyle NOTE = new MessageStyle("NOTE", 2);

    @SerializedName("admin_is_typing_style")
    public static final MessageStyle ADMIN_IS_TYPING_STYLE = new MessageStyle("ADMIN_IS_TYPING_STYLE", 3);

    @SerializedName(MetricTracker.Object.QUICK_REPLY)
    public static final MessageStyle QUICK_REPLY = new MessageStyle("QUICK_REPLY", 4);

    @SerializedName("attribute_collector")
    public static final MessageStyle ATTRIBUTE_COLLECTOR = new MessageStyle("ATTRIBUTE_COLLECTOR", 5);

    @SerializedName("ticket_state_updated")
    public static final MessageStyle TICKET_STATE_UPDATED = new MessageStyle("TICKET_STATE_UPDATED", 6);

    @SerializedName("merged_primary_conversation")
    public static final MessageStyle MERGED_PRIMARY_CONVERSATION = new MessageStyle("MERGED_PRIMARY_CONVERSATION", 7);

    @SerializedName("fin_answer")
    public static final MessageStyle FIN_ANSWER = new MessageStyle("FIN_ANSWER", 8);

    private static final /* synthetic */ MessageStyle[] $values() {
        return new MessageStyle[]{CHAT, POST, NOTE, ADMIN_IS_TYPING_STYLE, QUICK_REPLY, ATTRIBUTE_COLLECTOR, TICKET_STATE_UPDATED, MERGED_PRIMARY_CONVERSATION, FIN_ANSWER};
    }

    static {
        MessageStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private MessageStyle(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static MessageStyle valueOf(String str) {
        return (MessageStyle) Enum.valueOf(MessageStyle.class, str);
    }

    public static MessageStyle[] values() {
        return (MessageStyle[]) $VALUES.clone();
    }
}
