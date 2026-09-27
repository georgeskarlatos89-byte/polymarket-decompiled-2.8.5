package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class k98 extends l98 {
    public final Date a;

    public k98(Date date) {
        this.a = date;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof k98) || !Intrinsics.areEqual(this.a, ((k98) obj).a)) {
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
        return "Upcoming(startDate=" + this.a + ")";
    }
}
