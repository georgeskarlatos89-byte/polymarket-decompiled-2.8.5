package com.google.android.libraries.places.internal;

import com.appsflyer.internal.l;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzbts extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc = Collections.EMPTY_MAP;
    private boolean zzd;
    private volatile zzbtr zze;

    private zzbts() {
    }

    private final Object zzl(int i) {
        zzn();
        Object value = ((zzbtp) this.zza[i]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i + 1, objArr, i, (this.zzb - i) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzo().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i2 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zzbtp(this, (zzbrl) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final int zzm(zzbrl zzbrlVar) {
        int i = this.zzb;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = zzbrlVar.compareTo(((zzbtp) this.zza[i2]).zza());
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = zzbrlVar.compareTo(((zzbtp) this.zza[i4]).zza());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    private final void zzn() {
        if (!this.zzd) {
            return;
        }
        l.g();
    }

    private final SortedMap zzo() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            this.zzc = new TreeMap();
        }
        return (SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zzbrl zzbrlVar = (zzbrl) obj;
        if (zzm(zzbrlVar) < 0 && !this.zzc.containsKey(zzbrlVar)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzbtr(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbts)) {
            return super.equals(obj);
        }
        zzbts zzbtsVar = (zzbts) obj;
        int size = size();
        if (size != zzbtsVar.size()) {
            return false;
        }
        int i = this.zzb;
        if (i == zzbtsVar.zzb) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!zzd(i2).equals(zzbtsVar.zzd(i2))) {
                    return false;
                }
            }
            if (i == size) {
                return true;
            }
            return this.zzc.equals(zzbtsVar.zzc);
        }
        return entrySet().equals(zzbtsVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzbrl zzbrlVar = (zzbrl) obj;
        int zzm = zzm(zzbrlVar);
        if (zzm >= 0) {
            return ((zzbtp) this.zza[zzm]).getValue();
        }
        return this.zzc.get(zzbrlVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.zza[i3].hashCode();
        }
        if (this.zzc.size() > 0) {
            return this.zzc.hashCode() + i2;
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return zzf((zzbrl) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        zzbrl zzbrlVar = (zzbrl) obj;
        int zzm = zzm(zzbrlVar);
        if (zzm >= 0) {
            return zzl(zzm);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(zzbrlVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        Map unmodifiableMap;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            this.zzd = true;
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Map.Entry zzd(int i) {
        if (i < this.zzb) {
            return (zzbtp) this.zza[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Iterable zze() {
        if (this.zzc.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.zzc.entrySet();
    }

    public final Object zzf(zzbrl zzbrlVar, Object obj) {
        zzn();
        int zzm = zzm(zzbrlVar);
        if (zzm >= 0) {
            return ((zzbtp) this.zza[zzm]).setValue(obj);
        }
        zzn();
        Object[] objArr = this.zza;
        if (objArr == null) {
            objArr = new Object[16];
            this.zza = objArr;
        }
        int i = -(zzm + 1);
        if (i >= 16) {
            return zzo().put(zzbrlVar, obj);
        }
        if (this.zzb == 16) {
            zzbtp zzbtpVar = (zzbtp) objArr[15];
            this.zzb = 15;
            zzo().put(zzbtpVar.zza(), zzbtpVar.getValue());
        }
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.zza[i] = new zzbtp(this, zzbrlVar, obj);
        this.zzb++;
        return null;
    }

    public final /* synthetic */ Object zzg(int i) {
        return zzl(i);
    }

    public final /* synthetic */ void zzh() {
        zzn();
    }

    public final /* synthetic */ Object[] zzi() {
        return this.zza;
    }

    public final /* synthetic */ int zzj() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzk() {
        return this.zzc;
    }

    public /* synthetic */ zzbts(byte[] bArr) {
    }
}
