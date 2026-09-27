package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.behavior.model.NavigationContext;
import defpackage.ace;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJF\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/network/models/UpdateUserPartialRequest;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", NavigationContext.UNSET, "", "set", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/UpdateUserPartialRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdateUserPartialRequest {
    public final String a;
    public final List b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdateUserPartialRequest(String str, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, map);
        list = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 4) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final UpdateUserPartialRequest copy(@zca(name = "id") String id, @zca(name = "unset") List<String> unset, @zca(name = "set") Map<String, ? extends Object> set) {
        id.getClass();
        return new UpdateUserPartialRequest(id, unset, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUserPartialRequest)) {
            return false;
        }
        UpdateUserPartialRequest updateUserPartialRequest = (UpdateUserPartialRequest) obj;
        if (Intrinsics.areEqual(this.a, updateUserPartialRequest.a) && Intrinsics.areEqual(this.b, updateUserPartialRequest.b) && Intrinsics.areEqual(this.c, updateUserPartialRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateUserPartialRequest(id=");
        sb.append(this.a);
        sb.append(", unset=");
        sb.append(this.b);
        sb.append(", set=");
        return ace.n(sb, this.c, ")");
    }

    public UpdateUserPartialRequest(@zca(name = "id") String str, @zca(name = "unset") List<String> list, @zca(name = "set") Map<String, ? extends Object> map) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = map;
    }
}
