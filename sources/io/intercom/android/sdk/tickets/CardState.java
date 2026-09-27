package io.intercom.android.sdk.tickets;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/tickets/CardState;", "", "<init>", "(Ljava/lang/String;I)V", "TimelineCard", "SubmissionCard", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CardState {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CardState[] $VALUES;
    public static final CardState TimelineCard = new CardState("TimelineCard", 0);
    public static final CardState SubmissionCard = new CardState("SubmissionCard", 1);

    private static final /* synthetic */ CardState[] $values() {
        return new CardState[]{TimelineCard, SubmissionCard};
    }

    static {
        CardState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CardState(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CardState valueOf(String str) {
        return (CardState) Enum.valueOf(CardState.class, str);
    }

    public static CardState[] values() {
        return (CardState[]) $VALUES.clone();
    }
}
