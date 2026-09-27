package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzal extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzal(int i) {
        zzp(12);
    }

    private final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* bridge */ /* synthetic */ int zza(zzal zzalVar) {
        return zzalVar.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzal zzalVar) {
        return zzalVar.zzg;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzal zzalVar) {
        return zzalVar.zzv();
    }

    public static /* bridge */ /* synthetic */ int zzd(zzal zzalVar, Object obj) {
        return zzalVar.zzw(obj);
    }

    public static /* synthetic */ Object zzg(zzal zzalVar, int i) {
        return zzalVar.zzB()[i];
    }

    public static /* bridge */ /* synthetic */ Object zzh(zzal zzalVar, Object obj) {
        return zzalVar.zzy(obj);
    }

    public static /* synthetic */ Object zzi(zzal zzalVar) {
        Object obj = zzalVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzal zzalVar, int i) {
        return zzalVar.zzC()[i];
    }

    public static /* bridge */ /* synthetic */ Object zzk() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzal zzalVar, int i) {
        zzalVar.zzg = i;
    }

    public static /* synthetic */ void zzn(zzal zzalVar, int i, Object obj) {
        zzalVar.zzC()[i] = obj;
    }

    public static /* bridge */ /* synthetic */ int[] zzs(zzal zzalVar) {
        return zzalVar.zzA();
    }

    public static /* bridge */ /* synthetic */ Object[] zzt(zzal zzalVar) {
        return zzalVar.zzB();
    }

    public static /* bridge */ /* synthetic */ Object[] zzu(zzal zzalVar) {
        return zzalVar.zzC();
    }

    private final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zza = zzan.zza(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzam.zzc(obj2, zza & zzv);
        if (zzc != 0) {
            int i = ~zzv;
            int i2 = zza & i;
            do {
                int i3 = zzc - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && zzh.zza(obj, zzB()[i3])) {
                    return i3;
                }
                zzc = i4 & zzv;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zzd2 = zzam.zzd(i2);
        if (i4 != 0) {
            zzam.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzam.zzc(obj, i6);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = zzam.zzc(zzd2, i10);
                zzam.zze(zzd2, i10, zzc);
                zzA[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        zzz(i5);
        return i5;
    }

    private final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzam.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzbv.zza(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzw(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i = 0; i < this.zzg; i++) {
                if (zzh.zza(obj, zzC()[i])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzaf zzafVar = new zzaf(this);
            this.zzi = zzafVar;
            return zzafVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzai zzaiVar = new zzai(this);
            this.zzh = zzaiVar;
            return zzaiVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzr()) {
            zzi.zzd(zzr(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzam.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zza = zzan.zza(obj);
        int zzv = zzv();
        int i5 = zza & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzam.zzc(obj3, i5);
        if (zzc == 0) {
            if (i4 > zzv) {
                zzv = zzx(zzv, zzam.zza(zzv), zza, i3);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzam.zze(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~zzv;
            int i7 = zza & i6;
            int i8 = 0;
            while (true) {
                int i9 = zzc - 1;
                int i10 = zzA[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && zzh.zza(obj, zzB[i9])) {
                    Object obj5 = zzC[i9];
                    zzC[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & zzv;
                i8++;
                if (i12 == 0) {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > zzv) {
                        zzv = zzx(zzv, zzam.zza(zzv), zza, i3);
                    } else {
                        zzA[i9] = (i4 & zzv) | i11;
                    }
                } else {
                    zzc = i12;
                }
            }
        }
        int length = zzA().length;
        if (i4 > length) {
            int i13 = i;
            int min = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (min != length) {
                this.zza = Arrays.copyOf(zzA(), min);
                this.zzb = Arrays.copyOf(zzB(), min);
                this.zzc = Arrays.copyOf(zzC(), min);
            }
        }
        zzA()[i3] = (~zzv) & zza;
        zzB()[i3] = obj;
        zzC()[i3] = obj2;
        this.zzg = i4;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzak zzakVar = new zzak(this);
            this.zzj = zzakVar;
            return zzakVar;
        }
        return collection;
    }

    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i) {
        this.zzf = zzbv.zza(i, 1, 1073741823);
    }

    public final void zzq(int i, int i2) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i3 = size - 1;
        if (i < i3) {
            int i4 = i + 1;
            Object obj2 = zzB[i3];
            zzB[i] = obj2;
            zzC[i] = zzC[i3];
            zzB[i3] = null;
            zzC[i3] = null;
            zzA[i] = zzA[i3];
            zzA[i3] = 0;
            int zza = zzan.zza(obj2) & i2;
            int zzc = zzam.zzc(obj, zza);
            if (zzc == size) {
                zzam.zze(obj, zza, i4);
                return;
            }
            while (true) {
                int i5 = zzc - 1;
                int i6 = zzA[i5];
                int i7 = i6 & i2;
                if (i7 != size) {
                    zzc = i7;
                } else {
                    zzA[i5] = ((~i2) & i6) | (i4 & i2);
                    return;
                }
            }
        } else {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
        }
    }

    public final boolean zzr() {
        if (this.zze == null) {
            return true;
        }
        return false;
    }

    public zzal() {
        zzp(3);
    }
}
