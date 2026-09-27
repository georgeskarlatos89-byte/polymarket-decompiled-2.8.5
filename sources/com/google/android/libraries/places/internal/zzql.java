package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import defpackage.t81;
import io.sentry.android.core.m0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzql {
    public static String zza(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return zzb(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            m0.e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    private static String zzb(Signature signature) {
        try {
            return t81.c.c(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            m0.e("CredentialsHelper", "Unable to get certificate fingerprint.", e);
            return null;
        }
    }
}
