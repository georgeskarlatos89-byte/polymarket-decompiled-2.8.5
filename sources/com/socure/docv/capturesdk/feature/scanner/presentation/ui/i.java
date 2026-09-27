package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import com.socure.docv.capturesdk.core.processor.model.Output;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScannerFragment b;
    public final /* synthetic */ Output c;

    public /* synthetic */ i(ScannerFragment scannerFragment, Output output, int i) {
        this.a = i;
        this.b = scannerFragment;
        this.c = output;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Output output = this.c;
        ScannerFragment scannerFragment = this.b;
        switch (i) {
            case 0:
                if (scannerFragment.k != null) {
                    scannerFragment.J(output);
                } else {
                    io.sentry.config.a.P("SDLT_SF", "capture animation ended after view teardown - dropping output", com.socure.docv.capturesdk.common.logger.a.E, null);
                }
                return Unit.INSTANCE;
            default:
                scannerFragment.J(output);
                return Unit.INSTANCE;
        }
    }
}
