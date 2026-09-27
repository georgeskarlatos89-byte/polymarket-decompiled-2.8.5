package io.intercom.android.sdk.tickets.create.model;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "", TicketDetailDestinationKt.LAUNCHED_FROM, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "Conversation", "Home", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateTicketLaunchedFrom {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CreateTicketLaunchedFrom[] $VALUES;
    public static final CreateTicketLaunchedFrom Conversation = new CreateTicketLaunchedFrom("Conversation", 0, "conversation");
    public static final CreateTicketLaunchedFrom Home = new CreateTicketLaunchedFrom("Home", 1, MetricTracker.Context.HOME_SCREEN);
    private final String from;

    private static final /* synthetic */ CreateTicketLaunchedFrom[] $values() {
        return new CreateTicketLaunchedFrom[]{Conversation, Home};
    }

    static {
        CreateTicketLaunchedFrom[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CreateTicketLaunchedFrom(String str, int i, String str2) {
        this.from = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CreateTicketLaunchedFrom valueOf(String str) {
        return (CreateTicketLaunchedFrom) Enum.valueOf(CreateTicketLaunchedFrom.class, str);
    }

    public static CreateTicketLaunchedFrom[] values() {
        return (CreateTicketLaunchedFrom[]) $VALUES.clone();
    }

    public final String getFrom() {
        return this.from;
    }
}
