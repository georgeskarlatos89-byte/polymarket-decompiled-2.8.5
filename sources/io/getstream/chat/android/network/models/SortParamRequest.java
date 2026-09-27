package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/SortParamRequest;", "", "", "direction", "", "field", "type", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/network/models/SortParamRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SortParamRequest {
    public final Integer a;
    public final String b;
    public final String c;

    public /* synthetic */ SortParamRequest(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public final SortParamRequest copy(@zca(name = "direction") Integer direction, @zca(name = "field") String field, @zca(name = "type") String type) {
        return new SortParamRequest(direction, field, type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortParamRequest)) {
            return false;
        }
        SortParamRequest sortParamRequest = (SortParamRequest) obj;
        if (Intrinsics.areEqual(this.a, sortParamRequest.a) && Intrinsics.areEqual(this.b, sortParamRequest.b) && Intrinsics.areEqual(this.c, sortParamRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SortParamRequest(direction=");
        sb.append(this.a);
        sb.append(", field=");
        sb.append(this.b);
        sb.append(", type=");
        return woa.r(sb, this.c, ")");
    }

    public SortParamRequest(@zca(name = "direction") Integer num, @zca(name = "field") String str, @zca(name = "type") String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }
}
