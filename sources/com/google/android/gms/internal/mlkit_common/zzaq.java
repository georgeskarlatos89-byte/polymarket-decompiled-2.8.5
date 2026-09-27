package com.google.android.gms.internal.mlkit_common;

import defpackage.dmk;
import java.util.Arrays;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaq zzg(int i, Object[] objArr, zzah zzahVar) {
        int i2;
        boolean z;
        int i3;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z2;
        int i4;
        ?? r16;
        boolean z3;
        boolean z4;
        int i5 = i;
        Object[] objArr2 = objArr;
        if (i5 == 0) {
            return (zzaq) zza;
        }
        Object obj2 = null;
        boolean z5 = false;
        int i6 = 1;
        if (i5 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            return new zzaq(null, objArr2, 1);
        }
        zzt.zzb(i5, objArr2.length >> 1, "index");
        char c3 = 2;
        int max = Math.max(i5, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                dmk.v("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzw.zza(obj5, obj6);
            z4 = false;
            i5 = 1;
            i3 = 1;
        } else {
            int i7 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj7 = objArr2[i11];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i11 ^ i6];
                    Objects.requireNonNull(obj8);
                    zzw.zza(obj7, obj8);
                    int zza2 = zzy.zza(obj7.hashCode());
                    while (true) {
                        int i12 = zza2 & i7;
                        z2 = z5;
                        i4 = i6;
                        int i13 = bArr[i12] & MessagePack.Code.EXT_TIMESTAMP;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArr2[i10] = obj7;
                                objArr2[i10 ^ 1] = obj8;
                            }
                            i9++;
                        } else {
                            if (obj7.equals(objArr2[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj9 = objArr2[i14];
                                Objects.requireNonNull(obj9);
                                zzag zzagVar = new zzag(obj7, obj8, obj9);
                                objArr2[i14] = obj8;
                                obj2 = zzagVar;
                                break;
                            }
                            zza2 = i12 + 1;
                            z5 = z2;
                            i6 = i4;
                        }
                    }
                    i8++;
                    z5 = z2;
                    i6 = i4;
                }
                z = z5;
                i3 = i6;
                if (i9 == i5) {
                    c = 2;
                    obj = bArr;
                    r16 = z;
                    z3 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z3) {
                        Object[] objArr3 = (Object[]) obj;
                        zzag zzagVar2 = (zzag) objArr3[c];
                        if (zzahVar != null) {
                            zzahVar.zzc = zzagVar2;
                            Object obj11 = objArr3[r16];
                            int intValue = ((Integer) objArr3[i3]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                            obj10 = obj11;
                            i5 = intValue;
                        } else {
                            throw zzagVar2.zza();
                        }
                    }
                    return new zzaq(obj10, objArr2, i5);
                }
                sArr = new Object[3];
                sArr[z ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i9);
                sArr[2] = obj2;
                obj2 = sArr;
                z4 = z;
            } else {
                z = false;
                i3 = 1;
                if (i2 <= 32768) {
                    sArr = new short[i2];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj12 = objArr2[i18];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr2[i18 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzw.zza(obj12, obj13);
                        int zza3 = zzy.zza(obj12.hashCode());
                        while (true) {
                            int i19 = zza3 & i7;
                            char c4 = (char) sArr[i19];
                            if (c4 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArr2[i17] = obj12;
                                    objArr2[i17 ^ 1] = obj13;
                                }
                                i15++;
                            } else {
                                if (obj12.equals(objArr2[c4])) {
                                    int i20 = c4 ^ 1;
                                    Object obj14 = objArr2[i20];
                                    Objects.requireNonNull(obj14);
                                    zzag zzagVar3 = new zzag(obj12, obj13, obj14);
                                    objArr2[i20] = obj13;
                                    obj2 = zzagVar3;
                                    break;
                                }
                                zza3 = i19 + 1;
                            }
                        }
                    }
                    if (i15 != i5) {
                        obj2 = new Object[]{sArr, Integer.valueOf(i15), obj2};
                        z4 = z;
                    }
                    obj2 = sArr;
                    z4 = z;
                } else {
                    int[] iArr = new int[i2];
                    Arrays.fill(iArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i5) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj15 = objArr2[i24];
                        Objects.requireNonNull(obj15);
                        Object obj16 = objArr2[i24 ^ 1];
                        Objects.requireNonNull(obj16);
                        zzw.zza(obj15, obj16);
                        int zza4 = zzy.zza(obj15.hashCode());
                        while (true) {
                            int i25 = zza4 & i7;
                            int i26 = iArr[i25];
                            if (i26 == -1) {
                                iArr[i25] = i23;
                                if (i22 < i21) {
                                    objArr2[i23] = obj15;
                                    objArr2[i23 ^ 1] = obj16;
                                }
                                i22++;
                                c2 = c3;
                            } else {
                                c2 = c3;
                                if (obj15.equals(objArr2[i26])) {
                                    int i27 = i26 ^ 1;
                                    Object obj17 = objArr2[i27];
                                    Objects.requireNonNull(obj17);
                                    zzag zzagVar4 = new zzag(obj15, obj16, obj17);
                                    objArr2[i27] = obj16;
                                    obj2 = zzagVar4;
                                    break;
                                }
                                zza4 = i25 + 1;
                                c3 = c2;
                            }
                        }
                        i21++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i22 == i5) {
                        obj = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = iArr;
                        objArr4[1] = Integer.valueOf(i22);
                        objArr4[c] = obj2;
                        obj = objArr4;
                        r16 = z;
                    }
                    z3 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z3) {
                    }
                    return new zzaq(obj102, objArr2, i5);
                }
            }
        }
        c = 2;
        obj = obj2;
        r16 = z4;
        z3 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z3) {
        }
        return new zzaq(obj1022, objArr2, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzy.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
