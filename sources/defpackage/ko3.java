package defpackage;

import com.polymarket.clients.ClientChatChannelID;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ko3 implements no3 {
    public final ClientChatChannelID a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public ko3(ClientChatChannelID clientChatChannelID, List list, boolean z, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 8) != 0 ? false : z;
        clientChatChannelID.getClass();
        list.getClass();
        this.a = clientChatChannelID;
        this.b = list;
        this.c = z2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko3)) {
            return false;
        }
        ko3 ko3Var = (ko3) obj;
        if (Intrinsics.areEqual(this.a, ko3Var.a) && Intrinsics.areEqual(this.b, ko3Var.b) && this.c == ko3Var.c && this.d == ko3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + hdi.g(hdi.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MessagesUpdated(channelId=" + this.a + ", messages=" + this.b + ", isLiveArrival=" + this.c + ", isUpdate=" + this.d + ")";
    }
}
