package com.google.mlkit.vision.documentscanner;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import defpackage.dmk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class GmsDocumentScanningResult implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Page implements Parcelable {
        public abstract Uri getImageUri();

        public abstract String zza();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Pdf implements Parcelable {
        public abstract int getPageCount();

        public abstract Uri getUri();
    }

    public static GmsDocumentScanningResult fromActivityResultIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (GmsDocumentScanningResult) intent.getParcelableExtra("extra_scanning_result");
    }

    public static GmsDocumentScanningResult zza(List list, List list2, Uri uri, int i) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzi zziVar = null;
        if (list2 != null) {
            if (list2.size() == list.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    arrayList.add(new zzg((Uri) list.get(i2), (String) list2.get(i2)));
                }
            } else {
                dmk.v("Error: imageHashes and imageUris size mismatch.");
                return null;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new zzg((Uri) it.next(), null));
            }
        }
        if (uri != null) {
            zziVar = new zzi(uri, i);
        }
        return new zze(arrayList, zziVar);
    }

    public abstract List<Page> getPages();

    public abstract Pdf getPdf();
}
