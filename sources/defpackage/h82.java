package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h82 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h82(Function0 function0, boolean z, boolean z2, Function0 function02, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = function0;
        this.c = z;
        this.d = z2;
        this.e = function02;
        this.f = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Function0 function0 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                Function0 function03 = (Function0) obj2;
                Function0 function04 = (Function0) obj;
                if ((function02 == null || !((Boolean) function02.invoke()).booleanValue()) && (!z2 || z)) {
                    if (function0 != null && !((Boolean) function0.invoke()).booleanValue()) {
                        if (function04 != null) {
                            function04.invoke();
                        }
                    } else {
                        function03.invoke();
                    }
                }
                return Unit.INSTANCE;
            default:
                qqc qqcVar = (qqc) obj2;
                qqc qqcVar2 = (qqc) obj;
                if (function02 != null) {
                    function02.invoke();
                }
                if (((Boolean) qqcVar.getValue()).booleanValue() && !z2 && z) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    qqcVar.setValue(Boolean.FALSE);
                }
                qqcVar2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
