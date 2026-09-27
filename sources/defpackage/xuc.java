package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes4.dex */
public final class xuc implements mwc {
    public static final xuc INSTANCE = new Object();
    public static final /* synthetic */ Lazy a = LazyKt.a(w4b.PUBLICATION, new isc(10));

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof xuc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -942863182;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "NotificationsScreen";
    }
}
