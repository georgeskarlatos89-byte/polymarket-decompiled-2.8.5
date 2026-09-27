package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class exn extends usk implements ixn {
    public final cxn P(rfd rfdVar) {
        cxn cxnVar;
        Parcel L = L();
        qil.a(L, rfdVar);
        Parcel M = M(L, 1);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder == null) {
            cxnVar = null;
        } else {
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

    public final cxn Q(rfd rfdVar, yxn yxnVar) {
        cxn cxnVar;
        Parcel L = L();
        qil.a(L, rfdVar);
        L.writeInt(1);
        yxnVar.writeToParcel(L, 0);
        Parcel M = M(L, 2);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder == null) {
            cxnVar = null;
        } else {
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
