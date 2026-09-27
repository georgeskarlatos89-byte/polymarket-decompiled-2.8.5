package com.google.android.libraries.places.internal;

import defpackage.bd0;
import defpackage.dmk;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzbqr extends zzbqu {
    private final byte[] zzf;
    private final int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzbqr(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
        super(null);
        this.zzk = bd0.API_PRIORITY_OTHER;
        this.zzf = bArr;
        this.zzg = i2;
        this.zzh = i2;
        this.zzi = 0;
    }

    private final void zzQ(int i) {
        this.zzk = i;
        int i2 = this.zzg;
        if (i > i2) {
            i = i2;
        }
        this.zzh = i;
    }

    public final long zzA() {
        int i = this.zzi;
        if (this.zzh - i >= 8) {
            byte[] bArr = this.zzf;
            this.zzi = i + 8;
            long j = bArr[i];
            long j2 = bArr[i + 2];
            long j3 = bArr[i + 3];
            return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0L;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzB(int i) {
        if (i >= 0) {
            int i2 = this.zzi;
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = bd0.API_PRIORITY_OTHER;
                if (i > bd0.API_PRIORITY_OTHER - i2) {
                    dmk.A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    return 0;
                }
            }
            int i4 = this.zzk;
            if (i3 <= i4) {
                zzQ(i3);
                return i4;
            }
            dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        dmk.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final void zzC(int i) {
        zzQ(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final boolean zzD() {
        if (this.zzi == this.zzh) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzE() {
        return this.zzi;
    }

    public final byte zzF() {
        int i = this.zzi;
        if (i != this.zzh) {
            byte[] bArr = this.zzf;
            this.zzi = i + 1;
            return bArr[i];
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return (byte) 0;
    }

    public final void zzG(int i) {
        if (i >= 0) {
            int i2 = this.zzh;
            int i3 = this.zzi;
            if (i <= i2 - i3) {
                this.zzi = i3 + i;
                return;
            }
        }
        if (i < 0) {
            dmk.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zza() {
        if (zzD()) {
            this.zzj = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzj = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        dmk.A("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final void zzb(int i) {
        if (this.zzj == i) {
            return;
        }
        dmk.A("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final boolean zzc(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zzG(4);
                                return true;
                            }
                            dmk.y();
                            return false;
                        }
                        zzL();
                        return false;
                    }
                    zzM();
                    zzb(((i >>> 3) << 3) | 4);
                    return true;
                }
                zzG(zzu());
                return true;
            }
            zzG(8);
            return true;
        }
        if (this.zzh - this.zzi >= 10) {
            while (i3 < 10) {
                byte[] bArr = this.zzf;
                int i4 = this.zzi;
                this.zzi = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            dmk.A("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            if (zzF() < 0) {
                i3++;
            }
        }
        dmk.A("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final double zzd() {
        return Double.longBitsToDouble(zzA());
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final float zze() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final long zzf() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final long zzg() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzh() {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final long zzi() {
        return zzA();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzj() {
        return zzz();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final boolean zzk() {
        if (zzx() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final String zzl() {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                String str = new String(this.zzf, i2, zzu, StandardCharsets.UTF_8);
                this.zzi += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            dmk.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final String zzm() {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                String zzc = zzbuk.zzc(this.zzf, i2, zzu);
                this.zzi += zzu;
                return zzc;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= 0) {
            dmk.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final zzbqq zzn() {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzi;
            if (zzu <= i - i2) {
                zzbqq zzl = zzbqq.zzl(this.zzf, i2, zzu, false);
                this.zzi += zzu;
                return zzl;
            }
        }
        if (zzu == 0) {
            return zzbqq.zza;
        }
        if (zzu > 0) {
            int i3 = this.zzh;
            int i4 = this.zzi;
            if (zzu <= i3 - i4) {
                int i5 = zzu + i4;
                this.zzi = i5;
                return zzbqq.zzm(Arrays.copyOfRange(this.zzf, i4, i5), false);
            }
        }
        if (zzu <= 0) {
            dmk.A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzo() {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzp() {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzq() {
        return zzz();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final long zzr() {
        return zzA();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final int zzs() {
        return zzbqu.zzO(zzu());
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    public final long zzt() {
        return zzbqu.zzP(zzx());
    }

    public abstract int zzu();

    public abstract int zzv();

    public final int zzw() {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzy();
    }

    public final long zzx() {
        long j;
        long j2;
        long j3;
        int i = this.zzi;
        int i2 = this.zzh;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                long j8 = j7 ^ (bArr[i10] << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzi = i4;
                return j;
            }
        }
        return zzy();
    }

    public final long zzy() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzF() & 128) == 0) {
                return j;
            }
        }
        dmk.A("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int zzz() {
        int i = this.zzi;
        if (this.zzh - i >= 4) {
            byte[] bArr = this.zzf;
            this.zzi = i + 4;
            return (bArr[i] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24);
        }
        dmk.A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }
}
