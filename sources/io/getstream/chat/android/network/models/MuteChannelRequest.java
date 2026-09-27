package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/MuteChannelRequest;", "", "", "expiration", "", "", "channelCids", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lio/getstream/chat/android/network/models/MuteChannelRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MuteChannelRequest {
    public final Integer a;
    public final List b;

    public /* synthetic */ MuteChannelRequest(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final MuteChannelRequest copy(@zca(name = "expiration") Integer expiration, @zca(name = "channel_cids") List<String> channelCids) {
        return new MuteChannelRequest(expiration, channelCids);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MuteChannelRequest)) {
            return false;
        }
        MuteChannelRequest muteChannelRequest = (MuteChannelRequest) obj;
        if (Intrinsics.areEqual(this.a, muteChannelRequest.a) && Intrinsics.areEqual(this.b, muteChannelRequest.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "MuteChannelRequest(expiration=" + this.a + ", channelCids=" + this.b + ")";
    }

    public MuteChannelRequest(@zca(name = "expiration") Integer num, @zca(name = "channel_cids") List<String> list) {
        this.a = num;
        this.b = list;
    }
}
