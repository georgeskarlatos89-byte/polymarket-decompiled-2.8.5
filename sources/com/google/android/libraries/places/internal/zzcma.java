package com.google.android.libraries.places.internal;

import defpackage.gci;
import defpackage.k84;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcma implements zzcbv {
    public static final /* synthetic */ int zza = 0;
    private final gci zzd;
    private static final Logger zzb = Logger.getLogger(zzcma.class.getName());
    private static final zzcly zze = new zzcly();
    private static final gci zzc = new zzclz();

    public zzcma() {
        gci gciVar = zzc;
        zzcly zzclyVar = zze;
        gciVar.getClass();
        this.zzd = gciVar;
        zzclyVar.getClass();
    }

    public static /* synthetic */ Logger zzb() {
        return zzb;
    }

    private final zzcbu zzc(InetSocketAddress inetSocketAddress) {
        String str;
        String str2 = null;
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.zzd.get();
            if (proxySelector == null) {
                zzb.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> select = proxySelector.select(uri);
            if (select != null && !select.isEmpty()) {
                if (select.size() > 1) {
                    zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication zza2 = zzcly.zza(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                zzbyq zze2 = zzbyr.zze();
                zze2.zzb(inetSocketAddress);
                zze2.zza(inetSocketAddress2);
                if (zza2 == null) {
                    return zze2.zze();
                }
                zze2.zzc(zza2.getUserName());
                if (zza2.getPassword() != null) {
                    str2 = new String(zza2.getPassword());
                }
                zze2.zzd(str2);
                return zze2.zze();
            }
            String name = proxySelector.getClass().getName();
            int length = name.length();
            if (select == null) {
                str = "null";
            } else {
                str = "an empty list";
            }
            StringBuilder sb = new StringBuilder(str.length() + length + 24 + 64);
            k84.q(sb, "ProxySelector ", name, " returned ", str);
            sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
            throw new IOException(sb.toString());
        } catch (URISyntaxException e) {
            zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbv
    public final zzcbu zza(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        return zzc((InetSocketAddress) socketAddress);
    }
}
