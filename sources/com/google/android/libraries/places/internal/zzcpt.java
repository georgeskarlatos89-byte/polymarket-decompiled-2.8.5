package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.dmk;
import defpackage.omf;
import defpackage.qp7;
import io.ably.lib.transport.Defaults;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcpt extends zzbyk {
    static final zzcqx zza;
    static final zzcqx zzb;
    static final zzclc zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final zzcok zzg;
    private final zzckk zze;
    private final zzcow zzf = zzcoy.zze();
    private final zzclc zzh = zzc;
    private final zzclc zzi = zzcom.zzc(zzchn.zzn);
    private SSLSocketFactory zzj;
    private final zzcqx zzk;
    private final long zzl;
    private int zzm;

    static {
        Logger.getLogger(zzcpt.class.getName());
        zzcqx zzcqxVar = zzcqx.zza;
        zzcqw zzcqwVar = new zzcqw(zzcqxVar);
        zzcqv zzcqvVar = zzcqv.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        zzcqv zzcqvVar2 = zzcqv.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        zzcqv zzcqvVar3 = zzcqv.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        zzcqv zzcqvVar4 = zzcqv.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        zzcqv zzcqvVar5 = zzcqv.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        zzcqv zzcqvVar6 = zzcqv.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        zzcqwVar.zza(zzcqvVar, zzcqvVar2, zzcqvVar3, zzcqvVar4, zzcqvVar5, zzcqvVar6, zzcqv.TLS_AES_128_GCM_SHA256, zzcqv.TLS_AES_256_GCM_SHA384, zzcqv.TLS_CHACHA20_POLY1305_SHA256);
        zzcrj zzcrjVar = zzcrj.TLS_1_3;
        zzcrj zzcrjVar2 = zzcrj.TLS_1_2;
        zzcqwVar.zzc(zzcrjVar, zzcrjVar2);
        zzcqwVar.zze(true);
        zza = zzcqwVar.zzf();
        zzcqw zzcqwVar2 = new zzcqw(zzcqxVar);
        zzcqwVar2.zza(zzcqvVar, zzcqvVar2, zzcqvVar3, zzcqvVar4, zzcqvVar5, zzcqvVar6);
        zzcqwVar2.zzc(zzcrjVar2);
        zzcqwVar2.zze(true);
        zzb = zzcqwVar2.zzf();
        zzcpo zzcpoVar = new zzcpo();
        zzg = zzcpoVar;
        zzc = zzcom.zzc(zzcpoVar);
        EnumSet.of(zzccn.MTLS, zzccn.CUSTOM_MANAGERS);
    }

    private zzcpt(String str) {
        zzcqx zzcqxVar;
        if (zzcqk.zzd() instanceof zzcqj) {
            zzcqxVar = zza;
        } else {
            zzcqxVar = zzb;
        }
        this.zzk = zzcqxVar;
        this.zzm = 1;
        this.zzl = zzchn.zzj;
        this.zze = new zzckk(str, null, null, new zzcpq(this, null), new zzcpp(this, null));
    }

    public static zzcpt zzf(String str, int i) {
        return new zzcpt(zzchn.zzc(str, Defaults.TLS_PORT));
    }

    @Override // com.google.android.libraries.places.internal.zzbyk
    public final zzcak zza() {
        return this.zze;
    }

    public final zzcpt zzg() {
        this.zzm = 1;
        return this;
    }

    public final zzcps zzh() {
        long j = this.zzl;
        zzcqx zzcqxVar = this.zzk;
        zzcow zzcowVar = this.zzf;
        return new zzcps(this.zzh, this.zzi, null, zzj(), null, zzcqxVar, 4194304, false, Long.MAX_VALUE, j, Settings.DEFAULT_INITIAL_WINDOW_SIZE, false, bd0.API_PRIORITY_OTHER, zzcowVar, false, null, null);
    }

    public final int zzi() {
        int i = this.zzm;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return Defaults.TLS_PORT;
            }
            dmk.i("TLS not handled");
            return 0;
        }
        throw null;
    }

    public final SSLSocketFactory zzj() {
        int i = this.zzm;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                try {
                    SSLSocketFactory sSLSocketFactory = this.zzj;
                    if (sSLSocketFactory == null) {
                        SSLSocketFactory socketFactory = SSLContext.getInstance("Default", zzcrh.zze().zzf()).getSocketFactory();
                        this.zzj = socketFactory;
                        return socketFactory;
                    }
                    return sSLSocketFactory;
                } catch (GeneralSecurityException e) {
                    omf.m("TLS Provider failure", e);
                    return null;
                }
            }
            qp7.p("Unknown negotiation type: TLS");
            return null;
        }
        throw null;
    }
}
