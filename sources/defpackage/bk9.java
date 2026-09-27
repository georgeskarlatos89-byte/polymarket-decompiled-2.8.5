package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bk9 extends nuk {
    public bk9() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 1);
    }

    @Override // defpackage.nuk
    public final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) n2l.a(parcel, Status.CREATOR);
            n2l.c(parcel);
            R(status);
            return true;
        }
        return false;
    }

    public abstract void R(Status status);
}
