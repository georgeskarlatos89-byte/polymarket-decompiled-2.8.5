package defpackage;

import com.polymarket.clients.ClientChatChannelID;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lo3 implements no3 {
    public final ClientChatChannelID a;
    public final List b;

    public lo3(ClientChatChannelID clientChatChannelID, List list) {
        clientChatChannelID.getClass();
        list.getClass();
        this.a = clientChatChannelID;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3Var = (lo3) obj;
        if (Intrinsics.areEqual(this.a, lo3Var.a) && Intrinsics.areEqual(this.b, lo3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TypingUsersChanged(channelId=" + this.a + ", users=" + this.b + ")";
    }
}
