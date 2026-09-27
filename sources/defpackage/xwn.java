package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xwn extends usk implements axn {
    public final cxn P(rfd rfdVar, yxn yxnVar) {
        Parcel L = L();
        qil.a(L, rfdVar);
        cxn cxnVar = null;
        L.writeStrongBinder(null);
        L.writeInt(1);
        yxnVar.writeToParcel(L, 0);
        Parcel M = M(L, 1);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof cxn) {
                cxnVar = (cxn) queryLocalInterface;
            } else {
                cxnVar = new cxn(readStrongBinder);
            }
        }
        M.recycle();
        return cxnVar;
    }
}
