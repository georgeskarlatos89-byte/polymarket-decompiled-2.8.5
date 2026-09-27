package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/getstream/chat/android/network/models/MarkReadRequest;", "", "", "messageId", "threadId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/network/models/MarkReadRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class MarkReadRequest {
    public final String a;
    public final String b;

    public /* synthetic */ MarkReadRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final MarkReadRequest copy(@zca(name = "message_id") String messageId, @zca(name = "thread_id") String threadId) {
        return new MarkReadRequest(messageId, threadId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkReadRequest)) {
            return false;
        }
        MarkReadRequest markReadRequest = (MarkReadRequest) obj;
        if (Intrinsics.areEqual(this.a, markReadRequest.a) && Intrinsics.areEqual(this.b, markReadRequest.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return hdi.p("MarkReadRequest(messageId=", this.a, ", threadId=", this.b, ")");
    }

    public MarkReadRequest(@zca(name = "message_id") String str, @zca(name = "thread_id") String str2) {
        this.a = str;
        this.b = str2;
    }
}
