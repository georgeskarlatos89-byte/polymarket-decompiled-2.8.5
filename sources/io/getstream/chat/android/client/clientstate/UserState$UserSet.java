package io.getstream.chat.android.client.clientstate;

import defpackage.o0k;
import io.getstream.chat.android.models.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/getstream/chat/android/client/clientstate/UserState$UserSet", "Lo0k;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserState$UserSet extends o0k {
    public final User a;

    public UserState$UserSet(User user) {
        user.getClass();
        this.a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UserState$UserSet) && Intrinsics.areEqual(this.a, ((UserState$UserSet) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserSet(user=" + this.a + ")";
    }
}
