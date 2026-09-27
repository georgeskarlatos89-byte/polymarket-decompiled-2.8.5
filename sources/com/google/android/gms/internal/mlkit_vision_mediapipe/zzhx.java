package com.google.android.gms.internal.mlkit_vision_mediapipe;

import defpackage.ahh;
import defpackage.djm;
import defpackage.dmk;
import defpackage.ifm;
import defpackage.jzm;
import defpackage.sv6;
import defpackage.ufm;
import defpackage.woa;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzhx {
    protected final zzhp zza;

    public zzhx(zzhp zzhpVar) {
        this.zza = zzhpVar;
    }

    private final native long zza(long j, boolean z);

    private final native long zzh(long j, float f);

    private final native long zzi(long j, int i);

    private final native long zzj(long j, zzib zzibVar);

    private final native long zzk(long j, ByteBuffer byteBuffer, int i, int i2);

    private final native long zzl(long j, String str);

    private void zzm(long j, ufm ufmVar) {
        ufmVar.zzf();
    }

    public final zzhv zzb(boolean z) {
        return zzhv.zzd(zza(this.zza.zza(), z));
    }

    public final zzhv zzc(float f) {
        return zzhv.zzd(zzh(this.zza.zza(), f));
    }

    public final zzhv zzd(int i) {
        return zzhv.zzd(zzi(this.zza.zza(), i));
    }

    public final zzhv zze(jzm jzmVar) {
        zzib zzibVar = new zzib();
        String str = (String) ifm.a.a.get(jzmVar.getClass());
        zzibVar.zza = str;
        if (str != null) {
            ((djm) jzmVar).b();
            return zzhv.zzd(zzj(this.zza.zza(), zzibVar));
        }
        ahh.i(sv6.n("Cannot determine the protobuf type name for class: ", String.valueOf(jzmVar.getClass()), ". Have you called ProtoUtil.registerTypeName?"));
        return null;
    }

    public final zzhv zzf(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = (((i * 3) + 3) / 4) * 4 * i2;
        if (i3 == byteBuffer.capacity()) {
            return zzhv.zzd(zzk(this.zza.zza(), byteBuffer, i, i2));
        }
        dmk.v(woa.l(i3, byteBuffer.capacity(), "The size of the buffer should be: ", " but is "));
        return null;
    }

    public final zzhv zzg(String str) {
        return zzhv.zzd(zzl(this.zza.zza(), str));
    }
}
