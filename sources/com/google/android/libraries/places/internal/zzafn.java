package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzafn extends AbstractMap {
    private static final Comparator zza = new zzafk();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd;
    private Integer zze;
    private String zzf;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        if (r8 < 0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, com.google.android.libraries.places.internal.zzafn] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.libraries.places.internal.zzafn] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzafn(zzafn zzafnVar, zzafn zzafnVar2) {
        int i;
        int i2;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.zzd = new zzafm(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzafnVar2.size() + zzafnVar.size();
        int i3 = zzafnVar.zzc[zzafnVar.size()] + zzafnVar2.zzc[zzafnVar2.size()];
        int i4 = size + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr = new int[i4];
        int i5 = 0;
        iArr[0] = size;
        Map.Entry zzg = zzafnVar.zzg(0);
        Map.Entry zzg2 = zzafnVar2.zzg(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = size;
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (zzg == null && zzg2 == null) {
                break;
            }
            int i11 = i9 + 1;
            if (zzg != null) {
                if (zzg2 != null) {
                    int compareTo = ((String) zzg.getKey()).compareTo((String) zzg2.getKey());
                    if (compareTo == 0) {
                        int i12 = i6 + 1;
                        int i13 = i7 + 1;
                        objArr2[i9] = abstractMap.zzf((String) zzg.getKey(), i9);
                        zzafm zzafmVar = (zzafm) zzg.getValue();
                        zzafm zzafmVar2 = (zzafm) zzg2.getValue();
                        int i14 = 0;
                        int i15 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i14 >= zzafmVar.zzc() - zzafmVar.zzb() && i15 >= zzafmVar2.zzc() - zzafmVar2.zzb()) {
                                break;
                            }
                            if (i14 == zzafmVar.zzc() - zzafmVar.zzb()) {
                                i = i10;
                            } else if (i15 == zzafmVar2.zzc() - zzafmVar2.zzb()) {
                                i = -1;
                            } else {
                                i = 0;
                            }
                            if (i == 0) {
                                int i16 = zzafp.zza;
                                i = zzafp.zze().compare(zzafmVar.zza(i14), zzafmVar2.zza(i15));
                            }
                            if (i < 0) {
                                i2 = i14 + 1;
                                obj = zzafmVar.zza(i14);
                            } else {
                                int i17 = i15 + 1;
                                Object zza2 = zzafmVar2.zza(i15);
                                i15 = i17;
                                i2 = i == 0 ? i14 + 1 : i14;
                                obj = zza2;
                            }
                            objArr2[i8] = obj;
                            i14 = i2;
                            i8++;
                            i10 = 1;
                            abstractMap = this;
                        }
                        iArr[i11] = i8;
                        zzg = zzafnVar.zzg(i13);
                        zzg2 = zzafnVar2.zzg(i12);
                        i7 = i13;
                        i6 = i12;
                        i9 = i11;
                        i5 = 0;
                    }
                }
                i7++;
                i8 = zzd(zzg, i9, i8, objArr2, iArr);
                zzg = zzafnVar.zzg(i7);
                i9 = i11;
                i5 = 0;
                abstractMap = this;
            }
            Map.Entry entry = zzg;
            i6++;
            int zzd = zzd(zzg2, i9, i8, objArr2, iArr);
            zzg2 = zzafnVar2.zzg(i6);
            i8 = zzd;
            zzg = entry;
            i9 = i11;
            i5 = 0;
            abstractMap = this;
        }
        int i18 = iArr[i5];
        int i19 = i18 - i9;
        if (i19 != 0) {
            for (int i20 = i5; i20 <= i9; i20++) {
                iArr[i20] = iArr[i20] - i19;
            }
            int i21 = iArr[i9];
            int i22 = i21 - i9;
            if (zze(i3, i21)) {
                objArr = new Object[i21];
                System.arraycopy(objArr2, i5, objArr, i5, i9);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i18, objArr, i9, i22);
            objArr2 = objArr;
        }
        abstractMap.zzb = objArr2;
        int i23 = iArr[i5] + 1;
        abstractMap.zzc = zze(i4, i23) ? Arrays.copyOf(iArr, i23) : iArr;
    }

    public static /* synthetic */ Comparator zza() {
        return zza;
    }

    private final int zzd(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        zzafm zzafmVar = (zzafm) entry.getValue();
        int zzc = zzafmVar.zzc() - zzafmVar.zzb();
        System.arraycopy(zzafmVar.zzb.zzb, zzafmVar.zzb(), objArr, i2, zzc);
        objArr[i] = zzf((String) entry.getKey(), i);
        int i3 = i2 + zzc;
        iArr[i + 1] = i3;
        return i3;
    }

    private static boolean zze(int i, int i2) {
        if (i > 16 && i * 9 > i2 * 10) {
            return true;
        }
        return false;
    }

    private final Map.Entry zzf(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzafm(this, i));
    }

    private final Map.Entry zzg(int i) {
        if (i < this.zzc[0]) {
            return (Map.Entry) this.zzb[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer num = this.zze;
        if (num == null) {
            num = Integer.valueOf(super.hashCode());
            this.zze = num;
        }
        return num.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.zzf;
        if (str == null) {
            String abstractMap = super.toString();
            this.zzf = abstractMap;
            return abstractMap;
        }
        return str;
    }

    public final /* synthetic */ Object[] zzb() {
        return this.zzb;
    }

    public final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    public zzafn(List list) {
        this.zzd = new zzafm(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
