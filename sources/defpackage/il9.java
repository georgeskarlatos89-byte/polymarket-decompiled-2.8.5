package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class il9 implements d3g {
    public static final Parcelable.Creator<il9> CREATOR = new hl9(0);
    public final int a;
    public final List b;
    public final List c;

    public il9(int i, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.d3g
    public final String M(Context context) {
        context.getClass();
        List<a0g> list = this.b;
        Object[] g = xun.g(context, this.c);
        String string = context.getString(this.a, Arrays.copyOf(g, g.length));
        for (a0g a0gVar : list) {
            a0gVar.getClass();
            string.getClass();
            string = e.s(string, a0gVar.a, a0gVar.b);
        }
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il9)) {
            return false;
        }
        il9 il9Var = (il9) obj;
        if (this.a == il9Var.a && Intrinsics.areEqual(this.b, il9Var.b) && Intrinsics.areEqual(this.c, il9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentifierResolvableString(id=");
        sb.append(this.a);
        sb.append(", transformations=");
        sb.append(this.b);
        sb.append(", args=");
        return ix2.q(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        Iterator s = woa.s(this.b, parcel);
        while (s.hasNext()) {
            parcel.writeParcelable((Parcelable) s.next(), i);
        }
        Iterator s2 = woa.s(this.c, parcel);
        while (s2.hasNext()) {
            parcel.writeValue(s2.next());
        }
    }
}
