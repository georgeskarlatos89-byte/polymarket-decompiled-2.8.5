package com.google.mlkit.vision.documentscanner;

import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import defpackage.k84;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zza extends GmsDocumentScanningResult {
    private final List zza;
    private final GmsDocumentScanningResult.Pdf zzb;

    public zza(List list, GmsDocumentScanningResult.Pdf pdf) {
        this.zza = list;
        this.zzb = pdf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult) {
            GmsDocumentScanningResult gmsDocumentScanningResult = (GmsDocumentScanningResult) obj;
            List list = this.zza;
            if (list != null ? list.equals(gmsDocumentScanningResult.getPages()) : gmsDocumentScanningResult.getPages() == null) {
                GmsDocumentScanningResult.Pdf pdf = this.zzb;
                if (pdf != null ? pdf.equals(gmsDocumentScanningResult.getPdf()) : gmsDocumentScanningResult.getPdf() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    public final List<GmsDocumentScanningResult.Page> getPages() {
        return this.zza;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    public final GmsDocumentScanningResult.Pdf getPdf() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode;
        List list = this.zza;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        GmsDocumentScanningResult.Pdf pdf = this.zzb;
        if (pdf != null) {
            i = pdf.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        GmsDocumentScanningResult.Pdf pdf = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(pdf);
        StringBuilder sb = new StringBuilder(valueOf.length() + 38 + valueOf2.length() + 1);
        k84.q(sb, "GmsDocumentScanningResult{pages=", valueOf, ", pdf=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
