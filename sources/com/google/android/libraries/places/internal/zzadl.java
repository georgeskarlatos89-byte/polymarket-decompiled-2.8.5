package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzadl {
    private static final long zza;
    private static final zzadl zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        zza = j;
        zzb = new zzadl(0, -1, -1);
    }

    private zzadl(int i, int i2, int i3) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static zzadl zza() {
        return zzb;
    }

    public static zzadl zzb(String str, int i, int i2, boolean z) {
        int i3;
        if (i == i2 && !z) {
            return zzb;
        }
        if (true != z) {
            i3 = 0;
        } else {
            i3 = 128;
        }
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt <= '0') {
                int zzm = zzm(charAt);
                if (zzm < 0) {
                    if (charAt == '.') {
                        return new zzadl(i3, -1, zzn(str, i4, i2));
                    }
                    throw zzafz.zzb("invalid flag", str, i);
                }
                int i5 = 1 << zzm;
                if ((i3 & i5) == 0) {
                    i3 |= i5;
                    i = i4;
                } else {
                    throw zzafz.zzb("repeated flag", str, i);
                }
            } else {
                if (charAt <= '9') {
                    int i6 = charAt - '0';
                    while (i4 != i2) {
                        int i7 = i4 + 1;
                        char charAt2 = str.charAt(i4);
                        if (charAt2 == '.') {
                            return new zzadl(i3, i6, zzn(str, i7, i2));
                        }
                        char c = (char) (charAt2 - '0');
                        if (c < '\n') {
                            i6 = (i6 * 10) + c;
                            if (i6 <= 999999) {
                                i4 = i7;
                            } else {
                                throw zzafz.zza("width too large", str, i, i2);
                            }
                        } else {
                            throw zzafz.zzb("invalid width character", str, i4);
                        }
                    }
                    return new zzadl(i3, i6, -1);
                }
                throw zzafz.zzb("invalid flag", str, i);
            }
        }
        return new zzadl(i3, -1, -1);
    }

    public static int zzc(String str, boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 128;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            int zzm = zzm(str.charAt(i2));
            if (zzm >= 0) {
                i |= 1 << zzm;
            } else {
                dmk.v("invalid flags: ".concat(str));
                return 0;
            }
        }
        return i;
    }

    private static int zzm(char c) {
        return ((int) ((zza >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < '\n') {
                    i3 = (i3 * 10) + charAt;
                    if (i3 > 999999) {
                        throw zzafz.zza("precision too large", str, i, i2);
                    }
                } else {
                    throw zzafz.zzb("invalid precision character", str, i4);
                }
            }
            if (i3 == 0) {
                if (i2 == i + 1) {
                    return 0;
                }
                throw zzafz.zza("invalid precision", str, i, i2);
            }
            return i3;
        }
        throw zzafz.zzb("missing precision", str, i - 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzadl) {
            zzadl zzadlVar = (zzadl) obj;
            if (zzadlVar.zzc == this.zzc && zzadlVar.zzd == this.zzd && zzadlVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final zzadl zzd(int i, boolean z, boolean z2) {
        if (!zze()) {
            int i2 = this.zzc;
            int i3 = i2 & 128;
            if (i3 != 0) {
                if (i3 != i2 || this.zzd != -1 || this.zze != -1) {
                    return new zzadl(i3, -1, -1);
                }
            } else {
                return zzb;
            }
        }
        return this;
    }

    public final boolean zze() {
        if (this == zzb) {
            return true;
        }
        return false;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    public final boolean zzh(int i, boolean z) {
        int i2;
        if (zze()) {
            return true;
        }
        int i3 = this.zzc;
        if (((~i) & i3) != 0) {
            return false;
        }
        if (!z && this.zze != -1) {
            return false;
        }
        int i4 = this.zzd;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        if (i2 == 0 || i4 != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzi(zzadk zzadkVar) {
        return zzh(zzadkVar.zzd(), zzadkVar.zzc().zza());
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        if ((this.zzc & 128) != 0) {
            return true;
        }
        return false;
    }

    public final StringBuilder zzl(StringBuilder sb) {
        if (!zze()) {
            int i = this.zzc;
            int i2 = 0;
            while (true) {
                int i3 = i & (-129);
                int i4 = 1 << i2;
                if (i4 > i3) {
                    break;
                }
                if ((i3 & i4) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i5 = this.zzd;
            if (i5 != -1) {
                sb.append(i5);
            }
            int i6 = this.zze;
            if (i6 != -1) {
                sb.append('.');
                sb.append(i6);
            }
        }
        return sb;
    }
}
