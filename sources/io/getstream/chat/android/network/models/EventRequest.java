package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.m51;
import defpackage.mda;
import defpackage.zc7;
import defpackage.zca;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/EventRequest;", "", "", "type", "parentId", "", "custom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/network/models/EventRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class EventRequest {
    public final String a;
    public final String b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventRequest(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final EventRequest copy(@zca(name = "type") String type, @zca(name = "parent_id") String parentId, @zca(name = "custom") Map<String, ? extends Object> custom) {
        type.getClass();
        return new EventRequest(type, parentId, custom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventRequest)) {
            return false;
        }
        EventRequest eventRequest = (EventRequest) obj;
        if (Intrinsics.areEqual(this.a, eventRequest.a) && Intrinsics.areEqual(this.b, eventRequest.b) && Intrinsics.areEqual(this.c, eventRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return ace.n(m51.r("EventRequest(type=", this.a, ", parentId=", this.b, ", custom="), this.c, ")");
    }

    public EventRequest(@zca(name = "type") String str, @zca(name = "parent_id") String str2, @zca(name = "custom") Map<String, ? extends Object> map) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
