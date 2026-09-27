package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zoj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ zoj(Function0 function0, float f, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = f;
        this.d = function02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        float max;
        int i = this.a;
        Function0 function0 = this.d;
        float f = this.c;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                if (Math.max(lnf.d(((Number) function02.invoke()).floatValue() / f, 0.0f, 1.0f), lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f)) >= 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                max = Math.max(lnf.d(((Number) function02.invoke()).floatValue() / f, 0.0f, 1.0f), lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Float.valueOf(max);
            case 2:
                max = Math.max(lnf.d(((Number) function02.invoke()).intValue() / f, 0.0f, 1.0f), lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Float.valueOf(max);
            default:
                max = Math.max(lnf.d(((Number) function02.invoke()).floatValue() / f, 0.0f, 1.0f), lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return Float.valueOf(max);
        }
    }
}
