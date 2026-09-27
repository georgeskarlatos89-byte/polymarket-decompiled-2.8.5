package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p2e extends g5 {
    public static final Parcelable.Creator<p2e> CREATOR = new o4l(15);
    public boolean a;
    public boolean b;
    public g83 c;
    public boolean d;
    public g5h e;
    public ArrayList f;
    public t8e g;
    public laj h;
    public boolean i;
    public String j;
    public byte[] k;
    public Bundle l;

    /* JADX WARN: Type inference failed for: r0v0, types: [p2e, g5] */
    public static p2e O(String str) {
        ?? g5Var = new g5();
        g5Var.i = true;
        arn.i(str, "paymentDataRequestJson cannot be null!");
        g5Var.j = str;
        return g5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        boolean z = this.a;
        hxn.o(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        hxn.o(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        hxn.i(parcel, 3, this.c, i);
        boolean z3 = this.d;
        hxn.o(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        hxn.i(parcel, 5, this.e, i);
        hxn.g(parcel, 6, this.f);
        hxn.i(parcel, 7, this.g, i);
        hxn.i(parcel, 8, this.h, i);
        boolean z4 = this.i;
        hxn.o(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        hxn.j(parcel, 10, this.j);
        hxn.b(parcel, 11, this.l);
        hxn.c(parcel, 12, this.k);
        hxn.q(parcel, p);
    }
}
