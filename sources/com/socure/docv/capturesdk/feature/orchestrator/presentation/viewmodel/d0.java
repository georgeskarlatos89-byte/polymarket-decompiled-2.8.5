package com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel;

import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import defpackage.olb;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface d0 {
    LinkedHashMap a();

    void a(SocureDocVError socureDocVError);

    void b();

    void b(Integer num);

    MetricData c(ScanType scanType);

    void c();

    void d();

    olb e();

    void f();

    Integer h();

    olb i();

    void i(MetricCaptureData metricCaptureData);

    olb j();

    olb k();

    void k(String str, Pair... pairArr);

    void n();

    void v(String str, String str2, boolean z);
}
