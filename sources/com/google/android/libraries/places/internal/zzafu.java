package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafu extends zzafs {
    private static final Map zza;
    private final zzadk zzb;

    static {
        EnumMap enumMap = new EnumMap(zzadk.class);
        for (zzadk zzadkVar : zzadk.values()) {
            zzafu[] zzafuVarArr = new zzafu[10];
            for (int i = 0; i < 10; i++) {
                zzafuVarArr[i] = new zzafu(i, zzadkVar, zzadl.zza());
            }
            enumMap.put((EnumMap) zzadkVar, (zzadk) zzafuVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    private zzafu(int i, zzadk zzadkVar, zzadl zzadlVar) {
        super(zzadlVar, i);
        zzagc.zza(zzadkVar, "format char");
        this.zzb = zzadkVar;
        if (!zzadlVar.zze()) {
            int zzb = zzadkVar.zzb();
            zzb = zzadlVar.zzk() ? zzb & 65503 : zzb;
            StringBuilder sb = new StringBuilder("%");
            zzadlVar.zzl(sb);
            sb.append((char) zzb);
            return;
        }
        zzadkVar.zze();
    }

    public static zzafu zza(int i, zzadk zzadkVar, zzadl zzadlVar) {
        if (i < 10 && zzadlVar.zze()) {
            zzafu[] zzafuVarArr = (zzafu[]) zza.get(zzadkVar);
            zzagc.zza(zzafuVarArr, "default parameter");
            return zzafuVarArr[i];
        }
        return new zzafu(i, zzadkVar, zzadlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzafs
    public final void zzb(zzaft zzaftVar, Object obj) {
        zzaftVar.zzc(obj, this.zzb, zzd());
    }
}
