package org.socure.imgproc;

import org.socure.core.Mat;
import org.socure.core.c;
import org.socure.core.e;
import org.socure.core.f;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class Imgproc {
    public static Mat a(c cVar, c cVar2) {
        return new Mat(getPerspectiveTransform_1(cVar.a, cVar2.a));
    }

    public static void b(Mat mat, Mat mat2, int i) {
        cvtColor_2(mat.a, mat2.a, i);
    }

    public static void c(Mat mat, Mat mat2, Mat mat3, f fVar, e eVar) {
        long j = mat.a;
        long j2 = mat2.a;
        long j3 = mat3.a;
        double d = fVar.a;
        double d2 = fVar.b;
        double[] dArr = eVar.a;
        warpPerspective_0(j, j2, j3, d, d2, 1, 0, dArr[0], dArr[1], dArr[2], dArr[3]);
    }

    private static native void cvtColor_2(long j, long j2, int i);

    private static native long getPerspectiveTransform_1(long j, long j2);

    private static native void warpPerspective_0(long j, long j2, long j3, double d, double d2, int i, int i2, double d3, double d4, double d5, double d6);
}
