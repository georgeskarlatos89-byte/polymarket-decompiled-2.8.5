package com.google.android.libraries.places.internal;

import android.util.Log;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.sentry.android.core.m0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafd extends zzaer {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzaeb zzc;
    private static final zzafb zzd;
    private final String zze;
    private final Level zzf;
    private final Set zzg;
    private final zzaeb zzh;
    private final int zzi;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzaci.zza, zzadh.zza, zzadi.zza)));
        zzb = unmodifiableSet;
        zzc = zzaee.zza(unmodifiableSet).zzc();
        zzd = new zzafb(null);
    }

    public /* synthetic */ zzafd(String str, String str2, boolean z, int i, Level level, Set set, zzaeb zzaebVar, byte[] bArr) {
        super(str2);
        this.zze = zzaew.zza("", str2, true);
        this.zzi = 2;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzaebVar;
    }

    public static zzafb zze() {
        return zzd;
    }

    public static /* synthetic */ Set zzf() {
        return zzb;
    }

    public static /* synthetic */ zzaeb zzg() {
        return zzc;
    }

    public static /* synthetic */ void zzh(zzado zzadoVar, String str, int i, Level level, Set set, zzaeb zzaebVar) {
        zzi(zzadoVar, str, 2, level, set, zzaebVar);
    }

    private static void zzi(zzado zzadoVar, String str, int i, Level level, Set set, zzaeb zzaebVar) {
        boolean z;
        String sb;
        int zzb2;
        Boolean bool = (Boolean) zzadoVar.zzl().zzd(zzadi.zza);
        if (bool == null || !bool.booleanValue()) {
            zzael zzh = zzael.zzh(zzaeo.zzj(), zzadoVar.zzl());
            if (zzadoVar.zze().intValue() < level.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = zzaep.zza;
                if (zzadoVar.zzh() == null && zzh.zzb() <= set.size() && set.containsAll(zzh.zzc())) {
                    sb = zzads.zza(zzadoVar.zzj());
                    Throwable th = (Throwable) zzadoVar.zzl().zzd(zzaci.zza);
                    zzb2 = zzaew.zzb(zzadoVar.zze());
                    if (zzb2 == 2 && zzb2 != 3) {
                        if (zzb2 != 4) {
                            if (zzb2 != 5) {
                                m0.e(str, sb, th);
                                return;
                            } else {
                                m0.q(str, sb, th);
                                return;
                            }
                        }
                        Log.i(str, sb, th);
                        return;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            if (zzadp.zza(2, zzadoVar.zzg(), sb2)) {
                sb2.append(ApiConstant.SPACE);
            }
            if (z && zzadoVar.zzh() != null) {
                sb2.append("(REDACTED) ");
                sb2.append(zzadoVar.zzh().zzb());
            } else {
                zzadj.zza(zzadoVar, sb2);
                int i3 = zzaep.zza;
                zzadn zzadnVar = new zzadn("[CONTEXT ", " ]", sb2);
                zzh.zza(zzaebVar, zzadnVar);
                zzadnVar.zzb();
            }
            sb = sb2.toString();
            Throwable th2 = (Throwable) zzadoVar.zzl().zzd(zzaci.zza);
            zzb2 = zzaew.zzb(zzadoVar.zze());
            if (zzb2 == 2) {
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public final boolean zzb(Level level) {
        String str = this.zze;
        int zzb2 = zzaew.zzb(level);
        if (!Log.isLoggable(str, zzb2) && !Log.isLoggable("all", zzb2)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public final void zzc(zzado zzadoVar) {
        zzi(zzadoVar, this.zze, 2, this.zzf, this.zzg, this.zzh);
    }
}
