package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface zzcba {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6.size() == r2.zzd.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void zza(zzcag zzcagVar, long j, List list, List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (list.size() == zzcagVar.zzc.size()) {
                z = true;
                brn.c(zzcagVar.zzc.size(), "Incorrect number of required labels provided. Expected: %s", z);
                if (list2 != null) {
                }
                z2 = false;
                brn.c(zzcagVar.zzd.size(), "Incorrect number of optional labels provided. Expected: %s", z2);
            }
        }
        z = false;
        brn.c(zzcagVar.zzc.size(), "Incorrect number of required labels provided. Expected: %s", z);
        if (list2 != null) {
        }
        z2 = false;
        brn.c(zzcagVar.zzd.size(), "Incorrect number of optional labels provided. Expected: %s", z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6.size() == r2.zzd.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void zzb(zzcah zzcahVar, long j, List list, List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (list.size() == zzcahVar.zzc.size()) {
                z = true;
                brn.c(zzcahVar.zzc.size(), "Incorrect number of required labels provided. Expected: %s", z);
                if (list2 != null) {
                }
                z2 = false;
                brn.c(zzcahVar.zzd.size(), "Incorrect number of optional labels provided. Expected: %s", z2);
            }
        }
        z = false;
        brn.c(zzcahVar.zzc.size(), "Incorrect number of required labels provided. Expected: %s", z);
        if (list2 != null) {
        }
        z2 = false;
        brn.c(zzcahVar.zzd.size(), "Incorrect number of optional labels provided. Expected: %s", z2);
    }
}
