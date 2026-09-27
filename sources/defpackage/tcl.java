package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tcl extends usk implements edl {
    /* JADX WARN: Multi-variable type inference failed */
    public final icl P(rfd rfdVar, qal qalVar) {
        icl uskVar;
        Parcel L = L();
        nil.a(L, rfdVar);
        L.writeInt(1);
        qalVar.writeToParcel(L, 0);
        Parcel M = M(L, 1);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder == null) {
            uskVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof icl) {
                uskVar = (icl) queryLocalInterface;
            } else {
                uskVar = new usk(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 5);
            }
        }
        M.recycle();
        return uskVar;
    }
}
