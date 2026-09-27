package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.zca;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/getstream/chat/android/network/models/SendReactionRequest;", "", "Lio/getstream/chat/android/network/models/ReactionRequest;", MetricTracker.Object.REACTION, "", "enforceUnique", "skipPush", "<init>", "(Lio/getstream/chat/android/network/models/ReactionRequest;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "copy", "(Lio/getstream/chat/android/network/models/ReactionRequest;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/chat/android/network/models/SendReactionRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class SendReactionRequest {
    public final ReactionRequest a;
    public final Boolean b;
    public final Boolean c;

    public /* synthetic */ SendReactionRequest(ReactionRequest reactionRequest, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactionRequest, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }

    public final SendReactionRequest copy(@zca(name = "reaction") ReactionRequest reaction, @zca(name = "enforce_unique") Boolean enforceUnique, @zca(name = "skip_push") Boolean skipPush) {
        reaction.getClass();
        return new SendReactionRequest(reaction, enforceUnique, skipPush);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendReactionRequest)) {
            return false;
        }
        SendReactionRequest sendReactionRequest = (SendReactionRequest) obj;
        if (Intrinsics.areEqual(this.a, sendReactionRequest.a) && Intrinsics.areEqual(this.b, sendReactionRequest.b) && Intrinsics.areEqual(this.c, sendReactionRequest.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "SendReactionRequest(reaction=" + this.a + ", enforceUnique=" + this.b + ", skipPush=" + this.c + ")";
    }

    public SendReactionRequest(@zca(name = "reaction") ReactionRequest reactionRequest, @zca(name = "enforce_unique") Boolean bool, @zca(name = "skip_push") Boolean bool2) {
        reactionRequest.getClass();
        this.a = reactionRequest;
        this.b = bool;
        this.c = bool2;
    }
}
