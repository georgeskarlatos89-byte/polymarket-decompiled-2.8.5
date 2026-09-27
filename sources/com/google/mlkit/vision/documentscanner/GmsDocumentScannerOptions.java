package com.google.mlkit.vision.documentscanner;

import defpackage.arn;
import defpackage.dkn;
import defpackage.dmk;
import defpackage.hdi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class GmsDocumentScannerOptions {
    public static final int CAPTURE_MODE_AUTO = 1;
    public static final int CAPTURE_MODE_MANUAL = 2;
    public static final GmsDocumentScannerOptions DEFAULT_OPTIONS = new Builder().build();
    public static final int RESULT_FORMAT_JPEG = 101;
    public static final int RESULT_FORMAT_PDF = 102;
    public static final int SCANNER_MODE_BASE = 3;
    public static final int SCANNER_MODE_BASE_WITH_FILTER = 2;
    public static final int SCANNER_MODE_FULL = 1;
    private final boolean zzd;
    private final int zzf;
    private final int[] zzg;
    private final String zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final boolean zzm;
    private final boolean zzo;
    private final List zza = null;
    private final int zzb = 1;
    private final boolean zzc = true;
    private final boolean zze = true;
    private final zzj zzh = null;
    private final boolean zzn = false;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private boolean zza = true;
        private int zzb = -1;
        private int[] zzc = {101};
        private final String zzd = "";
        private int zze = 1;
        private boolean zzf = true;
        private boolean zzg = true;
        private boolean zzh = true;
        private boolean zzi = true;
        private final Optional zzj = Optional.empty();

        public GmsDocumentScannerOptions build() {
            return new GmsDocumentScannerOptions(this, null);
        }

        public Builder setGalleryImportAllowed(boolean z) {
            this.zza = z;
            return this;
        }

        public Builder setPageLimit(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            arn.a("pageLimit should be be greater than or equal to 1", z);
            this.zzb = i;
            return this;
        }

        public Builder setResultFormats(int i, int... iArr) {
            boolean z;
            if (iArr != null) {
                z = true;
            } else {
                z = false;
            }
            arn.a("moreFormats cannot be null", z);
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length + 1);
            this.zzc = copyOf;
            copyOf[length] = i;
            return this;
        }

        public Builder setScannerMode(int i) {
            this.zze = i;
            if (i == 1) {
                this.zzf = true;
                this.zzg = true;
                this.zzh = true;
                this.zzi = true;
                return this;
            }
            if (i == 2) {
                this.zzf = false;
                this.zzg = true;
                this.zzh = true;
                this.zzi = false;
                return this;
            }
            if (i == 3) {
                this.zzf = false;
                this.zzg = false;
                this.zzh = false;
                this.zzi = false;
                return this;
            }
            dmk.v(hdi.l(i, "Invalid scanner mode: ", new StringBuilder(String.valueOf(i).length() + 22)));
            return null;
        }

        public final /* synthetic */ boolean zza() {
            return this.zza;
        }

        public final /* synthetic */ int zzb() {
            return this.zzb;
        }

        public final /* synthetic */ int[] zzc() {
            return this.zzc;
        }

        public final /* synthetic */ String zzd() {
            return this.zzd;
        }

        public final /* synthetic */ int zze() {
            return this.zze;
        }

        public final /* synthetic */ boolean zzf() {
            return this.zzf;
        }

        public final /* synthetic */ boolean zzg() {
            return this.zzg;
        }

        public final /* synthetic */ boolean zzh() {
            return this.zzh;
        }

        public final /* synthetic */ boolean zzi() {
            return this.zzi;
        }

        public final /* synthetic */ Optional zzj() {
            return this.zzj;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface CaptureMode {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ResultFormat {
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ScannerMode {
    }

    public /* synthetic */ GmsDocumentScannerOptions(Builder builder, byte[] bArr) {
        this.zzd = builder.zza();
        this.zzf = builder.zzb();
        this.zzg = builder.zzc();
        this.zzi = builder.zzd();
        this.zzj = builder.zzf();
        this.zzk = builder.zzg();
        this.zzl = builder.zzh();
        this.zzm = builder.zzi();
        builder.zzj().isPresent();
        this.zzo = builder.zze() == 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GmsDocumentScannerOptions)) {
            return false;
        }
        GmsDocumentScannerOptions gmsDocumentScannerOptions = (GmsDocumentScannerOptions) obj;
        if (dkn.b(null, null) && this.zzd == gmsDocumentScannerOptions.zzd && this.zzf == gmsDocumentScannerOptions.zzf && Arrays.equals(this.zzg, gmsDocumentScannerOptions.zzg) && dkn.b(null, null) && this.zzi.equals(gmsDocumentScannerOptions.zzi) && this.zzj == gmsDocumentScannerOptions.zzj && this.zzk == gmsDocumentScannerOptions.zzk && this.zzl == gmsDocumentScannerOptions.zzl && this.zzm == gmsDocumentScannerOptions.zzm && this.zzo == gmsDocumentScannerOptions.zzo) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Arrays.hashCode(new Object[]{null, 1, bool, Boolean.valueOf(this.zzd), bool, Integer.valueOf(this.zzf), Integer.valueOf(Arrays.hashCode(this.zzg)), null, this.zzi, Boolean.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzl), Boolean.valueOf(this.zzm), Boolean.FALSE, Boolean.valueOf(this.zzo)});
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int[] zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzk;
    }

    public final boolean zzg() {
        return this.zzl;
    }

    public final boolean zzh() {
        return this.zzm;
    }

    public final boolean zzi() {
        return this.zzo;
    }
}
