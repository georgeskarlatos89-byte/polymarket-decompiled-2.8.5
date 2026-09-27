package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/Action;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_SENT", "ADMIN_MESSAGE_RECEIVED", "OPERATOR_MESSAGE_RECEIVED", "MESSAGE_FAILED", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Action {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final Action MESSAGE_SENT = new Action("MESSAGE_SENT", 0);
    public static final Action ADMIN_MESSAGE_RECEIVED = new Action("ADMIN_MESSAGE_RECEIVED", 1);
    public static final Action OPERATOR_MESSAGE_RECEIVED = new Action("OPERATOR_MESSAGE_RECEIVED", 2);
    public static final Action MESSAGE_FAILED = new Action("MESSAGE_FAILED", 3);

    private static final /* synthetic */ Action[] $values() {
        return new Action[]{MESSAGE_SENT, ADMIN_MESSAGE_RECEIVED, OPERATOR_MESSAGE_RECEIVED, MESSAGE_FAILED};
    }

    static {
        Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private Action(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
