package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/UpdatePollPartialRequest;", "", "", "", NavigationContext.UNSET, "", "set", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/UpdatePollPartialRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePollPartialRequest {
    public final List a;
    public final Map b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdatePollPartialRequest(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map);
        list = (i & 1) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final UpdatePollPartialRequest copy(@zca(name = "unset") List<String> unset, @zca(name = "set") Map<String, ? extends Object> set) {
        return new UpdatePollPartialRequest(unset, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePollPartialRequest)) {
            return false;
        }
        UpdatePollPartialRequest updatePollPartialRequest = (UpdatePollPartialRequest) obj;
        if (Intrinsics.areEqual(this.a, updatePollPartialRequest.a) && Intrinsics.areEqual(this.b, updatePollPartialRequest.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        List list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "UpdatePollPartialRequest(unset=" + this.a + ", set=" + this.b + ")";
    }

    public UpdatePollPartialRequest(@zca(name = "unset") List<String> list, @zca(name = "set") Map<String, ? extends Object> map) {
        this.a = list;
        this.b = map;
    }
}
