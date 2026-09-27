package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaai {
    private final int[] zza;
    private final zzaag zzb;
    private zzaag zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private zzaai(int[] iArr) {
        this.zza = iArr;
        zzaag zzaagVar = new zzaag(-1, -1, null);
        this.zzb = zzaagVar;
        this.zzc = zzaagVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0021, code lost:
    
        r6 = r7.zzd;
        r7 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        if (r6.containsKey(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r0.zzc.zzd.put(r7, new com.google.android.libraries.places.internal.zzaag(r1, 1073741824, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        r5.zzc = r0.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        r0.zzd = r1;
        r0.zze++;
        r0.zzb();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaai zza(int[] iArr) {
        zzaai zzaaiVar = new zzaai(iArr);
        int i = 0;
        while (i < iArr.length) {
            zzaaiVar.zzf++;
            int[] iArr2 = zzaaiVar.zza;
            int i2 = iArr2[i];
            while (true) {
                zzaag zzaagVar = null;
                while (true) {
                    if (zzaaiVar.zzf > 0) {
                        int i3 = zzaaiVar.zze;
                        zzaag zzaagVar2 = zzaaiVar.zzc;
                        if (i3 == 0) {
                            break;
                        }
                        int i4 = ((zzaag) zzaagVar2.zzd.get(Integer.valueOf(iArr2[zzaaiVar.zzd]))).zza;
                        int i5 = zzaaiVar.zze;
                        if (iArr2[i4 + i5] == i2) {
                            if (zzaagVar != null) {
                                zzaagVar.zzc = zzaaiVar.zzc;
                            }
                            zzaaiVar.zze = i5 + 1;
                            zzaaiVar.zzb();
                        } else {
                            zzaag zzaagVar3 = (zzaag) zzaaiVar.zzc.zzd.get(Integer.valueOf(iArr2[zzaaiVar.zzd]));
                            zzaag zzaagVar4 = new zzaag(zzaagVar3.zza, (zzaaiVar.zze + r9) - 1, null);
                            zzaaiVar.zzc.zzd.put(Integer.valueOf(iArr2[zzaaiVar.zzd]), zzaagVar4);
                            Map map = zzaagVar4.zzd;
                            int i6 = zzaagVar4.zzb + 1;
                            map.put(Integer.valueOf(iArr2[i6]), zzaagVar3);
                            zzaagVar3.zza = i6;
                            if (zzaagVar != null) {
                                zzaagVar.zzc = zzaagVar4;
                            }
                            map.put(Integer.valueOf(i2), new zzaag(i, 1073741824, null));
                            zzaaiVar.zzf--;
                            zzaaiVar.zzc();
                            zzaagVar = zzaagVar4;
                        }
                    }
                }
                zzaaiVar.zzf--;
                zzaaiVar.zzc();
            }
            i++;
        }
        return zzaaiVar;
    }

    private final void zze(zzaag zzaagVar, StringBuilder sb) {
        for (zzaag zzaagVar2 : zzaagVar.zzd.values()) {
            sb.append("  ");
            sb.append(zzaagVar);
            sb.append(" -> ");
            sb.append(zzaagVar2);
            sb.append(" [label=\"");
            int[] iArr = this.zza;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, zzaagVar2.zza, Math.min(iArr.length, zzaagVar2.zzb + 1))));
            sb.append("\"]\n");
            zze(zzaagVar2, sb);
        }
    }

    private final boolean zzf(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int min = Math.min(length, i2);
            if (min - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        zze(this.zzb, sb);
        sb.append("}");
        return sb.toString();
    }

    public final void zzb() {
        if (this.zze != 0) {
            Map map = this.zzc.zzd;
            int[] iArr = this.zza;
            zzaag zzaagVar = (zzaag) map.get(Integer.valueOf(iArr[this.zzd]));
            while (true) {
                int i = (zzaagVar.zzb - zzaagVar.zza) + 1;
                int i2 = this.zze;
                if (i <= i2) {
                    int i3 = this.zzd + i;
                    this.zzd = i3;
                    this.zzc = zzaagVar;
                    int i4 = i2 - i;
                    this.zze = i4;
                    if (i4 > 0) {
                        zzaagVar = (zzaag) zzaagVar.zzd.get(Integer.valueOf(iArr[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void zzc() {
        zzaag zzaagVar = this.zzc.zzc;
        if (zzaagVar != null) {
            this.zzc = zzaagVar;
        } else {
            this.zzc = this.zzb;
            int i = this.zze;
            if (i > 0) {
                this.zze = i - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (zzf(r9, r10, r5, (r5 + r10) - r9) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaah zzd() {
        int i;
        int i2;
        zzaaf zzaafVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        zzaag zzaagVar = this.zzb;
        zzaaf zzaafVar2 = new zzaaf(zzaagVar, 0, -1, -1, null);
        arrayDeque.push(zzaafVar2);
        while (!arrayDeque.isEmpty()) {
            zzaaf zzaafVar3 = (zzaaf) arrayDeque.pop();
            for (zzaag zzaagVar2 : zzaafVar3.zzd.zzd.values()) {
                int i3 = zzaafVar3.zzb;
                int i4 = zzaafVar3.zzc;
                int i5 = zzaagVar2.zza;
                int i6 = zzaagVar2.zzb;
                if (!zzf(i3, i4, i5, i6)) {
                    if (zzaagVar2.zzd.isEmpty()) {
                        int i7 = zzaagVar2.zza;
                    }
                    zzaafVar = new zzaaf(zzaagVar2, 1, zzaagVar2.zza, i6, null);
                    if (zzaafVar2.zza >= zzaafVar.zza) {
                        zzaafVar2 = zzaafVar;
                    }
                    arrayDeque.push(zzaafVar);
                }
                zzaafVar = new zzaaf(zzaagVar2, zzaafVar3.zza + 1, i3, i4, null);
                if (zzaafVar2.zza >= zzaafVar.zza) {
                }
                arrayDeque.push(zzaafVar);
            }
        }
        int[] iArr = this.zza;
        int min = Math.min(iArr.length, zzaafVar2.zzc + 1);
        int i8 = 0;
        loop2: while (true) {
            i = zzaafVar2.zzb;
            i2 = min - i;
            zzaagVar = (zzaag) zzaagVar.zzd.get(Integer.valueOf(iArr[(i8 % i2) + i]));
            if (zzaagVar == null) {
                break;
            }
            for (int i9 = zzaagVar.zza; i9 < zzaagVar.zzb + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i8 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i8++;
            }
        }
        return new zzaah(i, min, i8 / i2);
    }
}
