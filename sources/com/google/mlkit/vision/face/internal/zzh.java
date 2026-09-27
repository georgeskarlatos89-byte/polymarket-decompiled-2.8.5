package com.google.mlkit.vision.face.internal;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MLTaskInput;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import defpackage.aql;
import defpackage.arm;
import defpackage.arn;
import defpackage.bd0;
import defpackage.cxm;
import defpackage.etm;
import defpackage.f9n;
import defpackage.fbn;
import defpackage.h6j;
import defpackage.ndj;
import defpackage.obn;
import defpackage.ofc;
import defpackage.rom;
import defpackage.sqm;
import defpackage.tpl;
import defpackage.trm;
import defpackage.tsm;
import defpackage.ubk;
import defpackage.van;
import defpackage.vt1;
import defpackage.w93;
import defpackage.wtc;
import defpackage.ysm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzh extends MLTask {
    static final AtomicBoolean zza = new AtomicBoolean(true);
    private static final ImageUtils zzb = ImageUtils.getInstance();
    private final FaceDetectorOptions zzc;
    private final fbn zzd;
    private final obn zze;
    private final zzb zzf;
    private boolean zzg;
    private final BitmapInStreamingChecker zzh = new BitmapInStreamingChecker();

    public zzh(fbn fbnVar, FaceDetectorOptions faceDetectorOptions, zzb zzbVar) {
        arn.i(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.zzc = faceDetectorOptions;
        this.zzd = fbnVar;
        this.zzf = zzbVar;
        this.zze = new obn(MlKitContext.getInstance().getApplicationContext());
    }

    public static void zzf(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Face) it.next()).zzc(-1);
        }
    }

    private final synchronized void zzg(final ysm ysmVar, long j, final InputImage inputImage, final int i, final int i2) {
        int i3;
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzd.b(new van() { // from class: com.google.mlkit.vision.face.internal.zzf
            @Override // defpackage.van
            public final f9n zza() {
                return zzh.this.zzc(elapsedRealtime, ysmVar, i, i2, inputImage);
            }
        }, etm.ON_DEVICE_FACE_DETECT);
        wtc wtcVar = new wtc(11);
        wtcVar.b = ysmVar;
        wtcVar.c = Boolean.valueOf(zza.get());
        wtcVar.e = Integer.valueOf(i & bd0.API_PRIORITY_OTHER);
        wtcVar.f = Integer.valueOf(i2 & bd0.API_PRIORITY_OTHER);
        wtcVar.d = zzj.zza(this.zzc);
        tpl tplVar = new tpl(wtcVar);
        zzg zzgVar = new zzg(this);
        MLTaskExecutor.workerThreadExecutor().execute(new h6j(this.zzd, etm.AGGREGATED_ON_DEVICE_FACE_DETECTION, tplVar, elapsedRealtime, zzgVar, 4));
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.zzg;
        long j2 = currentTimeMillis - elapsedRealtime;
        obn obnVar = this.zze;
        if (true != z) {
            i3 = 24303;
        } else {
            i3 = 24304;
        }
        obnVar.a(i3, ysmVar.zza(), j2, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void load() {
        this.zzg = this.zzf.zzd();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ofc] */
    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final synchronized void release() {
        tsm tsmVar;
        try {
            this.zzf.zzb();
            zza.set(true);
            fbn fbnVar = this.zzd;
            ?? obj = new Object();
            if (this.zzg) {
                tsmVar = tsm.TYPE_THICK;
            } else {
                tsmVar = tsm.TYPE_THIN;
            }
            obj.c = tsmVar;
            MLTaskExecutor.workerThreadExecutor().execute(new w93(12, fbnVar, new vt1((ofc) obj, 0), etm.ON_DEVICE_FACE_CLOSE, fbnVar.c(), false));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final /* bridge */ /* synthetic */ Object run(MLTaskInput mLTaskInput) {
        return zze((InputImage) mLTaskInput);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, ofc] */
    public final f9n zzc(long j, ysm ysmVar, int i, int i2, InputImage inputImage) {
        sqm sqmVar;
        tsm tsmVar;
        wtc wtcVar = new wtc(14);
        wtc wtcVar2 = new wtc(13);
        wtcVar2.b = Long.valueOf(j & Long.MAX_VALUE);
        wtcVar2.c = ysmVar;
        wtcVar2.d = Boolean.valueOf(zza.get());
        Boolean bool = Boolean.TRUE;
        wtcVar2.e = bool;
        wtcVar2.f = bool;
        wtcVar.b = new trm(wtcVar2);
        wtcVar.d = zzj.zza(this.zzc);
        wtcVar.e = Integer.valueOf(i & bd0.API_PRIORITY_OTHER);
        wtcVar.f = Integer.valueOf(i2 & bd0.API_PRIORITY_OTHER);
        ImageUtils imageUtils = zzb;
        int mobileVisionImageFormat = imageUtils.getMobileVisionImageFormat(inputImage);
        int mobileVisionImageSize = imageUtils.getMobileVisionImageSize(inputImage);
        ubk ubkVar = new ubk(20, false);
        if (mobileVisionImageFormat != -1) {
            if (mobileVisionImageFormat != 35) {
                if (mobileVisionImageFormat != 842094169) {
                    if (mobileVisionImageFormat != 16) {
                        if (mobileVisionImageFormat != 17) {
                            sqmVar = sqm.UNKNOWN_FORMAT;
                        } else {
                            sqmVar = sqm.NV21;
                        }
                    } else {
                        sqmVar = sqm.NV16;
                    }
                } else {
                    sqmVar = sqm.YV12;
                }
            } else {
                sqmVar = sqm.YUV_420_888;
            }
        } else {
            sqmVar = sqm.BITMAP;
        }
        ubkVar.b = sqmVar;
        ubkVar.c = Integer.valueOf(Integer.MAX_VALUE & mobileVisionImageSize);
        wtcVar.c = new arm(ubkVar);
        cxm cxmVar = new cxm(wtcVar);
        ?? obj = new Object();
        if (this.zzg) {
            tsmVar = tsm.TYPE_THICK;
        } else {
            tsmVar = tsm.TYPE_THIN;
        }
        obj.c = tsmVar;
        obj.d = cxmVar;
        return new vt1((ofc) obj, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ofc] */
    public final f9n zzd(tpl tplVar, int i, rom romVar) {
        tsm tsmVar;
        ?? obj = new Object();
        if (this.zzg) {
            tsmVar = tsm.TYPE_THICK;
        } else {
            tsmVar = tsm.TYPE_THIN;
        }
        obj.c = tsmVar;
        ndj ndjVar = new ndj(9, false);
        ndjVar.c = Integer.valueOf(i & bd0.API_PRIORITY_OTHER);
        ndjVar.b = tplVar;
        ndjVar.d = romVar;
        obj.f = new aql(ndjVar);
        return new vt1((ofc) obj, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        defpackage.arn.h(r0);
        r6 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010f A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x00ff, B:22:0x0115, B:25:0x010f, B:26:0x0105, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x0071, B:39:0x0077, B:41:0x0085, B:43:0x00d6, B:45:0x00e1, B:52:0x00ee, B:57:0x00f7, B:60:0x0120, B:62:0x0128, B:64:0x012f, B:65:0x0138, B:66:0x012c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x00ff, B:22:0x0115, B:25:0x010f, B:26:0x0105, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x0071, B:39:0x0077, B:41:0x0085, B:43:0x00d6, B:45:0x00e1, B:52:0x00ee, B:57:0x00f7, B:60:0x0120, B:62:0x0128, B:64:0x012f, B:65:0x0138, B:66:0x012c), top: B:3:0x0005 }] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List zze(InputImage inputImage) {
        long elapsedRealtime;
        ysm ysmVar;
        List list;
        ArrayList arrayList;
        List list2;
        List list3;
        int size;
        int size2;
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzh.check(inputImage);
            Pair zza2 = this.zzf.zza(inputImage);
            List<Face> list4 = (List) zza2.first;
            List<Face> list5 = (List) zza2.second;
            if (list4 == null && list5 == null) {
                throw new MlKitException("No detector is enabled", 13);
            }
            if (list5 == null) {
                ArrayList arrayList2 = list4;
                list = list5;
                list2 = list4;
                arrayList = arrayList2;
                ysm ysmVar2 = ysm.NO_ERROR;
                if (list != null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (list2 != null) {
                    size2 = 0;
                } else {
                    size2 = list2.size();
                }
                zzg(ysmVar2, elapsedRealtime, inputImage, size, size2);
                zza.set(false);
            } else {
                HashSet hashSet = new HashSet();
                for (Face face : list5) {
                    boolean z = false;
                    for (Face face2 : list4) {
                        if (face.getBoundingBox() != null && face2.getBoundingBox() != null) {
                            Rect boundingBox = face.getBoundingBox();
                            Rect boundingBox2 = face2.getBoundingBox();
                            if (boundingBox.intersect(boundingBox2)) {
                                list3 = list5;
                                double min = (Math.min(boundingBox.bottom, boundingBox2.bottom) - Math.max(boundingBox.top, boundingBox2.top)) * (Math.min(boundingBox.right, boundingBox2.right) - Math.max(boundingBox.left, boundingBox2.left));
                                if (min / ((((boundingBox.bottom - boundingBox.top) * (boundingBox.right - boundingBox.left)) + ((boundingBox2.bottom - boundingBox2.top) * (boundingBox2.right - boundingBox2.left))) - min) > 0.6d) {
                                    face2.zzb(face.zza());
                                    z = true;
                                }
                                hashSet.add(face2);
                                list5 = list3;
                            }
                        }
                        list3 = list5;
                        hashSet.add(face2);
                        list5 = list3;
                    }
                    List list6 = list5;
                    if (!z) {
                        hashSet.add(face);
                    }
                    list5 = list6;
                }
                list = list5;
                arrayList = new ArrayList(hashSet);
                list2 = list4;
                ysm ysmVar22 = ysm.NO_ERROR;
                if (list != null) {
                }
                if (list2 != null) {
                }
                zzg(ysmVar22, elapsedRealtime, inputImage, size, size2);
                zza.set(false);
            }
        } catch (MlKitException e) {
            if (e.getErrorCode() == 14) {
                ysmVar = ysm.MODEL_NOT_DOWNLOADED;
            } else {
                ysmVar = ysm.UNKNOWN_ERROR;
            }
            zzg(ysmVar, elapsedRealtime, inputImage, 0, 0);
            throw e;
        } finally {
        }
        return arrayList;
    }
}
