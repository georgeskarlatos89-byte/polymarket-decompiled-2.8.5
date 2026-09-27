package defpackage;

import android.os.Parcel;
import com.google.android.gms.wallet.button.ButtonOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wil extends usk {
    public final xj9 P(rfd rfdVar, ButtonOptions buttonOptions) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.h);
        ril.c(obtain, rfdVar);
        ril.b(obtain, buttonOptions);
        obtain = Parcel.obtain();
        try {
            this.g.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return rfd.R(obtain.readStrongBinder());
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
