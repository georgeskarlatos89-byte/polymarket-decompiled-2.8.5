package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.sv6;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0006H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/UnreadTickets;", "", "totalCount", "", "unreadTicketIds", "", "", "<init>", "(ILjava/util/List;)V", "getTotalCount", "()I", "getUnreadTicketIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UnreadTickets {

    @SerializedName("total_count")
    private final int totalCount;

    @SerializedName("unread_ticket_ids")
    private final List<String> unreadTicketIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final UnreadTickets NULL = new UnreadTickets(0, CollectionsKt.emptyList());

    public UnreadTickets(int i, List<String> list) {
        list.getClass();
        this.totalCount = i;
        this.unreadTicketIds = list;
    }

    public static final /* synthetic */ UnreadTickets access$getNULL$cp() {
        return NULL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadTickets copy$default(UnreadTickets unreadTickets, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unreadTickets.totalCount;
        }
        if ((i2 & 2) != 0) {
            list = unreadTickets.unreadTicketIds;
        }
        return unreadTickets.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<String> component2() {
        return this.unreadTicketIds;
    }

    public final UnreadTickets copy(int totalCount, List<String> unreadTicketIds) {
        unreadTicketIds.getClass();
        return new UnreadTickets(totalCount, unreadTicketIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadTickets)) {
            return false;
        }
        UnreadTickets unreadTickets = (UnreadTickets) other;
        if (this.totalCount == unreadTickets.totalCount && Intrinsics.areEqual(this.unreadTicketIds, unreadTickets.unreadTicketIds)) {
            return true;
        }
        return false;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<String> getUnreadTicketIds() {
        return this.unreadTicketIds;
    }

    public int hashCode() {
        return this.unreadTicketIds.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnreadTickets(totalCount=");
        sb.append(this.totalCount);
        sb.append(", unreadTicketIds=");
        return sv6.r(sb, this.unreadTicketIds, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/UnreadTickets$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/UnreadTickets;", "getNULL", "()Lio/intercom/android/sdk/models/UnreadTickets;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnreadTickets getNULL() {
            return UnreadTickets.access$getNULL$cp();
        }

        private Companion() {
        }
    }
}
