package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zvn extends g5 {
    public static final Parcelable.Creator<zvn> CREATOR = new upn(4);
    public final BitmapTeleporter a;

    public zvn(BitmapTeleporter bitmapTeleporter) {
        this.a = bitmapTeleporter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.i(parcel, 1, this.a, i);
        hxn.q(parcel, p);
    }
}
