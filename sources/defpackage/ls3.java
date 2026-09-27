package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import skip.unit.XCTestCase;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ls3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ ls3(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = 0.0f;
        Function0 function0 = this.c;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) function02.invoke()).booleanValue()) {
                    f = ((Number) function0.invoke()).intValue() * 2.0f;
                }
                return Float.valueOf(f);
            case 1:
                if (!((Boolean) function02.invoke()).booleanValue()) {
                    f = Math.min(((Number) function0.invoke()).intValue() * 0.5f, 0.72f);
                }
                return Float.valueOf(f);
            case 2:
                function02.invoke();
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                function02.invoke();
                function0.invoke();
                return Unit.INSTANCE;
            default:
                return XCTestCase.a(function02, function0);
        }
    }
}
