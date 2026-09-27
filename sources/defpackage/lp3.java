package defpackage;

import com.polymarket.clients.ClientChatUser;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lp3 implements mp3 {
    public final ClientChatUser a;

    public lp3(ClientChatUser clientChatUser) {
        this.a = clientChatUser;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof lp3) || !Intrinsics.areEqual(this.a, ((lp3) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "User(user=" + this.a + ")";
    }
}
