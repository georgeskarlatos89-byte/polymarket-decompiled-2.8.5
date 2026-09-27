package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class mme extends nme {
    public final Date a;

    public mme(Date date) {
        this.a = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mme) && Intrinsics.areEqual(this.a, ((mme) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BeforeDate(date=" + this.a + ", inclusive=true)";
    }
}
