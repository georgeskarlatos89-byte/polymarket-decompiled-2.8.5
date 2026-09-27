package com.google.mlkit.vision.face;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import defpackage.ace;
import defpackage.bd0;
import defpackage.fnl;
import defpackage.ndj;
import defpackage.ren;
import defpackage.t5n;
import defpackage.ufn;
import defpackage.ydn;
import defpackage.ywl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class Face {
    private final Rect zza;
    private int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final float zzf;
    private final float zzg;
    private final float zzh;
    private final SparseArray zzi = new SparseArray();
    private final SparseArray zzj = new SparseArray();

    public Face(ywl ywlVar, Matrix matrix) {
        int i;
        float f = ywlVar.c;
        float f2 = ywlVar.e / 2.0f;
        float f3 = ywlVar.d;
        float f4 = ywlVar.f / 2.0f;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.zza = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.zzb = ywlVar.b;
        for (t5n t5nVar : ywlVar.j) {
            if (zze(t5nVar.d)) {
                PointF pointF = new PointF(t5nVar.b, t5nVar.c);
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.zzi;
                int i2 = t5nVar.d;
                sparseArray.put(i2, new FaceLandmark(i2, pointF));
            }
        }
        for (fnl fnlVar : ywlVar.n) {
            int i3 = fnlVar.b;
            if (zzd(i3)) {
                PointF[] pointFArr = fnlVar.a;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                if (length > 2147483647L) {
                    i = bd0.API_PRIORITY_OTHER;
                } else {
                    i = (int) length;
                }
                ArrayList arrayList = new ArrayList(i);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(i3, new FaceContour(i3, arrayList));
            }
        }
        this.zzf = ywlVar.i;
        this.zzg = ywlVar.g;
        this.zzh = ywlVar.h;
        this.zze = ywlVar.m;
        this.zzd = ywlVar.k;
        this.zzc = ywlVar.l;
    }

    private static boolean zzd(int i) {
        if (i <= 15 && i > 0) {
            return true;
        }
        return false;
    }

    private static boolean zze(int i) {
        if (i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6) {
            return true;
        }
        return false;
    }

    public List<FaceContour> getAllContours() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzj.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((FaceContour) this.zzj.valueAt(i));
        }
        return arrayList;
    }

    public List<FaceLandmark> getAllLandmarks() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzi.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((FaceLandmark) this.zzi.valueAt(i));
        }
        return arrayList;
    }

    public Rect getBoundingBox() {
        return this.zza;
    }

    public FaceContour getContour(int i) {
        return (FaceContour) this.zzj.get(i);
    }

    public float getHeadEulerAngleX() {
        return this.zzf;
    }

    public float getHeadEulerAngleY() {
        return this.zzg;
    }

    public float getHeadEulerAngleZ() {
        return this.zzh;
    }

    public FaceLandmark getLandmark(int i) {
        return (FaceLandmark) this.zzi.get(i);
    }

    public Float getLeftEyeOpenProbability() {
        float f = this.zze;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(this.zzd);
        }
        return null;
    }

    public Float getRightEyeOpenProbability() {
        float f = this.zzc;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(f);
        }
        return null;
    }

    public Float getSmilingProbability() {
        float f = this.zze;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(f);
        }
        return null;
    }

    public Integer getTrackingId() {
        int i = this.zzb;
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public String toString() {
        ndj ndjVar = new ndj("Face", 16);
        ndjVar.r(this.zza, "boundingBox");
        ndjVar.p(this.zzb, "trackingId");
        ndjVar.m("rightEyeOpenProbability", this.zzc);
        ndjVar.m("leftEyeOpenProbability", this.zzd);
        ndjVar.m("smileProbability", this.zze);
        ndjVar.m("eulerX", this.zzf);
        ndjVar.m("eulerY", this.zzg);
        ndjVar.m("eulerZ", this.zzh);
        ndj ndjVar2 = new ndj("Landmarks", 16);
        for (int i = 0; i <= 11; i++) {
            if (zze(i)) {
                ndjVar2.r(getLandmark(i), ace.f(i, "landmark_"));
            }
        }
        ndjVar.r(ndjVar2.toString(), "landmarks");
        ndj ndjVar3 = new ndj("Contours", 16);
        for (int i2 = 1; i2 <= 15; i2++) {
            ndjVar3.r(getContour(i2), ace.f(i2, "Contour_"));
        }
        ndjVar.r(ndjVar3.toString(), "contours");
        return ndjVar.toString();
    }

    public final SparseArray zza() {
        return this.zzj;
    }

    public final void zzb(SparseArray sparseArray) {
        this.zzj.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.zzj.put(sparseArray.keyAt(i), (FaceContour) sparseArray.valueAt(i));
        }
    }

    public final void zzc(int i) {
        this.zzb = -1;
    }

    public Face(ren renVar, Matrix matrix) {
        Rect rect = renVar.b;
        this.zza = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.zzb = renVar.a;
        for (ufn ufnVar : renVar.j) {
            if (zze(ufnVar.a)) {
                PointF pointF = ufnVar.b;
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.zzi;
                int i = ufnVar.a;
                sparseArray.put(i, new FaceLandmark(i, pointF));
            }
        }
        for (ydn ydnVar : renVar.k) {
            int i2 = ydnVar.a;
            if (zzd(i2)) {
                List list = ydnVar.b;
                list.getClass();
                ArrayList arrayList = new ArrayList(list);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(i2, new FaceContour(i2, arrayList));
            }
        }
        this.zzf = renVar.e;
        this.zzg = renVar.d;
        this.zzh = -renVar.c;
        this.zze = renVar.h;
        this.zzd = renVar.f;
        this.zzc = renVar.g;
    }
}
