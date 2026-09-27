package defpackage;

import com.polymarket.clients.ChatConnectionState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class io3 implements no3 {
    public final ChatConnectionState a;

    public io3(ChatConnectionState chatConnectionState) {
        chatConnectionState.getClass();
        this.a = chatConnectionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof io3) && this.a == ((io3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectionStateChanged(state=" + this.a + ")";
    }
}
