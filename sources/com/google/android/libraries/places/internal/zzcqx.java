package com.google.android.libraries.places.internal;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.dmk;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcqx {
    public static final zzcqx zza;
    private static final zzcqv[] zzd;
    final boolean zzb;
    final boolean zzc;
    private final String[] zze;
    private final String[] zzf;

    static {
        zzcqv[] zzcqvVarArr = {zzcqv.TLS_AES_128_GCM_SHA256, zzcqv.TLS_AES_256_GCM_SHA384, zzcqv.TLS_CHACHA20_POLY1305_SHA256, zzcqv.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzcqv.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzcqv.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzcqv.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzcqv.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzcqv.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, zzcqv.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, zzcqv.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, zzcqv.TLS_RSA_WITH_AES_128_GCM_SHA256, zzcqv.TLS_RSA_WITH_AES_256_GCM_SHA384, zzcqv.TLS_RSA_WITH_AES_128_CBC_SHA, zzcqv.TLS_RSA_WITH_AES_256_CBC_SHA, zzcqv.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        zzd = zzcqvVarArr;
        zzcqw zzcqwVar = new zzcqw(true);
        zzcqwVar.zza(zzcqvVarArr);
        zzcrj zzcrjVar = zzcrj.TLS_1_3;
        zzcrj zzcrjVar2 = zzcrj.TLS_1_2;
        zzcqwVar.zzc(zzcrjVar, zzcrjVar2);
        zzcqwVar.zze(true);
        zzcqx zzcqxVar = new zzcqx(zzcqwVar);
        zza = zzcqxVar;
        zzcqw zzcqwVar2 = new zzcqw(zzcqxVar);
        zzcqwVar2.zzc(zzcrjVar, zzcrjVar2, zzcrj.TLS_1_1, zzcrj.TLS_1_0);
        zzcqwVar2.zze(true);
    }

    private zzcqx(zzcqw zzcqwVar) {
        this.zzb = true;
        this.zze = zzcqwVar.zzg();
        this.zzf = zzcqwVar.zzh();
        this.zzc = zzcqwVar.zzi();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcqx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzcqx zzcqxVar = (zzcqx) obj;
        if (!Arrays.equals(this.zze, zzcqxVar.zze) || !Arrays.equals(this.zzf, zzcqxVar.zzf) || this.zzc != zzcqxVar.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zze) + 527) * 31) + Arrays.hashCode(this.zzf)) * 31) + (!this.zzc ? 1 : 0);
    }

    public final String toString() {
        List zza2;
        zzcqv zza3;
        String obj;
        zzcrj zzcrjVar;
        String[] strArr = this.zze;
        if (strArr == null) {
            zza2 = null;
        } else {
            zzcqv[] zzcqvVarArr = new zzcqv[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                zzcqv zzcqvVar = zzcqv.TLS_RSA_WITH_NULL_MD5;
                if (str.startsWith("SSL_")) {
                    zza3 = zzcqv.zza("TLS_".concat(str.substring(4)));
                } else {
                    zza3 = zzcqv.zza(str);
                }
                zzcqvVarArr[i] = zza3;
            }
            zza2 = zzcrk.zza(zzcqvVarArr);
        }
        if (zza2 == null) {
            obj = "[use default]";
        } else {
            obj = zza2.toString();
        }
        String[] strArr2 = this.zzf;
        zzcrj[] zzcrjVarArr = new zzcrj[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str2 = strArr2[i2];
            boolean equals = "TLSv1.3".equals(str2);
            zzcrj zzcrjVar2 = zzcrj.TLS_1_3;
            if (equals) {
                zzcrjVar = zzcrj.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                zzcrjVar = zzcrj.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                zzcrjVar = zzcrj.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                zzcrjVar = zzcrj.TLS_1_0;
            } else if ("SSLv3".equals(str2)) {
                zzcrjVar = zzcrj.SSL_3_0;
            } else {
                dmk.v("Unexpected TLS version: ".concat(String.valueOf(str2)));
                return null;
            }
            zzcrjVarArr[i2] = zzcrjVar;
        }
        String valueOf = String.valueOf(zzcrk.zza(zzcrjVarArr));
        boolean z = this.zzc;
        StringBuilder sb = new StringBuilder(g.d(valueOf.length() + String.valueOf(obj).length() + 42 + 24, 1, String.valueOf(z)));
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(obj);
        sb.append(", tlsVersions=");
        sb.append(valueOf);
        sb.append(", supportsTlsExtensions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final void zzb(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2 = this.zze;
        if (strArr2 != null) {
            strArr = (String[]) zzcrk.zzb(String.class, strArr2, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] strArr3 = (String[]) zzcrk.zzb(String.class, this.zzf, sSLSocket.getEnabledProtocols());
        zzcqw zzcqwVar = new zzcqw(this);
        zzcqwVar.zzb(strArr);
        zzcqwVar.zzd(strArr3);
        zzcqx zzcqxVar = new zzcqx(zzcqwVar);
        sSLSocket.setEnabledProtocols(zzcqxVar.zzf);
        String[] strArr4 = zzcqxVar.zze;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    public final /* synthetic */ String[] zzc() {
        return this.zze;
    }

    public final /* synthetic */ String[] zzd() {
        return this.zzf;
    }

    public /* synthetic */ zzcqx(zzcqw zzcqwVar, byte[] bArr) {
        this(zzcqwVar);
    }
}
