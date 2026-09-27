package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.dmk;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbqv {
    private final zzbqu zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzbqv(zzbqu zzbquVar) {
        this.zza = zzbquVar;
        zzbquVar.zze = this;
    }

    private final void zzS(int i) {
        if ((this.zzb & 7) == i) {
            return;
        }
        dmk.y();
    }

    private final void zzT(Object obj, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        zzbqu zzbquVar = this.zza;
        int zzo = zzbquVar.zzo();
        zzbquVar.zzK();
        int zzB = zzbquVar.zzB(zzo);
        zzbquVar.zza++;
        zzbtmVar.zzg(obj, this, zzbrhVar);
        zzbquVar.zzb(0);
        zzbquVar.zza--;
        zzbquVar.zzC(zzB);
    }

    private final Object zzU(zzbtm zzbtmVar, zzbrh zzbrhVar) {
        Object zza = zzbtmVar.zza();
        zzT(zza, zzbtmVar, zzbrhVar);
        zzbtmVar.zzk(zza);
        return zza;
    }

    private final void zzV(Object obj, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        zzbqu zzbquVar = this.zza;
        zzbquVar.zzK();
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        zzbquVar.zzb++;
        try {
            zzbtmVar.zzg(obj, this, zzbrhVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzbsm("Failed to parse the message.");
            }
        } finally {
            zzbqu zzbquVar2 = this.zza;
            zzbquVar2.zzb--;
            this.zzc = i;
        }
    }

    private final Object zzW(zzbtm zzbtmVar, zzbrh zzbrhVar) {
        Object zza = zzbtmVar.zza();
        zzV(zza, zzbtmVar, zzbrhVar);
        zzbtmVar.zzk(zza);
        return zza;
    }

    private final Object zzX(zzbul zzbulVar, Class cls, zzbrh zzbrhVar) {
        zzbul zzbulVar2 = zzbul.zza;
        switch (zzbulVar.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(zzf());
            case 2:
                return Long.valueOf(zzh());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(zzj());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                dmk.v("unsupported field type.");
                return null;
            case 10:
                return zzo(cls, zzbrhVar);
            case 11:
                return zzs();
            case 12:
                return Integer.valueOf(zzt());
            case 13:
                return Integer.valueOf(zzu());
            case 14:
                return Integer.valueOf(zzv());
            case 15:
                return Long.valueOf(zzw());
            case 16:
                return Integer.valueOf(zzx());
            case 17:
                return Long.valueOf(zzy());
        }
    }

    private final void zzY(int i) {
        if (this.zza.zzE() == i) {
            return;
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private static final void zzZ(int i) {
        if ((i & 3) == 0) {
            return;
        }
        dmk.A("Failed to parse the message.");
    }

    public static zzbqv zza(zzbqu zzbquVar) {
        Object obj = zzbquVar.zze;
        if (obj != null) {
            return (zzbqv) obj;
        }
        return new zzbqv(zzbquVar);
    }

    private static final void zzaa(int i) {
        if ((i & 7) == 0) {
            return;
        }
        dmk.A("Failed to parse the message.");
    }

    public final void zzA(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbro;
        int i2 = this.zzb;
        if (z) {
            zzbro zzbroVar = (zzbro) list;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar = this.zza;
                    zzbroVar.zzf(zzbquVar.zze());
                    if (!zzbquVar.zzD()) {
                        i = zzbquVar.zza();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                zzbqu zzbquVar2 = this.zza;
                int zzo = zzbquVar2.zzo();
                zzZ(zzo);
                int zzE = zzbquVar2.zzE() + zzo;
                do {
                    zzbroVar.zzf(zzbquVar2.zze());
                } while (zzbquVar2.zzE() < zzE);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar3 = this.zza;
                    list.add(Float.valueOf(zzbquVar3.zze()));
                    if (!zzbquVar3.zzD()) {
                        zza = zzbquVar3.zza();
                    } else {
                        return;
                    }
                } while (zza == this.zzb);
                i = zza;
            } else {
                zzbqu zzbquVar4 = this.zza;
                int zzo2 = zzbquVar4.zzo();
                zzZ(zzo2);
                int zzE2 = zzbquVar4.zzE() + zzo2;
                do {
                    list.add(Float.valueOf(zzbquVar4.zze()));
                } while (zzbquVar4.zzE() < zzE2);
                return;
            }
        }
        this.zzd = i;
    }

    public final void zzB(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbsr;
        int i2 = this.zzb;
        if (z) {
            zzbsr zzbsrVar = (zzbsr) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbsrVar.zzf(zzbquVar.zzf());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbsrVar.zzf(zzbquVar2.zzf());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Long.valueOf(zzbquVar3.zzf()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Long.valueOf(zzbquVar4.zzf()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzC(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbsr;
        int i2 = this.zzb;
        if (z) {
            zzbsr zzbsrVar = (zzbsr) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbsrVar.zzf(zzbquVar.zzg());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbsrVar.zzf(zzbquVar2.zzg());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Long.valueOf(zzbquVar3.zzg()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Long.valueOf(zzbquVar4.zzg()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzD(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbrxVar.zzh(zzbquVar.zzh());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbrxVar.zzh(zzbquVar2.zzh());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Integer.valueOf(zzbquVar3.zzh()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Integer.valueOf(zzbquVar4.zzh()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzE(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbsr;
        int i2 = this.zzb;
        if (z) {
            zzbsr zzbsrVar = (zzbsr) list;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzo = zzbquVar.zzo();
                    zzaa(zzo);
                    int zzE = zzbquVar.zzE() + zzo;
                    do {
                        zzbsrVar.zzf(zzbquVar.zzi());
                    } while (zzbquVar.zzE() < zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbsrVar.zzf(zzbquVar2.zzi());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzo2 = zzbquVar3.zzo();
                    zzaa(zzo2);
                    int zzE2 = zzbquVar3.zzE() + zzo2;
                    do {
                        list.add(Long.valueOf(zzbquVar3.zzi()));
                    } while (zzbquVar3.zzE() < zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Long.valueOf(zzbquVar4.zzi()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzF(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar = this.zza;
                    zzbrxVar.zzh(zzbquVar.zzj());
                    if (!zzbquVar.zzD()) {
                        i = zzbquVar.zza();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                zzbqu zzbquVar2 = this.zza;
                int zzo = zzbquVar2.zzo();
                zzZ(zzo);
                int zzE = zzbquVar2.zzE() + zzo;
                do {
                    zzbrxVar.zzh(zzbquVar2.zzj());
                } while (zzbquVar2.zzE() < zzE);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar3 = this.zza;
                    list.add(Integer.valueOf(zzbquVar3.zzj()));
                    if (!zzbquVar3.zzD()) {
                        zza = zzbquVar3.zza();
                    } else {
                        return;
                    }
                } while (zza == this.zzb);
                i = zza;
            } else {
                zzbqu zzbquVar4 = this.zza;
                int zzo2 = zzbquVar4.zzo();
                zzZ(zzo2);
                int zzE2 = zzbquVar4.zzE() + zzo2;
                do {
                    list.add(Integer.valueOf(zzbquVar4.zzj()));
                } while (zzbquVar4.zzE() < zzE2);
                return;
            }
        }
        this.zzd = i;
    }

    public final void zzG(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbqh;
        int i2 = this.zzb;
        if (z) {
            zzbqh zzbqhVar = (zzbqh) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbqhVar.zzf(zzbquVar.zzk());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbqhVar.zzf(zzbquVar2.zzk());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Boolean.valueOf(zzbquVar3.zzk()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Boolean.valueOf(zzbquVar4.zzk()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzH(List list, boolean z) {
        String zzm;
        int zza;
        int i;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzbso) && !z) {
                zzbso zzbsoVar = (zzbso) list;
                do {
                    zzs();
                    zzbsoVar.zzb();
                    zzbqu zzbquVar = this.zza;
                    if (!zzbquVar.zzD()) {
                        i = zzbquVar.zza();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                do {
                    if (z) {
                        zzm = zzn();
                    } else {
                        zzm = zzm();
                    }
                    list.add(zzm);
                    zzbqu zzbquVar2 = this.zza;
                    if (zzbquVar2.zzD()) {
                        return;
                    } else {
                        zza = zzbquVar2.zza();
                    }
                } while (zza == this.zzb);
                i = zza;
            }
            this.zzd = i;
            return;
        }
        dmk.y();
    }

    public final void zzI(List list, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            dmk.y();
            return;
        }
        do {
            list.add(zzU(zzbtmVar, zzbrhVar));
            zzbqu zzbquVar = this.zza;
            if (!zzbquVar.zzD() && this.zzd == 0) {
                zza = zzbquVar.zza();
            } else {
                return;
            }
        } while (zza == i);
        this.zzd = zza;
    }

    @Deprecated
    public final void zzJ(List list, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        int zza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            dmk.y();
            return;
        }
        do {
            list.add(zzW(zzbtmVar, zzbrhVar));
            zzbqu zzbquVar = this.zza;
            if (!zzbquVar.zzD() && this.zzd == 0) {
                zza = zzbquVar.zza();
            } else {
                return;
            }
        } while (zza == i);
        this.zzd = zza;
    }

    public final void zzK(List list) {
        int zza;
        if ((this.zzb & 7) != 2) {
            dmk.y();
            return;
        }
        do {
            list.add(zzs());
            zzbqu zzbquVar = this.zza;
            if (zzbquVar.zzD()) {
                return;
            } else {
                zza = zzbquVar.zza();
            }
        } while (zza == this.zzb);
        this.zzd = zza;
    }

    public final void zzL(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbrxVar.zzh(zzbquVar.zzo());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbrxVar.zzh(zzbquVar2.zzo());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Integer.valueOf(zzbquVar3.zzo()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Integer.valueOf(zzbquVar4.zzo()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzM(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbrxVar.zzh(zzbquVar.zzp());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbrxVar.zzh(zzbquVar2.zzp());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Integer.valueOf(zzbquVar3.zzp()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Integer.valueOf(zzbquVar4.zzp()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzN(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 2) {
                if (i3 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar = this.zza;
                    zzbrxVar.zzh(zzbquVar.zzq());
                    if (!zzbquVar.zzD()) {
                        i = zzbquVar.zza();
                    } else {
                        return;
                    }
                } while (i == this.zzb);
            } else {
                zzbqu zzbquVar2 = this.zza;
                int zzo = zzbquVar2.zzo();
                zzZ(zzo);
                int zzE = zzbquVar2.zzE() + zzo;
                do {
                    zzbrxVar.zzh(zzbquVar2.zzq());
                } while (zzbquVar2.zzE() < zzE);
                return;
            }
        } else {
            int i4 = i2 & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    dmk.y();
                    return;
                }
                do {
                    zzbqu zzbquVar3 = this.zza;
                    list.add(Integer.valueOf(zzbquVar3.zzq()));
                    if (!zzbquVar3.zzD()) {
                        zza = zzbquVar3.zza();
                    } else {
                        return;
                    }
                } while (zza == this.zzb);
                i = zza;
            } else {
                zzbqu zzbquVar4 = this.zza;
                int zzo2 = zzbquVar4.zzo();
                zzZ(zzo2);
                int zzE2 = zzbquVar4.zzE() + zzo2;
                do {
                    list.add(Integer.valueOf(zzbquVar4.zzq()));
                } while (zzbquVar4.zzE() < zzE2);
                return;
            }
        }
        this.zzd = i;
    }

    public final void zzO(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbsr;
        int i2 = this.zzb;
        if (z) {
            zzbsr zzbsrVar = (zzbsr) list;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzo = zzbquVar.zzo();
                    zzaa(zzo);
                    int zzE = zzbquVar.zzE() + zzo;
                    do {
                        zzbsrVar.zzf(zzbquVar.zzr());
                    } while (zzbquVar.zzE() < zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbsrVar.zzf(zzbquVar2.zzr());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzo2 = zzbquVar3.zzo();
                    zzaa(zzo2);
                    int zzE2 = zzbquVar3.zzE() + zzo2;
                    do {
                        list.add(Long.valueOf(zzbquVar3.zzr()));
                    } while (zzbquVar3.zzE() < zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Long.valueOf(zzbquVar4.zzr()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzP(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrx;
        int i2 = this.zzb;
        if (z) {
            zzbrx zzbrxVar = (zzbrx) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbrxVar.zzh(zzbquVar.zzs());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbrxVar.zzh(zzbquVar2.zzs());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Integer.valueOf(zzbquVar3.zzs()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Integer.valueOf(zzbquVar4.zzs()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    public final void zzQ(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbsr;
        int i2 = this.zzb;
        if (z) {
            zzbsr zzbsrVar = (zzbsr) list;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzE = zzbquVar.zzE() + zzbquVar.zzo();
                    do {
                        zzbsrVar.zzf(zzbquVar.zzt());
                    } while (zzbquVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbsrVar.zzf(zzbquVar2.zzt());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzE2 = zzbquVar3.zzE() + zzbquVar3.zzo();
                    do {
                        list.add(Long.valueOf(zzbquVar3.zzt()));
                    } while (zzbquVar3.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Long.valueOf(zzbquVar4.zzt()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        r9.zza.zzC(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzR(Map map, zzbss zzbssVar, zzbrh zzbrhVar) {
        zzS(2);
        zzbqu zzbquVar = this.zza;
        int zzB = zzbquVar.zzB(zzbquVar.zzo());
        Object obj = zzbssVar.zzd;
        Object obj2 = zzbssVar.zzb;
        Object obj3 = obj;
        while (true) {
            try {
                int zzb = zzb();
                if (zzb == Integer.MAX_VALUE || zzbquVar.zzD()) {
                    break;
                }
                if (zzb != 1) {
                    if (zzb != 2) {
                        try {
                            if (!zzd()) {
                                throw new zzbsm("Unable to parse map entry.");
                                break;
                            }
                        } catch (zzbsl e) {
                            if (!zzd()) {
                                throw new zzbsm("Unable to parse map entry.", e);
                            }
                        }
                    } else {
                        obj3 = zzX(zzbssVar.zzc, obj.getClass(), zzbrhVar);
                    }
                } else {
                    obj2 = zzX(zzbssVar.zza, null, null);
                }
            } catch (Throwable th) {
                this.zza.zzC(zzB);
                throw th;
            }
        }
    }

    public final int zzb() {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zza();
            this.zzb = i;
        }
        if (i != 0 && i != this.zzc) {
            return i >>> 3;
        }
        return bd0.API_PRIORITY_OTHER;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        int i;
        zzbqu zzbquVar = this.zza;
        if (!zzbquVar.zzD() && (i = this.zzb) != this.zzc) {
            return zzbquVar.zzc(i);
        }
        return false;
    }

    public final double zze() {
        zzS(1);
        return this.zza.zzd();
    }

    public final float zzf() {
        zzS(5);
        return this.zza.zze();
    }

    public final long zzg() {
        zzS(0);
        return this.zza.zzf();
    }

    public final long zzh() {
        zzS(0);
        return this.zza.zzg();
    }

    public final int zzi() {
        zzS(0);
        return this.zza.zzh();
    }

    public final long zzj() {
        zzS(1);
        return this.zza.zzi();
    }

    public final int zzk() {
        zzS(5);
        return this.zza.zzj();
    }

    public final boolean zzl() {
        zzS(0);
        return this.zza.zzk();
    }

    public final String zzm() {
        zzS(2);
        return this.zza.zzl();
    }

    public final String zzn() {
        zzS(2);
        return this.zza.zzm();
    }

    public final Object zzo(Class cls, zzbrh zzbrhVar) {
        zzS(2);
        return zzU(zzbtj.zza().zzb(cls), zzbrhVar);
    }

    @Deprecated
    public final Object zzp(Class cls, zzbrh zzbrhVar) {
        zzS(3);
        return zzW(zzbtj.zza().zzb(cls), zzbrhVar);
    }

    public final void zzq(Object obj, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        zzS(2);
        zzT(obj, zzbtmVar, zzbrhVar);
    }

    public final void zzr(Object obj, zzbtm zzbtmVar, zzbrh zzbrhVar) {
        zzS(3);
        zzV(obj, zzbtmVar, zzbrhVar);
    }

    public final zzbqq zzs() {
        zzS(2);
        return this.zza.zzn();
    }

    public final int zzt() {
        zzS(0);
        return this.zza.zzo();
    }

    public final int zzu() {
        zzS(0);
        return this.zza.zzp();
    }

    public final int zzv() {
        zzS(5);
        return this.zza.zzq();
    }

    public final long zzw() {
        zzS(1);
        return this.zza.zzr();
    }

    public final int zzx() {
        zzS(0);
        return this.zza.zzs();
    }

    public final long zzy() {
        zzS(0);
        return this.zza.zzt();
    }

    public final void zzz(List list) {
        int zza;
        int i;
        boolean z = list instanceof zzbrc;
        int i2 = this.zzb;
        if (z) {
            zzbrc zzbrcVar = (zzbrc) list;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    zzbqu zzbquVar = this.zza;
                    int zzo = zzbquVar.zzo();
                    zzaa(zzo);
                    int zzE = zzbquVar.zzE() + zzo;
                    do {
                        zzbrcVar.zzf(zzbquVar.zzd());
                    } while (zzbquVar.zzE() < zzE);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar2 = this.zza;
                zzbrcVar.zzf(zzbquVar2.zzd());
                if (!zzbquVar2.zzD()) {
                    i = zzbquVar2.zza();
                } else {
                    return;
                }
            } while (i == this.zzb);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    zzbqu zzbquVar3 = this.zza;
                    int zzo2 = zzbquVar3.zzo();
                    zzaa(zzo2);
                    int zzE2 = zzbquVar3.zzE() + zzo2;
                    do {
                        list.add(Double.valueOf(zzbquVar3.zzd()));
                    } while (zzbquVar3.zzE() < zzE2);
                    return;
                }
                dmk.y();
                return;
            }
            do {
                zzbqu zzbquVar4 = this.zza;
                list.add(Double.valueOf(zzbquVar4.zzd()));
                if (!zzbquVar4.zzD()) {
                    zza = zzbquVar4.zza();
                } else {
                    return;
                }
            } while (zza == this.zzb);
            i = zza;
        }
        this.zzd = i;
    }
}
