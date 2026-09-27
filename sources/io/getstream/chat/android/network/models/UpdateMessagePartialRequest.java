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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJT\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0018\b\u0003\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/getstream/chat/android/network/models/UpdateMessagePartialRequest;", "", "", "skipEnrichUrl", "skipPush", "", "", NavigationContext.UNSET, "", "set", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/network/models/UpdateMessagePartialRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class UpdateMessagePartialRequest {
    public final Boolean a;
    public final Boolean b;
    public final List c;
    public final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UpdateMessagePartialRequest(Boolean bool, Boolean bool2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, list, map);
        bool = (i & 1) != 0 ? null : bool;
        bool2 = (i & 2) != 0 ? null : bool2;
        list = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 8) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final UpdateMessagePartialRequest copy(@zca(name = "skip_enrich_url") Boolean skipEnrichUrl, @zca(name = "skip_push") Boolean skipPush, @zca(name = "unset") List<String> unset, @zca(name = "set") Map<String, ? extends Object> set) {
        return new UpdateMessagePartialRequest(skipEnrichUrl, skipPush, unset, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMessagePartialRequest)) {
            return false;
        }
        UpdateMessagePartialRequest updateMessagePartialRequest = (UpdateMessagePartialRequest) obj;
        if (Intrinsics.areEqual(this.a, updateMessagePartialRequest.a) && Intrinsics.areEqual(this.b, updateMessagePartialRequest.b) && Intrinsics.areEqual(this.c, updateMessagePartialRequest.c) && Intrinsics.areEqual(this.d, updateMessagePartialRequest.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Boolean bool = this.a;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.b;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.c;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "UpdateMessagePartialRequest(skipEnrichUrl=" + this.a + ", skipPush=" + this.b + ", unset=" + this.c + ", set=" + this.d + ")";
    }

    public UpdateMessagePartialRequest(@zca(name = "skip_enrich_url") Boolean bool, @zca(name = "skip_push") Boolean bool2, @zca(name = "unset") List<String> list, @zca(name = "set") Map<String, ? extends Object> map) {
        this.a = bool;
        this.b = bool2;
        this.c = list;
        this.d = map;
    }
}
