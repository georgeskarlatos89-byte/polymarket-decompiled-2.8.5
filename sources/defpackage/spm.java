package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class spm extends usk implements f0n {
    /* JADX WARN: Multi-variable type inference failed */
    public final gkm P(rfd rfdVar, o8m o8mVar) {
        gkm uskVar;
        Parcel L = L();
        pil.a(L, rfdVar);
        L.writeInt(1);
        o8mVar.writeToParcel(L, 0);
        Parcel M = M(L, 1);
        IBinder readStrongBinder = M.readStrongBinder();
        if (readStrongBinder == null) {
            uskVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            if (queryLocalInterface instanceof gkm) {
                uskVar = (gkm) queryLocalInterface;
            } else {
                uskVar = new usk(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 6);
            }
        }
        M.recycle();
        return uskVar;
    }
}
