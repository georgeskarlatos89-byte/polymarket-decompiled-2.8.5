package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.q81;
import defpackage.t81;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcas {
    static final t81 zzb;
    private Object[] zzd;
    private int zze;
    private static final Logger zzc = Logger.getLogger(zzcas.class.getName());
    public static final zzcan zza = new zzcal();

    static {
        q81 q81Var = t81.a;
        Character ch = q81Var.e;
        t81 t81Var = q81Var;
        if (ch != null) {
            t81Var = q81Var.g(q81Var.d);
        }
        zzb = t81Var;
    }

    public zzcas(int i, Object[] objArr) {
        this.zze = i;
        this.zzd = objArr;
    }

    public static /* synthetic */ Logger zzg() {
        return zzc;
    }

    private final byte[] zzh(int i) {
        return (byte[]) this.zzd[i + i];
    }

    private final Object zzi(int i) {
        return this.zzd[i + i + 1];
    }

    private final byte[] zzj(int i) {
        Object zzi = zzi(i);
        if (zzi instanceof byte[]) {
            return (byte[]) zzi;
        }
        throw null;
    }

    private final int zzk() {
        Object[] objArr = this.zzd;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final boolean zzl() {
        if (this.zze == 0) {
            return true;
        }
        return false;
    }

    private final void zzm(int i) {
        Object[] objArr = new Object[i];
        if (!zzl()) {
            Object[] objArr2 = this.zzd;
            int i2 = this.zze;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.zzd = objArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.zze; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] zzh = zzh(i);
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(zzh, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(zzb.c(zzj(i)));
            } else {
                sb.append(new String(zzj(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zzb(zzcao zzcaoVar) {
        int i = this.zze;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(zzcaoVar.zze(), zzh(i)));
        Object zzi = zzi(i);
        if (zzi instanceof byte[]) {
            return zzcaoVar.zzb((byte[]) zzi);
        }
        throw null;
    }

    public final void zzc(zzcao zzcaoVar, Object obj) {
        brn.m(zzcaoVar, "key");
        brn.m(obj, "value");
        int i = this.zze;
        int i2 = i + i;
        if (i2 == 0 || i2 == zzk()) {
            zzm(Math.max(i2 + i2, 8));
        }
        int i3 = this.zze;
        this.zzd[i3 + i3] = zzcaoVar.zze();
        int i4 = this.zze;
        this.zzd[i4 + i4 + 1] = zzcaoVar.zza(obj);
        this.zze++;
    }

    public final void zzd(zzcao zzcaoVar) {
        if (!zzl()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.zze;
                if (i < i3) {
                    if (!Arrays.equals(zzcaoVar.zze(), zzh(i))) {
                        int i4 = i2 + i2;
                        this.zzd[i4] = zzh(i);
                        Object zzi = zzi(i);
                        if (this.zzd instanceof byte[][]) {
                            zzm(zzk());
                        }
                        this.zzd[i4 + 1] = zzi;
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.zzd, i2 + i2, i3 + i3, (Object) null);
                    this.zze = i2;
                    return;
                }
            }
        }
    }

    public final byte[][] zze() {
        int i = this.zze;
        int i2 = i + i;
        byte[][] bArr = new byte[i2];
        Object[] objArr = this.zzd;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
            return bArr;
        }
        for (int i3 = 0; i3 < this.zze; i3++) {
            int i4 = i3 + i3;
            bArr[i4] = zzh(i3);
            bArr[i4 + 1] = zzj(i3);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0 < (r2 + r2)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(zzcas zzcasVar) {
        if (zzcasVar.zzl()) {
            return;
        }
        int zzk = zzk();
        int i = this.zze;
        int i2 = i + i;
        int i3 = zzk - i2;
        if (!zzl()) {
            int i4 = zzcasVar.zze;
        }
        int i5 = zzcasVar.zze;
        zzm(i5 + i5 + i2);
        Object[] objArr = zzcasVar.zzd;
        Object[] objArr2 = this.zzd;
        int i6 = this.zze;
        int i7 = zzcasVar.zze;
        System.arraycopy(objArr, 0, objArr2, i6 + i6, i7 + i7);
        this.zze += zzcasVar.zze;
    }

    public zzcas() {
    }
}
