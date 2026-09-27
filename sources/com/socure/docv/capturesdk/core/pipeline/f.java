package com.socure.docv.capturesdk.core.pipeline;

import android.graphics.Bitmap;
import android.util.Log;
import com.fingerprintjs.android.fpjs_pro_internal.f3;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.h;
import defpackage.dmk;
import defpackage.k84;
import java.util.Arrays;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f {
    public final ScanType a;
    public final DetectionType[] b;
    public final DetectionType[] c;
    public final f3 d;
    public final Lazy e;
    public final Lazy f;

    public f(com.socure.docv.capturesdk.di.app.b bVar, ScanType scanType, h hVar) {
        DetectionType[] detectionTypeArr;
        DetectionType[] detectionTypeArr2;
        Object aVar;
        bVar.getClass();
        scanType.getClass();
        this.a = scanType;
        int i = d.a[scanType.ordinal()];
        final int i2 = 0;
        final int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    detectionTypeArr = new DetectionType[]{DetectionType.CORNER, DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE};
                } else {
                    detectionTypeArr = new DetectionType[]{DetectionType.CORNER, DetectionType.BARCODE, DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE};
                }
            } else {
                detectionTypeArr = new DetectionType[]{DetectionType.SELFIE_AUTO_CAPTURE};
            }
        } else {
            detectionTypeArr = new DetectionType[]{DetectionType.SELFIE};
        }
        this.b = detectionTypeArr;
        if (scanType == ScanType.SELFIE) {
            detectionTypeArr2 = new DetectionType[]{DetectionType.SELFIE};
        } else if (scanType == ScanType.SELFIE_AUTO_CAPTURE) {
            detectionTypeArr2 = new DetectionType[]{DetectionType.SELFIE_AUTO_CAPTURE};
        } else if (ConstantsKt.getOPEN_CV_SUPPORTED()) {
            detectionTypeArr2 = new DetectionType[]{DetectionType.BRIGHTNESS, DetectionType.BLUR, DetectionType.GLARE};
        } else {
            detectionTypeArr2 = new DetectionType[]{DetectionType.BLUR, DetectionType.GLARE};
        }
        this.c = detectionTypeArr2;
        DetectionType[] superSetSteps$capturesdk_productionRelease = Utils.INSTANCE.getSuperSetSteps$capturesdk_productionRelease(detectionTypeArr, detectionTypeArr2);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(bVar, scanType);
        TreeMap treeMap = (TreeMap) cVar.c;
        for (DetectionType detectionType : (DetectionType[]) Arrays.copyOf(superSetSteps$capturesdk_productionRelease, superSetSteps$capturesdk_productionRelease.length)) {
            switch (g.a[detectionType.ordinal()]) {
                case 1:
                    aVar = new com.socure.docv.capturesdk.core.processor.frame.a(bVar, (ScanType) cVar.b);
                    break;
                case 2:
                    aVar = new com.socure.docv.capturesdk.core.processor.image.b(bVar);
                    break;
                case 3:
                    aVar = new com.socure.docv.capturesdk.core.processor.image.d(bVar);
                    break;
                case 4:
                    aVar = new Object();
                    break;
                case 5:
                    aVar = new com.socure.docv.capturesdk.core.processor.image.f(bVar);
                    break;
                case 6:
                    aVar = new com.socure.docv.capturesdk.core.processor.image.e(bVar);
                    break;
                case 7:
                    aVar = new com.socure.docv.capturesdk.core.processor.image.a();
                    break;
                default:
                    dmk.a();
                    throw null;
            }
            if (!treeMap.containsKey(detectionType)) {
                treeMap.put(detectionType, aVar);
            } else {
                dmk.v("Processor of this type already added");
                throw null;
            }
        }
        DetectionType detectionType2 = DetectionType.CORNER;
        if (treeMap.containsKey(detectionType2)) {
            Object obj = treeMap.get(detectionType2);
            obj.getClass();
            com.socure.docv.capturesdk.core.processor.frame.a aVar2 = (com.socure.docv.capturesdk.core.processor.frame.a) obj;
            if (Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
                aVar2.c = hVar;
            }
        } else {
            DetectionType detectionType3 = DetectionType.SELFIE;
            if (treeMap.containsKey(detectionType3)) {
                Object obj2 = treeMap.get(detectionType3);
                obj2.getClass();
                com.socure.docv.capturesdk.core.processor.image.f fVar = (com.socure.docv.capturesdk.core.processor.image.f) obj2;
                if (Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
                    fVar.e = hVar;
                }
            } else {
                DetectionType detectionType4 = DetectionType.SELFIE_AUTO_CAPTURE;
                if (treeMap.containsKey(detectionType4)) {
                    Object obj3 = treeMap.get(detectionType4);
                    obj3.getClass();
                    com.socure.docv.capturesdk.core.processor.image.e eVar = (com.socure.docv.capturesdk.core.processor.image.e) obj3;
                    if (Utils.INSTANCE.showDebugImage$capturesdk_productionRelease()) {
                        eVar.e = hVar;
                    }
                }
            }
        }
        this.d = new f3(cVar);
        this.e = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.core.pipeline.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                f fVar2 = this.b;
                switch (i4) {
                    case 0:
                        return new c(fVar2.a, fVar2.d, fVar2.c);
                    default:
                        return new b(fVar2.a, fVar2.d, fVar2.b);
                }
            }
        });
        this.f = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.core.pipeline.e
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                f fVar2 = this.b;
                switch (i4) {
                    case 0:
                        return new c(fVar2.a, fVar2.d, fVar2.c);
                    default:
                        return new b(fVar2.a, fVar2.d, fVar2.b);
                }
            }
        });
    }

    public final Output a(Bitmap bitmap, CaptureType captureType) {
        bitmap.getClass();
        captureType.getClass();
        io.sentry.config.a.X("SDLT_PLM", "process captureType: " + captureType.getValue());
        try {
            if (captureType == CaptureType.MANUAL) {
                return ((c) this.e.getValue()).a(bitmap, captureType);
            }
            return ((b) this.f.getValue()).a(bitmap, captureType);
        } catch (Throwable th) {
            io.sentry.config.a.P("SDLT_PLM", k84.g("!!!FATAL EXCEPTION WAS CAUGHT: ", th.getLocalizedMessage()), com.socure.docv.capturesdk.common.logger.a.E, null);
            io.sentry.config.a.X("SDLT_PLM", "Stacktrace: " + Log.getStackTraceString(th));
            return new Output(bitmap, captureType, null, false, null, null, 60, null);
        }
    }
}
