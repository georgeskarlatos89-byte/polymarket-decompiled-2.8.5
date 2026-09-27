package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p92 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a09 b;

    public /* synthetic */ p92(a09 a09Var, int i) {
        this.a = i;
        this.b = a09Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        a09 a09Var = this.b;
        switch (i) {
            case 0:
                y07 y07Var = (y07) obj;
                y07Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (y07Var.d() >> 32)) / 2.0f;
                float cos = ((float) Math.cos(a09Var.b)) * intBitsToFloat;
                float sin = ((float) Math.sin(a09Var.b)) * intBitsToFloat;
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat - cos) << 32) | (Float.floatToRawIntBits(intBitsToFloat - sin) & 4294967295L);
                float f = cos + intBitsToFloat;
                float f2 = intBitsToFloat + sin;
                y07.R(y07Var, new p8b(a09Var.a, null, floatToRawIntBits, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f2)), 0), 0L, y07Var.d(), 0.0f, null, 0, 122);
                return Unit.INSTANCE;
            default:
                y07 y07Var2 = (y07) obj;
                y07Var2.getClass();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (y07Var2.d() >> 32)) / 2.0f;
                float cos2 = ((float) Math.cos(a09Var.b)) * intBitsToFloat2;
                float sin2 = ((float) Math.sin(a09Var.b)) * intBitsToFloat2;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2 - cos2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 - sin2) & 4294967295L);
                float f3 = cos2 + intBitsToFloat2;
                float f4 = intBitsToFloat2 + sin2;
                y07.R(y07Var2, new p8b(a09Var.a, null, floatToRawIntBits2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), 0), 0L, y07Var2.d(), 0.0f, null, 0, 122);
                return Unit.INSTANCE;
        }
    }
}
