package defpackage;

import com.braze.ui.actions.brazeactions.steps.StepData;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class syh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ StepData c;

    public /* synthetic */ syh(int i, StepData stepData, int i2) {
        this.a = i2;
        this.b = i;
        this.c = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StepData stepData = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                return StepData.d(i2, stepData);
            case 1:
                return StepData.f(i2, stepData);
            default:
                return StepData.c(i2, stepData);
        }
    }
}
