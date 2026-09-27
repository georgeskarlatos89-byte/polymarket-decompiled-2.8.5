package defpackage;

import io.getstream.chat.android.models.User;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class u0k extends v0k {
    public final User a;

    public u0k(User user) {
        this.a = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u0k) || !Intrinsics.areEqual(this.a, ((u0k) obj).a)) {
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
        return "UserUpdated(user=" + this.a + ")";
    }
}
