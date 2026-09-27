package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vh4 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh4(String str, int i) {
        super(1);
        this.h = i;
        this.i = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        String str = this.i;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int i2 = 0;
                while (i2 < 3 && intValue < str.length() && str.charAt(intValue) == ' ') {
                    i2++;
                    intValue++;
                }
                if (intValue < str.length() && str.charAt(intValue) == '>') {
                    return Integer.valueOf(i2 + 1);
                }
                return null;
            default:
                mug.g(str, (pug) obj);
                return Unit.INSTANCE;
        }
    }
}
