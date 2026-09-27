package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import defpackage.dmk;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzb extends GmsDocumentScanningResult.Page {
    private final Uri zza;
    private final String zzb;

    public zzb(Uri uri, String str) {
        if (uri != null) {
            this.zza = uri;
            this.zzb = str;
        } else {
            dmk.s("Null imageUri");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Page) {
            GmsDocumentScanningResult.Page page = (GmsDocumentScanningResult.Page) obj;
            if (this.zza.equals(page.getImageUri()) && ((str = this.zzb) != null ? str.equals(page.zza()) : page.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Page
    public final Uri getImageUri() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(str).length() + 1);
        k84.q(sb, "Page{imageUri=", obj, ", originalImageHash=", str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Page
    public final String zza() {
        return this.zzb;
    }
}
