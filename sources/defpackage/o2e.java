package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o2e extends g5 {
    public static final Parcelable.Creator<o2e> CREATOR = new o4l(12);
    public String a;
    public t63 b;
    public UserAddress c;
    public s8e d;
    public String e;
    public Bundle f;
    public String g;
    public Bundle h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.i(parcel, 2, this.b, i);
        hxn.i(parcel, 3, this.c, i);
        hxn.i(parcel, 4, this.d, i);
        hxn.j(parcel, 5, this.e);
        hxn.b(parcel, 6, this.f);
        hxn.j(parcel, 7, this.g);
        hxn.b(parcel, 8, this.h);
        hxn.q(parcel, p);
    }
}
