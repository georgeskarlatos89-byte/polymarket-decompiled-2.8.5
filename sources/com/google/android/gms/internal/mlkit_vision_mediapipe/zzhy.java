package com.google.android.gms.internal.mlkit_vision_mediapipe;

import defpackage.bvm;
import defpackage.dmk;
import defpackage.g1n;
import defpackage.q4n;
import defpackage.urm;
import defpackage.usm;
import defpackage.xbc;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzhy {
    public static int zza(zzhv zzhvVar) {
        return zzf(zzhvVar.zza());
    }

    public static int zzb(zzhv zzhvVar) {
        return zzg(zzhvVar.zza());
    }

    public static List zzc(zzhv zzhvVar, g1n g1nVar) {
        byte[][] zzj = zzj(zzhvVar.zza());
        if (zzj != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : zzj) {
                    urm urmVar = (urm) g1nVar;
                    urmVar.getClass();
                    usm k = usm.k(urmVar.a, bArr, bArr.length, urm.b);
                    if (k != null && !usm.g(k, true)) {
                        throw new IOException(new q4n().getMessage());
                    }
                    arrayList.add(k);
                }
                return arrayList;
            } catch (bvm e) {
                xbc.s(e);
                return null;
            }
        }
        dmk.s("Vector of protocol buffer objects should not be null!");
        return null;
    }

    public static boolean zzd(zzhv zzhvVar, ByteBuffer byteBuffer) {
        return zzh(zzhvVar.zza(), byteBuffer);
    }

    public static byte[] zze(zzhv zzhvVar) {
        return zzi(zzhvVar.zza());
    }

    private static native int zzf(long j);

    private static native int zzg(long j);

    private static native boolean zzh(long j, ByteBuffer byteBuffer);

    private static native byte[] zzi(long j);

    private static native byte[][] zzj(long j);
}
