package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes4.dex */
public final class pwc implements axc {
    public static final pwc INSTANCE = new Object();
    public static final /* synthetic */ Lazy a = LazyKt.a(w4b.PUBLICATION, new isc(12));

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof pwc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -393216496;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "NotificationsScreen";
    }
}
