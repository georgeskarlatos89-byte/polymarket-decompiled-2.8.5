package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.brn;
import defpackage.dzi;
import defpackage.gci;
import defpackage.gj3;
import defpackage.ix2;
import defpackage.sv6;
import io.ably.lib.transport.Defaults;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzchn {
    public static final zzcao zza;
    public static final zzcao zzb;
    public static final zzcao zzc;
    public static final zzcao zzd;
    public static final zzcao zze;
    static final zzcao zzf;
    public static final zzcao zzg;
    public static final zzcao zzh;
    public static final zzcao zzi;
    public static final long zzj;
    public static final zzcbv zzk;
    public static final zzbwz zzl;
    public static final zzcok zzm;
    public static final zzcok zzn;
    public static final gci zzo;
    private static final Logger zzp = Logger.getLogger(zzchn.class.getName());
    private static final Set zzq = Collections.unmodifiableSet(EnumSet.of(zzcca.OK, zzcca.INVALID_ARGUMENT, zzcca.NOT_FOUND, zzcca.ALREADY_EXISTS, zzcca.FAILED_PRECONDITION, zzcca.ABORTED, zzcca.OUT_OF_RANGE, zzcca.DATA_LOSS));
    private static final zzbxm zzr;

    static {
        Charset.forName("US-ASCII");
        zza = zzcao.zzc("grpc-timeout", new zzchm());
        zzcan zzcanVar = zzcas.zza;
        zzb = zzcao.zzc("grpc-encoding", zzcanVar);
        zzc = zzbzh.zza("grpc-accept-encoding", new zzchk(null));
        zzd = zzcao.zzc("content-encoding", zzcanVar);
        zze = zzbzh.zza("accept-encoding", new zzchk(null));
        zzf = zzcao.zzc("content-length", zzcanVar);
        zzg = zzcao.zzc(ApiConstant.HEADER_CONTENT_TYPE, zzcanVar);
        zzh = zzcao.zzc("te", zzcanVar);
        zzi = zzcao.zzc("user-agent", zzcanVar);
        gj3.c.getClass();
        zzj = 20000000000L;
        zzk = new zzcma();
        zzl = zzbwz.zza("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        zzr = new zzchg();
        zzm = new zzchh();
        zzn = new zzchi();
        zzo = new zzchj();
    }

    private zzchn() {
    }

    public static zzccd zza(int i) {
        zzcca zzccaVar;
        if (i >= 100 && i < 200) {
            zzccaVar = zzcca.INTERNAL;
        } else {
            if (i != 400) {
                if (i != 401) {
                    if (i != 403) {
                        if (i != 404) {
                            if (i != 429) {
                                if (i != 431) {
                                    switch (i) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            zzccaVar = zzcca.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            zzccaVar = zzcca.UNAVAILABLE;
                        } else {
                            zzccaVar = zzcca.UNIMPLEMENTED;
                        }
                    } else {
                        zzccaVar = zzcca.PERMISSION_DENIED;
                    }
                } else {
                    zzccaVar = zzcca.UNAUTHENTICATED;
                }
            }
            zzccaVar = zzcca.INTERNAL;
        }
        zzccd zzb2 = zzccaVar.zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
        sb.append("HTTP status code ");
        sb.append(i);
        return zzb2.zze(sb.toString());
    }

    public static URI zzb(String str) {
        String str2;
        brn.m(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    public static String zzc(String str, int i) {
        String str2;
        try {
            str2 = str;
            try {
                return new URI(null, null, str2, Defaults.TLS_PORT, null, null, null).getAuthority();
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException(ix2.p(new StringBuilder(str2.length() + 26), "Invalid host or port: ", str2, " 443"), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    public static ThreadFactory zzd(String str, boolean z) {
        AtomicLong atomicLong;
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        if (str != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        return new dzi(defaultThreadFactory, str, atomicLong, bool, null);
    }

    public static zzcea zze(zzbzt zzbztVar, boolean z) {
        zzcea zzceaVar;
        zzbzx zze2 = zzbztVar.zze();
        if (zze2 != null) {
            zzceaVar = ((zzcov) zze2.zze()).zza();
        } else {
            zzceaVar = null;
        }
        if (zzceaVar != null) {
            return zzceaVar;
        }
        if (!zzbztVar.zzf().zzj()) {
            if (zzbztVar.zzg()) {
                return new zzcgu(zzi(zzbztVar.zzf()), zzcdy.DROPPED);
            }
            if (!z) {
                return new zzcgu(zzi(zzbztVar.zzf()), zzcdy.PROCESSED);
            }
        }
        return null;
    }

    public static zzbxm[] zzf(zzbxa zzbxaVar, zzcas zzcasVar, int i, boolean z, boolean z2) {
        List zzg2 = zzbxaVar.zzg();
        int size = zzg2.size();
        zzbxm[] zzbxmVarArr = new zzbxm[size + 1];
        zzbxk zza2 = zzbxl.zza();
        zza2.zza(zzbxaVar);
        zza2.zzb(i);
        zza2.zzc(z);
        zza2.zzd(z2);
        zzbxl zze2 = zza2.zze();
        for (int i2 = 0; i2 < zzg2.size(); i2++) {
            zzbxmVarArr[i2] = ((zzbxj) zzg2.get(i2)).zza(zze2, zzcasVar);
        }
        zzbxmVarArr[size] = zzr;
        return zzbxmVarArr;
    }

    public static void zzg(zzcoq zzcoqVar) {
        while (true) {
            InputStream zza2 = zzcoqVar.zza();
            if (zza2 != null) {
                zzh(zza2);
            } else {
                return;
            }
        }
    }

    public static void zzh(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            zzp.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e);
        }
    }

    public static zzccd zzi(zzccd zzccdVar) {
        boolean z;
        if (zzccdVar != null) {
            z = true;
        } else {
            z = false;
        }
        brn.h(z);
        if (zzq.contains(zzccdVar.zzg())) {
            zzccd zzccdVar2 = zzccd.zzh;
            String valueOf = String.valueOf(zzccdVar.zzg());
            String zzh2 = zzccdVar.zzh();
            return zzccdVar2.zze(sv6.p(new StringBuilder(valueOf.length() + 47 + String.valueOf(zzh2).length()), "Inappropriate status code from control plane: ", valueOf, ApiConstant.SPACE, zzh2)).zzd(zzccdVar.zzi());
        }
        return zzccdVar;
    }
}
