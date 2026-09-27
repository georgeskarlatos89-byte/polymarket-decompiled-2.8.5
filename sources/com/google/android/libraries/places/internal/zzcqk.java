package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzcqk {
    private static final Logger zzb = Logger.getLogger(zzcqk.class.getName());
    private static final zzcrh zzc = zzcrh.zze();
    private static final zzcqk zzd;
    protected final zzcrh zza;

    static {
        zzcqk zzcqkVar;
        ClassLoader classLoader = zzcqk.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                zzcqkVar = new zzcqk(zzc);
            }
        }
        zzcqkVar = new zzcqj(zzc);
        zzd = zzcqkVar;
    }

    public zzcqk(zzcrh zzcrhVar) {
        brn.m(zzcrhVar, "platform");
        this.zza = zzcrhVar;
    }

    public static zzcqk zzd() {
        return zzd;
    }

    public static /* synthetic */ Logger zze() {
        return zzb;
    }

    public String zza(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            zzb(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String zzc2 = zzc(sSLSocket);
            if (zzc2 != null) {
                return zzc2;
            }
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(valueOf.length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } finally {
            this.zza.zzd(sSLSocket);
        }
    }

    public void zzb(SSLSocket sSLSocket, String str, List list) {
        this.zza.zza(sSLSocket, str, list);
    }

    public String zzc(SSLSocket sSLSocket) {
        return this.zza.zzb(sSLSocket);
    }
}
