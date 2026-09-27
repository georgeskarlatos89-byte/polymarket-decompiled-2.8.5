package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.woa;
import defpackage.zca;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/MarkUnreadRequest;", "", "", "messageId", "Ljava/util/Date;", "messageTimestamp", "threadId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lio/getstream/chat/android/network/models/MarkUnreadRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MarkUnreadRequest {
    public final String a;
    public final Date b;
    public final String c;

    public /* synthetic */ MarkUnreadRequest(String str, Date date, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : str2);
    }

    public final MarkUnreadRequest copy(@zca(name = "message_id") String messageId, @zca(name = "message_timestamp") Date messageTimestamp, @zca(name = "thread_id") String threadId) {
        return new MarkUnreadRequest(messageId, messageTimestamp, threadId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkUnreadRequest)) {
            return false;
        }
        MarkUnreadRequest markUnreadRequest = (MarkUnreadRequest) obj;
        if (Intrinsics.areEqual(this.a, markUnreadRequest.a) && Intrinsics.areEqual(this.b, markUnreadRequest.b) && Intrinsics.areEqual(this.c, markUnreadRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Date date = this.b;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return woa.r(sv6.u("MarkUnreadRequest(messageId=", this.a, ", messageTimestamp=", ", threadId=", this.b), this.c, ")");
    }

    public MarkUnreadRequest(@zca(name = "message_id") String str, @zca(name = "message_timestamp") Date date, @zca(name = "thread_id") String str2) {
        this.a = str;
        this.b = date;
        this.c = str2;
    }
}
