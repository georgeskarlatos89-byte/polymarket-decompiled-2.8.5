package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import defpackage.d55;
import defpackage.qp7;
import io.ably.lib.util.AgentHeaderCreator;
import io.getstream.chat.android.models.AttachmentType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String str;
        String str2 = Build.HARDWARE;
        if (!str2.equals("goldfish") && !str2.equals("ranchu")) {
            str = "";
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        zzc = new String[]{"media", str};
        zzd = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
                zzd(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            qp7.l("Can't open content uri.");
            return null;
        }
        if (AttachmentType.FILE.equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor2);
            try {
                zzi(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzhVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                zzg(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                zzg(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        }
        qp7.l("Unsupported scheme");
        return null;
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                InputStream openInputStream = contentResolver.openInputStream(zzc2);
                zzd(openInputStream);
                return openInputStream;
            }
            qp7.l("Can't open content uri.");
            return null;
        }
        if (AttachmentType.FILE.equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
                try {
                    zzi(context, openFileDescriptor, zzc2, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    zzh(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    zzh(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        }
        qp7.l("Unsupported scheme");
        return null;
    }

    private static Object zzd(Object obj) {
        if (obj != null) {
            return obj;
        }
        qp7.l("Content resolver returned null value.");
        return null;
    }

    private static String zze(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
            return canonicalPath.concat(AgentHeaderCreator.AGENT_DIVIDER);
        }
        return canonicalPath;
    }

    private static void zzf(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (!OsConstants.S_ISLNK(lstat.st_mode)) {
                    if (fstat.st_dev == lstat.st_dev && fstat.st_ino == lstat.st_ino) {
                        return;
                    }
                    qp7.l("Can't open file: ".concat(String.valueOf(str)));
                    return;
                }
                qp7.l("Can't open file: ".concat(String.valueOf(str)));
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void zzg(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzh(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzi(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) {
        File f;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzh.zza(zzhVar);
            File f2 = d55.f(context);
            boolean z = true;
            if (f2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(f2))) {
                Context b = d55.b(context);
                if (b == null || (f = d55.f(b)) == null || !canonicalPath.startsWith(zze(f))) {
                    File[] zzk = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i = zzi.zza;
                            return d55.i(context, null);
                        }
                    });
                    int length = zzk.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            File file = zzk[i];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            File[] zzk2 = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i2 = zzi.zza;
                                    return d55.h(context);
                                }
                            });
                            int length2 = zzk2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    File file2 = zzk2[i2];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (z == zzh.zzb(zzhVar)) {
                return;
            }
        }
        qp7.l("Can't open file: ".concat(canonicalPath));
    }

    private static boolean zzj(Context context, Uri uri, int i, zzh zzhVar) {
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                if (zzh.zzb(zzhVar)) {
                    return false;
                }
                return true;
            }
        }
        if (zzh.zzc(zzhVar, context, new zzj(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return zzh.zzb(zzhVar);
        }
        if (zzh.zzb(zzhVar)) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i4 = 0; i4 < 6; i4++) {
                String str = strArr3[i4];
                char charAt = str.charAt(str.length() - 1);
                String str2 = resolveContentProvider.packageName;
                if (charAt == '.') {
                    if (str2.startsWith(str)) {
                        return false;
                    }
                } else if (str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzk(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            qp7.n(e2);
            return null;
        }
    }

    private static Uri zzc(Uri uri) {
        return uri;
    }
}
