package defpackage;

import com.polymarket.clients.ClientChatUser;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jo3 implements no3 {
    public final ClientChatUser a;
    public final boolean b;
    public final Set c;

    public jo3(ClientChatUser clientChatUser, boolean z, Set set) {
        set.getClass();
        this.a = clientChatUser;
        this.b = z;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo3)) {
            return false;
        }
        jo3 jo3Var = (jo3) obj;
        if (Intrinsics.areEqual(this.a, jo3Var.a) && this.b == jo3Var.b && Intrinsics.areEqual(this.c, jo3Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        ClientChatUser clientChatUser = this.a;
        if (clientChatUser == null) {
            hashCode = 0;
        } else {
            hashCode = clientChatUser.hashCode();
        }
        return this.c.hashCode() + hdi.g(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "CurrentUserChanged(user=" + this.a + ", isBanned=" + this.b + ", mutedUserIds=" + this.c + ")";
    }
}
