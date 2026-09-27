package defpackage;

import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultColors;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a6j {
    public static final int f = FontFamily.$stable;
    public final pwi a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public /* synthetic */ a6j() {
        this(new pwi((String) null, (Integer) null, (wxi) null, 15), DefaultColors.SCROLLED_CONTAINER, 4294967295L, DefaultColors.PRIMARY, DefaultColors.PRIMARY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6j)) {
            return false;
        }
        a6j a6jVar = (a6j) obj;
        if (Intrinsics.areEqual(this.a, a6jVar.a) && this.b == a6jVar.b && this.c == a6jVar.c && this.d == a6jVar.d && this.e == a6jVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + woa.d(woa.d(woa.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopAppBarViewStyle(titleStyle=");
        sb.append(this.a);
        sb.append(", scrolledContainerColor=");
        sb.append(this.b);
        ix2.A(sb, ", containerColor=", this.c, ", navigationIconTintColor=");
        sb.append(this.d);
        sb.append(", actionIconTintColor=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public a6j(pwi pwiVar, long j, long j2, long j3, long j4) {
        this.a = pwiVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }
}
