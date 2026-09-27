package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zc7;
import defpackage.zca;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0003\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0018\b\u0003\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/getstream/chat/android/network/models/ReactionRequest;", "", "", "type", "Ljava/util/Date;", "createdAt", "", "score", "updatedAt", "", "custom", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/network/models/ReactionRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class ReactionRequest {
    public final String a;
    public final Date b;
    public final Integer c;
    public final Date d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReactionRequest(String str, Date date, Integer num, Date date2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, num, date2, map);
        date = (i & 2) != 0 ? null : date;
        num = (i & 4) != 0 ? null : num;
        date2 = (i & 8) != 0 ? null : date2;
        if ((i & 16) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final ReactionRequest copy(@zca(name = "type") String type, @zca(name = "created_at") Date createdAt, @zca(name = "score") Integer score, @zca(name = "updated_at") Date updatedAt, @zca(name = "custom") Map<String, ? extends Object> custom) {
        type.getClass();
        return new ReactionRequest(type, createdAt, score, updatedAt, custom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionRequest)) {
            return false;
        }
        ReactionRequest reactionRequest = (ReactionRequest) obj;
        if (Intrinsics.areEqual(this.a, reactionRequest.a) && Intrinsics.areEqual(this.b, reactionRequest.b) && Intrinsics.areEqual(this.c, reactionRequest.c) && Intrinsics.areEqual(this.d, reactionRequest.d) && Intrinsics.areEqual(this.e, reactionRequest.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i = 0;
        Date date = this.b;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date2 = this.d;
        if (date2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder u = sv6.u("ReactionRequest(type=", this.a, ", createdAt=", ", score=", this.b);
        u.append(this.c);
        u.append(", updatedAt=");
        u.append(this.d);
        u.append(", custom=");
        return ace.n(u, this.e, ")");
    }

    public ReactionRequest(@zca(name = "type") String str, @zca(name = "created_at") Date date, @zca(name = "score") Integer num, @zca(name = "updated_at") Date date2, @zca(name = "custom") Map<String, ? extends Object> map) {
        str.getClass();
        this.a = str;
        this.b = date;
        this.c = num;
        this.d = date2;
        this.e = map;
    }
}
