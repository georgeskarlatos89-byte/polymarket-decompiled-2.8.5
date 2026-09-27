package io.intercom.android.sdk.tickets;

import defpackage.hpn;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.R;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketStatus;", "", "Lib4;", "color", "", "iconRes", "<init>", "(Ljava/lang/String;IJI)V", "J", "getColor-0d7_KjU", "()J", "I", "getIconRes", "()I", "Submitted", "InProgress", "WaitingOnCustomer", "Resolved", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TicketStatus {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TicketStatus[] $VALUES;
    private final long color;
    private final int iconRes;
    public static final TicketStatus Submitted = new TicketStatus("Submitted", 0, hpn.c(4278212607L), R.drawable.intercom_ticket_submitted_icon);
    public static final TicketStatus InProgress = new TicketStatus("InProgress", 1, hpn.c(4278212607L), R.drawable.intercom_ticket_submitted_icon);
    public static final TicketStatus WaitingOnCustomer = new TicketStatus("WaitingOnCustomer", 2, hpn.c(4291644690L), R.drawable.intercom_ticket_waiting_icon);
    public static final TicketStatus Resolved = new TicketStatus("Resolved", 3, hpn.c(4279072050L), R.drawable.intercom_ticket_resolved_icon);

    private static final /* synthetic */ TicketStatus[] $values() {
        return new TicketStatus[]{Submitted, InProgress, WaitingOnCustomer, Resolved};
    }

    static {
        TicketStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private TicketStatus(String str, int i, long j, int i2) {
        this.color = j;
        this.iconRes = i2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TicketStatus valueOf(String str) {
        return (TicketStatus) Enum.valueOf(TicketStatus.class, str);
    }

    public static TicketStatus[] values() {
        return (TicketStatus[]) $VALUES.clone();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}
