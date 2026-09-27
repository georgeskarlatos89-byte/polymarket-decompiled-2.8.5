package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzc extends GmsDocumentScanningResult.Pdf {
    private final Uri zza;
    private final int zzb;

    public zzc(Uri uri, int i) {
        if (uri != null) {
            this.zza = uri;
            this.zzb = i;
        } else {
            dmk.s("Null uri");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Pdf) {
            GmsDocumentScanningResult.Pdf pdf = (GmsDocumentScanningResult.Pdf) obj;
            if (this.zza.equals(pdf.getUri()) && this.zzb == pdf.getPageCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf
    public final int getPageCount() {
        return this.zzb;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf
    public final Uri getUri() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 20 + String.valueOf(i).length() + 1);
        sb.append("Pdf{uri=");
        sb.append(obj);
        sb.append(", pageCount=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
