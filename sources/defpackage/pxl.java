package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzby;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class pxl {
    public static int a(int i, int i2, int i3) {
        return gom.r(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return gom.r(i) + i2 + i3 + i4;
    }

    public static gy7 c(int i, bw4 bw4Var) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        bw4Var.t0(zzayVar.zzb());
        return bw4Var.J();
    }

    public static gy7 d(int i, odl odlVar, bw4 bw4Var) {
        bw4Var.t0(new ucl(i, odlVar));
        return bw4Var.J();
    }

    public static gy7 e(int i, rml rmlVar, bw4 bw4Var) {
        bw4Var.t0(new wll(i, rmlVar));
        return bw4Var.J();
    }

    public static gy7 f(int i, qxl qxlVar, bw4 bw4Var) {
        bw4Var.t0(new jwl(i, qxlVar));
        return bw4Var.J();
    }

    public static HashMap g(Class cls, jwl jwlVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, jwlVar);
        return hashMap;
    }

    public static n8l h(n8l n8lVar) {
        int size = n8lVar.size();
        return n8lVar.zzg(size + size);
    }

    public static void i(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void j(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static gy7 k(int i, bw4 bw4Var) {
        zzby zzbyVar = new zzby();
        zzbyVar.zza(i);
        bw4Var.t0(zzbyVar.zzb());
        return bw4Var.J();
    }
}
