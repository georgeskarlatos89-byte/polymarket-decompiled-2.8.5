package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rem extends usk implements lpm {
    /* JADX WARN: Multi-variable type inference failed */
    public final i8m P(rfd rfdVar, efn efnVar) {
        i8m uskVar;
        Parcel L = L();
        qil.a(L, rfdVar);
        L.writeInt(1);
        efnVar.writeToParcel(L, 0);
        Parcel M = M(L, 1);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder == null) {
            uskVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof i8m) {
                uskVar = (i8m) queryLocalInterface;
            } else {
                uskVar = new usk(readStrongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 7);
            }
        }
        M.recycle();
        return uskVar;
    }
}
