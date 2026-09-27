package io.getstream.chat.android.client.api2.model.requests;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/requests/SyncHistoryRequest;", "", "channel_cids", "", "", "last_sync_at", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getChannel_cids", "()Ljava/util/List;", "getLast_sync_at", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SyncHistoryRequest {
    private final List<String> channel_cids;
    private final String last_sync_at;

    public SyncHistoryRequest(List<String> list, String str) {
        list.getClass();
        str.getClass();
        this.channel_cids = list;
        this.last_sync_at = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncHistoryRequest copy$default(SyncHistoryRequest syncHistoryRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncHistoryRequest.channel_cids;
        }
        if ((i & 2) != 0) {
            str = syncHistoryRequest.last_sync_at;
        }
        return syncHistoryRequest.copy(list, str);
    }

    public final List<String> component1() {
        return this.channel_cids;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLast_sync_at() {
        return this.last_sync_at;
    }

    public final SyncHistoryRequest copy(List<String> channel_cids, String last_sync_at) {
        channel_cids.getClass();
        last_sync_at.getClass();
        return new SyncHistoryRequest(channel_cids, last_sync_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncHistoryRequest)) {
            return false;
        }
        SyncHistoryRequest syncHistoryRequest = (SyncHistoryRequest) other;
        if (Intrinsics.areEqual(this.channel_cids, syncHistoryRequest.channel_cids) && Intrinsics.areEqual(this.last_sync_at, syncHistoryRequest.last_sync_at)) {
            return true;
        }
        return false;
    }

    public final List<String> getChannel_cids() {
        return this.channel_cids;
    }

    public final String getLast_sync_at() {
        return this.last_sync_at;
    }

    public int hashCode() {
        return this.last_sync_at.hashCode() + (this.channel_cids.hashCode() * 31);
    }

    public String toString() {
        return "SyncHistoryRequest(channel_cids=" + this.channel_cids + ", last_sync_at=" + this.last_sync_at + ")";
    }
}
