package io.getstream.chat.android.network.models;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.sv6;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/getstream/chat/android/network/models/BlockUsersRequest;", "", "", "blockedUserId", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lio/getstream/chat/android/network/models/BlockUsersRequest;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class BlockUsersRequest {
    public final String a;

    public BlockUsersRequest(@zca(name = "blocked_user_id") String str) {
        str.getClass();
        this.a = str;
    }

    public final BlockUsersRequest copy(@zca(name = "blocked_user_id") String blockedUserId) {
        blockedUserId.getClass();
        return new BlockUsersRequest(blockedUserId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockUsersRequest) && Intrinsics.areEqual(this.a, ((BlockUsersRequest) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("BlockUsersRequest(blockedUserId=", this.a, ")");
    }
}
