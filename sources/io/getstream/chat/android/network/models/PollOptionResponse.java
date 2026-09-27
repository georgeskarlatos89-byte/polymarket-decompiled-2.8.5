package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/network/models/PollOptionResponse;", "", "", "duration", "Lio/getstream/chat/android/network/models/PollOptionResponseData;", "pollOption", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/network/models/PollOptionResponseData;)V", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/network/models/PollOptionResponseData;)Lio/getstream/chat/android/network/models/PollOptionResponse;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class PollOptionResponse {
    public final String a;
    public final PollOptionResponseData b;

    public PollOptionResponse(@zca(name = "duration") String str, @zca(name = "poll_option") PollOptionResponseData pollOptionResponseData) {
        str.getClass();
        pollOptionResponseData.getClass();
        this.a = str;
        this.b = pollOptionResponseData;
    }

    public final PollOptionResponse copy(@zca(name = "duration") String duration, @zca(name = "poll_option") PollOptionResponseData pollOption) {
        duration.getClass();
        pollOption.getClass();
        return new PollOptionResponse(duration, pollOption);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionResponse)) {
            return false;
        }
        PollOptionResponse pollOptionResponse = (PollOptionResponse) obj;
        if (Intrinsics.areEqual(this.a, pollOptionResponse.a) && Intrinsics.areEqual(this.b, pollOptionResponse.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PollOptionResponse(duration=" + this.a + ", pollOption=" + this.b + ")";
    }
}
