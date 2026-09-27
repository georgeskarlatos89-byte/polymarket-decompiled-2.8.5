package com.stripe.android.paymentsheet.analytics;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.wg7;
import io.intercom.android.sdk.NotificationStatuses;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/stripe/android/paymentsheet/analytics/EventReporter$Mode", "", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "a", "Complete", "Custom", "Embedded", "paymentsheet_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventReporter$Mode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ EventReporter$Mode[] $VALUES;
    public static final EventReporter$Mode Complete;
    public static final EventReporter$Mode Custom;
    public static final EventReporter$Mode Embedded;
    private final String code;

    static {
        EventReporter$Mode eventReporter$Mode = new EventReporter$Mode("Complete", 0, NotificationStatuses.COMPLETE_STATUS);
        Complete = eventReporter$Mode;
        EventReporter$Mode eventReporter$Mode2 = new EventReporter$Mode("Custom", 1, "custom");
        Custom = eventReporter$Mode2;
        EventReporter$Mode eventReporter$Mode3 = new EventReporter$Mode("Embedded", 2, "embedded");
        Embedded = eventReporter$Mode3;
        EventReporter$Mode[] eventReporter$ModeArr = {eventReporter$Mode, eventReporter$Mode2, eventReporter$Mode3};
        $VALUES = eventReporter$ModeArr;
        $ENTRIES = new wg7(eventReporter$ModeArr);
    }

    public EventReporter$Mode(String str, int i, String str2) {
        this.code = str2;
    }

    public static EventReporter$Mode valueOf(String str) {
        return (EventReporter$Mode) Enum.valueOf(EventReporter$Mode.class, str);
    }

    public static EventReporter$Mode[] values() {
        return (EventReporter$Mode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
