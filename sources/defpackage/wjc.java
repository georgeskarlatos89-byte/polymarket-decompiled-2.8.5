package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wjc extends g5 {
    public static final Parcelable.Creator<wjc> CREATOR = new iek(8);
    public final PendingIntent a;

    public wjc(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.i(parcel, 1, this.a, i);
        hxn.q(parcel, p);
    }
}
