package defpackage;

import io.getstream.chat.android.models.User;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s0k extends v0k {
    public final User a;

    public s0k(User user) {
        user.getClass();
        this.a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s0k) && Intrinsics.areEqual(this.a, ((s0k) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConnectUser(user=" + this.a + ")";
    }
}
